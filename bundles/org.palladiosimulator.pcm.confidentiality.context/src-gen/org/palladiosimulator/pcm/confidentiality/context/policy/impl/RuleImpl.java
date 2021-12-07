/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.policy.AllOf;
import org.palladiosimulator.pcm.confidentiality.context.policy.Expression;
import org.palladiosimulator.pcm.confidentiality.context.policy.PermitType;
import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;
import org.palladiosimulator.pcm.confidentiality.context.policy.Rule;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.RuleImpl#getPermit <em>Permit</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.RuleImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.RuleImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends EntityImpl implements Rule
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl()
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
		return PolicyPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermitType getPermit()
	{
		return (PermitType)eGet(PolicyPackage.Literals.RULE__PERMIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermit(PermitType newPermit)
	{
		eSet(PolicyPackage.Literals.RULE__PERMIT, newPermit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition()
	{
		return (Expression)eGet(PolicyPackage.Literals.RULE__CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition)
	{
		eSet(PolicyPackage.Literals.RULE__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<AllOf> getTarget()
	{
		return (List<AllOf>)eGet(PolicyPackage.Literals.RULE__TARGET, true);
	}

} //RuleImpl
