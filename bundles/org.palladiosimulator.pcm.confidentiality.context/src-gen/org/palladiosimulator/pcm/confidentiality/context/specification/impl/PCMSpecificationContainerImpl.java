/**
 */
package org.palladiosimulator.pcm.confidentiality.context.specification.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification;
import org.palladiosimulator.pcm.confidentiality.context.specification.PCMSpecificationContainer;
import org.palladiosimulator.pcm.confidentiality.context.specification.PolicySpecification;
import org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Specification Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.specification.impl.PCMSpecificationContainerImpl#getPolicyspecification <em>Policyspecification</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.specification.impl.PCMSpecificationContainerImpl#getContextspecification <em>Contextspecification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMSpecificationContainerImpl extends EntityImpl implements PCMSpecificationContainer {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PCMSpecificationContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SpecificationPackage.Literals.PCM_SPECIFICATION_CONTAINER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<PolicySpecification> getPolicyspecification() {
        return (EList<PolicySpecification>) eGet(
                SpecificationPackage.Literals.PCM_SPECIFICATION_CONTAINER__POLICYSPECIFICATION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<ContextSpecification> getContextspecification() {
        return (EList<ContextSpecification>) eGet(
                SpecificationPackage.Literals.PCM_SPECIFICATION_CONTAINER__CONTEXTSPECIFICATION, true);
    }

} //PCMSpecificationContainerImpl
