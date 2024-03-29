/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationFactory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.RoleSystemIntegration;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Role System
 * Integration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.RoleSystemIntegrationImpl#getRole
 * <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleSystemIntegrationImpl extends RoleSystemIntegrationImplGen implements RoleSystemIntegration {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public Identifier getIdOfContent() {
        return this.getRole() == null ? null : this.getRole();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public SystemIntegration getCopyExceptElement() {
        final var sysIntegration = PcmIntegrationFactory.eINSTANCE.createRoleSystemIntegration();
        sysIntegration.setRole(this.getRole());

        sysIntegration.setEntityName("copy of " + this.getEntityName());
        return sysIntegration;
    }

} // RoleSystemIntegrationImpl
