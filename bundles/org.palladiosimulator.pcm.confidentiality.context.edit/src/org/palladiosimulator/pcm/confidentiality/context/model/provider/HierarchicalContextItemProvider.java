package org.palladiosimulator.pcm.confidentiality.context.model.provider;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute;
import org.palladiosimulator.pcm.confidentiality.context.model.HierarchicalContext;

import tools.mdsd.library.emfeditutils.itempropertydescriptor.ItemPropertyDescriptorUtils;
import tools.mdsd.library.emfeditutils.itempropertydescriptor.ValueChoiceCalculatorBase;

public class HierarchicalContextItemProvider extends HierarchicalContextItemProviderGen {

    public HierarchicalContextItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    @Override
    protected void addIncludingPropertyDescriptor(Object object) {
        super.addIncludingPropertyDescriptor(object);
        var decorator = ItemPropertyDescriptorUtils.decorateLastDescriptor(this.itemPropertyDescriptors);
        decorator.setValueChoiceCalculator(
                new ValueChoiceCalculatorBase<>(HierarchicalContext.class, ContextAttribute.class) {
                    @Override
                    protected Collection<?> getValueChoiceTyped(HierarchicalContext object,
                            List<ContextAttribute> typedList) {
                        var contextType = object.getContexttype();
                        return typedList.stream().filter(context -> {
                            if (context == null) {
                                return true;
                            }
                            return !EcoreUtil.equals(object, context)
                                    && EcoreUtil.equals(context.getContexttype(), contextType);
                        }).collect(Collectors.toList());

                    }
                });
    }

}
