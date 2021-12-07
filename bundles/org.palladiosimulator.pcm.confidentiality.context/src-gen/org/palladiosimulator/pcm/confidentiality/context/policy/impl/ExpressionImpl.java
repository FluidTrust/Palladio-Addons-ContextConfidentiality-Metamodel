/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.policy.Expression;
import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ExpressionImpl extends EntityImpl implements Expression
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl()
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
		return PolicyPackage.Literals.EXPRESSION;
	}

} //ExpressionImpl
