package sapodataconnector.utils.proxy;

import com.mendix.systemwideinterfaces.core.IContext;

import sapodataconnector.utils.proxy.connectivityservice.SAPProxyInformationProvider;

public class ProxyInformationFactory {

	private static ProxyInformationProvider instance;
	private final static Integer INSTANCE_LOCK = 1;

	public static ProxyInformation getProxyInformation(IContext context) {
		if (instance == null) {
			synchronized (INSTANCE_LOCK) {
				instance = new SAPProxyInformationProvider();
			}
		}

		return instance.getProxyInformation(context);
	}
}
