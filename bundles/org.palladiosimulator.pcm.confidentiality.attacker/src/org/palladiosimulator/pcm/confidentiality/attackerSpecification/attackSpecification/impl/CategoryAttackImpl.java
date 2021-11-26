/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackCategory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackVector;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CategoryAttack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Privileges;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Category Attack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CategoryAttackImpl#getCategory
 * <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CategoryAttackImpl<T extends AttackCategory> extends AttackImpl implements CategoryAttack<T> {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CategoryAttackImpl() {
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AttackSpecificationPackage.Literals.CATEGORY_ATTACK;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    public T getCategory() {
        return (T) this.eGet(AttackSpecificationPackage.Literals.CATEGORY_ATTACK__CATEGORY, true);
    }

    protected boolean checkID(final Vulnerability vulnerability) {
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setCategory(final T newCategory) {
        this.eSet(AttackSpecificationPackage.Literals.CATEGORY_ATTACK__CATEGORY, newCategory);
    }

    @Override
    public boolean canExploit(Vulnerability vulnerability, boolean authenticated, AttackVector attackVector) {
        if (!this.checkID(vulnerability)) {
            return false;
        }

        if (!this.isIncluded(attackVector, vulnerability.getAttackVector())) {
            return false;
        }
        if (vulnerability.getPrivileges() != Privileges.NONE) {
            return authenticated;
        }

        return true;
    }

    private boolean isIncluded(final AttackVector current, final AttackVector target) {
        if (current.equals(target)) {
            return true;
        } else if (target == AttackVector.NETWORK) {
            return current == AttackVector.LOCAL || current == AttackVector.ADJACENT_NETWORK;
        } else if (target == AttackVector.ADJACENT_NETWORK) {
            return current == AttackVector.LOCAL;
        }
        return false;
    }

} // CategoryAttackImpl
