/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.DefaultSystemIntegration;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationFactory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default System Integration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DefaultSystemIntegrationImpl extends DefaultSystemIntegrationImplGen implements DefaultSystemIntegration
{
	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public SystemIntegration getCopyExceptElement() {
        final var sysIntegration = PcmIntegrationFactory.eINSTANCE.createDefaultSystemIntegration();
        
        sysIntegration.setEntityName("copy of " + getEntityName());
        return sysIntegration;
    }

} //DefaultSystemIntegrationImpl
