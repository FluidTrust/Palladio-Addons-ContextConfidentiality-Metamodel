/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.policy.AttributeValueReference;
import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeValueReferenceImpl#getAttributevalue <em>Attributevalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeValueReferenceImpl extends ExpressionImpl implements AttributeValueReference
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueReferenceImpl()
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
		return PolicyPackage.Literals.ATTRIBUTE_VALUE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValue getAttributevalue()
	{
		return (AttributeValue)eGet(PolicyPackage.Literals.ATTRIBUTE_VALUE_REFERENCE__ATTRIBUTEVALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributevalue(AttributeValue newAttributevalue)
	{
		eSet(PolicyPackage.Literals.ATTRIBUTE_VALUE_REFERENCE__ATTRIBUTEVALUE, newAttributevalue);
	}

} //AttributeValueReferenceImpl
