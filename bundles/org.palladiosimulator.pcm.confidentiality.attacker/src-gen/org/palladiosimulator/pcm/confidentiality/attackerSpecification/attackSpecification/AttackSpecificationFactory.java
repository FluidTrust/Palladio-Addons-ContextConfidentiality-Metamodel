/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage
 * @generated
 */
public interface AttackSpecificationFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AttackSpecificationFactory eINSTANCE = org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>Credential Attack</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Credential Attack</em>'.
     * @generated
     */
    CredentialAttack createCredentialAttack();

    /**
     * Returns a new object of class '<em>Credential Vulnerability</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Credential Vulnerability</em>'.
     * @generated
     */
    CredentialVulnerability createCredentialVulnerability();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    AttackSpecificationPackage getAttackSpecificationPackage();

} //AttackSpecificationFactory
