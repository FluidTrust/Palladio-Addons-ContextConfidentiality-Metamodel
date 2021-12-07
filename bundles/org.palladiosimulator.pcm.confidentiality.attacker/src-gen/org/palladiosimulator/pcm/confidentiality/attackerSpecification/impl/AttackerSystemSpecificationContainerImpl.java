/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSystemSpecificationContainer;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Specification Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerSystemSpecificationContainerImpl#getVulnerabilities <em>Vulnerabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackerSystemSpecificationContainerImpl extends CDOObjectImpl implements AttackerSystemSpecificationContainer
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackerSystemSpecificationContainerImpl()
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
		return AttackerPackage.Literals.ATTACKER_SYSTEM_SPECIFICATION_CONTAINER;
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
	@SuppressWarnings("unchecked")
	public EList<SystemIntegration> getVulnerabilities()
	{
		return (EList<SystemIntegration>)eGet(AttackerPackage.Literals.ATTACKER_SYSTEM_SPECIFICATION_CONTAINER__VULNERABILITIES, true);
	}

} //AttackerSystemSpecificationContainerImpl
