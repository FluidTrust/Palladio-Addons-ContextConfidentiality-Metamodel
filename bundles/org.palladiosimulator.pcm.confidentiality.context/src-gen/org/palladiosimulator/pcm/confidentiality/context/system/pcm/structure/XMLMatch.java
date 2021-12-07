/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.XMLMatch#getXmlString <em>Xml String</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getXMLMatch()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface XMLMatch extends CDOObject
{
	/**
	 * Returns the value of the '<em><b>Xml String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml String</em>' attribute.
	 * @see #setXmlString(String)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getXMLMatch_XmlString()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getXmlString();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.XMLMatch#getXmlString <em>Xml String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml String</em>' attribute.
	 * @see #getXmlString()
	 * @generated
	 */
	void setXmlString(String value);

} // XMLMatch
