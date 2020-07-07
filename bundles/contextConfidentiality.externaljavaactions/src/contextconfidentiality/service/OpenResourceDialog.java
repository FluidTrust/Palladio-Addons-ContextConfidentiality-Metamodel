package contextconfidentiality.service;

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
 * Select Resource from which to add policy 
 */
public class OpenResourceDialog {
	public static ResourceObject loadResource(EObject self, Logger logger) {
		Shell shell = Display.getCurrent().getActiveShell();		
		shell = getShell();
		shell.open();
		
		ResourceDialog dialog = new ResourceDialog(shell, "Open a Resource", SWT.OPEN);
		
		if (dialog.open() == Dialog.OK) {
			String uri = dialog.getURIText();
			logger.info("Selected Resource: " + uri);
	        ResourceSet resSet = self.eResource().getResourceSet();
	        Resource resource = resSet.getResource(URI.createURI(uri), true);
			EObject root = resource.getContents().get(0);
			
			logger.info("Loaded root " + root.toString() + " from Resource");
			ResourceObject resourceObject =  new ResourceObject(root, resource);
			return resourceObject;
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
	
	public static class ResourceObject {
		private EObject root;
		private Resource resource;
		
		public ResourceObject(EObject object, Resource resource) {
			this.setRoot(object);
			this.setResource(resource);		
		}

		public EObject getRoot() {
			return root;
		}

		public void setRoot(EObject object) {
			this.root = object;
		}

		public Resource getResource() {
			return resource;
		}

		public void setResource(Resource resource) {
			this.resource = resource;
		}
	}
}
