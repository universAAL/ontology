package org.universAAL.ontology.activityhub;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.ActivityHubOntology;

/**
 * OSGi bundle activator.
 * Registers the ActivityHub Ontology in the universAAL ontology manager.
 *
 * @author Thomas Fuxreiter
 */
public class Activator implements ModuleActivator {

	ActivityHubOntology activityHubOntology = new ActivityHubOntology();
	
	public void start(ModuleContext arg0) throws Exception {
		OntologyManagement.getInstance().register(activityHubOntology);		
	}

	public void stop(ModuleContext arg0) throws Exception {
		OntologyManagement.getInstance().unregister(activityHubOntology);
	}

}
