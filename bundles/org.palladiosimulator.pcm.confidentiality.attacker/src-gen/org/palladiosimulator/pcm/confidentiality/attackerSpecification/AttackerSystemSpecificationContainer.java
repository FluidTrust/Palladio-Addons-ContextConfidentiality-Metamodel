/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Specification Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSystemSpecificationContainer#getVulnerabilities <em>Vulnerabilities</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttackerSystemSpecificationContainer()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AttackerSystemSpecificationContainer extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Vulnerabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vulnerabilities</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttackerSystemSpecificationContainer_Vulnerabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemIntegration> getVulnerabilities();

} // AttackerSystemSpecificationContainer
