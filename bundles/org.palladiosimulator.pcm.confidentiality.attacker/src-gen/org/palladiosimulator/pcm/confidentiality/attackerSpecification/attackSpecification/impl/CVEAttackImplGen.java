/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEAttack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEID;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CVE Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CVEAttackImplGen extends CategoryAttackImpl<CVEID> implements CVEAttack
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CVEAttackImplGen()
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
		return AttackSpecificationPackage.Literals.CVE_ATTACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setCategory(CVEID newCategory)
	{
		super.setCategory(newCategory);
	}

} //CVEAttackImplGen
