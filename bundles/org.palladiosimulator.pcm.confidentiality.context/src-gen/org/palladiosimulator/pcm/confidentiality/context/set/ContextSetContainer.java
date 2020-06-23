/**
 */
package org.palladiosimulator.pcm.confidentiality.context.set;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Set Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.set.ContextSetContainer#getPolicies <em>Policies</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.set.SetPackage#getContextSetContainer()
 * @model
 * @generated
 */
public interface ContextSetContainer extends Entity {
    /**
     * Returns the value of the '<em><b>Policies</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.set.ContextSet}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Policies</em>' containment reference list.
     * @see org.palladiosimulator.pcm.confidentiality.context.set.SetPackage#getContextSetContainer_Policies()
     * @model containment="true"
     * @generated
     */
    EList<ContextSet> getPolicies();

} // ContextSetContainer
