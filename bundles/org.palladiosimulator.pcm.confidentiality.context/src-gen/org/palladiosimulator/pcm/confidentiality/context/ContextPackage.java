/**
 */
package org.palladiosimulator.pcm.confidentiality.context;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.palladiosimulator.pcm.confidentiality.context.ContextFactory
 * @model kind="package"
 * @generated
 */
public interface ContextPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "context";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.palladiosimulator.org/pcm/confidentiality/context/0.1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "context";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextPackage eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.impl.ContextPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.impl.ConfidentialAccessSpecificationImpl <em>Confidential Access Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.impl.ConfidentialAccessSpecificationImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.impl.ContextPackageImpl#getConfidentialAccessSpecification()
	 * @generated
	 */
	int CONFIDENTIAL_ACCESS_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Pcmspecificationcontainer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIAL_ACCESS_SPECIFICATION__PCMSPECIFICATIONCONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Policyset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIAL_ACCESS_SPECIFICATION__POLICYSET = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIAL_ACCESS_SPECIFICATION__ATTRIBUTES = 2;

	/**
	 * The number of structural features of the '<em>Confidential Access Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIAL_ACCESS_SPECIFICATION_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification <em>Confidential Access Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confidential Access Specification</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification
	 * @generated
	 */
	EClass getConfidentialAccessSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getPcmspecificationcontainer <em>Pcmspecificationcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pcmspecificationcontainer</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getPcmspecificationcontainer()
	 * @see #getConfidentialAccessSpecification()
	 * @generated
	 */
	EReference getConfidentialAccessSpecification_Pcmspecificationcontainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getPolicyset <em>Policyset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policyset</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getPolicyset()
	 * @see #getConfidentialAccessSpecification()
	 * @generated
	 */
	EReference getConfidentialAccessSpecification_Policyset();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getAttributes()
	 * @see #getConfidentialAccessSpecification()
	 * @generated
	 */
	EReference getConfidentialAccessSpecification_Attributes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContextFactory getContextFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.impl.ConfidentialAccessSpecificationImpl <em>Confidential Access Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.impl.ConfidentialAccessSpecificationImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.impl.ContextPackageImpl#getConfidentialAccessSpecification()
		 * @generated
		 */
		EClass CONFIDENTIAL_ACCESS_SPECIFICATION = eINSTANCE.getConfidentialAccessSpecification();

		/**
		 * The meta object literal for the '<em><b>Pcmspecificationcontainer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENTIAL_ACCESS_SPECIFICATION__PCMSPECIFICATIONCONTAINER = eINSTANCE.getConfidentialAccessSpecification_Pcmspecificationcontainer();

		/**
		 * The meta object literal for the '<em><b>Policyset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENTIAL_ACCESS_SPECIFICATION__POLICYSET = eINSTANCE.getConfidentialAccessSpecification_Policyset();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENTIAL_ACCESS_SPECIFICATION__ATTRIBUTES = eINSTANCE.getConfidentialAccessSpecification_Attributes();

	}

} //ContextPackage
