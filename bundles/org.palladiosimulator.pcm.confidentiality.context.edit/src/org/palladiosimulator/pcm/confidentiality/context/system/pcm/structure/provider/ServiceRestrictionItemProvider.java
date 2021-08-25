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
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ServiceRestriction;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CompositeComponent;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;

import tools.mdsd.library.emfeditutils.itempropertydescriptor.ItemPropertyDescriptorUtils;
import tools.mdsd.library.emfeditutils.itempropertydescriptor.ValueChoiceCalculatorBase;

// TODO: Auto-generated Javadoc
/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.pcm.confidentiality.context.ServiceRestriction.assembly.ProvidedRestriction}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ServiceRestrictionItemProvider extends ServiceRestrictionItemProviderGen {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param adapterFactory the adapter factory
     * @generated 
     */
    public ServiceRestrictionItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    //    /**
    //     * This adds a property descriptor for the Providedrole feature. <!-- begin-user-doc --> <!--
    //     * end-user-doc -->
    //     *
    //     * @generated
    //     */
    //    @Override
    //    protected void addProvidedrolePropertyDescriptor(Object object) {
    //        super.addProvidedrolePropertyDescriptor(object);
    //        var decorator = ItemPropertyDescriptorUtils.decorateLastDescriptor(this.itemPropertyDescriptors);
    //
    //        decorator.setValueChoiceCalculator(
    //                new ValueChoiceCalculatorBase<>(ServiceRestriction.class, ProvidedRole.class) {
    //                    @Override
    //                    protected Collection<?> getValueChoiceTyped(ServiceRestriction object,
    //                            List<ProvidedRole> typedList) {
    //                        var context = object.getAssemblycontext();
    //                        if (context == null) {
    //                            return typedList;
    //                        }
    //                        var listProvidedRoles = context.getEncapsulatedComponent__AssemblyContext()
    //                                .getProvidedRoles_InterfaceProvidingEntity();
    //                        typedList = typedList.stream().filter(role -> {
    //                            if (role == null) {
    //                                return true;
    //                            }
    //                            return listProvidedRoles.stream()
    //                                    .anyMatch(roleCompare -> EcoreUtil.equals(role, roleCompare));
    //
    //                        }).collect(Collectors.toList());
    //
    //                        var signature = object.getSignature();
    //                        if (signature == null) {
    //                            return typedList;
    //                        }
    //                        return typedList.stream().filter(role -> {
    //                            if (role == null) {
    //                                return true;
    //                            }
    //                            if (role instanceof OperationProvidedRole) {
    //                                var oRole = (OperationProvidedRole) role;
    //                                return oRole.getProvidedInterface__OperationProvidedRole()
    //                                        .getSignatures__OperationInterface().stream()
    //                                        .anyMatch(tmpSignature -> EcoreUtil.equals(tmpSignature, signature));
    //                            }
    //                            return false;
    //                        }).collect(Collectors.toList());
    //
    //                    }
    //                });
    //    }

    /**
 * This adds a property descriptor for the Assemblycontext feature. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @param object the object
 * @generated 
 */
    @Override
    protected void addAssemblycontextPropertyDescriptor(Object object) {
        super.addAssemblycontextPropertyDescriptor(object);
        var decorator = ItemPropertyDescriptorUtils.decorateLastDescriptor(this.itemPropertyDescriptors);

        decorator.setValueChoiceCalculator(
                new ValueChoiceCalculatorBase<>(ServiceRestriction.class, AssemblyContext.class) {
                    @Override
                    protected Collection<?> getValueChoiceTyped(ServiceRestriction object,
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
                        var role = object.getService(); // TODO check for changed type provided ->
                        // rsef
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

    /**
     * Filter based on target.
     *
     * @param restriction the restriction
     * @param targetList the target list
     * @return the list
     */
    private List<AssemblyContext> filterBasedOnTarget(ServiceRestriction restriction,
            List<AssemblyContext> targetList) {

        //        if(restriction.eContainer() instanceof

        return targetList;
    }

    /**
     * Adds the service property descriptor.
     *
     * @param object the object
     */
    @Override
    protected void addServicePropertyDescriptor(Object object) {
        super.addServicePropertyDescriptor(object);
        var decorator = ItemPropertyDescriptorUtils.decorateLastDescriptor(this.itemPropertyDescriptors);
        decorator.setValueChoiceCalculator(
                new ValueChoiceCalculatorBase<>(ServiceRestriction.class, ResourceDemandingSEFF.class) {
                    @Override
                    protected Collection<?> getValueChoiceTyped(ServiceRestriction object,
                            List<ResourceDemandingSEFF> typedList) {
                        var context = object.getAssemblycontext();

                        typedList = filterAssemblyContext(typedList, context);

                        typedList = filterSignature(typedList, object.getSignature());

                        return typedList;

                    }
                });
    }

    /**
     * Filter assembly context.
     *
     * @param listSeff the list seff
     * @param context the context
     * @return the list
     */
    private List<ResourceDemandingSEFF> filterAssemblyContext(List<ResourceDemandingSEFF> listSeff,
            AssemblyContext context) {
        if (context == null) {
            return listSeff;
        }
        if (context.getEncapsulatedComponent__AssemblyContext() instanceof BasicComponent) {
            var component = (BasicComponent) context.getEncapsulatedComponent__AssemblyContext();

            listSeff = listSeff.stream()
                    .filter(seff -> seff != null ? EcoreUtil.equals(seff.eContainer(), component) : true)
                    .collect(Collectors.toList());
        } else if (context.getEncapsulatedComponent__AssemblyContext() instanceof CompositeComponent) {
            // TODO implement behaviour for composite components
            throw new IllegalStateException("Not implemented yet");
        }
        return listSeff;
    }

    /**
     * Filter signature.
     *
     * @param listSeff the list seff
     * @param signature the signature
     * @return the list
     */
    private List<ResourceDemandingSEFF> filterSignature(List<ResourceDemandingSEFF> listSeff, Signature signature) {
        if (signature == null) {
            return listSeff;
        }
        return listSeff.stream()
                .filter(seff -> seff != null ? EcoreUtil.equals(seff.getDescribedService__SEFF(), signature) : true)
                .collect(Collectors.toList());
    }

    /**
     * Adds the signature property descriptor.
     *
     * @param object the object
     */
    @Override
    protected void addSignaturePropertyDescriptor(Object object) {
        super.addSignaturePropertyDescriptor(object);
        var decorator = ItemPropertyDescriptorUtils.decorateLastDescriptor(this.itemPropertyDescriptors);

        decorator.setValueChoiceCalculator(new ValueChoiceCalculatorBase<>(ServiceRestriction.class, Signature.class) {
            @Override
            protected Collection<?> getValueChoiceTyped(ServiceRestriction object, List<Signature> typedList) {
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
     * @param object the object
     * @return the text
     * @generated 
     */
    @Override
    public String getText(Object object) {
        if (object instanceof ServiceRestriction) {
            final var methodSpecification = (ServiceRestriction) object;
            if (methodSpecification.getAssemblycontext() != null && methodSpecification.getSignature() != null) {
                return methodSpecification.getAssemblycontext().getEntityName() + ": "
                        + methodSpecification.getSignature().getEntityName();
            }
        }
        return getString("_UI_ServiceRestriction_type");
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to
     * {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param notification the notification
     * @generated 
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);
        switch (notification.getFeatureID(ServiceRestriction.class)) {
        case StructurePackage.SERVICE_RESTRICTION__ASSEMBLYCONTEXT:
        case StructurePackage.SERVICE_RESTRICTION__SIGNATURE:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        }
        super.notifyChanged(notification);
    }

}
