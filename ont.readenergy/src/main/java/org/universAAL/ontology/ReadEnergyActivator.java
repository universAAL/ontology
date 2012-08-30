package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.uAALModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.energy.reader.ReadEnergyOntology;

public class ReadEnergyActivator implements uAALModuleActivator{
	static ModuleContext context = null;
	ReadEnergyOntology energyreader = new ReadEnergyOntology();
	
	public void start(ModuleContext arg0) throws Exception {
		context = arg0;
		OntologyManagement.getInstance().register(energyreader);
	}

	public void stop(ModuleContext arg0) throws Exception {
		OntologyManagement.getInstance().unregister(energyreader);
	}
}
