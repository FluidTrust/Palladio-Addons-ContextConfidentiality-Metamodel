/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttackerFactoryImpl extends EFactoryImpl implements AttackerFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AttackerFactory init() {
        try {
            AttackerFactory theAttackerFactory = (AttackerFactory) EPackage.Registry.INSTANCE
                    .getEFactory(AttackerPackage.eNS_URI);
            if (theAttackerFactory != null) {
                return theAttackerFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new AttackerFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttackerFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case AttackerPackage.ATTACKER_CONTAINER:
            return (EObject) createAttackerContainer();
        case AttackerPackage.ATTACKER:
            return (EObject) createAttacker();
        case AttackerPackage.ATTACKER_SPECIFICATION:
            return (EObject) createAttackerSpecification();
        case AttackerPackage.ATTACK_CONTAINER:
            return (EObject) createAttackContainer();
        case AttackerPackage.VULNERABILITY_CONTAINER:
            return (EObject) createVulnerabilityContainer();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttackerContainer createAttackerContainer() {
        AttackerContainerImpl attackerContainer = new AttackerContainerImpl();
        return attackerContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Attacker createAttacker() {
        AttackerImpl attacker = new AttackerImpl();
        return attacker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttackerSpecification createAttackerSpecification() {
        AttackerSpecificationImpl attackerSpecification = new AttackerSpecificationImpl();
        return attackerSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttackContainer createAttackContainer() {
        AttackContainerImpl attackContainer = new AttackContainerImpl();
        return attackContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VulnerabilityContainer createVulnerabilityContainer() {
        VulnerabilityContainerImpl vulnerabilityContainer = new VulnerabilityContainerImpl();
        return vulnerabilityContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttackerPackage getAttackerPackage() {
        return (AttackerPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static AttackerPackage getPackage() {
        return AttackerPackage.eINSTANCE;
    }

} //AttackerFactoryImpl
