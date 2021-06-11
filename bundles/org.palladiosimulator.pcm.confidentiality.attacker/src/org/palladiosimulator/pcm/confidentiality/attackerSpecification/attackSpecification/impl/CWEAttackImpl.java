/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEAttack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEBasedVulnerability;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>CWE Attack</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class CWEAttackImpl extends CWEAttackImplGen implements CWEAttack {

    @Override
    protected boolean checkID(final Vulnerability vulnerability) {
        if (vulnerability instanceof CWEBasedVulnerability) {
            final var ids = ((CWEBasedVulnerability) vulnerability).getCweID();
            for (final var id : ids) {
                if (getCategory().equalAttackType(id)) {
                    return true;
                }
            }
        }
        return false;
    }

} // CWEAttackImpl
