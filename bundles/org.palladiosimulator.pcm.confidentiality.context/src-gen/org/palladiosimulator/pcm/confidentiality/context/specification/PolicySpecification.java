/**
 */
package org.palladiosimulator.pcm.confidentiality.context.specification;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.specification.PolicySpecification#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.specification.PolicySpecification#getResourcedemandingbehaviour <em>Resourcedemandingbehaviour</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage#getPolicySpecification()
 * @model
 * @generated
 */
public interface PolicySpecification extends Entity {
    /**
     * Returns the value of the '<em><b>Policy</b></em>' reference list.
     * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.set.ContextSet}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Policy</em>' reference list.
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage#getPolicySpecification_Policy()
     * @model required="true"
     * @generated
     */
    EList<ContextSet> getPolicy();

    /**
     * Returns the value of the '<em><b>Resourcedemandingbehaviour</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resourcedemandingbehaviour</em>' reference.
     * @see #setResourcedemandingbehaviour(ResourceDemandingBehaviour)
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage#getPolicySpecification_Resourcedemandingbehaviour()
     * @model required="true"
     * @generated
     */
    ResourceDemandingBehaviour getResourcedemandingbehaviour();

    /**
     * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.specification.PolicySpecification#getResourcedemandingbehaviour <em>Resourcedemandingbehaviour</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resourcedemandingbehaviour</em>' reference.
     * @see #getResourcedemandingbehaviour()
     * @generated
     */
    void setResourcedemandingbehaviour(ResourceDemandingBehaviour value);

} // PolicySpecification
