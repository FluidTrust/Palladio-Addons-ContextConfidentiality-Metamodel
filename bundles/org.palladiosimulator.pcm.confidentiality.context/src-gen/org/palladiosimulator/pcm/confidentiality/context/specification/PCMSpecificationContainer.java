/**
 */
package org.palladiosimulator.pcm.confidentiality.context.specification;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Specification Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.specification.PCMSpecificationContainer#getPolicyspecification <em>Policyspecification</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.specification.PCMSpecificationContainer#getContextspecification <em>Contextspecification</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage#getPCMSpecificationContainer()
 * @model
 * @generated
 */
public interface PCMSpecificationContainer extends Entity {
    /**
     * Returns the value of the '<em><b>Policyspecification</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.specification.PolicySpecification}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Policyspecification</em>' containment reference list.
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage#getPCMSpecificationContainer_Policyspecification()
     * @model containment="true"
     * @generated
     */
    EList<PolicySpecification> getPolicyspecification();

    /**
     * Returns the value of the '<em><b>Contextspecification</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contextspecification</em>' containment reference list.
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage#getPCMSpecificationContainer_Contextspecification()
     * @model containment="true"
     * @generated
     */
    EList<ContextSpecification> getContextspecification();

} // PCMSpecificationContainer
