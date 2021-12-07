/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Role;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.RoleSystemIntegration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role System Integration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.RoleSystemIntegrationImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleSystemIntegrationImpl extends SystemIntegrationImpl implements RoleSystemIntegration
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleSystemIntegrationImpl()
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
		return PcmIntegrationPackage.Literals.ROLE_SYSTEM_INTEGRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole()
	{
		return (Role)eGet(PcmIntegrationPackage.Literals.ROLE_SYSTEM_INTEGRATION__ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole)
	{
		eSet(PcmIntegrationPackage.Literals.ROLE_SYSTEM_INTEGRATION__ROLE, newRole);
	}

} //RoleSystemIntegrationImpl
