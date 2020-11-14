/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
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
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.NewAbstractClass5;
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
    private EClass newAbstractClass5EClass = null;

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
    public EReference getAttack_Exploits() {
        return (EReference) attackEClass.getEStructuralFeatures().get(0);
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
    public EClass getCredentialVulnerability() {
        return credentialVulnerabilityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCredentialVulnerability_Context() {
        return (EReference) credentialVulnerabilityEClass.getEStructuralFeatures().get(0);
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
    public EClass getNewAbstractClass5() {
        return newAbstractClass5EClass;
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
        createEReference(attackEClass, ATTACK__EXPLOITS);

        credentialAttackEClass = createEClass(CREDENTIAL_ATTACK);

        credentialVulnerabilityEClass = createEClass(CREDENTIAL_VULNERABILITY);
        createEReference(credentialVulnerabilityEClass, CREDENTIAL_VULNERABILITY__CONTEXT);

        vulnerabilityEClass = createEClass(VULNERABILITY);

        newAbstractClass5EClass = createEClass(NEW_ABSTRACT_CLASS5);

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
        ETypeParameter attackEClass_T = addETypeParameter(attackEClass, "T");
        addETypeParameter(newAbstractClass5EClass, "T");

        // Set bounds for type parameters
        EGenericType g1 = createEGenericType(this.getVulnerability());
        attackEClass_T.getEBounds().add(g1);

        // Add supertypes to classes
        attackEClass.getESuperTypes().add(theEntityPackage.getEntity());
        g1 = createEGenericType(this.getAttack());
        EGenericType g2 = createEGenericType(this.getCredentialVulnerability());
        g1.getETypeArguments().add(g2);
        credentialAttackEClass.getEGenericSuperTypes().add(g1);
        credentialVulnerabilityEClass.getESuperTypes().add(this.getVulnerability());
        vulnerabilityEClass.getESuperTypes().add(theEntityPackage.getEntity());

        // Initialize classes and features; add operations and parameters
        initEClass(attackEClass, Attack.class, "Attack", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        g1 = createEGenericType(attackEClass_T);
        initEReference(getAttack_Exploits(), g1, null, "exploits", null, 0, -1, Attack.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        initEClass(credentialAttackEClass, CredentialAttack.class, "CredentialAttack", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(credentialVulnerabilityEClass, CredentialVulnerability.class, "CredentialVulnerability",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCredentialVulnerability_Context(), theModelPackage.getContextAttribute(), null, "context",
                null, 0, 1, CredentialVulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(vulnerabilityEClass, Vulnerability.class, "Vulnerability", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(newAbstractClass5EClass, NewAbstractClass5.class, "NewAbstractClass5", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(actionTypEEnum, ActionTyp.class, "ActionTyp");
        addEEnumLiteral(actionTypEEnum, ActionTyp.COMPROMISED);
        addEEnumLiteral(actionTypEEnum, ActionTyp.INJECTABLE);
    }

} //AttackSpecificationPackageImpl
