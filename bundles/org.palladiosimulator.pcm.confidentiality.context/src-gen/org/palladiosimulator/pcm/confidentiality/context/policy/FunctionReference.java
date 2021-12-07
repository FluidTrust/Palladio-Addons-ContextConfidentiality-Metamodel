/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.FunctionReference#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getFunctionReference()
 * @model
 * @generated
 */
public interface FunctionReference extends Expression
{
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The default value is <code>"STRING_EQUAL"</code>.
	 * The literals are from the enumeration {@link org.palladiosimulator.pcm.confidentiality.context.policy.Operations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Operations
	 * @see #setFunction(Operations)
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getFunctionReference_Function()
	 * @model default="STRING_EQUAL" required="true"
	 * @generated
	 */
	Operations getFunction();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.FunctionReference#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Operations
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Operations value);

} // FunctionReference
