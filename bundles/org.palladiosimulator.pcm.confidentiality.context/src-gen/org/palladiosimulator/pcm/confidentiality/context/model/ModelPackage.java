/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model;

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
 * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "model";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/pcm/confidentiality/context/model/0.1/";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "model";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ModelPackage eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextAttributeImpl <em>Context Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextAttributeImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getContextAttribute()
     * @generated
     */
    int CONTEXT_ATTRIBUTE = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_ATTRIBUTE__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_ATTRIBUTE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Contexttype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_ATTRIBUTE__CONTEXTTYPE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Context Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.HierarchicalContextImpl <em>Hierarchical Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.HierarchicalContextImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getHierarchicalContext()
     * @generated
     */
    int HIERARCHICAL_CONTEXT = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIERARCHICAL_CONTEXT__ID = CONTEXT_ATTRIBUTE__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIERARCHICAL_CONTEXT__ENTITY_NAME = CONTEXT_ATTRIBUTE__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Contexttype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIERARCHICAL_CONTEXT__CONTEXTTYPE = CONTEXT_ATTRIBUTE__CONTEXTTYPE;

    /**
     * The feature id for the '<em><b>Including</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIERARCHICAL_CONTEXT__INCLUDING = CONTEXT_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Hierarchical Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIERARCHICAL_CONTEXT_FEATURE_COUNT = CONTEXT_ATTRIBUTE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.SingleAttributeContextImpl <em>Single Attribute Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.SingleAttributeContextImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getSingleAttributeContext()
     * @generated
     */
    int SINGLE_ATTRIBUTE_CONTEXT = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_ATTRIBUTE_CONTEXT__ID = CONTEXT_ATTRIBUTE__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_ATTRIBUTE_CONTEXT__ENTITY_NAME = CONTEXT_ATTRIBUTE__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Contexttype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_ATTRIBUTE_CONTEXT__CONTEXTTYPE = CONTEXT_ATTRIBUTE__CONTEXTTYPE;

    /**
     * The number of structural features of the '<em>Single Attribute Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_ATTRIBUTE_CONTEXT_FEATURE_COUNT = CONTEXT_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.RelatedContextSetImpl <em>Related Context Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.RelatedContextSetImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getRelatedContextSet()
     * @generated
     */
    int RELATED_CONTEXT_SET = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_CONTEXT_SET__ID = CONTEXT_ATTRIBUTE__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_CONTEXT_SET__ENTITY_NAME = CONTEXT_ATTRIBUTE__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Contexttype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_CONTEXT_SET__CONTEXTTYPE = CONTEXT_ATTRIBUTE__CONTEXTTYPE;

    /**
     * The feature id for the '<em><b>Contextset</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_CONTEXT_SET__CONTEXTSET = CONTEXT_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Related Context Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_CONTEXT_SET_FEATURE_COUNT = CONTEXT_ATTRIBUTE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextContainerImpl <em>Context Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextContainerImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getContextContainer()
     * @generated
     */
    int CONTEXT_CONTAINER = 4;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_CONTAINER__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_CONTAINER__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Context</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_CONTAINER__CONTEXT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Context Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_CONTAINER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextTypeImpl <em>Context Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextTypeImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getContextType()
     * @generated
     */
    int CONTEXT_TYPE = 5;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Unique</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE__UNIQUE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Context Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.TypeContainerImpl <em>Type Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.TypeContainerImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getTypeContainer()
     * @generated
     */
    int TYPE_CONTAINER = 6;

    /**
     * The feature id for the '<em><b>Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_CONTAINER__TYPES = 0;

    /**
     * The number of structural features of the '<em>Type Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_CONTAINER_FEATURE_COUNT = 1;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.model.HierarchicalContext <em>Hierarchical Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hierarchical Context</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.HierarchicalContext
     * @generated
     */
    EClass getHierarchicalContext();

    /**
     * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.confidentiality.context.model.HierarchicalContext#getIncluding <em>Including</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Including</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.HierarchicalContext#getIncluding()
     * @see #getHierarchicalContext()
     * @generated
     */
    EReference getHierarchicalContext_Including();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.model.SingleAttributeContext <em>Single Attribute Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Single Attribute Context</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.SingleAttributeContext
     * @generated
     */
    EClass getSingleAttributeContext();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.model.RelatedContextSet <em>Related Context Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Related Context Set</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.RelatedContextSet
     * @generated
     */
    EClass getRelatedContextSet();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.model.RelatedContextSet#getContextset <em>Contextset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Contextset</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.RelatedContextSet#getContextset()
     * @see #getRelatedContextSet()
     * @generated
     */
    EReference getRelatedContextSet_Contextset();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute <em>Context Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Attribute</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute
     * @generated
     */
    EClass getContextAttribute();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute#getContexttype <em>Contexttype</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Contexttype</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute#getContexttype()
     * @see #getContextAttribute()
     * @generated
     */
    EReference getContextAttribute_Contexttype();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.model.ContextContainer <em>Context Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Container</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ContextContainer
     * @generated
     */
    EClass getContextContainer();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.model.ContextContainer#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Context</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ContextContainer#getContext()
     * @see #getContextContainer()
     * @generated
     */
    EReference getContextContainer_Context();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.model.ContextType <em>Context Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Type</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ContextType
     * @generated
     */
    EClass getContextType();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.model.ContextType#isUnique <em>Unique</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unique</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ContextType#isUnique()
     * @see #getContextType()
     * @generated
     */
    EAttribute getContextType_Unique();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.model.TypeContainer <em>Type Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Container</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.TypeContainer
     * @generated
     */
    EClass getTypeContainer();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.model.TypeContainer#getTypes <em>Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Types</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.TypeContainer#getTypes()
     * @see #getTypeContainer()
     * @generated
     */
    EReference getTypeContainer_Types();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ModelFactory getModelFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.HierarchicalContextImpl <em>Hierarchical Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.HierarchicalContextImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getHierarchicalContext()
         * @generated
         */
        EClass HIERARCHICAL_CONTEXT = eINSTANCE.getHierarchicalContext();

        /**
         * The meta object literal for the '<em><b>Including</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HIERARCHICAL_CONTEXT__INCLUDING = eINSTANCE.getHierarchicalContext_Including();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.SingleAttributeContextImpl <em>Single Attribute Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.SingleAttributeContextImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getSingleAttributeContext()
         * @generated
         */
        EClass SINGLE_ATTRIBUTE_CONTEXT = eINSTANCE.getSingleAttributeContext();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.RelatedContextSetImpl <em>Related Context Set</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.RelatedContextSetImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getRelatedContextSet()
         * @generated
         */
        EClass RELATED_CONTEXT_SET = eINSTANCE.getRelatedContextSet();

        /**
         * The meta object literal for the '<em><b>Contextset</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATED_CONTEXT_SET__CONTEXTSET = eINSTANCE.getRelatedContextSet_Contextset();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextAttributeImpl <em>Context Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextAttributeImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getContextAttribute()
         * @generated
         */
        EClass CONTEXT_ATTRIBUTE = eINSTANCE.getContextAttribute();

        /**
         * The meta object literal for the '<em><b>Contexttype</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_ATTRIBUTE__CONTEXTTYPE = eINSTANCE.getContextAttribute_Contexttype();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextContainerImpl <em>Context Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextContainerImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getContextContainer()
         * @generated
         */
        EClass CONTEXT_CONTAINER = eINSTANCE.getContextContainer();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_CONTAINER__CONTEXT = eINSTANCE.getContextContainer_Context();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextTypeImpl <em>Context Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextTypeImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getContextType()
         * @generated
         */
        EClass CONTEXT_TYPE = eINSTANCE.getContextType();

        /**
         * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_TYPE__UNIQUE = eINSTANCE.getContextType_Unique();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.TypeContainerImpl <em>Type Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.TypeContainerImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getTypeContainer()
         * @generated
         */
        EClass TYPE_CONTAINER = eINSTANCE.getTypeContainer();

        /**
         * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPE_CONTAINER__TYPES = eINSTANCE.getTypeContainer_Types();

    }

} //ModelPackage
