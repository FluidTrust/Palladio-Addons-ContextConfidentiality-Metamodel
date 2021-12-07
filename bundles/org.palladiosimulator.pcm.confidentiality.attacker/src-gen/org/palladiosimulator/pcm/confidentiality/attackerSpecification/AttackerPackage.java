/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;

import org.eclipse.emf.ecore.EAttribute;
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
public interface AttackerPackage extends EPackage
{
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
	AttackerPackage eINSTANCE = org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl.init();

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
	 * The feature id for the '<em><b>Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER__ATTACKS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compromised Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER__COMPROMISED_COMPONENTS = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compromised Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER__COMPROMISED_RESOURCES = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compromised Linking Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER__COMPROMISED_LINKING_RESOURCES = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER__CREDENTIALS = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exploit Context Providers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER__EXPLOIT_CONTEXT_PROVIDERS = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Attacker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 6;

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
	 * The feature id for the '<em><b>Categoryspecification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_SPECIFICATION__CATEGORYSPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Systemintegration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_SPECIFICATION__SYSTEMINTEGRATION = 4;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_SPECIFICATION_FEATURE_COUNT = 5;

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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.CategorySpecificationImpl <em>Category Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.CategorySpecificationImpl
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl#getCategorySpecification()
	 * @generated
	 */
	int CATEGORY_SPECIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_SPECIFICATION__CATEGORIES = 0;

	/**
	 * The number of structural features of the '<em>Category Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerSystemSpecificationContainerImpl <em>System Specification Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerSystemSpecificationContainerImpl
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl#getAttackerSystemSpecificationContainer()
	 * @generated
	 */
	int ATTACKER_SYSTEM_SPECIFICATION_CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>Vulnerabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_SYSTEM_SPECIFICATION_CONTAINER__VULNERABILITIES = 0;

	/**
	 * The number of structural features of the '<em>System Specification Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_SYSTEM_SPECIFICATION_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.DatamodelAttackerImpl <em>Datamodel Attacker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.DatamodelAttackerImpl
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl#getDatamodelAttacker()
	 * @generated
	 */
	int DATAMODEL_ATTACKER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAMODEL_ATTACKER__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAMODEL_ATTACKER__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAMODEL_ATTACKER__DATA_TYPE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAMODEL_ATTACKER__REFERENCE_NAME = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAMODEL_ATTACKER__SOURCE = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAMODEL_ATTACKER__METHOD = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Datamodel Attacker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAMODEL_ATTACKER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 4;


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
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#getAttacks <em>Attacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attacks</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#getAttacks()
	 * @see #getAttacker()
	 * @generated
	 */
	EReference getAttacker_Attacks();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#getCompromisedComponents <em>Compromised Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compromised Components</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#getCompromisedComponents()
	 * @see #getAttacker()
	 * @generated
	 */
	EReference getAttacker_CompromisedComponents();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#getCompromisedResources <em>Compromised Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compromised Resources</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#getCompromisedResources()
	 * @see #getAttacker()
	 * @generated
	 */
	EReference getAttacker_CompromisedResources();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#getCompromisedLinkingResources <em>Compromised Linking Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compromised Linking Resources</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#getCompromisedLinkingResources()
	 * @see #getAttacker()
	 * @generated
	 */
	EReference getAttacker_CompromisedLinkingResources();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Credentials</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#getCredentials()
	 * @see #getAttacker()
	 * @generated
	 */
	EReference getAttacker_Credentials();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#isExploitContextProviders <em>Exploit Context Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exploit Context Providers</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#isExploitContextProviders()
	 * @see #getAttacker()
	 * @generated
	 */
	EAttribute getAttacker_ExploitContextProviders();

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
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getCategoryspecification <em>Categoryspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Categoryspecification</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getCategoryspecification()
	 * @see #getAttackerSpecification()
	 * @generated
	 */
	EReference getAttackerSpecification_Categoryspecification();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getSystemintegration <em>Systemintegration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Systemintegration</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getSystemintegration()
	 * @see #getAttackerSpecification()
	 * @generated
	 */
	EReference getAttackerSpecification_Systemintegration();

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
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.CategorySpecification <em>Category Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Specification</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.CategorySpecification
	 * @generated
	 */
	EClass getCategorySpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.CategorySpecification#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.CategorySpecification#getCategories()
	 * @see #getCategorySpecification()
	 * @generated
	 */
	EReference getCategorySpecification_Categories();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSystemSpecificationContainer <em>System Specification Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Specification Container</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSystemSpecificationContainer
	 * @generated
	 */
	EClass getAttackerSystemSpecificationContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSystemSpecificationContainer#getVulnerabilities <em>Vulnerabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vulnerabilities</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSystemSpecificationContainer#getVulnerabilities()
	 * @see #getAttackerSystemSpecificationContainer()
	 * @generated
	 */
	EReference getAttackerSystemSpecificationContainer_Vulnerabilities();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker <em>Datamodel Attacker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datamodel Attacker</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker
	 * @generated
	 */
	EClass getDatamodelAttacker();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getDataType()
	 * @see #getDatamodelAttacker()
	 * @generated
	 */
	EReference getDatamodelAttacker_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getReferenceName <em>Reference Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Name</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getReferenceName()
	 * @see #getDatamodelAttacker()
	 * @generated
	 */
	EAttribute getDatamodelAttacker_ReferenceName();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getSource()
	 * @see #getDatamodelAttacker()
	 * @generated
	 */
	EReference getDatamodelAttacker_Source();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getMethod()
	 * @see #getDatamodelAttacker()
	 * @generated
	 */
	EReference getDatamodelAttacker_Method();

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
	interface Literals
	{
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
		 * The meta object literal for the '<em><b>Attacks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACKER__ATTACKS = eINSTANCE.getAttacker_Attacks();

		/**
		 * The meta object literal for the '<em><b>Compromised Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACKER__COMPROMISED_COMPONENTS = eINSTANCE.getAttacker_CompromisedComponents();

		/**
		 * The meta object literal for the '<em><b>Compromised Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACKER__COMPROMISED_RESOURCES = eINSTANCE.getAttacker_CompromisedResources();

		/**
		 * The meta object literal for the '<em><b>Compromised Linking Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACKER__COMPROMISED_LINKING_RESOURCES = eINSTANCE.getAttacker_CompromisedLinkingResources();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACKER__CREDENTIALS = eINSTANCE.getAttacker_Credentials();

		/**
		 * The meta object literal for the '<em><b>Exploit Context Providers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKER__EXPLOIT_CONTEXT_PROVIDERS = eINSTANCE.getAttacker_ExploitContextProviders();

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
		 * The meta object literal for the '<em><b>Categoryspecification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACKER_SPECIFICATION__CATEGORYSPECIFICATION = eINSTANCE.getAttackerSpecification_Categoryspecification();

		/**
		 * The meta object literal for the '<em><b>Systemintegration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACKER_SPECIFICATION__SYSTEMINTEGRATION = eINSTANCE.getAttackerSpecification_Systemintegration();

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

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.CategorySpecificationImpl <em>Category Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.CategorySpecificationImpl
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl#getCategorySpecification()
		 * @generated
		 */
		EClass CATEGORY_SPECIFICATION = eINSTANCE.getCategorySpecification();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_SPECIFICATION__CATEGORIES = eINSTANCE.getCategorySpecification_Categories();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerSystemSpecificationContainerImpl <em>System Specification Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerSystemSpecificationContainerImpl
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl#getAttackerSystemSpecificationContainer()
		 * @generated
		 */
		EClass ATTACKER_SYSTEM_SPECIFICATION_CONTAINER = eINSTANCE.getAttackerSystemSpecificationContainer();

		/**
		 * The meta object literal for the '<em><b>Vulnerabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACKER_SYSTEM_SPECIFICATION_CONTAINER__VULNERABILITIES = eINSTANCE.getAttackerSystemSpecificationContainer_Vulnerabilities();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.DatamodelAttackerImpl <em>Datamodel Attacker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.DatamodelAttackerImpl
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl#getDatamodelAttacker()
		 * @generated
		 */
		EClass DATAMODEL_ATTACKER = eINSTANCE.getDatamodelAttacker();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATAMODEL_ATTACKER__DATA_TYPE = eINSTANCE.getDatamodelAttacker_DataType();

		/**
		 * The meta object literal for the '<em><b>Reference Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAMODEL_ATTACKER__REFERENCE_NAME = eINSTANCE.getDatamodelAttacker_ReferenceName();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATAMODEL_ATTACKER__SOURCE = eINSTANCE.getDatamodelAttacker_Source();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATAMODEL_ATTACKER__METHOD = eINSTANCE.getDatamodelAttacker_Method();

	}

} //AttackerPackage
