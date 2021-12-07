/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext;

import java.util.List;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute#getAttributevalue <em>Attributevalue</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage#getAttribute()
 * @model abstract="true"
 * @generated
 */
public interface Attribute extends Entity
{
	/**
	 * Returns the value of the '<em><b>Attributevalue</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributevalue</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage#getAttribute_Attributevalue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	List<AttributeValue> getAttributevalue();

} // Attribute
