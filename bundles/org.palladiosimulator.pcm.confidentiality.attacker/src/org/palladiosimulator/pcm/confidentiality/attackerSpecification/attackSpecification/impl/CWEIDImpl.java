/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import java.util.Objects;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackCategory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage;
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
public class CWEIDImpl extends AttackCategoryImpl implements CWEID {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected CWEIDImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AttackSpecificationPackage.Literals.CWEID;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public int getCweID() {
        return (Integer) eGet(AttackSpecificationPackage.Literals.CWEID__CWE_ID, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setCweID(int newCweID) {
        eSet(AttackSpecificationPackage.Literals.CWEID__CWE_ID, newCweID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<CWEID> getChildren() {
        return (EList<CWEID>) eGet(AttackSpecificationPackage.Literals.CWEID__CHILDREN, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<CWEID> getParents() {
        return (EList<CWEID>) eGet(AttackSpecificationPackage.Literals.CWEID__PARENTS, true);
    }

    /**
     * @generated NOT
     */
    @Override
    public boolean equalAttackType(AttackCategory category) {
        Objects.requireNonNull(category);
        if (!(category instanceof CWEID))
            return false;
        if (Objects.equals(category.getEntityName(), this.getEntityName())
                && this.getCweID() == ((CWEID) category).getCweID())
            return true;
        for (var subcategory : getChildren()) {
            if (subcategory.equalAttackType(category))
                return true;
        }
        return false;
    }

} // CWEIDImpl
