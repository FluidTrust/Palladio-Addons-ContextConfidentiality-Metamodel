/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model.impl;

import java.util.Objects;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute;
import org.palladiosimulator.pcm.confidentiality.context.model.HierarchicalContext;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage;
import org.palladiosimulator.pcm.confidentiality.context.model.RelatedContextSet;
import org.palladiosimulator.pcm.confidentiality.context.model.SingleAttributeContext;
import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Context Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.RelatedContextSetImpl#getContextset <em>Contextset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelatedContextSetImpl extends ContextAttributeImpl implements RelatedContextSet
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedContextSetImpl()
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
		return ModelPackage.Literals.RELATED_CONTEXT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextSet getContextset()
	{
		return (ContextSet)eGet(ModelPackage.Literals.RELATED_CONTEXT_SET__CONTEXTSET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextset(ContextSet newContextset)
	{
		eSet(ModelPackage.Literals.RELATED_CONTEXT_SET__CONTEXTSET, newContextset);
	}
	
    @Override
    public boolean checkAccessRight(ContextAttribute context) {
        
        if(EcoreUtil.equals(this, context))
            return true;     
        if(context == null)
            return false;
        if(!EcoreUtil.equals(this.getContexttype(), context.getContexttype()))
            return false;
        if(!(context instanceof RelatedContextSet))
            return false;                   
        var contextAttribute = (RelatedContextSet) context;
        
        return Objects.equals(contextAttribute.getContextset(), getContextset());
        
        
    }

} //RelatedContextSetImpl
