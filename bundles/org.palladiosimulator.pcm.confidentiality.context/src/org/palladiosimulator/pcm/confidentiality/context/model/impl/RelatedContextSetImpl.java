/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage;
import org.palladiosimulator.pcm.confidentiality.context.model.RelatedContextSet;
import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Related Context
 * Set</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.RelatedContextSetImpl#getContextset
 * <em>Contextset</em>}</li>
 * <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.RelatedContextSetImpl#getModelEntity
 * <em>Model Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelatedContextSetImpl extends ContextAttributeImpl implements RelatedContextSet {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected RelatedContextSetImpl() {
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.RELATED_CONTEXT_SET;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ContextSet getContextset() {
        return (ContextSet) eGet(ModelPackage.Literals.RELATED_CONTEXT_SET__CONTEXTSET, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setContextset(ContextSet newContextset) {
        eSet(ModelPackage.Literals.RELATED_CONTEXT_SET__CONTEXTSET, newContextset);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject getModelEntity() {
        return (EObject) eGet(ModelPackage.Literals.RELATED_CONTEXT_SET__MODEL_ENTITY, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setModelEntity(EObject newModelEntity) {
        eSet(ModelPackage.Literals.RELATED_CONTEXT_SET__MODEL_ENTITY, newModelEntity);
    }

    @Override
    public boolean checkAccessRight(final ContextAttribute context) {

        if (EcoreUtil.equals(this, context)) {
            return true;
        }
        if (context == null) {
            return false;
        }
        if (!EcoreUtil.equals(getContexttype(), context.getContexttype())) {
            return false;
        }
        if (!(context instanceof RelatedContextSet)) {
            return false;
        }
        final var contextAttribute = (RelatedContextSet) context;

        return getContextset().checkAccessRight(contextAttribute.getContextset());

    }
} // RelatedContextSetImplGen
