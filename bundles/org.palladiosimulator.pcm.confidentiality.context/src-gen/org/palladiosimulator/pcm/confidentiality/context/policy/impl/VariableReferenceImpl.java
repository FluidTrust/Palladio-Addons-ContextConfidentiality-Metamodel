/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;
import org.palladiosimulator.pcm.confidentiality.context.policy.VariableDefinitions;
import org.palladiosimulator.pcm.confidentiality.context.policy.VariableReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.VariableReferenceImpl#getVariabledefinitions <em>Variabledefinitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableReferenceImpl extends ExpressionImpl implements VariableReference
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableReferenceImpl()
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
		return PolicyPackage.Literals.VARIABLE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDefinitions getVariabledefinitions()
	{
		return (VariableDefinitions)eGet(PolicyPackage.Literals.VARIABLE_REFERENCE__VARIABLEDEFINITIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariabledefinitions(VariableDefinitions newVariabledefinitions)
	{
		eSet(PolicyPackage.Literals.VARIABLE_REFERENCE__VARIABLEDEFINITIONS, newVariabledefinitions);
	}

} //VariableReferenceImpl
