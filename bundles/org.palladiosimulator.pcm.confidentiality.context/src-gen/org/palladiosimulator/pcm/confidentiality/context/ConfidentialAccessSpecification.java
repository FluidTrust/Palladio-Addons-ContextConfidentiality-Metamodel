/**
 */
package org.palladiosimulator.pcm.confidentiality.context;

import org.eclipse.emf.cdo.CDOObject;

import org.palladiosimulator.pcm.confidentiality.context.model.ContextContainer;
import org.palladiosimulator.pcm.confidentiality.context.model.TypeContainer;

import org.palladiosimulator.pcm.confidentiality.context.set.ContextSetContainer;
import org.palladiosimulator.pcm.confidentiality.context.specification.PCMSpecificationContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Confidential Access Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getSetContainer <em>Set Container</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getContextContainer <em>Context Container</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getTypeContainer <em>Type Container</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getPcmspecificationcontainer <em>Pcmspecificationcontainer</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.ContextPackage#getConfidentialAccessSpecification()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ConfidentialAccessSpecification extends CDOObject {
    /**
     * Returns the value of the '<em><b>Set Container</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Set Container</em>' containment reference.
     * @see #setSetContainer(ContextSetContainer)
     * @see org.palladiosimulator.pcm.confidentiality.context.ContextPackage#getConfidentialAccessSpecification_SetContainer()
     * @model containment="true" required="true"
     * @generated
     */
    ContextSetContainer getSetContainer();

    /**
     * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getSetContainer <em>Set Container</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Set Container</em>' containment reference.
     * @see #getSetContainer()
     * @generated
     */
    void setSetContainer(ContextSetContainer value);

    /**
     * Returns the value of the '<em><b>Context Container</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Container</em>' containment reference.
     * @see #setContextContainer(ContextContainer)
     * @see org.palladiosimulator.pcm.confidentiality.context.ContextPackage#getConfidentialAccessSpecification_ContextContainer()
     * @model containment="true" required="true"
     * @generated
     */
    ContextContainer getContextContainer();

    /**
     * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getContextContainer <em>Context Container</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Container</em>' containment reference.
     * @see #getContextContainer()
     * @generated
     */
    void setContextContainer(ContextContainer value);

    /**
     * Returns the value of the '<em><b>Type Container</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type Container</em>' containment reference.
     * @see #setTypeContainer(TypeContainer)
     * @see org.palladiosimulator.pcm.confidentiality.context.ContextPackage#getConfidentialAccessSpecification_TypeContainer()
     * @model containment="true" required="true"
     * @generated
     */
    TypeContainer getTypeContainer();

    /**
     * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getTypeContainer <em>Type Container</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type Container</em>' containment reference.
     * @see #getTypeContainer()
     * @generated
     */
    void setTypeContainer(TypeContainer value);

    /**
     * Returns the value of the '<em><b>Pcmspecificationcontainer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pcmspecificationcontainer</em>' containment reference.
     * @see #setPcmspecificationcontainer(PCMSpecificationContainer)
     * @see org.palladiosimulator.pcm.confidentiality.context.ContextPackage#getConfidentialAccessSpecification_Pcmspecificationcontainer()
     * @model containment="true" required="true"
     * @generated
     */
    PCMSpecificationContainer getPcmspecificationcontainer();

    /**
     * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getPcmspecificationcontainer <em>Pcmspecificationcontainer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pcmspecificationcontainer</em>' containment reference.
     * @see #getPcmspecificationcontainer()
     * @generated
     */
    void setPcmspecificationcontainer(PCMSpecificationContainer value);

} // ConfidentialAccessSpecification
