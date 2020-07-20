/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vulneraby Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.VulnerabyContainer#getVulnerability <em>Vulnerability</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getVulnerabyContainer()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface VulnerabyContainer extends CDOObject {
    /**
     * Returns the value of the '<em><b>Vulnerability</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vulnerability</em>' containment reference list.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getVulnerabyContainer_Vulnerability()
     * @model containment="true"
     * @generated
     */
    EList<Vulnerability> getVulnerability();

} // VulnerabyContainer
