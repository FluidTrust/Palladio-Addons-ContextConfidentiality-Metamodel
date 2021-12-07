/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage
 * @generated
 */
public interface StructureFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructureFactory eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PCM Attribute Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Attribute Provider</em>'.
	 * @generated
	 */
	PCMAttributeProvider createPCMAttributeProvider();

	/**
	 * Returns a new object of class '<em>Connection Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Restriction</em>'.
	 * @generated
	 */
	ConnectionRestriction createConnectionRestriction();

	/**
	 * Returns a new object of class '<em>Service Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Restriction</em>'.
	 * @generated
	 */
	ServiceRestriction createServiceRestriction();

	/**
	 * Returns a new object of class '<em>Entity Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Match</em>'.
	 * @generated
	 */
	EntityMatch createEntityMatch();

	/**
	 * Returns a new object of class '<em>Generic Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Match</em>'.
	 * @generated
	 */
	GenericMatch createGenericMatch();

	/**
	 * Returns a new object of class '<em>Method Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Match</em>'.
	 * @generated
	 */
	MethodMatch createMethodMatch();

	/**
	 * Returns a new object of class '<em>XML Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Match</em>'.
	 * @generated
	 */
	XMLMatch createXMLMatch();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StructurePackage getStructurePackage();

} //StructureFactory
