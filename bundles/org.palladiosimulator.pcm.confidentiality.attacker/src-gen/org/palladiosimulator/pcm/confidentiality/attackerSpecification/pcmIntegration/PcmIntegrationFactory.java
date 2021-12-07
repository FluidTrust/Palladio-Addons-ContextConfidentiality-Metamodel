/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage
 * @generated
 */
public interface PcmIntegrationFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcmIntegrationFactory eINSTANCE = org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PcmIntegrationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Vulnerability System Integration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vulnerability System Integration</em>'.
	 * @generated
	 */
	VulnerabilitySystemIntegration createVulnerabilitySystemIntegration();

	/**
	 * Returns a new object of class '<em>PCM Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Element</em>'.
	 * @generated
	 */
	PCMElement createPCMElement();

	/**
	 * Returns a new object of class '<em>Role System Integration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role System Integration</em>'.
	 * @generated
	 */
	RoleSystemIntegration createRoleSystemIntegration();

	/**
	 * Returns a new object of class '<em>Non Global Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Global Communication</em>'.
	 * @generated
	 */
	NonGlobalCommunication createNonGlobalCommunication();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PcmIntegrationPackage getPcmIntegrationPackage();

} //PcmIntegrationFactory
