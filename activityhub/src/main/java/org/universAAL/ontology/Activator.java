package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.middleware.owl.OntologyManagement;

/**
 * OSGi bundle activator.
 * Registers the ActivityHub Ontology in the universAAL ontology manager.
 *
 * @author Thomas Fuxreiter
 */
public class Activator implements BundleActivator {

	ActivityHubOntology activityHubOntology = new ActivityHubOntology();
	
	public void start(BundleContext bc) throws Exception {
		OntologyManagement.getInstance().register(activityHubOntology);		
	}

	public void stop(BundleContext arg0) throws Exception {
		OntologyManagement.getInstance().unregister(activityHubOntology);
	}

}
