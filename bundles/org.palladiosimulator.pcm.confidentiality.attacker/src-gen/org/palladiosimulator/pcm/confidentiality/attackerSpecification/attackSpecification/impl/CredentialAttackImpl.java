/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CredentialAttack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CredentialVulnerability;

import org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credential Attack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CredentialAttackImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CredentialAttackImpl#getExploits <em>Exploits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CredentialAttackImpl extends AttackImpl implements CredentialAttack {
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

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<ContextAttribute> getContexts() {
        return (EList<ContextAttribute>) eGet(AttackSpecificationPackage.Literals.CREDENTIAL_ATTACK__CONTEXTS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<CredentialVulnerability> getExploits() {
        return (EList<CredentialVulnerability>) eGet(AttackSpecificationPackage.Literals.CREDENTIAL_ATTACK__EXPLOITS,
                true);
    }

} //CredentialAttackImpl
