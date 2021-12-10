/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CategoryAttack#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage#getCategoryAttack()
 * @model abstract="true"
 * @generated
 */
public interface CategoryAttack<T extends AttackCategory> extends Attack {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(AttackCategory)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage#getCategoryAttack_Category()
	 * @model required="true"
	 * @generated
	 */
	T getCategory();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CategoryAttack#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(T value);

} // CategoryAttack
