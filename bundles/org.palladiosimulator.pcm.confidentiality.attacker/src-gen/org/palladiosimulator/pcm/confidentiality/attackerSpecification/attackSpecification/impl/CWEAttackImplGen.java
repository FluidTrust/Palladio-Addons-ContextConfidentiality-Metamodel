/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEAttack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CWE Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CWEAttackImplGen extends CategoryAttackImpl<CWEID> implements CWEAttack
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CWEAttackImplGen()
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
		return AttackSpecificationPackage.Literals.CWE_ATTACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setCategory(CWEID newCategory)
	{
		super.setCategory(newCategory);
	}

} //CWEAttackImplGen
