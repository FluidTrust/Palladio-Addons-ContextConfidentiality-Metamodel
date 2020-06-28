/**
 */
package org.palladiosimulator.pcm.confidentiality.context.specification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage
 * @generated
 */
public interface SpecificationFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SpecificationFactory eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.specification.impl.SpecificationFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>Context Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Specification</em>'.
     * @generated
     */
    ContextSpecification createContextSpecification();

    /**
     * Returns a new object of class '<em>Policy Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Policy Specification</em>'.
     * @generated
     */
    PolicySpecification createPolicySpecification();

    /**
     * Returns a new object of class '<em>PCM Specification Container</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PCM Specification Container</em>'.
     * @generated
     */
    PCMSpecificationContainer createPCMSpecificationContainer();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SpecificationPackage getSpecificationPackage();

} //SpecificationFactory
