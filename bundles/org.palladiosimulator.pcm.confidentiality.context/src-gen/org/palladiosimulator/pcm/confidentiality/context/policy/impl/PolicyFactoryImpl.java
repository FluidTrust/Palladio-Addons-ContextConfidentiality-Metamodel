/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.confidentiality.context.policy.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyFactoryImpl extends EFactoryImpl implements PolicyFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolicyFactory init()
	{
		try
		{
			PolicyFactory thePolicyFactory = (PolicyFactory)EPackage.Registry.INSTANCE.getEFactory(PolicyPackage.eNS_URI);
			if (thePolicyFactory != null)
			{
				return thePolicyFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PolicyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyFactoryImpl()
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
			case PolicyPackage.POLICY_SET: return createPolicySet();
			case PolicyPackage.POLICY: return createPolicy();
			case PolicyPackage.RULE: return createRule();
			case PolicyPackage.ALL_OF: return (EObject)createAllOf();
			case PolicyPackage.APPLY: return createApply();
			case PolicyPackage.ATTRIBUTE_SELECTOR: return createAttributeSelector();
			case PolicyPackage.FUNCTION_REFERENCE: return createFunctionReference();
			case PolicyPackage.ATTRIBUTE_DESIGNATOR: return createAttributeDesignator();
			case PolicyPackage.XML_STRING: return createXMLString();
			case PolicyPackage.VARIABLE_DEFINITIONS: return createVariableDefinitions();
			case PolicyPackage.VARIABLE_REFERENCE: return createVariableReference();
			case PolicyPackage.ATTRIBUTE_VALUE_REFERENCE: return createAttributeValueReference();
			case PolicyPackage.SIMPLE_ATTRIBUTE_CONDITION: return createSimpleAttributeCondition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case PolicyPackage.PERMIT_TYPE:
				return createPermitTypeFromString(eDataType, initialValue);
			case PolicyPackage.POLICY_COMBINING_ALGORITHM:
				return createPolicyCombiningAlgorithmFromString(eDataType, initialValue);
			case PolicyPackage.RULE_COMBINING_ALGORIHTM:
				return createRuleCombiningAlgorihtmFromString(eDataType, initialValue);
			case PolicyPackage.OPERATIONS:
				return createOperationsFromString(eDataType, initialValue);
			case PolicyPackage.CATEGORY:
				return createCategoryFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case PolicyPackage.PERMIT_TYPE:
				return convertPermitTypeToString(eDataType, instanceValue);
			case PolicyPackage.POLICY_COMBINING_ALGORITHM:
				return convertPolicyCombiningAlgorithmToString(eDataType, instanceValue);
			case PolicyPackage.RULE_COMBINING_ALGORIHTM:
				return convertRuleCombiningAlgorihtmToString(eDataType, instanceValue);
			case PolicyPackage.OPERATIONS:
				return convertOperationsToString(eDataType, instanceValue);
			case PolicyPackage.CATEGORY:
				return convertCategoryToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicySet createPolicySet()
	{
		PolicySetImpl policySet = new PolicySetImpl();
		return policySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Policy createPolicy()
	{
		PolicyImpl policy = new PolicyImpl();
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule()
	{
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllOf createAllOf()
	{
		AllOfImpl allOf = new AllOfImpl();
		return allOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apply createApply()
	{
		ApplyImpl apply = new ApplyImpl();
		return apply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeSelector createAttributeSelector()
	{
		AttributeSelectorImpl attributeSelector = new AttributeSelectorImpl();
		return attributeSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionReference createFunctionReference()
	{
		FunctionReferenceImpl functionReference = new FunctionReferenceImpl();
		return functionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDesignator createAttributeDesignator()
	{
		AttributeDesignatorImpl attributeDesignator = new AttributeDesignatorImpl();
		return attributeDesignator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLString createXMLString()
	{
		XMLStringImpl xmlString = new XMLStringImpl();
		return xmlString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDefinitions createVariableDefinitions()
	{
		VariableDefinitionsImpl variableDefinitions = new VariableDefinitionsImpl();
		return variableDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableReference createVariableReference()
	{
		VariableReferenceImpl variableReference = new VariableReferenceImpl();
		return variableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueReference createAttributeValueReference()
	{
		AttributeValueReferenceImpl attributeValueReference = new AttributeValueReferenceImpl();
		return attributeValueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAttributeCondition createSimpleAttributeCondition()
	{
		SimpleAttributeConditionImpl simpleAttributeCondition = new SimpleAttributeConditionImpl();
		return simpleAttributeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermitType createPermitTypeFromString(EDataType eDataType, String initialValue)
	{
		PermitType result = PermitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermitTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyCombiningAlgorithm createPolicyCombiningAlgorithmFromString(EDataType eDataType, String initialValue)
	{
		PolicyCombiningAlgorithm result = PolicyCombiningAlgorithm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPolicyCombiningAlgorithmToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleCombiningAlgorihtm createRuleCombiningAlgorihtmFromString(EDataType eDataType, String initialValue)
	{
		RuleCombiningAlgorihtm result = RuleCombiningAlgorihtm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleCombiningAlgorihtmToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operations createOperationsFromString(EDataType eDataType, String initialValue)
	{
		Operations result = Operations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationsToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategoryFromString(EDataType eDataType, String initialValue)
	{
		Category result = Category.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCategoryToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyPackage getPolicyPackage()
	{
		return (PolicyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PolicyPackage getPackage()
	{
		return PolicyPackage.eINSTANCE;
	}

} //PolicyFactoryImpl
