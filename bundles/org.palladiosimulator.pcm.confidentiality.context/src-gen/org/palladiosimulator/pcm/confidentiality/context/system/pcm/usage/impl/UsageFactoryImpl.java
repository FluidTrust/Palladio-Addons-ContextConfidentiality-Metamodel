/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsageFactoryImpl extends EFactoryImpl implements UsageFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsageFactory init()
	{
		try
		{
			UsageFactory theUsageFactory = (UsageFactory)EPackage.Registry.INSTANCE.getEFactory(UsagePackage.eNS_URI);
			if (theUsageFactory != null)
			{
				return theUsageFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UsageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageFactoryImpl()
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
			case UsagePackage.PCM_USAGE_SPECIFICATION: return createPCMUsageSpecification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMUsageSpecification createPCMUsageSpecification()
	{
		PCMUsageSpecificationImpl pcmUsageSpecification = new PCMUsageSpecificationImpl();
		return pcmUsageSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsagePackage getUsagePackage()
	{
		return (UsagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UsagePackage getPackage()
	{
		return UsagePackage.eINSTANCE;
	}

} //UsageFactoryImpl
