/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext;

import java.util.List;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue#getType <em>Type</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage#getAttributeValue()
 * @model
 * @generated
 */
public interface AttributeValue extends Entity
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes
	 * @see #setType(DataTypes)
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage#getAttributeValue_Type()
	 * @model required="true"
	 * @generated
	 */
	DataTypes getType();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(DataTypes value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage#getAttributeValue_Values()
	 * @model required="true"
	 * @generated
	 */
	List<String> getValues();

} // AttributeValue
