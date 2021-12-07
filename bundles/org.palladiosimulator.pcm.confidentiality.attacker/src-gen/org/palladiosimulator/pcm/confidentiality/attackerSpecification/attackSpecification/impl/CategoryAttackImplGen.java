/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackCategory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CategoryAttack;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Attack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CategoryAttackImplGen#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CategoryAttackImplGen<T extends AttackCategory> extends AttackImpl implements CategoryAttack<T>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryAttackImplGen()
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
		return AttackSpecificationPackage.Literals.CATEGORY_ATTACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public T getCategory()
	{
		return (T)eGet(AttackSpecificationPackage.Literals.CATEGORY_ATTACK__CATEGORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(T newCategory)
	{
		eSet(AttackSpecificationPackage.Literals.CATEGORY_ATTACK__CATEGORY, newCategory);
	}

} //CategoryAttackImplGen
