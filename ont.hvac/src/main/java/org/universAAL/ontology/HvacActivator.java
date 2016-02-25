/*
	Copyright 2015 UPM, http://www.upm.es/
Universidad Politécnica de Madrid
 */
package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.hvac.HvacOntology;

public class HvacActivator implements ModuleActivator {

    private HvacOntology HvacOntology = new HvacOntology();

    public void start(ModuleContext mc) throws Exception {
	OntologyManagement.getInstance().register(mc, HvacOntology);
    }

    public void stop(ModuleContext mc) throws Exception {
	OntologyManagement.getInstance().unregister(mc, HvacOntology);
    }
}
