package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.middleware.owl.OntologyManagement;

public class Activator implements BundleActivator{
	static BundleContext context = null;
	AalfficiencyOntology aalfficiency = new AalfficiencyOntology();
	
	public void start(BundleContext arg0) throws Exception {
		Activator.context = arg0;
		OntologyManagement.getInstance().register(aalfficiency);
	}

	public void stop(BundleContext arg0) throws Exception {
		OntologyManagement.getInstance().unregister(aalfficiency);
		
	}

}
