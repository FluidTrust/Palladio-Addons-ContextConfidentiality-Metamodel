/**
 */
package org.palladiosimulator.pcm.confidentiality.context;

import org.eclipse.emf.cdo.CDOObject;

import org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet;

import org.palladiosimulator.pcm.confidentiality.context.system.SystemSpecificationContainer;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attributes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Confidential Access Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getPcmspecificationcontainer <em>Pcmspecificationcontainer</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getPolicyset <em>Policyset</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.ContextPackage#getConfidentialAccessSpecification()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ConfidentialAccessSpecification extends CDOObject
{
	/**
	 * Returns the value of the '<em><b>Pcmspecificationcontainer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcmspecificationcontainer</em>' containment reference.
	 * @see #setPcmspecificationcontainer(SystemSpecificationContainer)
	 * @see org.palladiosimulator.pcm.confidentiality.context.ContextPackage#getConfidentialAccessSpecification_Pcmspecificationcontainer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SystemSpecificationContainer getPcmspecificationcontainer();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getPcmspecificationcontainer <em>Pcmspecificationcontainer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcmspecificationcontainer</em>' containment reference.
	 * @see #getPcmspecificationcontainer()
	 * @generated
	 */
	void setPcmspecificationcontainer(SystemSpecificationContainer value);

	/**
	 * Returns the value of the '<em><b>Policyset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policyset</em>' containment reference.
	 * @see #setPolicyset(PolicySet)
	 * @see org.palladiosimulator.pcm.confidentiality.context.ContextPackage#getConfidentialAccessSpecification_Policyset()
	 * @model containment="true"
	 * @generated
	 */
	PolicySet getPolicyset();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getPolicyset <em>Policyset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policyset</em>' containment reference.
	 * @see #getPolicyset()
	 * @generated
	 */
	void setPolicyset(PolicySet value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(Attributes)
	 * @see org.palladiosimulator.pcm.confidentiality.context.ContextPackage#getConfidentialAccessSpecification_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	Attributes getAttributes();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(Attributes value);

} // ConfidentialAccessSpecification
