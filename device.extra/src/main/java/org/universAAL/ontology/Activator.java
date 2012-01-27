package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.middleware.owl.OntologyManagement;

public class Activator implements BundleActivator {

    static BundleContext context = null;
    DeviceOntology deviceOntology = new DeviceOntology();

    public void start(BundleContext context) throws Exception {
	Activator.context = context;
	OntologyManagement om = OntologyManagement.getInstance();
	om.register(deviceOntology);
    }

    public void stop(BundleContext arg0) throws Exception {
	OntologyManagement om = OntologyManagement.getInstance();
	om.unregister(deviceOntology);
    }
}
