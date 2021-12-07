/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.PCMBaseClass;
import org.palladiosimulator.pcm.PCMClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.*;

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
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage
 * @generated
 */
public class AttackSpecificationSwitch<T1> extends Switch<T1>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AttackSpecificationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackSpecificationSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = AttackSpecificationPackage.eINSTANCE;
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
	protected boolean isSwitchFor(EPackage ePackage)
	{
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
	protected T1 doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case AttackSpecificationPackage.ATTACK:
			{
				Attack attack = (Attack)theEObject;
				T1 result = caseAttack(attack);
				if (result == null) result = caseEntity(attack);
				if (result == null) result = caseIdentifier(attack);
				if (result == null) result = caseNamedElement(attack);
				if (result == null) result = casePCMBaseClass(attack);
				if (result == null) result = casePCMClass(attack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackSpecificationPackage.VULNERABILITY:
			{
				Vulnerability vulnerability = (Vulnerability)theEObject;
				T1 result = caseVulnerability(vulnerability);
				if (result == null) result = caseEntity(vulnerability);
				if (result == null) result = caseIdentifier(vulnerability);
				if (result == null) result = caseNamedElement(vulnerability);
				if (result == null) result = casePCMBaseClass(vulnerability);
				if (result == null) result = casePCMClass(vulnerability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackSpecificationPackage.CATEGORY_ATTACK:
			{
				CategoryAttack<?> categoryAttack = (CategoryAttack<?>)theEObject;
				T1 result = caseCategoryAttack(categoryAttack);
				if (result == null) result = caseAttack(categoryAttack);
				if (result == null) result = caseEntity(categoryAttack);
				if (result == null) result = caseIdentifier(categoryAttack);
				if (result == null) result = caseNamedElement(categoryAttack);
				if (result == null) result = casePCMBaseClass(categoryAttack);
				if (result == null) result = casePCMClass(categoryAttack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackSpecificationPackage.CVE_VULNERABILITY:
			{
				CVEVulnerability cveVulnerability = (CVEVulnerability)theEObject;
				T1 result = caseCVEVulnerability(cveVulnerability);
				if (result == null) result = caseCWEBasedVulnerability(cveVulnerability);
				if (result == null) result = caseVulnerability(cveVulnerability);
				if (result == null) result = caseEntity(cveVulnerability);
				if (result == null) result = caseIdentifier(cveVulnerability);
				if (result == null) result = caseNamedElement(cveVulnerability);
				if (result == null) result = casePCMBaseClass(cveVulnerability);
				if (result == null) result = casePCMClass(cveVulnerability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackSpecificationPackage.CWEID:
			{
				CWEID cweid = (CWEID)theEObject;
				T1 result = caseCWEID(cweid);
				if (result == null) result = caseAttackCategory(cweid);
				if (result == null) result = caseNamedElement(cweid);
				if (result == null) result = casePCMBaseClass(cweid);
				if (result == null) result = casePCMClass(cweid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackSpecificationPackage.ATTACK_CATEGORY:
			{
				AttackCategory attackCategory = (AttackCategory)theEObject;
				T1 result = caseAttackCategory(attackCategory);
				if (result == null) result = caseNamedElement(attackCategory);
				if (result == null) result = casePCMBaseClass(attackCategory);
				if (result == null) result = casePCMClass(attackCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackSpecificationPackage.CWE_ATTACK:
			{
				CWEAttack cweAttack = (CWEAttack)theEObject;
				T1 result = caseCWEAttack(cweAttack);
				if (result == null) result = caseCategoryAttack(cweAttack);
				if (result == null) result = caseAttack(cweAttack);
				if (result == null) result = caseEntity(cweAttack);
				if (result == null) result = caseIdentifier(cweAttack);
				if (result == null) result = caseNamedElement(cweAttack);
				if (result == null) result = casePCMBaseClass(cweAttack);
				if (result == null) result = casePCMClass(cweAttack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackSpecificationPackage.CVE_ATTACK:
			{
				CVEAttack cveAttack = (CVEAttack)theEObject;
				T1 result = caseCVEAttack(cveAttack);
				if (result == null) result = caseCategoryAttack(cveAttack);
				if (result == null) result = caseAttack(cveAttack);
				if (result == null) result = caseEntity(cveAttack);
				if (result == null) result = caseIdentifier(cveAttack);
				if (result == null) result = caseNamedElement(cveAttack);
				if (result == null) result = casePCMBaseClass(cveAttack);
				if (result == null) result = casePCMClass(cveAttack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackSpecificationPackage.CVEID:
			{
				CVEID cveid = (CVEID)theEObject;
				T1 result = caseCVEID(cveid);
				if (result == null) result = caseAttackCategory(cveid);
				if (result == null) result = caseNamedElement(cveid);
				if (result == null) result = casePCMBaseClass(cveid);
				if (result == null) result = casePCMClass(cveid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackSpecificationPackage.CWE_VULNERABILITY:
			{
				CWEVulnerability cweVulnerability = (CWEVulnerability)theEObject;
				T1 result = caseCWEVulnerability(cweVulnerability);
				if (result == null) result = caseVulnerability(cweVulnerability);
				if (result == null) result = caseCWEBasedVulnerability(cweVulnerability);
				if (result == null) result = caseEntity(cweVulnerability);
				if (result == null) result = caseIdentifier(cweVulnerability);
				if (result == null) result = caseNamedElement(cweVulnerability);
				if (result == null) result = casePCMBaseClass(cweVulnerability);
				if (result == null) result = casePCMClass(cweVulnerability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackSpecificationPackage.CWE_BASED_VULNERABILITY:
			{
				CWEBasedVulnerability cweBasedVulnerability = (CWEBasedVulnerability)theEObject;
				T1 result = caseCWEBasedVulnerability(cweBasedVulnerability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackSpecificationPackage.ROLE:
			{
				Role role = (Role)theEObject;
				T1 result = caseRole(role);
				if (result == null) result = caseEntity(role);
				if (result == null) result = caseIdentifier(role);
				if (result == null) result = caseNamedElement(role);
				if (result == null) result = casePCMBaseClass(role);
				if (result == null) result = casePCMClass(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAttack(Attack object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vulnerability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vulnerability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVulnerability(Vulnerability object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Attack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Attack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends AttackCategory> T1 caseCategoryAttack(CategoryAttack<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CVE Vulnerability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CVE Vulnerability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCVEVulnerability(CVEVulnerability object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CWEID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CWEID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCWEID(CWEID object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attack Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attack Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAttackCategory(AttackCategory object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CWE Attack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CWE Attack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCWEAttack(CWEAttack object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CVE Attack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CVE Attack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCVEAttack(CVEAttack object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CVEID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CVEID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCVEID(CVEID object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CWE Vulnerability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CWE Vulnerability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCWEVulnerability(CWEVulnerability object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CWE Based Vulnerability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CWE Based Vulnerability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCWEBasedVulnerability(CWEBasedVulnerability object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRole(Role object)
	{
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
	public T1 caseIdentifier(Identifier object)
	{
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
	public T1 casePCMClass(PCMClass object)
	{
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
	public T1 casePCMBaseClass(PCMBaseClass object)
	{
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
	public T1 caseNamedElement(NamedElement object)
	{
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
	public T1 caseEntity(Entity object)
	{
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
	public T1 defaultCase(EObject object)
	{
		return null;
	}

} //AttackSpecificationSwitch
