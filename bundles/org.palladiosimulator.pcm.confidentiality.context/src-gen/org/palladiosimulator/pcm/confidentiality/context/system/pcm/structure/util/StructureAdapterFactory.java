/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.PCMBaseClass;
import org.palladiosimulator.pcm.PCMClass;

import org.palladiosimulator.pcm.confidentiality.context.policy.Match;

import org.palladiosimulator.pcm.confidentiality.context.system.AttributeProvider;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.*;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage
 * @generated
 */
public class StructureAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructurePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = StructurePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureSwitch<Adapter> modelSwitch =
		new StructureSwitch<Adapter>()
		{
			@Override
			public Adapter casePCMAttributeProvider(PCMAttributeProvider object)
			{
				return createPCMAttributeProviderAdapter();
			}
			@Override
			public Adapter caseMethodSpecification(MethodSpecification object)
			{
				return createMethodSpecificationAdapter();
			}
			@Override
			public Adapter caseConnectionRestriction(ConnectionRestriction object)
			{
				return createConnectionRestrictionAdapter();
			}
			@Override
			public Adapter caseServiceRestriction(ServiceRestriction object)
			{
				return createServiceRestrictionAdapter();
			}
			@Override
			public Adapter caseEntityMatch(EntityMatch object)
			{
				return createEntityMatchAdapter();
			}
			@Override
			public Adapter caseGenericMatch(GenericMatch object)
			{
				return createGenericMatchAdapter();
			}
			@Override
			public Adapter caseMethodMatch(MethodMatch object)
			{
				return createMethodMatchAdapter();
			}
			@Override
			public Adapter caseHierarchicalContext(HierarchicalContext object)
			{
				return createHierarchicalContextAdapter();
			}
			@Override
			public Adapter caseXMLMatch(XMLMatch object)
			{
				return createXMLMatchAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object)
			{
				return createIdentifierAdapter();
			}
			@Override
			public Adapter casePCMClass(PCMClass object)
			{
				return createPCMClassAdapter();
			}
			@Override
			public Adapter casePCMBaseClass(PCMBaseClass object)
			{
				return createPCMBaseClassAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object)
			{
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object)
			{
				return createEntityAdapter();
			}
			@Override
			public Adapter caseAttributeProvider(AttributeProvider object)
			{
				return createAttributeProviderAdapter();
			}
			@Override
			public Adapter caseMatch(Match object)
			{
				return createMatchAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider <em>PCM Attribute Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider
	 * @generated
	 */
	public Adapter createPCMAttributeProviderAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodSpecification <em>Method Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodSpecification
	 * @generated
	 */
	public Adapter createMethodSpecificationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ConnectionRestriction <em>Connection Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ConnectionRestriction
	 * @generated
	 */
	public Adapter createConnectionRestrictionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ServiceRestriction <em>Service Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ServiceRestriction
	 * @generated
	 */
	public Adapter createServiceRestrictionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.EntityMatch <em>Entity Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.EntityMatch
	 * @generated
	 */
	public Adapter createEntityMatchAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch <em>Generic Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch
	 * @generated
	 */
	public Adapter createGenericMatchAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodMatch <em>Method Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodMatch
	 * @generated
	 */
	public Adapter createMethodMatchAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.HierarchicalContext <em>Hierarchical Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.HierarchicalContext
	 * @generated
	 */
	public Adapter createHierarchicalContextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.XMLMatch <em>XML Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.XMLMatch
	 * @generated
	 */
	public Adapter createXMLMatchAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.PCMClass <em>PCM Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.PCMClass
	 * @generated
	 */
	public Adapter createPCMClassAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.PCMBaseClass <em>PCM Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.PCMBaseClass
	 * @generated
	 */
	public Adapter createPCMBaseClassAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.core.entity.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.core.entity.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.system.AttributeProvider <em>Attribute Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.AttributeProvider
	 * @generated
	 */
	public Adapter createAttributeProviderAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Match
	 * @generated
	 */
	public Adapter createMatchAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //StructureAdapterFactory
