package contextconfidentiality.service;

import org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification;
import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;
import org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationFactory;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;

public class ApplyPolicyUtil {

    private ApplyPolicyUtil() {
        assert false;
    }

    /**
     * Creates a new Policspecification adds it to the root container
     * 
     * @param seff
     * @param policy
     */
    public static void createContextSeffSPecification(ResourceDemandingSEFF seff, ContextSet policy,
            ConfidentialAccessSpecification confRoot) {
        var policySpecification = SpecificationFactory.eINSTANCE.createPolicySpecification();
        policySpecification.setResourcedemandingbehaviour(seff);
        policySpecification.getPolicy().add(policy);
        confRoot.getPcmspecificationcontainer().getPolicyspecification().add(policySpecification);
    }
}
