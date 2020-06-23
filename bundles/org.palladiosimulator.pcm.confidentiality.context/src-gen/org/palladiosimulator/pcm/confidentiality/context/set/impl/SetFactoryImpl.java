/**
 */
package org.palladiosimulator.pcm.confidentiality.context.set.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.confidentiality.context.set.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SetFactoryImpl extends EFactoryImpl implements SetFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SetFactory init() {
        try {
            SetFactory theSetFactory = (SetFactory) EPackage.Registry.INSTANCE.getEFactory(SetPackage.eNS_URI);
            if (theSetFactory != null) {
                return theSetFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SetFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SetFactoryImpl() {
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
        case SetPackage.CONTEXT_SET_CONTAINER:
            return (EObject) createContextSetContainer();
        case SetPackage.CONTEXT_SET:
            return (EObject) createContextSet();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSetContainer createContextSetContainer() {
        ContextSetContainerImpl contextSetContainer = new ContextSetContainerImpl();
        return contextSetContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSet createContextSet() {
        ContextSetImpl contextSet = new ContextSetImpl();
        return contextSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SetPackage getSetPackage() {
        return (SetPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SetPackage getPackage() {
        return SetPackage.eINSTANCE;
    }

} //SetFactoryImpl
