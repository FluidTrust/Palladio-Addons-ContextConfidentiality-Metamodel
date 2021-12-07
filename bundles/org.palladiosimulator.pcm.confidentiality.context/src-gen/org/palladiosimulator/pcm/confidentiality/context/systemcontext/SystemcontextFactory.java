/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage
 * @generated
 */
public interface SystemcontextFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemcontextFactory eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attributes</em>'.
	 * @generated
	 */
	Attributes createAttributes();

	/**
	 * Returns a new object of class '<em>Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value</em>'.
	 * @generated
	 */
	AttributeValue createAttributeValue();

	/**
	 * Returns a new object of class '<em>System Entity Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Entity Attribute</em>'.
	 * @generated
	 */
	SystemEntityAttribute createSystemEntityAttribute();

	/**
	 * Returns a new object of class '<em>External System Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External System Attribute</em>'.
	 * @generated
	 */
	ExternalSystemAttribute createExternalSystemAttribute();

	/**
	 * Returns a new object of class '<em>Simple Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Attribute</em>'.
	 * @generated
	 */
	SimpleAttribute createSimpleAttribute();

	/**
	 * Returns a new object of class '<em>XML Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Attribute</em>'.
	 * @generated
	 */
	XMLAttribute createXMLAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SystemcontextPackage getSystemcontextPackage();

} //SystemcontextFactory
