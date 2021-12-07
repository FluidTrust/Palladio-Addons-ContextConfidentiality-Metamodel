/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.policy.Apply;
import org.palladiosimulator.pcm.confidentiality.context.policy.Expression;
import org.palladiosimulator.pcm.confidentiality.context.policy.Operations;
import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.ApplyImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.ApplyImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplyImpl extends ExpressionImpl implements Apply
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplyImpl()
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
		return PolicyPackage.Literals.APPLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Expression> getParameters()
	{
		return (List<Expression>)eGet(PolicyPackage.Literals.APPLY__PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operations getOperation()
	{
		return (Operations)eGet(PolicyPackage.Literals.APPLY__OPERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operations newOperation)
	{
		eSet(PolicyPackage.Literals.APPLY__OPERATION, newOperation);
	}

} //ApplyImpl
