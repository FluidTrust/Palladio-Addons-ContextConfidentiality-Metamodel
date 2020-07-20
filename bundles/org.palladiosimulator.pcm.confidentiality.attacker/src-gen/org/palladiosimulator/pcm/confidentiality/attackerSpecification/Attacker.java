/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Attack;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attacker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttacker()
 * @model
 * @generated
 */
public interface Attacker extends Entity {
    /**
     * Returns the value of the '<em><b>Capabilities</b></em>' reference list.
     * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Attack}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capabilities</em>' reference list.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttacker_Capabilities()
     * @model
     * @generated
     */
    EList<Attack> getCapabilities();

} // Attacker
