/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackCategory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackVector;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CategoryAttack;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Privileges;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability;
import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Attack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.CategoryAttackImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CategoryAttackImpl<T extends AttackCategory> extends AttackImpl implements CategoryAttack<T>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryAttackImpl()
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
		return AttackSpecificationPackage.Literals.CATEGORY_ATTACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public T getCategory()
	{
		return (T)eGet(AttackSpecificationPackage.Literals.CATEGORY_ATTACK__CATEGORY, true);
	}

	protected boolean checkID(Vulnerability vulnerability) {
	    throw new UnsupportedOperationException();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(T newCategory)
	{
		eSet(AttackSpecificationPackage.Literals.CATEGORY_ATTACK__CATEGORY, newCategory);
	}
	
	@Override
    public boolean canExploit(Vulnerability vulnerability, ContextSet credentialsAttacker, ContextSet credentialsNeeded, AttackVector attackVector)
    {
        if(!checkID(vulnerability))
            return false;
        
        if(!isIncluded(attackVector, vulnerability.getAttackVector())) {
            return false;
        }
        if(vulnerability.getPrivileges() != Privileges.NONE) {
            var tmpCredentials = EcoreUtil.copy(credentialsNeeded);
            if (vulnerability.getPrivileges() == Privileges.SPECIAL) //TODO think whether this is useful?
                tmpCredentials.getContexts().addAll(vulnerability.getRequiredCredentials().getContexts());
            if(!tmpCredentials.checkAccessRight(credentialsAttacker)) {
                return false;
            }                
        }                            
        
        return true;
    }
	
	private boolean isIncluded(AttackVector current, AttackVector target) {
	    if(current.equals(target))
	        return true;
	    else if(target == AttackVector.NETWORK) {
	        return current == AttackVector.LOCAL || current == AttackVector.ADJACENT_NETWORK;
	    }
	    else if(target == AttackVector.ADJACENT_NETWORK) {
	        return current == AttackVector.LOCAL; 
	    }
	    return false;
	}
	

} //CategoryAttackImpl
