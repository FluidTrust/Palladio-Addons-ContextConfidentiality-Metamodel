/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackPath;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.InitialCredentialFilterCriterion;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.SurfaceAttacker;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration;
import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;

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
        return containsAny(attackPath.getCredentialsInitiallyNecessary(), this.getProhibitedInitialCredentials());
    }

    private boolean containsAny(EList<UsageSpecification> credentialsInitiallyNecessary,
            EList<UsageSpecification> prohibitedInitialCredentials) {
        return credentialsInitiallyNecessary
                .stream()
                .anyMatch(c -> {
                    for (final var cred : prohibitedInitialCredentials) {
                        if (equals(c, cred)) {
                            return true;
                        }
                    }
                    return false;
                });
    }
    
    private boolean equals(UsageSpecification referenceCredential, UsageSpecification credential) {
        if (referenceCredential.equals(credential)) {
            return true;
        }
        
        var attributesEquals = EcoreUtil.equals(referenceCredential.getAttribute(), 
                credential.getAttribute());
        var valueEquals = EcoreUtil.equals(referenceCredential.getAttributevalue(),
                credential.getAttributevalue());

        return attributesEquals && valueEquals;
    }
} //InitialCredentialFilterCriterionImpl
