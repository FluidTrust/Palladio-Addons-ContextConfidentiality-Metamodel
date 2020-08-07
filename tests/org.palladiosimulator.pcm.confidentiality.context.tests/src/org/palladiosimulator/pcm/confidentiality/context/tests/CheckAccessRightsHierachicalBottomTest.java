package org.palladiosimulator.pcm.confidentiality.context.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;
import org.palladiosimulator.pcm.confidentiality.context.model.HierarchicalContext;
import org.palladiosimulator.pcm.confidentiality.context.model.IncludeDirection;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelFactory;

class CheckAccessRightsHierachicalBottomTest {
    @BeforeAll
    static void init() {
        ContextPackage.eINSTANCE.eClass();
    }
    @Test
    void testHierachicalAttributeOneLayerBottom() {
        var request = ModelFactory.eINSTANCE.createHierarchicalContext();
        var policy = ModelFactory.eINSTANCE.createHierarchicalContext();
        var policy1 = ModelFactory.eINSTANCE.createHierarchicalContext();
        
        request.setEntityName("Gebäude");
        policy.setEntityName("Raum A");
        policy1.setEntityName("Plat1");
        
        policy.getIncluding().add(request);
        setDirection(request, policy, policy1);
        policy.getIncluding().add(policy1);
        
        assertTrue(policy.checkAccessRight(request), "Comparison failed");
    }
    @Test
    void testHierachicalAttributeOneLayerBottomDeny() {
        var request = ModelFactory.eINSTANCE.createHierarchicalContext();
        var policy = ModelFactory.eINSTANCE.createHierarchicalContext();
        var policy1 = ModelFactory.eINSTANCE.createHierarchicalContext();
        
        request.setEntityName("Gebäude");
        policy.setEntityName("Raum A");
        policy1.setEntityName("Plat1");
        request.getIncluding().add(policy);
        setDirection(request, policy, policy1);
        
        assertFalse(policy.checkAccessRight(request), "Comparison failed");
        policy.getIncluding().add(policy1);
        assertFalse(policy1.checkAccessRight(request), "Comparison failed");
    }
    private void setDirection(HierarchicalContext... contexts) {
        for(HierarchicalContext context : contexts)
            context.setDirection(IncludeDirection.BOTTOM_UP);
    }

}
