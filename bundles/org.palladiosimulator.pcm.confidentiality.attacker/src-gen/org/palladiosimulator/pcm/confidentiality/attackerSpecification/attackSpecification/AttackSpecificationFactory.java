/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage
 * @generated
 */
public interface AttackSpecificationFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AttackSpecificationFactory eINSTANCE = org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CVE Vulnerability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CVE Vulnerability</em>'.
	 * @generated
	 */
	CVEVulnerability createCVEVulnerability();

	/**
	 * Returns a new object of class '<em>CWEID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CWEID</em>'.
	 * @generated
	 */
	CWEID createCWEID();

	/**
	 * Returns a new object of class '<em>CWE Attack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CWE Attack</em>'.
	 * @generated
	 */
	CWEAttack createCWEAttack();

	/**
	 * Returns a new object of class '<em>CVE Attack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CVE Attack</em>'.
	 * @generated
	 */
	CVEAttack createCVEAttack();

	/**
	 * Returns a new object of class '<em>CVEID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CVEID</em>'.
	 * @generated
	 */
	CVEID createCVEID();

	/**
	 * Returns a new object of class '<em>CWE Vulnerability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CWE Vulnerability</em>'.
	 * @generated
	 */
	CWEVulnerability createCWEVulnerability();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AttackSpecificationPackage getAttackSpecificationPackage();

} //AttackSpecificationFactory
