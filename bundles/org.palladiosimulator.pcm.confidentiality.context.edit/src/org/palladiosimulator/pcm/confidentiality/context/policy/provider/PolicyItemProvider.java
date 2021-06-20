package org.palladiosimulator.pcm.confidentiality.context.policy.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.osgi.service.component.annotations.Reference;
import org.palladiosimulator.pcm.confidentiality.context.policy.Policy;
import org.palladiosimulator.pcm.confidentiality.context.predefined.PolicyCombiningAlgorithm;
import org.palladiosimulator.pcm.confidentiality.context.predefined.impl.PolicyCombiningAlgorithmImpl;

import com.att.research.xacml.api.Identifier;

import test.ValueChoiceCalculatorBase;
import tools.mdsd.library.emfeditutils.itempropertydescriptor.ItemPropertyDescriptorUtils;

public class PolicyItemProvider extends PolicyItemProviderGen {

    @Reference(service = PolicyCombiningAlgorithmImpl.class)
    private PolicyCombiningAlgorithm combining = new PolicyCombiningAlgorithmImpl();

    public PolicyItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This adds a property descriptor for the Test feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void addCombiningAlgorithmPropertyDescriptor(Object object) {
        super.addCombiningAlgorithmPropertyDescriptor(object);
        var decorator = ItemPropertyDescriptorUtils.decorateLastDescriptor(this.itemPropertyDescriptors);
        decorator.setValueChoiceCalculator(new ValueChoiceCalculatorBase<>(Policy.class, Identifier.class) {
            @Override
            protected Collection<?> getValueChoiceTyped(Policy object, List<Identifier> typedList) {
                return PolicyItemProvider.this.combining.getPolicyCombiningAlgorithm();

            }
        });

    }

}
