/**
 */
package org.palladiosimulator.pcm.confidentiality.context.specification.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

import org.palladiosimulator.pcm.confidentiality.context.impl.ContextPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage;

import org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.set.SetPackage;

import org.palladiosimulator.pcm.confidentiality.context.set.impl.SetPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification;
import org.palladiosimulator.pcm.confidentiality.context.specification.PCMSpecificationContainer;
import org.palladiosimulator.pcm.confidentiality.context.specification.PolicySpecification;
import org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationFactory;
import org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.seff.SeffPackage;

import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecificationPackageImpl extends EPackageImpl implements SpecificationPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextSpecificationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass policySpecificationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pcmSpecificationContainerEClass = null;

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
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SpecificationPackageImpl() {
        super(eNS_URI, SpecificationFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link SpecificationPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SpecificationPackage init() {
        if (isInited)
            return (SpecificationPackage) EPackage.Registry.INSTANCE.getEPackage(SpecificationPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredSpecificationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        SpecificationPackageImpl theSpecificationPackage = registeredSpecificationPackage instanceof SpecificationPackageImpl
                ? (SpecificationPackageImpl) registeredSpecificationPackage
                : new SpecificationPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        IdentifierPackage.eINSTANCE.eClass();
        PcmPackage.eINSTANCE.eClass();
        ProbfunctionPackage.eINSTANCE.eClass();
        StoexPackage.eINSTANCE.eClass();
        UnitsPackage.eINSTANCE.eClass();
        EcorePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
        ContextPackageImpl theContextPackage = (ContextPackageImpl) (registeredPackage instanceof ContextPackageImpl
                ? registeredPackage
                : ContextPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
        ModelPackageImpl theModelPackage = (ModelPackageImpl) (registeredPackage instanceof ModelPackageImpl
                ? registeredPackage
                : ModelPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI);
        SetPackageImpl theSetPackage = (SetPackageImpl) (registeredPackage instanceof SetPackageImpl ? registeredPackage
                : SetPackage.eINSTANCE);

        // Create package meta-data objects
        theSpecificationPackage.createPackageContents();
        theContextPackage.createPackageContents();
        theModelPackage.createPackageContents();
        theSetPackage.createPackageContents();

        // Initialize created meta-data
        theSpecificationPackage.initializePackageContents();
        theContextPackage.initializePackageContents();
        theModelPackage.initializePackageContents();
        theSetPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSpecificationPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SpecificationPackage.eNS_URI, theSpecificationPackage);
        return theSpecificationPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContextSpecification() {
        return contextSpecificationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextSpecification_Contextset() {
        return (EReference) contextSpecificationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextSpecification_Entrylevelsystemcall() {
        return (EReference) contextSpecificationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextSpecification_Usagescenario() {
        return (EReference) contextSpecificationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPolicySpecification() {
        return policySpecificationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPolicySpecification_Policy() {
        return (EReference) policySpecificationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPolicySpecification_Resourcedemandingbehaviour() {
        return (EReference) policySpecificationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPCMSpecificationContainer() {
        return pcmSpecificationContainerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPCMSpecificationContainer_Policyspecification() {
        return (EReference) pcmSpecificationContainerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPCMSpecificationContainer_Contextspecification() {
        return (EReference) pcmSpecificationContainerEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecificationFactory getSpecificationFactory() {
        return (SpecificationFactory) getEFactoryInstance();
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
        contextSpecificationEClass = createEClass(CONTEXT_SPECIFICATION);
        createEReference(contextSpecificationEClass, CONTEXT_SPECIFICATION__CONTEXTSET);
        createEReference(contextSpecificationEClass, CONTEXT_SPECIFICATION__ENTRYLEVELSYSTEMCALL);
        createEReference(contextSpecificationEClass, CONTEXT_SPECIFICATION__USAGESCENARIO);

        policySpecificationEClass = createEClass(POLICY_SPECIFICATION);
        createEReference(policySpecificationEClass, POLICY_SPECIFICATION__POLICY);
        createEReference(policySpecificationEClass, POLICY_SPECIFICATION__RESOURCEDEMANDINGBEHAVIOUR);

        pcmSpecificationContainerEClass = createEClass(PCM_SPECIFICATION_CONTAINER);
        createEReference(pcmSpecificationContainerEClass, PCM_SPECIFICATION_CONTAINER__POLICYSPECIFICATION);
        createEReference(pcmSpecificationContainerEClass, PCM_SPECIFICATION_CONTAINER__CONTEXTSPECIFICATION);
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
        SetPackage theSetPackage = (SetPackage) EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI);
        UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage) EPackage.Registry.INSTANCE
                .getEPackage(UsagemodelPackage.eNS_URI);
        SeffPackage theSeffPackage = (SeffPackage) EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        contextSpecificationEClass.getESuperTypes().add(theEntityPackage.getEntity());
        policySpecificationEClass.getESuperTypes().add(theEntityPackage.getEntity());
        pcmSpecificationContainerEClass.getESuperTypes().add(theEntityPackage.getEntity());

        // Initialize classes and features; add operations and parameters
        initEClass(contextSpecificationEClass, ContextSpecification.class, "ContextSpecification", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContextSpecification_Contextset(), theSetPackage.getContextSet(), null, "contextset", null, 1,
                1, ContextSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContextSpecification_Entrylevelsystemcall(), theUsagemodelPackage.getEntryLevelSystemCall(),
                null, "entrylevelsystemcall", null, 0, 1, ContextSpecification.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContextSpecification_Usagescenario(), theUsagemodelPackage.getUsageScenario(), null,
                "usagescenario", null, 0, 1, ContextSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(policySpecificationEClass, PolicySpecification.class, "PolicySpecification", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPolicySpecification_Policy(), theSetPackage.getContextSet(), null, "policy", null, 1, -1,
                PolicySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPolicySpecification_Resourcedemandingbehaviour(),
                theSeffPackage.getResourceDemandingBehaviour(), null, "resourcedemandingbehaviour", null, 1, 1,
                PolicySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(pcmSpecificationContainerEClass, PCMSpecificationContainer.class, "PCMSpecificationContainer",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPCMSpecificationContainer_Policyspecification(), this.getPolicySpecification(), null,
                "policyspecification", null, 0, -1, PCMSpecificationContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPCMSpecificationContainer_Contextspecification(), this.getContextSpecification(), null,
                "contextspecification", null, 0, -1, PCMSpecificationContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} //SpecificationPackageImpl
