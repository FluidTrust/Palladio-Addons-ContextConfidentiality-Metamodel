/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;
import org.palladiosimulator.pcm.confidentiality.context.policy.XMLString;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.XMLStringImpl#getString <em>String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XMLStringImpl extends ExpressionImpl implements XMLString
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLStringImpl()
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
		return PolicyPackage.Literals.XML_STRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getString()
	{
		return (String)eGet(PolicyPackage.Literals.XML_STRING__STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setString(String newString)
	{
		eSet(PolicyPackage.Literals.XML_STRING__STRING, newString);
	}

} //XMLStringImpl
