/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEID;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CVEID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CVEIDImplGen#getCveID <em>Cve ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CVEIDImplGen extends AttackCategoryImpl implements CVEID
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CVEIDImplGen()
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

} //CVEIDImplGen
