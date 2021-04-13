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

    public static List<ContextSet> getPolicy(PCMSpecificationContainer specification, MethodSpecification object){
        return getPolicicy(specification, SystemPolicySpecification::getMethodspecification, object);
    }
    
    public static List<ContextSet> getPolicy(PCMSpecificationContainer specification, ResourceContainer object) {
        return getPolicicy(specification, SystemPolicySpecification::getResourcecontainer, object);
    }
    
    public static List<ContextSet> getPolicy(PCMSpecificationContainer specification, LinkingResource object) {
        return getPolicicy(specification, SystemPolicySpecification::getLinkingresource, object);
    }

    public static List<ContextSet> getPolicy(PCMSpecificationContainer specification, AssemblyContext object) {
        return getPolicicy(specification, SystemPolicySpecification::getAssemblycontext, object);
    }

    private static List<ContextSet> getPolicicy(PCMSpecificationContainer specification,
            Function<SystemPolicySpecification, EObject> method, EObject object) {
        return specification.getPolicyspecification().stream().filter(SystemPolicySpecification.class::isInstance)
                .map(SystemPolicySpecification.class::cast)
                .filter(policy -> EcoreUtil.equals(method.apply(policy), object))
                .flatMap(policy -> policy.getPolicy().stream()).collect(Collectors.toList());
    }

}
