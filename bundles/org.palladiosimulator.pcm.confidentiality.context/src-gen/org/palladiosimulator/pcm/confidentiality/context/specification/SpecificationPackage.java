/**
 */
package org.palladiosimulator.pcm.confidentiality.context.specification;

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
 * @see org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationFactory
 * @model kind="package"
 * @generated
 */
public interface SpecificationPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "specification";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/pcm/confidentiality/context/specification/0.1/";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "specification";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SpecificationPackage eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.specification.impl.SpecificationPackageImpl
            .init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.specification.impl.ContextSpecificationImpl <em>Context Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.impl.ContextSpecificationImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.impl.SpecificationPackageImpl#getContextSpecification()
     * @generated
     */
    int CONTEXT_SPECIFICATION = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SPECIFICATION__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SPECIFICATION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Contextset</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SPECIFICATION__CONTEXTSET = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Entrylevelsystemcall</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SPECIFICATION__ENTRYLEVELSYSTEMCALL = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Usagescenario</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SPECIFICATION__USAGESCENARIO = EntityPackage.ENTITY_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Context Specification</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SPECIFICATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.specification.impl.PolicySpecificationImpl <em>Policy Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.impl.PolicySpecificationImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.impl.SpecificationPackageImpl#getPolicySpecification()
     * @generated
     */
    int POLICY_SPECIFICATION = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_SPECIFICATION__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_SPECIFICATION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Policy</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_SPECIFICATION__POLICY = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Resourcedemandingbehaviour</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_SPECIFICATION__RESOURCEDEMANDINGBEHAVIOUR = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Policy Specification</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_SPECIFICATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.specification.impl.PCMSpecificationContainerImpl <em>PCM Specification Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.impl.PCMSpecificationContainerImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.impl.SpecificationPackageImpl#getPCMSpecificationContainer()
     * @generated
     */
    int PCM_SPECIFICATION_CONTAINER = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCM_SPECIFICATION_CONTAINER__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCM_SPECIFICATION_CONTAINER__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Policyspecification</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCM_SPECIFICATION_CONTAINER__POLICYSPECIFICATION = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Contextspecification</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCM_SPECIFICATION_CONTAINER__CONTEXTSPECIFICATION = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>PCM Specification Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCM_SPECIFICATION_CONTAINER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification <em>Context Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Specification</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification
     * @generated
     */
    EClass getContextSpecification();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification#getContextset <em>Contextset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Contextset</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification#getContextset()
     * @see #getContextSpecification()
     * @generated
     */
    EReference getContextSpecification_Contextset();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification#getEntrylevelsystemcall <em>Entrylevelsystemcall</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entrylevelsystemcall</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification#getEntrylevelsystemcall()
     * @see #getContextSpecification()
     * @generated
     */
    EReference getContextSpecification_Entrylevelsystemcall();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification#getUsagescenario <em>Usagescenario</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Usagescenario</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification#getUsagescenario()
     * @see #getContextSpecification()
     * @generated
     */
    EReference getContextSpecification_Usagescenario();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.specification.PolicySpecification <em>Policy Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Policy Specification</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.PolicySpecification
     * @generated
     */
    EClass getPolicySpecification();

    /**
     * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.confidentiality.context.specification.PolicySpecification#getPolicy <em>Policy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Policy</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.PolicySpecification#getPolicy()
     * @see #getPolicySpecification()
     * @generated
     */
    EReference getPolicySpecification_Policy();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.specification.PolicySpecification#getResourcedemandingbehaviour <em>Resourcedemandingbehaviour</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Resourcedemandingbehaviour</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.PolicySpecification#getResourcedemandingbehaviour()
     * @see #getPolicySpecification()
     * @generated
     */
    EReference getPolicySpecification_Resourcedemandingbehaviour();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.specification.PCMSpecificationContainer <em>PCM Specification Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>PCM Specification Container</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.PCMSpecificationContainer
     * @generated
     */
    EClass getPCMSpecificationContainer();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.specification.PCMSpecificationContainer#getPolicyspecification <em>Policyspecification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Policyspecification</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.PCMSpecificationContainer#getPolicyspecification()
     * @see #getPCMSpecificationContainer()
     * @generated
     */
    EReference getPCMSpecificationContainer_Policyspecification();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.specification.PCMSpecificationContainer#getContextspecification <em>Contextspecification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Contextspecification</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.PCMSpecificationContainer#getContextspecification()
     * @see #getPCMSpecificationContainer()
     * @generated
     */
    EReference getPCMSpecificationContainer_Contextspecification();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SpecificationFactory getSpecificationFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.specification.impl.ContextSpecificationImpl <em>Context Specification</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.specification.impl.ContextSpecificationImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.specification.impl.SpecificationPackageImpl#getContextSpecification()
         * @generated
         */
        EClass CONTEXT_SPECIFICATION = eINSTANCE.getContextSpecification();

        /**
         * The meta object literal for the '<em><b>Contextset</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_SPECIFICATION__CONTEXTSET = eINSTANCE.getContextSpecification_Contextset();

        /**
         * The meta object literal for the '<em><b>Entrylevelsystemcall</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_SPECIFICATION__ENTRYLEVELSYSTEMCALL = eINSTANCE
                .getContextSpecification_Entrylevelsystemcall();

        /**
         * The meta object literal for the '<em><b>Usagescenario</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_SPECIFICATION__USAGESCENARIO = eINSTANCE.getContextSpecification_Usagescenario();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.specification.impl.PolicySpecificationImpl <em>Policy Specification</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.specification.impl.PolicySpecificationImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.specification.impl.SpecificationPackageImpl#getPolicySpecification()
         * @generated
         */
        EClass POLICY_SPECIFICATION = eINSTANCE.getPolicySpecification();

        /**
         * The meta object literal for the '<em><b>Policy</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference POLICY_SPECIFICATION__POLICY = eINSTANCE.getPolicySpecification_Policy();

        /**
         * The meta object literal for the '<em><b>Resourcedemandingbehaviour</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference POLICY_SPECIFICATION__RESOURCEDEMANDINGBEHAVIOUR = eINSTANCE
                .getPolicySpecification_Resourcedemandingbehaviour();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.specification.impl.PCMSpecificationContainerImpl <em>PCM Specification Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.specification.impl.PCMSpecificationContainerImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.specification.impl.SpecificationPackageImpl#getPCMSpecificationContainer()
         * @generated
         */
        EClass PCM_SPECIFICATION_CONTAINER = eINSTANCE.getPCMSpecificationContainer();

        /**
         * The meta object literal for the '<em><b>Policyspecification</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PCM_SPECIFICATION_CONTAINER__POLICYSPECIFICATION = eINSTANCE
                .getPCMSpecificationContainer_Policyspecification();

        /**
         * The meta object literal for the '<em><b>Contextspecification</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PCM_SPECIFICATION_CONTAINER__CONTEXTSPECIFICATION = eINSTANCE
                .getPCMSpecificationContainer_Contextspecification();

    }

} //SpecificationPackage
