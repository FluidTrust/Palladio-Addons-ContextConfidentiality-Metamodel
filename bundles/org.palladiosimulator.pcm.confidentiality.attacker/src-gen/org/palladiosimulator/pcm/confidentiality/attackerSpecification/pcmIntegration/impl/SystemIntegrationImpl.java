/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Integration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.SystemIntegrationImpl#getPcmelement <em>Pcmelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SystemIntegrationImpl extends EntityImpl implements SystemIntegration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemIntegrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmIntegrationPackage.Literals.SYSTEM_INTEGRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMElement getPcmelement() {
		return (PCMElement) eGet(PcmIntegrationPackage.Literals.SYSTEM_INTEGRATION__PCMELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmelement(PCMElement newPcmelement) {
		eSet(PcmIntegrationPackage.Literals.SYSTEM_INTEGRATION__PCMELEMENT, newPcmelement);
	}

} //SystemIntegrationImpl
