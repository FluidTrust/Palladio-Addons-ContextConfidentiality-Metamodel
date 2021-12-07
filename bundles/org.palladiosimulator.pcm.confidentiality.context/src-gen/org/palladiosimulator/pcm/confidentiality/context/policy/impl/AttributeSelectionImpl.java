/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.policy.AttributeSelection;
import org.palladiosimulator.pcm.confidentiality.context.policy.Category;
import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeSelectionImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeSelectionImpl#isMustBePresent <em>Must Be Present</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AttributeSelectionImpl extends ExpressionImpl implements AttributeSelection
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeSelectionImpl()
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
		return PolicyPackage.Literals.ATTRIBUTE_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory()
	{
		return (Category)eGet(PolicyPackage.Literals.ATTRIBUTE_SELECTION__CATEGORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory)
	{
		eSet(PolicyPackage.Literals.ATTRIBUTE_SELECTION__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMustBePresent()
	{
		return (Boolean)eGet(PolicyPackage.Literals.ATTRIBUTE_SELECTION__MUST_BE_PRESENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustBePresent(boolean newMustBePresent)
	{
		eSet(PolicyPackage.Literals.ATTRIBUTE_SELECTION__MUST_BE_PRESENT, newMustBePresent);
	}

} //AttributeSelectionImpl
