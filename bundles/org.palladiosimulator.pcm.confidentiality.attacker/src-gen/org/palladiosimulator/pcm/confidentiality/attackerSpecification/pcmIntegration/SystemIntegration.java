/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Integration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration#getPcmelement <em>Pcmelement</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage#getSystemIntegration()
 * @model abstract="true"
 * @generated
 */
public interface SystemIntegration extends Entity {
	/**
	 * Returns the value of the '<em><b>Pcmelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcmelement</em>' containment reference.
	 * @see #setPcmelement(PCMElement)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage#getSystemIntegration_Pcmelement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PCMElement getPcmelement();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration#getPcmelement <em>Pcmelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcmelement</em>' containment reference.
	 * @see #getPcmelement()
	 * @generated
	 */
	void setPcmelement(PCMElement value);

} // SystemIntegration
