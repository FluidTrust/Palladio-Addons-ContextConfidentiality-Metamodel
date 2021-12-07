/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure;

import org.palladiosimulator.pcm.confidentiality.context.policy.Category;
import org.palladiosimulator.pcm.confidentiality.context.policy.Match;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.EntityMatch#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.EntityMatch#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getEntityMatch()
 * @model
 * @generated
 */
public interface EntityMatch extends Match, HierarchicalContext
{
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getEntityMatch_Entity()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.EntityMatch#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The default value is <code>"RESOURCE"</code>.
	 * The literals are from the enumeration {@link org.palladiosimulator.pcm.confidentiality.context.policy.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Category
	 * @see #setCategory(Category)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getEntityMatch_Category()
	 * @model default="RESOURCE"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.EntityMatch#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Category
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

} // EntityMatch
