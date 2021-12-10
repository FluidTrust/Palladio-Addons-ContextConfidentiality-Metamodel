/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackContainer;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerContainer;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSystemSpecificationContainer;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.CategorySpecification;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.VulnerabilityContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerSpecificationImpl#getAttackers <em>Attackers</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerSpecificationImpl#getAttacks <em>Attacks</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerSpecificationImpl#getVulnerabilites <em>Vulnerabilites</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerSpecificationImpl#getCategoryspecification <em>Categoryspecification</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerSpecificationImpl#getSystemintegration <em>Systemintegration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackerSpecificationImpl extends CDOObjectImpl implements AttackerSpecification {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackerSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttackerPackage.Literals.ATTACKER_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackerContainer getAttackers() {
		return (AttackerContainer) eGet(AttackerPackage.Literals.ATTACKER_SPECIFICATION__ATTACKERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackers(AttackerContainer newAttackers) {
		eSet(AttackerPackage.Literals.ATTACKER_SPECIFICATION__ATTACKERS, newAttackers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackContainer getAttacks() {
		return (AttackContainer) eGet(AttackerPackage.Literals.ATTACKER_SPECIFICATION__ATTACKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttacks(AttackContainer newAttacks) {
		eSet(AttackerPackage.Literals.ATTACKER_SPECIFICATION__ATTACKS, newAttacks);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VulnerabilityContainer getVulnerabilites() {
		return (VulnerabilityContainer) eGet(AttackerPackage.Literals.ATTACKER_SPECIFICATION__VULNERABILITES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVulnerabilites(VulnerabilityContainer newVulnerabilites) {
		eSet(AttackerPackage.Literals.ATTACKER_SPECIFICATION__VULNERABILITES, newVulnerabilites);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategorySpecification getCategoryspecification() {
		return (CategorySpecification) eGet(AttackerPackage.Literals.ATTACKER_SPECIFICATION__CATEGORYSPECIFICATION,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoryspecification(CategorySpecification newCategoryspecification) {
		eSet(AttackerPackage.Literals.ATTACKER_SPECIFICATION__CATEGORYSPECIFICATION, newCategoryspecification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackerSystemSpecificationContainer getSystemintegration() {
		return (AttackerSystemSpecificationContainer) eGet(
				AttackerPackage.Literals.ATTACKER_SPECIFICATION__SYSTEMINTEGRATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemintegration(AttackerSystemSpecificationContainer newSystemintegration) {
		eSet(AttackerPackage.Literals.ATTACKER_SPECIFICATION__SYSTEMINTEGRATION, newSystemintegration);
	}

} //AttackerSpecificationImpl
