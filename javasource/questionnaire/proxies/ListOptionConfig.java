// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package questionnaire.proxies;

public class ListOptionConfig extends questionnaire.proxies.OptionConfig
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Questionnaire.ListOptionConfig";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Sequence("Sequence"),
		Name("Name"),
		IsCorrectAnswer("IsCorrectAnswer"),
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

	public ListOptionConfig(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Questionnaire.ListOptionConfig"));
	}

	protected ListOptionConfig(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject listOptionConfigMendixObject)
	{
		super(context, listOptionConfigMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Questionnaire.ListOptionConfig", listOptionConfigMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Questionnaire.ListOptionConfig");
	}

	/**
	 * @deprecated Use 'ListOptionConfig.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static questionnaire.proxies.ListOptionConfig initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return questionnaire.proxies.ListOptionConfig.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static questionnaire.proxies.ListOptionConfig initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new questionnaire.proxies.ListOptionConfig(context, mendixObject);
	}

	public static questionnaire.proxies.ListOptionConfig load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return questionnaire.proxies.ListOptionConfig.initialize(context, mendixObject);
	}

	public static java.util.List<questionnaire.proxies.ListOptionConfig> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<questionnaire.proxies.ListOptionConfig> result = new java.util.ArrayList<questionnaire.proxies.ListOptionConfig>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Questionnaire.ListOptionConfig" + xpathConstraint))
			result.add(questionnaire.proxies.ListOptionConfig.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Sequence
	 */
	public final java.lang.Integer getSequence()
	{
		return getSequence(getContext());
	}

	/**
	 * @param context
	 * @return value of Sequence
	 */
	public final java.lang.Integer getSequence(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Sequence.toString());
	}

	/**
	 * Set value of Sequence
	 * @param sequence
	 */
	public final void setSequence(java.lang.Integer sequence)
	{
		setSequence(getContext(), sequence);
	}

	/**
	 * Set value of Sequence
	 * @param context
	 * @param sequence
	 */
	public final void setSequence(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer sequence)
	{
		getMendixObject().setValue(context, MemberNames.Sequence.toString(), sequence);
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of IsCorrectAnswer
	 */
	public final java.lang.Boolean getIsCorrectAnswer()
	{
		return getIsCorrectAnswer(getContext());
	}

	/**
	 * @param context
	 * @return value of IsCorrectAnswer
	 */
	public final java.lang.Boolean getIsCorrectAnswer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsCorrectAnswer.toString());
	}

	/**
	 * Set value of IsCorrectAnswer
	 * @param iscorrectanswer
	 */
	public final void setIsCorrectAnswer(java.lang.Boolean iscorrectanswer)
	{
		setIsCorrectAnswer(getContext(), iscorrectanswer);
	}

	/**
	 * Set value of IsCorrectAnswer
	 * @param context
	 * @param iscorrectanswer
	 */
	public final void setIsCorrectAnswer(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean iscorrectanswer)
	{
		getMendixObject().setValue(context, MemberNames.IsCorrectAnswer.toString(), iscorrectanswer);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final questionnaire.proxies.ListOptionConfig that = (questionnaire.proxies.ListOptionConfig) obj;
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
		return "Questionnaire.ListOptionConfig";
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