/**
 */
package org.palladiosimulator.pcm.confidentiality.context.impl;

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

import org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification;
import org.palladiosimulator.pcm.confidentiality.context.ContextFactory;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

import org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage;

import org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.set.SetPackage;

import org.palladiosimulator.pcm.confidentiality.context.set.impl.SetPackageImpl;
import org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage;
import org.palladiosimulator.pcm.confidentiality.context.specification.impl.SpecificationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextPackageImpl extends EPackageImpl implements ContextPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass confidentialAccessSpecificationEClass = null;

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
     * @see org.palladiosimulator.pcm.confidentiality.context.ContextPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ContextPackageImpl() {
        super(eNS_URI, ContextFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ContextPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ContextPackage init() {
        if (isInited)
            return (ContextPackage) EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredContextPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        ContextPackageImpl theContextPackage = registeredContextPackage instanceof ContextPackageImpl
                ? (ContextPackageImpl) registeredContextPackage
                : new ContextPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        IdentifierPackage.eINSTANCE.eClass();
        PcmPackage.eINSTANCE.eClass();
        ProbfunctionPackage.eINSTANCE.eClass();
        StoexPackage.eINSTANCE.eClass();
        UnitsPackage.eINSTANCE.eClass();
        EcorePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
        ModelPackageImpl theModelPackage = (ModelPackageImpl) (registeredPackage instanceof ModelPackageImpl
                ? registeredPackage
                : ModelPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI);
        SetPackageImpl theSetPackage = (SetPackageImpl) (registeredPackage instanceof SetPackageImpl ? registeredPackage
                : SetPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SpecificationPackage.eNS_URI);
        SpecificationPackageImpl theSpecificationPackage = (SpecificationPackageImpl) (registeredPackage instanceof SpecificationPackageImpl
                ? registeredPackage
                : SpecificationPackage.eINSTANCE);

        // Create package meta-data objects
        theContextPackage.createPackageContents();
        theModelPackage.createPackageContents();
        theSetPackage.createPackageContents();
        theSpecificationPackage.createPackageContents();

        // Initialize created meta-data
        theContextPackage.initializePackageContents();
        theModelPackage.initializePackageContents();
        theSetPackage.initializePackageContents();
        theSpecificationPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theContextPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ContextPackage.eNS_URI, theContextPackage);
        return theContextPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConfidentialAccessSpecification() {
        return confidentialAccessSpecificationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConfidentialAccessSpecification_SetContainer() {
        return (EReference) confidentialAccessSpecificationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConfidentialAccessSpecification_ContextContainer() {
        return (EReference) confidentialAccessSpecificationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConfidentialAccessSpecification_TypeContainer() {
        return (EReference) confidentialAccessSpecificationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConfidentialAccessSpecification_Pcmspecificationcontainer() {
        return (EReference) confidentialAccessSpecificationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextFactory getContextFactory() {
        return (ContextFactory) getEFactoryInstance();
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
        confidentialAccessSpecificationEClass = createEClass(CONFIDENTIAL_ACCESS_SPECIFICATION);
        createEReference(confidentialAccessSpecificationEClass, CONFIDENTIAL_ACCESS_SPECIFICATION__SET_CONTAINER);
        createEReference(confidentialAccessSpecificationEClass, CONFIDENTIAL_ACCESS_SPECIFICATION__CONTEXT_CONTAINER);
        createEReference(confidentialAccessSpecificationEClass, CONFIDENTIAL_ACCESS_SPECIFICATION__TYPE_CONTAINER);
        createEReference(confidentialAccessSpecificationEClass,
                CONFIDENTIAL_ACCESS_SPECIFICATION__PCMSPECIFICATIONCONTAINER);
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
        ModelPackage theModelPackage = (ModelPackage) EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
        SetPackage theSetPackage = (SetPackage) EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI);
        SpecificationPackage theSpecificationPackage = (SpecificationPackage) EPackage.Registry.INSTANCE
                .getEPackage(SpecificationPackage.eNS_URI);

        // Add subpackages
        getESubpackages().add(theModelPackage);
        getESubpackages().add(theSetPackage);
        getESubpackages().add(theSpecificationPackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes and features; add operations and parameters
        initEClass(confidentialAccessSpecificationEClass, ConfidentialAccessSpecification.class,
                "ConfidentialAccessSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConfidentialAccessSpecification_SetContainer(), theSetPackage.getContextSetContainer(), null,
                "setContainer", null, 1, 1, ConfidentialAccessSpecification.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConfidentialAccessSpecification_ContextContainer(), theModelPackage.getContextContainer(),
                null, "contextContainer", null, 1, 1, ConfidentialAccessSpecification.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEReference(getConfidentialAccessSpecification_TypeContainer(), theModelPackage.getTypeContainer(), null,
                "typeContainer", null, 1, 1, ConfidentialAccessSpecification.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConfidentialAccessSpecification_Pcmspecificationcontainer(),
                theSpecificationPackage.getPCMSpecificationContainer(), null, "pcmspecificationcontainer", null, 1, 1,
                ConfidentialAccessSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //ContextPackageImpl
