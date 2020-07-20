/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credential Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CredentialAttack#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CredentialAttack#getExploits <em>Exploits</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage#getCredentialAttack()
 * @model
 * @generated
 */
public interface CredentialAttack extends Attack {
    /**
     * Returns the value of the '<em><b>Contexts</b></em>' reference list.
     * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.set.ContextSet}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contexts</em>' reference list.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage#getCredentialAttack_Contexts()
     * @model
     * @generated
     */
    EList<ContextSet> getContexts();

    /**
     * Returns the value of the '<em><b>Exploits</b></em>' reference list.
     * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CredentialVulnerability}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exploits</em>' reference list.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage#getCredentialAttack_Exploits()
     * @model
     * @generated
     */
    EList<CredentialVulnerability> getExploits();

} // CredentialAttack
