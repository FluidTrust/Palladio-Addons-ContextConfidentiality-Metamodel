/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.CategorySpecification;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.CategorySpecificationImpl#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategorySpecificationImpl extends CDOObjectImpl implements CategorySpecification
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategorySpecificationImpl()
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
		return AttackerPackage.Literals.CATEGORY_SPECIFICATION;
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
	public EList<AttackCategory> getCategories()
	{
		return (EList<AttackCategory>)eGet(AttackerPackage.Literals.CATEGORY_SPECIFICATION__CATEGORIES, true);
	}

} //CategorySpecificationImpl
