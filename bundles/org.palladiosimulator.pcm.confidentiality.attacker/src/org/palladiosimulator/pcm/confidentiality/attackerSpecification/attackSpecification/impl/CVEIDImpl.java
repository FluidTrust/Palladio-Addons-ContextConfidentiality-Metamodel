/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import java.util.Objects;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackCategory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CVEID;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>CVEID</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CVEIDImpl#getCveID
 * <em>Cve ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CVEIDImpl extends CVEIDImplGen implements CVEID {

    /**
     * @generated NOT
     */
    @Override
    public boolean equalAttackType(final AttackCategory category) {
        Objects.requireNonNull(category);
        if (!(category instanceof CVEID)) {
            return false;
        }
        if (Objects.equals(category.getEntityName(), getEntityName())
                && Objects.equals(getCveID(), ((CVEID) category).getCveID())) {
            return true;
        }
        return false;
    }

} // CVEIDImpl
