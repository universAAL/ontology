package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.context.che.ontology.ContextHistoryOntology;
import org.universAAL.middleware.owl.OntologyManagement;

public class Activator implements BundleActivator {
    private ContextHistoryOntology ont=new ContextHistoryOntology();

    public void start(BundleContext bcontext) throws Exception {
	OntologyManagement.getInstance().register(ont);
    }

    public void stop(BundleContext arg0) throws Exception {
	OntologyManagement.getInstance().unregister(ont);
    }

}
