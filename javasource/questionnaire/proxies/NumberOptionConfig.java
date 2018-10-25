// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package questionnaire.proxies;

public class NumberOptionConfig extends questionnaire.proxies.OptionConfig
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Questionnaire.NumberOptionConfig";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Start("Start"),
		End("End"),
		OptionLabel("OptionLabel"),
		Applicability("Applicability"),
		ConfirmedAction("ConfirmedAction"),
		OptionConfig_ElementConfig("Questionnaire.OptionConfig_ElementConfig"),
		OptionConfig_OptionConfig_CreatedFrom("Questionnaire.OptionConfig_OptionConfig_CreatedFrom");

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

	public NumberOptionConfig(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Questionnaire.NumberOptionConfig"));
	}

	protected NumberOptionConfig(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject numberOptionConfigMendixObject)
	{
		super(context, numberOptionConfigMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Questionnaire.NumberOptionConfig", numberOptionConfigMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Questionnaire.NumberOptionConfig");
	}

	/**
	 * @deprecated Use 'NumberOptionConfig.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static questionnaire.proxies.NumberOptionConfig initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return questionnaire.proxies.NumberOptionConfig.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static questionnaire.proxies.NumberOptionConfig initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new questionnaire.proxies.NumberOptionConfig(context, mendixObject);
	}

	public static questionnaire.proxies.NumberOptionConfig load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return questionnaire.proxies.NumberOptionConfig.initialize(context, mendixObject);
	}

	public static java.util.List<questionnaire.proxies.NumberOptionConfig> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<questionnaire.proxies.NumberOptionConfig> result = new java.util.ArrayList<questionnaire.proxies.NumberOptionConfig>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Questionnaire.NumberOptionConfig" + xpathConstraint))
			result.add(questionnaire.proxies.NumberOptionConfig.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Start
	 */
	public final java.lang.Double getStart()
	{
		return getStart(getContext());
	}

	/**
	 * @param context
	 * @return value of Start
	 */
	public final java.lang.Double getStart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.Start.toString());
	}

	/**
	 * Set value of Start
	 * @param start
	 */
	public final void setStart(java.lang.Double start)
	{
		setStart(getContext(), start);
	}

	/**
	 * Set value of Start
	 * @param context
	 * @param start
	 */
	public final void setStart(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double start)
	{
		getMendixObject().setValue(context, MemberNames.Start.toString(), start);
	}

	/**
	 * @return value of End
	 */
	public final java.lang.Double getEnd()
	{
		return getEnd(getContext());
	}

	/**
	 * @param context
	 * @return value of End
	 */
	public final java.lang.Double getEnd(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.End.toString());
	}

	/**
	 * Set value of End
	 * @param end
	 */
	public final void setEnd(java.lang.Double end)
	{
		setEnd(getContext(), end);
	}

	/**
	 * Set value of End
	 * @param context
	 * @param end
	 */
	public final void setEnd(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double end)
	{
		getMendixObject().setValue(context, MemberNames.End.toString(), end);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final questionnaire.proxies.NumberOptionConfig that = (questionnaire.proxies.NumberOptionConfig) obj;
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
		return "Questionnaire.NumberOptionConfig";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
