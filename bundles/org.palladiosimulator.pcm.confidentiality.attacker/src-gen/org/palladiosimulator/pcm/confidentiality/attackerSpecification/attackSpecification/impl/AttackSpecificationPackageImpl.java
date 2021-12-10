/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Attack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackCategory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationFactory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackVector;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AvailabilityImpact;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEAttack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEVulnerability;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEAttack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEBasedVulnerability;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEVulnerability;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CategoryAttack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.ConfidentialityImpact;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.IntegrityImpact;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Privileges;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Role;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PcmIntegrationPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;

import org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttackSpecificationPackageImpl extends EPackageImpl implements AttackSpecificationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vulnerabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryAttackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cveVulnerabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cweidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cweAttackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cveAttackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cveidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cweVulnerabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cweBasedVulnerabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attackVectorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum privilegesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum confidentialityImpactEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum integrityImpactEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum availabilityImpactEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AttackSpecificationPackageImpl() {
		super(eNS_URI, AttackSpecificationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AttackSpecificationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AttackSpecificationPackage init() {
		if (isInited)
			return (AttackSpecificationPackage) EPackage.Registry.INSTANCE
					.getEPackage(AttackSpecificationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAttackSpecificationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AttackSpecificationPackageImpl theAttackSpecificationPackage = registeredAttackSpecificationPackage instanceof AttackSpecificationPackageImpl
				? (AttackSpecificationPackageImpl) registeredAttackSpecificationPackage
				: new AttackSpecificationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ContextPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AttackerPackage.eNS_URI);
		AttackerPackageImpl theAttackerPackage = (AttackerPackageImpl) (registeredPackage instanceof AttackerPackageImpl
				? registeredPackage
				: AttackerPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PcmIntegrationPackage.eNS_URI);
		PcmIntegrationPackageImpl thePcmIntegrationPackage = (PcmIntegrationPackageImpl) (registeredPackage instanceof PcmIntegrationPackageImpl
				? registeredPackage
				: PcmIntegrationPackage.eINSTANCE);

		// Create package meta-data objects
		theAttackSpecificationPackage.createPackageContents();
		theAttackerPackage.createPackageContents();
		thePcmIntegrationPackage.createPackageContents();

		// Initialize created meta-data
		theAttackSpecificationPackage.initializePackageContents();
		theAttackerPackage.initializePackageContents();
		thePcmIntegrationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAttackSpecificationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AttackSpecificationPackage.eNS_URI, theAttackSpecificationPackage);
		return theAttackSpecificationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttack() {
		return attackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVulnerability() {
		return vulnerabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVulnerability_AttackVector() {
		return (EAttribute) vulnerabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVulnerability_Privileges() {
		return (EAttribute) vulnerabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVulnerability_RequiredCredentials() {
		return (EReference) vulnerabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVulnerability_ConfidentialityImpact() {
		return (EAttribute) vulnerabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVulnerability_IntegrityImpact() {
		return (EAttribute) vulnerabilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVulnerability_AvailabilityImpact() {
		return (EAttribute) vulnerabilityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVulnerability_GainedAttributes() {
		return (EReference) vulnerabilityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVulnerability_TakeOver() {
		return (EAttribute) vulnerabilityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVulnerability_Role() {
		return (EReference) vulnerabilityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryAttack() {
		return categoryAttackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryAttack_Category() {
		return (EReference) categoryAttackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCVEVulnerability() {
		return cveVulnerabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCVEVulnerability_CveID() {
		return (EReference) cveVulnerabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCWEID() {
		return cweidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCWEID_CweID() {
		return (EAttribute) cweidEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWEID_Children() {
		return (EReference) cweidEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWEID_Parents() {
		return (EReference) cweidEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttackCategory() {
		return attackCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCWEAttack() {
		return cweAttackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCVEAttack() {
		return cveAttackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCVEID() {
		return cveidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCVEID_CveID() {
		return (EAttribute) cveidEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCWEVulnerability() {
		return cweVulnerabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCWEBasedVulnerability() {
		return cweBasedVulnerabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWEBasedVulnerability_CweID() {
		return (EReference) cweBasedVulnerabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttackVector() {
		return attackVectorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrivileges() {
		return privilegesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConfidentialityImpact() {
		return confidentialityImpactEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntegrityImpact() {
		return integrityImpactEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAvailabilityImpact() {
		return availabilityImpactEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackSpecificationFactory getAttackSpecificationFactory() {
		return (AttackSpecificationFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		attackEClass = createEClass(ATTACK);

		vulnerabilityEClass = createEClass(VULNERABILITY);
		createEAttribute(vulnerabilityEClass, VULNERABILITY__ATTACK_VECTOR);
		createEAttribute(vulnerabilityEClass, VULNERABILITY__PRIVILEGES);
		createEReference(vulnerabilityEClass, VULNERABILITY__REQUIRED_CREDENTIALS);
		createEAttribute(vulnerabilityEClass, VULNERABILITY__CONFIDENTIALITY_IMPACT);
		createEAttribute(vulnerabilityEClass, VULNERABILITY__INTEGRITY_IMPACT);
		createEAttribute(vulnerabilityEClass, VULNERABILITY__AVAILABILITY_IMPACT);
		createEReference(vulnerabilityEClass, VULNERABILITY__GAINED_ATTRIBUTES);
		createEAttribute(vulnerabilityEClass, VULNERABILITY__TAKE_OVER);
		createEReference(vulnerabilityEClass, VULNERABILITY__ROLE);

		categoryAttackEClass = createEClass(CATEGORY_ATTACK);
		createEReference(categoryAttackEClass, CATEGORY_ATTACK__CATEGORY);

		cveVulnerabilityEClass = createEClass(CVE_VULNERABILITY);
		createEReference(cveVulnerabilityEClass, CVE_VULNERABILITY__CVE_ID);

		cweidEClass = createEClass(CWEID);
		createEAttribute(cweidEClass, CWEID__CWE_ID);
		createEReference(cweidEClass, CWEID__CHILDREN);
		createEReference(cweidEClass, CWEID__PARENTS);

		attackCategoryEClass = createEClass(ATTACK_CATEGORY);

		cweAttackEClass = createEClass(CWE_ATTACK);

		cveAttackEClass = createEClass(CVE_ATTACK);

		cveidEClass = createEClass(CVEID);
		createEAttribute(cveidEClass, CVEID__CVE_ID);

		cweVulnerabilityEClass = createEClass(CWE_VULNERABILITY);

		cweBasedVulnerabilityEClass = createEClass(CWE_BASED_VULNERABILITY);
		createEReference(cweBasedVulnerabilityEClass, CWE_BASED_VULNERABILITY__CWE_ID);

		roleEClass = createEClass(ROLE);

		// Create enums
		attackVectorEEnum = createEEnum(ATTACK_VECTOR);
		privilegesEEnum = createEEnum(PRIVILEGES);
		confidentialityImpactEEnum = createEEnum(CONFIDENTIALITY_IMPACT);
		integrityImpactEEnum = createEEnum(INTEGRITY_IMPACT);
		availabilityImpactEEnum = createEEnum(AVAILABILITY_IMPACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EntityPackage theEntityPackage = (EntityPackage) EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);
		PolicyPackage thePolicyPackage = (PolicyPackage) EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
		SystemPackage theSystemPackage = (SystemPackage) EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter categoryAttackEClass_T = addETypeParameter(categoryAttackEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getAttackCategory());
		categoryAttackEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		attackEClass.getESuperTypes().add(theEntityPackage.getEntity());
		vulnerabilityEClass.getESuperTypes().add(theEntityPackage.getEntity());
		categoryAttackEClass.getESuperTypes().add(this.getAttack());
		cveVulnerabilityEClass.getESuperTypes().add(this.getCWEBasedVulnerability());
		cveVulnerabilityEClass.getESuperTypes().add(this.getVulnerability());
		cweidEClass.getESuperTypes().add(this.getAttackCategory());
		attackCategoryEClass.getESuperTypes().add(theEntityPackage.getNamedElement());
		g1 = createEGenericType(this.getCategoryAttack());
		EGenericType g2 = createEGenericType(this.getCWEID());
		g1.getETypeArguments().add(g2);
		cweAttackEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCategoryAttack());
		g2 = createEGenericType(this.getCVEID());
		g1.getETypeArguments().add(g2);
		cveAttackEClass.getEGenericSuperTypes().add(g1);
		cveidEClass.getESuperTypes().add(this.getAttackCategory());
		cweVulnerabilityEClass.getESuperTypes().add(this.getVulnerability());
		cweVulnerabilityEClass.getESuperTypes().add(this.getCWEBasedVulnerability());
		roleEClass.getESuperTypes().add(theEntityPackage.getEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(attackEClass, Attack.class, "Attack", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(attackEClass, ecorePackage.getEBoolean(), "canExploit", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getVulnerability(), "vulnerability", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getBoolean(), "authentificated", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAttackVector(), "attackVector", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vulnerabilityEClass, Vulnerability.class, "Vulnerability", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVulnerability_AttackVector(), this.getAttackVector(), "attackVector", "", 1, 1,
				Vulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVulnerability_Privileges(), this.getPrivileges(), "privileges", "None", 1, 1,
				Vulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getVulnerability_RequiredCredentials(), thePolicyPackage.getPolicy(), null,
				"requiredCredentials", null, 0, 1, Vulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVulnerability_ConfidentialityImpact(), this.getConfidentialityImpact(),
				"confidentialityImpact", "None", 1, 1, Vulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVulnerability_IntegrityImpact(), this.getIntegrityImpact(), "integrityImpact", "None", 1, 1,
				Vulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVulnerability_AvailabilityImpact(), this.getAvailabilityImpact(), "availabilityImpact",
				"None", 1, 1, Vulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVulnerability_GainedAttributes(), theSystemPackage.getUsageSpecification(), null,
				"gainedAttributes", null, 0, -1, Vulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVulnerability_TakeOver(), ecorePackage.getEBoolean(), "takeOver", null, 0, 1,
				Vulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getVulnerability_Role(), this.getRole(), null, "role", null, 0, -1, Vulnerability.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryAttackEClass, CategoryAttack.class, "CategoryAttack", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(categoryAttackEClass_T);
		initEReference(getCategoryAttack_Category(), g1, null, "category", null, 1, 1, CategoryAttack.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cveVulnerabilityEClass, CVEVulnerability.class, "CVEVulnerability", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCVEVulnerability_CveID(), this.getCVEID(), null, "cveID", null, 1, 1, CVEVulnerability.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cweidEClass,
				org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID.class,
				"CWEID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCWEID_CweID(), ecorePackage.getEInt(), "cweID", null, 0, 1,
				org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWEID_Children(), this.getCWEID(), this.getCWEID_Parents(), "children", null, 0, -1,
				org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWEID_Parents(), this.getCWEID(), this.getCWEID_Children(), "parents", null, 0, -1,
				org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attackCategoryEClass, AttackCategory.class, "AttackCategory", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(attackCategoryEClass, theEcorePackage.getEBoolean(), "equalAttackType", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getAttackCategory(), "category", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cweAttackEClass, CWEAttack.class, "CWEAttack", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(cveAttackEClass, CVEAttack.class, "CVEAttack", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(cveidEClass,
				org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEID.class,
				"CVEID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCVEID_CveID(), ecorePackage.getEString(), "cveID", null, 0, 1,
				org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEID.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cweVulnerabilityEClass, CWEVulnerability.class, "CWEVulnerability", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(cweBasedVulnerabilityEClass, CWEBasedVulnerability.class, "CWEBasedVulnerability", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCWEBasedVulnerability_CweID(), this.getCWEID(), null, "cweID", null, 1, -1,
				CWEBasedVulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(attackVectorEEnum, AttackVector.class, "AttackVector");
		addEEnumLiteral(attackVectorEEnum, AttackVector.NETWORK);
		addEEnumLiteral(attackVectorEEnum, AttackVector.ADJACENT_NETWORK);
		addEEnumLiteral(attackVectorEEnum, AttackVector.LOCAL);

		initEEnum(privilegesEEnum, Privileges.class, "Privileges");
		addEEnumLiteral(privilegesEEnum, Privileges.NONE);
		addEEnumLiteral(privilegesEEnum, Privileges.LOW);
		addEEnumLiteral(privilegesEEnum, Privileges.SPECIAL);

		initEEnum(confidentialityImpactEEnum, ConfidentialityImpact.class, "ConfidentialityImpact");
		addEEnumLiteral(confidentialityImpactEEnum, ConfidentialityImpact.HIGH);
		addEEnumLiteral(confidentialityImpactEEnum, ConfidentialityImpact.LOW);
		addEEnumLiteral(confidentialityImpactEEnum, ConfidentialityImpact.NONE);

		initEEnum(integrityImpactEEnum, IntegrityImpact.class, "IntegrityImpact");
		addEEnumLiteral(integrityImpactEEnum, IntegrityImpact.HIGH);
		addEEnumLiteral(integrityImpactEEnum, IntegrityImpact.LOW);
		addEEnumLiteral(integrityImpactEEnum, IntegrityImpact.NONE);

		initEEnum(availabilityImpactEEnum, AvailabilityImpact.class, "AvailabilityImpact");
		addEEnumLiteral(availabilityImpactEEnum, AvailabilityImpact.HIGH);
		addEEnumLiteral(availabilityImpactEEnum, AvailabilityImpact.LOW);
		addEEnumLiteral(availabilityImpactEEnum, AvailabilityImpact.NONE);
	}

} //AttackSpecificationPackageImpl
