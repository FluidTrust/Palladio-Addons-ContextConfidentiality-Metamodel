/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure;

import org.palladiosimulator.pcm.confidentiality.context.policy.Match;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodMatch#getMethodspecification <em>Methodspecification</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getMethodMatch()
 * @model
 * @generated
 */
public interface MethodMatch extends Match, HierarchicalContext
{
	/**
	 * Returns the value of the '<em><b>Methodspecification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodspecification</em>' containment reference.
	 * @see #setMethodspecification(MethodSpecification)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getMethodMatch_Methodspecification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MethodSpecification getMethodspecification();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodMatch#getMethodspecification <em>Methodspecification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methodspecification</em>' containment reference.
	 * @see #getMethodspecification()
	 * @generated
	 */
	void setMethodspecification(MethodSpecification value);

} // MethodMatch
