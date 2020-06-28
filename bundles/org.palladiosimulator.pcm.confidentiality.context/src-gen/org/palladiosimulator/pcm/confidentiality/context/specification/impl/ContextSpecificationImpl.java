/**
 */
package org.palladiosimulator.pcm.confidentiality.context.specification.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;

import org.palladiosimulator.pcm.confidentiality.context.specification.ContextSpecification;
import org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationPackage;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.specification.impl.ContextSpecificationImpl#getContextset <em>Contextset</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.specification.impl.ContextSpecificationImpl#getEntrylevelsystemcall <em>Entrylevelsystemcall</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.specification.impl.ContextSpecificationImpl#getUsagescenario <em>Usagescenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextSpecificationImpl extends EntityImpl implements ContextSpecification {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextSpecificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SpecificationPackage.Literals.CONTEXT_SPECIFICATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSet getContextset() {
        return (ContextSet) eGet(SpecificationPackage.Literals.CONTEXT_SPECIFICATION__CONTEXTSET, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextset(ContextSet newContextset) {
        eSet(SpecificationPackage.Literals.CONTEXT_SPECIFICATION__CONTEXTSET, newContextset);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntryLevelSystemCall getEntrylevelsystemcall() {
        return (EntryLevelSystemCall) eGet(SpecificationPackage.Literals.CONTEXT_SPECIFICATION__ENTRYLEVELSYSTEMCALL,
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntrylevelsystemcall(EntryLevelSystemCall newEntrylevelsystemcall) {
        eSet(SpecificationPackage.Literals.CONTEXT_SPECIFICATION__ENTRYLEVELSYSTEMCALL, newEntrylevelsystemcall);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UsageScenario getUsagescenario() {
        return (UsageScenario) eGet(SpecificationPackage.Literals.CONTEXT_SPECIFICATION__USAGESCENARIO, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUsagescenario(UsageScenario newUsagescenario) {
        eSet(SpecificationPackage.Literals.CONTEXT_SPECIFICATION__USAGESCENARIO, newUsagescenario);
    }

} //ContextSpecificationImpl
