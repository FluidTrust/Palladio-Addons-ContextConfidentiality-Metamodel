/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerContainer;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerContainerImpl#getAttacker <em>Attacker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackerContainerImpl extends CDOObjectImpl implements AttackerContainer
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackerContainerImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return AttackerPackage.Literals.ATTACKER_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount()
	{
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Attacker> getAttacker()
	{
		return (EList<Attacker>)eGet(AttackerPackage.Literals.ATTACKER_CONTAINER__ATTACKER, true);
	}

} //AttackerContainerImpl
