package contextconfidentiality.externaljavaactions;

import java.util.Collection;
import java.util.Map;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.factory.SessionFactory;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification;
import org.palladiosimulator.pcm.confidentiality.context.policy.Policy;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import contextconfidentiality.service.ApplyProfilesStereotypes;
import contextconfidentiality.service.OpenPolicyDialog;
import contextconfidentiality.service.OpenResourceDialog;
import contextconfidentiality.service.PolicyVisibility;
import java.util.logging.Logger;


public class AddExistingPolicyToSeff implements IExternalJavaAction {
	private static final Logger logger = Logger.getLogger( AddExistingPolicyToSeff.class.getName());
	
	public AddExistingPolicyToSeff() {}

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		
		try {	
			ResourceDemandingSEFF seff = (ResourceDemandingSEFF) arg1.get("container");
			DSemanticDiagram seffDiagram = (DSemanticDiagram) arg1.get("containerView");

			ConfidentialAccessSpecification root = (ConfidentialAccessSpecification) OpenResourceDialog.loadResourceFromXMI(seff, logger);
			EList <Policy> ls_policy = (root != null)? root.getPolicyContainer().getPolicies() : null;
			Policy selectedPolicy = (ls_policy != null)? (Policy) OpenPolicyDialog.loadPolicyFromXMI(ls_policy) : null;
			
			if (selectedPolicy != null) {
				logger.info("Adding " + selectedPolicy.getEntityName() + " Policy to SEFF");
			
				ApplyProfilesStereotypes.applyProfilesStereotypes(arg0, seff, selectedPolicy);

				Session session = SessionManager.INSTANCE.getExistingSession(seffDiagram.eResource().getURI());				
				session.save(new NullProgressMonitor());
				IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
						.getActiveEditor();
				
				
				/* Close Active Editor and open New Session and Editor to make added Policy visible */
				DialectUIManager.INSTANCE.closeEditor(editor, true);
				Session new_session = SessionFactory.INSTANCE.createSession(seffDiagram.eResource().getURI(), new NullProgressMonitor());		
				new_session.open(new NullProgressMonitor());
				new_session.save(new NullProgressMonitor());
				DialectUIManager.INSTANCE.openEditor(new_session, seffDiagram, new NullProgressMonitor());
		
				
				/* Only show selected Policy --> hide unselected Policies 
				 * --> works only after initially adding Policy to SEFF */
				PolicyVisibility.show_hide_containers(selectedPolicy, seffDiagram);
				new_session.save(new NullProgressMonitor());
				logger.info("Finished adding Policy to SEFF");
			}
			
		} catch (CoreException e) {
			logger.severe("Couldn't Create new Session");
			e.printStackTrace();
		}
	}
}
