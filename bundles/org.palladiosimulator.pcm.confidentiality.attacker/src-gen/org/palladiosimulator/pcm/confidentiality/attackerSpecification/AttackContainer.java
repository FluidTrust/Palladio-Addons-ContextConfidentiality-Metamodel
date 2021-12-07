/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Attack;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attack Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackContainer#getAttack <em>Attack</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttackContainer()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AttackContainer extends CDOObject
{
	/**
	 * Returns the value of the '<em><b>Attack</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Attack}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttackContainer_Attack()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attack> getAttack();

} // AttackContainer
