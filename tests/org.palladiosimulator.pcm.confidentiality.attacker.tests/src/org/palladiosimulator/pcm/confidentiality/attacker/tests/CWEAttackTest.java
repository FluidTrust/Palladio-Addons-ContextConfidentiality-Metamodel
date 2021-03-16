package org.palladiosimulator.pcm.confidentiality.attacker.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.pcm.confidentiality.attacker.tests.common.TestHelpers;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Attack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackVector;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Privileges;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;
import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;

public class CWEAttackTest {
    @BeforeAll
    static void init() {

        ContextPackage.eINSTANCE.eClass();
        AttackerPackage.eINSTANCE.eClass();

    }

    @Test
    void testVulnerability() {
        var cweID = TestHelpers.createCWECategory(0, "test");
        var cveID = TestHelpers.createCVECategory(1, "test2");

        var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweID, cveID);
        var attack = TestHelpers.createCWEAttack(cweID);

        testAllAttackVectorsTrue(attack, vulnerabilityCVE, null, null);
    }

    @Test
    void testVulnerabilityNotTheSameObject() {
        var cweID = TestHelpers.createCWECategory(0, "test");
        var cweID2 = TestHelpers.createCWECategory(0, "test");
        var cveID = TestHelpers.createCVECategory(1, "test2");

        var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweID, cveID);
        var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweID);
        var attack = TestHelpers.createCWEAttack(cweID2);

        testAllAttackVectorsTrue(attack, vulnerabilityCVE, null, null);
        testAllAttackVectorsTrue(attack, vulnerabilityCWE, null, null);
    }

    @Test
    void testVulnerabilityHierachical() {
        var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
        var cweIDAttackerCapabilities = TestHelpers.createCWECategory(1, "test");
        var cveID = TestHelpers.createCVECategory(1, "test2");

        cweIDAttackerCapabilities.getChildren().add(cweIDVulnerability);

        var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID);
        var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability);
        var attack = TestHelpers.createCWEAttack(cweIDAttackerCapabilities);

        testAllAttackVectorsTrue(attack, vulnerabilityCVE, null, null);
        testAllAttackVectorsTrue(attack, vulnerabilityCWE, null, null);
    }

    @Test
    void testVulnerabilityWrongHierachical() {
        var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
        var cweIDAttackerCapabilities = TestHelpers.createCWECategory(1, "test");
        var cveID = TestHelpers.createCVECategory(1, "test2");

        cweIDVulnerability.getChildren().add(cweIDAttackerCapabilities);

        var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID);
        var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability);
        var attack = TestHelpers.createCWEAttack(cweIDAttackerCapabilities);

        testAllAttackVectorsFalse(attack, vulnerabilityCVE, null, null);
        testAllAttackVectorsFalse(attack, vulnerabilityCWE, null, null);
    }

    @Test
    void testVulnerabilityAdjacentNetwork() {
        var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
        var cveID = TestHelpers.createCVECategory(1, "test2");

        var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID,
                AttackVector.ADJACENT_NETWORK);
        var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability, AttackVector.ADJACENT_NETWORK);
        var attack = TestHelpers.createCWEAttack(cweIDVulnerability);

        assertFalse(attack.canExploit(vulnerabilityCVE, null, null, AttackVector.NETWORK));
        assertTrue(attack.canExploit(vulnerabilityCVE, null, null, AttackVector.ADJACENT_NETWORK));
        assertTrue(attack.canExploit(vulnerabilityCVE, null, null, AttackVector.LOCAL));

        assertFalse(attack.canExploit(vulnerabilityCWE, null, null, AttackVector.NETWORK));
        assertTrue(attack.canExploit(vulnerabilityCWE, null, null, AttackVector.ADJACENT_NETWORK));
        assertTrue(attack.canExploit(vulnerabilityCWE, null, null, AttackVector.LOCAL));
    }

    @Test
    void testVulnerabilityLocal() {
        var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
        var cveID = TestHelpers.createCVECategory(1, "test2");

        var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID, AttackVector.LOCAL);
        var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability, AttackVector.LOCAL);
        var attack = TestHelpers.createCWEAttack(cweIDVulnerability);

        assertFalse(attack.canExploit(vulnerabilityCVE, null, null, AttackVector.NETWORK));
        assertFalse(attack.canExploit(vulnerabilityCVE, null, null, AttackVector.ADJACENT_NETWORK));
        assertTrue(attack.canExploit(vulnerabilityCVE, null, null, AttackVector.LOCAL));

        assertFalse(attack.canExploit(vulnerabilityCWE, null, null, AttackVector.NETWORK));
        assertFalse(attack.canExploit(vulnerabilityCWE, null, null, AttackVector.ADJACENT_NETWORK));
        assertTrue(attack.canExploit(vulnerabilityCWE, null, null, AttackVector.LOCAL));
    }

    @Test
    void testVulnerabilityPrivilegeLowSameContextSetObject() {
        var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
        var cveID = TestHelpers.createCVECategory(1, "test2");
        var credentials = TestHelpers.createContextSet("test", "test2");

        var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID, AttackVector.NETWORK,
                Privileges.LOW, null);
        var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability, AttackVector.NETWORK,
                Privileges.LOW, null);

        var attack = TestHelpers.createCWEAttack(cweIDVulnerability);

        testAllAttackVectorsTrue(attack, vulnerabilityCVE, credentials, credentials);
        testAllAttackVectorsTrue(attack, vulnerabilityCWE, credentials, credentials);
    }

    @Test
    void testVulnerabilityPrivilegeLowDifferentContextSetObject() {
        var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
        var cveID = TestHelpers.createCVECategory(1, "test2");
        var credentialsAttacker = TestHelpers.createContextSet("test", "test2");
        var credentialsNeeded = TestHelpers.createContextSet("test", "test2");

        var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID, AttackVector.NETWORK,
                Privileges.LOW, null);
        var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability, AttackVector.NETWORK,
                Privileges.LOW, null);

        var attack = TestHelpers.createCWEAttack(cweIDVulnerability);

        testAllAttackVectorsTrue(attack, vulnerabilityCVE, credentialsAttacker, credentialsNeeded);
        testAllAttackVectorsTrue(attack, vulnerabilityCWE, credentialsAttacker, credentialsNeeded);
    }

    @Test
    void testVulnerabilityPrivilegeLowErrorWrongSet() {
        var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
        var cveID = TestHelpers.createCVECategory(1, "test2");
        var credentialsAttacker = TestHelpers.createContextSet("test");
        var credentialsNeeded = TestHelpers.createContextSet("test", "test2");

        var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID, AttackVector.NETWORK,
                Privileges.LOW, null);
        var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability, AttackVector.NETWORK,
                Privileges.LOW, null);
        
        var attack = TestHelpers.createCWEAttack(cweIDVulnerability);

        testAllAttackVectorsFalse(attack, vulnerabilityCVE, credentialsAttacker, credentialsNeeded);
        testAllAttackVectorsFalse(attack, vulnerabilityCWE, credentialsAttacker, credentialsNeeded);
    }

    @Test
    void testVulnerabilityPrivilegeSpecial() {
        var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
        var cveID = TestHelpers.createCVECategory(1, "test2");
        var credentialsAttacker = TestHelpers.createContextSet("test", "test2", "test3");
        var credentialsNeeded = TestHelpers.createContextSet("test", "test2");
        var credentialsSpecial = TestHelpers.createContextSet("test3");

        var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID, AttackVector.NETWORK,
                Privileges.SPECIAL, credentialsSpecial);
        var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability, AttackVector.NETWORK,
                Privileges.SPECIAL, credentialsSpecial);
        
        var attack = TestHelpers.createCWEAttack(cweIDVulnerability);

        testAllAttackVectorsTrue(attack, vulnerabilityCVE, credentialsAttacker, credentialsNeeded);
        testAllAttackVectorsTrue(attack, vulnerabilityCWE, credentialsAttacker, credentialsNeeded);
    }

    @Test
    void testVulnerabilityPrivilegeSpecialMissing() {
        var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
        var cveID = TestHelpers.createCVECategory(1, "test2");
        var credentialsAttacker = TestHelpers.createContextSet("test", "test2");
        var credentialsNeeded = TestHelpers.createContextSet("test", "test2");
        var credentialsSpecial = TestHelpers.createContextSet("test3");

        var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID, AttackVector.NETWORK,
                Privileges.SPECIAL, credentialsSpecial);
        var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability, AttackVector.NETWORK,
                Privileges.SPECIAL, credentialsSpecial);
        
        var attack = TestHelpers.createCWEAttack(cweIDVulnerability);

        testAllAttackVectorsFalse(attack, vulnerabilityCVE, credentialsAttacker, credentialsNeeded);
        testAllAttackVectorsFalse(attack, vulnerabilityCWE, credentialsAttacker, credentialsNeeded);
    }

    @Test
    void testVulnerabilityPrivilegeLowAdditional() {
        var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
        var cveID = TestHelpers.createCVECategory(1, "test2");
        var credentialsAttacker = TestHelpers.createContextSet("test", "test2");
        var credentialsNeeded = TestHelpers.createContextSet("test", "test2");
        var credentialsSpecial = TestHelpers.createContextSet("test3");

        var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID, AttackVector.NETWORK,
                Privileges.LOW, credentialsSpecial);
        var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability, AttackVector.NETWORK,
                Privileges.LOW, credentialsSpecial);
        var attack = TestHelpers.createCWEAttack(cweIDVulnerability);

        testAllAttackVectorsTrue(attack, vulnerabilityCVE, credentialsAttacker, credentialsNeeded);
        testAllAttackVectorsTrue(attack, vulnerabilityCWE, credentialsAttacker, credentialsNeeded);
    }

    @Test
    void testVulnerabilityWrongCWE() {
        var cweID = TestHelpers.createCWECategory(0, "test");
        var cweIDWrong = TestHelpers.createCWECategory(1, "test");
        var cveID = TestHelpers.createCVECategory(1, "test2");

        var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweID, cveID);
        var attack = TestHelpers.createCWEAttack(cweIDWrong);

        testAllAttackVectorsFalse(attack, vulnerabilityCVE, null, null);
    }

    private void testAllAttackVectorsTrue(Attack attack, Vulnerability vulnerability, ContextSet credentialsAttacker,
            ContextSet credentialsNeeded) {
        assertTrue(attack.canExploit(vulnerability, credentialsAttacker, credentialsNeeded, AttackVector.NETWORK));
        assertTrue(attack.canExploit(vulnerability, credentialsAttacker, credentialsNeeded,
                AttackVector.ADJACENT_NETWORK));
        assertTrue(attack.canExploit(vulnerability, credentialsAttacker, credentialsNeeded, AttackVector.LOCAL));
    }

    private void testAllAttackVectorsFalse(Attack attack, Vulnerability vulnerability, ContextSet credentialsAttacker,
            ContextSet credentialsNeeded) {
        assertFalse(attack.canExploit(vulnerability, credentialsAttacker, credentialsNeeded, AttackVector.NETWORK));
        assertFalse(attack.canExploit(vulnerability, credentialsAttacker, credentialsNeeded,
                AttackVector.ADJACENT_NETWORK));
        assertFalse(attack.canExploit(vulnerability, credentialsAttacker, credentialsNeeded, AttackVector.LOCAL));
    }

}
