/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeSelection#getCategory <em>Category</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeSelection#isMustBePresent <em>Must Be Present</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getAttributeSelection()
 * @model abstract="true"
 * @generated
 */
public interface AttributeSelection extends Expression
{
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.pcm.confidentiality.context.policy.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Category
	 * @see #setCategory(Category)
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getAttributeSelection_Category()
	 * @model
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeSelection#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Category
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Must Be Present</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Be Present</em>' attribute.
	 * @see #setMustBePresent(boolean)
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getAttributeSelection_MustBePresent()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isMustBePresent();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeSelection#isMustBePresent <em>Must Be Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Be Present</em>' attribute.
	 * @see #isMustBePresent()
	 * @generated
	 */
	void setMustBePresent(boolean value);

} // AttributeSelection
