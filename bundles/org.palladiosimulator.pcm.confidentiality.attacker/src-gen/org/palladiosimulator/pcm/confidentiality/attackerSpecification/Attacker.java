/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Attack;

import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attacker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#getAttacks <em>Attacks</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#getCompromisedComponents <em>Compromised Components</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#getCompromisedResources <em>Compromised Resources</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#getCompromisedLinkingResources <em>Compromised Linking Resources</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#isExploitContextProviders <em>Exploit Context Providers</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttacker()
 * @model
 * @generated
 */
public interface Attacker extends Entity
{
	/**
	 * Returns the value of the '<em><b>Attacks</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Attack}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacks</em>' reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttacker_Attacks()
	 * @model
	 * @generated
	 */
	EList<Attack> getAttacks();

	/**
	 * Returns the value of the '<em><b>Compromised Components</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.core.composition.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compromised Components</em>' reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttacker_CompromisedComponents()
	 * @model
	 * @generated
	 */
	EList<AssemblyContext> getCompromisedComponents();

	/**
	 * Returns the value of the '<em><b>Compromised Resources</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.resourceenvironment.ResourceContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compromised Resources</em>' reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttacker_CompromisedResources()
	 * @model
	 * @generated
	 */
	EList<ResourceContainer> getCompromisedResources();

	/**
	 * Returns the value of the '<em><b>Compromised Linking Resources</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.resourceenvironment.LinkingResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compromised Linking Resources</em>' reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttacker_CompromisedLinkingResources()
	 * @model
	 * @generated
	 */
	EList<LinkingResource> getCompromisedLinkingResources();

	/**
	 * Returns the value of the '<em><b>Credentials</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentials</em>' reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttacker_Credentials()
	 * @model
	 * @generated
	 */
	EList<UsageSpecification> getCredentials();

	/**
	 * Returns the value of the '<em><b>Exploit Context Providers</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exploit Context Providers</em>' attribute.
	 * @see #setExploitContextProviders(boolean)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttacker_ExploitContextProviders()
	 * @model default="true"
	 * @generated
	 */
	boolean isExploitContextProviders();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker#isExploitContextProviders <em>Exploit Context Providers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exploit Context Providers</em>' attribute.
	 * @see #isExploitContextProviders()
	 * @generated
	 */
	void setExploitContextProviders(boolean value);

} // Attacker
