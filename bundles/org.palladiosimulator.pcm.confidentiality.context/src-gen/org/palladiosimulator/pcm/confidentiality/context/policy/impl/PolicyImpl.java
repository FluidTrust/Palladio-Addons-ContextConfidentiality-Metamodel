/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.policy.AllOf;
import org.palladiosimulator.pcm.confidentiality.context.policy.Policy;
import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;
import org.palladiosimulator.pcm.confidentiality.context.policy.Rule;
import org.palladiosimulator.pcm.confidentiality.context.policy.RuleCombiningAlgorihtm;
import org.palladiosimulator.pcm.confidentiality.context.policy.VariableDefinitions;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyImpl#getCombiningAlgorithm <em>Combining Algorithm</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyImpl#getVariabledefinitions <em>Variabledefinitions</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolicyImpl extends EntityImpl implements Policy
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyImpl()
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
		return PolicyPackage.Literals.POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleCombiningAlgorihtm getCombiningAlgorithm()
	{
		return (RuleCombiningAlgorihtm)eGet(PolicyPackage.Literals.POLICY__COMBINING_ALGORITHM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombiningAlgorithm(RuleCombiningAlgorihtm newCombiningAlgorithm)
	{
		eSet(PolicyPackage.Literals.POLICY__COMBINING_ALGORITHM, newCombiningAlgorithm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Rule> getRule()
	{
		return (List<Rule>)eGet(PolicyPackage.Literals.POLICY__RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<VariableDefinitions> getVariabledefinitions()
	{
		return (List<VariableDefinitions>)eGet(PolicyPackage.Literals.POLICY__VARIABLEDEFINITIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<AllOf> getTarget()
	{
		return (List<AllOf>)eGet(PolicyPackage.Literals.POLICY__TARGET, true);
	}

} //PolicyImpl
