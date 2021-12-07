/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.PCMBaseClass;
import org.palladiosimulator.pcm.PCMClass;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.*;

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
 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage
 * @generated
 */
public class SystemcontextSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SystemcontextPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemcontextSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = SystemcontextPackage.eINSTANCE;
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
			case SystemcontextPackage.ATTRIBUTES:
			{
				Attributes attributes = (Attributes)theEObject;
				T result = caseAttributes(attributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemcontextPackage.ATTRIBUTE:
			{
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseEntity(attribute);
				if (result == null) result = caseIdentifier(attribute);
				if (result == null) result = caseNamedElement(attribute);
				if (result == null) result = casePCMBaseClass(attribute);
				if (result == null) result = casePCMClass(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemcontextPackage.ATTRIBUTE_VALUE:
			{
				AttributeValue attributeValue = (AttributeValue)theEObject;
				T result = caseAttributeValue(attributeValue);
				if (result == null) result = caseEntity(attributeValue);
				if (result == null) result = caseIdentifier(attributeValue);
				if (result == null) result = caseNamedElement(attributeValue);
				if (result == null) result = casePCMBaseClass(attributeValue);
				if (result == null) result = casePCMClass(attributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemcontextPackage.SYSTEM_ENTITY_ATTRIBUTE:
			{
				SystemEntityAttribute systemEntityAttribute = (SystemEntityAttribute)theEObject;
				T result = caseSystemEntityAttribute(systemEntityAttribute);
				if (result == null) result = caseAttribute(systemEntityAttribute);
				if (result == null) result = caseEntity(systemEntityAttribute);
				if (result == null) result = caseIdentifier(systemEntityAttribute);
				if (result == null) result = caseNamedElement(systemEntityAttribute);
				if (result == null) result = casePCMBaseClass(systemEntityAttribute);
				if (result == null) result = casePCMClass(systemEntityAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemcontextPackage.EXTERNAL_SYSTEM_ATTRIBUTE:
			{
				ExternalSystemAttribute externalSystemAttribute = (ExternalSystemAttribute)theEObject;
				T result = caseExternalSystemAttribute(externalSystemAttribute);
				if (result == null) result = caseEnvironmentSubject(externalSystemAttribute);
				if (result == null) result = caseAttribute(externalSystemAttribute);
				if (result == null) result = caseEntity(externalSystemAttribute);
				if (result == null) result = caseIdentifier(externalSystemAttribute);
				if (result == null) result = caseNamedElement(externalSystemAttribute);
				if (result == null) result = casePCMBaseClass(externalSystemAttribute);
				if (result == null) result = casePCMClass(externalSystemAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemcontextPackage.SIMPLE_ATTRIBUTE:
			{
				SimpleAttribute simpleAttribute = (SimpleAttribute)theEObject;
				T result = caseSimpleAttribute(simpleAttribute);
				if (result == null) result = caseEnvironmentSubject(simpleAttribute);
				if (result == null) result = caseAttribute(simpleAttribute);
				if (result == null) result = caseEntity(simpleAttribute);
				if (result == null) result = caseIdentifier(simpleAttribute);
				if (result == null) result = caseNamedElement(simpleAttribute);
				if (result == null) result = casePCMBaseClass(simpleAttribute);
				if (result == null) result = casePCMClass(simpleAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemcontextPackage.XML_ATTRIBUTE:
			{
				XMLAttribute xmlAttribute = (XMLAttribute)theEObject;
				T result = caseXMLAttribute(xmlAttribute);
				if (result == null) result = caseAttribute(xmlAttribute);
				if (result == null) result = caseEntity(xmlAttribute);
				if (result == null) result = caseIdentifier(xmlAttribute);
				if (result == null) result = caseNamedElement(xmlAttribute);
				if (result == null) result = casePCMBaseClass(xmlAttribute);
				if (result == null) result = casePCMClass(xmlAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemcontextPackage.ENVIRONMENT_SUBJECT:
			{
				EnvironmentSubject environmentSubject = (EnvironmentSubject)theEObject;
				T result = caseEnvironmentSubject(environmentSubject);
				if (result == null) result = caseAttribute(environmentSubject);
				if (result == null) result = caseEntity(environmentSubject);
				if (result == null) result = caseIdentifier(environmentSubject);
				if (result == null) result = caseNamedElement(environmentSubject);
				if (result == null) result = casePCMBaseClass(environmentSubject);
				if (result == null) result = casePCMClass(environmentSubject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributes(Attributes object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValue(AttributeValue object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Entity Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Entity Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemEntityAttribute(SystemEntityAttribute object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External System Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External System Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalSystemAttribute(ExternalSystemAttribute object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleAttribute(SimpleAttribute object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLAttribute(XMLAttribute object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentSubject(EnvironmentSubject object)
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

} //SystemcontextSwitch
