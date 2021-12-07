/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage
 * @generated
 */
public interface PolicyFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolicyFactory eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set</em>'.
	 * @generated
	 */
	PolicySet createPolicySet();

	/**
	 * Returns a new object of class '<em>Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy</em>'.
	 * @generated
	 */
	Policy createPolicy();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>All Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Of</em>'.
	 * @generated
	 */
	AllOf createAllOf();

	/**
	 * Returns a new object of class '<em>Apply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apply</em>'.
	 * @generated
	 */
	Apply createApply();

	/**
	 * Returns a new object of class '<em>Attribute Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Selector</em>'.
	 * @generated
	 */
	AttributeSelector createAttributeSelector();

	/**
	 * Returns a new object of class '<em>Function Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Reference</em>'.
	 * @generated
	 */
	FunctionReference createFunctionReference();

	/**
	 * Returns a new object of class '<em>Attribute Designator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Designator</em>'.
	 * @generated
	 */
	AttributeDesignator createAttributeDesignator();

	/**
	 * Returns a new object of class '<em>XML String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML String</em>'.
	 * @generated
	 */
	XMLString createXMLString();

	/**
	 * Returns a new object of class '<em>Variable Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Definitions</em>'.
	 * @generated
	 */
	VariableDefinitions createVariableDefinitions();

	/**
	 * Returns a new object of class '<em>Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Reference</em>'.
	 * @generated
	 */
	VariableReference createVariableReference();

	/**
	 * Returns a new object of class '<em>Attribute Value Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Reference</em>'.
	 * @generated
	 */
	AttributeValueReference createAttributeValueReference();

	/**
	 * Returns a new object of class '<em>Simple Attribute Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Attribute Condition</em>'.
	 * @generated
	 */
	SimpleAttributeCondition createSimpleAttributeCondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PolicyPackage getPolicyPackage();

} //PolicyFactory
