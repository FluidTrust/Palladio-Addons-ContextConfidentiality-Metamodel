/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;

import java.util.List;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet#getCombiningAlgorithm <em>Combining Algorithm</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet#getPolicyset <em>Policyset</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getPolicySet()
 * @model
 * @generated
 */
public interface PolicySet extends Entity
{
	/**
	 * Returns the value of the '<em><b>Combining Algorithm</b></em>' attribute.
	 * The default value is <code>"DENY_UNLESS_PERMIT"</code>.
	 * The literals are from the enumeration {@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicyCombiningAlgorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combining Algorithm</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyCombiningAlgorithm
	 * @see #setCombiningAlgorithm(PolicyCombiningAlgorithm)
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getPolicySet_CombiningAlgorithm()
	 * @model default="DENY_UNLESS_PERMIT"
	 * @generated
	 */
	PolicyCombiningAlgorithm getCombiningAlgorithm();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet#getCombiningAlgorithm <em>Combining Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combining Algorithm</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyCombiningAlgorithm
	 * @see #getCombiningAlgorithm()
	 * @generated
	 */
	void setCombiningAlgorithm(PolicyCombiningAlgorithm value);

	/**
	 * Returns the value of the '<em><b>Policyset</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policyset</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getPolicySet_Policyset()
	 * @model containment="true"
	 * @generated
	 */
	List<PolicySet> getPolicyset();

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.policy.Policy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getPolicySet_Policy()
	 * @model containment="true"
	 * @generated
	 */
	List<Policy> getPolicy();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.policy.AllOf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getPolicySet_Target()
	 * @model containment="true"
	 * @generated
	 */
	List<AllOf> getTarget();

} // PolicySet
