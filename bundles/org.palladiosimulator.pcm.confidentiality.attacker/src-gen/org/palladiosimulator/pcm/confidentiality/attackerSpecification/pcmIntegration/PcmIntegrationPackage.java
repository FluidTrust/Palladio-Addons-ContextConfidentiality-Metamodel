/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration;

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
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationFactory
 * @model kind="package"
 * @generated
 */
public interface PcmIntegrationPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pcmIntegration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.palladiosimulator.org/pcm/confidentiality/attack/0.1/pcmIntagration/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pcmIntegration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcmIntegrationPackage eINSTANCE = org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PcmIntegrationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.VulnerabilitySystemIntegrationImpl <em>Vulnerability System Integration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.VulnerabilitySystemIntegrationImpl
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PcmIntegrationPackageImpl#getVulnerabilitySystemIntegration()
	 * @generated
	 */
	int VULNERABILITY_SYSTEM_INTEGRATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_SYSTEM_INTEGRATION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_SYSTEM_INTEGRATION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Pcmelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_SYSTEM_INTEGRATION__PCMELEMENT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vulnerability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_SYSTEM_INTEGRATION__VULNERABILITY = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vulnerability System Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_SYSTEM_INTEGRATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PCMElementImpl <em>PCM Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PCMElementImpl
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PcmIntegrationPackageImpl#getPCMElement()
	 * @generated
	 */
	int PCM_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ELEMENT__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ELEMENT__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Resourcecontainer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ELEMENT__RESOURCECONTAINER = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linkingresource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ELEMENT__LINKINGRESOURCE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compositecomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ELEMENT__COMPOSITECOMPONENT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Basiccomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ELEMENT__BASICCOMPONENT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assemblycontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ELEMENT__ASSEMBLYCONTEXT = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Methodspecification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ELEMENT__METHODSPECIFICATION = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>PCM Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ELEMENT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.SystemIntegrationImpl <em>System Integration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.SystemIntegrationImpl
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PcmIntegrationPackageImpl#getSystemIntegration()
	 * @generated
	 */
	int SYSTEM_INTEGRATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INTEGRATION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INTEGRATION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Pcmelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INTEGRATION__PCMELEMENT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INTEGRATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.RoleSystemIntegrationImpl <em>Role System Integration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.RoleSystemIntegrationImpl
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PcmIntegrationPackageImpl#getRoleSystemIntegration()
	 * @generated
	 */
	int ROLE_SYSTEM_INTEGRATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SYSTEM_INTEGRATION__ID = SYSTEM_INTEGRATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SYSTEM_INTEGRATION__ENTITY_NAME = SYSTEM_INTEGRATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Pcmelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SYSTEM_INTEGRATION__PCMELEMENT = SYSTEM_INTEGRATION__PCMELEMENT;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SYSTEM_INTEGRATION__ROLE = SYSTEM_INTEGRATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role System Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SYSTEM_INTEGRATION_FEATURE_COUNT = SYSTEM_INTEGRATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.NonGlobalCommunicationImpl <em>Non Global Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.NonGlobalCommunicationImpl
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PcmIntegrationPackageImpl#getNonGlobalCommunication()
	 * @generated
	 */
	int NON_GLOBAL_COMMUNICATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_GLOBAL_COMMUNICATION__ID = SYSTEM_INTEGRATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_GLOBAL_COMMUNICATION__ENTITY_NAME = SYSTEM_INTEGRATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Pcmelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_GLOBAL_COMMUNICATION__PCMELEMENT = SYSTEM_INTEGRATION__PCMELEMENT;

	/**
	 * The number of structural features of the '<em>Non Global Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_GLOBAL_COMMUNICATION_FEATURE_COUNT = SYSTEM_INTEGRATION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.VulnerabilitySystemIntegration <em>Vulnerability System Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vulnerability System Integration</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.VulnerabilitySystemIntegration
	 * @generated
	 */
	EClass getVulnerabilitySystemIntegration();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.VulnerabilitySystemIntegration#getVulnerability <em>Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vulnerability</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.VulnerabilitySystemIntegration#getVulnerability()
	 * @see #getVulnerabilitySystemIntegration()
	 * @generated
	 */
	EReference getVulnerabilitySystemIntegration_Vulnerability();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement <em>PCM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Element</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement
	 * @generated
	 */
	EClass getPCMElement();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getResourcecontainer <em>Resourcecontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resourcecontainer</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getResourcecontainer()
	 * @see #getPCMElement()
	 * @generated
	 */
	EReference getPCMElement_Resourcecontainer();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getLinkingresource <em>Linkingresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linkingresource</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getLinkingresource()
	 * @see #getPCMElement()
	 * @generated
	 */
	EReference getPCMElement_Linkingresource();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getCompositecomponent <em>Compositecomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compositecomponent</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getCompositecomponent()
	 * @see #getPCMElement()
	 * @generated
	 */
	EReference getPCMElement_Compositecomponent();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getBasiccomponent <em>Basiccomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Basiccomponent</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getBasiccomponent()
	 * @see #getPCMElement()
	 * @generated
	 */
	EReference getPCMElement_Basiccomponent();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getAssemblycontext <em>Assemblycontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assemblycontext</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getAssemblycontext()
	 * @see #getPCMElement()
	 * @generated
	 */
	EReference getPCMElement_Assemblycontext();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getMethodspecification <em>Methodspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Methodspecification</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getMethodspecification()
	 * @see #getPCMElement()
	 * @generated
	 */
	EReference getPCMElement_Methodspecification();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.RoleSystemIntegration <em>Role System Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role System Integration</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.RoleSystemIntegration
	 * @generated
	 */
	EClass getRoleSystemIntegration();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.RoleSystemIntegration#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.RoleSystemIntegration#getRole()
	 * @see #getRoleSystemIntegration()
	 * @generated
	 */
	EReference getRoleSystemIntegration_Role();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration <em>System Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Integration</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration
	 * @generated
	 */
	EClass getSystemIntegration();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration#getPcmelement <em>Pcmelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pcmelement</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration#getPcmelement()
	 * @see #getSystemIntegration()
	 * @generated
	 */
	EReference getSystemIntegration_Pcmelement();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.NonGlobalCommunication <em>Non Global Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Global Communication</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.NonGlobalCommunication
	 * @generated
	 */
	EClass getNonGlobalCommunication();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PcmIntegrationFactory getPcmIntegrationFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.VulnerabilitySystemIntegrationImpl <em>Vulnerability System Integration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.VulnerabilitySystemIntegrationImpl
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PcmIntegrationPackageImpl#getVulnerabilitySystemIntegration()
		 * @generated
		 */
		EClass VULNERABILITY_SYSTEM_INTEGRATION = eINSTANCE.getVulnerabilitySystemIntegration();

		/**
		 * The meta object literal for the '<em><b>Vulnerability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VULNERABILITY_SYSTEM_INTEGRATION__VULNERABILITY = eINSTANCE.getVulnerabilitySystemIntegration_Vulnerability();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PCMElementImpl <em>PCM Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PCMElementImpl
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PcmIntegrationPackageImpl#getPCMElement()
		 * @generated
		 */
		EClass PCM_ELEMENT = eINSTANCE.getPCMElement();

		/**
		 * The meta object literal for the '<em><b>Resourcecontainer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_ELEMENT__RESOURCECONTAINER = eINSTANCE.getPCMElement_Resourcecontainer();

		/**
		 * The meta object literal for the '<em><b>Linkingresource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_ELEMENT__LINKINGRESOURCE = eINSTANCE.getPCMElement_Linkingresource();

		/**
		 * The meta object literal for the '<em><b>Compositecomponent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_ELEMENT__COMPOSITECOMPONENT = eINSTANCE.getPCMElement_Compositecomponent();

		/**
		 * The meta object literal for the '<em><b>Basiccomponent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_ELEMENT__BASICCOMPONENT = eINSTANCE.getPCMElement_Basiccomponent();

		/**
		 * The meta object literal for the '<em><b>Assemblycontext</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_ELEMENT__ASSEMBLYCONTEXT = eINSTANCE.getPCMElement_Assemblycontext();

		/**
		 * The meta object literal for the '<em><b>Methodspecification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_ELEMENT__METHODSPECIFICATION = eINSTANCE.getPCMElement_Methodspecification();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.RoleSystemIntegrationImpl <em>Role System Integration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.RoleSystemIntegrationImpl
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PcmIntegrationPackageImpl#getRoleSystemIntegration()
		 * @generated
		 */
		EClass ROLE_SYSTEM_INTEGRATION = eINSTANCE.getRoleSystemIntegration();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_SYSTEM_INTEGRATION__ROLE = eINSTANCE.getRoleSystemIntegration_Role();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.SystemIntegrationImpl <em>System Integration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.SystemIntegrationImpl
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PcmIntegrationPackageImpl#getSystemIntegration()
		 * @generated
		 */
		EClass SYSTEM_INTEGRATION = eINSTANCE.getSystemIntegration();

		/**
		 * The meta object literal for the '<em><b>Pcmelement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_INTEGRATION__PCMELEMENT = eINSTANCE.getSystemIntegration_Pcmelement();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.NonGlobalCommunicationImpl <em>Non Global Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.NonGlobalCommunicationImpl
		 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PcmIntegrationPackageImpl#getNonGlobalCommunication()
		 * @generated
		 */
		EClass NON_GLOBAL_COMMUNICATION = eINSTANCE.getNonGlobalCommunication();

	}

} //PcmIntegrationPackage
