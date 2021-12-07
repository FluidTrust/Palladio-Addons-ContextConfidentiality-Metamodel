/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system;

import java.util.List;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.SystemSpecificationContainer#getAttributeprovider <em>Attributeprovider</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.SystemSpecificationContainer#getUsagespecification <em>Usagespecification</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage#getSystemSpecificationContainer()
 * @model
 * @generated
 */
public interface SystemSpecificationContainer extends Entity
{
	/**
	 * Returns the value of the '<em><b>Attributeprovider</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.system.AttributeProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributeprovider</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage#getSystemSpecificationContainer_Attributeprovider()
	 * @model containment="true"
	 * @generated
	 */
	List<AttributeProvider> getAttributeprovider();

	/**
	 * Returns the value of the '<em><b>Usagespecification</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usagespecification</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage#getSystemSpecificationContainer_Usagespecification()
	 * @model containment="true"
	 * @generated
	 */
	List<UsageSpecification> getUsagespecification();

} // SystemSpecificationContainer
