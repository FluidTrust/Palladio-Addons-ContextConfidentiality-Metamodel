package org.palladiosimulator.pcm.confidentiality.context.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelFactory;

class CheckAccessRightsHierachicalTopTest {

    @BeforeAll
    static void init() {
        ContextPackage.eINSTANCE.eClass();
    }
 
    @Test
    void testHierachicalAttributeSame() {
        var request = ModelFactory.eINSTANCE.createHierarchicalContext();
        assertTrue(request.checkAccessRight(request), "Comparison failed");
    }
    
    @Test
    void testHierachicalAttributeOneLayer() {
        var request = ModelFactory.eINSTANCE.createHierarchicalContext();
        var policy = ModelFactory.eINSTANCE.createHierarchicalContext();
        var policy1 = ModelFactory.eINSTANCE.createHierarchicalContext();
        
        request.setEntityName("Root");
        request.getIncluding().add(policy);
        policy.getIncluding().add(policy1);
        policy.setEntityName("test");
        
        
        assertFalse(request.checkAccessRight(policy));
        
        assertTrue(policy.checkAccessRight(request), "Comparison failed");
    }
    @Test
    void testHierachicalAttributeTwoLayers() {
        var request = ModelFactory.eINSTANCE.createHierarchicalContext();
        var policy = ModelFactory.eINSTANCE.createHierarchicalContext();
        var policy1 = ModelFactory.eINSTANCE.createHierarchicalContext();
        var policy2 = ModelFactory.eINSTANCE.createHierarchicalContext();
        
        request.getIncluding().add(policy);
        policy.getIncluding().add(policy1);
        policy1.getIncluding().add(policy2);
        
        assertFalse(request.checkAccessRight(policy2));
        
        assertTrue(policy2.checkAccessRight(request), "Comparison failed");
    }
    @Test
    void testHierachicalAttributeSingleAttribute() {
        var request = ModelFactory.eINSTANCE.createHierarchicalContext();
        var policy = ModelFactory.eINSTANCE.createSingleAttributeContext();
        
        request.setEntityName("root");
        policy.setEntityName("test");
        request.getIncluding().add(policy);
        
        assertTrue(policy.checkAccessRight(request), "Comparison failed");
    }

}
