/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Attack#getExploits <em>Exploits</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage#getAttack()
 * @model abstract="true"
 * @generated
 */
public interface Attack<T extends Vulnerability> extends Entity {

    /**
     * Returns the value of the '<em><b>Exploits</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exploits</em>' reference list.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage#getAttack_Exploits()
     * @model
     * @generated
     */
    EList<T> getExploits();
} // Attack
