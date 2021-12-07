/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure;

import java.util.List;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.repository.Signature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodSpecification#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodSpecification#getHierachy <em>Hierachy</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getMethodSpecification()
 * @model abstract="true"
 * @generated
 */
public interface MethodSpecification extends Entity
{
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(Signature)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getMethodSpecification_Signature()
	 * @model required="true"
	 * @generated
	 */
	Signature getSignature();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodSpecification#getSignature <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Hierachy</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.core.composition.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierachy</em>' reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getMethodSpecification_Hierachy()
	 * @model
	 * @generated
	 */
	List<AssemblyContext> getHierachy();

} // MethodSpecification
