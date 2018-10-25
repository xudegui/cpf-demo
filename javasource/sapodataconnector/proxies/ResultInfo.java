// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sapodataconnector.proxies;

public class ResultInfo
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject resultInfoMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAPODataConnector.ResultInfo";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		totalCount("totalCount");

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

	public ResultInfo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAPODataConnector.ResultInfo"));
	}

	protected ResultInfo(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject resultInfoMendixObject)
	{
		if (resultInfoMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SAPODataConnector.ResultInfo", resultInfoMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAPODataConnector.ResultInfo");

		this.resultInfoMendixObject = resultInfoMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ResultInfo.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static sapodataconnector.proxies.ResultInfo initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sapodataconnector.proxies.ResultInfo.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sapodataconnector.proxies.ResultInfo initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sapodataconnector.proxies.ResultInfo(context, mendixObject);
	}

	public static sapodataconnector.proxies.ResultInfo load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sapodataconnector.proxies.ResultInfo.initialize(context, mendixObject);
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
	 * @return value of totalCount
	 */
	public final java.lang.Integer gettotalCount()
	{
		return gettotalCount(getContext());
	}

	/**
	 * @param context
	 * @return value of totalCount
	 */
	public final java.lang.Integer gettotalCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.totalCount.toString());
	}

	/**
	 * Set value of totalCount
	 * @param totalcount
	 */
	public final void settotalCount(java.lang.Integer totalcount)
	{
		settotalCount(getContext(), totalcount);
	}

	/**
	 * Set value of totalCount
	 * @param context
	 * @param totalcount
	 */
	public final void settotalCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer totalcount)
	{
		getMendixObject().setValue(context, MemberNames.totalCount.toString(), totalcount);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return resultInfoMendixObject;
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
			final sapodataconnector.proxies.ResultInfo that = (sapodataconnector.proxies.ResultInfo) obj;
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
		return "SAPODataConnector.ResultInfo";
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
