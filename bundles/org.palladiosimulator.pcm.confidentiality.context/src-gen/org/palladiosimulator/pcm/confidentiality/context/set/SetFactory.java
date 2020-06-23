/**
 */
package org.palladiosimulator.pcm.confidentiality.context.set;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.set.SetPackage
 * @generated
 */
public interface SetFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SetFactory eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.set.impl.SetFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Context Set Container</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Set Container</em>'.
     * @generated
     */
    ContextSetContainer createContextSetContainer();

    /**
     * Returns a new object of class '<em>Context Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Set</em>'.
     * @generated
     */
    ContextSet createContextSet();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SetPackage getSetPackage();

} //SetFactory
