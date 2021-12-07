/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.policy.AllOf;
import org.palladiosimulator.pcm.confidentiality.context.policy.Policy;
import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyCombiningAlgorithm;
import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;
import org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicySetImpl#getCombiningAlgorithm <em>Combining Algorithm</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicySetImpl#getPolicyset <em>Policyset</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicySetImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicySetImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolicySetImpl extends EntityImpl implements PolicySet
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicySetImpl()
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
		return PolicyPackage.Literals.POLICY_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyCombiningAlgorithm getCombiningAlgorithm()
	{
		return (PolicyCombiningAlgorithm)eGet(PolicyPackage.Literals.POLICY_SET__COMBINING_ALGORITHM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombiningAlgorithm(PolicyCombiningAlgorithm newCombiningAlgorithm)
	{
		eSet(PolicyPackage.Literals.POLICY_SET__COMBINING_ALGORITHM, newCombiningAlgorithm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<PolicySet> getPolicyset()
	{
		return (List<PolicySet>)eGet(PolicyPackage.Literals.POLICY_SET__POLICYSET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Policy> getPolicy()
	{
		return (List<Policy>)eGet(PolicyPackage.Literals.POLICY_SET__POLICY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<AllOf> getTarget()
	{
		return (List<AllOf>)eGet(PolicyPackage.Literals.POLICY_SET__TARGET, true);
	}

} //PolicySetImpl
