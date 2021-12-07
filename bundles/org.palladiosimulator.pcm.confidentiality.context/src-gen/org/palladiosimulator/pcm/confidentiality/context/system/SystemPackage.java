/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system;

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
 * @see org.palladiosimulator.pcm.confidentiality.context.system.SystemFactory
 * @model kind="package"
 * @generated
 */
public interface SystemPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "system";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.palladiosimulator.org/pcm/confidentiality/context/systemSpecification/0.1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "system";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemPackage eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.system.impl.SystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.impl.SystemSpecificationContainerImpl <em>Specification Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.impl.SystemSpecificationContainerImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.impl.SystemPackageImpl#getSystemSpecificationContainer()
	 * @generated
	 */
	int SYSTEM_SPECIFICATION_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SPECIFICATION_CONTAINER__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SPECIFICATION_CONTAINER__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Attributeprovider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SPECIFICATION_CONTAINER__ATTRIBUTEPROVIDER = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usagespecification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SPECIFICATION_CONTAINER__USAGESPECIFICATION = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specification Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SPECIFICATION_CONTAINER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.impl.AttributeProviderImpl <em>Attribute Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.impl.AttributeProviderImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.impl.SystemPackageImpl#getAttributeProvider()
	 * @generated
	 */
	int ATTRIBUTE_PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PROVIDER__ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Attribute Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PROVIDER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.impl.UsageSpecificationImpl <em>Usage Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.impl.UsageSpecificationImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.impl.SystemPackageImpl#getUsageSpecification()
	 * @generated
	 */
	int USAGE_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_SPECIFICATION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_SPECIFICATION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Attributevalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_SPECIFICATION__ATTRIBUTEVALUE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_SPECIFICATION__ATTRIBUTE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Usage Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_SPECIFICATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.system.SystemSpecificationContainer <em>Specification Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification Container</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.SystemSpecificationContainer
	 * @generated
	 */
	EClass getSystemSpecificationContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.system.SystemSpecificationContainer#getAttributeprovider <em>Attributeprovider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributeprovider</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.SystemSpecificationContainer#getAttributeprovider()
	 * @see #getSystemSpecificationContainer()
	 * @generated
	 */
	EReference getSystemSpecificationContainer_Attributeprovider();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.system.SystemSpecificationContainer#getUsagespecification <em>Usagespecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usagespecification</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.SystemSpecificationContainer#getUsagespecification()
	 * @see #getSystemSpecificationContainer()
	 * @generated
	 */
	EReference getSystemSpecificationContainer_Usagespecification();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.system.AttributeProvider <em>Attribute Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Provider</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.AttributeProvider
	 * @generated
	 */
	EClass getAttributeProvider();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.confidentiality.context.system.AttributeProvider#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.AttributeProvider#getAttribute()
	 * @see #getAttributeProvider()
	 * @generated
	 */
	EReference getAttributeProvider_Attribute();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification <em>Usage Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Specification</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification
	 * @generated
	 */
	EClass getUsageSpecification();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification#getAttributevalue <em>Attributevalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributevalue</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification#getAttributevalue()
	 * @see #getUsageSpecification()
	 * @generated
	 */
	EReference getUsageSpecification_Attributevalue();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification#getAttribute()
	 * @see #getUsageSpecification()
	 * @generated
	 */
	EReference getUsageSpecification_Attribute();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemFactory getSystemFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.impl.SystemSpecificationContainerImpl <em>Specification Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.impl.SystemSpecificationContainerImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.impl.SystemPackageImpl#getSystemSpecificationContainer()
		 * @generated
		 */
		EClass SYSTEM_SPECIFICATION_CONTAINER = eINSTANCE.getSystemSpecificationContainer();

		/**
		 * The meta object literal for the '<em><b>Attributeprovider</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_SPECIFICATION_CONTAINER__ATTRIBUTEPROVIDER = eINSTANCE.getSystemSpecificationContainer_Attributeprovider();

		/**
		 * The meta object literal for the '<em><b>Usagespecification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_SPECIFICATION_CONTAINER__USAGESPECIFICATION = eINSTANCE.getSystemSpecificationContainer_Usagespecification();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.impl.AttributeProviderImpl <em>Attribute Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.impl.AttributeProviderImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.impl.SystemPackageImpl#getAttributeProvider()
		 * @generated
		 */
		EClass ATTRIBUTE_PROVIDER = eINSTANCE.getAttributeProvider();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_PROVIDER__ATTRIBUTE = eINSTANCE.getAttributeProvider_Attribute();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.impl.UsageSpecificationImpl <em>Usage Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.impl.UsageSpecificationImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.impl.SystemPackageImpl#getUsageSpecification()
		 * @generated
		 */
		EClass USAGE_SPECIFICATION = eINSTANCE.getUsageSpecification();

		/**
		 * The meta object literal for the '<em><b>Attributevalue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_SPECIFICATION__ATTRIBUTEVALUE = eINSTANCE.getUsageSpecification_Attributevalue();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_SPECIFICATION__ATTRIBUTE = eINSTANCE.getUsageSpecification_Attribute();

	}

} //SystemPackage
