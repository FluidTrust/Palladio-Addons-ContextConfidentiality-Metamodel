/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getAttackers <em>Attackers</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getAttacks <em>Attacks</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getVulnerabilites <em>Vulnerabilites</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getCategoryspecification <em>Categoryspecification</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getSystemintegration <em>Systemintegration</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttackerSpecification()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AttackerSpecification extends CDOObject
{
	/**
	 * Returns the value of the '<em><b>Attackers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attackers</em>' containment reference.
	 * @see #setAttackers(AttackerContainer)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttackerSpecification_Attackers()
	 * @model containment="true"
	 * @generated
	 */
	AttackerContainer getAttackers();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getAttackers <em>Attackers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attackers</em>' containment reference.
	 * @see #getAttackers()
	 * @generated
	 */
	void setAttackers(AttackerContainer value);

	/**
	 * Returns the value of the '<em><b>Attacks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacks</em>' containment reference.
	 * @see #setAttacks(AttackContainer)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttackerSpecification_Attacks()
	 * @model containment="true"
	 * @generated
	 */
	AttackContainer getAttacks();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getAttacks <em>Attacks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attacks</em>' containment reference.
	 * @see #getAttacks()
	 * @generated
	 */
	void setAttacks(AttackContainer value);

	/**
	 * Returns the value of the '<em><b>Vulnerabilites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vulnerabilites</em>' containment reference.
	 * @see #setVulnerabilites(VulnerabilityContainer)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttackerSpecification_Vulnerabilites()
	 * @model containment="true"
	 * @generated
	 */
	VulnerabilityContainer getVulnerabilites();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getVulnerabilites <em>Vulnerabilites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vulnerabilites</em>' containment reference.
	 * @see #getVulnerabilites()
	 * @generated
	 */
	void setVulnerabilites(VulnerabilityContainer value);

	/**
	 * Returns the value of the '<em><b>Categoryspecification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categoryspecification</em>' containment reference.
	 * @see #setCategoryspecification(CategorySpecification)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttackerSpecification_Categoryspecification()
	 * @model containment="true"
	 * @generated
	 */
	CategorySpecification getCategoryspecification();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getCategoryspecification <em>Categoryspecification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categoryspecification</em>' containment reference.
	 * @see #getCategoryspecification()
	 * @generated
	 */
	void setCategoryspecification(CategorySpecification value);

	/**
	 * Returns the value of the '<em><b>Systemintegration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemintegration</em>' containment reference.
	 * @see #setSystemintegration(AttackerSystemSpecificationContainer)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAttackerSpecification_Systemintegration()
	 * @model containment="true"
	 * @generated
	 */
	AttackerSystemSpecificationContainer getSystemintegration();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification#getSystemintegration <em>Systemintegration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systemintegration</em>' containment reference.
	 * @see #getSystemintegration()
	 * @generated
	 */
	void setSystemintegration(AttackerSystemSpecificationContainer value);

} // AttackerSpecification
