/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.policy.FunctionReference;
import org.palladiosimulator.pcm.confidentiality.context.policy.Operations;
import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.FunctionReferenceImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionReferenceImpl extends ExpressionImpl implements FunctionReference
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionReferenceImpl()
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
		return PolicyPackage.Literals.FUNCTION_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operations getFunction()
	{
		return (Operations)eGet(PolicyPackage.Literals.FUNCTION_REFERENCE__FUNCTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Operations newFunction)
	{
		eSet(PolicyPackage.Literals.FUNCTION_REFERENCE__FUNCTION, newFunction);
	}

} //FunctionReferenceImpl
