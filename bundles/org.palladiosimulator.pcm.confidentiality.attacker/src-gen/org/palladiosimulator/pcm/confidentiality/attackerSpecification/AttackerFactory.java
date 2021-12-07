/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage
 * @generated
 */
public interface AttackerFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AttackerFactory eINSTANCE = org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	AttackerContainer createAttackerContainer();

	/**
	 * Returns a new object of class '<em>Attacker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attacker</em>'.
	 * @generated
	 */
	Attacker createAttacker();

	/**
	 * Returns a new object of class '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification</em>'.
	 * @generated
	 */
	AttackerSpecification createAttackerSpecification();

	/**
	 * Returns a new object of class '<em>Attack Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attack Container</em>'.
	 * @generated
	 */
	AttackContainer createAttackContainer();

	/**
	 * Returns a new object of class '<em>Vulnerability Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vulnerability Container</em>'.
	 * @generated
	 */
	VulnerabilityContainer createVulnerabilityContainer();

	/**
	 * Returns a new object of class '<em>Category Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category Specification</em>'.
	 * @generated
	 */
	CategorySpecification createCategorySpecification();

	/**
	 * Returns a new object of class '<em>System Specification Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Specification Container</em>'.
	 * @generated
	 */
	AttackerSystemSpecificationContainer createAttackerSystemSpecificationContainer();

	/**
	 * Returns a new object of class '<em>Datamodel Attacker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datamodel Attacker</em>'.
	 * @generated
	 */
	DatamodelAttacker createDatamodelAttacker();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AttackerPackage getAttackerPackage();

} //AttackerFactory
