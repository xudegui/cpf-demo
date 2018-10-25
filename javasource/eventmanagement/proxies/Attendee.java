// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package eventmanagement.proxies;

public class Attendee
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject attendeeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "EventManagement.Attendee";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Firstname("Firstname"),
		Surname("Surname"),
		Phone("Phone"),
		Email("Email");

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

	public Attendee(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "EventManagement.Attendee"));
	}

	protected Attendee(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject attendeeMendixObject)
	{
		if (attendeeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("EventManagement.Attendee", attendeeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a EventManagement.Attendee");

		this.attendeeMendixObject = attendeeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Attendee.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static eventmanagement.proxies.Attendee initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return eventmanagement.proxies.Attendee.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static eventmanagement.proxies.Attendee initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new eventmanagement.proxies.Attendee(context, mendixObject);
	}

	public static eventmanagement.proxies.Attendee load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return eventmanagement.proxies.Attendee.initialize(context, mendixObject);
	}

	public static java.util.List<eventmanagement.proxies.Attendee> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<eventmanagement.proxies.Attendee> result = new java.util.ArrayList<eventmanagement.proxies.Attendee>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//EventManagement.Attendee" + xpathConstraint))
			result.add(eventmanagement.proxies.Attendee.initialize(context, obj));
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
	 * @return value of Firstname
	 */
	public final java.lang.String getFirstname()
	{
		return getFirstname(getContext());
	}

	/**
	 * @param context
	 * @return value of Firstname
	 */
	public final java.lang.String getFirstname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Firstname.toString());
	}

	/**
	 * Set value of Firstname
	 * @param firstname
	 */
	public final void setFirstname(java.lang.String firstname)
	{
		setFirstname(getContext(), firstname);
	}

	/**
	 * Set value of Firstname
	 * @param context
	 * @param firstname
	 */
	public final void setFirstname(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String firstname)
	{
		getMendixObject().setValue(context, MemberNames.Firstname.toString(), firstname);
	}

	/**
	 * @return value of Surname
	 */
	public final java.lang.String getSurname()
	{
		return getSurname(getContext());
	}

	/**
	 * @param context
	 * @return value of Surname
	 */
	public final java.lang.String getSurname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Surname.toString());
	}

	/**
	 * Set value of Surname
	 * @param surname
	 */
	public final void setSurname(java.lang.String surname)
	{
		setSurname(getContext(), surname);
	}

	/**
	 * Set value of Surname
	 * @param context
	 * @param surname
	 */
	public final void setSurname(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String surname)
	{
		getMendixObject().setValue(context, MemberNames.Surname.toString(), surname);
	}

	/**
	 * @return value of Phone
	 */
	public final java.lang.String getPhone()
	{
		return getPhone(getContext());
	}

	/**
	 * @param context
	 * @return value of Phone
	 */
	public final java.lang.String getPhone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Phone.toString());
	}

	/**
	 * Set value of Phone
	 * @param phone
	 */
	public final void setPhone(java.lang.String phone)
	{
		setPhone(getContext(), phone);
	}

	/**
	 * Set value of Phone
	 * @param context
	 * @param phone
	 */
	public final void setPhone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String phone)
	{
		getMendixObject().setValue(context, MemberNames.Phone.toString(), phone);
	}

	/**
	 * @return value of Email
	 */
	public final java.lang.String getEmail()
	{
		return getEmail(getContext());
	}

	/**
	 * @param context
	 * @return value of Email
	 */
	public final java.lang.String getEmail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Email.toString());
	}

	/**
	 * Set value of Email
	 * @param email
	 */
	public final void setEmail(java.lang.String email)
	{
		setEmail(getContext(), email);
	}

	/**
	 * Set value of Email
	 * @param context
	 * @param email
	 */
	public final void setEmail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String email)
	{
		getMendixObject().setValue(context, MemberNames.Email.toString(), email);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return attendeeMendixObject;
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
			final eventmanagement.proxies.Attendee that = (eventmanagement.proxies.Attendee) obj;
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
		return "EventManagement.Attendee";
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