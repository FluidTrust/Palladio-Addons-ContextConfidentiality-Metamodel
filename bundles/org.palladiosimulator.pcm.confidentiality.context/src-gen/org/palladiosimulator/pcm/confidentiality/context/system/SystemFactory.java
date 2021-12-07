/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage
 * @generated
 */
public interface SystemFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemFactory eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.system.impl.SystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Specification Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification Container</em>'.
	 * @generated
	 */
	SystemSpecificationContainer createSystemSpecificationContainer();

	/**
	 * Returns a new object of class '<em>Usage Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage Specification</em>'.
	 * @generated
	 */
	UsageSpecification createUsageSpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SystemPackage getSystemPackage();

} //SystemFactory
