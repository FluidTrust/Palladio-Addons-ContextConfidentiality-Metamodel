/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.NonGlobalCommunication;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationFactory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Non Global
 * Communication</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class NonGlobalCommunicationImpl extends NonGlobalCommunicationImplGen implements NonGlobalCommunication {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public SystemIntegration getCopyExceptElement() {
        final var sysIntegration = PcmIntegrationFactory.eINSTANCE.createNonGlobalCommunication();

        sysIntegration.setEntityName("copy of " + this.getEntityName());
        return sysIntegration;
    }

} // NonGlobalCommunicationImpl
