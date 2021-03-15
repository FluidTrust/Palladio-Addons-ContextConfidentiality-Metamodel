/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEAttack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEBasedVulnerability;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CWE Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CWEAttackImpl extends CategoryAttackImpl<CWEID> implements CWEAttack
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CWEAttackImpl()
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

    @Override
    protected boolean checkID(Vulnerability vulnerability) {
        if(vulnerability instanceof CWEBasedVulnerability) {
            var id = ((CWEBasedVulnerability) vulnerability).getCweID();
            return this.getCategory().equalAttackType(id);
        }
        return false;
    }

} //CWEAttackImpl