package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.che.ContextHistoryOntology;

public class ContextHistoryActivator implements ModuleActivator {
    private ContextHistoryOntology ont=new ContextHistoryOntology();

    public void start(ModuleContext bcontext) throws Exception {
	OntologyManagement.getInstance().register(ont);
    }

    public void stop(ModuleContext arg0) throws Exception {
	OntologyManagement.getInstance().unregister(ont);
    }

}
