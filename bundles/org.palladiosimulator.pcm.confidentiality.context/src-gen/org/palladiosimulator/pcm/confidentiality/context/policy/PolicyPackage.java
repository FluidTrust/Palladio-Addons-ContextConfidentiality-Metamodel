/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyFactory
 * @model kind="package"
 * @generated
 */
public interface PolicyPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "policy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.palladiosimulator.org/pcm/confidentiality/context/policy/0.1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolicyPackage eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicySetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicySetImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getPolicySet()
	 * @generated
	 */
	int POLICY_SET = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SET__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SET__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Combining Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SET__COMBINING_ALGORITHM = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Policyset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SET__POLICYSET = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SET__POLICY = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SET__TARGET = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SET_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getPolicy()
	 * @generated
	 */
	int POLICY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Combining Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__COMBINING_ALGORITHM = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__RULE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variabledefinitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__VARIABLEDEFINITIONS = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__TARGET = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.RuleImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Permit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PERMIT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONDITION = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TARGET = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.AllOfImpl <em>All Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.AllOfImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getAllOf()
	 * @generated
	 */
	int ALL_OF = 3;

	/**
	 * The feature id for the '<em><b>Match</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_OF__MATCH = 0;

	/**
	 * The number of structural features of the '<em>All Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_OF_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.MatchImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.ExpressionImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.ApplyImpl <em>Apply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.ApplyImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getApply()
	 * @generated
	 */
	int APPLY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY__ENTITY_NAME = EXPRESSION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY__PARAMETERS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY__OPERATION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Apply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeSelectionImpl <em>Attribute Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeSelectionImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getAttributeSelection()
	 * @generated
	 */
	int ATTRIBUTE_SELECTION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTION__ENTITY_NAME = EXPRESSION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTION__CATEGORY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Must Be Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTION__MUST_BE_PRESENT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeSelectorImpl <em>Attribute Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeSelectorImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getAttributeSelector()
	 * @generated
	 */
	int ATTRIBUTE_SELECTOR = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTOR__ID = ATTRIBUTE_SELECTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTOR__ENTITY_NAME = ATTRIBUTE_SELECTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTOR__CATEGORY = ATTRIBUTE_SELECTION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Must Be Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTOR__MUST_BE_PRESENT = ATTRIBUTE_SELECTION__MUST_BE_PRESENT;

	/**
	 * The number of structural features of the '<em>Attribute Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTOR_FEATURE_COUNT = ATTRIBUTE_SELECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.FunctionReferenceImpl <em>Function Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.FunctionReferenceImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getFunctionReference()
	 * @generated
	 */
	int FUNCTION_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REFERENCE__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REFERENCE__ENTITY_NAME = EXPRESSION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REFERENCE__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeDesignatorImpl <em>Attribute Designator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeDesignatorImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getAttributeDesignator()
	 * @generated
	 */
	int ATTRIBUTE_DESIGNATOR = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESIGNATOR__ID = ATTRIBUTE_SELECTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESIGNATOR__ENTITY_NAME = ATTRIBUTE_SELECTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESIGNATOR__CATEGORY = ATTRIBUTE_SELECTION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Must Be Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESIGNATOR__MUST_BE_PRESENT = ATTRIBUTE_SELECTION__MUST_BE_PRESENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESIGNATOR__ATTRIBUTE = ATTRIBUTE_SELECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESIGNATOR__TYPE = ATTRIBUTE_SELECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Designator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESIGNATOR_FEATURE_COUNT = ATTRIBUTE_SELECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.XMLStringImpl <em>XML String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.XMLStringImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getXMLString()
	 * @generated
	 */
	int XML_STRING = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_STRING__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_STRING__ENTITY_NAME = EXPRESSION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_STRING__STRING = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XML String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_STRING_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.VariableDefinitionsImpl <em>Variable Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.VariableDefinitionsImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getVariableDefinitions()
	 * @generated
	 */
	int VARIABLE_DEFINITIONS = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITIONS__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITIONS__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITIONS__EXPRESSION = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITIONS_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.VariableReferenceImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getVariableReference()
	 * @generated
	 */
	int VARIABLE_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__ENTITY_NAME = EXPRESSION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Variabledefinitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__VARIABLEDEFINITIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeValueReferenceImpl <em>Attribute Value Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeValueReferenceImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getAttributeValueReference()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REFERENCE__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REFERENCE__ENTITY_NAME = EXPRESSION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Attributevalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REFERENCE__ATTRIBUTEVALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Value Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.SimpleAttributeConditionImpl <em>Simple Attribute Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.SimpleAttributeConditionImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getSimpleAttributeCondition()
	 * @generated
	 */
	int SIMPLE_ATTRIBUTE_CONDITION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_CONDITION__ID = ATTRIBUTE_SELECTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_CONDITION__ENTITY_NAME = ATTRIBUTE_SELECTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_CONDITION__CATEGORY = ATTRIBUTE_SELECTION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Must Be Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_CONDITION__MUST_BE_PRESENT = ATTRIBUTE_SELECTION__MUST_BE_PRESENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_CONDITION__ATTRIBUTE = ATTRIBUTE_SELECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_CONDITION__ONLY = ATTRIBUTE_SELECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Attribute Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_CONDITION_FEATURE_COUNT = ATTRIBUTE_SELECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.PermitType <em>Permit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PermitType
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getPermitType()
	 * @generated
	 */
	int PERMIT_TYPE = 16;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicyCombiningAlgorithm <em>Combining Algorithm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyCombiningAlgorithm
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getPolicyCombiningAlgorithm()
	 * @generated
	 */
	int POLICY_COMBINING_ALGORITHM = 17;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.RuleCombiningAlgorihtm <em>Rule Combining Algorihtm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.RuleCombiningAlgorihtm
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getRuleCombiningAlgorihtm()
	 * @generated
	 */
	int RULE_COMBINING_ALGORIHTM = 18;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Operations <em>Operations</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Operations
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getOperations()
	 * @generated
	 */
	int OPERATIONS = 19;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Category <em>Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Category
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 20;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet
	 * @generated
	 */
	EClass getPolicySet();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet#getCombiningAlgorithm <em>Combining Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Combining Algorithm</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet#getCombiningAlgorithm()
	 * @see #getPolicySet()
	 * @generated
	 */
	EAttribute getPolicySet_CombiningAlgorithm();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet#getPolicyset <em>Policyset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policyset</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet#getPolicyset()
	 * @see #getPolicySet()
	 * @generated
	 */
	EReference getPolicySet_Policyset();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet#getPolicy()
	 * @see #getPolicySet()
	 * @generated
	 */
	EReference getPolicySet_Policy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet#getTarget()
	 * @see #getPolicySet()
	 * @generated
	 */
	EReference getPolicySet_Target();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Policy
	 * @generated
	 */
	EClass getPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Policy#getCombiningAlgorithm <em>Combining Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Combining Algorithm</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Policy#getCombiningAlgorithm()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_CombiningAlgorithm();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Policy#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Policy#getRule()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Rule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Policy#getVariabledefinitions <em>Variabledefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variabledefinitions</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Policy#getVariabledefinitions()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Variabledefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Policy#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Policy#getTarget()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Target();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Rule#getPermit <em>Permit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permit</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Rule#getPermit()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Permit();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Rule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Rule#getCondition()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Rule#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Rule#getTarget()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Target();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.AllOf <em>All Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Of</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.AllOf
	 * @generated
	 */
	EClass getAllOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.policy.AllOf#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Match</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.AllOf#getMatch()
	 * @see #getAllOf()
	 * @generated
	 */
	EReference getAllOf_Match();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Apply <em>Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apply</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Apply
	 * @generated
	 */
	EClass getApply();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Apply#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Apply#getParameters()
	 * @see #getApply()
	 * @generated
	 */
	EReference getApply_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Apply#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Apply#getOperation()
	 * @see #getApply()
	 * @generated
	 */
	EAttribute getApply_Operation();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeSelector <em>Attribute Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Selector</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.AttributeSelector
	 * @generated
	 */
	EClass getAttributeSelector();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.FunctionReference <em>Function Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Reference</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.FunctionReference
	 * @generated
	 */
	EClass getFunctionReference();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.policy.FunctionReference#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.FunctionReference#getFunction()
	 * @see #getFunctionReference()
	 * @generated
	 */
	EAttribute getFunctionReference_Function();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeDesignator <em>Attribute Designator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Designator</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.AttributeDesignator
	 * @generated
	 */
	EClass getAttributeDesignator();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeDesignator#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.AttributeDesignator#getAttribute()
	 * @see #getAttributeDesignator()
	 * @generated
	 */
	EReference getAttributeDesignator_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeDesignator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.AttributeDesignator#getType()
	 * @see #getAttributeDesignator()
	 * @generated
	 */
	EAttribute getAttributeDesignator_Type();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.XMLString <em>XML String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML String</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.XMLString
	 * @generated
	 */
	EClass getXMLString();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.policy.XMLString#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.XMLString#getString()
	 * @see #getXMLString()
	 * @generated
	 */
	EAttribute getXMLString_String();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.VariableDefinitions <em>Variable Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Definitions</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.VariableDefinitions
	 * @generated
	 */
	EClass getVariableDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.confidentiality.context.policy.VariableDefinitions#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.VariableDefinitions#getExpression()
	 * @see #getVariableDefinitions()
	 * @generated
	 */
	EReference getVariableDefinitions_Expression();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.VariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Reference</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.VariableReference
	 * @generated
	 */
	EClass getVariableReference();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.policy.VariableReference#getVariabledefinitions <em>Variabledefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variabledefinitions</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.VariableReference#getVariabledefinitions()
	 * @see #getVariableReference()
	 * @generated
	 */
	EReference getVariableReference_Variabledefinitions();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeValueReference <em>Attribute Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Reference</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.AttributeValueReference
	 * @generated
	 */
	EClass getAttributeValueReference();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeValueReference#getAttributevalue <em>Attributevalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributevalue</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.AttributeValueReference#getAttributevalue()
	 * @see #getAttributeValueReference()
	 * @generated
	 */
	EReference getAttributeValueReference_Attributevalue();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeSelection <em>Attribute Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Selection</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.AttributeSelection
	 * @generated
	 */
	EClass getAttributeSelection();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeSelection#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.AttributeSelection#getCategory()
	 * @see #getAttributeSelection()
	 * @generated
	 */
	EAttribute getAttributeSelection_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeSelection#isMustBePresent <em>Must Be Present</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Be Present</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.AttributeSelection#isMustBePresent()
	 * @see #getAttributeSelection()
	 * @generated
	 */
	EAttribute getAttributeSelection_MustBePresent();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.SimpleAttributeCondition <em>Simple Attribute Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Attribute Condition</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.SimpleAttributeCondition
	 * @generated
	 */
	EClass getSimpleAttributeCondition();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.policy.SimpleAttributeCondition#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.SimpleAttributeCondition#getAttribute()
	 * @see #getSimpleAttributeCondition()
	 * @generated
	 */
	EReference getSimpleAttributeCondition_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.policy.SimpleAttributeCondition#isOnly <em>Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.SimpleAttributeCondition#isOnly()
	 * @see #getSimpleAttributeCondition()
	 * @generated
	 */
	EAttribute getSimpleAttributeCondition_Only();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.pcm.confidentiality.context.policy.PermitType <em>Permit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Permit Type</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PermitType
	 * @generated
	 */
	EEnum getPermitType();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicyCombiningAlgorithm <em>Combining Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Combining Algorithm</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyCombiningAlgorithm
	 * @generated
	 */
	EEnum getPolicyCombiningAlgorithm();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.pcm.confidentiality.context.policy.RuleCombiningAlgorihtm <em>Rule Combining Algorihtm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Combining Algorihtm</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.RuleCombiningAlgorihtm
	 * @generated
	 */
	EEnum getRuleCombiningAlgorihtm();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Operations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operations</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Operations
	 * @generated
	 */
	EEnum getOperations();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Category
	 * @generated
	 */
	EEnum getCategory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolicyFactory getPolicyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicySetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicySetImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getPolicySet()
		 * @generated
		 */
		EClass POLICY_SET = eINSTANCE.getPolicySet();

		/**
		 * The meta object literal for the '<em><b>Combining Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_SET__COMBINING_ALGORITHM = eINSTANCE.getPolicySet_CombiningAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Policyset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_SET__POLICYSET = eINSTANCE.getPolicySet_Policyset();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_SET__POLICY = eINSTANCE.getPolicySet_Policy();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_SET__TARGET = eINSTANCE.getPolicySet_Target();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getPolicy()
		 * @generated
		 */
		EClass POLICY = eINSTANCE.getPolicy();

		/**
		 * The meta object literal for the '<em><b>Combining Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY__COMBINING_ALGORITHM = eINSTANCE.getPolicy_CombiningAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__RULE = eINSTANCE.getPolicy_Rule();

		/**
		 * The meta object literal for the '<em><b>Variabledefinitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__VARIABLEDEFINITIONS = eINSTANCE.getPolicy_Variabledefinitions();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__TARGET = eINSTANCE.getPolicy_Target();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.RuleImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Permit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__PERMIT = eINSTANCE.getRule_Permit();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__CONDITION = eINSTANCE.getRule_Condition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__TARGET = eINSTANCE.getRule_Target();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.AllOfImpl <em>All Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.AllOfImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getAllOf()
		 * @generated
		 */
		EClass ALL_OF = eINSTANCE.getAllOf();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_OF__MATCH = eINSTANCE.getAllOf_Match();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.MatchImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.ApplyImpl <em>Apply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.ApplyImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getApply()
		 * @generated
		 */
		EClass APPLY = eINSTANCE.getApply();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLY__PARAMETERS = eINSTANCE.getApply_Parameters();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLY__OPERATION = eINSTANCE.getApply_Operation();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeSelectorImpl <em>Attribute Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeSelectorImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getAttributeSelector()
		 * @generated
		 */
		EClass ATTRIBUTE_SELECTOR = eINSTANCE.getAttributeSelector();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.FunctionReferenceImpl <em>Function Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.FunctionReferenceImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getFunctionReference()
		 * @generated
		 */
		EClass FUNCTION_REFERENCE = eINSTANCE.getFunctionReference();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_REFERENCE__FUNCTION = eINSTANCE.getFunctionReference_Function();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeDesignatorImpl <em>Attribute Designator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeDesignatorImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getAttributeDesignator()
		 * @generated
		 */
		EClass ATTRIBUTE_DESIGNATOR = eINSTANCE.getAttributeDesignator();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DESIGNATOR__ATTRIBUTE = eINSTANCE.getAttributeDesignator_Attribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DESIGNATOR__TYPE = eINSTANCE.getAttributeDesignator_Type();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.XMLStringImpl <em>XML String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.XMLStringImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getXMLString()
		 * @generated
		 */
		EClass XML_STRING = eINSTANCE.getXMLString();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_STRING__STRING = eINSTANCE.getXMLString_String();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.ExpressionImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.VariableDefinitionsImpl <em>Variable Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.VariableDefinitionsImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getVariableDefinitions()
		 * @generated
		 */
		EClass VARIABLE_DEFINITIONS = eINSTANCE.getVariableDefinitions();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DEFINITIONS__EXPRESSION = eINSTANCE.getVariableDefinitions_Expression();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.VariableReferenceImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getVariableReference()
		 * @generated
		 */
		EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

		/**
		 * The meta object literal for the '<em><b>Variabledefinitions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REFERENCE__VARIABLEDEFINITIONS = eINSTANCE.getVariableReference_Variabledefinitions();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeValueReferenceImpl <em>Attribute Value Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeValueReferenceImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getAttributeValueReference()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_REFERENCE = eINSTANCE.getAttributeValueReference();

		/**
		 * The meta object literal for the '<em><b>Attributevalue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_REFERENCE__ATTRIBUTEVALUE = eINSTANCE.getAttributeValueReference_Attributevalue();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeSelectionImpl <em>Attribute Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeSelectionImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getAttributeSelection()
		 * @generated
		 */
		EClass ATTRIBUTE_SELECTION = eINSTANCE.getAttributeSelection();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_SELECTION__CATEGORY = eINSTANCE.getAttributeSelection_Category();

		/**
		 * The meta object literal for the '<em><b>Must Be Present</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_SELECTION__MUST_BE_PRESENT = eINSTANCE.getAttributeSelection_MustBePresent();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.SimpleAttributeConditionImpl <em>Simple Attribute Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.SimpleAttributeConditionImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getSimpleAttributeCondition()
		 * @generated
		 */
		EClass SIMPLE_ATTRIBUTE_CONDITION = eINSTANCE.getSimpleAttributeCondition();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_ATTRIBUTE_CONDITION__ATTRIBUTE = eINSTANCE.getSimpleAttributeCondition_Attribute();

		/**
		 * The meta object literal for the '<em><b>Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_ATTRIBUTE_CONDITION__ONLY = eINSTANCE.getSimpleAttributeCondition_Only();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.PermitType <em>Permit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PermitType
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getPermitType()
		 * @generated
		 */
		EEnum PERMIT_TYPE = eINSTANCE.getPermitType();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicyCombiningAlgorithm <em>Combining Algorithm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyCombiningAlgorithm
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getPolicyCombiningAlgorithm()
		 * @generated
		 */
		EEnum POLICY_COMBINING_ALGORITHM = eINSTANCE.getPolicyCombiningAlgorithm();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.RuleCombiningAlgorihtm <em>Rule Combining Algorihtm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.RuleCombiningAlgorihtm
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getRuleCombiningAlgorihtm()
		 * @generated
		 */
		EEnum RULE_COMBINING_ALGORIHTM = eINSTANCE.getRuleCombiningAlgorihtm();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Operations <em>Operations</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Operations
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getOperations()
		 * @generated
		 */
		EEnum OPERATIONS = eINSTANCE.getOperations();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Category <em>Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Category
		 * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getCategory()
		 * @generated
		 */
		EEnum CATEGORY = eINSTANCE.getCategory();

	}

} //PolicyPackage
