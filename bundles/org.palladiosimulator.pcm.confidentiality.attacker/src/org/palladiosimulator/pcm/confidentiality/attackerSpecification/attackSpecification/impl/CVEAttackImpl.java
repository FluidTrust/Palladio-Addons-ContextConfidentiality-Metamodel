/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEAttack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEVulnerability;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>CVE Attack</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class CVEAttackImpl extends CVEAttackImplGen implements CVEAttack {

    @Override
    protected boolean checkID(final Vulnerability vulnerability) {
        if (vulnerability instanceof CVEVulnerability) {
            final var id = ((CVEVulnerability) vulnerability).getCveID();
            return getCategory().equalAttackType(id);
        }
        return false;
    }

} // CVEAttackImpl
