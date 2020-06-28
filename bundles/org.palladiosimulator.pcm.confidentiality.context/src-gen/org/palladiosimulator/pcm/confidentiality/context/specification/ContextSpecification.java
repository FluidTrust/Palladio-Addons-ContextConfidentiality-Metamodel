/**
 */
package org.palladiosimulator.pcm.confidentiality.context.specification;

import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification#getContextset <em>Contextset</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification#getEntrylevelsystemcall <em>Entrylevelsystemcall</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification#getUsagescenario <em>Usagescenario</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage#getContextSpecification()
 * @model
 * @generated
 */
public interface ContextSpecification extends Entity {
    /**
     * Returns the value of the '<em><b>Contextset</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contextset</em>' reference.
     * @see #setContextset(ContextSet)
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage#getContextSpecification_Contextset()
     * @model required="true"
     * @generated
     */
    ContextSet getContextset();

    /**
     * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification#getContextset <em>Contextset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contextset</em>' reference.
     * @see #getContextset()
     * @generated
     */
    void setContextset(ContextSet value);

    /**
     * Returns the value of the '<em><b>Entrylevelsystemcall</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entrylevelsystemcall</em>' reference.
     * @see #setEntrylevelsystemcall(EntryLevelSystemCall)
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage#getContextSpecification_Entrylevelsystemcall()
     * @model
     * @generated
     */
    EntryLevelSystemCall getEntrylevelsystemcall();

    /**
     * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification#getEntrylevelsystemcall <em>Entrylevelsystemcall</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entrylevelsystemcall</em>' reference.
     * @see #getEntrylevelsystemcall()
     * @generated
     */
    void setEntrylevelsystemcall(EntryLevelSystemCall value);

    /**
     * Returns the value of the '<em><b>Usagescenario</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usagescenario</em>' reference.
     * @see #setUsagescenario(UsageScenario)
     * @see org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage#getContextSpecification_Usagescenario()
     * @model
     * @generated
     */
    UsageScenario getUsagescenario();

    /**
     * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification#getUsagescenario <em>Usagescenario</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usagescenario</em>' reference.
     * @see #getUsagescenario()
     * @generated
     */
    void setUsagescenario(UsageScenario value);

} // ContextSpecification
