/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.ContextContainer#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getContextContainer()
 * @model
 * @generated
 */
public interface ContextContainer extends Entity {
    /**
     * Returns the value of the '<em><b>Context</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context</em>' containment reference list.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getContextContainer_Context()
     * @model containment="true"
     * @generated
     */
    EList<ContextAttribute> getContext();

} // ContextContainer
