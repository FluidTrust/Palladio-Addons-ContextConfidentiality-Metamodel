package org.palladiosimulator.pcm.confidentiality.context.system.provider;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue;

import tools.mdsd.library.emfeditutils.itempropertydescriptor.ItemPropertyDescriptorUtils;
import tools.mdsd.library.emfeditutils.itempropertydescriptor.ValueChoiceCalculatorBase;

public class UsageSpecificationItemProvider extends UsageSpecificationItemProviderGen {

    public UsageSpecificationItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    @Override
    protected void addAttributevaluePropertyDescriptor(final Object object) {
        super.addAttributevaluePropertyDescriptor(object);
        final var decorator = ItemPropertyDescriptorUtils.decorateLastDescriptor(this.itemPropertyDescriptors);

        decorator
            .setValueChoiceCalculator(new ValueChoiceCalculatorBase<>(UsageSpecification.class, AttributeValue.class) {
                @Override
                protected Collection<?> getValueChoiceTyped(final UsageSpecification object,
                        List<AttributeValue> typedList) {
                    final var attribute = object.getAttribute();
                    if (attribute == null) {
                        return typedList;
                    }
                    typedList = typedList.stream()
                        .filter(value -> value != null ? EcoreUtil.equals(value.eContainer(), attribute) : false)
                        .collect(Collectors.toList());
                    typedList.add(null);
                    return typedList;

                }
            });
    }

    @Override
    protected void addAttributePropertyDescriptor(final Object object) {
        super.addAttributePropertyDescriptor(object);
        final var decorator = ItemPropertyDescriptorUtils.decorateLastDescriptor(this.itemPropertyDescriptors);

        decorator.setValueChoiceCalculator(new ValueChoiceCalculatorBase<>(UsageSpecification.class, Attribute.class) {
            @Override
            protected Collection<?> getValueChoiceTyped(final UsageSpecification object, List<Attribute> typedList) {
                final var attributeValue = object.getAttributevalue();
                if (attributeValue == null) {
                    return typedList;
                }
                typedList = typedList.stream()
                    .filter(attribute -> attribute != null ? EcoreUtil.equals(attribute, attributeValue.eContainer())
                            : false)
                    .collect(Collectors.toList());
                typedList.add(null);
                return typedList;

            }
        });
    }

}
