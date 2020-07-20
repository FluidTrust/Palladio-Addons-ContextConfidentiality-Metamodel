package contextconfidentiality.externaljavaactions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.palladiosimulator.pcm.confidentiality.context.model.HierarchicalContext;
import org.palladiosimulator.pcm.confidentiality.context.model.IncludeDirection;

public class SetDirection implements IExternalJavaAction {

	public SetDirection() { }

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> parameters) {
		Object object = (Object) parameters.get("element");

		/* Direction can only be set for Hierarchical Contexts */
		if (object instanceof HierarchicalContext) {

		    HierarchicalContext semantic = (HierarchicalContext)
					parameters.get("element");								
			var direction = loadDirection();
			semantic.setDirection(direction);
		}
		
	}
	
	private static IncludeDirection loadDirection() {
		
		Shell shell = Display.getCurrent().getActiveShell(); 
		shell = getShell();
		shell.open();
		 	
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, new LabelProvider());

		dialog.setTitle("Set Direction");
		dialog.setMessage("Select a Direction (* = any string, ? = any char):");
		dialog.setElements(new Object[] { "TOPDOWN", "BOTTOMUP" });
		dialog.open();
		
		Object[] selection = dialog.getResult();
		String selectionName = selection[0].toString();
		
		if (selectionName.contentEquals("BOTTOMUP")) {
			IncludeDirection direction = IncludeDirection.BOTTOM_UP;
			return direction;
		} else if (selectionName.contentEquals("TOPDOWN")) {
		    IncludeDirection direction = IncludeDirection.TOP_DOWN;
			return direction;
		}		
		return null;
	}
	
	private static Shell getShell() {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		  if (window == null) {
		    IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
		    if (windows.length > 0) {
		       return windows[0].getShell();
		    }
		  } else {
		    return window.getShell();
		  }
		  return null;
	}

}
