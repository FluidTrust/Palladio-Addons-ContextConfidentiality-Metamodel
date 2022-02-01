/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.CredentialSystemIntegration;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage;

import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credential System Integration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.CredentialSystemIntegrationImpl#getCredential <em>Credential</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CredentialSystemIntegrationImpl extends SystemIntegrationImpl implements CredentialSystemIntegration
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CredentialSystemIntegrationImpl()
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
		return PcmIntegrationPackage.Literals.CREDENTIAL_SYSTEM_INTEGRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageSpecification getCredential()
	{
		return (UsageSpecification)eGet(PcmIntegrationPackage.Literals.CREDENTIAL_SYSTEM_INTEGRATION__CREDENTIAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredential(UsageSpecification newCredential)
	{
		eSet(PcmIntegrationPackage.Literals.CREDENTIAL_SYSTEM_INTEGRATION__CREDENTIAL, newCredential);
	}
	
	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getIdOfContent()
    {
        return this.getCredential() == null ? null : this.getCredential().getId();
    }

} //CredentialSystemIntegrationImpl
