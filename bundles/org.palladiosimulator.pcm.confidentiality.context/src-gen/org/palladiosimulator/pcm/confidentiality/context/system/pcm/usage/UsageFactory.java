/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.UsagePackage
 * @generated
 */
public interface UsageFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsageFactory eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl.UsageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PCM Usage Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Usage Specification</em>'.
	 * @generated
	 */
	PCMUsageSpecification createPCMUsageSpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UsagePackage getUsagePackage();

} //UsageFactory
