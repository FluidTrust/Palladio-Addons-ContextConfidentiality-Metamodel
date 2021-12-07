/**
 */
package org.palladiosimulator.pcm.confidentiality.context.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

import org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet;

import org.palladiosimulator.pcm.confidentiality.context.system.SystemSpecificationContainer;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attributes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Confidential Access Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.impl.ConfidentialAccessSpecificationImpl#getPcmspecificationcontainer <em>Pcmspecificationcontainer</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.impl.ConfidentialAccessSpecificationImpl#getPolicyset <em>Policyset</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.impl.ConfidentialAccessSpecificationImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfidentialAccessSpecificationImpl extends CDOObjectImpl implements ConfidentialAccessSpecification
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfidentialAccessSpecificationImpl()
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
		return ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount()
	{
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSpecificationContainer getPcmspecificationcontainer()
	{
		return (SystemSpecificationContainer)eGet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__PCMSPECIFICATIONCONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmspecificationcontainer(SystemSpecificationContainer newPcmspecificationcontainer)
	{
		eSet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__PCMSPECIFICATIONCONTAINER, newPcmspecificationcontainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicySet getPolicyset()
	{
		return (PolicySet)eGet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__POLICYSET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyset(PolicySet newPolicyset)
	{
		eSet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__POLICYSET, newPolicyset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes getAttributes()
	{
		return (Attributes)eGet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(Attributes newAttributes)
	{
		eSet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__ATTRIBUTES, newAttributes);
	}

} //ConfidentialAccessSpecificationImpl
