// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package zgws_cust_get_srv.proxies;

public class MetaModel
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject metaModelMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ZGWS_cust_GET_SRV.MetaModel";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TypeMapping("TypeMapping");

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

	public MetaModel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ZGWS_cust_GET_SRV.MetaModel"));
	}

	protected MetaModel(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject metaModelMendixObject)
	{
		if (metaModelMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ZGWS_cust_GET_SRV.MetaModel", metaModelMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ZGWS_cust_GET_SRV.MetaModel");

		this.metaModelMendixObject = metaModelMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MetaModel.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static zgws_cust_get_srv.proxies.MetaModel initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return zgws_cust_get_srv.proxies.MetaModel.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static zgws_cust_get_srv.proxies.MetaModel initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new zgws_cust_get_srv.proxies.MetaModel(context, mendixObject);
	}

	public static zgws_cust_get_srv.proxies.MetaModel load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return zgws_cust_get_srv.proxies.MetaModel.initialize(context, mendixObject);
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
	 * @return value of TypeMapping
	 */
	public final java.lang.String getTypeMapping()
	{
		return getTypeMapping(getContext());
	}

	/**
	 * @param context
	 * @return value of TypeMapping
	 */
	public final java.lang.String getTypeMapping(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TypeMapping.toString());
	}

	/**
	 * Set value of TypeMapping
	 * @param typemapping
	 */
	public final void setTypeMapping(java.lang.String typemapping)
	{
		setTypeMapping(getContext(), typemapping);
	}

	/**
	 * Set value of TypeMapping
	 * @param context
	 * @param typemapping
	 */
	public final void setTypeMapping(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String typemapping)
	{
		getMendixObject().setValue(context, MemberNames.TypeMapping.toString(), typemapping);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return metaModelMendixObject;
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
			final zgws_cust_get_srv.proxies.MetaModel that = (zgws_cust_get_srv.proxies.MetaModel) obj;
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
		return "ZGWS_cust_GET_SRV.MetaModel";
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
