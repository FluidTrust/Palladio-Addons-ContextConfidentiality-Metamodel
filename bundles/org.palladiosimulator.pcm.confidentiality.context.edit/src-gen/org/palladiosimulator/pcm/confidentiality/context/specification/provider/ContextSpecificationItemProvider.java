/**
 */
package org.palladiosimulator.pcm.confidentiality.context.specification.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.palladiosimulator.pcm.confidentiality.context.provider.ContextEditPlugin;

import org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification;
import org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage;

import org.palladiosimulator.pcm.core.entity.provider.EntityItemProvider;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextSpecificationItemProvider extends EntityItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSpecificationItemProvider(AdapterFactory adapterFactory) {
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

            addContextsetPropertyDescriptor(object);
            addEntrylevelsystemcallPropertyDescriptor(object);
            addUsagescenarioPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Contextset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addContextsetPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_ContextSpecification_contextset_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ContextSpecification_contextset_feature",
                        "_UI_ContextSpecification_type"),
                SpecificationPackage.Literals.CONTEXT_SPECIFICATION__CONTEXTSET, true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Entrylevelsystemcall feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEntrylevelsystemcallPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_ContextSpecification_entrylevelsystemcall_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ContextSpecification_entrylevelsystemcall_feature",
                        "_UI_ContextSpecification_type"),
                SpecificationPackage.Literals.CONTEXT_SPECIFICATION__ENTRYLEVELSYSTEMCALL, true, false, true, null,
                null, null));
    }

    /**
     * This adds a property descriptor for the Usagescenario feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsagescenarioPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_ContextSpecification_usagescenario_feature"),
                        getString("_UI_PropertyDescriptor_description",
                                "_UI_ContextSpecification_usagescenario_feature", "_UI_ContextSpecification_type"),
                        SpecificationPackage.Literals.CONTEXT_SPECIFICATION__USAGESCENARIO, true, false, true, null,
                        null, null));
    }

    /**
     * This returns ContextSpecification.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ContextSpecification"));
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
        String label = ((ContextSpecification) object).getEntityName();
        return label == null || label.length() == 0 ? getString("_UI_ContextSpecification_type")
                : getString("_UI_ContextSpecification_type") + " " + label;
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
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return ContextEditPlugin.INSTANCE;
    }

}
