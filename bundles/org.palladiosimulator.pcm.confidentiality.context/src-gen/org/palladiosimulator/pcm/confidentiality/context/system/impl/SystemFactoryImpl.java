/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.confidentiality.context.system.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemFactoryImpl extends EFactoryImpl implements SystemFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SystemFactory init()
	{
		try
		{
			SystemFactory theSystemFactory = (SystemFactory)EPackage.Registry.INSTANCE.getEFactory(SystemPackage.eNS_URI);
			if (theSystemFactory != null)
			{
				return theSystemFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFactoryImpl()
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
			case SystemPackage.SYSTEM_SPECIFICATION_CONTAINER: return createSystemSpecificationContainer();
			case SystemPackage.USAGE_SPECIFICATION: return createUsageSpecification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSpecificationContainer createSystemSpecificationContainer()
	{
		SystemSpecificationContainerImpl systemSpecificationContainer = new SystemSpecificationContainerImpl();
		return systemSpecificationContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageSpecification createUsageSpecification()
	{
		UsageSpecificationImpl usageSpecification = new UsageSpecificationImpl();
		return usageSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemPackage getSystemPackage()
	{
		return (SystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SystemPackage getPackage()
	{
		return SystemPackage.eINSTANCE;
	}

} //SystemFactoryImpl
