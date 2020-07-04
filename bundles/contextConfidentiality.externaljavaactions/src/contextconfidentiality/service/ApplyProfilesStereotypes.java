package contextconfidentiality.service;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.palladiosimulator.mdsdprofiles.api.ProfileAPI;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.pcm.confidentiality.context.policy.Policy;
import org.palladiosimulator.pcm.confidentiality.profile.ProfileConstants;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;

public class ApplyProfilesStereotypes {
	
	public static void applyProfilesStereotypes(Collection<? extends EObject> eObjects, ResourceDemandingSEFF seff, Policy policy) {
		
		for (EObject eObject : eObjects) {
			Resource resource = eObject.eResource();
			
			if (!ProfileAPI.hasProfileApplication(resource)) {
				ProfileAPI.applyProfile(resource, ProfileConstants.PROFILE_NAME);
			}
			
			if(StereotypeAPI.isStereotypeApplicable(eObject, ProfileConstants.STEREOTYPE_POLICY)) { 
				StereotypeAPI.applyStereotype(seff, ProfileConstants.STEREOTYPE_POLICY); 
			} 
		}
		
		/* Info: This somehow adds the Policy Container with all Policies 
		 * and not only the selected Policy */
		StereotypeAPI.setTaggedValue(seff, policy, ProfileConstants.STEREOTYPE_POLICY, ProfileConstants.POLICY_STRING);
	}
}
