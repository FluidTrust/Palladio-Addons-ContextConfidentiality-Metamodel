/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.PCMBaseClass;
import org.palladiosimulator.pcm.PCMClass;

import org.palladiosimulator.pcm.confidentiality.context.policy.Match;

import org.palladiosimulator.pcm.confidentiality.context.system.AttributeProvider;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.*;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage
 * @generated
 */
public class StructureSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructurePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = StructurePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case StructurePackage.PCM_ATTRIBUTE_PROVIDER:
			{
				PCMAttributeProvider pcmAttributeProvider = (PCMAttributeProvider)theEObject;
				T result = casePCMAttributeProvider(pcmAttributeProvider);
				if (result == null) result = caseEntity(pcmAttributeProvider);
				if (result == null) result = caseAttributeProvider(pcmAttributeProvider);
				if (result == null) result = caseIdentifier(pcmAttributeProvider);
				if (result == null) result = caseNamedElement(pcmAttributeProvider);
				if (result == null) result = casePCMBaseClass(pcmAttributeProvider);
				if (result == null) result = casePCMClass(pcmAttributeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.METHOD_SPECIFICATION:
			{
				MethodSpecification methodSpecification = (MethodSpecification)theEObject;
				T result = caseMethodSpecification(methodSpecification);
				if (result == null) result = caseEntity(methodSpecification);
				if (result == null) result = caseIdentifier(methodSpecification);
				if (result == null) result = caseNamedElement(methodSpecification);
				if (result == null) result = casePCMBaseClass(methodSpecification);
				if (result == null) result = casePCMClass(methodSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.CONNECTION_RESTRICTION:
			{
				ConnectionRestriction connectionRestriction = (ConnectionRestriction)theEObject;
				T result = caseConnectionRestriction(connectionRestriction);
				if (result == null) result = caseMethodSpecification(connectionRestriction);
				if (result == null) result = caseEntity(connectionRestriction);
				if (result == null) result = caseIdentifier(connectionRestriction);
				if (result == null) result = caseNamedElement(connectionRestriction);
				if (result == null) result = casePCMBaseClass(connectionRestriction);
				if (result == null) result = casePCMClass(connectionRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.SERVICE_RESTRICTION:
			{
				ServiceRestriction serviceRestriction = (ServiceRestriction)theEObject;
				T result = caseServiceRestriction(serviceRestriction);
				if (result == null) result = caseMethodSpecification(serviceRestriction);
				if (result == null) result = caseEntity(serviceRestriction);
				if (result == null) result = caseIdentifier(serviceRestriction);
				if (result == null) result = caseNamedElement(serviceRestriction);
				if (result == null) result = casePCMBaseClass(serviceRestriction);
				if (result == null) result = casePCMClass(serviceRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.ENTITY_MATCH:
			{
				EntityMatch entityMatch = (EntityMatch)theEObject;
				T result = caseEntityMatch(entityMatch);
				if (result == null) result = caseMatch(entityMatch);
				if (result == null) result = caseHierarchicalContext(entityMatch);
				if (result == null) result = caseEntity(entityMatch);
				if (result == null) result = caseIdentifier(entityMatch);
				if (result == null) result = caseNamedElement(entityMatch);
				if (result == null) result = casePCMBaseClass(entityMatch);
				if (result == null) result = casePCMClass(entityMatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.GENERIC_MATCH:
			{
				GenericMatch genericMatch = (GenericMatch)theEObject;
				T result = caseGenericMatch(genericMatch);
				if (result == null) result = caseMatch(genericMatch);
				if (result == null) result = caseEntity(genericMatch);
				if (result == null) result = caseIdentifier(genericMatch);
				if (result == null) result = caseNamedElement(genericMatch);
				if (result == null) result = casePCMBaseClass(genericMatch);
				if (result == null) result = casePCMClass(genericMatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.METHOD_MATCH:
			{
				MethodMatch methodMatch = (MethodMatch)theEObject;
				T result = caseMethodMatch(methodMatch);
				if (result == null) result = caseMatch(methodMatch);
				if (result == null) result = caseHierarchicalContext(methodMatch);
				if (result == null) result = caseEntity(methodMatch);
				if (result == null) result = caseIdentifier(methodMatch);
				if (result == null) result = caseNamedElement(methodMatch);
				if (result == null) result = casePCMBaseClass(methodMatch);
				if (result == null) result = casePCMClass(methodMatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.HIERARCHICAL_CONTEXT:
			{
				HierarchicalContext hierarchicalContext = (HierarchicalContext)theEObject;
				T result = caseHierarchicalContext(hierarchicalContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.XML_MATCH:
			{
				XMLMatch xmlMatch = (XMLMatch)theEObject;
				T result = caseXMLMatch(xmlMatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Attribute Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Attribute Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMAttributeProvider(PCMAttributeProvider object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodSpecification(MethodSpecification object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionRestriction(ConnectionRestriction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRestriction(ServiceRestriction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityMatch(EntityMatch object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericMatch(GenericMatch object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodMatch(MethodMatch object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hierarchical Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hierarchical Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHierarchicalContext(HierarchicalContext object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLMatch(XMLMatch object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMClass(PCMClass object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Base Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Base Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMBaseClass(PCMBaseClass object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeProvider(AttributeProvider object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatch(Match object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //StructureSwitch
