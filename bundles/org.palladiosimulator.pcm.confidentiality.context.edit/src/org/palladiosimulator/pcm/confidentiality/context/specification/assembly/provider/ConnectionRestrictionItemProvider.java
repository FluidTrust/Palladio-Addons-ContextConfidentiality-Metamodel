/**
 */
package org.palladiosimulator.pcm.confidentiality.context.specification.assembly.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.pcm.confidentiality.context.specification.assembly.AssemblyPackage;
import org.palladiosimulator.pcm.confidentiality.context.specification.assembly.ConnectionRestriction;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.pcm.confidentiality.context.specification.assembly.ConnectionRestriction}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ConnectionRestrictionItemProvider extends MethodSpecificationItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ConnectionRestrictionItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addConnectorPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Connector feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addConnectorPropertyDescriptor(Object object) {
        this.itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_ConnectionRestriction_connector_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ConnectionRestriction_connector_feature",
                        "_UI_ConnectionRestriction_type"),
                AssemblyPackage.Literals.CONNECTION_RESTRICTION__CONNECTOR, true, false, true, null, null, null));
    }

    /**
     * This returns ConnectionRestriction.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ConnectionRestriction"));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected boolean shouldComposeCreationImage() {
        return true;
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated not
     */
    @Override
    public String getText(final Object object) {

        if (object instanceof ConnectionRestriction) {
            final var methodSpecification = (ConnectionRestriction) object;
            if (methodSpecification.getConnector() != null && methodSpecification.getSignature() != null) {
                return methodSpecification.getConnector().getEntityName() + "->"
                        + methodSpecification.getSignature().getEntityName();
            }
        }
        return this.getString("_UI_MethodSpecification_type");
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to
     * {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
