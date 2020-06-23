/**
 */
package org.palladiosimulator.pcm.confidentiality.context.set;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.set.ContextSet#getContexts <em>Contexts</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.set.SetPackage#getContextSet()
 * @model
 * @generated
 */
public interface ContextSet extends Entity {
    /**
     * Returns the value of the '<em><b>Contexts</b></em>' reference list.
     * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contexts</em>' reference list.
     * @see org.palladiosimulator.pcm.confidentiality.context.set.SetPackage#getContextSet_Contexts()
     * @model
     * @generated
     */
    EList<ContextAttribute> getContexts();

} // ContextSet
