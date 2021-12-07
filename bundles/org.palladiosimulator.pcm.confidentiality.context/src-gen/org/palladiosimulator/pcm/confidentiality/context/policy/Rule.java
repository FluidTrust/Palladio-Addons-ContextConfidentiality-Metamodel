/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;

import java.util.List;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.Rule#getPermit <em>Permit</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.Rule#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.Rule#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends Entity
{
	/**
	 * Returns the value of the '<em><b>Permit</b></em>' attribute.
	 * The default value is <code>"PERMIT"</code>.
	 * The literals are from the enumeration {@link org.palladiosimulator.pcm.confidentiality.context.policy.PermitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permit</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PermitType
	 * @see #setPermit(PermitType)
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getRule_Permit()
	 * @model default="PERMIT"
	 * @generated
	 */
	PermitType getPermit();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Rule#getPermit <em>Permit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permit</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PermitType
	 * @see #getPermit()
	 * @generated
	 */
	void setPermit(PermitType value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getRule_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Rule#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.policy.AllOf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getRule_Target()
	 * @model containment="true"
	 * @generated
	 */
	List<AllOf> getTarget();

} // Rule
