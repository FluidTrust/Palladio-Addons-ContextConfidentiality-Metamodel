/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.ActionTyp;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Attack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationFactory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CredentialAttack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CredentialVulnerability;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

import org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage;
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
    private EClass credentialAttackEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass credentialVulnerabilityEClass = null;

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
    private EEnum actionTypEEnum = null;

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
        IdentifierPackage.eINSTANCE.eClass();
        PcmPackage.eINSTANCE.eClass();
        ProbfunctionPackage.eINSTANCE.eClass();
        StoexPackage.eINSTANCE.eClass();
        UnitsPackage.eINSTANCE.eClass();
        EcorePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AttackerPackage.eNS_URI);
        AttackerPackageImpl theAttackerPackage = (AttackerPackageImpl) (registeredPackage instanceof AttackerPackageImpl
                ? registeredPackage
                : AttackerPackage.eINSTANCE);

        // Create package meta-data objects
        theAttackSpecificationPackage.createPackageContents();
        theAttackerPackage.createPackageContents();

        // Initialize created meta-data
        theAttackSpecificationPackage.initializePackageContents();
        theAttackerPackage.initializePackageContents();

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
    public EClass getCredentialAttack() {
        return credentialAttackEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCredentialAttack_Contexts() {
        return (EReference) credentialAttackEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCredentialAttack_Exploits() {
        return (EReference) credentialAttackEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCredentialVulnerability() {
        return credentialVulnerabilityEClass;
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
    public EEnum getActionTyp() {
        return actionTypEEnum;
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

        credentialAttackEClass = createEClass(CREDENTIAL_ATTACK);
        createEReference(credentialAttackEClass, CREDENTIAL_ATTACK__CONTEXTS);
        createEReference(credentialAttackEClass, CREDENTIAL_ATTACK__EXPLOITS);

        credentialVulnerabilityEClass = createEClass(CREDENTIAL_VULNERABILITY);

        vulnerabilityEClass = createEClass(VULNERABILITY);

        // Create enums
        actionTypEEnum = createEEnum(ACTION_TYP);
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
        ModelPackage theModelPackage = (ModelPackage) EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        attackEClass.getESuperTypes().add(theEntityPackage.getEntity());
        credentialAttackEClass.getESuperTypes().add(this.getAttack());
        credentialVulnerabilityEClass.getESuperTypes().add(this.getVulnerability());
        vulnerabilityEClass.getESuperTypes().add(theEntityPackage.getEntity());

        // Initialize classes and features; add operations and parameters
        initEClass(attackEClass, Attack.class, "Attack", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(credentialAttackEClass, CredentialAttack.class, "CredentialAttack", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCredentialAttack_Contexts(), theModelPackage.getContextAttribute(), null, "contexts", null, 0,
                -1, CredentialAttack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCredentialAttack_Exploits(), this.getCredentialVulnerability(), null, "exploits", null, 0, -1,
                CredentialAttack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(credentialVulnerabilityEClass, CredentialVulnerability.class, "CredentialVulnerability",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(vulnerabilityEClass, Vulnerability.class, "Vulnerability", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(actionTypEEnum, ActionTyp.class, "ActionTyp");
        addEEnumLiteral(actionTypEEnum, ActionTyp.COMPROMISED);
        addEEnumLiteral(actionTypEEnum, ActionTyp.INJECTABLE);
    }

} //AttackSpecificationPackageImpl
