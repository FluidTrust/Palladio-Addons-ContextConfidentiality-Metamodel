/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeValueReference#getAttributevalue <em>Attributevalue</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getAttributeValueReference()
 * @model
 * @generated
 */
public interface AttributeValueReference extends Expression
{
	/**
	 * Returns the value of the '<em><b>Attributevalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributevalue</em>' reference.
	 * @see #setAttributevalue(AttributeValue)
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getAttributeValueReference_Attributevalue()
	 * @model required="true"
	 * @generated
	 */
	AttributeValue getAttributevalue();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeValueReference#getAttributevalue <em>Attributevalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributevalue</em>' reference.
	 * @see #getAttributevalue()
	 * @generated
	 */
	void setAttributevalue(AttributeValue value);

} // AttributeValueReference
