/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage;
import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.impl.UsageSpecificationImpl#getAttributevalue <em>Attributevalue</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.impl.UsageSpecificationImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsageSpecificationImpl extends EntityImpl implements UsageSpecification
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageSpecificationImpl()
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
		return SystemPackage.Literals.USAGE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValue getAttributevalue()
	{
		return (AttributeValue)eGet(SystemPackage.Literals.USAGE_SPECIFICATION__ATTRIBUTEVALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributevalue(AttributeValue newAttributevalue)
	{
		eSet(SystemPackage.Literals.USAGE_SPECIFICATION__ATTRIBUTEVALUE, newAttributevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttribute()
	{
		return (Attribute)eGet(SystemPackage.Literals.USAGE_SPECIFICATION__ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Attribute newAttribute)
	{
		eSet(SystemPackage.Literals.USAGE_SPECIFICATION__ATTRIBUTE, newAttribute);
	}

} //UsageSpecificationImpl
