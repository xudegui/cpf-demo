// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package questionnaire.proxies;

public class ElementImage extends system.proxies.Image
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Questionnaire.ElementImage";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PublicThumbnailPath("PublicThumbnailPath"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		ElementImage_QuestionnaireSet("Questionnaire.ElementImage_QuestionnaireSet");

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

	public ElementImage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Questionnaire.ElementImage"));
	}

	protected ElementImage(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject elementImageMendixObject)
	{
		super(context, elementImageMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Questionnaire.ElementImage", elementImageMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Questionnaire.ElementImage");
	}

	/**
	 * @deprecated Use 'ElementImage.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static questionnaire.proxies.ElementImage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return questionnaire.proxies.ElementImage.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static questionnaire.proxies.ElementImage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new questionnaire.proxies.ElementImage(context, mendixObject);
	}

	public static questionnaire.proxies.ElementImage load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return questionnaire.proxies.ElementImage.initialize(context, mendixObject);
	}

	public static java.util.List<questionnaire.proxies.ElementImage> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<questionnaire.proxies.ElementImage> result = new java.util.ArrayList<questionnaire.proxies.ElementImage>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Questionnaire.ElementImage" + xpathConstraint))
			result.add(questionnaire.proxies.ElementImage.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of ElementImage_QuestionnaireSet
	 */
	public final java.util.List<questionnaire.proxies.QuestionnaireSet> getElementImage_QuestionnaireSet() throws com.mendix.core.CoreException
	{
		return getElementImage_QuestionnaireSet(getContext());
	}

	/**
	 * @param context
	 * @return value of ElementImage_QuestionnaireSet
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<questionnaire.proxies.QuestionnaireSet> getElementImage_QuestionnaireSet(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<questionnaire.proxies.QuestionnaireSet> result = new java.util.ArrayList<questionnaire.proxies.QuestionnaireSet>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.ElementImage_QuestionnaireSet.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(questionnaire.proxies.QuestionnaireSet.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of ElementImage_QuestionnaireSet
	 * @param elementimage_questionnaireset
	 */
	public final void setElementImage_QuestionnaireSet(java.util.List<questionnaire.proxies.QuestionnaireSet> elementimage_questionnaireset)
	{
		setElementImage_QuestionnaireSet(getContext(), elementimage_questionnaireset);
	}

	/**
	 * Set value of ElementImage_QuestionnaireSet
	 * @param context
	 * @param elementimage_questionnaireset
	 */
	public final void setElementImage_QuestionnaireSet(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<questionnaire.proxies.QuestionnaireSet> elementimage_questionnaireset)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (questionnaire.proxies.QuestionnaireSet proxyObject : elementimage_questionnaireset)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.ElementImage_QuestionnaireSet.toString(), identifiers);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final questionnaire.proxies.ElementImage that = (questionnaire.proxies.ElementImage) obj;
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
		return "Questionnaire.ElementImage";
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