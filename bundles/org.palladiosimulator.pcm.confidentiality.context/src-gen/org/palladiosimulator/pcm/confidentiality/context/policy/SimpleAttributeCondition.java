/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;

import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Attribute Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.SimpleAttributeCondition#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.SimpleAttributeCondition#isOnly <em>Only</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getSimpleAttributeCondition()
 * @model
 * @generated
 */
public interface SimpleAttributeCondition extends AttributeSelection
{
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(UsageSpecification)
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getSimpleAttributeCondition_Attribute()
	 * @model required="true"
	 * @generated
	 */
	UsageSpecification getAttribute();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.SimpleAttributeCondition#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(UsageSpecification value);

	/**
	 * Returns the value of the '<em><b>Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Only</em>' attribute.
	 * @see #setOnly(boolean)
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getSimpleAttributeCondition_Only()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isOnly();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.SimpleAttributeCondition#isOnly <em>Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only</em>' attribute.
	 * @see #isOnly()
	 * @generated
	 */
	void setOnly(boolean value);

} // SimpleAttributeCondition
