/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.PCMBaseClass;
import org.palladiosimulator.pcm.PCMClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.*;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage
 * @generated
 */
public class PcmIntegrationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PcmIntegrationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmIntegrationSwitch() {
		if (modelPackage == null) {
			modelPackage = PcmIntegrationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case PcmIntegrationPackage.VULNERABILITY_SYSTEM_INTEGRATION: {
			VulnerabilitySystemIntegration vulnerabilitySystemIntegration = (VulnerabilitySystemIntegration) theEObject;
			T result = caseVulnerabilitySystemIntegration(vulnerabilitySystemIntegration);
			if (result == null)
				result = caseSystemIntegration(vulnerabilitySystemIntegration);
			if (result == null)
				result = caseEntity(vulnerabilitySystemIntegration);
			if (result == null)
				result = caseIdentifier(vulnerabilitySystemIntegration);
			if (result == null)
				result = caseNamedElement(vulnerabilitySystemIntegration);
			if (result == null)
				result = casePCMBaseClass(vulnerabilitySystemIntegration);
			if (result == null)
				result = casePCMClass(vulnerabilitySystemIntegration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PcmIntegrationPackage.PCM_ELEMENT: {
			PCMElement pcmElement = (PCMElement) theEObject;
			T result = casePCMElement(pcmElement);
			if (result == null)
				result = caseEntity(pcmElement);
			if (result == null)
				result = caseIdentifier(pcmElement);
			if (result == null)
				result = caseNamedElement(pcmElement);
			if (result == null)
				result = casePCMBaseClass(pcmElement);
			if (result == null)
				result = casePCMClass(pcmElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PcmIntegrationPackage.ROLE_SYSTEM_INTEGRATION: {
			RoleSystemIntegration roleSystemIntegration = (RoleSystemIntegration) theEObject;
			T result = caseRoleSystemIntegration(roleSystemIntegration);
			if (result == null)
				result = caseSystemIntegration(roleSystemIntegration);
			if (result == null)
				result = caseEntity(roleSystemIntegration);
			if (result == null)
				result = caseIdentifier(roleSystemIntegration);
			if (result == null)
				result = caseNamedElement(roleSystemIntegration);
			if (result == null)
				result = casePCMBaseClass(roleSystemIntegration);
			if (result == null)
				result = casePCMClass(roleSystemIntegration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PcmIntegrationPackage.SYSTEM_INTEGRATION: {
			SystemIntegration systemIntegration = (SystemIntegration) theEObject;
			T result = caseSystemIntegration(systemIntegration);
			if (result == null)
				result = caseEntity(systemIntegration);
			if (result == null)
				result = caseIdentifier(systemIntegration);
			if (result == null)
				result = caseNamedElement(systemIntegration);
			if (result == null)
				result = casePCMBaseClass(systemIntegration);
			if (result == null)
				result = casePCMClass(systemIntegration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PcmIntegrationPackage.NON_GLOBAL_COMMUNICATION: {
			NonGlobalCommunication nonGlobalCommunication = (NonGlobalCommunication) theEObject;
			T result = caseNonGlobalCommunication(nonGlobalCommunication);
			if (result == null)
				result = caseSystemIntegration(nonGlobalCommunication);
			if (result == null)
				result = caseEntity(nonGlobalCommunication);
			if (result == null)
				result = caseIdentifier(nonGlobalCommunication);
			if (result == null)
				result = caseNamedElement(nonGlobalCommunication);
			if (result == null)
				result = casePCMBaseClass(nonGlobalCommunication);
			if (result == null)
				result = casePCMClass(nonGlobalCommunication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vulnerability System Integration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vulnerability System Integration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVulnerabilitySystemIntegration(VulnerabilitySystemIntegration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMElement(PCMElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role System Integration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role System Integration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleSystemIntegration(RoleSystemIntegration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Integration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Integration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemIntegration(SystemIntegration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Global Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Global Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonGlobalCommunication(NonGlobalCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMClass(PCMClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Base Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Base Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMBaseClass(PCMBaseClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PcmIntegrationSwitch
