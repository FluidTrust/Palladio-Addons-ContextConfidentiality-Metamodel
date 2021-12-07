/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;

import java.util.List;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.AllOf#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getAllOf()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AllOf extends CDOObject
{
	/**
	 * Returns the value of the '<em><b>Match</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.policy.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getAllOf_Match()
	 * @model containment="true" required="true"
	 * @generated
	 */
	List<Match> getMatch();

} // AllOf
