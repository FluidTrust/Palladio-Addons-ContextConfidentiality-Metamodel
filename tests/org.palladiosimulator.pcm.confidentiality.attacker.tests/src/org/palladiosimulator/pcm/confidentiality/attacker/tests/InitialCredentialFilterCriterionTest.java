package org.palladiosimulator.pcm.confidentiality.attacker.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.net4j.util.collection.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.pcm.confidentiality.attacker.helper.CredentialEqualityHelper;
import org.palladiosimulator.pcm.confidentiality.context.system.SystemFactory;
import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextFactory;

public class InitialCredentialFilterCriterionTest {

    @Test
    public void credentialAllContainedHelperTest() {
        Assertions.assertFalse(CredentialEqualityHelper.containsAll(this.createAllProhibitedCredentials(),
                this.createAllCredentials()));
        Assertions.assertTrue(CredentialEqualityHelper.containsAll(this.createAllCredentials(),
                this.createAllProhibitedCredentials()));
        Assertions.assertTrue(CredentialEqualityHelper.containsAll(this.createAllProhibitedCredentials(),
                this.createAllProhibitedCredentials()));
        Assertions
            .assertTrue(CredentialEqualityHelper.containsAll(this.createAllCredentials(), this.createAllCredentials()));
    }

    private List<UsageSpecification> createAllProhibitedCredentials() {
        return this.createAllCredentials()
            .stream()
            .filter(c -> c.getEntityName()
                .contains("root"))
            .collect(Collectors.toList());
    }

    private List<UsageSpecification> createAllCredentials() {
        final List<UsageSpecification> allCredentials = new ArrayList<>();

        for (var i = 0; i < 6; i++) {
            final var credential = SystemFactory.eINSTANCE.createUsageSpecification();
            final var value = i < 3 ? "user " + i : "root " + i;
            credential.setEntityName(value);
            final var pair = this.createAttribute(value);
            credential.setAttribute(pair.getElement1());
            credential.setAttributevalue(pair.getElement2());
            allCredentials.add(credential);
        }

        return allCredentials;
    }

    private Pair<Attribute, AttributeValue> createAttribute(final String valueStr) {
        final var attribute = SystemcontextFactory.eINSTANCE.createSimpleAttribute();
        attribute.setEntityName("Role");
        attribute.setEnvironment(false);
        final var value = SystemcontextFactory.eINSTANCE.createAttributeValue();
        value.getValues()
            .add(valueStr);
        value.setType(DataTypes.STRING);
        attribute.getAttributevalue()
            .add(value);
        return Pair.create(attribute, value);
    }

}
