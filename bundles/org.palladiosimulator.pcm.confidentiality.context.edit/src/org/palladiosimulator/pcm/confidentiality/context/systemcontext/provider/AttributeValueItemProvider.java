package org.palladiosimulator.pcm.confidentiality.context.systemcontext.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage;

public class AttributeValueItemProvider extends AttributeValueItemProviderGen {

    public AttributeValueItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(Object object) {
        if (object instanceof AttributeValue) {
            final var attributeValue = (AttributeValue) object;
            if (attributeValue.getType() != null && attributeValue.getValues() != null) {
                if (attributeValue.eContainer() instanceof Attribute) {
                    var category = (Attribute) attributeValue.eContainer();
                    return category.getEntityName() + ": " + attributeValue.getValues();
                }
            }
        }
        return getString("_UI_ProvidedRestriction_type");
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
        switch (notification.getFeatureID(AttributeValue.class)) {
        case SystemcontextPackage.ATTRIBUTE_VALUE__TYPE:
        case SystemcontextPackage.ATTRIBUTE_VALUE__VALUES:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        }
        super.notifyChanged(notification);
    }

}
