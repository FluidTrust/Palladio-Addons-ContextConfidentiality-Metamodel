/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;
import org.palladiosimulator.pcm.confidentiality.context.policy.SimpleAttributeCondition;

import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Attribute Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.SimpleAttributeConditionImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.SimpleAttributeConditionImpl#isOnly <em>Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleAttributeConditionImpl extends AttributeSelectionImpl implements SimpleAttributeCondition
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleAttributeConditionImpl()
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
		return PolicyPackage.Literals.SIMPLE_ATTRIBUTE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageSpecification getAttribute()
	{
		return (UsageSpecification)eGet(PolicyPackage.Literals.SIMPLE_ATTRIBUTE_CONDITION__ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(UsageSpecification newAttribute)
	{
		eSet(PolicyPackage.Literals.SIMPLE_ATTRIBUTE_CONDITION__ATTRIBUTE, newAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnly()
	{
		return (Boolean)eGet(PolicyPackage.Literals.SIMPLE_ATTRIBUTE_CONDITION__ONLY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnly(boolean newOnly)
	{
		eSet(PolicyPackage.Literals.SIMPLE_ATTRIBUTE_CONDITION__ONLY, newOnly);
	}

} //SimpleAttributeConditionImpl
