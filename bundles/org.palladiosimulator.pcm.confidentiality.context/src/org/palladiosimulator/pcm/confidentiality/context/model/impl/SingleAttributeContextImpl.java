/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model.impl;

import java.util.Objects;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute;
import org.palladiosimulator.pcm.confidentiality.context.model.HierarchicalContext;
import org.palladiosimulator.pcm.confidentiality.context.model.IncludeDirection;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage;
import org.palladiosimulator.pcm.confidentiality.context.model.SingleAttributeContext;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Single Attribute
 * Context</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class SingleAttributeContextImpl extends ContextAttributeImpl implements SingleAttributeContext {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SingleAttributeContextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.SINGLE_ATTRIBUTE_CONTEXT;
    }

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
        if (!EcoreUtil.equals(context.getContexttype(), this.getContexttype())) {
            return false;
        }
        if (context instanceof HierarchicalContext) {
            final var hierarchicalContext = (HierarchicalContext) context;
            switch (hierarchicalContext.getDirection().getValue()) {
            case IncludeDirection.BOTTOM_UP_VALUE:
                return false;
            case IncludeDirection.TOP_DOWN_VALUE:
                return hierarchicalContext.getIncluding().stream().anyMatch(this::checkAccessRight);
            default:
                assert false;
            }

        }

        if (!(context instanceof SingleAttributeContext)) {
            return false;
        }
        final var contextAttribute = (SingleAttributeContext) context;

        return Objects.equals(contextAttribute.getEntityName(), this.getEntityName());

    }

} // SingleAttributeContextImpl
