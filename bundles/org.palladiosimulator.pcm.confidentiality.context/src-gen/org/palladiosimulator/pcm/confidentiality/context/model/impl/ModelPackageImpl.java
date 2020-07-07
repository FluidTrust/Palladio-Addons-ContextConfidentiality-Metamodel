/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

import org.palladiosimulator.pcm.confidentiality.context.impl.ContextPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute;
import org.palladiosimulator.pcm.confidentiality.context.model.ContextContainer;
import org.palladiosimulator.pcm.confidentiality.context.model.ContextType;
import org.palladiosimulator.pcm.confidentiality.context.model.HierarchicalContext;
import org.palladiosimulator.pcm.confidentiality.context.model.IncludeDirection;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelFactory;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage;
import org.palladiosimulator.pcm.confidentiality.context.model.RelatedContextSet;
import org.palladiosimulator.pcm.confidentiality.context.model.SingleAttributeContext;
import org.palladiosimulator.pcm.confidentiality.context.model.TypeContainer;

import org.palladiosimulator.pcm.confidentiality.context.set.SetPackage;

import org.palladiosimulator.pcm.confidentiality.context.set.impl.SetPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage;
import org.palladiosimulator.pcm.confidentiality.context.specification.impl.SpecificationPackageImpl;
import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hierarchicalContextEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass singleAttributeContextEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relatedContextSetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextContainerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typeContainerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum includeDirectionEEnum = null;

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
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ModelPackageImpl() {
        super(eNS_URI, ModelFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ModelPackage init() {
        if (isInited)
            return (ModelPackage) EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        ModelPackageImpl theModelPackage = registeredModelPackage instanceof ModelPackageImpl
                ? (ModelPackageImpl) registeredModelPackage
                : new ModelPackageImpl();

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
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI);
        SetPackageImpl theSetPackage = (SetPackageImpl) (registeredPackage instanceof SetPackageImpl ? registeredPackage
                : SetPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SpecificationPackage.eNS_URI);
        SpecificationPackageImpl theSpecificationPackage = (SpecificationPackageImpl) (registeredPackage instanceof SpecificationPackageImpl
                ? registeredPackage
                : SpecificationPackage.eINSTANCE);

        // Create package meta-data objects
        theModelPackage.createPackageContents();
        theContextPackage.createPackageContents();
        theSetPackage.createPackageContents();
        theSpecificationPackage.createPackageContents();

        // Initialize created meta-data
        theModelPackage.initializePackageContents();
        theContextPackage.initializePackageContents();
        theSetPackage.initializePackageContents();
        theSpecificationPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theModelPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
        return theModelPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHierarchicalContext() {
        return hierarchicalContextEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getHierarchicalContext_Including() {
        return (EReference) hierarchicalContextEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHierarchicalContext_Direction() {
        return (EAttribute) hierarchicalContextEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSingleAttributeContext() {
        return singleAttributeContextEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelatedContextSet() {
        return relatedContextSetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedContextSet_Contextset() {
        return (EReference) relatedContextSetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContextAttribute() {
        return contextAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextAttribute_Contexttype() {
        return (EReference) contextAttributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContextContainer() {
        return contextContainerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextContainer_Context() {
        return (EReference) contextContainerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContextType() {
        return contextTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContextType_Unique() {
        return (EAttribute) contextTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTypeContainer() {
        return typeContainerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTypeContainer_Types() {
        return (EReference) typeContainerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getIncludeDirection() {
        return includeDirectionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelFactory getModelFactory() {
        return (ModelFactory) getEFactoryInstance();
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
        hierarchicalContextEClass = createEClass(HIERARCHICAL_CONTEXT);
        createEReference(hierarchicalContextEClass, HIERARCHICAL_CONTEXT__INCLUDING);
        createEAttribute(hierarchicalContextEClass, HIERARCHICAL_CONTEXT__DIRECTION);

        singleAttributeContextEClass = createEClass(SINGLE_ATTRIBUTE_CONTEXT);

        relatedContextSetEClass = createEClass(RELATED_CONTEXT_SET);
        createEReference(relatedContextSetEClass, RELATED_CONTEXT_SET__CONTEXTSET);

        contextAttributeEClass = createEClass(CONTEXT_ATTRIBUTE);
        createEReference(contextAttributeEClass, CONTEXT_ATTRIBUTE__CONTEXTTYPE);

        contextContainerEClass = createEClass(CONTEXT_CONTAINER);
        createEReference(contextContainerEClass, CONTEXT_CONTAINER__CONTEXT);

        contextTypeEClass = createEClass(CONTEXT_TYPE);
        createEAttribute(contextTypeEClass, CONTEXT_TYPE__UNIQUE);

        typeContainerEClass = createEClass(TYPE_CONTAINER);
        createEReference(typeContainerEClass, TYPE_CONTAINER__TYPES);

        // Create enums
        includeDirectionEEnum = createEEnum(INCLUDE_DIRECTION);
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
        SetPackage theSetPackage = (SetPackage) EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI);
        EntityPackage theEntityPackage = (EntityPackage) EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
        EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        hierarchicalContextEClass.getESuperTypes().add(this.getContextAttribute());
        singleAttributeContextEClass.getESuperTypes().add(this.getContextAttribute());
        relatedContextSetEClass.getESuperTypes().add(this.getContextAttribute());
        contextAttributeEClass.getESuperTypes().add(theEntityPackage.getEntity());
        contextContainerEClass.getESuperTypes().add(theEntityPackage.getEntity());
        contextTypeEClass.getESuperTypes().add(theEntityPackage.getEntity());

        // Initialize classes and features; add operations and parameters
        initEClass(hierarchicalContextEClass, HierarchicalContext.class, "HierarchicalContext", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getHierarchicalContext_Including(), this.getContextAttribute(), null, "including", null, 0, -1,
                HierarchicalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHierarchicalContext_Direction(), this.getIncludeDirection(), "direction", null, 0, 1,
                HierarchicalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(singleAttributeContextEClass, SingleAttributeContext.class, "SingleAttributeContext", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(relatedContextSetEClass, RelatedContextSet.class, "RelatedContextSet", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRelatedContextSet_Contextset(), theSetPackage.getContextSet(), null, "contextset", null, 1, 1,
                RelatedContextSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(contextAttributeEClass, ContextAttribute.class, "ContextAttribute", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContextAttribute_Contexttype(), this.getContextType(), null, "contexttype", null, 0, 1,
                ContextAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(contextContainerEClass, ContextContainer.class, "ContextContainer", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContextContainer_Context(), this.getContextAttribute(), null, "context", null, 0, -1,
                ContextContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(contextTypeEClass, ContextType.class, "ContextType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getContextType_Unique(), theEcorePackage.getEBoolean(), "unique", "false", 0, 1,
                ContextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(typeContainerEClass, TypeContainer.class, "TypeContainer", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTypeContainer_Types(), this.getContextType(), null, "types", null, 0, -1, TypeContainer.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(includeDirectionEEnum, IncludeDirection.class, "IncludeDirection");
        addEEnumLiteral(includeDirectionEEnum, IncludeDirection.TOP_DOWN);
        addEEnumLiteral(includeDirectionEEnum, IncludeDirection.BOTTOM_UP);
    }

} //ModelPackageImpl
