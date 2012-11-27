package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.uAALModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.personalhealthdevice.PersonalHealthDeviceOntology;

/**
 * OSGi bundle activator.
 * Registers the PersonalHealthDevice Ontology in the universAAL ontology manager.
 *
 * @author Thomas Fuxreiter (foex@gmx.at)
 */
public class PersonalHealthDeviceActivator implements uAALModuleActivator{

	PersonalHealthDeviceOntology personalHealthDeviceOntology = new PersonalHealthDeviceOntology();

	public void start(ModuleContext mc) throws Exception {
		OntologyManagement.getInstance().register(personalHealthDeviceOntology);
	}

	public void stop(ModuleContext mc) throws Exception {
		OntologyManagement.getInstance().unregister(personalHealthDeviceOntology);
	}
}
