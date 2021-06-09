/**
 */
package org.palladiosimulator.pcm.confidentiality.context.specification.assembly.provider;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.pcm.confidentiality.context.specification.assembly.AssemblyPackage;
import org.palladiosimulator.pcm.confidentiality.context.specification.assembly.ProvidedRestriction;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Signature;

import tools.mdsd.library.emfeditutils.itempropertydescriptor.ItemPropertyDescriptorUtils;
import tools.mdsd.library.emfeditutils.itempropertydescriptor.ValueChoiceCalculatorBase;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.pcm.confidentiality.context.specification.assembly.ProvidedRestriction}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ProvidedRestrictionItemProvider extends ProvidedRestrictionItemProviderGen {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ProvidedRestrictionItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This adds a property descriptor for the Providedrole feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void addProvidedrolePropertyDescriptor(Object object) {
        super.addProvidedrolePropertyDescriptor(object);
        var decorator = ItemPropertyDescriptorUtils.decorateLastDescriptor(this.itemPropertyDescriptors);

        decorator.setValueChoiceCalculator(
                new ValueChoiceCalculatorBase<>(ProvidedRestriction.class, ProvidedRole.class) {
                    @Override
                    protected Collection<?> getValueChoiceTyped(ProvidedRestriction object,
                            List<ProvidedRole> typedList) {
                        var context = object.getAssemblycontext();
                        if (context == null) {
                            return typedList;
                        }
                        var listProvidedRoles = context.getEncapsulatedComponent__AssemblyContext()
                                .getProvidedRoles_InterfaceProvidingEntity();
                        typedList = typedList.stream().filter(role -> {
                            if (role == null) {
                                return true;
                            }
                            return listProvidedRoles.stream()
                                    .anyMatch(roleCompare -> EcoreUtil.equals(role, roleCompare));

                        }).collect(Collectors.toList());

                        var signature = object.getSignature();
                        if (signature == null) {
                            return typedList;
                        }
                        return typedList.stream().filter(role -> {
                            if (role == null) {
                                return true;
                            }
                            if (role instanceof OperationProvidedRole) {
                                var oRole = (OperationProvidedRole) role;
                                return oRole.getProvidedInterface__OperationProvidedRole()
                                        .getSignatures__OperationInterface().stream()
                                        .anyMatch(tmpSignature -> EcoreUtil.equals(tmpSignature, signature));
                            }
                            return false;
                        }).collect(Collectors.toList());

                    }
                });
    }

    /**
     * This adds a property descriptor for the Assemblycontext feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void addAssemblycontextPropertyDescriptor(Object object) {
        super.addAssemblycontextPropertyDescriptor(object);
        var decorator = ItemPropertyDescriptorUtils.decorateLastDescriptor(this.itemPropertyDescriptors);

        decorator.setValueChoiceCalculator(
                new ValueChoiceCalculatorBase<>(ProvidedRestriction.class, AssemblyContext.class) {
                    @Override
                    protected Collection<?> getValueChoiceTyped(ProvidedRestriction object,
                            List<AssemblyContext> typedList) {
                        var signature = object.getSignature();
                        if (signature == null) {
                            return typedList;
                        }
                        typedList = typedList.stream().filter(context -> {
                            if (context == null) {
                                return true;
                            }
                            return context.getEncapsulatedComponent__AssemblyContext()
                                    .getProvidedRoles_InterfaceProvidingEntity().stream()
                                    .filter(OperationProvidedRole.class::isInstance)
                                    .map(OperationProvidedRole.class::cast)
                                    .flatMap(e -> e.getProvidedInterface__OperationProvidedRole()
                                            .getSignatures__OperationInterface().stream())
                                    .anyMatch(e -> EcoreUtil.equals(signature, e));

                        }).collect(Collectors.toList());
//                        return typedList;
                        var role = object.getProvidedrole();
                        if (role == null) {
                            return typedList;
                        }
                        return typedList.stream().filter(context -> {
                            if (context == null) {
                                return true;
                            }

                            return context.getEncapsulatedComponent__AssemblyContext()
                                    .getProvidedRoles_InterfaceProvidingEntity().stream()
                                    .anyMatch(tmpRole -> EcoreUtil.equals(tmpRole, role));
                        }).collect(Collectors.toList());
                    }
                });
    }

    @Override
    protected void addSignaturePropertyDescriptor(Object object) {
        super.addSignaturePropertyDescriptor(object);
        var decorator = ItemPropertyDescriptorUtils.decorateLastDescriptor(this.itemPropertyDescriptors);

        decorator.setValueChoiceCalculator(new ValueChoiceCalculatorBase<>(ProvidedRestriction.class, Signature.class) {
            @Override
            protected Collection<?> getValueChoiceTyped(ProvidedRestriction object, List<Signature> typedList) {
                var context = object.getAssemblycontext();
                if (context == null) {
                    return typedList;
                }
                return typedList.stream().filter(signature -> {
                    if (signature == null) {
                        return true;
                    }
                    return context.getEncapsulatedComponent__AssemblyContext()
                            .getProvidedRoles_InterfaceProvidingEntity().stream()
                            .filter(OperationProvidedRole.class::isInstance).map(OperationProvidedRole.class::cast)
                            .flatMap(e -> e.getProvidedInterface__OperationProvidedRole()
                                    .getSignatures__OperationInterface().stream())
                            .anyMatch(e -> EcoreUtil.equals(signature, e));

                }).collect(Collectors.toList());

            }
        });
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(Object object) {
        if (object instanceof ProvidedRestriction) {
            final var methodSpecification = (ProvidedRestriction) object;
            if (methodSpecification.getAssemblycontext() != null && methodSpecification.getSignature() != null) {
                return methodSpecification.getAssemblycontext().getEntityName() + ": "
                        + methodSpecification.getSignature().getEntityName();
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
        switch (notification.getFeatureID(ProvidedRestriction.class)) {
        case AssemblyPackage.PROVIDED_RESTRICTION__ASSEMBLYCONTEXT:
        case AssemblyPackage.PROVIDED_RESTRICTION__SIGNATURE:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        }
        super.notifyChanged(notification);
    }

}
