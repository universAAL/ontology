package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.ontology.risk.FallDetector;
import org.universAAL.ontology.risk.PanicButton;

public class Activator implements BundleActivator{
	public static BundleContext context=null;

	public void start(BundleContext context) throws Exception {
		Activator.context=context;
		Class.forName(FallDetector.class.getName());
		Class.forName(PanicButton.class.getName());
	}

	public void stop(BundleContext arg0) throws Exception {
	}

}
