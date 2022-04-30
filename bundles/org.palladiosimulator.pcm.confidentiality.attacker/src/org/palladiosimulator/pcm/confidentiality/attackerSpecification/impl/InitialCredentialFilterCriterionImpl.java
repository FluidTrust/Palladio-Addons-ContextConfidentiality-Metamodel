/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl;

import org.palladiosimulator.pcm.confidentiality.attacker.helper.CredentialEqualityHelper;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackPath;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.InitialCredentialFilterCriterion;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.SurfaceAttacker;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Credential Filter Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.InitialCredentialFilterCriterionImpl#getProhibitedInitialCredentials <em>Prohibited Initial Credentials</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialCredentialFilterCriterionImpl extends InitialCredentialFilterCriterionImplGen implements InitialCredentialFilterCriterion
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isFilteringEarly() {
        return false;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isElementFiltered(SystemIntegration systemIntegration, SurfaceAttacker surfaceAttacker, AttackPath attackPath) {
        return CredentialEqualityHelper.containsAny(attackPath.getCredentialsInitiallyNecessary(), this.getProhibitedInitialCredentials());
    }
} //InitialCredentialFilterCriterionImpl
