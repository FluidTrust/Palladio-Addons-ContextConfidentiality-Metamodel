/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.VariableReference#getVariabledefinitions <em>Variabledefinitions</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getVariableReference()
 * @model
 * @generated
 */
public interface VariableReference extends Expression
{
	/**
	 * Returns the value of the '<em><b>Variabledefinitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variabledefinitions</em>' reference.
	 * @see #setVariabledefinitions(VariableDefinitions)
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getVariableReference_Variabledefinitions()
	 * @model required="true"
	 * @generated
	 */
	VariableDefinitions getVariabledefinitions();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.VariableReference#getVariabledefinitions <em>Variabledefinitions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variabledefinitions</em>' reference.
	 * @see #getVariabledefinitions()
	 * @generated
	 */
	void setVariabledefinitions(VariableDefinitions value);

} // VariableReference
