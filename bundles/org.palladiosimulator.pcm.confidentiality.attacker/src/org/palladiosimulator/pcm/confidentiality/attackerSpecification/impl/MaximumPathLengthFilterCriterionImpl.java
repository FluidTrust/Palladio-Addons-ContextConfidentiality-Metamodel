/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackPath;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.MaximumPathLengthFilterCriterion;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.SurfaceAttacker;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maximum Path Length Filter Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.MaximumPathLengthFilterCriterionImpl#getMaximumPathLength <em>Maximum Path Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaximumPathLengthFilterCriterionImpl extends MaximumPathLengthFilterCriterionImplGen implements MaximumPathLengthFilterCriterion
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isElementFiltered(final SystemIntegration systemIntegration, 
            final SurfaceAttacker surfaceAttacker, final AttackPath attackPath)
    {
        return getMaximumPathLength() >= 0 && attackPath.getPath().size() > getMaximumPathLength();
    }
} //MaximumPathLengthFilterCriterionImpl
