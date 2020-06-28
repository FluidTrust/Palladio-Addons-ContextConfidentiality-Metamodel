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

import org.palladiosimulator.pcm.confidentiality.context.specification.PolicySpecification;
import org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage;

import org.palladiosimulator.pcm.core.entity.provider.EntityItemProvider;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.pcm.confidentiality.context.specification.PolicySpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicySpecificationItemProvider extends EntityItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PolicySpecificationItemProvider(AdapterFactory adapterFactory) {
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

            addPolicyPropertyDescriptor(object);
            addResourcedemandingbehaviourPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Policy feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPolicyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_PolicySpecification_policy_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_PolicySpecification_policy_feature",
                        "_UI_PolicySpecification_type"),
                SpecificationPackage.Literals.POLICY_SPECIFICATION__POLICY, true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Resourcedemandingbehaviour feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addResourcedemandingbehaviourPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_PolicySpecification_resourcedemandingbehaviour_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_PolicySpecification_resourcedemandingbehaviour_feature", "_UI_PolicySpecification_type"),
                SpecificationPackage.Literals.POLICY_SPECIFICATION__RESOURCEDEMANDINGBEHAVIOUR, true, false, true, null,
                null, null));
    }

    /**
     * This returns PolicySpecification.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/PolicySpecification"));
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
        String label = ((PolicySpecification) object).getEntityName();
        return label == null || label.length() == 0 ? getString("_UI_PolicySpecification_type")
                : getString("_UI_PolicySpecification_type") + " " + label;
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
