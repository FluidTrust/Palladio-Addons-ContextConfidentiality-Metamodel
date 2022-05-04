/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.provider;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ConnectionSpecification;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.core.composition.util.CompositionSwitch;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.Signature;

import tools.mdsd.library.emfeditutils.itempropertydescriptor.ItemPropertyDescriptorUtils;
import tools.mdsd.library.emfeditutils.itempropertydescriptor.ValueChoiceCalculatorBase;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.pcm.confidentiality.context.ConnectionSpecification.assembly.ConnectionRestriction}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ConnectionSpecificationItemProvider extends ConnectionSpecificationItemProviderGen {

    public ConnectionSpecificationItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    @Override
    protected void addConnectorPropertyDescriptor(Object object) {
        super.addConnectorPropertyDescriptor(object);
        var decorator = ItemPropertyDescriptorUtils.decorateLastDescriptor(this.itemPropertyDescriptors);

        decorator.setValueChoiceCalculator(
                new ValueChoiceCalculatorBase<>(ConnectionSpecification.class, Connector.class) {
                    @Override
                    protected Collection<?> getValueChoiceTyped(ConnectionSpecification object,
                            List<Connector> typedList) {
                        var signature = object.getSignature();
                        if (signature == null) {
                            return typedList;
                        }
                        final var switchConnector = new CompositionSwitch<OperationProvidedRole>() {
                            @Override
                            public OperationProvidedRole caseProvidedDelegationConnector(
                                    ProvidedDelegationConnector object) {
                                return object.getOuterProvidedRole_ProvidedDelegationConnector();
                            }

                            @Override
                            public OperationProvidedRole caseAssemblyConnector(AssemblyConnector object) {
                                return object.getProvidedRole_AssemblyConnector();
                            }

                        };
                        return typedList.stream().filter(connector -> {
                            if (connector == null) {
                                return true;
                            }
                            var role = switchConnector.doSwitch(connector);
                            if (role == null) {
                                return false;
                            }
                            return role.getProvidedInterface__OperationProvidedRole()
                                    .getSignatures__OperationInterface().stream()
                                    .anyMatch(iSignature -> EcoreUtil.equals(iSignature, signature));

                        }).collect(Collectors.toList());

                    }
                });
    }

    @Override
    protected void addSignaturePropertyDescriptor(Object object) {
        super.addSignaturePropertyDescriptor(object);
        var decorator = ItemPropertyDescriptorUtils.decorateLastDescriptor(this.itemPropertyDescriptors);

        decorator.setValueChoiceCalculator(
                new ValueChoiceCalculatorBase<>(ConnectionSpecification.class, Signature.class) {
                    @Override
                    protected Collection<?> getValueChoiceTyped(ConnectionSpecification object,
                            List<Signature> typedList) {
                        var connector = object.getConnector();
                        if (connector == null) {
                            return typedList;
                        }
                        final var switchConnector = new CompositionSwitch<OperationProvidedRole>() {
                            @Override
                            public OperationProvidedRole caseProvidedDelegationConnector(
                                    ProvidedDelegationConnector object) {
                                return object.getOuterProvidedRole_ProvidedDelegationConnector();
                            }

                            @Override
                            public OperationProvidedRole caseAssemblyConnector(AssemblyConnector object) {
                                return object.getProvidedRole_AssemblyConnector();
                            }

                        };
                        return typedList.stream().filter(signature -> {
                            if (signature == null) {
                                return true;
                            }
                            var role = switchConnector.doSwitch(connector);
                            if (role == null) {
                                return false;
                            }
                            return ParentInterfaceHelper.getStreamWithParentInterfaces(role)
                                    .flatMap(e -> e.getSignatures__OperationInterface().stream())
                                    .anyMatch(iSignature -> EcoreUtil.equals(iSignature, signature));

                        }).collect(Collectors.toList());

                    }
                });
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated not
     */
    @Override
    public String getText(final Object object) {

        if (object instanceof ConnectionSpecification) {
            final var methodSpecification = (ConnectionSpecification) object;
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
        switch (notification.getFeatureID(ConnectionSpecification.class)) {
        case StructurePackage.CONNECTION_SPECIFICATION__CONNECTOR:
        case StructurePackage.CONNECTION_SPECIFICATION__SIGNATURE:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        }
        super.notifyChanged(notification);
    }

}
