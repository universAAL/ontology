/*
	Copyright 2008-20144 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute for Computer Graphics Research
	
	See the NOTICE file distributed with this work for additional 
	information regarding copyright ownership
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */
package org.universAAL.ontology.space;

import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.SpaceFactory;
import org.universAAL.ontology.location.Location;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.ontology.phThing.PhysicalThing;

/**
 * 
 * @author Carsten Stockloew
 * 
 */
public class SpaceOntology extends Ontology {

    public static final String NAMESPACE = "http://ontology.universAAL.org/SpaceConfiguration.owl#";;

    private static SpaceFactory factory = new SpaceFactory();

    public SpaceOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r.setResourceComment("Ontology for AAL Space Configuration. "
		+ "It is part of the Physical World upper ontology concept, "
		+ "which defines the most general concepts from the physical "
		+ "world as opposed to the virtual realm.");
	r.setResourceLabel("AAL Space Configuration");

	addImport(LocationOntology.NAMESPACE);
	addImport(PhThingOntology.NAMESPACE);
	
	OntClassInfoSetup oci;

	// load SpaceConfigurationService
	oci = createNewOntClassInfo(SpaceConfigurationService.MY_URI, factory,
		0);
	oci.setResourceComment("The class of services controlling locations.");
	oci.setResourceLabel("SpaceConfigurationService");
	oci.addSuperClass(Service.MY_URI);
	oci.addObjectProperty(SpaceConfigurationService.PROP_MANAGED_LOCATIONS);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		SpaceConfigurationService.PROP_MANAGED_LOCATIONS,
		Location.MY_URI));
	oci
		.addObjectProperty(SpaceConfigurationService.PROP_MANAGED_PHYSICAL_THINGS);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		SpaceConfigurationService.PROP_MANAGED_PHYSICAL_THINGS,
		PhysicalThing.MY_URI));
    }
}
