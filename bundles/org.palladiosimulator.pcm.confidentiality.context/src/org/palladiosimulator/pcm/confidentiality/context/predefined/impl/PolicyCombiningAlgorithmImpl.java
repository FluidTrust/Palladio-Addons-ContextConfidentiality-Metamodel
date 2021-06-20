package org.palladiosimulator.pcm.confidentiality.context.predefined.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.osgi.service.component.annotations.Component;
import org.palladiosimulator.pcm.confidentiality.context.predefined.PolicyCombiningAlgorithm;

import com.att.research.xacml.api.Identifier;
import com.att.research.xacml.api.XACML3;

@Component
public class PolicyCombiningAlgorithmImpl implements PolicyCombiningAlgorithm {

    @Override
    public Collection<Identifier> getPolicyCombiningAlgorithm() {
        var identifiers = new ArrayList<Identifier>();

        identifiers.add(XACML3.ID_POLICY_DENY_OVERRIDES);
        identifiers.add(XACML3.ID_POLICY_PERMIT_OVERRIDES);
        identifiers.add(XACML3.ID_POLICY_FIRST_APPLICABLE);
        identifiers.add(XACML3.ID_POLICY_ONLY_ONE_APPLICABLE);
        identifiers.add(XACML3.ID_POLICY_ORDERED_DENY_OVERRIDES);
        identifiers.add(XACML3.ID_POLICY_ORDERED_PERMIT_OVERRIDES);
        identifiers.add(XACML3.ID_POLICY_DENY_UNLESS_PERMIT);
        identifiers.add(XACML3.ID_POLICY_PERMIT_UNLESS_DENY);

        return identifiers;
    }

}
