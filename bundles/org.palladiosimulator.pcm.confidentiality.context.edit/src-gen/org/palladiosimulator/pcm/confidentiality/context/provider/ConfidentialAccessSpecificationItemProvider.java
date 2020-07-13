/**
 */
package org.palladiosimulator.pcm.confidentiality.context.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

import org.palladiosimulator.pcm.confidentiality.context.model.ModelFactory;

import org.palladiosimulator.pcm.confidentiality.context.set.SetFactory;

import org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationFactory;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfidentialAccessSpecificationItemProvider extends ItemProviderAdapter
        implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfidentialAccessSpecificationItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addSetContainerPropertyDescriptor(object);
            addContextContainerPropertyDescriptor(object);
            addTypeContainerPropertyDescriptor(object);
            addPcmspecificationcontainerPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Set Container feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSetContainerPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_ConfidentialAccessSpecification_setContainer_feature"),
                        getString("_UI_PropertyDescriptor_description",
                                "_UI_ConfidentialAccessSpecification_setContainer_feature",
                                "_UI_ConfidentialAccessSpecification_type"),
                        ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__SET_CONTAINER, true, false, true,
                        null, null, null));
    }

    /**
     * This adds a property descriptor for the Context Container feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addContextContainerPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_ConfidentialAccessSpecification_contextContainer_feature"),
                        getString("_UI_PropertyDescriptor_description",
                                "_UI_ConfidentialAccessSpecification_contextContainer_feature",
                                "_UI_ConfidentialAccessSpecification_type"),
                        ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__CONTEXT_CONTAINER, true, false, true,
                        null, null, null));
    }

    /**
     * This adds a property descriptor for the Type Container feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypeContainerPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_ConfidentialAccessSpecification_typeContainer_feature"),
                        getString("_UI_PropertyDescriptor_description",
                                "_UI_ConfidentialAccessSpecification_typeContainer_feature",
                                "_UI_ConfidentialAccessSpecification_type"),
                        ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__TYPE_CONTAINER, true, false, true,
                        null, null, null));
    }

    /**
     * This adds a property descriptor for the Pcmspecificationcontainer feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPcmspecificationcontainerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_ConfidentialAccessSpecification_pcmspecificationcontainer_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_ConfidentialAccessSpecification_pcmspecificationcontainer_feature",
                        "_UI_ConfidentialAccessSpecification_type"),
                ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__PCMSPECIFICATIONCONTAINER, true, false, true,
                null, null, null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__SET_CONTAINER);
            childrenFeatures.add(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__CONTEXT_CONTAINER);
            childrenFeatures.add(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__TYPE_CONTAINER);
            childrenFeatures.add(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__PCMSPECIFICATIONCONTAINER);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns ConfidentialAccessSpecification.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ConfidentialAccessSpecification"));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean shouldComposeCreationImage() {
        return true;
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_ConfidentialAccessSpecification_type");
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(ConfidentialAccessSpecification.class)) {
        case ContextPackage.CONFIDENTIAL_ACCESS_SPECIFICATION__SET_CONTAINER:
        case ContextPackage.CONFIDENTIAL_ACCESS_SPECIFICATION__CONTEXT_CONTAINER:
        case ContextPackage.CONFIDENTIAL_ACCESS_SPECIFICATION__TYPE_CONTAINER:
        case ContextPackage.CONFIDENTIAL_ACCESS_SPECIFICATION__PCMSPECIFICATIONCONTAINER:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors
                .add(createChildParameter(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__SET_CONTAINER,
                        SetFactory.eINSTANCE.createContextSetContainer()));

        newChildDescriptors
                .add(createChildParameter(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__CONTEXT_CONTAINER,
                        ModelFactory.eINSTANCE.createContextContainer()));

        newChildDescriptors
                .add(createChildParameter(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__TYPE_CONTAINER,
                        ModelFactory.eINSTANCE.createTypeContainer()));

        newChildDescriptors.add(createChildParameter(
                ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__PCMSPECIFICATIONCONTAINER,
                SpecificationFactory.eINSTANCE.createPCMSpecificationContainer()));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return ((IChildCreationExtender) adapterFactory).getResourceLocator();
    }

}