/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureFactoryImpl extends EFactoryImpl implements StructureFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructureFactory init()
	{
		try
		{
			StructureFactory theStructureFactory = (StructureFactory)EPackage.Registry.INSTANCE.getEFactory(StructurePackage.eNS_URI);
			if (theStructureFactory != null)
			{
				return theStructureFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureFactoryImpl()
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
			case StructurePackage.PCM_ATTRIBUTE_PROVIDER: return createPCMAttributeProvider();
			case StructurePackage.CONNECTION_RESTRICTION: return createConnectionRestriction();
			case StructurePackage.SERVICE_RESTRICTION: return createServiceRestriction();
			case StructurePackage.ENTITY_MATCH: return createEntityMatch();
			case StructurePackage.GENERIC_MATCH: return createGenericMatch();
			case StructurePackage.METHOD_MATCH: return createMethodMatch();
			case StructurePackage.XML_MATCH: return (EObject)createXMLMatch();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMAttributeProvider createPCMAttributeProvider()
	{
		PCMAttributeProviderImpl pcmAttributeProvider = new PCMAttributeProviderImpl();
		return pcmAttributeProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionRestriction createConnectionRestriction()
	{
		ConnectionRestrictionImpl connectionRestriction = new ConnectionRestrictionImpl();
		return connectionRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRestriction createServiceRestriction()
	{
		ServiceRestrictionImpl serviceRestriction = new ServiceRestrictionImpl();
		return serviceRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityMatch createEntityMatch()
	{
		EntityMatchImpl entityMatch = new EntityMatchImpl();
		return entityMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericMatch createGenericMatch()
	{
		GenericMatchImpl genericMatch = new GenericMatchImpl();
		return genericMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodMatch createMethodMatch()
	{
		MethodMatchImpl methodMatch = new MethodMatchImpl();
		return methodMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLMatch createXMLMatch()
	{
		XMLMatchImpl xmlMatch = new XMLMatchImpl();
		return xmlMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructurePackage getStructurePackage()
	{
		return (StructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructurePackage getPackage()
	{
		return StructurePackage.eINSTANCE;
	}

} //StructureFactoryImpl
