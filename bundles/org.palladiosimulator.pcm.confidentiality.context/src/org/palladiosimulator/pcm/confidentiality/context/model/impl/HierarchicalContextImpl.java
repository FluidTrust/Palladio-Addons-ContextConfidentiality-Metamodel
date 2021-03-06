/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute;
import org.palladiosimulator.pcm.confidentiality.context.model.ContextContainer;
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
    @SuppressWarnings("unchecked")
    public EList<ContextAttribute> getIncluding() {
        return (EList<ContextAttribute>) eGet(ModelPackage.Literals.HIERARCHICAL_CONTEXT__INCLUDING, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public IncludeDirection getDirection() {
        return (IncludeDirection) eGet(ModelPackage.Literals.HIERARCHICAL_CONTEXT__DIRECTION, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDirection(IncludeDirection newDirection) {
        eSet(ModelPackage.Literals.HIERARCHICAL_CONTEXT__DIRECTION, newDirection);
    }

    /**
     * @generated NOT
     */
    @Override
    public boolean checkAccessRight(ContextAttribute context) {
        if (EcoreUtil.equals(this, context))
            return true;
        if(context == null)
            return false;
        if(!EcoreUtil.equals(this.getContexttype(), context.getContexttype()))
            return false;
        switch (getDirection().getValue()) {
        case IncludeDirection.BOTTOM_UP_VALUE:
            var includes = this.getIncluding();
            var value1 = includes.stream().anyMatch(e -> e.checkAccessRight(context));
            return value1;

        case IncludeDirection.TOP_DOWN_VALUE:
            if(!(context instanceof HierarchicalContext))
                return false;
            var contextAttribute = (HierarchicalContext) context;
            var list = contextAttribute.getIncluding();
            return list.stream().anyMatch(this::checkAccessRight);
        default:
            assert false;
        }
        return false;
    }

} // HierarchicalContextImpl
