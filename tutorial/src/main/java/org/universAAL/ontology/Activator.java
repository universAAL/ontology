package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.owl.OntologyManagement;

//You need an Activator in your ontology bundle because it must be started...
public class Activator implements BundleActivator {

    static BundleContext context = null;
    private Ontology tutorialOntology=new TutorialOntology();

    public void start(BundleContext context) throws Exception {
	Activator.context = context;
	OntologyManagement om = OntologyManagement.getInstance();
	// For every general Ontology class included in your ontology bundle you must register it here
	om.register(tutorialOntology);
    }

    public void stop(BundleContext arg0) throws Exception {
	// Unload the ontologies
	OntologyManagement om = OntologyManagement.getInstance();
	om.register(tutorialOntology);
    }
}
