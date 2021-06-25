package org.palladiosimulator.pcm.confidentiality.context.tests;

//TODO check naming
class CheckAccessRightsHierachicalBottomTest {
//    @BeforeAll
//    static void init() {
//
//        ContextPackage.eINSTANCE.eClass();
//
//    }
//
//    @Test
//    void testHierachicalAttributeOneLayerBottom() {
//        final var request = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy1 = ModelFactory.eINSTANCE.createHierarchicalContext();
//        // FIXME wrong oder of naming
//        request.setEntityName("Gebäude");
//        policy.setEntityName("Raum A");
//        policy1.setEntityName("Plat1");
//
//        policy.getIncluding().add(request);
//        this.setDirection(request, policy, policy1);
//        policy.getIncluding().add(policy1);
//
//        assertTrue(policy.checkAccessRight(request), "Comparison failed");
//    }
//
//    @Test
//    void testHierachicalAttributeOneLayerBottomLastSingle() {
//        final var request = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy1 = ModelFactory.eINSTANCE.createSingleAttributeContext();
//
//        request.setEntityName("Gebäude");
//        policy.setEntityName("Raum A");
//        policy1.setEntityName("Plat1");
//
//        policy.getIncluding().add(request);
//        this.setDirection(request, policy);
//        policy.getIncluding().add(policy1);
//
//        assertTrue(policy.checkAccessRight(request), "Comparison failed");
//    }
//
//    @Test
//    void testHierachicalAttributeOneLayerBottomDeny() {
//        final var request = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy1 = ModelFactory.eINSTANCE.createHierarchicalContext();
//
//        request.setEntityName("Gebäude");
//        policy.setEntityName("Raum A");
//        policy1.setEntityName("Plat1");
//        request.getIncluding().add(policy);
//        this.setDirection(request, policy, policy1);
//
//        assertFalse(policy.checkAccessRight(request), "Comparison failed");
//        policy.getIncluding().add(policy1);
//        assertFalse(policy1.checkAccessRight(request), "Comparison failed");
//    }
//
//    @Test
//    void testHierachicalAttributeOneLayerBottomDenySingle() {
//        final var request = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy = ModelFactory.eINSTANCE.createHierarchicalContext();
//        final var policy1 = ModelFactory.eINSTANCE.createSingleAttributeContext();
//
//        request.setEntityName("Gebäude");
//        policy.setEntityName("Raum A");
//        policy1.setEntityName("Plat1");
//        request.getIncluding().add(policy);
//        this.setDirection(request, policy);
//
//        assertFalse(policy.checkAccessRight(request), "Comparison failed");
//        policy.getIncluding().add(policy1);
//        assertFalse(policy1.checkAccessRight(request), "Comparison failed");
//    }
//
//    private void setDirection(final HierarchicalContext... contexts) {
//        for (final HierarchicalContext context : contexts) {
//            context.setDirection(IncludeDirection.BOTTOM_UP);
//        }
//    }

}
