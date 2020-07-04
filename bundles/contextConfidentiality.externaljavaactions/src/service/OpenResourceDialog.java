package service;

import java.util.logging.Logger;

import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;


/* 
 * Select Policy from chosen Resource 
 */
public class OpenResourceDialog {
	public static EObject loadResourceFromXMI(EObject self, Logger logger) {
		Shell shell = Display.getCurrent().getActiveShell();		
		shell = getShell();
		shell.open();
		
		ResourceDialog dialog = new ResourceDialog(shell, "Open a Resource", SWT.OPEN);
		
		if (dialog.open() == Dialog.OK) {
			String uri = dialog.getURIText();
			logger.info("Selected Resource: " + uri);
	        ResourceSet resSet = self.eResource().getResourceSet();
	        Resource resource = resSet.getResource(URI.createURI(uri), true);
			EObject object = resource.getContents().get(0);
			
			logger.info("Loaded root" + object.toString() + " from Resource");
			return object;
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
		  }
		  else {
		    return window.getShell();
		  }
		  return null;
	}
}
