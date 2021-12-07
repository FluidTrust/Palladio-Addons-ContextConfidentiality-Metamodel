/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.Apply#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.Apply#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getApply()
 * @model
 * @generated
 */
public interface Apply extends Expression
{
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.policy.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getApply_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	List<Expression> getParameters();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.pcm.confidentiality.context.policy.Operations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Operations
	 * @see #setOperation(Operations)
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getApply_Operation()
	 * @model
	 * @generated
	 */
	Operations getOperation();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Apply#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Operations
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operations value);

} // Apply
