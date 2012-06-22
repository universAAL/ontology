package org.universAAL.context.che.ontology;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.uAALModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.ContextHistoryOntology;

public class Activator implements uAALModuleActivator {
    private ContextHistoryOntology ont=new ContextHistoryOntology();

    public void start(ModuleContext bcontext) throws Exception {
	OntologyManagement.getInstance().register(ont);
    }

    public void stop(ModuleContext arg0) throws Exception {
	OntologyManagement.getInstance().unregister(ont);
    }

}
