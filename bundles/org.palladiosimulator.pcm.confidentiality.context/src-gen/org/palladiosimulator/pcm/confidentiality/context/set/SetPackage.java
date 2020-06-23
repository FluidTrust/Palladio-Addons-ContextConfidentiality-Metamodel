/**
 */
package org.palladiosimulator.pcm.confidentiality.context.set;

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
 * @see org.palladiosimulator.pcm.confidentiality.context.set.SetFactory
 * @model kind="package"
 * @generated
 */
public interface SetPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "set";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/pcm/confidentiality/context/set/0.1/";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "set";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SetPackage eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.set.impl.SetPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.set.impl.ContextSetContainerImpl <em>Context Set Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.set.impl.ContextSetContainerImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.set.impl.SetPackageImpl#getContextSetContainer()
     * @generated
     */
    int CONTEXT_SET_CONTAINER = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SET_CONTAINER__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SET_CONTAINER__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Policies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SET_CONTAINER__POLICIES = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Context Set Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SET_CONTAINER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.set.impl.ContextSetImpl <em>Context Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.set.impl.ContextSetImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.set.impl.SetPackageImpl#getContextSet()
     * @generated
     */
    int CONTEXT_SET = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SET__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SET__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Contexts</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SET__CONTEXTS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Context Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SET_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.set.ContextSetContainer <em>Context Set Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Set Container</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.set.ContextSetContainer
     * @generated
     */
    EClass getContextSetContainer();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.set.ContextSetContainer#getPolicies <em>Policies</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Policies</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.set.ContextSetContainer#getPolicies()
     * @see #getContextSetContainer()
     * @generated
     */
    EReference getContextSetContainer_Policies();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.set.ContextSet <em>Context Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Set</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.set.ContextSet
     * @generated
     */
    EClass getContextSet();

    /**
     * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.confidentiality.context.set.ContextSet#getContexts <em>Contexts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Contexts</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.set.ContextSet#getContexts()
     * @see #getContextSet()
     * @generated
     */
    EReference getContextSet_Contexts();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SetFactory getSetFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.set.impl.ContextSetContainerImpl <em>Context Set Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.set.impl.ContextSetContainerImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.set.impl.SetPackageImpl#getContextSetContainer()
         * @generated
         */
        EClass CONTEXT_SET_CONTAINER = eINSTANCE.getContextSetContainer();

        /**
         * The meta object literal for the '<em><b>Policies</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_SET_CONTAINER__POLICIES = eINSTANCE.getContextSetContainer_Policies();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.set.impl.ContextSetImpl <em>Context Set</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.set.impl.ContextSetImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.set.impl.SetPackageImpl#getContextSet()
         * @generated
         */
        EClass CONTEXT_SET = eINSTANCE.getContextSet();

        /**
         * The meta object literal for the '<em><b>Contexts</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_SET__CONTEXTS = eINSTANCE.getContextSet_Contexts();

    }

} //SetPackage
