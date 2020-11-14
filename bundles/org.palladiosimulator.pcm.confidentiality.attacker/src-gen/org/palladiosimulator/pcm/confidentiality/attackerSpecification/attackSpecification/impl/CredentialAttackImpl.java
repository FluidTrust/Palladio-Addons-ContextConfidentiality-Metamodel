/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CredentialAttack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CredentialVulnerability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credential Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CredentialAttackImpl extends AttackImpl<CredentialVulnerability> implements CredentialAttack {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CredentialAttackImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AttackSpecificationPackage.Literals.CREDENTIAL_ATTACK;
    }

} //CredentialAttackImpl
