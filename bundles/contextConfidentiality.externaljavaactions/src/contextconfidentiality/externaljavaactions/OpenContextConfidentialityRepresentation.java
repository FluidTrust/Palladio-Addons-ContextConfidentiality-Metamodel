package contextconfidentiality.externaljavaactions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.palladiosimulator.editors.sirius.custom.util.SiriusCustomUtil;
import org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification;
import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;

public class OpenContextConfidentialityRepresentation implements IExternalJavaAction {

	public OpenContextConfidentialityRepresentation() { }

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		EObject semantic = (EObject) parameters.get("element");
		Session session = SessionManager.INSTANCE.getSession(semantic);

		String viewpointName = (String) parameters.get("Viewpoint");
		String representationDescriptionName = (String) parameters.get("RepresentationDescription");
		String diagramName = (String) parameters.get("Diagram name");
		
		ContextSet policy = (ContextSet) parameters.get("element");
		
		ConfidentialAccessSpecification root = (ConfidentialAccessSpecification) policy.eContainer().eContainer();
		
		// Select viewpoint
		List<String> selectedViewpoints = new ArrayList<String>();
		selectedViewpoints.add(viewpointName);
		SiriusCustomUtil.selectViewpoints(session, selectedViewpoints, false, new NullProgressMonitor());
		
		// Getting selected viewpoint and representation
		Viewpoint viewpoint = SiriusCustomUtil.getSelectedViewpointByName(session, viewpointName);
		RepresentationDescription description = SiriusCustomUtil.findDescription(
				viewpoint, representationDescriptionName);
		
		// Find representations
		Collection<DRepresentation> representations = DialectManager.INSTANCE.getRepresentations(root, session);
		// create a new representation if none exists and open it
		if (representations.isEmpty()) { 
			String representationName = null;
			if (diagramName != null && !diagramName.isEmpty()) {
				representationName = diagramName;
			} else {
				representationName = ((description.getLabel() == null) ? description.getName() 
						: description.getLabel());
			}
			DRepresentation representation = SiriusCustomUtil.createRepresentation(session, representationName,
					description, root, new NullProgressMonitor());
			DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());
		} else { // open available representations
			for (DRepresentation representation : representations) {
				DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());
			}
		}

	}

}
