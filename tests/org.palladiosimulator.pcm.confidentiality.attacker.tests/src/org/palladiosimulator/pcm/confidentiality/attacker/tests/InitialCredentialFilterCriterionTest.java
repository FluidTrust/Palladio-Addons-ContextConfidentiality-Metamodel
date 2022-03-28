package org.palladiosimulator.pcm.confidentiality.attacker.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.net4j.util.collection.Pair;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.pcm.confidentiality.attacker.helper.CredentialEqualityHelper;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackPath;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerFactory;
import org.palladiosimulator.pcm.confidentiality.context.system.SystemFactory;
import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SimpleAttribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextFactory;

public class InitialCredentialFilterCriterionTest
{
    @Test
    public void isFilteringEarlyTest() {
        final var filter = AttackerFactory.eINSTANCE.createInitialCredentialFilterCriterion();
        Assert.assertFalse(filter.isFilteringEarly());
    }
    
    @Test
    public void isElementFilteredTest() {
        final var paths = createPaths();
        final var filter = AttackerFactory.eINSTANCE.createInitialCredentialFilterCriterion();
        filter.getProhibitedInitialCredentials().addAll(createAllProhibitedCredentials());
        Assert.assertFalse(filter.isElementFiltered(null, null, AttackerFactory.eINSTANCE.createAttackPath()));
        Assert.assertFalse(filter.isElementFiltered(null, null, paths.get(0)));
        Assert.assertTrue(filter.isElementFiltered(null, null, paths.get(1)));
    }
    
    @Test
    public void credentialAllContainedHelperTest() {
        Assert.assertFalse(
                CredentialEqualityHelper.containsAll(createAllProhibitedCredentials(), 
                        createAllCredentials()));
        Assert.assertTrue(
                CredentialEqualityHelper.containsAll(createAllCredentials(), 
                        createAllProhibitedCredentials()));
        Assert.assertTrue(
                CredentialEqualityHelper.containsAll(createAllProhibitedCredentials(), 
                        createAllProhibitedCredentials()));
        Assert.assertTrue(
                CredentialEqualityHelper.containsAll(createAllCredentials(), 
                        createAllCredentials()));
    }

    private List<AttackPath> createPaths() {
        final List<AttackPath> paths = new ArrayList<>();
        paths.add(createPathWithoutIllegalCredential());
        paths.add(createPathWithIllegalCredential());        
        return paths;
    }
    
    private List<UsageSpecification> createAllProhibitedCredentials() {
        return createAllCredentials().stream().filter(c -> c.getEntityName().contains("root")).collect(Collectors.toList());
    }

    private List<UsageSpecification> createAllCredentials() {
        final List<UsageSpecification> allCredentials = new ArrayList<UsageSpecification>();
        
        for (int i = 0; i < 6; i++) {
            final var credential = SystemFactory.eINSTANCE.createUsageSpecification();
            final var value = i < 3 ? "user " + i : "root " + i;
            credential.setEntityName(value);
            final var pair = createAttribute(value);
            credential.setAttribute(pair.getElement1());
            credential.setAttributevalue(pair.getElement2());
            allCredentials.add(credential);
        }
        
        return allCredentials;
    }
    
    private Pair<Attribute, AttributeValue> createAttribute(final String valueStr) {
        final SimpleAttribute attribute = SystemcontextFactory.eINSTANCE.createSimpleAttribute();
        attribute.setEntityName("Role");
        attribute.setEnvironment(false);
        final AttributeValue value = SystemcontextFactory.eINSTANCE.createAttributeValue();
        value.getValues().add(valueStr);
        value.setType(DataTypes.STRING);
        attribute.getAttributevalue().add(value);
        return Pair.create(attribute, value);
    }

    private AttackPath createPathWithIllegalCredential() {
        final var path = AttackerFactory.eINSTANCE.createAttackPath();
        path.getCredentialsInitiallyNecessary().add(createAllProhibitedCredentials().get(0));
        return path;
    }

    private AttackPath createPathWithoutIllegalCredential() {
        final var path = AttackerFactory.eINSTANCE.createAttackPath();
        path.getCredentialsInitiallyNecessary().add(createAllCredentials().get(0));
        path.getCredentialsInitiallyNecessary().add(createAllCredentials().get(1));
        return path;
    }
    
    
}
