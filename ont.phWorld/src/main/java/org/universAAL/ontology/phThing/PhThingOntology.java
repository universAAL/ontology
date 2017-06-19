/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
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
package org.universAAL.ontology.phThing;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.owl.supply.LevelRating;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.PhThingFactory;
import org.universAAL.ontology.location.Location;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.shape.Shape;
import org.universAAL.ontology.shape.ShapeOntology;

/**
 * 
 * @author Carsten Stockloew
 * 
 */
public class PhThingOntology extends Ontology {

	public static final String NAMESPACE = "http://ontology.universAAL.org/PhThing.owl#";;

	private static PhThingFactory factory = new PhThingFactory();

	public PhThingOntology() {
		super(NAMESPACE);
	}

	public void create() {
		Resource r = getInfo();
		r.setResourceComment(
				"Ontology for physical things. " + "It is part of the Physical World upper ontology concept, "
						+ "which defines the most general concepts from the physical "
						+ "world as opposed to the virtual realm.");
		r.setResourceLabel("Physical Things");
		addImport(LocationOntology.NAMESPACE);
		addImport(ShapeOntology.NAMESPACE);

		OntClassInfoSetup oci;

		// load PhysicalContainer
		oci = createNewOntClassInfo(PhysicalContainer.MY_URI, factory, 4);
		oci.setResourceComment("A Physical thing that contains other Physical things");
		oci.setResourceLabel("Physical Container");
		oci.addSuperClass(PhysicalThing.MY_URI);

		// load PhysicalThing
		oci = createNewOntClassInfo(PhysicalThing.MY_URI, factory, 0);
		oci.setResourceComment(
				"The root class for all physical things in the uAAL ontology. Physical things have a location");
		oci.setResourceLabel("Physical Thing");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addObjectProperty(PhysicalThing.PROP_CARRIED_BY).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(PhysicalThing.PROP_CARRIED_BY,
				PhysicalThing.MY_URI, 0, 1));
		oci.addObjectProperty(PhysicalThing.PROP_PART_OF).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(PhysicalThing.PROP_PART_OF,
				PhysicalThing.MY_URI, 0, 1));
		oci.addObjectProperty(PhysicalThing.PROP_IS_IN).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(PhysicalThing.PROP_IS_IN,
				PhysicalContainer.MY_URI, 0, 1));
		oci.addObjectProperty(PhysicalThing.PROP_PHYSICAL_LOCATION).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(PhysicalThing.PROP_PHYSICAL_LOCATION, Location.MY_URI, 0, 1));
		oci.addObjectProperty(PhysicalThing.PROP_HAS_SHAPE).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(PhysicalThing.PROP_HAS_SHAPE,
				Shape.MY_URI, 0, 1));
		oci.addDatatypeProperty(PhysicalThing.PROP_IS_PORTABLE).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(PhysicalThing.PROP_IS_PORTABLE,
				TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
		oci.addDatatypeProperty(PhysicalThing.PROP_IS_STATIONARY).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(PhysicalThing.PROP_IS_STATIONARY,
				TypeMapper.getDatatypeURI(Boolean.class), 1, 1));

		// load Device
		oci = createNewOntClassInfo(Device.MY_URI, factory, 1);
		oci.setResourceComment("The root class for all devices in the uAAL ontology.");
		oci.setResourceLabel("Device");
		oci.addSuperClass(PhysicalThing.MY_URI);
		oci.addObjectProperty(Device.PROP_BATTERY_LEVEL).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Device.PROP_BATTERY_LEVEL,
				LevelRating.MY_URI, 0, 1));

		// load DeviceService
		oci = createNewOntClassInfo(DeviceService.MY_URI, factory, 3);
		oci.setResourceComment("The class of services controling devices.");
		oci.setResourceLabel("DeviceService");
		oci.addSuperClass(Service.MY_URI);
		oci.addObjectProperty(DeviceService.PROP_CONTROLS);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(DeviceService.PROP_CONTROLS, Device.MY_URI));

	}
}
