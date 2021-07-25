package org.palladiosimulator.pcm.confidentiality.context.helper;

import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.confidentiality.context.system.SystemFactory;
import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.EnvironmentSubject;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemEntityAttribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextFactory;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.XMLAttribute;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.Signature;

import de.uka.ipd.sdq.identifier.Identifier;

public class PolicyHelper {

    private PolicyHelper() {
        assert false;
    }

//    public static List<ContextSet> getPolicy(final PCMSpecificationContainer specification,
//            final MethodSpecification object) {
//        return getPolicicy(specification, SystemPolicySpecification::getMethodspecification, object);
//    }
//
//    public static List<ContextSet> getPolicy(final PCMSpecificationContainer specification,
//            final ResourceContainer object) {
//        return getPolicicy(specification, SystemPolicySpecification::getResourcecontainer, object);
//    }
//
//    public static List<ContextSet> getPolicy(final PCMSpecificationContainer specification,
//            final LinkingResource object) {
//        return getPolicicy(specification, SystemPolicySpecification::getLinkingresource, object);
//    }
//
//    public static List<ContextSet> getPolicy(final PCMSpecificationContainer specification,
//            final AssemblyContext object) {
//        return getPolicicy(specification, SystemPolicySpecification::getAssemblycontext, object);
//    }
//
//    private static List<ContextSet> getPolicicy(final PCMSpecificationContainer specification,
//            final Function<SystemPolicySpecification, EObject> method, final EObject object) {
//        return specification.getPolicyspecification().stream()
//                .filter(policy -> EcoreUtil.equals(method.apply(policy), object))
//                .flatMap(policy -> policy.getPolicy().stream()).collect(Collectors.toList());
//    }

    public static void createRequestAttributes(Deque<? extends Entity> component,
            List<? extends UsageSpecification> requestorContext, List<UsageSpecification> listSubject,
            List<UsageSpecification> listEnvironment, List<UsageSpecification> listResource,
            List<UsageSpecification> listXML) {
        for (UsageSpecification specification : requestorContext) {
            var attribute = specification.getAttribute();
            if (attribute instanceof EnvironmentSubject) {
                var environment = (EnvironmentSubject) attribute;
                if (environment.isEnvironment()) {
                    listEnvironment.add(specification);
                } else {
                    listSubject.add(specification);
                }
            } else if (attribute instanceof SystemEntityAttribute) {
                var systemEntity = (SystemEntityAttribute) attribute;

                if (EcoreUtil.equals(systemEntity.getModelEntity(), component.getFirst())) {
                    listResource.add(specification);
                } else {
                    listEnvironment.add(specification);
                }
            } else if (attribute instanceof XMLAttribute) {
                listXML.add(specification);
            }
        }
        createResourceUsageSpecification(component);

    }

    public static void createRequestAttributes(Signature signature, Deque<AssemblyContext> component,
            List<? extends UsageSpecification> requestorContext, List<UsageSpecification> listSubject,
            List<UsageSpecification> listEnvironment, List<UsageSpecification> listResource,
            List<UsageSpecification> listAction, List<UsageSpecification> listXML) {
        createRequestAttributes(component, requestorContext, listSubject, listEnvironment, listResource, listXML);
        listAction.add(createActionUsageSpecification(signature));
        listResource.add(createResourceUsageSpecification(component, signature));
    }

    private static UsageSpecification createResourceUsageSpecification(Deque<? extends Entity> component) {
        return createResourceUsageSpecification(component, null);

    }

    private static UsageSpecification createResourceUsageSpecification(Deque<? extends Entity> component,
            Identifier action) {
        var usage = SystemFactory.eINSTANCE.createUsageSpecification();
        var attribute = SystemcontextFactory.eINSTANCE.createSimpleAttribute();
        var value = SystemcontextFactory.eINSTANCE.createAttributeValue();
        var actionID = action == null ? "" : action.getId();

        attribute.setId(XACMLConstants.RESOURCE_ID);

        value.setType(DataTypes.STRING);
        var valueString = component.stream().map(Entity::getId).collect(Collectors.joining(" ", "", actionID)).strip();
        value.setValue(valueString);

        attribute.getAttributevalue().add(value);

        usage.setAttribute(attribute);
        return usage;

    }

    private static UsageSpecification createActionUsageSpecification(Signature signature) {
        var usage = SystemFactory.eINSTANCE.createUsageSpecification();
        var attribute = SystemcontextFactory.eINSTANCE.createSimpleAttribute();
        var value = SystemcontextFactory.eINSTANCE.createAttributeValue();

        attribute.setId(XACMLConstants.ACTION_ID);

        value.setType(DataTypes.STRING);
        value.setValue(signature.getId());

        attribute.getAttributevalue().add(value);

        usage.setAttribute(attribute);
        return usage;

    }

}
