/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute#getContexttype <em>Contexttype</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getContextAttribute()
 * @model abstract="true"
 * @generated
 */
public interface ContextAttribute extends Entity {
    /**
     * Returns the value of the '<em><b>Contexttype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contexttype</em>' reference.
     * @see #setContexttype(ContextType)
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getContextAttribute_Contexttype()
     * @model
     * @generated
     */
    ContextType getContexttype();

    /**
     * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute#getContexttype <em>Contexttype</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contexttype</em>' reference.
     * @see #getContexttype()
     * @generated
     */
    void setContexttype(ContextType value);

} // ContextAttribute
