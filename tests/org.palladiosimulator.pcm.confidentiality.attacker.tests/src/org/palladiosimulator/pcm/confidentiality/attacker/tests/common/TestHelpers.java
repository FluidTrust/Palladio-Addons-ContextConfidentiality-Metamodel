package org.palladiosimulator.pcm.confidentiality.attacker.tests.common;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationFactory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackVector;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEAttack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEID;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEVulnerability;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEAttack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEVulnerability;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Privileges;
import org.palladiosimulator.pcm.confidentiality.context.policy.Policy;

public class TestHelpers {

    public static CWEID createCWECategory(final int id, final String name) {
        final var category = AttackSpecificationFactory.eINSTANCE.createCWEID();
        category.setCweID(id);
        category.setEntityName(name);
        return category;
    }

    public static CVEID createCVECategory(final String id, final String name) {
        final var category = AttackSpecificationFactory.eINSTANCE.createCVEID();
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
    public static CVEVulnerability createCVEVulnerability(final CWEID cweID, final CVEID cveID) {
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
    public static CVEVulnerability createCVEVulnerability(final CWEID cweID, final CVEID cveID,
            final AttackVector vector) {
        return createCVEVulnerability(cweID, cveID, vector, Privileges.NONE, null);
    }

    public static CVEVulnerability createCVEVulnerability(final CWEID cweID, final CVEID cveID,
            final AttackVector vector, final Privileges privileges, final Policy accessPrivilege) {
        final var vulnerability = AttackSpecificationFactory.eINSTANCE.createCVEVulnerability();
        vulnerability.getCweID()
            .add(cweID);
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
    public static CWEVulnerability createCWEVulnerability(final CWEID cweID) {
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
    public static CWEVulnerability createCWEVulnerability(final CWEID cweID, final AttackVector vector) {
        return createCWEVulnerability(cweID, vector, Privileges.NONE, null);
    }

    public static CWEVulnerability createCWEVulnerability(final CWEID cweID, final AttackVector vector,
            final Privileges privileges, final Policy accessPrivilege) {
        final var vulnerability = AttackSpecificationFactory.eINSTANCE.createCWEVulnerability();
        vulnerability.getCweID()
            .add(cweID);
        vulnerability.setAttackVector(vector);
        vulnerability.setPrivileges(privileges);
        vulnerability.setRequiredCredentials(accessPrivilege);
        return vulnerability;
    }

    public static CWEAttack createCWEAttack(final CWEID cweID) {
        final var attack = AttackSpecificationFactory.eINSTANCE.createCWEAttack();
        attack.setCategory(cweID);
        return attack;
    }

    public static CVEAttack createCVEAttack(final CVEID cweID) {
        final var attack = AttackSpecificationFactory.eINSTANCE.createCVEAttack();
        attack.setCategory(cweID);
        return attack;
    }

}
