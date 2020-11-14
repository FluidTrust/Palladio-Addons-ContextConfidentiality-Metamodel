/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationFactory
 * @model kind="package"
 * @generated
 */
public interface AttackSpecificationPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "attackSpecification";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/pcm/confidentiality/attacker/0.1/";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "attack";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AttackSpecificationPackage eINSTANCE = org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl
            .init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackImpl <em>Attack</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackImpl
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getAttack()
     * @generated
     */
    int ATTACK = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Exploits</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK__EXPLOITS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Attack</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CredentialAttackImpl <em>Credential Attack</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CredentialAttackImpl
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCredentialAttack()
     * @generated
     */
    int CREDENTIAL_ATTACK = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDENTIAL_ATTACK__ID = ATTACK__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDENTIAL_ATTACK__ENTITY_NAME = ATTACK__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Exploits</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDENTIAL_ATTACK__EXPLOITS = ATTACK__EXPLOITS;

    /**
     * The number of structural features of the '<em>Credential Attack</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDENTIAL_ATTACK_FEATURE_COUNT = ATTACK_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.VulnerabilityImpl <em>Vulnerability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.VulnerabilityImpl
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getVulnerability()
     * @generated
     */
    int VULNERABILITY = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VULNERABILITY__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VULNERABILITY__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The number of structural features of the '<em>Vulnerability</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VULNERABILITY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CredentialVulnerabilityImpl <em>Credential Vulnerability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CredentialVulnerabilityImpl
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCredentialVulnerability()
     * @generated
     */
    int CREDENTIAL_VULNERABILITY = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDENTIAL_VULNERABILITY__ID = VULNERABILITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDENTIAL_VULNERABILITY__ENTITY_NAME = VULNERABILITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Context</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDENTIAL_VULNERABILITY__CONTEXT = VULNERABILITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Credential Vulnerability</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDENTIAL_VULNERABILITY_FEATURE_COUNT = VULNERABILITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.NewAbstractClass5Impl <em>New Abstract Class5</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.NewAbstractClass5Impl
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getNewAbstractClass5()
     * @generated
     */
    int NEW_ABSTRACT_CLASS5 = 4;

    /**
     * The number of structural features of the '<em>New Abstract Class5</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_ABSTRACT_CLASS5_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.ActionTyp <em>Action Typ</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.ActionTyp
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getActionTyp()
     * @generated
     */
    int ACTION_TYP = 5;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Attack <em>Attack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attack</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Attack
     * @generated
     */
    EClass getAttack();

    /**
     * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Attack#getExploits <em>Exploits</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Exploits</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Attack#getExploits()
     * @see #getAttack()
     * @generated
     */
    EReference getAttack_Exploits();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CredentialAttack <em>Credential Attack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Credential Attack</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CredentialAttack
     * @generated
     */
    EClass getCredentialAttack();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CredentialVulnerability <em>Credential Vulnerability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Credential Vulnerability</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CredentialVulnerability
     * @generated
     */
    EClass getCredentialVulnerability();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CredentialVulnerability#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Context</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CredentialVulnerability#getContext()
     * @see #getCredentialVulnerability()
     * @generated
     */
    EReference getCredentialVulnerability_Context();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability <em>Vulnerability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Vulnerability</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability
     * @generated
     */
    EClass getVulnerability();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.NewAbstractClass5 <em>New Abstract Class5</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>New Abstract Class5</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.NewAbstractClass5
     * @generated
     */
    EClass getNewAbstractClass5();

    /**
     * Returns the meta object for enum '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.ActionTyp <em>Action Typ</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Action Typ</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.ActionTyp
     * @generated
     */
    EEnum getActionTyp();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    AttackSpecificationFactory getAttackSpecificationFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackImpl <em>Attack</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackImpl
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getAttack()
         * @generated
         */
        EClass ATTACK = eINSTANCE.getAttack();

        /**
         * The meta object literal for the '<em><b>Exploits</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTACK__EXPLOITS = eINSTANCE.getAttack_Exploits();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CredentialAttackImpl <em>Credential Attack</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CredentialAttackImpl
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCredentialAttack()
         * @generated
         */
        EClass CREDENTIAL_ATTACK = eINSTANCE.getCredentialAttack();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CredentialVulnerabilityImpl <em>Credential Vulnerability</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CredentialVulnerabilityImpl
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCredentialVulnerability()
         * @generated
         */
        EClass CREDENTIAL_VULNERABILITY = eINSTANCE.getCredentialVulnerability();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CREDENTIAL_VULNERABILITY__CONTEXT = eINSTANCE.getCredentialVulnerability_Context();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.VulnerabilityImpl <em>Vulnerability</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.VulnerabilityImpl
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getVulnerability()
         * @generated
         */
        EClass VULNERABILITY = eINSTANCE.getVulnerability();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.NewAbstractClass5Impl <em>New Abstract Class5</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.NewAbstractClass5Impl
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getNewAbstractClass5()
         * @generated
         */
        EClass NEW_ABSTRACT_CLASS5 = eINSTANCE.getNewAbstractClass5();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.ActionTyp <em>Action Typ</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.ActionTyp
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getActionTyp()
         * @generated
         */
        EEnum ACTION_TYP = eINSTANCE.getActionTyp();

    }

} //AttackSpecificationPackage
