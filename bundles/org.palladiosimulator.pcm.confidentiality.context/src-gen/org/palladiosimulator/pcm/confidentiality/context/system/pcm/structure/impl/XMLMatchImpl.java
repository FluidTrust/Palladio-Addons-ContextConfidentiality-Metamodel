/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.XMLMatch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.XMLMatchImpl#getXmlString <em>Xml String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XMLMatchImpl extends CDOObjectImpl implements XMLMatch
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLMatchImpl()
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
		return StructurePackage.Literals.XML_MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount()
	{
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXmlString()
	{
		return (String)eGet(StructurePackage.Literals.XML_MATCH__XML_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlString(String newXmlString)
	{
		eSet(StructurePackage.Literals.XML_MATCH__XML_STRING, newXmlString);
	}

} //XMLMatchImpl
