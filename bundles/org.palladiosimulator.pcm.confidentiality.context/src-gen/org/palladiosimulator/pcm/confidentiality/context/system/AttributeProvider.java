/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.AttributeProvider#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage#getAttributeProvider()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface AttributeProvider extends CDOObject
{
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference.
	 * @see #setAttribute(UsageSpecification)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage#getAttributeProvider_Attribute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UsageSpecification getAttribute();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.AttributeProvider#getAttribute <em>Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' containment reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(UsageSpecification value);

} // AttributeProvider
