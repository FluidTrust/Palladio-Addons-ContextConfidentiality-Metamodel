/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import java.util.Objects;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackCategory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEID;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CVEID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CVEIDImpl#getCveID <em>Cve ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CVEIDImpl extends AttackCategoryImpl implements CVEID
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CVEIDImpl()
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
		return AttackSpecificationPackage.Literals.CVEID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCveID()
	{
		return (String)eGet(AttackSpecificationPackage.Literals.CVEID__CVE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCveID(String newCveID)
	{
		eSet(AttackSpecificationPackage.Literals.CVEID__CVE_ID, newCveID);
	}
    /**
     * @generated NOT
     */
    @Override
    public boolean equalAttackType(AttackCategory category) {
        Objects.requireNonNull(category);
        if (!(category instanceof CVEID))
            return false;
        if (Objects.equals(category.getEntityName(), this.getEntityName())
                && Objects.equals(this.getCveID(), ((CVEID)category).getCveID()))
            return true;
        return false;
    }

} //CVEIDImpl
