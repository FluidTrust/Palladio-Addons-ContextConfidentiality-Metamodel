package org.palladiosimulator.pcm.confidentiality.context.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelFactory;

class CheckAccessRightsSingleAttributeTest {

    @BeforeAll
    static void init() {
        ContextPackage.eINSTANCE.eClass();
    }

    @Test
    void testSingleAttributeNull() {
        final var requestSingleType = ModelFactory.eINSTANCE.createSingleAttributeContext();
        final var poliySingleType = ModelFactory.eINSTANCE.createSingleAttributeContext();
        assertTrue(poliySingleType.checkAccessRight(requestSingleType), "Comparison failed");
    }

    @Test
    void testSingleAttributeName() {
        final var requestSingleType = ModelFactory.eINSTANCE.createSingleAttributeContext();
        final var poliySingleType = ModelFactory.eINSTANCE.createSingleAttributeContext();
        final var poliySingleTypeName = ModelFactory.eINSTANCE.createSingleAttributeContext();
        requestSingleType.setEntityName("Test");
        poliySingleTypeName.setEntityName("Test");
        assertFalse(poliySingleType.checkAccessRight(requestSingleType));
        assertTrue(poliySingleTypeName.checkAccessRight(requestSingleType));
    }

    @Test
    void testSingleAttributeSame() {
        final var requestSingleType = ModelFactory.eINSTANCE.createSingleAttributeContext();
        assertTrue(requestSingleType.checkAccessRight(requestSingleType), "Comparison failed");
    }

    @Test
    void testSingleAttributeDifferentContext() {
        final var requestSingleType = ModelFactory.eINSTANCE.createSingleAttributeContext();
        final var poliyHierachicalType = ModelFactory.eINSTANCE.createHierarchicalContext();
        assertFalse(poliyHierachicalType.checkAccessRight(requestSingleType), "Comparison failed");
    }

    @Test
    void testSingleAttributeSameNameDifferentTypeNull() {
        final var requestSingleType = ModelFactory.eINSTANCE.createSingleAttributeContext();
        final var poliyHierachicalType = ModelFactory.eINSTANCE.createSingleAttributeContext();
        final var type = ModelFactory.eINSTANCE.createContextType();
        requestSingleType.setContexttype(type);
        requestSingleType.setEntityName("Test");
        poliyHierachicalType.setEntityName("Test");
        assertFalse(poliyHierachicalType.checkAccessRight(requestSingleType), "Comparison failed");
    }

    @Test
    void testSingleAttributeSameNameDifferentType() {
        final var requestSingleType = ModelFactory.eINSTANCE.createSingleAttributeContext();
        final var poliyHierachicalType = ModelFactory.eINSTANCE.createSingleAttributeContext();
        final var type = ModelFactory.eINSTANCE.createContextType();
        final var type2 = ModelFactory.eINSTANCE.createContextType();
        requestSingleType.setContexttype(type);
        poliyHierachicalType.setContexttype(type2);
        requestSingleType.setEntityName("Test");
        poliyHierachicalType.setEntityName("Test");
        assertFalse(poliyHierachicalType.checkAccessRight(requestSingleType), "Comparison failed");
    }

    @Test
    void testSingleAttributeSameType() {
        final var requestSingleType = ModelFactory.eINSTANCE.createSingleAttributeContext();
        final var poliyHierachicalType = ModelFactory.eINSTANCE.createSingleAttributeContext();
        final var type = ModelFactory.eINSTANCE.createContextType();
        requestSingleType.setContexttype(type);
        poliyHierachicalType.setContexttype(type);
        requestSingleType.setEntityName("Test");
        poliyHierachicalType.setEntityName("Test");
        assertTrue(poliyHierachicalType.checkAccessRight(requestSingleType), "Comparison failed");
    }

}
