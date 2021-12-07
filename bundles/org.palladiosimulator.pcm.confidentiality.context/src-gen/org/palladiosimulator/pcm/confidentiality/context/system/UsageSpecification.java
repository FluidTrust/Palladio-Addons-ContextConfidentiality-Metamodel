/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification#getAttributevalue <em>Attributevalue</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage#getUsageSpecification()
 * @model
 * @generated
 */
public interface UsageSpecification extends Entity
{
	/**
	 * Returns the value of the '<em><b>Attributevalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributevalue</em>' reference.
	 * @see #setAttributevalue(AttributeValue)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage#getUsageSpecification_Attributevalue()
	 * @model
	 * @generated
	 */
	AttributeValue getAttributevalue();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification#getAttributevalue <em>Attributevalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributevalue</em>' reference.
	 * @see #getAttributevalue()
	 * @generated
	 */
	void setAttributevalue(AttributeValue value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage#getUsageSpecification_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

} // UsageSpecification
