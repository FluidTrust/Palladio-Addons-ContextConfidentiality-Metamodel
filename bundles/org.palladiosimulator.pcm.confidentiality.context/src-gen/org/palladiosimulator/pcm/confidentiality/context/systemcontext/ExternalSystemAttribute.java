/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External System Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.ExternalSystemAttribute#getExternalName <em>External Name</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage#getExternalSystemAttribute()
 * @model
 * @generated
 */
public interface ExternalSystemAttribute extends EnvironmentSubject
{
	/**
	 * Returns the value of the '<em><b>External Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Name</em>' attribute.
	 * @see #setExternalName(String)
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage#getExternalSystemAttribute_ExternalName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getExternalName();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.ExternalSystemAttribute#getExternalName <em>External Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Name</em>' attribute.
	 * @see #getExternalName()
	 * @generated
	 */
	void setExternalName(String value);

} // ExternalSystemAttribute
