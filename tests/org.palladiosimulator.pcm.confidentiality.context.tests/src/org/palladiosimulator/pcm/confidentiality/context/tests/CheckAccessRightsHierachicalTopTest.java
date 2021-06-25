package org.palladiosimulator.pcm.confidentiality.context.tests;

class CheckAccessRightsHierachicalTopTest {

//    @BeforeAll
//    static void init() {
//        ContextPackage.eINSTANCE.eClass();
//    }
//
//    @Test
//    void testHierachicalAttributeSame() {
//        final var request = ModelFactory.eINSTANCE.createHierarchicalContext();
//        assertTrue(request.checkAccessRight(request), "Comparison failed");
//    }
//
//    @Test
//    void testHierachicalAttributeOneLayer() {
//        final var request = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy1 = ModelFactory.eINSTANCE.createHierarchicalContext();
//
//        request.setEntityName("Root");
//        request.getIncluding().add(policy);
//        policy.getIncluding().add(policy1);
//        policy.setEntityName("test");
//
//        assertFalse(request.checkAccessRight(policy));
//
//        assertTrue(policy.checkAccessRight(request), "Comparison failed");
//    }
//
//    @Test
//    void testHierachicalAttributeOneLayerSingle() {
//        final var request = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy1 = ModelFactory.eINSTANCE.createSingleAttributeContext();
//
//        request.setEntityName("Root");
//        request.getIncluding().add(policy);
//        policy.getIncluding().add(policy1);
//        policy.setEntityName("test");
//
//        assertFalse(request.checkAccessRight(policy));
//
//        assertTrue(policy.checkAccessRight(request), "Comparison failed");
//    }
//
//    @Test
//    void testHierachicalAttributeTwoLayers() {
//        final var request = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy1 = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy2 = ModelFactory.eINSTANCE.createHierarchicalContext();
//
//        request.getIncluding().add(policy);
//        policy.getIncluding().add(policy1);
//        policy1.getIncluding().add(policy2);
//
//        assertFalse(request.checkAccessRight(policy2));
//
//        assertTrue(policy2.checkAccessRight(request), "Comparison failed");
//    }
//
//    @Test
//    void testHierachicalAttributeSingleAttribute() {
//        final var request = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy = ModelFactory.eINSTANCE.createSingleAttributeContext();
//
//        request.setEntityName("root");
//        policy.setEntityName("test");
//        request.getIncluding().add(policy);
//
//        assertTrue(policy.checkAccessRight(request), "Comparison failed");
//    }
//
//    @Test
//    void testHierachicalAttributeSingleAttributeWrongTypeNull() {
//        final var request = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy = ModelFactory.eINSTANCE.createSingleAttributeContext();
//
//        final var type = ModelFactory.eINSTANCE.createContextType();
//        request.setContexttype(type);
//        request.setEntityName("root");
//        policy.setEntityName("test");
//        request.getIncluding().add(policy);
//
//        assertFalse(policy.checkAccessRight(request), "Comparison failed");
//    }
//
//    @Test
//    void testHierachicalAttributeSingleAttributeWrongTypeNullSingle() {
//        final var request = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy = ModelFactory.eINSTANCE.createSingleAttributeContext();
//
//        final var type = ModelFactory.eINSTANCE.createContextType();
//        policy.setContexttype(type);
//        request.setEntityName("root");
//        policy.setEntityName("test");
//        request.getIncluding().add(policy);
//
//        assertFalse(policy.checkAccessRight(request), "Comparison failed");
//    }
//
//    @Test
//    void testHierachicalAttributeSingleAttributeWrongType() {
//        final var request = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy = ModelFactory.eINSTANCE.createSingleAttributeContext();
//
//        final var type = ModelFactory.eINSTANCE.createContextType();
//        final var type2 = ModelFactory.eINSTANCE.createContextType();
//        request.setContexttype(type);
//        policy.setContexttype(type2);
//        request.setEntityName("root");
//        policy.setEntityName("test");
//        request.getIncluding().add(policy);
//
//        assertFalse(policy.checkAccessRight(request), "Comparison failed");
//    }
//
//    @Test
//    void testHierachicalAttributeSingleAttributeType() {
//        final var request = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy = ModelFactory.eINSTANCE.createSingleAttributeContext();
//
//        final var type = ModelFactory.eINSTANCE.createContextType();
//
//        request.setContexttype(type);
//        policy.setContexttype(type);
//        request.setEntityName("root");
//        policy.setEntityName("test");
//        request.getIncluding().add(policy);
//        assertTrue(policy.checkAccessRight(request), "Comparison failed");
//    }

}
