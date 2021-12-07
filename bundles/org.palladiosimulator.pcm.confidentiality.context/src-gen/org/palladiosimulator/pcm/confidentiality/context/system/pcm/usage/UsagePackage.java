/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage;

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
 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.UsageFactory
 * @model kind="package"
 * @generated
 */
public interface UsagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "usage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.palladiosimulator.org/pcm/confidentiality/context/specification/pcm/usage/0.1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "usage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsagePackage eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl.UsagePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl.PCMUsageSpecificationImpl <em>PCM Usage Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl.PCMUsageSpecificationImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl.UsagePackageImpl#getPCMUsageSpecification()
	 * @generated
	 */
	int PCM_USAGE_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_USAGE_SPECIFICATION__ID = SystemPackage.USAGE_SPECIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_USAGE_SPECIFICATION__ENTITY_NAME = SystemPackage.USAGE_SPECIFICATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Attributevalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_USAGE_SPECIFICATION__ATTRIBUTEVALUE = SystemPackage.USAGE_SPECIFICATION__ATTRIBUTEVALUE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_USAGE_SPECIFICATION__ATTRIBUTE = SystemPackage.USAGE_SPECIFICATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entrylevelsystemcall</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_USAGE_SPECIFICATION__ENTRYLEVELSYSTEMCALL = SystemPackage.USAGE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usagescenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_USAGE_SPECIFICATION__USAGESCENARIO = SystemPackage.USAGE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Missage Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_USAGE_SPECIFICATION__MISSAGE_USE = SystemPackage.USAGE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PCM Usage Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_USAGE_SPECIFICATION_FEATURE_COUNT = SystemPackage.USAGE_SPECIFICATION_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.PCMUsageSpecification <em>PCM Usage Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Usage Specification</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.PCMUsageSpecification
	 * @generated
	 */
	EClass getPCMUsageSpecification();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.PCMUsageSpecification#getEntrylevelsystemcall <em>Entrylevelsystemcall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entrylevelsystemcall</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.PCMUsageSpecification#getEntrylevelsystemcall()
	 * @see #getPCMUsageSpecification()
	 * @generated
	 */
	EReference getPCMUsageSpecification_Entrylevelsystemcall();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.PCMUsageSpecification#getUsagescenario <em>Usagescenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usagescenario</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.PCMUsageSpecification#getUsagescenario()
	 * @see #getPCMUsageSpecification()
	 * @generated
	 */
	EReference getPCMUsageSpecification_Usagescenario();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.PCMUsageSpecification#isMissageUse <em>Missage Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missage Use</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.PCMUsageSpecification#isMissageUse()
	 * @see #getPCMUsageSpecification()
	 * @generated
	 */
	EAttribute getPCMUsageSpecification_MissageUse();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UsageFactory getUsageFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl.PCMUsageSpecificationImpl <em>PCM Usage Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl.PCMUsageSpecificationImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl.UsagePackageImpl#getPCMUsageSpecification()
		 * @generated
		 */
		EClass PCM_USAGE_SPECIFICATION = eINSTANCE.getPCMUsageSpecification();

		/**
		 * The meta object literal for the '<em><b>Entrylevelsystemcall</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_USAGE_SPECIFICATION__ENTRYLEVELSYSTEMCALL = eINSTANCE.getPCMUsageSpecification_Entrylevelsystemcall();

		/**
		 * The meta object literal for the '<em><b>Usagescenario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_USAGE_SPECIFICATION__USAGESCENARIO = eINSTANCE.getPCMUsageSpecification_Usagescenario();

		/**
		 * The meta object literal for the '<em><b>Missage Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCM_USAGE_SPECIFICATION__MISSAGE_USE = eINSTANCE.getPCMUsageSpecification_MissageUse();

	}

} //UsagePackage
