/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEAttack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEID;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEVulnerability;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CVE Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CVEAttackImpl extends CategoryAttackImpl<CVEID> implements CVEAttack
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CVEAttackImpl()
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

    @Override
    protected boolean checkID(Vulnerability vulnerability) {
        if(vulnerability instanceof CVEVulnerability) {
            var id = ((CVEVulnerability) vulnerability).getCveID();
            return this.getCategory().equalAttackType(id);
        }
        return false;
    }

} //CVEAttackImpl
