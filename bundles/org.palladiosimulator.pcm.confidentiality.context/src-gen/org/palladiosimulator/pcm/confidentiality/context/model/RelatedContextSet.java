/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model;

import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Context Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.RelatedContextSet#getContextset <em>Contextset</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getRelatedContextSet()
 * @model
 * @generated
 */
public interface RelatedContextSet extends ContextAttribute {
    /**
     * Returns the value of the '<em><b>Contextset</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contextset</em>' reference.
     * @see #setContextset(ContextSet)
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getRelatedContextSet_Contextset()
     * @model required="true"
     * @generated
     */
    ContextSet getContextset();

    /**
     * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.model.RelatedContextSet#getContextset <em>Contextset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contextset</em>' reference.
     * @see #getContextset()
     * @generated
     */
    void setContextset(ContextSet value);

} // RelatedContextSet
