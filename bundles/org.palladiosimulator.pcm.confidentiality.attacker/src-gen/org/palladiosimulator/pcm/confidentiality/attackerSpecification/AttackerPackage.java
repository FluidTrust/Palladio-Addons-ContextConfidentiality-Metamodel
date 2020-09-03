/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;

import org.eclipse.emf.ecore.EClass;
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
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerFactory
 * @model kind="package"
 * @generated
 */
public interface AttackerPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "attackerSpecification";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/pcm/confidentiality/attack/0.1/";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "attacker";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AttackerPackage eINSTANCE = org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl
            .init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerContainerImpl
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl#getAttackerContainer()
     * @generated
     */
    int ATTACKER_CONTAINER = 0;

    /**
     * The feature id for the '<em><b>Attacker</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACKER_CONTAINER__ATTACKER = 0;

    /**
     * The number of structural features of the '<em>Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACKER_CONTAINER_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerImpl <em>Attacker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerImpl
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl#getAttacker()
     * @generated
     */
    int ATTACKER = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACKER__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACKER__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Capabilities</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACKER__CAPABILITIES = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Attacker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACKER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerSpecificationImpl <em>Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerSpecificationImpl
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl#getAttackerSpecification()
     * @generated
     */
    int ATTACKER_SPECIFICATION = 2;

    /**
     * The feature id for the '<em><b>Attackers</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACKER_SPECIFICATION__ATTACKERS = 0;

    /**
     * The feature id for the '<em><b>Attacks</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACKER_SPECIFICATION__ATTACKS = 1;

    /**
     * The feature id for the '<em><b>Vulnerabilites</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACKER_SPECIFICATION__VULNERABILITES = 2;

    /**
     * The number of structural features of the '<em>Specification</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACKER_SPECIFICATION_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackContainerImpl <em>Attack Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackContainerImpl
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl#getAttackContainer()
     * @generated
     */
    int ATTACK_CONTAINER = 3;

    /**
     * The feature id for the '<em><b>Attack</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK_CONTAINER__ATTACK = 0;

    /**
     * The number of structural features of the '<em>Attack Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK_CONTAINER_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.VulnerabilityContainerImpl <em>Vulnerability Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.VulnerabilityContainerImpl
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl#getVulnerabilityContainer()
     * @generated
     */
    int VULNERABILITY_CONTAINER = 4;

    /**
     * The feature id for the '<em><b>Vulnerability</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VULNERABILITY_CONTAINER__VULNERABILITY = 0;

    /**
     * The number of structural features of the '<em>Vulnerability Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VULNERABILITY_CONTAINER_FEATURE_COUNT = 1;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerContainer <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Container</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerContainer
     * @generated
     */
    EClass getAttackerContainer();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerContainer#getAttacker <em>Attacker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attacker</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerContainer#getAttacker()
     * @see #getAttackerContainer()
     * @generated
     */
    EReference getAttackerContainer_Attacker();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker <em>Attacker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attacker</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker
     * @generated
     */
    EClass getAttacker();

    /**
     * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#getCapabilities <em>Capabilities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Capabilities</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#getCapabilities()
     * @see #getAttacker()
     * @generated
     */
    EReference getAttacker_Capabilities();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification <em>Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Specification</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification
     * @generated
     */
    EClass getAttackerSpecification();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getAttackers <em>Attackers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Attackers</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getAttackers()
     * @see #getAttackerSpecification()
     * @generated
     */
    EReference getAttackerSpecification_Attackers();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getAttacks <em>Attacks</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Attacks</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getAttacks()
     * @see #getAttackerSpecification()
     * @generated
     */
    EReference getAttackerSpecification_Attacks();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getVulnerabilites <em>Vulnerabilites</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Vulnerabilites</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getVulnerabilites()
     * @see #getAttackerSpecification()
     * @generated
     */
    EReference getAttackerSpecification_Vulnerabilites();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackContainer <em>Attack Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attack Container</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackContainer
     * @generated
     */
    EClass getAttackContainer();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackContainer#getAttack <em>Attack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attack</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackContainer#getAttack()
     * @see #getAttackContainer()
     * @generated
     */
    EReference getAttackContainer_Attack();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.VulnerabilityContainer <em>Vulnerability Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Vulnerability Container</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.VulnerabilityContainer
     * @generated
     */
    EClass getVulnerabilityContainer();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.VulnerabilityContainer#getVulnerability <em>Vulnerability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Vulnerability</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.VulnerabilityContainer#getVulnerability()
     * @see #getVulnerabilityContainer()
     * @generated
     */
    EReference getVulnerabilityContainer_Vulnerability();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    AttackerFactory getAttackerFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerContainerImpl <em>Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerContainerImpl
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl#getAttackerContainer()
         * @generated
         */
        EClass ATTACKER_CONTAINER = eINSTANCE.getAttackerContainer();

        /**
         * The meta object literal for the '<em><b>Attacker</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTACKER_CONTAINER__ATTACKER = eINSTANCE.getAttackerContainer_Attacker();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerImpl <em>Attacker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerImpl
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl#getAttacker()
         * @generated
         */
        EClass ATTACKER = eINSTANCE.getAttacker();

        /**
         * The meta object literal for the '<em><b>Capabilities</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTACKER__CAPABILITIES = eINSTANCE.getAttacker_Capabilities();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerSpecificationImpl <em>Specification</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerSpecificationImpl
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl#getAttackerSpecification()
         * @generated
         */
        EClass ATTACKER_SPECIFICATION = eINSTANCE.getAttackerSpecification();

        /**
         * The meta object literal for the '<em><b>Attackers</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTACKER_SPECIFICATION__ATTACKERS = eINSTANCE.getAttackerSpecification_Attackers();

        /**
         * The meta object literal for the '<em><b>Attacks</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTACKER_SPECIFICATION__ATTACKS = eINSTANCE.getAttackerSpecification_Attacks();

        /**
         * The meta object literal for the '<em><b>Vulnerabilites</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTACKER_SPECIFICATION__VULNERABILITES = eINSTANCE.getAttackerSpecification_Vulnerabilites();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackContainerImpl <em>Attack Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackContainerImpl
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl#getAttackContainer()
         * @generated
         */
        EClass ATTACK_CONTAINER = eINSTANCE.getAttackContainer();

        /**
         * The meta object literal for the '<em><b>Attack</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTACK_CONTAINER__ATTACK = eINSTANCE.getAttackContainer_Attack();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.VulnerabilityContainerImpl <em>Vulnerability Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.VulnerabilityContainerImpl
         * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl#getVulnerabilityContainer()
         * @generated
         */
        EClass VULNERABILITY_CONTAINER = eINSTANCE.getVulnerabilityContainer();

        /**
         * The meta object literal for the '<em><b>Vulnerability</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VULNERABILITY_CONTAINER__VULNERABILITY = eINSTANCE.getVulnerabilityContainer_Vulnerability();

    }

} //AttackerPackage
