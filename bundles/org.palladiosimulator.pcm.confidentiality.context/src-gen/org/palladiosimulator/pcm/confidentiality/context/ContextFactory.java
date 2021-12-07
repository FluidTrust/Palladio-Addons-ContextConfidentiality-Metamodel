/**
 */
package org.palladiosimulator.pcm.confidentiality.context;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.ContextPackage
 * @generated
 */
public interface ContextFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextFactory eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.impl.ContextFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Confidential Access Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Confidential Access Specification</em>'.
	 * @generated
	 */
	ConfidentialAccessSpecification createConfidentialAccessSpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContextPackage getContextPackage();

} //ContextFactory
