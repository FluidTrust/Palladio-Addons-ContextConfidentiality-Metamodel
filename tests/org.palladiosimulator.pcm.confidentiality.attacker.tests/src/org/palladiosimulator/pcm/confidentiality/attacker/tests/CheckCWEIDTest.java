package org.palladiosimulator.pcm.confidentiality.attacker.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.pcm.confidentiality.attacker.tests.common.TestHelpers;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

class CheckCWEIDTest {
    @BeforeAll
    static void init() {

        ContextPackage.eINSTANCE.eClass();
        AttackerPackage.eINSTANCE.eClass();

    }

    @Test
    void testSameCategoryObject() {
        final var category = TestHelpers.createCWECategory(1, "test");

        assertTrue(category.equalAttackType(category));
    }

    @Test
    void testSameCategory() {
        final var category = TestHelpers.createCWECategory(1, "test");
        final var categoryCompare = TestHelpers.createCWECategory(1, "test");
        assertTrue(category.equalAttackType(categoryCompare));
    }

    @Test
    void testSameIdDifferentName() {
        final var category = TestHelpers.createCWECategory(1, "test");
        final var categoryCompare = TestHelpers.createCWECategory(1, null);
        assertFalse(category.equalAttackType(categoryCompare));
    }

    @Test
    void testSameNameDifferentID() {
        final var category = TestHelpers.createCWECategory(1, "test");
        final var categoryCompare = TestHelpers.createCWECategory(2, "test");
        assertFalse(category.equalAttackType(categoryCompare));
    }

    @Test
    void testChildSame() {
        final var category = TestHelpers.createCWECategory(1, "test");
        final var categoryChild = TestHelpers.createCWECategory(2, "test2");
        category.getChildren().add(categoryChild);
        assertTrue(category.equalAttackType(categoryChild));
    }

    @Test
    void testChildCopy() {
        final var category = TestHelpers.createCWECategory(1, "test");
        final var categoryChild = TestHelpers.createCWECategory(2, "test2");
        category.getChildren().add(categoryChild);

        final var categoryChildCompare = TestHelpers.createCWECategory(2, "test2");
        assertTrue(category.equalAttackType(categoryChildCompare));
    }

    @Test
    void test2Children() {
        final var category = TestHelpers.createCWECategory(1, "test");
        final var categoryChild1 = TestHelpers.createCWECategory(2, "test2");
        final var categoryChild2 = TestHelpers.createCWECategory(3, "test3");
        category.getChildren().add(categoryChild1);
        category.getChildren().add(categoryChild2);
        assertTrue(category.equalAttackType(categoryChild1));
        assertTrue(category.equalAttackType(categoryChild2));
    }

    @Test
    void test2HierachyChildren() {
        final var category = TestHelpers.createCWECategory(1, "test");
        final var categoryChild = TestHelpers.createCWECategory(2, "test2");
        final var categoryChildChild = TestHelpers.createCWECategory(3, "test3");
        category.getChildren().add(categoryChild);
        categoryChild.getChildren().add(categoryChildChild);
        assertTrue(category.equalAttackType(categoryChild));
        assertTrue(category.equalAttackType(categoryChildChild));
    }

    @Test
    void testHierachyChildrenWrongDirection() {
        final var parent = TestHelpers.createCWECategory(1, "test");
        final var category = TestHelpers.createCWECategory(2, "test2");
        final var categoryChild = TestHelpers.createCWECategory(3, "test3");
        parent.getChildren().add(category);
        category.getChildren().add(categoryChild);
        assertFalse(category.equalAttackType(parent));
        assertTrue(category.equalAttackType(categoryChild));
    }

}
