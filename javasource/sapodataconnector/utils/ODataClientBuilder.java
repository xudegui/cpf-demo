package sapodataconnector.utils;

import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.apache.http.message.BasicHeader;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

import sapodataconnector.proxies.RequestParams;
import sapodataconnector.utils.proxy.ProxyInformation;
import sapodataconnector.utils.proxy.ProxyInformationFactory;
import system.proxies.Session;

/**
 * Helper class to build a CloseableHttpClient using a fluent syntax
 * using ODataConnector input.
 *
 */
public class ODataClientBuilder {

	private final static ILogNode LOGGER = Core.getLogger(sapodataconnector.proxies.constants.Constants.getLogNode());

	private ODataClientBuilder() {
		// hide default constructor
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private Builder() {
			// hide default constructor
		}

		private IContext context;
		private boolean useCloudConnector;
		private RequestParams requestParameters;

		public Builder setContext(IContext context) {
			this.context = context;
			return this;
		}

		public Builder setRequestParameters(RequestParams requestParameters) {
			this.requestParameters = requestParameters;
			return this;
		}

		public Builder useCloudConnector(boolean useCC) {
			this.useCloudConnector = useCC;
			return this;
		}

		public CloseableHttpClient build() {
			HttpClientBuilder clientBuilder = HttpClients.custom();
			// Redirect automatically, our own implementation to follow 201 Created as well
			final RedirectStrategy redirectStrategy = new LaxRedirectStrategy();
			clientBuilder = clientBuilder.setRedirectStrategy(redirectStrategy);
			
			// initialize the cookie store;
			if (context != null) { 
				IMendixObject mendixSession = context.getSession().getMendixObject();
				if (mendixSession != null) {
					// initialize proxy object 
					Session session = Session.initialize(context, mendixSession);					
					clientBuilder = clientBuilder.setDefaultCookieStore(new SessionCookieStore(Long.toString(session.getMendixObject().getId().toLong()), context));
				} else {	
					clientBuilder = clientBuilder.setDefaultCookieStore(new ContextCookieStore(context));
				}
			} else {
				// maybe IlligalStateException?
				LOGGER.error("New OdatahttpClient is built but context is null!");
			}

			// set time outs
			RequestParams parameters = Optional.ofNullable(requestParameters).orElse(new RequestParams(context));
			clientBuilder.setDefaultRequestConfig(RequestConfig.custom()
                    .setConnectTimeout(parameters.getconnectTimeout() * 1000)
                    .setSocketTimeout(parameters.getreadTimeout() * 1000)
                    .build());

			// Determine the proxy, if Cloud Connector is configured search for the cloud connector proxy in the
			// VCAP settings
			ProxyInformation proxyInfo = null;
			if (useCloudConnector) {
				proxyInfo = ProxyInformationFactory.getProxyInformation(context);

				if (proxyInfo == null) {
					LOGGER.warn("CloudConnector usage is enabled but no settings are found. Defaulting to system proxy");
				}
			}

			if (proxyInfo != null) {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug(String.format("Using proxy %s:%d from %s",
							proxyInfo.getProxyHost(), proxyInfo.getProxyPort(), proxyInfo.getSourceName()));
				}

				final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
				credentialsProvider.setCredentials(
		                new AuthScope(proxyInfo.getProxyHost(),  proxyInfo.getProxyPort()),
		                new UsernamePasswordCredentials(proxyInfo.getProxyCredentials(), StringUtils.EMPTY));

		        clientBuilder.setDefaultCredentialsProvider(credentialsProvider);
				clientBuilder = clientBuilder.setProxy(new HttpHost(proxyInfo.getProxyHost(), proxyInfo.getProxyPort()));

				// Adding headers
				clientBuilder = clientBuilder.setDefaultHeaders(proxyInfo.getRequiredHeaders().entrySet()
						.stream()
						.map(entry -> {
							if (LOGGER.isDebugEnabled()) {
								LOGGER.debug(String.format("Setting Proxy Header %s: %s", entry.getKey(), entry.getValue()));
							}
							return new BasicHeader(entry.getKey(), entry.getValue());
						})
						.collect(Collectors.toList()));
			} else {
				clientBuilder = clientBuilder.useSystemProperties();
			}

			// done
			return clientBuilder.build();
		}
	}

}
