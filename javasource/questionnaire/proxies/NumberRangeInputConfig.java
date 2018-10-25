// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package questionnaire.proxies;

public class NumberRangeInputConfig extends questionnaire.proxies.ElementConfig
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Questionnaire.NumberRangeInputConfig";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Required("Required"),
		RenderMode("RenderMode"),
		Range("Range"),
		WholeNumber("WholeNumber"),
		CorrectAnswer("CorrectAnswer"),
		Sequence("Sequence"),
		UpdateSequenceType("UpdateSequenceType"),
		ConfirmedAction("ConfirmedAction"),
		LabelHTML("LabelHTML"),
		LabelPlainText("LabelPlainText"),
		DisplayHelpText("DisplayHelpText"),
		HelpText("HelpText"),
		Visibility("Visibility"),
		ElementConfigType("ElementConfigType"),
		Score("Score"),
		ElementConfig_QuestionnaireConfig("Questionnaire.ElementConfig_QuestionnaireConfig"),
		ElementConfig_ElementConfig_CreatedFrom("Questionnaire.ElementConfig_ElementConfig_CreatedFrom");

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

	public NumberRangeInputConfig(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Questionnaire.NumberRangeInputConfig"));
	}

	protected NumberRangeInputConfig(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject numberRangeInputConfigMendixObject)
	{
		super(context, numberRangeInputConfigMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Questionnaire.NumberRangeInputConfig", numberRangeInputConfigMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Questionnaire.NumberRangeInputConfig");
	}

	/**
	 * @deprecated Use 'NumberRangeInputConfig.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static questionnaire.proxies.NumberRangeInputConfig initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return questionnaire.proxies.NumberRangeInputConfig.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static questionnaire.proxies.NumberRangeInputConfig initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new questionnaire.proxies.NumberRangeInputConfig(context, mendixObject);
	}

	public static questionnaire.proxies.NumberRangeInputConfig load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return questionnaire.proxies.NumberRangeInputConfig.initialize(context, mendixObject);
	}

	public static java.util.List<questionnaire.proxies.NumberRangeInputConfig> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<questionnaire.proxies.NumberRangeInputConfig> result = new java.util.ArrayList<questionnaire.proxies.NumberRangeInputConfig>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Questionnaire.NumberRangeInputConfig" + xpathConstraint))
			result.add(questionnaire.proxies.NumberRangeInputConfig.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Required
	 */
	public final java.lang.Boolean getRequired()
	{
		return getRequired(getContext());
	}

	/**
	 * @param context
	 * @return value of Required
	 */
	public final java.lang.Boolean getRequired(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Required.toString());
	}

	/**
	 * Set value of Required
	 * @param required
	 */
	public final void setRequired(java.lang.Boolean required)
	{
		setRequired(getContext(), required);
	}

	/**
	 * Set value of Required
	 * @param context
	 * @param required
	 */
	public final void setRequired(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean required)
	{
		getMendixObject().setValue(context, MemberNames.Required.toString(), required);
	}

	/**
	 * Set value of RenderMode
	 * @param rendermode
	 */
	public final questionnaire.proxies.NumberRangeInputRenderMode getRenderMode()
	{
		return getRenderMode(getContext());
	}

	/**
	 * @param context
	 * @return value of RenderMode
	 */
	public final questionnaire.proxies.NumberRangeInputRenderMode getRenderMode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.RenderMode.toString());
		if (obj == null)
			return null;

		return questionnaire.proxies.NumberRangeInputRenderMode.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of RenderMode
	 * @param rendermode
	 */
	public final void setRenderMode(questionnaire.proxies.NumberRangeInputRenderMode rendermode)
	{
		setRenderMode(getContext(), rendermode);
	}

	/**
	 * Set value of RenderMode
	 * @param context
	 * @param rendermode
	 */
	public final void setRenderMode(com.mendix.systemwideinterfaces.core.IContext context, questionnaire.proxies.NumberRangeInputRenderMode rendermode)
	{
		if (rendermode != null)
			getMendixObject().setValue(context, MemberNames.RenderMode.toString(), rendermode.toString());
		else
			getMendixObject().setValue(context, MemberNames.RenderMode.toString(), null);
	}

	/**
	 * Set value of Range
	 * @param range
	 */
	public final questionnaire.proxies.NumberRange getRange()
	{
		return getRange(getContext());
	}

	/**
	 * @param context
	 * @return value of Range
	 */
	public final questionnaire.proxies.NumberRange getRange(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Range.toString());
		if (obj == null)
			return null;

		return questionnaire.proxies.NumberRange.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Range
	 * @param range
	 */
	public final void setRange(questionnaire.proxies.NumberRange range)
	{
		setRange(getContext(), range);
	}

	/**
	 * Set value of Range
	 * @param context
	 * @param range
	 */
	public final void setRange(com.mendix.systemwideinterfaces.core.IContext context, questionnaire.proxies.NumberRange range)
	{
		if (range != null)
			getMendixObject().setValue(context, MemberNames.Range.toString(), range.toString());
		else
			getMendixObject().setValue(context, MemberNames.Range.toString(), null);
	}

	/**
	 * @return value of WholeNumber
	 */
	public final java.lang.Boolean getWholeNumber()
	{
		return getWholeNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of WholeNumber
	 */
	public final java.lang.Boolean getWholeNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.WholeNumber.toString());
	}

	/**
	 * Set value of WholeNumber
	 * @param wholenumber
	 */
	public final void setWholeNumber(java.lang.Boolean wholenumber)
	{
		setWholeNumber(getContext(), wholenumber);
	}

	/**
	 * Set value of WholeNumber
	 * @param context
	 * @param wholenumber
	 */
	public final void setWholeNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean wholenumber)
	{
		getMendixObject().setValue(context, MemberNames.WholeNumber.toString(), wholenumber);
	}

	/**
	 * @return value of CorrectAnswer
	 */
	public final java.math.BigDecimal getCorrectAnswer()
	{
		return getCorrectAnswer(getContext());
	}

	/**
	 * @param context
	 * @return value of CorrectAnswer
	 */
	public final java.math.BigDecimal getCorrectAnswer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.CorrectAnswer.toString());
	}

	/**
	 * Set value of CorrectAnswer
	 * @param correctanswer
	 */
	public final void setCorrectAnswer(java.math.BigDecimal correctanswer)
	{
		setCorrectAnswer(getContext(), correctanswer);
	}

	/**
	 * Set value of CorrectAnswer
	 * @param context
	 * @param correctanswer
	 */
	public final void setCorrectAnswer(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal correctanswer)
	{
		getMendixObject().setValue(context, MemberNames.CorrectAnswer.toString(), correctanswer);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final questionnaire.proxies.NumberRangeInputConfig that = (questionnaire.proxies.NumberRangeInputConfig) obj;
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
		return "Questionnaire.NumberRangeInputConfig";
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
