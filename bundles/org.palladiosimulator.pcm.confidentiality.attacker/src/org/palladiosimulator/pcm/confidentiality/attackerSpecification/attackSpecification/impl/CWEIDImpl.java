/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import java.util.Objects;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackCategory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>CWEID</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CWEIDImpl#getCweID
 * <em>Cwe ID</em>}</li>
 * <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CWEIDImpl#getChildren
 * <em>Children</em>}</li>
 * <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CWEIDImpl#getParents
 * <em>Parents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CWEIDImpl extends CWEIDImplGen implements CWEID {

    /**
     * @generated NOT
     */
    @Override
    public boolean equalAttackType(final AttackCategory category) {
        Objects.requireNonNull(category);
        if (!(category instanceof CWEID)) {
            return false;
        }
        if (Objects.equals(category.getEntityName(), getEntityName()) && getCweID() == ((CWEID) category).getCweID()) {
            return true;
        }
        for (final var subcategory : getChildren()) {
            if (subcategory.equalAttackType(category)) {
                return true;
            }
        }
        return false;
    }

} // CWEIDImpl
