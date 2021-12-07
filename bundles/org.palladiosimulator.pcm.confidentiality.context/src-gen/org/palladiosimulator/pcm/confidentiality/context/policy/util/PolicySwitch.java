/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.PCMBaseClass;
import org.palladiosimulator.pcm.PCMClass;

import org.palladiosimulator.pcm.confidentiality.context.policy.*;

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
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage
 * @generated
 */
public class PolicySwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PolicyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicySwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = PolicyPackage.eINSTANCE;
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
			case PolicyPackage.POLICY_SET:
			{
				PolicySet policySet = (PolicySet)theEObject;
				T result = casePolicySet(policySet);
				if (result == null) result = caseEntity(policySet);
				if (result == null) result = caseIdentifier(policySet);
				if (result == null) result = caseNamedElement(policySet);
				if (result == null) result = casePCMBaseClass(policySet);
				if (result == null) result = casePCMClass(policySet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyPackage.POLICY:
			{
				Policy policy = (Policy)theEObject;
				T result = casePolicy(policy);
				if (result == null) result = caseEntity(policy);
				if (result == null) result = caseIdentifier(policy);
				if (result == null) result = caseNamedElement(policy);
				if (result == null) result = casePCMBaseClass(policy);
				if (result == null) result = casePCMClass(policy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyPackage.RULE:
			{
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = caseEntity(rule);
				if (result == null) result = caseIdentifier(rule);
				if (result == null) result = caseNamedElement(rule);
				if (result == null) result = casePCMBaseClass(rule);
				if (result == null) result = casePCMClass(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyPackage.ALL_OF:
			{
				AllOf allOf = (AllOf)theEObject;
				T result = caseAllOf(allOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyPackage.MATCH:
			{
				Match match = (Match)theEObject;
				T result = caseMatch(match);
				if (result == null) result = caseEntity(match);
				if (result == null) result = caseIdentifier(match);
				if (result == null) result = caseNamedElement(match);
				if (result == null) result = casePCMBaseClass(match);
				if (result == null) result = casePCMClass(match);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyPackage.APPLY:
			{
				Apply apply = (Apply)theEObject;
				T result = caseApply(apply);
				if (result == null) result = caseExpression(apply);
				if (result == null) result = caseEntity(apply);
				if (result == null) result = caseIdentifier(apply);
				if (result == null) result = caseNamedElement(apply);
				if (result == null) result = casePCMBaseClass(apply);
				if (result == null) result = casePCMClass(apply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyPackage.ATTRIBUTE_SELECTOR:
			{
				AttributeSelector attributeSelector = (AttributeSelector)theEObject;
				T result = caseAttributeSelector(attributeSelector);
				if (result == null) result = caseAttributeSelection(attributeSelector);
				if (result == null) result = caseExpression(attributeSelector);
				if (result == null) result = caseEntity(attributeSelector);
				if (result == null) result = caseIdentifier(attributeSelector);
				if (result == null) result = caseNamedElement(attributeSelector);
				if (result == null) result = casePCMBaseClass(attributeSelector);
				if (result == null) result = casePCMClass(attributeSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyPackage.FUNCTION_REFERENCE:
			{
				FunctionReference functionReference = (FunctionReference)theEObject;
				T result = caseFunctionReference(functionReference);
				if (result == null) result = caseExpression(functionReference);
				if (result == null) result = caseEntity(functionReference);
				if (result == null) result = caseIdentifier(functionReference);
				if (result == null) result = caseNamedElement(functionReference);
				if (result == null) result = casePCMBaseClass(functionReference);
				if (result == null) result = casePCMClass(functionReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyPackage.ATTRIBUTE_DESIGNATOR:
			{
				AttributeDesignator attributeDesignator = (AttributeDesignator)theEObject;
				T result = caseAttributeDesignator(attributeDesignator);
				if (result == null) result = caseAttributeSelection(attributeDesignator);
				if (result == null) result = caseExpression(attributeDesignator);
				if (result == null) result = caseEntity(attributeDesignator);
				if (result == null) result = caseIdentifier(attributeDesignator);
				if (result == null) result = caseNamedElement(attributeDesignator);
				if (result == null) result = casePCMBaseClass(attributeDesignator);
				if (result == null) result = casePCMClass(attributeDesignator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyPackage.XML_STRING:
			{
				XMLString xmlString = (XMLString)theEObject;
				T result = caseXMLString(xmlString);
				if (result == null) result = caseExpression(xmlString);
				if (result == null) result = caseEntity(xmlString);
				if (result == null) result = caseIdentifier(xmlString);
				if (result == null) result = caseNamedElement(xmlString);
				if (result == null) result = casePCMBaseClass(xmlString);
				if (result == null) result = casePCMClass(xmlString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyPackage.EXPRESSION:
			{
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseEntity(expression);
				if (result == null) result = caseIdentifier(expression);
				if (result == null) result = caseNamedElement(expression);
				if (result == null) result = casePCMBaseClass(expression);
				if (result == null) result = casePCMClass(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyPackage.VARIABLE_DEFINITIONS:
			{
				VariableDefinitions variableDefinitions = (VariableDefinitions)theEObject;
				T result = caseVariableDefinitions(variableDefinitions);
				if (result == null) result = caseEntity(variableDefinitions);
				if (result == null) result = caseIdentifier(variableDefinitions);
				if (result == null) result = caseNamedElement(variableDefinitions);
				if (result == null) result = casePCMBaseClass(variableDefinitions);
				if (result == null) result = casePCMClass(variableDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyPackage.VARIABLE_REFERENCE:
			{
				VariableReference variableReference = (VariableReference)theEObject;
				T result = caseVariableReference(variableReference);
				if (result == null) result = caseExpression(variableReference);
				if (result == null) result = caseEntity(variableReference);
				if (result == null) result = caseIdentifier(variableReference);
				if (result == null) result = caseNamedElement(variableReference);
				if (result == null) result = casePCMBaseClass(variableReference);
				if (result == null) result = casePCMClass(variableReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyPackage.ATTRIBUTE_VALUE_REFERENCE:
			{
				AttributeValueReference attributeValueReference = (AttributeValueReference)theEObject;
				T result = caseAttributeValueReference(attributeValueReference);
				if (result == null) result = caseExpression(attributeValueReference);
				if (result == null) result = caseEntity(attributeValueReference);
				if (result == null) result = caseIdentifier(attributeValueReference);
				if (result == null) result = caseNamedElement(attributeValueReference);
				if (result == null) result = casePCMBaseClass(attributeValueReference);
				if (result == null) result = casePCMClass(attributeValueReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyPackage.ATTRIBUTE_SELECTION:
			{
				AttributeSelection attributeSelection = (AttributeSelection)theEObject;
				T result = caseAttributeSelection(attributeSelection);
				if (result == null) result = caseExpression(attributeSelection);
				if (result == null) result = caseEntity(attributeSelection);
				if (result == null) result = caseIdentifier(attributeSelection);
				if (result == null) result = caseNamedElement(attributeSelection);
				if (result == null) result = casePCMBaseClass(attributeSelection);
				if (result == null) result = casePCMClass(attributeSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyPackage.SIMPLE_ATTRIBUTE_CONDITION:
			{
				SimpleAttributeCondition simpleAttributeCondition = (SimpleAttributeCondition)theEObject;
				T result = caseSimpleAttributeCondition(simpleAttributeCondition);
				if (result == null) result = caseAttributeSelection(simpleAttributeCondition);
				if (result == null) result = caseExpression(simpleAttributeCondition);
				if (result == null) result = caseEntity(simpleAttributeCondition);
				if (result == null) result = caseIdentifier(simpleAttributeCondition);
				if (result == null) result = caseNamedElement(simpleAttributeCondition);
				if (result == null) result = casePCMBaseClass(simpleAttributeCondition);
				if (result == null) result = casePCMClass(simpleAttributeCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicySet(PolicySet object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicy(Policy object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllOf(AllOf object)
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
	 * Returns the result of interpreting the object as an instance of '<em>Apply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApply(Apply object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeSelector(AttributeSelector object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionReference(FunctionReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Designator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Designator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDesignator(AttributeDesignator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLString(XMLString object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDefinitions(VariableDefinitions object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableReference(VariableReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueReference(AttributeValueReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeSelection(AttributeSelection object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Attribute Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Attribute Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleAttributeCondition(SimpleAttributeCondition object)
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

} //PolicySwitch
