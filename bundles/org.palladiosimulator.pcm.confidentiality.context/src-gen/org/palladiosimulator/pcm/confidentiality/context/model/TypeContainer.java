/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.TypeContainer#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getTypeContainer()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface TypeContainer extends CDOObject {
    /**
     * Returns the value of the '<em><b>Types</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.model.ContextType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Types</em>' containment reference list.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getTypeContainer_Types()
     * @model containment="true"
     * @generated
     */
    EList<ContextType> getTypes();

} // TypeContainer
