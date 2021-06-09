/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute;
import org.palladiosimulator.pcm.confidentiality.context.model.RelatedContextSet;

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
public class RelatedContextSetImpl extends RelatedContextSetImplGen implements RelatedContextSet {
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
