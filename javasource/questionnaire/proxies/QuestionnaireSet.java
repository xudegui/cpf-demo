// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package questionnaire.proxies;

public class QuestionnaireSet
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject questionnaireSetMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Questionnaire.QuestionnaireSet";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Number("Number"),
		Published("Published"),
		LatestRevisionNumber("LatestRevisionNumber"),
		QuestionnaireSet_QuestionnaireSet("Questionnaire.QuestionnaireSet_QuestionnaireSet");

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

	public QuestionnaireSet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Questionnaire.QuestionnaireSet"));
	}

	protected QuestionnaireSet(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject questionnaireSetMendixObject)
	{
		if (questionnaireSetMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Questionnaire.QuestionnaireSet", questionnaireSetMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Questionnaire.QuestionnaireSet");

		this.questionnaireSetMendixObject = questionnaireSetMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'QuestionnaireSet.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static questionnaire.proxies.QuestionnaireSet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return questionnaire.proxies.QuestionnaireSet.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static questionnaire.proxies.QuestionnaireSet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new questionnaire.proxies.QuestionnaireSet(context, mendixObject);
	}

	public static questionnaire.proxies.QuestionnaireSet load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return questionnaire.proxies.QuestionnaireSet.initialize(context, mendixObject);
	}

	public static java.util.List<questionnaire.proxies.QuestionnaireSet> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<questionnaire.proxies.QuestionnaireSet> result = new java.util.ArrayList<questionnaire.proxies.QuestionnaireSet>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Questionnaire.QuestionnaireSet" + xpathConstraint))
			result.add(questionnaire.proxies.QuestionnaireSet.initialize(context, obj));
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
	 * @return value of Number
	 */
	public final java.lang.Long getNumber()
	{
		return getNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of Number
	 */
	public final java.lang.Long getNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.Number.toString());
	}

	/**
	 * Set value of Number
	 * @param number
	 */
	public final void setNumber(java.lang.Long number)
	{
		setNumber(getContext(), number);
	}

	/**
	 * Set value of Number
	 * @param context
	 * @param number
	 */
	public final void setNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long number)
	{
		getMendixObject().setValue(context, MemberNames.Number.toString(), number);
	}

	/**
	 * @return value of Published
	 */
	public final java.lang.Boolean getPublished()
	{
		return getPublished(getContext());
	}

	/**
	 * @param context
	 * @return value of Published
	 */
	public final java.lang.Boolean getPublished(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Published.toString());
	}

	/**
	 * Set value of Published
	 * @param published
	 */
	public final void setPublished(java.lang.Boolean published)
	{
		setPublished(getContext(), published);
	}

	/**
	 * Set value of Published
	 * @param context
	 * @param published
	 */
	public final void setPublished(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean published)
	{
		getMendixObject().setValue(context, MemberNames.Published.toString(), published);
	}

	/**
	 * @return value of LatestRevisionNumber
	 */
	public final java.lang.Integer getLatestRevisionNumber()
	{
		return getLatestRevisionNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of LatestRevisionNumber
	 */
	public final java.lang.Integer getLatestRevisionNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.LatestRevisionNumber.toString());
	}

	/**
	 * Set value of LatestRevisionNumber
	 * @param latestrevisionnumber
	 */
	public final void setLatestRevisionNumber(java.lang.Integer latestrevisionnumber)
	{
		setLatestRevisionNumber(getContext(), latestrevisionnumber);
	}

	/**
	 * Set value of LatestRevisionNumber
	 * @param context
	 * @param latestrevisionnumber
	 */
	public final void setLatestRevisionNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer latestrevisionnumber)
	{
		getMendixObject().setValue(context, MemberNames.LatestRevisionNumber.toString(), latestrevisionnumber);
	}

	/**
	 * @return value of QuestionnaireSet_QuestionnaireSet
	 */
	public final java.util.List<questionnaire.proxies.QuestionnaireSet> getQuestionnaireSet_QuestionnaireSet() throws com.mendix.core.CoreException
	{
		return getQuestionnaireSet_QuestionnaireSet(getContext());
	}

	/**
	 * @param context
	 * @return value of QuestionnaireSet_QuestionnaireSet
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<questionnaire.proxies.QuestionnaireSet> getQuestionnaireSet_QuestionnaireSet(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<questionnaire.proxies.QuestionnaireSet> result = new java.util.ArrayList<questionnaire.proxies.QuestionnaireSet>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.QuestionnaireSet_QuestionnaireSet.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(questionnaire.proxies.QuestionnaireSet.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of QuestionnaireSet_QuestionnaireSet
	 * @param questionnaireset_questionnaireset
	 */
	public final void setQuestionnaireSet_QuestionnaireSet(java.util.List<questionnaire.proxies.QuestionnaireSet> questionnaireset_questionnaireset)
	{
		setQuestionnaireSet_QuestionnaireSet(getContext(), questionnaireset_questionnaireset);
	}

	/**
	 * Set value of QuestionnaireSet_QuestionnaireSet
	 * @param context
	 * @param questionnaireset_questionnaireset
	 */
	public final void setQuestionnaireSet_QuestionnaireSet(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<questionnaire.proxies.QuestionnaireSet> questionnaireset_questionnaireset)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (questionnaire.proxies.QuestionnaireSet proxyObject : questionnaireset_questionnaireset)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.QuestionnaireSet_QuestionnaireSet.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return questionnaireSetMendixObject;
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
			final questionnaire.proxies.QuestionnaireSet that = (questionnaire.proxies.QuestionnaireSet) obj;
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
		return "Questionnaire.QuestionnaireSet";
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