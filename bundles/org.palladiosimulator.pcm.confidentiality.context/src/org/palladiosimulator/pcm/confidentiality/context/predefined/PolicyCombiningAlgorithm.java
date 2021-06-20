package org.palladiosimulator.pcm.confidentiality.context.predefined;

import java.util.Collection;

import com.att.research.xacml.api.Identifier;

public interface PolicyCombiningAlgorithm {

    Collection<Identifier> getPolicyCombiningAlgorithm();

}
