/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.confidentiality.context.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ModelFactory init() {
        try {
            ModelFactory theModelFactory = (ModelFactory) EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
            if (theModelFactory != null) {
                return theModelFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ModelFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelFactoryImpl() {
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
        case ModelPackage.HIERARCHICAL_CONTEXT:
            return (EObject) createHierarchicalContext();
        case ModelPackage.SINGLE_ATTRIBUTE_CONTEXT:
            return (EObject) createSingleAttributeContext();
        case ModelPackage.RELATED_CONTEXT_SET:
            return (EObject) createRelatedContextSet();
        case ModelPackage.CONTEXT_CONTAINER:
            return (EObject) createContextContainer();
        case ModelPackage.CONTEXT_TYPE:
            return (EObject) createContextType();
        case ModelPackage.TYPE_CONTAINER:
            return (EObject) createTypeContainer();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case ModelPackage.INCLUDE_DIRECTION:
            return createIncludeDirectionFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case ModelPackage.INCLUDE_DIRECTION:
            return convertIncludeDirectionToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HierarchicalContext createHierarchicalContext() {
        HierarchicalContextImpl hierarchicalContext = new HierarchicalContextImpl();
        return hierarchicalContext;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SingleAttributeContext createSingleAttributeContext() {
        SingleAttributeContextImpl singleAttributeContext = new SingleAttributeContextImpl();
        return singleAttributeContext;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelatedContextSet createRelatedContextSet() {
        RelatedContextSetImpl relatedContextSet = new RelatedContextSetImpl();
        return relatedContextSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextContainer createContextContainer() {
        ContextContainerImpl contextContainer = new ContextContainerImpl();
        return contextContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextType createContextType() {
        ContextTypeImpl contextType = new ContextTypeImpl();
        return contextType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeContainer createTypeContainer() {
        TypeContainerImpl typeContainer = new TypeContainerImpl();
        return typeContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IncludeDirection createIncludeDirectionFromString(EDataType eDataType, String initialValue) {
        IncludeDirection result = IncludeDirection.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIncludeDirectionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelPackage getModelPackage() {
        return (ModelPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ModelPackage getPackage() {
        return ModelPackage.eINSTANCE;
    }

} //ModelFactoryImpl
