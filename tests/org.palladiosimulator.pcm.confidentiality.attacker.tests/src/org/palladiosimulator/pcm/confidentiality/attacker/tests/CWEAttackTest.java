package org.palladiosimulator.pcm.confidentiality.attacker.tests;

import org.junit.jupiter.api.BeforeAll;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

public class CWEAttackTest {
    @BeforeAll
    static void init() {

        ContextPackage.eINSTANCE.eClass();
        AttackerPackage.eINSTANCE.eClass();

    }
//
//    @Test
//    void testVulnerability() {
//        final var cweID = TestHelpers.createCWECategory(0, "test");
//        final var cveID = TestHelpers.createCVECategory("1", "test2");
//
//        final var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweID, cveID);
//        final var attack = TestHelpers.createCWEAttack(cweID);
//
//        testAllAttackVectorsTrue(attack, vulnerabilityCVE, null, null);
//    }
//
//    @Test
//    void testVulnerabilityNotTheSameObject() {
//        final var cweID = TestHelpers.createCWECategory(0, "test");
//        final var cweID2 = TestHelpers.createCWECategory(0, "test");
//        final var cveID = TestHelpers.createCVECategory("1", "test2");
//
//        final var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweID, cveID);
//        final var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweID);
//        final var attack = TestHelpers.createCWEAttack(cweID2);
//
//        testAllAttackVectorsTrue(attack, vulnerabilityCVE, null, null);
//        testAllAttackVectorsTrue(attack, vulnerabilityCWE, null, null);
//    }
//
//    @Test
//    void testVulnerabilityHierachical() {
//        final var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
//        final var cweIDAttackerCapabilities = TestHelpers.createCWECategory(1, "test");
//        final var cveID = TestHelpers.createCVECategory("1", "test2");
//
//        cweIDAttackerCapabilities.getChildren().add(cweIDVulnerability);
//
//        final var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID);
//        final var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability);
//        final var attack = TestHelpers.createCWEAttack(cweIDAttackerCapabilities);
//
//        testAllAttackVectorsTrue(attack, vulnerabilityCVE, null, null);
//        testAllAttackVectorsTrue(attack, vulnerabilityCWE, null, null);
//    }
//
//    @Test
//    void testVulnerabilityWrongHierachical() {
//        final var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
//        final var cweIDAttackerCapabilities = TestHelpers.createCWECategory(1, "test");
//        final var cveID = TestHelpers.createCVECategory("1", "test2");
//
//        cweIDVulnerability.getChildren().add(cweIDAttackerCapabilities);
//
//        final var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID);
//        final var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability);
//        final var attack = TestHelpers.createCWEAttack(cweIDAttackerCapabilities);
//
//        testAllAttackVectorsFalse(attack, vulnerabilityCVE, null, null);
//        testAllAttackVectorsFalse(attack, vulnerabilityCWE, null, null);
//    }
//
//    @Test
//    void testVulnerabilityAdjacentNetwork() {
//        final var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
//        final var cveID = TestHelpers.createCVECategory("1", "test2");
//
//        final var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID,
//                AttackVector.ADJACENT_NETWORK);
//        final var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability,
//                AttackVector.ADJACENT_NETWORK);
//        final var attack = TestHelpers.createCWEAttack(cweIDVulnerability);
//
//        assertFalse(attack.canExploit(vulnerabilityCVE, null, null, AttackVector.NETWORK));
//        assertTrue(attack.canExploit(vulnerabilityCVE, null, null, AttackVector.ADJACENT_NETWORK));
//        assertTrue(attack.canExploit(vulnerabilityCVE, null, null, AttackVector.LOCAL));
//
//        assertFalse(attack.canExploit(vulnerabilityCWE, null, null, AttackVector.NETWORK));
//        assertTrue(attack.canExploit(vulnerabilityCWE, null, null, AttackVector.ADJACENT_NETWORK));
//        assertTrue(attack.canExploit(vulnerabilityCWE, null, null, AttackVector.LOCAL));
//    }
//
//    @Test
//    void testVulnerabilityLocal() {
//        final var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
//        final var cveID = TestHelpers.createCVECategory("1", "test2");
//
//        final var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID, AttackVector.LOCAL);
//        final var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability, AttackVector.LOCAL);
//        final var attack = TestHelpers.createCWEAttack(cweIDVulnerability);
//
//        assertFalse(attack.canExploit(vulnerabilityCVE, null, null, AttackVector.NETWORK));
//        assertFalse(attack.canExploit(vulnerabilityCVE, null, null, AttackVector.ADJACENT_NETWORK));
//        assertTrue(attack.canExploit(vulnerabilityCVE, null, null, AttackVector.LOCAL));
//
//        assertFalse(attack.canExploit(vulnerabilityCWE, null, null, AttackVector.NETWORK));
//        assertFalse(attack.canExploit(vulnerabilityCWE, null, null, AttackVector.ADJACENT_NETWORK));
//        assertTrue(attack.canExploit(vulnerabilityCWE, null, null, AttackVector.LOCAL));
//    }
//
//    @Test
//    void testVulnerabilityPrivilegeLowSameContextSetObject() {
//        final var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
//        final var cveID = TestHelpers.createCVECategory("1", "test2");
//        final var credentials = TestHelpers.createContextSet("test", "test2");
//
//        final var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID, AttackVector.NETWORK,
//                Privileges.LOW, null);
//        final var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability, AttackVector.NETWORK,
//                Privileges.LOW, null);
//
//        final var attack = TestHelpers.createCWEAttack(cweIDVulnerability);
//
//        testAllAttackVectorsTrue(attack, vulnerabilityCVE, credentials, credentials);
//        testAllAttackVectorsTrue(attack, vulnerabilityCWE, credentials, credentials);
//    }
//
//    @Test
//    void testVulnerabilityPrivilegeLowDifferentContextSetObject() {
//        final var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
//        final var cveID = TestHelpers.createCVECategory("1", "test2");
//        final var credentialsAttacker = TestHelpers.createContextSet("test", "test2");
//        final var credentialsNeeded = TestHelpers.createContextSet("test", "test2");
//
//        final var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID, AttackVector.NETWORK,
//                Privileges.LOW, null);
//        final var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability, AttackVector.NETWORK,
//                Privileges.LOW, null);
//
//        final var attack = TestHelpers.createCWEAttack(cweIDVulnerability);
//
//        testAllAttackVectorsTrue(attack, vulnerabilityCVE, credentialsAttacker, credentialsNeeded);
//        testAllAttackVectorsTrue(attack, vulnerabilityCWE, credentialsAttacker, credentialsNeeded);
//    }
//
//    @Test
//    void testVulnerabilityPrivilegeLowErrorWrongSet() {
//        final var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
//        final var cveID = TestHelpers.createCVECategory("1", "test2");
//        final var credentialsAttacker = TestHelpers.createContextSet("test");
//        final var credentialsNeeded = TestHelpers.createContextSet("test", "test2");
//
//        final var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID, AttackVector.NETWORK,
//                Privileges.LOW, null);
//        final var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability, AttackVector.NETWORK,
//                Privileges.LOW, null);
//
//        final var attack = TestHelpers.createCWEAttack(cweIDVulnerability);
//
//        testAllAttackVectorsFalse(attack, vulnerabilityCVE, credentialsAttacker, credentialsNeeded);
//        testAllAttackVectorsFalse(attack, vulnerabilityCWE, credentialsAttacker, credentialsNeeded);
//    }
//
//    @Test
//    void testVulnerabilityPrivilegeSpecial() {
//        final var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
//        final var cveID = TestHelpers.createCVECategory("1", "test2");
//        final var credentialsAttacker = TestHelpers.createContextSet("test", "test2", "test3");
//        final var credentialsNeeded = TestHelpers.createContextSet("test", "test2");
//        final var credentialsSpecial = TestHelpers.createContextSet("test3");
//
//        final var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID, AttackVector.NETWORK,
//                Privileges.SPECIAL, credentialsSpecial);
//        final var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability, AttackVector.NETWORK,
//                Privileges.SPECIAL, credentialsSpecial);
//
//        final var attack = TestHelpers.createCWEAttack(cweIDVulnerability);
//
//        testAllAttackVectorsTrue(attack, vulnerabilityCVE, credentialsAttacker, credentialsNeeded);
//        testAllAttackVectorsTrue(attack, vulnerabilityCWE, credentialsAttacker, credentialsNeeded);
//    }
//
//    @Test
//    void testVulnerabilityPrivilegeSpecialMissing() {
//        final var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
//        final var cveID = TestHelpers.createCVECategory("1", "test2");
//        final var credentialsAttacker = TestHelpers.createContextSet("test", "test2");
//        final var credentialsNeeded = TestHelpers.createContextSet("test", "test2");
//        final var credentialsSpecial = TestHelpers.createContextSet("test3");
//
//        final var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID, AttackVector.NETWORK,
//                Privileges.SPECIAL, credentialsSpecial);
//        final var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability, AttackVector.NETWORK,
//                Privileges.SPECIAL, credentialsSpecial);
//
//        final var attack = TestHelpers.createCWEAttack(cweIDVulnerability);
//
//        testAllAttackVectorsFalse(attack, vulnerabilityCVE, credentialsAttacker, credentialsNeeded);
//        testAllAttackVectorsFalse(attack, vulnerabilityCWE, credentialsAttacker, credentialsNeeded);
//    }
//
//    @Test
//    void testVulnerabilityPrivilegeLowAdditional() {
//        final var cweIDVulnerability = TestHelpers.createCWECategory(0, "test");
//        final var cveID = TestHelpers.createCVECategory("1", "test2");
//        final var credentialsAttacker = TestHelpers.createContextSet("test", "test2");
//        final var credentialsNeeded = TestHelpers.createContextSet("test", "test2");
//        final var credentialsSpecial = TestHelpers.createContextSet("test3");
//
//        final var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweIDVulnerability, cveID, AttackVector.NETWORK,
//                Privileges.LOW, credentialsSpecial);
//        final var vulnerabilityCWE = TestHelpers.createCWEVulnerability(cweIDVulnerability, AttackVector.NETWORK,
//                Privileges.LOW, credentialsSpecial);
//        final var attack = TestHelpers.createCWEAttack(cweIDVulnerability);
//
//        testAllAttackVectorsTrue(attack, vulnerabilityCVE, credentialsAttacker, credentialsNeeded);
//        testAllAttackVectorsTrue(attack, vulnerabilityCWE, credentialsAttacker, credentialsNeeded);
//    }
//
//    @Test
//    void testVulnerabilityWrongCWE() {
//        final var cweID = TestHelpers.createCWECategory(0, "test");
//        final var cweIDWrong = TestHelpers.createCWECategory(1, "test");
//        final var cveID = TestHelpers.createCVECategory("1", "test2");
//
//        final var vulnerabilityCVE = TestHelpers.createCVEVulnerability(cweID, cveID);
//        final var attack = TestHelpers.createCWEAttack(cweIDWrong);
//
//        testAllAttackVectorsFalse(attack, vulnerabilityCVE, null, null);
//    }
//
//    private void testAllAttackVectorsTrue(final Attack attack, final Vulnerability vulnerability,
//            final ContextSet credentialsAttacker, final ContextSet credentialsNeeded) {
//        assertTrue(attack.canExploit(vulnerability, credentialsAttacker, credentialsNeeded, AttackVector.NETWORK));
//        assertTrue(attack.canExploit(vulnerability, credentialsAttacker, credentialsNeeded,
//                AttackVector.ADJACENT_NETWORK));
//        assertTrue(attack.canExploit(vulnerability, credentialsAttacker, credentialsNeeded, AttackVector.LOCAL));
//    }
//
//    private void testAllAttackVectorsFalse(final Attack attack, final Vulnerability vulnerability,
//            final ContextSet credentialsAttacker, final ContextSet credentialsNeeded) {
//        assertFalse(attack.canExploit(vulnerability, credentialsAttacker, credentialsNeeded, AttackVector.NETWORK));
//        assertFalse(attack.canExploit(vulnerability, credentialsAttacker, credentialsNeeded,
//                AttackVector.ADJACENT_NETWORK));
//        assertFalse(attack.canExploit(vulnerability, credentialsAttacker, credentialsNeeded, AttackVector.LOCAL));
//    }

}
