/**
 */
package org.palladiosimulator.pcm.confidentiality.context.set.impl;

import java.security.Policy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute;

import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;
import org.palladiosimulator.pcm.confidentiality.context.set.SetPackage;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.set.impl.ContextSetImpl#getContexts <em>Contexts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextSetImpl extends EntityImpl implements ContextSet
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextSetImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SetPackage.Literals.CONTEXT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ContextAttribute> getContexts()
	{
		return (EList<ContextAttribute>)eGet(SetPackage.Literals.CONTEXT_SET__CONTEXTS, true);
	}

	/**
	 * Checks whether this context set is fullfilled by the attribute set
	 * @param set context set to check against 
	 * @generated NOT
	 */
	public boolean checkAccessRight(ContextSet set)
	{
	    if(this.getContexts().isEmpty()) {
	        return false;
	    }
        for (var policyItem : this.getContexts()) {
            if (!checkContextAttribute(policyItem, set))
                return false;
        }
        return true;
	}
	
    private boolean checkContextAttribute(ContextAttribute policy, ContextSet request) {
        return request.getContexts().stream().anyMatch(e -> policy.checkAccessRight(e));

    }

} //ContextSetImpl
