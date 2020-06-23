/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.ContextType#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getContextType()
 * @model
 * @generated
 */
public interface ContextType extends Entity {
    /**
     * Returns the value of the '<em><b>Unique</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unique</em>' attribute.
     * @see #setUnique(boolean)
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getContextType_Unique()
     * @model default="false"
     * @generated
     */
    boolean isUnique();

    /**
     * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.model.ContextType#isUnique <em>Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unique</em>' attribute.
     * @see #isUnique()
     * @generated
     */
    void setUnique(boolean value);

} // ContextType
