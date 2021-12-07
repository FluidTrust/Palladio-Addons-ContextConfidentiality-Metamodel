/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CWEID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CWEIDImplGen#getCweID <em>Cwe ID</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CWEIDImplGen#getChildren <em>Children</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CWEIDImplGen#getParents <em>Parents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CWEIDImplGen extends AttackCategoryImpl implements CWEID
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CWEIDImplGen()
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
		return AttackSpecificationPackage.Literals.CWEID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCweID()
	{
		return (Integer)eGet(AttackSpecificationPackage.Literals.CWEID__CWE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCweID(int newCweID)
	{
		eSet(AttackSpecificationPackage.Literals.CWEID__CWE_ID, newCweID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CWEID> getChildren()
	{
		return (EList<CWEID>)eGet(AttackSpecificationPackage.Literals.CWEID__CHILDREN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CWEID> getParents()
	{
		return (EList<CWEID>)eGet(AttackSpecificationPackage.Literals.CWEID__PARENTS, true);
	}

} //CWEIDImplGen
