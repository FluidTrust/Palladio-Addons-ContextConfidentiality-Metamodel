package org.palladiosimulator.pcm.confidentiality.attacker.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.pcm.confidentiality.attacker.tests.common.TestHelpers;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerFactory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackCategory;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;
import org.palladiosimulator.pcm.confidentiality.context.model.HierarchicalContext;
import org.palladiosimulator.pcm.confidentiality.context.model.IncludeDirection;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelFactory;
import org.palladiosimulator.pcm.confidentiality.context.set.SetPackage;
import org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage;
import org.palladiosimulator.pcm.confidentiality.context.specification.assembly.AssemblyPackage;


class CheckCWEIDTest {
    @BeforeAll
    static void init() {
        
        ContextPackage.eINSTANCE.eClass();
        AttackerPackage.eINSTANCE.eClass();
        
    }
    @Test
    void testSameCategoryObject() {
        var category = TestHelpers.createCWECategory(1, "test");
        
        assertTrue(category.equalAttackType(category));
    }
    @Test
    void testSameCategory() {
        var category = TestHelpers.createCWECategory(1, "test");
        var categoryCompare = TestHelpers.createCWECategory(1, "test");
        assertTrue(category.equalAttackType(categoryCompare));
    }
    
    @Test
    void testSameIdDifferentName() {
        var category = TestHelpers.createCWECategory(1, "test");
        var categoryCompare = TestHelpers.createCWECategory(1, null);
        assertFalse(category.equalAttackType(categoryCompare));
    }
    
    @Test
    void testSameNameDifferentID() {
        var category = TestHelpers.createCWECategory(1, "test");
        var categoryCompare = TestHelpers.createCWECategory(2, "test");
        assertFalse(category.equalAttackType(categoryCompare));
    }
    
    @Test
    void testChildSame() {
        var category = TestHelpers.createCWECategory(1, "test");
        var categoryChild = TestHelpers.createCWECategory(2, "test2");
        category.getChildren().add(categoryChild);
        assertTrue(category.equalAttackType(categoryChild));
    }
    
    @Test
    void testChildCopy() {
        var category = TestHelpers.createCWECategory(1, "test");
        var categoryChild = TestHelpers.createCWECategory(2, "test2");
        category.getChildren().add(categoryChild);
        
        var categoryChildCompare = TestHelpers.createCWECategory(2, "test2");
        assertTrue(category.equalAttackType(categoryChildCompare));
    }
    
    @Test
    void test2Children() {
        var category = TestHelpers.createCWECategory(1, "test");
        var categoryChild1 = TestHelpers.createCWECategory(2, "test2");
        var categoryChild2 = TestHelpers.createCWECategory(3, "test3");
        category.getChildren().add(categoryChild1);
        category.getChildren().add(categoryChild2);
        assertTrue(category.equalAttackType(categoryChild1));
        assertTrue(category.equalAttackType(categoryChild2));
    }
    
    @Test
    void test2HierachyChildren() {
        var category = TestHelpers.createCWECategory(1, "test");
        var categoryChild = TestHelpers.createCWECategory(2, "test2");
        var categoryChildChild = TestHelpers.createCWECategory(3, "test3");
        category.getChildren().add(categoryChild);
        categoryChild.getChildren().add(categoryChildChild);
        assertTrue(category.equalAttackType(categoryChild));
        assertTrue(category.equalAttackType(categoryChildChild));
    }
    
    @Test
    void testHierachyChildrenWrongDirection() {
        var parent = TestHelpers.createCWECategory(1, "test");
        var category = TestHelpers.createCWECategory(2, "test2");
        var categoryChild = TestHelpers.createCWECategory(3, "test3");
        parent.getChildren().add(category);
        category.getChildren().add(categoryChild);
        assertFalse(category.equalAttackType(parent));
        assertTrue(category.equalAttackType(categoryChild));
    }

}
