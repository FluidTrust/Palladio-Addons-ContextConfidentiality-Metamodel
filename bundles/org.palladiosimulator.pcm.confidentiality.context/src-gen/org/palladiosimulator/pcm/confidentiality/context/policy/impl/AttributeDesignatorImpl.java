/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.policy.AttributeDesignator;
import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Designator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeDesignatorImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.AttributeDesignatorImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeDesignatorImpl extends AttributeSelectionImpl implements AttributeDesignator
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDesignatorImpl()
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
		return PolicyPackage.Literals.ATTRIBUTE_DESIGNATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttribute()
	{
		return (Attribute)eGet(PolicyPackage.Literals.ATTRIBUTE_DESIGNATOR__ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Attribute newAttribute)
	{
		eSet(PolicyPackage.Literals.ATTRIBUTE_DESIGNATOR__ATTRIBUTE, newAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypes getType()
	{
		return (DataTypes)eGet(PolicyPackage.Literals.ATTRIBUTE_DESIGNATOR__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataTypes newType)
	{
		eSet(PolicyPackage.Literals.ATTRIBUTE_DESIGNATOR__TYPE, newType);
	}

} //AttributeDesignatorImpl
