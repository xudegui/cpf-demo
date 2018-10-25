// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sapodataconnector.proxies;

public class CloudConnectorInfo
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject cloudConnectorInfoMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAPODataConnector.CloudConnectorInfo";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ProxyHost("ProxyHost"),
		ProxyPort("ProxyPort"),
		ProxyBearerToken("ProxyBearerToken");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public CloudConnectorInfo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAPODataConnector.CloudConnectorInfo"));
	}

	protected CloudConnectorInfo(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject cloudConnectorInfoMendixObject)
	{
		if (cloudConnectorInfoMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SAPODataConnector.CloudConnectorInfo", cloudConnectorInfoMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAPODataConnector.CloudConnectorInfo");

		this.cloudConnectorInfoMendixObject = cloudConnectorInfoMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'CloudConnectorInfo.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static sapodataconnector.proxies.CloudConnectorInfo initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sapodataconnector.proxies.CloudConnectorInfo.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sapodataconnector.proxies.CloudConnectorInfo initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sapodataconnector.proxies.CloudConnectorInfo(context, mendixObject);
	}

	public static sapodataconnector.proxies.CloudConnectorInfo load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sapodataconnector.proxies.CloudConnectorInfo.initialize(context, mendixObject);
	}

	public static java.util.List<sapodataconnector.proxies.CloudConnectorInfo> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sapodataconnector.proxies.CloudConnectorInfo> result = new java.util.ArrayList<sapodataconnector.proxies.CloudConnectorInfo>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SAPODataConnector.CloudConnectorInfo" + xpathConstraint))
			result.add(sapodataconnector.proxies.CloudConnectorInfo.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of ProxyHost
	 */
	public final java.lang.String getProxyHost()
	{
		return getProxyHost(getContext());
	}

	/**
	 * @param context
	 * @return value of ProxyHost
	 */
	public final java.lang.String getProxyHost(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ProxyHost.toString());
	}

	/**
	 * Set value of ProxyHost
	 * @param proxyhost
	 */
	public final void setProxyHost(java.lang.String proxyhost)
	{
		setProxyHost(getContext(), proxyhost);
	}

	/**
	 * Set value of ProxyHost
	 * @param context
	 * @param proxyhost
	 */
	public final void setProxyHost(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String proxyhost)
	{
		getMendixObject().setValue(context, MemberNames.ProxyHost.toString(), proxyhost);
	}

	/**
	 * @return value of ProxyPort
	 */
	public final java.lang.Integer getProxyPort()
	{
		return getProxyPort(getContext());
	}

	/**
	 * @param context
	 * @return value of ProxyPort
	 */
	public final java.lang.Integer getProxyPort(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ProxyPort.toString());
	}

	/**
	 * Set value of ProxyPort
	 * @param proxyport
	 */
	public final void setProxyPort(java.lang.Integer proxyport)
	{
		setProxyPort(getContext(), proxyport);
	}

	/**
	 * Set value of ProxyPort
	 * @param context
	 * @param proxyport
	 */
	public final void setProxyPort(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer proxyport)
	{
		getMendixObject().setValue(context, MemberNames.ProxyPort.toString(), proxyport);
	}

	/**
	 * @return value of ProxyBearerToken
	 */
	public final java.lang.String getProxyBearerToken()
	{
		return getProxyBearerToken(getContext());
	}

	/**
	 * @param context
	 * @return value of ProxyBearerToken
	 */
	public final java.lang.String getProxyBearerToken(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ProxyBearerToken.toString());
	}

	/**
	 * Set value of ProxyBearerToken
	 * @param proxybearertoken
	 */
	public final void setProxyBearerToken(java.lang.String proxybearertoken)
	{
		setProxyBearerToken(getContext(), proxybearertoken);
	}

	/**
	 * Set value of ProxyBearerToken
	 * @param context
	 * @param proxybearertoken
	 */
	public final void setProxyBearerToken(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String proxybearertoken)
	{
		getMendixObject().setValue(context, MemberNames.ProxyBearerToken.toString(), proxybearertoken);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return cloudConnectorInfoMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sapodataconnector.proxies.CloudConnectorInfo that = (sapodataconnector.proxies.CloudConnectorInfo) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "SAPODataConnector.CloudConnectorInfo";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
