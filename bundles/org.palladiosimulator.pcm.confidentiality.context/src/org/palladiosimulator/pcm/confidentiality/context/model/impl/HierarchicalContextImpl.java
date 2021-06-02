/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute;
import org.palladiosimulator.pcm.confidentiality.context.model.HierarchicalContext;
import org.palladiosimulator.pcm.confidentiality.context.model.IncludeDirection;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage;

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
public class HierarchicalContextImpl extends ContextAttributeImpl implements HierarchicalContext {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected HierarchicalContextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.HIERARCHICAL_CONTEXT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    public EList<ContextAttribute> getIncluding() {
        return (EList<ContextAttribute>) this.eGet(ModelPackage.Literals.HIERARCHICAL_CONTEXT__INCLUDING, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public IncludeDirection getDirection() {
        return (IncludeDirection) this.eGet(ModelPackage.Literals.HIERARCHICAL_CONTEXT__DIRECTION, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDirection(final IncludeDirection newDirection) {
        this.eSet(ModelPackage.Literals.HIERARCHICAL_CONTEXT__DIRECTION, newDirection);
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
        if (!EcoreUtil.equals(this.getContexttype(), context.getContexttype())) {
            return false;
        }
        switch (this.getDirection().getValue()) {
        case IncludeDirection.BOTTOM_UP_VALUE:
            final var includes = this.getIncluding();
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

} // HierarchicalContextImpl
