/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchical Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.HierarchicalContext#getIncluding <em>Including</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getHierarchicalContext()
 * @model
 * @generated
 */
public interface HierarchicalContext extends ContextAttribute {
    /**
     * Returns the value of the '<em><b>Including</b></em>' reference list.
     * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Including</em>' reference list.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getHierarchicalContext_Including()
     * @model
     * @generated
     */
    EList<ContextAttribute> getIncluding();

} // HierarchicalContext
