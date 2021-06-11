/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute;
import org.palladiosimulator.pcm.confidentiality.context.model.HierarchicalContext;
import org.palladiosimulator.pcm.confidentiality.context.model.IncludeDirection;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Hierarchical
 * Context</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.HierarchicalContextImpl#getIncluding
 * <em>Including</em>}</li>
 * <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.HierarchicalContextImpl#getDirection
 * <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HierarchicalContextImpl extends HierarchicalContextImplGen implements HierarchicalContext {
    /**
     * @generated NOT
     */
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
        switch (getDirection().getValue()) {
        case IncludeDirection.BOTTOM_UP_VALUE:
            final var includes = getIncluding();
            final var value1 = includes.stream().anyMatch(e -> e.checkAccessRight(context));
            return value1;

        case IncludeDirection.TOP_DOWN_VALUE:
            if (!(context instanceof HierarchicalContext)) {
                return false;
            }
            final var contextAttribute = (HierarchicalContext) context;
            final var list = contextAttribute.getIncluding();
            return list.stream().anyMatch(this::checkAccessRight);
        default:
            assert false;
        }
        return false;
    }

}
