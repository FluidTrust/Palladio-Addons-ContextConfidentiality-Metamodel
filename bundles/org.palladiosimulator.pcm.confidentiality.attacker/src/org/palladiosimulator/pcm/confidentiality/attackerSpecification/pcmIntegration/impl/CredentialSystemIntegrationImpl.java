/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.CredentialSystemIntegration;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationFactory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Credential System
 * Integration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.CredentialSystemIntegrationImpl#getCredential
 * <em>Credential</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CredentialSystemIntegrationImpl extends CredentialSystemIntegrationImplGen
        implements CredentialSystemIntegration {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public Identifier getIdOfContent() {
        return this.getCredential() == null ? null : this.getCredential();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public SystemIntegration getCopyExceptElement() {
        final var sysIntegration = PcmIntegrationFactory.eINSTANCE.createCredentialSystemIntegration();
        sysIntegration.setCredential(this.getCredential());

        sysIntegration.setEntityName("copy of " + this.getEntityName());
        return sysIntegration;
    }

} // CredentialSystemIntegrationImpl
