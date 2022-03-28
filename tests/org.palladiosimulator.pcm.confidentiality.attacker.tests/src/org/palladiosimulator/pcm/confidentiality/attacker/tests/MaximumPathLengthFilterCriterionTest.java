/**
 */
package org.palladiosimulator.pcm.confidentiality.attacker.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackPath;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerFactory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationFactory;

public class MaximumPathLengthFilterCriterionTest
{
    @Test
    public void isElementFilteredTest(){
        final var filter = AttackerFactory.eINSTANCE.createMaximumPathLengthFilterCriterion();
        
        final var paths = createPaths(0, 10);
        for (final var path : paths) {
            Assert.assertFalse(filter.isElementFiltered(null, null, path));
        }
        filter.setMaximumPathLength(5);
        for (int i = 0; i <= 10; i++) {
            final var path = paths.get(i);
            if (i <= 5) {
                Assert.assertFalse(filter.isElementFiltered(null, null, path));
            } else {
                Assert.assertTrue(filter.isElementFiltered(null, null, path));
            }
        }
    }

    private List<AttackPath> createPaths(int from, int to) {
        final List<AttackPath> paths = new ArrayList<>();
        
        for (int i = from; i <= to; i++) {
            final var path = AttackerFactory.eINSTANCE.createAttackPath();
            for (int j = from; j < i; j++) {
                path.getPath().add(PcmIntegrationFactory.eINSTANCE.createDefaultSystemIntegration());
            }
            paths.add(path);
        }
        
        return paths;
    }
}
