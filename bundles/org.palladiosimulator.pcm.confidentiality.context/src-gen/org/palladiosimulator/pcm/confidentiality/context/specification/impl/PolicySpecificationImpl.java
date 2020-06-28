/**
 */
package org.palladiosimulator.pcm.confidentiality.context.specification.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;

import org.palladiosimulator.pcm.confidentiality.context.specification.PolicySpecification;
import org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.specification.impl.PolicySpecificationImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.specification.impl.PolicySpecificationImpl#getResourcedemandingbehaviour <em>Resourcedemandingbehaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolicySpecificationImpl extends EntityImpl implements PolicySpecification {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PolicySpecificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SpecificationPackage.Literals.POLICY_SPECIFICATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<ContextSet> getPolicy() {
        return (EList<ContextSet>) eGet(SpecificationPackage.Literals.POLICY_SPECIFICATION__POLICY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceDemandingBehaviour getResourcedemandingbehaviour() {
        return (ResourceDemandingBehaviour) eGet(
                SpecificationPackage.Literals.POLICY_SPECIFICATION__RESOURCEDEMANDINGBEHAVIOUR, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResourcedemandingbehaviour(ResourceDemandingBehaviour newResourcedemandingbehaviour) {
        eSet(SpecificationPackage.Literals.POLICY_SPECIFICATION__RESOURCEDEMANDINGBEHAVIOUR,
                newResourcedemandingbehaviour);
    }

} //PolicySpecificationImpl
