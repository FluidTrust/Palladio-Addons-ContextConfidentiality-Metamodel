/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackCategory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.CategorySpecification#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getCategorySpecification()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface CategorySpecification extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getCategorySpecification_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttackCategory> getCategories();

} // CategorySpecification
