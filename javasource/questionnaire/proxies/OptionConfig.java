// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package questionnaire.proxies;

public class OptionConfig
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject optionConfigMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Questionnaire.OptionConfig";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
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

	public OptionConfig(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Questionnaire.OptionConfig"));
	}

	protected OptionConfig(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject optionConfigMendixObject)
	{
		if (optionConfigMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Questionnaire.OptionConfig", optionConfigMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Questionnaire.OptionConfig");

		this.optionConfigMendixObject = optionConfigMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'OptionConfig.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static questionnaire.proxies.OptionConfig initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return questionnaire.proxies.OptionConfig.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static questionnaire.proxies.OptionConfig initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("Questionnaire.DateOptionConfig", mendixObject.getType()))
			return questionnaire.proxies.DateOptionConfig.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Questionnaire.ListOptionConfig", mendixObject.getType()))
			return questionnaire.proxies.ListOptionConfig.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Questionnaire.NumberOptionConfig", mendixObject.getType()))
			return questionnaire.proxies.NumberOptionConfig.initialize(context, mendixObject);

		return new questionnaire.proxies.OptionConfig(context, mendixObject);
	}

	public static questionnaire.proxies.OptionConfig load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return questionnaire.proxies.OptionConfig.initialize(context, mendixObject);
	}

	public static java.util.List<? extends questionnaire.proxies.OptionConfig> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<questionnaire.proxies.OptionConfig> result = new java.util.ArrayList<questionnaire.proxies.OptionConfig>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Questionnaire.OptionConfig" + xpathConstraint))
			result.add(questionnaire.proxies.OptionConfig.initialize(context, obj));
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
	 * @return value of OptionLabel
	 */
	public final java.lang.String getOptionLabel()
	{
		return getOptionLabel(getContext());
	}

	/**
	 * @param context
	 * @return value of OptionLabel
	 */
	public final java.lang.String getOptionLabel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OptionLabel.toString());
	}

	/**
	 * Set value of OptionLabel
	 * @param optionlabel
	 */
	public final void setOptionLabel(java.lang.String optionlabel)
	{
		setOptionLabel(getContext(), optionlabel);
	}

	/**
	 * Set value of OptionLabel
	 * @param context
	 * @param optionlabel
	 */
	public final void setOptionLabel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String optionlabel)
	{
		getMendixObject().setValue(context, MemberNames.OptionLabel.toString(), optionlabel);
	}

	/**
	 * Set value of Applicability
	 * @param applicability
	 */
	public final questionnaire.proxies.Applicability getApplicability()
	{
		return getApplicability(getContext());
	}

	/**
	 * @param context
	 * @return value of Applicability
	 */
	public final questionnaire.proxies.Applicability getApplicability(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Applicability.toString());
		if (obj == null)
			return null;

		return questionnaire.proxies.Applicability.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Applicability
	 * @param applicability
	 */
	public final void setApplicability(questionnaire.proxies.Applicability applicability)
	{
		setApplicability(getContext(), applicability);
	}

	/**
	 * Set value of Applicability
	 * @param context
	 * @param applicability
	 */
	public final void setApplicability(com.mendix.systemwideinterfaces.core.IContext context, questionnaire.proxies.Applicability applicability)
	{
		if (applicability != null)
			getMendixObject().setValue(context, MemberNames.Applicability.toString(), applicability.toString());
		else
			getMendixObject().setValue(context, MemberNames.Applicability.toString(), null);
	}

	/**
	 * @return value of ConfirmedAction
	 */
	public final java.lang.Boolean getConfirmedAction()
	{
		return getConfirmedAction(getContext());
	}

	/**
	 * @param context
	 * @return value of ConfirmedAction
	 */
	public final java.lang.Boolean getConfirmedAction(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ConfirmedAction.toString());
	}

	/**
	 * Set value of ConfirmedAction
	 * @param confirmedaction
	 */
	public final void setConfirmedAction(java.lang.Boolean confirmedaction)
	{
		setConfirmedAction(getContext(), confirmedaction);
	}

	/**
	 * Set value of ConfirmedAction
	 * @param context
	 * @param confirmedaction
	 */
	public final void setConfirmedAction(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean confirmedaction)
	{
		getMendixObject().setValue(context, MemberNames.ConfirmedAction.toString(), confirmedaction);
	}

	/**
	 * @return value of OptionConfig_ElementConfig
	 */
	public final questionnaire.proxies.ElementConfig getOptionConfig_ElementConfig() throws com.mendix.core.CoreException
	{
		return getOptionConfig_ElementConfig(getContext());
	}

	/**
	 * @param context
	 * @return value of OptionConfig_ElementConfig
	 */
	public final questionnaire.proxies.ElementConfig getOptionConfig_ElementConfig(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		questionnaire.proxies.ElementConfig result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OptionConfig_ElementConfig.toString());
		if (identifier != null)
			result = questionnaire.proxies.ElementConfig.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OptionConfig_ElementConfig
	 * @param optionconfig_elementconfig
	 */
	public final void setOptionConfig_ElementConfig(questionnaire.proxies.ElementConfig optionconfig_elementconfig)
	{
		setOptionConfig_ElementConfig(getContext(), optionconfig_elementconfig);
	}

	/**
	 * Set value of OptionConfig_ElementConfig
	 * @param context
	 * @param optionconfig_elementconfig
	 */
	public final void setOptionConfig_ElementConfig(com.mendix.systemwideinterfaces.core.IContext context, questionnaire.proxies.ElementConfig optionconfig_elementconfig)
	{
		if (optionconfig_elementconfig == null)
			getMendixObject().setValue(context, MemberNames.OptionConfig_ElementConfig.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OptionConfig_ElementConfig.toString(), optionconfig_elementconfig.getMendixObject().getId());
	}

	/**
	 * @return value of OptionConfig_OptionConfig_CreatedFrom
	 */
	public final questionnaire.proxies.OptionConfig getOptionConfig_OptionConfig_CreatedFrom() throws com.mendix.core.CoreException
	{
		return getOptionConfig_OptionConfig_CreatedFrom(getContext());
	}

	/**
	 * @param context
	 * @return value of OptionConfig_OptionConfig_CreatedFrom
	 */
	public final questionnaire.proxies.OptionConfig getOptionConfig_OptionConfig_CreatedFrom(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		questionnaire.proxies.OptionConfig result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OptionConfig_OptionConfig_CreatedFrom.toString());
		if (identifier != null)
			result = questionnaire.proxies.OptionConfig.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OptionConfig_OptionConfig_CreatedFrom
	 * @param optionconfig_optionconfig_createdfrom
	 */
	public final void setOptionConfig_OptionConfig_CreatedFrom(questionnaire.proxies.OptionConfig optionconfig_optionconfig_createdfrom)
	{
		setOptionConfig_OptionConfig_CreatedFrom(getContext(), optionconfig_optionconfig_createdfrom);
	}

	/**
	 * Set value of OptionConfig_OptionConfig_CreatedFrom
	 * @param context
	 * @param optionconfig_optionconfig_createdfrom
	 */
	public final void setOptionConfig_OptionConfig_CreatedFrom(com.mendix.systemwideinterfaces.core.IContext context, questionnaire.proxies.OptionConfig optionconfig_optionconfig_createdfrom)
	{
		if (optionconfig_optionconfig_createdfrom == null)
			getMendixObject().setValue(context, MemberNames.OptionConfig_OptionConfig_CreatedFrom.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OptionConfig_OptionConfig_CreatedFrom.toString(), optionconfig_optionconfig_createdfrom.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return optionConfigMendixObject;
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
			final questionnaire.proxies.OptionConfig that = (questionnaire.proxies.OptionConfig) obj;
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
		return "Questionnaire.OptionConfig";
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
