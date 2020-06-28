/**
 */
package org.palladiosimulator.pcm.confidentiality.context.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

import org.palladiosimulator.pcm.confidentiality.context.model.ContextContainer;
import org.palladiosimulator.pcm.confidentiality.context.model.TypeContainer;

import org.palladiosimulator.pcm.confidentiality.context.set.ContextSetContainer;
import org.palladiosimulator.pcm.confidentiality.context.specification.PCMSpecificationContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Confidential Access Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.impl.ConfidentialAccessSpecificationImpl#getSetContainer <em>Set Container</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.impl.ConfidentialAccessSpecificationImpl#getContextContainer <em>Context Container</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.impl.ConfidentialAccessSpecificationImpl#getTypeContainer <em>Type Container</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.impl.ConfidentialAccessSpecificationImpl#getPcmspecificationcontainer <em>Pcmspecificationcontainer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfidentialAccessSpecificationImpl extends CDOObjectImpl implements ConfidentialAccessSpecification {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConfidentialAccessSpecificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSetContainer getSetContainer() {
        return (ContextSetContainer) eGet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__SET_CONTAINER,
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSetContainer(ContextSetContainer newSetContainer) {
        eSet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__SET_CONTAINER, newSetContainer);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextContainer getContextContainer() {
        return (ContextContainer) eGet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__CONTEXT_CONTAINER,
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextContainer(ContextContainer newContextContainer) {
        eSet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__CONTEXT_CONTAINER, newContextContainer);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeContainer getTypeContainer() {
        return (TypeContainer) eGet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__TYPE_CONTAINER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTypeContainer(TypeContainer newTypeContainer) {
        eSet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__TYPE_CONTAINER, newTypeContainer);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PCMSpecificationContainer getPcmspecificationcontainer() {
        return (PCMSpecificationContainer) eGet(
                ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__PCMSPECIFICATIONCONTAINER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPcmspecificationcontainer(PCMSpecificationContainer newPcmspecificationcontainer) {
        eSet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__PCMSPECIFICATIONCONTAINER,
                newPcmspecificationcontainer);
    }

} //ConfidentialAccessSpecificationImpl
