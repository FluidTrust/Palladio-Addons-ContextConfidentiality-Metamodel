package org.palladiosimulator.pcm.confidentiality.attacker.tests.common;

import java.util.Arrays;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationFactory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackVector;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEAttack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEID;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEVulnerability;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEAttack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEVulnerability;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Privileges;
import org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelFactory;
import org.palladiosimulator.pcm.confidentiality.context.model.SingleAttributeContext;
import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;
import org.palladiosimulator.pcm.confidentiality.context.set.SetFactory;

public class TestHelpers {

    public static CWEID createCWECategory(int id, String name) {
        var category = AttackSpecificationFactory.eINSTANCE.createCWEID();
        category.setCweID(id);
        category.setEntityName(name);
        return category;
    }

    public static CVEID createCVECategory(String id, String name) {
        var category = AttackSpecificationFactory.eINSTANCE.createCVEID();
        category.setCveID(id);
        category.setEntityName(name);
        return category;
    }

    /**
     * Creates a vulnerability with Network and no access rights necessary
     * 
     * @param cweID
     * @param cveID
     * @return
     */
    public static CVEVulnerability createCVEVulnerability(CWEID cweID, CVEID cveID) {
        return createCVEVulnerability(cweID, cveID, AttackVector.NETWORK);
    }

    /**
     * Creates a vulnerability with no access rights necessary
     * 
     * @param cweID
     * @param cveID
     * @param vector
     * @return
     */
    public static CVEVulnerability createCVEVulnerability(CWEID cweID, CVEID cveID, AttackVector vector) {
        return createCVEVulnerability(cweID, cveID, vector, Privileges.NONE, null);
    }

    public static CVEVulnerability createCVEVulnerability(CWEID cweID, CVEID cveID, AttackVector vector,
            Privileges privileges, ContextSet accessPrivilege) {
        var vulnerability = AttackSpecificationFactory.eINSTANCE.createCVEVulnerability();
        vulnerability.setCweID(cweID);
        vulnerability.setCveID(cveID);
        vulnerability.setAttackVector(vector);
        vulnerability.setPrivileges(privileges);
        vulnerability.setRequiredCredentials(accessPrivilege);
        return vulnerability;
    }

    /**
     * Creates a vulnerability with Network and no access rights necessary
     * 
     * @param cweID
     * @param cveID
     * @return
     */
    public static CWEVulnerability createCWEVulnerability(CWEID cweID) {
        return createCWEVulnerability(cweID, AttackVector.NETWORK);
    }

    /**
     * Creates a vulnerability with no access rights necessary
     * 
     * @param cweID
     * @param cveID
     * @param vector
     * @return
     */
    public static CWEVulnerability createCWEVulnerability(CWEID cweID, AttackVector vector) {
        return createCWEVulnerability(cweID, vector, Privileges.NONE, null);
    }

    public static CWEVulnerability createCWEVulnerability(CWEID cweID, AttackVector vector, Privileges privileges,
            ContextSet accessPrivilege) {
        var vulnerability = AttackSpecificationFactory.eINSTANCE.createCWEVulnerability();
        vulnerability.setCweID(cweID);
        vulnerability.setAttackVector(vector);
        vulnerability.setPrivileges(privileges);
        vulnerability.setRequiredCredentials(accessPrivilege);
        return vulnerability;
    }

    public static CWEAttack createCWEAttack(CWEID cweID) {
        var attack = AttackSpecificationFactory.eINSTANCE.createCWEAttack();
        attack.setCategory(cweID);
        return attack;
    }

    public static CVEAttack createCVEAttack(CVEID cweID) {
        var attack = AttackSpecificationFactory.eINSTANCE.createCVEAttack();
        attack.setCategory(cweID);
        return attack;
    }

    /**
     * Creates a context set with the string values as contextAttributes
     * 
     * @param attributes
     * @return
     */
    public static ContextSet createContextSet(String... attributes) {
        var contextAttributes = Arrays.stream(attributes).map(attribute -> {
            var contextAttribute = ModelFactory.eINSTANCE.createSingleAttributeContext();
            contextAttribute.setEntityName(attribute);
            return contextAttribute;
        }).toArray(SingleAttributeContext[]::new);
        return createContextSet(contextAttributes);
    }

    /**
     * Creates a context set containing the context attributes
     * 
     * @param attribute
     * @return
     */
    public static ContextSet createContextSet(ContextAttribute... attribute) {
        var contextSet = SetFactory.eINSTANCE.createContextSet();
        contextSet.getContexts().addAll(Arrays.asList(attribute));
        return contextSet;
    }

}
