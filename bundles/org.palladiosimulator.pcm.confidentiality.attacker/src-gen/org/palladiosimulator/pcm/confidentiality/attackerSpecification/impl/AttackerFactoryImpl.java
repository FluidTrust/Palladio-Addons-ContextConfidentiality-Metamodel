/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttackerFactoryImpl extends EFactoryImpl implements AttackerFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttackerFactory init()
	{
		try
		{
			AttackerFactory theAttackerFactory = (AttackerFactory)EPackage.Registry.INSTANCE.getEFactory(AttackerPackage.eNS_URI);
			if (theAttackerFactory != null)
			{
				return theAttackerFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AttackerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackerFactoryImpl()
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
			case AttackerPackage.ATTACKER_CONTAINER: return (EObject)createAttackerContainer();
			case AttackerPackage.ATTACKER: return createAttacker();
			case AttackerPackage.ATTACKER_SPECIFICATION: return (EObject)createAttackerSpecification();
			case AttackerPackage.ATTACK_CONTAINER: return (EObject)createAttackContainer();
			case AttackerPackage.VULNERABILITY_CONTAINER: return (EObject)createVulnerabilityContainer();
			case AttackerPackage.CATEGORY_SPECIFICATION: return (EObject)createCategorySpecification();
			case AttackerPackage.ATTACKER_SYSTEM_SPECIFICATION_CONTAINER: return (EObject)createAttackerSystemSpecificationContainer();
			case AttackerPackage.DATAMODEL_ATTACKER: return createDatamodelAttacker();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackerContainer createAttackerContainer()
	{
		AttackerContainerImpl attackerContainer = new AttackerContainerImpl();
		return attackerContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attacker createAttacker()
	{
		AttackerImpl attacker = new AttackerImpl();
		return attacker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackerSpecification createAttackerSpecification()
	{
		AttackerSpecificationImpl attackerSpecification = new AttackerSpecificationImpl();
		return attackerSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackContainer createAttackContainer()
	{
		AttackContainerImpl attackContainer = new AttackContainerImpl();
		return attackContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VulnerabilityContainer createVulnerabilityContainer()
	{
		VulnerabilityContainerImpl vulnerabilityContainer = new VulnerabilityContainerImpl();
		return vulnerabilityContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategorySpecification createCategorySpecification()
	{
		CategorySpecificationImpl categorySpecification = new CategorySpecificationImpl();
		return categorySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackerSystemSpecificationContainer createAttackerSystemSpecificationContainer()
	{
		AttackerSystemSpecificationContainerImpl attackerSystemSpecificationContainer = new AttackerSystemSpecificationContainerImpl();
		return attackerSystemSpecificationContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatamodelAttacker createDatamodelAttacker()
	{
		DatamodelAttackerImpl datamodelAttacker = new DatamodelAttackerImpl();
		return datamodelAttacker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackerPackage getAttackerPackage()
	{
		return (AttackerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AttackerPackage getPackage()
	{
		return AttackerPackage.eINSTANCE;
	}

} //AttackerFactoryImpl
