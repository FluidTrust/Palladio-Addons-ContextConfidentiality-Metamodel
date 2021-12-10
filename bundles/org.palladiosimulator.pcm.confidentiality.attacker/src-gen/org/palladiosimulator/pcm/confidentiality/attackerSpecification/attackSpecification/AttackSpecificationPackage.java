/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification;

import org.eclipse.emf.ecore.EAttribute;
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
	 * The number of structural features of the '<em>Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.VulnerabilityImpl <em>Vulnerability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.VulnerabilityImpl
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getVulnerability()
	 * @generated
	 */
	int VULNERABILITY = 1;

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
	 * The feature id for the '<em><b>Attack Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__ATTACK_VECTOR = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Privileges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__PRIVILEGES = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Credentials</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__REQUIRED_CREDENTIALS = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Confidentiality Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__CONFIDENTIALITY_IMPACT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Integrity Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__INTEGRITY_IMPACT = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Availability Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__AVAILABILITY_IMPACT = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gained Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__GAINED_ATTRIBUTES = EntityPackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Take Over</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__TAKE_OVER = EntityPackage.ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__ROLE = EntityPackage.ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CategoryAttackImpl <em>Category Attack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CategoryAttackImpl
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCategoryAttack()
	 * @generated
	 */
	int CATEGORY_ATTACK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_ATTACK__ID = ATTACK__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_ATTACK__ENTITY_NAME = ATTACK__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_ATTACK__CATEGORY = ATTACK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Category Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_ATTACK_FEATURE_COUNT = ATTACK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEBasedVulnerability <em>CWE Based Vulnerability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEBasedVulnerability
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCWEBasedVulnerability()
	 * @generated
	 */
	int CWE_BASED_VULNERABILITY = 10;

	/**
	 * The feature id for the '<em><b>Cwe ID</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_BASED_VULNERABILITY__CWE_ID = 0;

	/**
	 * The number of structural features of the '<em>CWE Based Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_BASED_VULNERABILITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CVEVulnerabilityImpl <em>CVE Vulnerability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CVEVulnerabilityImpl
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCVEVulnerability()
	 * @generated
	 */
	int CVE_VULNERABILITY = 3;

	/**
	 * The feature id for the '<em><b>Cwe ID</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_VULNERABILITY__CWE_ID = CWE_BASED_VULNERABILITY__CWE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_VULNERABILITY__ID = CWE_BASED_VULNERABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_VULNERABILITY__ENTITY_NAME = CWE_BASED_VULNERABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attack Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_VULNERABILITY__ATTACK_VECTOR = CWE_BASED_VULNERABILITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Privileges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_VULNERABILITY__PRIVILEGES = CWE_BASED_VULNERABILITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required Credentials</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_VULNERABILITY__REQUIRED_CREDENTIALS = CWE_BASED_VULNERABILITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Confidentiality Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_VULNERABILITY__CONFIDENTIALITY_IMPACT = CWE_BASED_VULNERABILITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Integrity Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_VULNERABILITY__INTEGRITY_IMPACT = CWE_BASED_VULNERABILITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Availability Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_VULNERABILITY__AVAILABILITY_IMPACT = CWE_BASED_VULNERABILITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gained Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_VULNERABILITY__GAINED_ATTRIBUTES = CWE_BASED_VULNERABILITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Take Over</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_VULNERABILITY__TAKE_OVER = CWE_BASED_VULNERABILITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_VULNERABILITY__ROLE = CWE_BASED_VULNERABILITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Cve ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_VULNERABILITY__CVE_ID = CWE_BASED_VULNERABILITY_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>CVE Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_VULNERABILITY_FEATURE_COUNT = CWE_BASED_VULNERABILITY_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackCategoryImpl <em>Attack Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackCategoryImpl
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getAttackCategory()
	 * @generated
	 */
	int ATTACK_CATEGORY = 5;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CATEGORY__ENTITY_NAME = EntityPackage.NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Attack Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CATEGORY_FEATURE_COUNT = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CWEIDImpl <em>CWEID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CWEIDImpl
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCWEID()
	 * @generated
	 */
	int CWEID = 4;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWEID__ENTITY_NAME = ATTACK_CATEGORY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Cwe ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWEID__CWE_ID = ATTACK_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWEID__CHILDREN = ATTACK_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWEID__PARENTS = ATTACK_CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CWEID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWEID_FEATURE_COUNT = ATTACK_CATEGORY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CWEAttackImpl <em>CWE Attack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CWEAttackImpl
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCWEAttack()
	 * @generated
	 */
	int CWE_ATTACK = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_ATTACK__ID = CATEGORY_ATTACK__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_ATTACK__ENTITY_NAME = CATEGORY_ATTACK__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_ATTACK__CATEGORY = CATEGORY_ATTACK__CATEGORY;

	/**
	 * The number of structural features of the '<em>CWE Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_ATTACK_FEATURE_COUNT = CATEGORY_ATTACK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CVEAttackImpl <em>CVE Attack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CVEAttackImpl
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCVEAttack()
	 * @generated
	 */
	int CVE_ATTACK = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_ATTACK__ID = CATEGORY_ATTACK__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_ATTACK__ENTITY_NAME = CATEGORY_ATTACK__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_ATTACK__CATEGORY = CATEGORY_ATTACK__CATEGORY;

	/**
	 * The number of structural features of the '<em>CVE Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_ATTACK_FEATURE_COUNT = CATEGORY_ATTACK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CVEIDImpl <em>CVEID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CVEIDImpl
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCVEID()
	 * @generated
	 */
	int CVEID = 8;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVEID__ENTITY_NAME = ATTACK_CATEGORY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Cve ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVEID__CVE_ID = ATTACK_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CVEID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVEID_FEATURE_COUNT = ATTACK_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CWEVulnerabilityImpl <em>CWE Vulnerability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CWEVulnerabilityImpl
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCWEVulnerability()
	 * @generated
	 */
	int CWE_VULNERABILITY = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_VULNERABILITY__ID = VULNERABILITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_VULNERABILITY__ENTITY_NAME = VULNERABILITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Attack Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_VULNERABILITY__ATTACK_VECTOR = VULNERABILITY__ATTACK_VECTOR;

	/**
	 * The feature id for the '<em><b>Privileges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_VULNERABILITY__PRIVILEGES = VULNERABILITY__PRIVILEGES;

	/**
	 * The feature id for the '<em><b>Required Credentials</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_VULNERABILITY__REQUIRED_CREDENTIALS = VULNERABILITY__REQUIRED_CREDENTIALS;

	/**
	 * The feature id for the '<em><b>Confidentiality Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_VULNERABILITY__CONFIDENTIALITY_IMPACT = VULNERABILITY__CONFIDENTIALITY_IMPACT;

	/**
	 * The feature id for the '<em><b>Integrity Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_VULNERABILITY__INTEGRITY_IMPACT = VULNERABILITY__INTEGRITY_IMPACT;

	/**
	 * The feature id for the '<em><b>Availability Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_VULNERABILITY__AVAILABILITY_IMPACT = VULNERABILITY__AVAILABILITY_IMPACT;

	/**
	 * The feature id for the '<em><b>Gained Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_VULNERABILITY__GAINED_ATTRIBUTES = VULNERABILITY__GAINED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Take Over</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_VULNERABILITY__TAKE_OVER = VULNERABILITY__TAKE_OVER;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_VULNERABILITY__ROLE = VULNERABILITY__ROLE;

	/**
	 * The feature id for the '<em><b>Cwe ID</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_VULNERABILITY__CWE_ID = VULNERABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CWE Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_VULNERABILITY_FEATURE_COUNT = VULNERABILITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.RoleImpl
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackVector <em>Attack Vector</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackVector
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getAttackVector()
	 * @generated
	 */
	int ATTACK_VECTOR = 12;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Privileges <em>Privileges</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Privileges
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getPrivileges()
	 * @generated
	 */
	int PRIVILEGES = 13;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.ConfidentialityImpact <em>Confidentiality Impact</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.ConfidentialityImpact
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getConfidentialityImpact()
	 * @generated
	 */
	int CONFIDENTIALITY_IMPACT = 14;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.IntegrityImpact <em>Integrity Impact</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.IntegrityImpact
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getIntegrityImpact()
	 * @generated
	 */
	int INTEGRITY_IMPACT = 15;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AvailabilityImpact <em>Availability Impact</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AvailabilityImpact
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getAvailabilityImpact()
	 * @generated
	 */
	int AVAILABILITY_IMPACT = 16;

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
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability <em>Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vulnerability</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability
	 * @generated
	 */
	EClass getVulnerability();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability#getAttackVector <em>Attack Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attack Vector</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability#getAttackVector()
	 * @see #getVulnerability()
	 * @generated
	 */
	EAttribute getVulnerability_AttackVector();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability#getPrivileges <em>Privileges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Privileges</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability#getPrivileges()
	 * @see #getVulnerability()
	 * @generated
	 */
	EAttribute getVulnerability_Privileges();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability#getRequiredCredentials <em>Required Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Credentials</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability#getRequiredCredentials()
	 * @see #getVulnerability()
	 * @generated
	 */
	EReference getVulnerability_RequiredCredentials();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability#getConfidentialityImpact <em>Confidentiality Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidentiality Impact</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability#getConfidentialityImpact()
	 * @see #getVulnerability()
	 * @generated
	 */
	EAttribute getVulnerability_ConfidentialityImpact();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability#getIntegrityImpact <em>Integrity Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integrity Impact</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability#getIntegrityImpact()
	 * @see #getVulnerability()
	 * @generated
	 */
	EAttribute getVulnerability_IntegrityImpact();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability#getAvailabilityImpact <em>Availability Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Impact</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability#getAvailabilityImpact()
	 * @see #getVulnerability()
	 * @generated
	 */
	EAttribute getVulnerability_AvailabilityImpact();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability#getGainedAttributes <em>Gained Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gained Attributes</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability#getGainedAttributes()
	 * @see #getVulnerability()
	 * @generated
	 */
	EReference getVulnerability_GainedAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability#isTakeOver <em>Take Over</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Take Over</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability#isTakeOver()
	 * @see #getVulnerability()
	 * @generated
	 */
	EAttribute getVulnerability_TakeOver();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability#getRole()
	 * @see #getVulnerability()
	 * @generated
	 */
	EReference getVulnerability_Role();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CategoryAttack <em>Category Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Attack</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CategoryAttack
	 * @generated
	 */
	EClass getCategoryAttack();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CategoryAttack#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CategoryAttack#getCategory()
	 * @see #getCategoryAttack()
	 * @generated
	 */
	EReference getCategoryAttack_Category();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEVulnerability <em>CVE Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CVE Vulnerability</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEVulnerability
	 * @generated
	 */
	EClass getCVEVulnerability();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEVulnerability#getCveID <em>Cve ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cve ID</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEVulnerability#getCveID()
	 * @see #getCVEVulnerability()
	 * @generated
	 */
	EReference getCVEVulnerability_CveID();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID <em>CWEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CWEID</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID
	 * @generated
	 */
	EClass getCWEID();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID#getCweID <em>Cwe ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cwe ID</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID#getCweID()
	 * @see #getCWEID()
	 * @generated
	 */
	EAttribute getCWEID_CweID();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID#getChildren()
	 * @see #getCWEID()
	 * @generated
	 */
	EReference getCWEID_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parents</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID#getParents()
	 * @see #getCWEID()
	 * @generated
	 */
	EReference getCWEID_Parents();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackCategory <em>Attack Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attack Category</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackCategory
	 * @generated
	 */
	EClass getAttackCategory();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEAttack <em>CWE Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CWE Attack</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEAttack
	 * @generated
	 */
	EClass getCWEAttack();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEAttack <em>CVE Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CVE Attack</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEAttack
	 * @generated
	 */
	EClass getCVEAttack();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEID <em>CVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CVEID</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEID
	 * @generated
	 */
	EClass getCVEID();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEID#getCveID <em>Cve ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cve ID</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEID#getCveID()
	 * @see #getCVEID()
	 * @generated
	 */
	EAttribute getCVEID_CveID();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEVulnerability <em>CWE Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CWE Vulnerability</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEVulnerability
	 * @generated
	 */
	EClass getCWEVulnerability();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEBasedVulnerability <em>CWE Based Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CWE Based Vulnerability</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEBasedVulnerability
	 * @generated
	 */
	EClass getCWEBasedVulnerability();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEBasedVulnerability#getCweID <em>Cwe ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cwe ID</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEBasedVulnerability#getCweID()
	 * @see #getCWEBasedVulnerability()
	 * @generated
	 */
	EReference getCWEBasedVulnerability_CweID();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackVector <em>Attack Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attack Vector</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackVector
	 * @generated
	 */
	EEnum getAttackVector();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Privileges <em>Privileges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Privileges</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Privileges
	 * @generated
	 */
	EEnum getPrivileges();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.ConfidentialityImpact <em>Confidentiality Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Confidentiality Impact</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.ConfidentialityImpact
	 * @generated
	 */
	EEnum getConfidentialityImpact();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.IntegrityImpact <em>Integrity Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Integrity Impact</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.IntegrityImpact
	 * @generated
	 */
	EEnum getIntegrityImpact();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AvailabilityImpact <em>Availability Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Availability Impact</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AvailabilityImpact
	 * @generated
	 */
	EEnum getAvailabilityImpact();

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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.VulnerabilityImpl <em>Vulnerability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.VulnerabilityImpl
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getVulnerability()
		 * @generated
		 */
		EClass VULNERABILITY = eINSTANCE.getVulnerability();

		/**
		 * The meta object literal for the '<em><b>Attack Vector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VULNERABILITY__ATTACK_VECTOR = eINSTANCE.getVulnerability_AttackVector();

		/**
		 * The meta object literal for the '<em><b>Privileges</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VULNERABILITY__PRIVILEGES = eINSTANCE.getVulnerability_Privileges();

		/**
		 * The meta object literal for the '<em><b>Required Credentials</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VULNERABILITY__REQUIRED_CREDENTIALS = eINSTANCE.getVulnerability_RequiredCredentials();

		/**
		 * The meta object literal for the '<em><b>Confidentiality Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VULNERABILITY__CONFIDENTIALITY_IMPACT = eINSTANCE.getVulnerability_ConfidentialityImpact();

		/**
		 * The meta object literal for the '<em><b>Integrity Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VULNERABILITY__INTEGRITY_IMPACT = eINSTANCE.getVulnerability_IntegrityImpact();

		/**
		 * The meta object literal for the '<em><b>Availability Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VULNERABILITY__AVAILABILITY_IMPACT = eINSTANCE.getVulnerability_AvailabilityImpact();

		/**
		 * The meta object literal for the '<em><b>Gained Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VULNERABILITY__GAINED_ATTRIBUTES = eINSTANCE.getVulnerability_GainedAttributes();

		/**
		 * The meta object literal for the '<em><b>Take Over</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VULNERABILITY__TAKE_OVER = eINSTANCE.getVulnerability_TakeOver();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VULNERABILITY__ROLE = eINSTANCE.getVulnerability_Role();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CategoryAttackImpl <em>Category Attack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CategoryAttackImpl
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCategoryAttack()
		 * @generated
		 */
		EClass CATEGORY_ATTACK = eINSTANCE.getCategoryAttack();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_ATTACK__CATEGORY = eINSTANCE.getCategoryAttack_Category();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CVEVulnerabilityImpl <em>CVE Vulnerability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CVEVulnerabilityImpl
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCVEVulnerability()
		 * @generated
		 */
		EClass CVE_VULNERABILITY = eINSTANCE.getCVEVulnerability();

		/**
		 * The meta object literal for the '<em><b>Cve ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CVE_VULNERABILITY__CVE_ID = eINSTANCE.getCVEVulnerability_CveID();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CWEIDImpl <em>CWEID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CWEIDImpl
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCWEID()
		 * @generated
		 */
		EClass CWEID = eINSTANCE.getCWEID();

		/**
		 * The meta object literal for the '<em><b>Cwe ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CWEID__CWE_ID = eINSTANCE.getCWEID_CweID();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWEID__CHILDREN = eINSTANCE.getCWEID_Children();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWEID__PARENTS = eINSTANCE.getCWEID_Parents();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackCategoryImpl <em>Attack Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackCategoryImpl
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getAttackCategory()
		 * @generated
		 */
		EClass ATTACK_CATEGORY = eINSTANCE.getAttackCategory();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CWEAttackImpl <em>CWE Attack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CWEAttackImpl
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCWEAttack()
		 * @generated
		 */
		EClass CWE_ATTACK = eINSTANCE.getCWEAttack();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CVEAttackImpl <em>CVE Attack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CVEAttackImpl
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCVEAttack()
		 * @generated
		 */
		EClass CVE_ATTACK = eINSTANCE.getCVEAttack();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CVEIDImpl <em>CVEID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CVEIDImpl
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCVEID()
		 * @generated
		 */
		EClass CVEID = eINSTANCE.getCVEID();

		/**
		 * The meta object literal for the '<em><b>Cve ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CVEID__CVE_ID = eINSTANCE.getCVEID_CveID();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CWEVulnerabilityImpl <em>CWE Vulnerability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CWEVulnerabilityImpl
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCWEVulnerability()
		 * @generated
		 */
		EClass CWE_VULNERABILITY = eINSTANCE.getCWEVulnerability();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEBasedVulnerability <em>CWE Based Vulnerability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEBasedVulnerability
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getCWEBasedVulnerability()
		 * @generated
		 */
		EClass CWE_BASED_VULNERABILITY = eINSTANCE.getCWEBasedVulnerability();

		/**
		 * The meta object literal for the '<em><b>Cwe ID</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWE_BASED_VULNERABILITY__CWE_ID = eINSTANCE.getCWEBasedVulnerability_CweID();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.RoleImpl
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackVector <em>Attack Vector</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackVector
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getAttackVector()
		 * @generated
		 */
		EEnum ATTACK_VECTOR = eINSTANCE.getAttackVector();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Privileges <em>Privileges</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Privileges
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getPrivileges()
		 * @generated
		 */
		EEnum PRIVILEGES = eINSTANCE.getPrivileges();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.ConfidentialityImpact <em>Confidentiality Impact</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.ConfidentialityImpact
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getConfidentialityImpact()
		 * @generated
		 */
		EEnum CONFIDENTIALITY_IMPACT = eINSTANCE.getConfidentialityImpact();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.IntegrityImpact <em>Integrity Impact</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.IntegrityImpact
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getIntegrityImpact()
		 * @generated
		 */
		EEnum INTEGRITY_IMPACT = eINSTANCE.getIntegrityImpact();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AvailabilityImpact <em>Availability Impact</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AvailabilityImpact
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl#getAvailabilityImpact()
		 * @generated
		 */
		EEnum AVAILABILITY_IMPACT = eINSTANCE.getAvailabilityImpact();

	}

} //AttackSpecificationPackage
