package org.palladiosimulator.pcm.confidentiality.context.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelFactory;
import org.palladiosimulator.pcm.confidentiality.context.set.SetFactory;

public class CheckAccessRightsRelatedContextSetTest {
    
    @BeforeAll
    static void init() {
        ContextPackage.eINSTANCE.eClass();
    }
    @Test
    void testSingleAttributeRelatedContext() {
        var requestSingleType = ModelFactory.eINSTANCE.createSingleAttributeContext();
        var poliyRelatedType = ModelFactory.eINSTANCE.createRelatedContextSet();
        var contextSet = SetFactory.eINSTANCE.createContextSet();
        contextSet.getContexts().add(requestSingleType);
        poliyRelatedType.setContextset(contextSet);
        
        assertFalse(poliyRelatedType.checkAccessRight(requestSingleType), "Comparison failed");
    }
    @Test
    void testSingleAttributeRelatedContextRelated() {
        var singleType = ModelFactory.eINSTANCE.createSingleAttributeContext();
        var poliyRelatedType = ModelFactory.eINSTANCE.createRelatedContextSet();
        var requestType = ModelFactory.eINSTANCE.createRelatedContextSet();
        var contextSet = SetFactory.eINSTANCE.createContextSet();
        
        contextSet.getContexts().add(singleType);
        poliyRelatedType.setContextset(contextSet);
        requestType.setContextset(contextSet);
        
        assertTrue(poliyRelatedType.checkAccessRight(requestType), "Comparison failed");
    }
    

}
