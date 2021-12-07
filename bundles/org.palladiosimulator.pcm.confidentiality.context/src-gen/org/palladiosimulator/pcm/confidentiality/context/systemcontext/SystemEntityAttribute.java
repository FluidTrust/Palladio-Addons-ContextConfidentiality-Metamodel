/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Entity Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemEntityAttribute#getModelEntity <em>Model Entity</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage#getSystemEntityAttribute()
 * @model
 * @generated
 */
public interface SystemEntityAttribute extends Attribute
{
	/**
	 * Returns the value of the '<em><b>Model Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Entity</em>' reference.
	 * @see #setModelEntity(Entity)
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage#getSystemEntityAttribute_ModelEntity()
	 * @model required="true"
	 * @generated
	 */
	Entity getModelEntity();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemEntityAttribute#getModelEntity <em>Model Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Entity</em>' reference.
	 * @see #getModelEntity()
	 * @generated
	 */
	void setModelEntity(Entity value);

} // SystemEntityAttribute
