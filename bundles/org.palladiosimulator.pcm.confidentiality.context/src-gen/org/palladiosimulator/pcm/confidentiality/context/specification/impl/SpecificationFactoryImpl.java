/**
 */
package org.palladiosimulator.pcm.confidentiality.context.specification.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.confidentiality.context.specification.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecificationFactoryImpl extends EFactoryImpl implements SpecificationFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SpecificationFactory init() {
        try {
            SpecificationFactory theSpecificationFactory = (SpecificationFactory) EPackage.Registry.INSTANCE
                    .getEFactory(SpecificationPackage.eNS_URI);
            if (theSpecificationFactory != null) {
                return theSpecificationFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SpecificationFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecificationFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case SpecificationPackage.CONTEXT_SPECIFICATION:
            return (EObject) createContextSpecification();
        case SpecificationPackage.POLICY_SPECIFICATION:
            return (EObject) createPolicySpecification();
        case SpecificationPackage.PCM_SPECIFICATION_CONTAINER:
            return (EObject) createPCMSpecificationContainer();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSpecification createContextSpecification() {
        ContextSpecificationImpl contextSpecification = new ContextSpecificationImpl();
        return contextSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PolicySpecification createPolicySpecification() {
        PolicySpecificationImpl policySpecification = new PolicySpecificationImpl();
        return policySpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PCMSpecificationContainer createPCMSpecificationContainer() {
        PCMSpecificationContainerImpl pcmSpecificationContainer = new PCMSpecificationContainerImpl();
        return pcmSpecificationContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecificationPackage getSpecificationPackage() {
        return (SpecificationPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SpecificationPackage getPackage() {
        return SpecificationPackage.eINSTANCE;
    }

} //SpecificationFactoryImpl
