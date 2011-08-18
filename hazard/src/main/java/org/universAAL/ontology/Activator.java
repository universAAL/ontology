package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.ontology.hazard.FireDetector;
import org.universAAL.ontology.hazard.GasDetector;

public class Activator implements BundleActivator{
	public static BundleContext context=null;

	public void start(BundleContext context) throws Exception {
		Activator.context=context;
		Class.forName(FireDetector.class.getName());
		Class.forName(GasDetector.class.getName());
	}

	public void stop(BundleContext arg0) throws Exception {
	}

}
