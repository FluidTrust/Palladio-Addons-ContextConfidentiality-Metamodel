package org.palladiosimulator.pcm.confidentiality.context.helper;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;
import org.palladiosimulator.pcm.confidentiality.context.specification.PCMSpecificationContainer;
import org.palladiosimulator.pcm.confidentiality.context.specification.assembly.MethodSpecification;
import org.palladiosimulator.pcm.confidentiality.context.specification.assembly.SystemPolicySpecification;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

public class PolicyHelper {

    private PolicyHelper() {
        assert false;
    }

    public static List<ContextSet> getPolicy(final PCMSpecificationContainer specification,
            final MethodSpecification object) {
        return getPolicicy(specification, SystemPolicySpecification::getMethodspecification, object);
    }

    public static List<ContextSet> getPolicy(final PCMSpecificationContainer specification,
            final ResourceContainer object) {
        return getPolicicy(specification, SystemPolicySpecification::getResourcecontainer, object);
    }

    public static List<ContextSet> getPolicy(final PCMSpecificationContainer specification,
            final LinkingResource object) {
        return getPolicicy(specification, SystemPolicySpecification::getLinkingresource, object);
    }

    public static List<ContextSet> getPolicy(final PCMSpecificationContainer specification,
            final AssemblyContext object) {
        return getPolicicy(specification, SystemPolicySpecification::getAssemblycontext, object);
    }

    private static List<ContextSet> getPolicicy(final PCMSpecificationContainer specification,
            final Function<SystemPolicySpecification, EObject> method, final EObject object) {
        return specification.getPolicyspecification().stream()
                .filter(policy -> EcoreUtil.equals(method.apply(policy), object))
                .flatMap(policy -> policy.getPolicy().stream()).collect(Collectors.toList());
    }

}
