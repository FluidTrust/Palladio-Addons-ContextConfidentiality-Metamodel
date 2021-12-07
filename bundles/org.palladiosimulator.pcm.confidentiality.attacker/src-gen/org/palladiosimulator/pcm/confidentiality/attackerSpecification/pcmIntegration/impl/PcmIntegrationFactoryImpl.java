/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcmIntegrationFactoryImpl extends EFactoryImpl implements PcmIntegrationFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PcmIntegrationFactory init()
	{
		try
		{
			PcmIntegrationFactory thePcmIntegrationFactory = (PcmIntegrationFactory)EPackage.Registry.INSTANCE.getEFactory(PcmIntegrationPackage.eNS_URI);
			if (thePcmIntegrationFactory != null)
			{
				return thePcmIntegrationFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PcmIntegrationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmIntegrationFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case PcmIntegrationPackage.VULNERABILITY_SYSTEM_INTEGRATION: return createVulnerabilitySystemIntegration();
			case PcmIntegrationPackage.PCM_ELEMENT: return createPCMElement();
			case PcmIntegrationPackage.ROLE_SYSTEM_INTEGRATION: return createRoleSystemIntegration();
			case PcmIntegrationPackage.NON_GLOBAL_COMMUNICATION: return createNonGlobalCommunication();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VulnerabilitySystemIntegration createVulnerabilitySystemIntegration()
	{
		VulnerabilitySystemIntegrationImpl vulnerabilitySystemIntegration = new VulnerabilitySystemIntegrationImpl();
		return vulnerabilitySystemIntegration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMElement createPCMElement()
	{
		PCMElementImpl pcmElement = new PCMElementImpl();
		return pcmElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleSystemIntegration createRoleSystemIntegration()
	{
		RoleSystemIntegrationImpl roleSystemIntegration = new RoleSystemIntegrationImpl();
		return roleSystemIntegration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonGlobalCommunication createNonGlobalCommunication()
	{
		NonGlobalCommunicationImpl nonGlobalCommunication = new NonGlobalCommunicationImpl();
		return nonGlobalCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmIntegrationPackage getPcmIntegrationPackage()
	{
		return (PcmIntegrationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PcmIntegrationPackage getPackage()
	{
		return PcmIntegrationPackage.eINSTANCE;
	}

} //PcmIntegrationFactoryImpl
