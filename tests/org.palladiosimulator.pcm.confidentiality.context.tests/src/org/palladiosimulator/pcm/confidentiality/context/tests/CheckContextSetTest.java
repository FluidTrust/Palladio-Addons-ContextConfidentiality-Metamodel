package org.palladiosimulator.pcm.confidentiality.context.tests;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;
import org.palladiosimulator.pcm.confidentiality.context.set.SetFactory;

class CheckContextSetTest {
    
    @BeforeAll
    static void init() {
        ContextPackage.eINSTANCE.eClass();
    }
    
    @Test
    void testEmptySet() {
        var requestor = SetFactory.eINSTANCE.createContextSet();
        var policy = SetFactory.eINSTANCE.createContextSet();
        
        assertFalse(policy.checkAccessRight(requestor));
    }

}
