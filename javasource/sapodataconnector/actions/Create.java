// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package sapodataconnector.actions;

import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.thirdparty.org.json.JSONObject;
import com.mendix.webui.CustomJavaAction;
import sapodataconnector.proxies.constants.Constants;
import sapodataconnector.utils.ExpectedHttpResultOptional;
import sapodataconnector.utils.JsonSerializer;
import sapodataconnector.utils.ODataClientBuilder;
import sapodataconnector.utils.ODataRequestBuilder;
import sapodataconnector.utils.ODataResponseHandler;
import sapodataconnector.utils.ToMendixSerializer;

public class Create extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String query;
	private IMendixObject __odataObject;
	private sapodataconnector.proxies.OdataObject odataObject;
	private IMendixObject __requestParameters;
	private sapodataconnector.proxies.RequestParams requestParameters;
	private java.lang.Boolean useSAPCloudConnector;

	public Create(IContext context, java.lang.String query, IMendixObject odataObject, IMendixObject requestParameters, java.lang.Boolean useSAPCloudConnector)
	{
		super(context);
		this.query = query;
		this.__odataObject = odataObject;
		this.__requestParameters = requestParameters;
		this.useSAPCloudConnector = useSAPCloudConnector;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.odataObject = __odataObject == null ? null : sapodataconnector.proxies.OdataObject.initialize(getContext(), __odataObject);

		this.requestParameters = __requestParameters == null ? null : sapodataconnector.proxies.RequestParams.initialize(getContext(), __requestParameters);

		// BEGIN USER CODE
		JSONObject json = JsonSerializer.writeMendixObjectToJson(getContext(), odataObject.getMendixObject(), true);
		String jsonStr = json.toString();

		if(LOGGER.isDebugEnabled()) {
			LOGGER.debug(new StringBuilder(getContext().getSession().getId().toString())
					.append("|CREATE|query: ")
					.append(query)
					.append("|json: ")
					.append(jsonStr)
					.toString());
		}

		String responseText = null;

		final HttpPost httpPost = ODataRequestBuilder.builder()
				.post(query)
				.setContext(getContext())
				.setReqeuestHeader(requestParameters)
				.build();

		httpPost.setEntity(EntityBuilder.create().setText(jsonStr).build());

		try (final CloseableHttpClient httpclient = ODataClientBuilder.builder()
				.setContext(getContext())
				.setRequestParameters(requestParameters)
				.useCloudConnector(this.useSAPCloudConnector)
				.build()) {

			responseText = httpclient.execute(httpPost, new ODataResponseHandler("CREATE", LOGGER, getContext(),
					ExpectedHttpResultOptional.ofNullable(requestParameters).orDefault(201).getExpectedHttpResult()));
		}

		final JSONObject jsonObj = new JSONObject(responseText).getJSONObject("d");
		ToMendixSerializer.updateMendixObject(getContext(), jsonObj, odataObject.getMendixObject());

		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "Create";
	}

	// BEGIN EXTRA CODE
	private static final ILogNode LOGGER = Core.getLogger(Constants.getLogNode());
	// END EXTRA CODE
}
