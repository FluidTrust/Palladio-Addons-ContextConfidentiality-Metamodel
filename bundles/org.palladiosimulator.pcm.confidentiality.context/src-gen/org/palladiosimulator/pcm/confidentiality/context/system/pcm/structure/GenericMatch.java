/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure;

import org.palladiosimulator.pcm.confidentiality.context.policy.Category;
import org.palladiosimulator.pcm.confidentiality.context.policy.Match;
import org.palladiosimulator.pcm.confidentiality.context.policy.Operations;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch#getAttributevalue <em>Attributevalue</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch#getCategory <em>Category</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch#isMustBePresent <em>Must Be Present</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getGenericMatch()
 * @model
 * @generated
 */
public interface GenericMatch extends Match
{
	/**
	 * Returns the value of the '<em><b>Attributevalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributevalue</em>' reference.
	 * @see #setAttributevalue(AttributeValue)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getGenericMatch_Attributevalue()
	 * @model required="true"
	 * @generated
	 */
	AttributeValue getAttributevalue();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch#getAttributevalue <em>Attributevalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributevalue</em>' reference.
	 * @see #getAttributevalue()
	 * @generated
	 */
	void setAttributevalue(AttributeValue value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.pcm.confidentiality.context.policy.Operations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Operations
	 * @see #setOperation(Operations)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getGenericMatch_Operation()
	 * @model required="true"
	 * @generated
	 */
	Operations getOperation();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Operations
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operations value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.pcm.confidentiality.context.policy.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Category
	 * @see #setCategory(Category)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getGenericMatch_Category()
	 * @model
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.Category
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Must Be Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Be Present</em>' attribute.
	 * @see #setMustBePresent(boolean)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getGenericMatch_MustBePresent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isMustBePresent();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch#isMustBePresent <em>Must Be Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Be Present</em>' attribute.
	 * @see #isMustBePresent()
	 * @generated
	 */
	void setMustBePresent(boolean value);

} // GenericMatch
