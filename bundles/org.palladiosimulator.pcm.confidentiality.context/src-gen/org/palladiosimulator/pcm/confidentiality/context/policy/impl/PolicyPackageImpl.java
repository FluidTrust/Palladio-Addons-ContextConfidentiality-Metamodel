/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

import org.palladiosimulator.pcm.confidentiality.context.impl.ContextPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.policy.AllOf;
import org.palladiosimulator.pcm.confidentiality.context.policy.Apply;
import org.palladiosimulator.pcm.confidentiality.context.policy.AttributeDesignator;
import org.palladiosimulator.pcm.confidentiality.context.policy.AttributeSelection;
import org.palladiosimulator.pcm.confidentiality.context.policy.AttributeSelector;
import org.palladiosimulator.pcm.confidentiality.context.policy.AttributeValueReference;
import org.palladiosimulator.pcm.confidentiality.context.policy.Category;
import org.palladiosimulator.pcm.confidentiality.context.policy.Expression;
import org.palladiosimulator.pcm.confidentiality.context.policy.FunctionReference;
import org.palladiosimulator.pcm.confidentiality.context.policy.Match;
import org.palladiosimulator.pcm.confidentiality.context.policy.Operations;
import org.palladiosimulator.pcm.confidentiality.context.policy.PermitType;
import org.palladiosimulator.pcm.confidentiality.context.policy.Policy;
import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyCombiningAlgorithm;
import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyFactory;
import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;
import org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet;
import org.palladiosimulator.pcm.confidentiality.context.policy.Rule;
import org.palladiosimulator.pcm.confidentiality.context.policy.RuleCombiningAlgorihtm;
import org.palladiosimulator.pcm.confidentiality.context.policy.SimpleAttributeCondition;
import org.palladiosimulator.pcm.confidentiality.context.policy.VariableDefinitions;
import org.palladiosimulator.pcm.confidentiality.context.policy.VariableReference;
import org.palladiosimulator.pcm.confidentiality.context.policy.XMLString;

import org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage;

import org.palladiosimulator.pcm.confidentiality.context.system.impl.SystemPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.UsagePackage;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl.UsagePackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyPackageImpl extends EPackageImpl implements PolicyPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policySetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDesignatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleAttributeConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum permitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum policyCombiningAlgorithmEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ruleCombiningAlgorihtmEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum categoryEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PolicyPackageImpl()
	{
		super(eNS_URI, PolicyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PolicyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PolicyPackage init()
	{
		if (isInited) return (PolicyPackage)EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPolicyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PolicyPackageImpl thePolicyPackage = registeredPolicyPackage instanceof PolicyPackageImpl ? (PolicyPackageImpl)registeredPolicyPackage : new PolicyPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		ContextPackageImpl theContextPackage = (ContextPackageImpl)(registeredPackage instanceof ContextPackageImpl ? registeredPackage : ContextPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(registeredPackage instanceof SystemPackageImpl ? registeredPackage : SystemPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(registeredPackage instanceof StructurePackageImpl ? registeredPackage : StructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UsagePackage.eNS_URI);
		UsagePackageImpl theUsagePackage = (UsagePackageImpl)(registeredPackage instanceof UsagePackageImpl ? registeredPackage : UsagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemcontextPackage.eNS_URI);
		SystemcontextPackageImpl theSystemcontextPackage = (SystemcontextPackageImpl)(registeredPackage instanceof SystemcontextPackageImpl ? registeredPackage : SystemcontextPackage.eINSTANCE);

		// Create package meta-data objects
		thePolicyPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theSystemPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theUsagePackage.createPackageContents();
		theSystemcontextPackage.createPackageContents();

		// Initialize created meta-data
		thePolicyPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theUsagePackage.initializePackageContents();
		theSystemcontextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePolicyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PolicyPackage.eNS_URI, thePolicyPackage);
		return thePolicyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicySet()
	{
		return policySetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicySet_CombiningAlgorithm()
	{
		return (EAttribute)policySetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicySet_Policyset()
	{
		return (EReference)policySetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicySet_Policy()
	{
		return (EReference)policySetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicySet_Target()
	{
		return (EReference)policySetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicy()
	{
		return policyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicy_CombiningAlgorithm()
	{
		return (EAttribute)policyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicy_Rule()
	{
		return (EReference)policyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicy_Variabledefinitions()
	{
		return (EReference)policyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicy_Target()
	{
		return (EReference)policyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule()
	{
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Permit()
	{
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Condition()
	{
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Target()
	{
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllOf()
	{
		return allOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllOf_Match()
	{
		return (EReference)allOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatch()
	{
		return matchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApply()
	{
		return applyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApply_Parameters()
	{
		return (EReference)applyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApply_Operation()
	{
		return (EAttribute)applyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeSelector()
	{
		return attributeSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionReference()
	{
		return functionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionReference_Function()
	{
		return (EAttribute)functionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDesignator()
	{
		return attributeDesignatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDesignator_Attribute()
	{
		return (EReference)attributeDesignatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDesignator_Type()
	{
		return (EAttribute)attributeDesignatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLString()
	{
		return xmlStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLString_String()
	{
		return (EAttribute)xmlStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression()
	{
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDefinitions()
	{
		return variableDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDefinitions_Expression()
	{
		return (EReference)variableDefinitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableReference()
	{
		return variableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableReference_Variabledefinitions()
	{
		return (EReference)variableReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueReference()
	{
		return attributeValueReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueReference_Attributevalue()
	{
		return (EReference)attributeValueReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeSelection()
	{
		return attributeSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeSelection_Category()
	{
		return (EAttribute)attributeSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeSelection_MustBePresent()
	{
		return (EAttribute)attributeSelectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleAttributeCondition()
	{
		return simpleAttributeConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleAttributeCondition_Attribute()
	{
		return (EReference)simpleAttributeConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleAttributeCondition_Only()
	{
		return (EAttribute)simpleAttributeConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPermitType()
	{
		return permitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPolicyCombiningAlgorithm()
	{
		return policyCombiningAlgorithmEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRuleCombiningAlgorihtm()
	{
		return ruleCombiningAlgorihtmEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperations()
	{
		return operationsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCategory()
	{
		return categoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyFactory getPolicyFactory()
	{
		return (PolicyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		policySetEClass = createEClass(POLICY_SET);
		createEAttribute(policySetEClass, POLICY_SET__COMBINING_ALGORITHM);
		createEReference(policySetEClass, POLICY_SET__POLICYSET);
		createEReference(policySetEClass, POLICY_SET__POLICY);
		createEReference(policySetEClass, POLICY_SET__TARGET);

		policyEClass = createEClass(POLICY);
		createEAttribute(policyEClass, POLICY__COMBINING_ALGORITHM);
		createEReference(policyEClass, POLICY__RULE);
		createEReference(policyEClass, POLICY__VARIABLEDEFINITIONS);
		createEReference(policyEClass, POLICY__TARGET);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__PERMIT);
		createEReference(ruleEClass, RULE__CONDITION);
		createEReference(ruleEClass, RULE__TARGET);

		allOfEClass = createEClass(ALL_OF);
		createEReference(allOfEClass, ALL_OF__MATCH);

		matchEClass = createEClass(MATCH);

		applyEClass = createEClass(APPLY);
		createEReference(applyEClass, APPLY__PARAMETERS);
		createEAttribute(applyEClass, APPLY__OPERATION);

		attributeSelectorEClass = createEClass(ATTRIBUTE_SELECTOR);

		functionReferenceEClass = createEClass(FUNCTION_REFERENCE);
		createEAttribute(functionReferenceEClass, FUNCTION_REFERENCE__FUNCTION);

		attributeDesignatorEClass = createEClass(ATTRIBUTE_DESIGNATOR);
		createEReference(attributeDesignatorEClass, ATTRIBUTE_DESIGNATOR__ATTRIBUTE);
		createEAttribute(attributeDesignatorEClass, ATTRIBUTE_DESIGNATOR__TYPE);

		xmlStringEClass = createEClass(XML_STRING);
		createEAttribute(xmlStringEClass, XML_STRING__STRING);

		expressionEClass = createEClass(EXPRESSION);

		variableDefinitionsEClass = createEClass(VARIABLE_DEFINITIONS);
		createEReference(variableDefinitionsEClass, VARIABLE_DEFINITIONS__EXPRESSION);

		variableReferenceEClass = createEClass(VARIABLE_REFERENCE);
		createEReference(variableReferenceEClass, VARIABLE_REFERENCE__VARIABLEDEFINITIONS);

		attributeValueReferenceEClass = createEClass(ATTRIBUTE_VALUE_REFERENCE);
		createEReference(attributeValueReferenceEClass, ATTRIBUTE_VALUE_REFERENCE__ATTRIBUTEVALUE);

		attributeSelectionEClass = createEClass(ATTRIBUTE_SELECTION);
		createEAttribute(attributeSelectionEClass, ATTRIBUTE_SELECTION__CATEGORY);
		createEAttribute(attributeSelectionEClass, ATTRIBUTE_SELECTION__MUST_BE_PRESENT);

		simpleAttributeConditionEClass = createEClass(SIMPLE_ATTRIBUTE_CONDITION);
		createEReference(simpleAttributeConditionEClass, SIMPLE_ATTRIBUTE_CONDITION__ATTRIBUTE);
		createEAttribute(simpleAttributeConditionEClass, SIMPLE_ATTRIBUTE_CONDITION__ONLY);

		// Create enums
		permitTypeEEnum = createEEnum(PERMIT_TYPE);
		policyCombiningAlgorithmEEnum = createEEnum(POLICY_COMBINING_ALGORITHM);
		ruleCombiningAlgorihtmEEnum = createEEnum(RULE_COMBINING_ALGORIHTM);
		operationsEEnum = createEEnum(OPERATIONS);
		categoryEEnum = createEEnum(CATEGORY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		SystemcontextPackage theSystemcontextPackage = (SystemcontextPackage)EPackage.Registry.INSTANCE.getEPackage(SystemcontextPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		policySetEClass.getESuperTypes().add(theEntityPackage.getEntity());
		policyEClass.getESuperTypes().add(theEntityPackage.getEntity());
		ruleEClass.getESuperTypes().add(theEntityPackage.getEntity());
		matchEClass.getESuperTypes().add(theEntityPackage.getEntity());
		applyEClass.getESuperTypes().add(this.getExpression());
		attributeSelectorEClass.getESuperTypes().add(this.getAttributeSelection());
		functionReferenceEClass.getESuperTypes().add(this.getExpression());
		attributeDesignatorEClass.getESuperTypes().add(this.getAttributeSelection());
		xmlStringEClass.getESuperTypes().add(this.getExpression());
		expressionEClass.getESuperTypes().add(theEntityPackage.getEntity());
		variableDefinitionsEClass.getESuperTypes().add(theEntityPackage.getEntity());
		variableReferenceEClass.getESuperTypes().add(this.getExpression());
		attributeValueReferenceEClass.getESuperTypes().add(this.getExpression());
		attributeSelectionEClass.getESuperTypes().add(this.getExpression());
		simpleAttributeConditionEClass.getESuperTypes().add(this.getAttributeSelection());

		// Initialize classes and features; add operations and parameters
		initEClass(policySetEClass, PolicySet.class, "PolicySet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicySet_CombiningAlgorithm(), this.getPolicyCombiningAlgorithm(), "combiningAlgorithm", "DENY_UNLESS_PERMIT", 0, 1, PolicySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicySet_Policyset(), this.getPolicySet(), null, "policyset", null, 0, -1, PolicySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicySet_Policy(), this.getPolicy(), null, "policy", null, 0, -1, PolicySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicySet_Target(), this.getAllOf(), null, "target", null, 0, -1, PolicySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyEClass, Policy.class, "Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicy_CombiningAlgorithm(), this.getRuleCombiningAlgorihtm(), "combiningAlgorithm", "DENY_UNLESS_PERMIT", 0, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicy_Rule(), this.getRule(), null, "rule", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicy_Variabledefinitions(), this.getVariableDefinitions(), null, "variabledefinitions", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicy_Target(), this.getAllOf(), null, "target", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Permit(), this.getPermitType(), "permit", "PERMIT", 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Condition(), this.getExpression(), null, "condition", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Target(), this.getAllOf(), null, "target", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allOfEClass, AllOf.class, "AllOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllOf_Match(), this.getMatch(), null, "match", null, 1, -1, AllOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchEClass, Match.class, "Match", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applyEClass, Apply.class, "Apply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApply_Parameters(), this.getExpression(), null, "parameters", null, 0, -1, Apply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApply_Operation(), this.getOperations(), "operation", null, 0, 1, Apply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeSelectorEClass, AttributeSelector.class, "AttributeSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionReferenceEClass, FunctionReference.class, "FunctionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionReference_Function(), this.getOperations(), "function", "STRING_EQUAL", 1, 1, FunctionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeDesignatorEClass, AttributeDesignator.class, "AttributeDesignator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeDesignator_Attribute(), theSystemcontextPackage.getAttribute(), null, "attribute", null, 1, 1, AttributeDesignator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDesignator_Type(), theSystemcontextPackage.getDataTypes(), "type", null, 0, 1, AttributeDesignator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlStringEClass, XMLString.class, "XMLString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLString_String(), ecorePackage.getEString(), "string", null, 0, 1, XMLString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableDefinitionsEClass, VariableDefinitions.class, "VariableDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDefinitions_Expression(), this.getExpression(), null, "expression", null, 1, 1, VariableDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableReference_Variabledefinitions(), this.getVariableDefinitions(), null, "variabledefinitions", null, 1, 1, VariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeValueReferenceEClass, AttributeValueReference.class, "AttributeValueReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeValueReference_Attributevalue(), theSystemcontextPackage.getAttributeValue(), null, "attributevalue", null, 1, 1, AttributeValueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeSelectionEClass, AttributeSelection.class, "AttributeSelection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeSelection_Category(), this.getCategory(), "category", null, 0, 1, AttributeSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeSelection_MustBePresent(), theXMLTypePackage.getBoolean(), "mustBePresent", "true", 0, 1, AttributeSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleAttributeConditionEClass, SimpleAttributeCondition.class, "SimpleAttributeCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleAttributeCondition_Attribute(), theSystemPackage.getUsageSpecification(), null, "attribute", null, 1, 1, SimpleAttributeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleAttributeCondition_Only(), theXMLTypePackage.getBoolean(), "only", "false", 1, 1, SimpleAttributeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(permitTypeEEnum, PermitType.class, "PermitType");
		addEEnumLiteral(permitTypeEEnum, PermitType.DENY);
		addEEnumLiteral(permitTypeEEnum, PermitType.PERMIT);

		initEEnum(policyCombiningAlgorithmEEnum, PolicyCombiningAlgorithm.class, "PolicyCombiningAlgorithm");
		addEEnumLiteral(policyCombiningAlgorithmEEnum, PolicyCombiningAlgorithm.DENY_OVERRIDES);
		addEEnumLiteral(policyCombiningAlgorithmEEnum, PolicyCombiningAlgorithm.PERMIT_OVERRIDES);
		addEEnumLiteral(policyCombiningAlgorithmEEnum, PolicyCombiningAlgorithm.FIRST_APPLICABLE);
		addEEnumLiteral(policyCombiningAlgorithmEEnum, PolicyCombiningAlgorithm.ONLY_ONE_APPLICABLE);
		addEEnumLiteral(policyCombiningAlgorithmEEnum, PolicyCombiningAlgorithm.ORDERED_DENY_OVERRIDES);
		addEEnumLiteral(policyCombiningAlgorithmEEnum, PolicyCombiningAlgorithm.ORDERED_PERMIT_OVERRIDES);
		addEEnumLiteral(policyCombiningAlgorithmEEnum, PolicyCombiningAlgorithm.DENY_UNLESS_PERMIT);
		addEEnumLiteral(policyCombiningAlgorithmEEnum, PolicyCombiningAlgorithm.PERMIT_UNLESS_DENY);

		initEEnum(ruleCombiningAlgorihtmEEnum, RuleCombiningAlgorihtm.class, "RuleCombiningAlgorihtm");
		addEEnumLiteral(ruleCombiningAlgorihtmEEnum, RuleCombiningAlgorihtm.DENY_OVERRIDES);
		addEEnumLiteral(ruleCombiningAlgorihtmEEnum, RuleCombiningAlgorihtm.PERMIT_OVERRIDES);
		addEEnumLiteral(ruleCombiningAlgorihtmEEnum, RuleCombiningAlgorihtm.FIRST_APPLICABLE);
		addEEnumLiteral(ruleCombiningAlgorihtmEEnum, RuleCombiningAlgorihtm.ONLY_ONE_APPLICABLE);
		addEEnumLiteral(ruleCombiningAlgorihtmEEnum, RuleCombiningAlgorihtm.ORDERED_DENY_OVERRIDES);
		addEEnumLiteral(ruleCombiningAlgorihtmEEnum, RuleCombiningAlgorihtm.ORDERED_PERMIT_OVERRIDES);
		addEEnumLiteral(ruleCombiningAlgorihtmEEnum, RuleCombiningAlgorihtm.DENY_UNLESS_PERMIT);
		addEEnumLiteral(ruleCombiningAlgorihtmEEnum, RuleCombiningAlgorihtm.PERMIT_UNLESS_DENY);

		initEEnum(operationsEEnum, Operations.class, "Operations");
		addEEnumLiteral(operationsEEnum, Operations.STRING_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.BOOLEAN_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.DATE_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.TIME_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.DAYTIMEDURATION_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.YEARMONTHDURATION_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.STRING_EQUAL_IGNORE_CASE);
		addEEnumLiteral(operationsEEnum, Operations.ANYURI_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.X500NAME_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.RFC822NAME_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.HEXBINARY_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.BASE64BINARY_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_ADD);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_ADD);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_SUBTRACT);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_SUBTRACT);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_MULTIPLY);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_MULTIPLY);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_DIVIDE);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_DIVIDE);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_MOD);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_ABS);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_ABS);
		addEEnumLiteral(operationsEEnum, Operations.ROUND);
		addEEnumLiteral(operationsEEnum, Operations.FLOOR);
		addEEnumLiteral(operationsEEnum, Operations.STRING_NORMALIZE_SPACE);
		addEEnumLiteral(operationsEEnum, Operations.STRING_NORMALIZE_TO_LOWER_CASE);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_TO_INTEGER);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_TO_DOUBLE);
		addEEnumLiteral(operationsEEnum, Operations.OR);
		addEEnumLiteral(operationsEEnum, Operations.AND);
		addEEnumLiteral(operationsEEnum, Operations.NOF);
		addEEnumLiteral(operationsEEnum, Operations.NOT);
		addEEnumLiteral(operationsEEnum, Operations.PRESENT);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_GREATER_THAN);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_GREATER_THAN_OR_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_LESS_THAN);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_LESS_THAN_OR_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_GREATER_THAN);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_GREATER_THAN_OR_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_LESS_THAN);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_LESS_THAN_OR_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_ADD_DAYTIMEDURATION);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_ADD_YEARMONTHDURATION);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_SUBTRACT_DAYTIMEDURATION);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_SUBTRACT_YEARMONTHDURATION);
		addEEnumLiteral(operationsEEnum, Operations.DATE_ADD_YEARMONTHDURATION);
		addEEnumLiteral(operationsEEnum, Operations.DATE_SUBTRACT_YEARMONTHDURATION);
		addEEnumLiteral(operationsEEnum, Operations.STRING_GREATER_THAN);
		addEEnumLiteral(operationsEEnum, Operations.STRING_GREATER_THAN_OR_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.STRING_LESS_THAN);
		addEEnumLiteral(operationsEEnum, Operations.STRING_LESS_THAN_OR_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.TIME_GREATER_THAN);
		addEEnumLiteral(operationsEEnum, Operations.TIME_GREATER_THAN_OR_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.TIME_LESS_THAN);
		addEEnumLiteral(operationsEEnum, Operations.TIME_LESS_THAN_OR_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.TIME_IN_RANGE);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_GREATER_THAN);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_GREATER_THAN_OR_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_LESS_THAN);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_LESS_THAN_OR_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.DATE_GREATER_THAN);
		addEEnumLiteral(operationsEEnum, Operations.DATE_GREATER_THAN_OR_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.DATE_LESS_THAN);
		addEEnumLiteral(operationsEEnum, Operations.DATE_LESS_THAN_OR_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.STRING_ONE_AND_ONLY);
		addEEnumLiteral(operationsEEnum, Operations.STRING_BAG_SIZE);
		addEEnumLiteral(operationsEEnum, Operations.STRING_IS_IN);
		addEEnumLiteral(operationsEEnum, Operations.STRING_BAG);
		addEEnumLiteral(operationsEEnum, Operations.BOOLEAN_ONE_AND_ONLY);
		addEEnumLiteral(operationsEEnum, Operations.BOOLEAN_BAG_SIZE);
		addEEnumLiteral(operationsEEnum, Operations.BOOLEAN_IS_IN);
		addEEnumLiteral(operationsEEnum, Operations.BOOLEAN_BAG);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_ONE_AND_ONLY);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_BAG_SIZE);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_IS_IN);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_BAG);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_ONE_AND_ONLY);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_BAG_SIZE);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_IS_IN);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_BAG);
		addEEnumLiteral(operationsEEnum, Operations.TIME_ONE_AND_ONLY);
		addEEnumLiteral(operationsEEnum, Operations.TIME_BAG_SIZE);
		addEEnumLiteral(operationsEEnum, Operations.TIME_IS_IN);
		addEEnumLiteral(operationsEEnum, Operations.TIME_BAG);
		addEEnumLiteral(operationsEEnum, Operations.DATE_ONE_AND_ONLY);
		addEEnumLiteral(operationsEEnum, Operations.DATE_BAG_SIZE);
		addEEnumLiteral(operationsEEnum, Operations.DATE_IS_IN);
		addEEnumLiteral(operationsEEnum, Operations.DATE_BAG);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_ONE_AND_ONLY);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_BAG_SIZE);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_IS_IN);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_BAG);
		addEEnumLiteral(operationsEEnum, Operations.ANYURI_ONE_AND_ONLY);
		addEEnumLiteral(operationsEEnum, Operations.ANYURI_BAG_SIZE);
		addEEnumLiteral(operationsEEnum, Operations.ANYURI_IS_IN);
		addEEnumLiteral(operationsEEnum, Operations.ANYURI_BAG);
		addEEnumLiteral(operationsEEnum, Operations.HEXBINARY_ONE_AND_ONLY);
		addEEnumLiteral(operationsEEnum, Operations.HEXBINARY_BAG_SIZE);
		addEEnumLiteral(operationsEEnum, Operations.HEXBINARY_IS_IN);
		addEEnumLiteral(operationsEEnum, Operations.HEXBINARY_BAG);
		addEEnumLiteral(operationsEEnum, Operations.BASE64BINARY_ONE_AND_ONLY);
		addEEnumLiteral(operationsEEnum, Operations.BASE64BINARY_BAG_SIZE);
		addEEnumLiteral(operationsEEnum, Operations.BASE64BINARY_IS_IN);
		addEEnumLiteral(operationsEEnum, Operations.BASE64BINARY_BAG);
		addEEnumLiteral(operationsEEnum, Operations.DAYTIMEDURATION_ONE_AND_ONLY);
		addEEnumLiteral(operationsEEnum, Operations.DAYTIMEDURATION_BAG_SIZE);
		addEEnumLiteral(operationsEEnum, Operations.DAYTIMEDURATION_IS_IN);
		addEEnumLiteral(operationsEEnum, Operations.DAYTIMEDURATION_BAG);
		addEEnumLiteral(operationsEEnum, Operations.YEARMONTHDURATION_ONE_AND_ONLY);
		addEEnumLiteral(operationsEEnum, Operations.YEARMONTHDURATION_BAG_SIZE);
		addEEnumLiteral(operationsEEnum, Operations.YEARMONTHDURATION_IS_IN);
		addEEnumLiteral(operationsEEnum, Operations.YEARMONTHDURATION_BAG);
		addEEnumLiteral(operationsEEnum, Operations.X500NAME_ONE_AND_ONLY);
		addEEnumLiteral(operationsEEnum, Operations.X500NAME_BAG_SIZE);
		addEEnumLiteral(operationsEEnum, Operations.X500NAME_IS_IN);
		addEEnumLiteral(operationsEEnum, Operations.X500NAME_BAG);
		addEEnumLiteral(operationsEEnum, Operations.RFC822NAME_ONE_AND_ONLY);
		addEEnumLiteral(operationsEEnum, Operations.RFC822NAME_BAG_SIZE);
		addEEnumLiteral(operationsEEnum, Operations.RFC822NAME_IS_IN);
		addEEnumLiteral(operationsEEnum, Operations.RFC822NAME_BAG);
		addEEnumLiteral(operationsEEnum, Operations.IPADDRESS_ONE_AND_ONLY);
		addEEnumLiteral(operationsEEnum, Operations.IPADDRESS_BAG_SIZE);
		addEEnumLiteral(operationsEEnum, Operations.IPADDRESS_IS_IN);
		addEEnumLiteral(operationsEEnum, Operations.IPADDRESS_BAG);
		addEEnumLiteral(operationsEEnum, Operations.DNSNAME_ONE_AND_ONLY);
		addEEnumLiteral(operationsEEnum, Operations.DNSNAME_BAG_SIZE);
		addEEnumLiteral(operationsEEnum, Operations.DNSNAME_IS_IN);
		addEEnumLiteral(operationsEEnum, Operations.DNSNAME_BAG);
		addEEnumLiteral(operationsEEnum, Operations.STRING_CONCATENATE);
		addEEnumLiteral(operationsEEnum, Operations.BOOLEAN_FROM_STRING);
		addEEnumLiteral(operationsEEnum, Operations.STRING_FROM_BOOLEAN);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_FROM_STRING);
		addEEnumLiteral(operationsEEnum, Operations.STRING_FROM_INTEGER);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_FROM_STRING);
		addEEnumLiteral(operationsEEnum, Operations.STRING_FROM_DOUBLE);
		addEEnumLiteral(operationsEEnum, Operations.TIME_FROM_STRING);
		addEEnumLiteral(operationsEEnum, Operations.STRING_FROM_TIME);
		addEEnumLiteral(operationsEEnum, Operations.DATE_FROM_STRING);
		addEEnumLiteral(operationsEEnum, Operations.STRING_FROM_DATE);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_FROM_STRING);
		addEEnumLiteral(operationsEEnum, Operations.STRING_FROM_DATETIME);
		addEEnumLiteral(operationsEEnum, Operations.ANYURI_FROM_STRING);
		addEEnumLiteral(operationsEEnum, Operations.STRING_FROM_ANYURI);
		addEEnumLiteral(operationsEEnum, Operations.DAYTIMEDURATION_FROM_STRING);
		addEEnumLiteral(operationsEEnum, Operations.STRING_FROM_DAYTIMEDURATION);
		addEEnumLiteral(operationsEEnum, Operations.YEARMONTHDURATION_FROM_STRING);
		addEEnumLiteral(operationsEEnum, Operations.STRING_FROM_YEARMONTHDURATION);
		addEEnumLiteral(operationsEEnum, Operations.X500NAME_FROM_STRING);
		addEEnumLiteral(operationsEEnum, Operations.STRING_FROM_X500NAME);
		addEEnumLiteral(operationsEEnum, Operations.RFC822NAME_FROM_STRING);
		addEEnumLiteral(operationsEEnum, Operations.STRING_FROM_RFC822NAME);
		addEEnumLiteral(operationsEEnum, Operations.IPADDRESS_FROM_STRING);
		addEEnumLiteral(operationsEEnum, Operations.STRING_FROM_IPADDRESS);
		addEEnumLiteral(operationsEEnum, Operations.DNSNAME_FROM_STRING);
		addEEnumLiteral(operationsEEnum, Operations.STRING_FROM_DNSNAME);
		addEEnumLiteral(operationsEEnum, Operations.STRING_STARTS_WITH);
		addEEnumLiteral(operationsEEnum, Operations.ANYURI_STARTS_WITH);
		addEEnumLiteral(operationsEEnum, Operations.STRING_ENDS_WITH);
		addEEnumLiteral(operationsEEnum, Operations.ANYURI_ENDS_WITH);
		addEEnumLiteral(operationsEEnum, Operations.STRING_CONTAINS);
		addEEnumLiteral(operationsEEnum, Operations.ANYURI_CONTAINS);
		addEEnumLiteral(operationsEEnum, Operations.STRING_SUBSTRING);
		addEEnumLiteral(operationsEEnum, Operations.ANYURI_SUBSTRING);
		addEEnumLiteral(operationsEEnum, Operations.ANY_OF);
		addEEnumLiteral(operationsEEnum, Operations.ALL_OF);
		addEEnumLiteral(operationsEEnum, Operations.ANY_OF_ANY);
		addEEnumLiteral(operationsEEnum, Operations.ALL_OF_ANY);
		addEEnumLiteral(operationsEEnum, Operations.ANY_OF_ALL);
		addEEnumLiteral(operationsEEnum, Operations.ALL_OF_ALL);
		addEEnumLiteral(operationsEEnum, Operations.MAP);
		addEEnumLiteral(operationsEEnum, Operations.X500NAME_MATCH);
		addEEnumLiteral(operationsEEnum, Operations.RFC822NAME_MATCH);
		addEEnumLiteral(operationsEEnum, Operations.STRING_REGEXP_MATCH);
		addEEnumLiteral(operationsEEnum, Operations.ANYURI_REGEXP_MATCH);
		addEEnumLiteral(operationsEEnum, Operations.IPADDRESS_REGEXP_MATCH);
		addEEnumLiteral(operationsEEnum, Operations.DNSNAME_REGEXP_MATCH);
		addEEnumLiteral(operationsEEnum, Operations.RFC822NAME_REGEXP_MATCH);
		addEEnumLiteral(operationsEEnum, Operations.X500NAME_REGEXP_MATCH);
		addEEnumLiteral(operationsEEnum, Operations.XPATH_NODE_COUNT);
		addEEnumLiteral(operationsEEnum, Operations.XPATH_NODE_EQUAL);
		addEEnumLiteral(operationsEEnum, Operations.XPATH_NODE_MATCH);
		addEEnumLiteral(operationsEEnum, Operations.STRING_INTERSECTION);
		addEEnumLiteral(operationsEEnum, Operations.STRING_AT_LEAST_ONE_MEMBER_OF);
		addEEnumLiteral(operationsEEnum, Operations.STRING_UNION);
		addEEnumLiteral(operationsEEnum, Operations.STRING_SUBSET);
		addEEnumLiteral(operationsEEnum, Operations.STRING_SET_EQUALS);
		addEEnumLiteral(operationsEEnum, Operations.BOOLEAN_INTERSECTION);
		addEEnumLiteral(operationsEEnum, Operations.BOOLEAN_AT_LEAST_ONE_MEMBER_OF);
		addEEnumLiteral(operationsEEnum, Operations.BOOLEAN_UNION);
		addEEnumLiteral(operationsEEnum, Operations.BOOLEAN_SUBSET);
		addEEnumLiteral(operationsEEnum, Operations.BOOLEAN_SET_EQUALS);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_INTERSECTION);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_AT_LEAST_ONE_MEMBER_OF);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_UNION);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_SUBSET);
		addEEnumLiteral(operationsEEnum, Operations.INTEGER_SET_EQUALS);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_INTERSECTION);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_AT_LEAST_ONE_MEMBER_OF);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_UNION);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_SUBSET);
		addEEnumLiteral(operationsEEnum, Operations.DOUBLE_SET_EQUALS);
		addEEnumLiteral(operationsEEnum, Operations.TIME_INTERSECTION);
		addEEnumLiteral(operationsEEnum, Operations.TIME_AT_LEAST_ONE_MEMBER_OF);
		addEEnumLiteral(operationsEEnum, Operations.TIME_UNION);
		addEEnumLiteral(operationsEEnum, Operations.TIME_SUBSET);
		addEEnumLiteral(operationsEEnum, Operations.TIME_SET_EQUALS);
		addEEnumLiteral(operationsEEnum, Operations.DATE_INTERSECTION);
		addEEnumLiteral(operationsEEnum, Operations.DATE_AT_LEAST_ONE_MEMBER_OF);
		addEEnumLiteral(operationsEEnum, Operations.DATE_UNION);
		addEEnumLiteral(operationsEEnum, Operations.DATE_SUBSET);
		addEEnumLiteral(operationsEEnum, Operations.DATE_SET_EQUALS);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_INTERSECTION);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_AT_LEAST_ONE_MEMBER_OF);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_UNION);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_SUBSET);
		addEEnumLiteral(operationsEEnum, Operations.DATETIME_SET_EQUALS);
		addEEnumLiteral(operationsEEnum, Operations.ANYURI_INTERSECTION);
		addEEnumLiteral(operationsEEnum, Operations.ANYURI_AT_LEAST_ONE_MEMBER_OF);
		addEEnumLiteral(operationsEEnum, Operations.ANYURI_UNION);
		addEEnumLiteral(operationsEEnum, Operations.ANYURI_SUBSET);
		addEEnumLiteral(operationsEEnum, Operations.ANYURI_SET_EQUALS);
		addEEnumLiteral(operationsEEnum, Operations.HEXBINARY_INTERSECTION);
		addEEnumLiteral(operationsEEnum, Operations.HEXBINARY_AT_LEAST_ONE_MEMBER_OF);
		addEEnumLiteral(operationsEEnum, Operations.HEXBINARY_UNION);
		addEEnumLiteral(operationsEEnum, Operations.HEXBINARY_SUBSET);
		addEEnumLiteral(operationsEEnum, Operations.HEXBINARY_SET_EQUALS);
		addEEnumLiteral(operationsEEnum, Operations.BASE64BINARY_INTERSECTION);
		addEEnumLiteral(operationsEEnum, Operations.BASE64BINARY_AT_LEAST_ONE_MEMBER_OF);
		addEEnumLiteral(operationsEEnum, Operations.BASE64BINARY_UNION);
		addEEnumLiteral(operationsEEnum, Operations.BASE64BINARY_SUBSET);
		addEEnumLiteral(operationsEEnum, Operations.BASE64BINARY_SET_EQUALS);
		addEEnumLiteral(operationsEEnum, Operations.DAYTIMEDURATION_INTERSECTION);
		addEEnumLiteral(operationsEEnum, Operations.DAYTIMEDURATION_AT_LEAST_ONE_MEMBER_OF);
		addEEnumLiteral(operationsEEnum, Operations.DAYTIMEDURATION_UNION);
		addEEnumLiteral(operationsEEnum, Operations.DAYTIMEDURATION_SUBSET);
		addEEnumLiteral(operationsEEnum, Operations.DAYTIMEDURATION_SET_EQUALS);
		addEEnumLiteral(operationsEEnum, Operations.YEARMONTHDURATION_INTERSECTION);
		addEEnumLiteral(operationsEEnum, Operations.YEARMONTHDURATION_AT_LEAST_ONE_MEMBER_OF);
		addEEnumLiteral(operationsEEnum, Operations.YEARMONTHDURATION_UNION);
		addEEnumLiteral(operationsEEnum, Operations.YEARMONTHDURATION_SUBSET);
		addEEnumLiteral(operationsEEnum, Operations.YEARMONTHDURATION_SET_EQUALS);
		addEEnumLiteral(operationsEEnum, Operations.X500NAME_INTERSECTION);
		addEEnumLiteral(operationsEEnum, Operations.X500NAME_AT_LEAST_ONE_MEMBER_OF);
		addEEnumLiteral(operationsEEnum, Operations.X500NAME_UNION);
		addEEnumLiteral(operationsEEnum, Operations.X500NAME_SUBSET);
		addEEnumLiteral(operationsEEnum, Operations.X500NAME_SET_EQUALS);
		addEEnumLiteral(operationsEEnum, Operations.RFC822NAME_INTERSECTION);
		addEEnumLiteral(operationsEEnum, Operations.RFC822NAME_AT_LEAST_ONE_MEMBER_OF);
		addEEnumLiteral(operationsEEnum, Operations.RFC822NAME_UNION);
		addEEnumLiteral(operationsEEnum, Operations.RFC822NAME_SUBSET);
		addEEnumLiteral(operationsEEnum, Operations.RFC822NAME_SET_EQUALS);
		addEEnumLiteral(operationsEEnum, Operations.IPADDRESS_INTERSECTION);
		addEEnumLiteral(operationsEEnum, Operations.IPADDRESS_AT_LEAST_ONE_MEMBER_OF);
		addEEnumLiteral(operationsEEnum, Operations.IPADDRESS_UNION);
		addEEnumLiteral(operationsEEnum, Operations.IPADDRESS_SUBSET);
		addEEnumLiteral(operationsEEnum, Operations.IPADDRESS_SET_EQUALS);
		addEEnumLiteral(operationsEEnum, Operations.DNSNAME_INTERSECTION);
		addEEnumLiteral(operationsEEnum, Operations.DNSNAME_AT_LEAST_ONE_MEMBER_OF);
		addEEnumLiteral(operationsEEnum, Operations.DNSNAME_UNION);
		addEEnumLiteral(operationsEEnum, Operations.DNSNAME_SUBSET);
		addEEnumLiteral(operationsEEnum, Operations.DNSNAME_SET_EQUALS);

		initEEnum(categoryEEnum, Category.class, "Category");
		addEEnumLiteral(categoryEEnum, Category.SUBJECT);
		addEEnumLiteral(categoryEEnum, Category.RESOURCE);
		addEEnumLiteral(categoryEEnum, Category.ENVIRONMENT);
		addEEnumLiteral(categoryEEnum, Category.ACTION);
	}

} //PolicyPackageImpl
