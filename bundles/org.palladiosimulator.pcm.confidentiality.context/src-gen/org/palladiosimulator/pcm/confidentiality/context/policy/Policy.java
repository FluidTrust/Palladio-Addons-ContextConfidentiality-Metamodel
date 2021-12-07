/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;

import java.util.List;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.Policy#getCombiningAlgorithm <em>Combining Algorithm</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.Policy#getRule <em>Rule</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.Policy#getVariabledefinitions <em>Variabledefinitions</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.Policy#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getPolicy()
 * @model
 * @generated
 */
public interface Policy extends Entity
{
	/**
	 * Returns the value of the '<em><b>Combining Algorithm</b></em>' attribute.
	 * The default value is <code>"DENY_UNLESS_PERMIT"</code>.
	 * The literals are from the enumeration {@link org.palladiosimulator.pcm.confidentiality.context.policy.RuleCombiningAlgorihtm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combining Algorithm</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.RuleCombiningAlgorihtm
	 * @see #setCombiningAlgorithm(RuleCombiningAlgorihtm)
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getPolicy_CombiningAlgorithm()
	 * @model default="DENY_UNLESS_PERMIT"
	 * @generated
	 */
	RuleCombiningAlgorihtm getCombiningAlgorithm();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Policy#getCombiningAlgorithm <em>Combining Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combining Algorithm</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.RuleCombiningAlgorihtm
	 * @see #getCombiningAlgorithm()
	 * @generated
	 */
	void setCombiningAlgorithm(RuleCombiningAlgorihtm value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.policy.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getPolicy_Rule()
	 * @model containment="true"
	 * @generated
	 */
	List<Rule> getRule();

	/**
	 * Returns the value of the '<em><b>Variabledefinitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.policy.VariableDefinitions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variabledefinitions</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getPolicy_Variabledefinitions()
	 * @model containment="true"
	 * @generated
	 */
	List<VariableDefinitions> getVariabledefinitions();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.policy.AllOf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getPolicy_Target()
	 * @model containment="true"
	 * @generated
	 */
	List<AllOf> getTarget();

} // Policy
