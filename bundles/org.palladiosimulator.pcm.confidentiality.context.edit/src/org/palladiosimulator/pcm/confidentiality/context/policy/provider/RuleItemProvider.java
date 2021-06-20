package org.palladiosimulator.pcm.confidentiality.context.policy.provider;

/**
 */

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.confidentiality.context.policy.Rule;

import oasis.names.tc.xacml._3_0.core.schema.wd_17.EffectType;
import test.ValueChoiceCalculatorBase;
import tools.mdsd.library.emfeditutils.itempropertydescriptor.ItemPropertyDescriptorUtils;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.pcm.confidentiality.context.specification.Rule} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class RuleItemProvider extends RuleItemProviderGen {

    public RuleItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This adds a property descriptor for the Test feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void addPermitPropertyDescriptor(Object object) {
        super.addPermitPropertyDescriptor(object);
        var decorator = ItemPropertyDescriptorUtils.decorateLastDescriptor(this.itemPropertyDescriptors);
        decorator.setValueChoiceCalculator(new ValueChoiceCalculatorBase<>(Rule.class, EffectType.class) {
            @Override
            protected Collection<?> getValueChoiceTyped(Rule object, List<EffectType> typedList) {
                typedList.add(EffectType.DENY);
                typedList.add(EffectType.PERMIT);
                typedList.add(null);
                return typedList;

            }
        });
    }

}
