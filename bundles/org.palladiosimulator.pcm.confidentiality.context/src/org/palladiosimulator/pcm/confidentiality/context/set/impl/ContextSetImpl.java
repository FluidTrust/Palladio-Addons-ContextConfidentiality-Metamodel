/**
 */
package org.palladiosimulator.pcm.confidentiality.context.set.impl;

import org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute;
import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Context Set</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.pcm.confidentiality.context.set.impl.ContextSetImpl#getContexts
 * <em>Contexts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextSetImpl extends ContextSetImplGen implements ContextSet {
    /**
     * Checks whether this context set is fullfilled by the attribute set
     *
     * @param set
     *            context set to check against
     * @generated NOT
     */
    @Override
    public boolean checkAccessRight(final ContextSet set) {
        if (getContexts().isEmpty()) {
            return false;
        }
        for (final var policyItem : getContexts()) {
            if (!checkContextAttribute(policyItem, set)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkContextAttribute(final ContextAttribute policy, final ContextSet request) {
        return request.getContexts().stream().anyMatch(e -> policy.checkAccessRight(e));

    }

} // ContextSetImpl
