/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.EnvironmentSubject#isEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage#getEnvironmentSubject()
 * @model abstract="true"
 * @generated
 */
public interface EnvironmentSubject extends Attribute
{
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(boolean)
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage#getEnvironmentSubject_Environment()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isEnvironment();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.EnvironmentSubject#isEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #isEnvironment()
	 * @generated
	 */
	void setEnvironment(boolean value);

} // EnvironmentSubject
