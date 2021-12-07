/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.PCMBaseClass;
import org.palladiosimulator.pcm.PCMClass;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.*;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage
 * @generated
 */
public class SystemcontextAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SystemcontextPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemcontextAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = SystemcontextPackage.eINSTANCE;
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
	protected SystemcontextSwitch<Adapter> modelSwitch =
		new SystemcontextSwitch<Adapter>()
		{
			@Override
			public Adapter caseAttributes(Attributes object)
			{
				return createAttributesAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object)
			{
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseAttributeValue(AttributeValue object)
			{
				return createAttributeValueAdapter();
			}
			@Override
			public Adapter caseSystemEntityAttribute(SystemEntityAttribute object)
			{
				return createSystemEntityAttributeAdapter();
			}
			@Override
			public Adapter caseExternalSystemAttribute(ExternalSystemAttribute object)
			{
				return createExternalSystemAttributeAdapter();
			}
			@Override
			public Adapter caseSimpleAttribute(SimpleAttribute object)
			{
				return createSimpleAttributeAdapter();
			}
			@Override
			public Adapter caseXMLAttribute(XMLAttribute object)
			{
				return createXMLAttributeAdapter();
			}
			@Override
			public Adapter caseEnvironmentSubject(EnvironmentSubject object)
			{
				return createEnvironmentSubjectAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attributes
	 * @generated
	 */
	public Adapter createAttributesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue
	 * @generated
	 */
	public Adapter createAttributeValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemEntityAttribute <em>System Entity Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemEntityAttribute
	 * @generated
	 */
	public Adapter createSystemEntityAttributeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.ExternalSystemAttribute <em>External System Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.ExternalSystemAttribute
	 * @generated
	 */
	public Adapter createExternalSystemAttributeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.SimpleAttribute <em>Simple Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SimpleAttribute
	 * @generated
	 */
	public Adapter createSimpleAttributeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.XMLAttribute <em>XML Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.XMLAttribute
	 * @generated
	 */
	public Adapter createXMLAttributeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.EnvironmentSubject <em>Environment Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.EnvironmentSubject
	 * @generated
	 */
	public Adapter createEnvironmentSubjectAdapter()
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

} //SystemcontextAdapterFactory
