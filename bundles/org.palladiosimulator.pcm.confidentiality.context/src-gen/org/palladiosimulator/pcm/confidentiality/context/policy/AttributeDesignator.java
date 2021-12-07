/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Designator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeDesignator#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeDesignator#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getAttributeDesignator()
 * @model
 * @generated
 */
public interface AttributeDesignator extends AttributeSelection
{
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getAttributeDesignator_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeDesignator#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes
	 * @see #setType(DataTypes)
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getAttributeDesignator_Type()
	 * @model
	 * @generated
	 */
	DataTypes getType();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeDesignator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(DataTypes value);

} // AttributeDesignator
