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

    public UsageSpecificationItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    @Override
    protected void addAttributevaluePropertyDescriptor(Object object) {
        super.addAttributevaluePropertyDescriptor(object);
        var decorator = ItemPropertyDescriptorUtils.decorateLastDescriptor(this.itemPropertyDescriptors);

        decorator.setValueChoiceCalculator(
                new ValueChoiceCalculatorBase<>(UsageSpecification.class, AttributeValue.class) {
                    @Override
                    protected Collection<?> getValueChoiceTyped(UsageSpecification object,
                            List<AttributeValue> typedList) {
                        var attribute = object.getAttribute();
                        if (attribute == null) {
                            return typedList;
                        }
                        typedList = typedList.stream().filter(
                                value -> value != null ? EcoreUtil.equals(value.eContainer(), attribute) : false)
                                .collect(Collectors.toList());
                        typedList.add(null);
                        return typedList;

                    }
                });
    }

    @Override
    protected void addAttributePropertyDescriptor(Object object) {
        super.addAttributePropertyDescriptor(object);
        var decorator = ItemPropertyDescriptorUtils.decorateLastDescriptor(this.itemPropertyDescriptors);

        decorator.setValueChoiceCalculator(
                new ValueChoiceCalculatorBase<>(UsageSpecification.class, Attribute.class) {
                    @Override
                    protected Collection<?> getValueChoiceTyped(UsageSpecification object,
                            List<Attribute> typedList) {
                        var attributeValue = object.getAttributevalue();
                        if (attributeValue == null) {
                            return typedList;
                        }
                        typedList = typedList.stream().filter(
                                attribute -> attribute != null
                                        ? EcoreUtil.equals(attribute, attributeValue.eContainer())
                                        : false)
                                .collect(Collectors.toList());
                        typedList.add(null);
                        return typedList;

                    }
                });
    }

}
