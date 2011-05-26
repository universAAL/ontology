package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.ontology.multimedia.Stereoset;
import org.universAAL.ontology.multimedia.TV;

public class Activator implements BundleActivator{
	public static BundleContext context=null;

	public void start(BundleContext context) throws Exception {
		Activator.context=context;
		Class.forName(TV.class.getName());
		Class.forName(Stereoset.class.getName());
	}

	public void stop(BundleContext arg0) throws Exception {
	}

}
