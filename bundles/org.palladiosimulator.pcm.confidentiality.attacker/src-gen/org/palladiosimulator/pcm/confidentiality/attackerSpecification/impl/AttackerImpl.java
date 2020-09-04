/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Attack;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attacker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerImpl#getCompromisedComponents <em>Compromised Components</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerImpl#getCompromisedResources <em>Compromised Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackerImpl extends EntityImpl implements Attacker {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttackerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AttackerPackage.Literals.ATTACKER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Attack> getCapabilities() {
        return (EList<Attack>) eGet(AttackerPackage.Literals.ATTACKER__CAPABILITIES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<AssemblyContext> getCompromisedComponents() {
        return (EList<AssemblyContext>) eGet(AttackerPackage.Literals.ATTACKER__COMPROMISED_COMPONENTS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<ResourceContainer> getCompromisedResources() {
        return (EList<ResourceContainer>) eGet(AttackerPackage.Literals.ATTACKER__COMPROMISED_RESOURCES, true);
    }

} //AttackerImpl
