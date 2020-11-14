/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
public class AttackSpecificationSwitch<T1> extends Switch<T1> {
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
    public AttackSpecificationSwitch() {
        if (modelPackage == null) {
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
    protected T1 doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case AttackSpecificationPackage.ATTACK: {
            Attack<?> attack = (Attack<?>) theEObject;
            T1 result = caseAttack(attack);
            if (result == null)
                result = caseEntity(attack);
            if (result == null)
                result = caseIdentifier(attack);
            if (result == null)
                result = caseNamedElement(attack);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case AttackSpecificationPackage.CREDENTIAL_ATTACK: {
            CredentialAttack credentialAttack = (CredentialAttack) theEObject;
            T1 result = caseCredentialAttack(credentialAttack);
            if (result == null)
                result = caseAttack(credentialAttack);
            if (result == null)
                result = caseEntity(credentialAttack);
            if (result == null)
                result = caseIdentifier(credentialAttack);
            if (result == null)
                result = caseNamedElement(credentialAttack);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case AttackSpecificationPackage.CREDENTIAL_VULNERABILITY: {
            CredentialVulnerability credentialVulnerability = (CredentialVulnerability) theEObject;
            T1 result = caseCredentialVulnerability(credentialVulnerability);
            if (result == null)
                result = caseVulnerability(credentialVulnerability);
            if (result == null)
                result = caseEntity(credentialVulnerability);
            if (result == null)
                result = caseIdentifier(credentialVulnerability);
            if (result == null)
                result = caseNamedElement(credentialVulnerability);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case AttackSpecificationPackage.VULNERABILITY: {
            Vulnerability vulnerability = (Vulnerability) theEObject;
            T1 result = caseVulnerability(vulnerability);
            if (result == null)
                result = caseEntity(vulnerability);
            if (result == null)
                result = caseIdentifier(vulnerability);
            if (result == null)
                result = caseNamedElement(vulnerability);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case AttackSpecificationPackage.NEW_ABSTRACT_CLASS5: {
            NewAbstractClass5<?> newAbstractClass5 = (NewAbstractClass5<?>) theEObject;
            T1 result = caseNewAbstractClass5(newAbstractClass5);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
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
    public <T extends Vulnerability> T1 caseAttack(Attack<T> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Credential Attack</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Credential Attack</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseCredentialAttack(CredentialAttack object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Credential Vulnerability</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Credential Vulnerability</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseCredentialVulnerability(CredentialVulnerability object) {
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
    public T1 caseVulnerability(Vulnerability object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>New Abstract Class5</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>New Abstract Class5</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public <T> T1 caseNewAbstractClass5(NewAbstractClass5<T> object) {
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
    public T1 caseIdentifier(Identifier object) {
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
    public T1 caseNamedElement(NamedElement object) {
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
    public T1 caseEntity(Entity object) {
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
    public T1 defaultCase(EObject object) {
        return null;
    }

} //AttackSpecificationSwitch
