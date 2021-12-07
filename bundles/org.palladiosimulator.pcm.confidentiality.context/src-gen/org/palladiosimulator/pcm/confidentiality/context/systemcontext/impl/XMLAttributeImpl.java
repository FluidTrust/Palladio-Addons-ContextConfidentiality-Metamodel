/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.XMLAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.XMLAttributeImpl#getXmlString <em>Xml String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XMLAttributeImpl extends AttributeImpl implements XMLAttribute
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLAttributeImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SystemcontextPackage.Literals.XML_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXmlString()
	{
		return (String)eGet(SystemcontextPackage.Literals.XML_ATTRIBUTE__XML_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlString(String newXmlString)
	{
		eSet(SystemcontextPackage.Literals.XML_ATTRIBUTE__XML_STRING, newXmlString);
	}

} //XMLAttributeImpl
