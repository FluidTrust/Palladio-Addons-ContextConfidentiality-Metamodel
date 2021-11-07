package org.palladiosimulator.pcm.confidentiality.context.helper;

import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.confidentiality.context.policy.Policy;
import org.palladiosimulator.pcm.confidentiality.context.system.SystemFactory;
import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.EnvironmentSubject;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemEntityAttribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextFactory;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.XMLAttribute;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.Signature;

/**
 * Helper class for converting {@link Policy} elements to ABAC queries
 *
 * @author majuwa
 * @version 1.0
 */
public class PolicyHelper {

    private PolicyHelper() {
        assert false;
    }

    /**
     * Converts the context of a requestor and the requested entity to abac statements based on
     * attributes list for subjec, resource, environment
     *
     * @param requestedEntity
     *            requested entity
     * @param requestorContext
     *            context of the requestor
     * @param listSubject
     *            empty list for subject attributes
     * @param listEnvironment
     *            empty list for environment attributes
     * @param listResource
     *            empty list for resource attributes
     * @param listXML
     *            empty list for {@link XMLAttribute} attributes
     */
    public static void createRequestAttributes(Deque<? extends Entity> requestedEntity,
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

                if (EcoreUtil.equals(systemEntity.getModelEntity(), requestedEntity.getFirst())) {
                    listResource.add(specification);
                } else {
                    listEnvironment.add(specification);
                }
            } else if (attribute instanceof XMLAttribute) {
                listXML.add(specification);
            }
        }
        listResource.add(createResourceUsageSpecification(requestedEntity));

    }

    public static void createRequestAttributes(Signature signature, Deque<? extends Entity> component,
            List<? extends UsageSpecification> requestorContext, List<UsageSpecification> listSubject,
            List<UsageSpecification> listEnvironment, List<UsageSpecification> listResource,
            List<UsageSpecification> listAction, List<UsageSpecification> listXML) {
        createRequestAttributes(component, requestorContext, listSubject, listEnvironment, listResource, listXML);
        listAction.add(createActionUsageSpecification(signature));
    }

    private static UsageSpecification createResourceUsageSpecification(Deque<? extends Entity> component) {
        var usage = SystemFactory.eINSTANCE.createUsageSpecification();
        var attribute = SystemcontextFactory.eINSTANCE.createSimpleAttribute();
        var value = SystemcontextFactory.eINSTANCE.createAttributeValue();

        attribute.setId(XACMLConstants.RESOURCE_ID);

        value.setType(DataTypes.STRING);
        var valueString = component.stream().map(Entity::getId)
                .collect(Collectors.joining(" ", "", " " + component.getLast().getEntityName()))
                .strip();
        value.getValues().add(valueString);

        attribute.getAttributevalue().add(value);
        usage.setEntityName(component.getLast().getEntityName());// for easier debugging
        usage.setAttribute(attribute);
        usage.setAttributevalue(value);
        return usage;

    }

    private static UsageSpecification createActionUsageSpecification(Signature signature) {
        var usage = SystemFactory.eINSTANCE.createUsageSpecification();
        var attribute = SystemcontextFactory.eINSTANCE.createSimpleAttribute();
        var value = SystemcontextFactory.eINSTANCE.createAttributeValue();

        attribute.setId(XACMLConstants.ACTION_ID);

        value.setType(DataTypes.STRING);
        value.getValues().add(signature.getId());

        attribute.getAttributevalue().add(value);

        usage.setAttribute(attribute);
        usage.setAttributevalue(value);
        return usage;

    }

}
