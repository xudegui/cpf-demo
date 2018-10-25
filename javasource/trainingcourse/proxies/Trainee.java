// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package trainingcourse.proxies;

public class Trainee
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject traineeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TrainingCourse.Trainee";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Fullname("Fullname"),
		Address("Address"),
		EmailAddress("EmailAddress");

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

	public Trainee(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TrainingCourse.Trainee"));
	}

	protected Trainee(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject traineeMendixObject)
	{
		if (traineeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("TrainingCourse.Trainee", traineeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TrainingCourse.Trainee");

		this.traineeMendixObject = traineeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Trainee.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static trainingcourse.proxies.Trainee initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return trainingcourse.proxies.Trainee.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static trainingcourse.proxies.Trainee initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new trainingcourse.proxies.Trainee(context, mendixObject);
	}

	public static trainingcourse.proxies.Trainee load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return trainingcourse.proxies.Trainee.initialize(context, mendixObject);
	}

	public static java.util.List<trainingcourse.proxies.Trainee> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<trainingcourse.proxies.Trainee> result = new java.util.ArrayList<trainingcourse.proxies.Trainee>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//TrainingCourse.Trainee" + xpathConstraint))
			result.add(trainingcourse.proxies.Trainee.initialize(context, obj));
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
	 * @return value of Fullname
	 */
	public final java.lang.String getFullname()
	{
		return getFullname(getContext());
	}

	/**
	 * @param context
	 * @return value of Fullname
	 */
	public final java.lang.String getFullname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Fullname.toString());
	}

	/**
	 * Set value of Fullname
	 * @param fullname
	 */
	public final void setFullname(java.lang.String fullname)
	{
		setFullname(getContext(), fullname);
	}

	/**
	 * Set value of Fullname
	 * @param context
	 * @param fullname
	 */
	public final void setFullname(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fullname)
	{
		getMendixObject().setValue(context, MemberNames.Fullname.toString(), fullname);
	}

	/**
	 * @return value of Address
	 */
	public final java.lang.String getAddress()
	{
		return getAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of Address
	 */
	public final java.lang.String getAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Address.toString());
	}

	/**
	 * Set value of Address
	 * @param address
	 */
	public final void setAddress(java.lang.String address)
	{
		setAddress(getContext(), address);
	}

	/**
	 * Set value of Address
	 * @param context
	 * @param address
	 */
	public final void setAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String address)
	{
		getMendixObject().setValue(context, MemberNames.Address.toString(), address);
	}

	/**
	 * @return value of EmailAddress
	 */
	public final java.lang.String getEmailAddress()
	{
		return getEmailAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of EmailAddress
	 */
	public final java.lang.String getEmailAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EmailAddress.toString());
	}

	/**
	 * Set value of EmailAddress
	 * @param emailaddress
	 */
	public final void setEmailAddress(java.lang.String emailaddress)
	{
		setEmailAddress(getContext(), emailaddress);
	}

	/**
	 * Set value of EmailAddress
	 * @param context
	 * @param emailaddress
	 */
	public final void setEmailAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String emailaddress)
	{
		getMendixObject().setValue(context, MemberNames.EmailAddress.toString(), emailaddress);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return traineeMendixObject;
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
			final trainingcourse.proxies.Trainee that = (trainingcourse.proxies.Trainee) obj;
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
		return "TrainingCourse.Trainee";
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
