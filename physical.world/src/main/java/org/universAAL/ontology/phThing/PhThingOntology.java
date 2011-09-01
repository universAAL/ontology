/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut fuer Graphische Datenverarbeitung 
	
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

import org.universAAL.middleware.owl.BoundingValueRestriction;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.supply.LevelRating;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.PhThingFactory;
import org.universAAL.ontology.location.Location;
import org.universAAL.ontology.shape.Shape;

/**
 * 
 * @author Carsten Stockloew
 *
 */
public class PhThingOntology extends Ontology {

    public static final String NAMESPACE = Resource.uAAL_VOCABULARY_NAMESPACE;

    private static PhThingFactory factory = new PhThingFactory();

    public PhThingOntology() {
	super(NAMESPACE);
	Resource r = getInfo();
	r.setResourceComment("Ontology for physical things. "
		+ "It is part of the Physical World upper ontology concept, "
		+ "which defines the most general concepts from the physical "
		+ "world as opposed to the virtual realm.");
	r.setResourceLabel("Physical Things");
    }

    public void create() {
	OntClassInfoSetup oci;

	// load Actuator
	oci = createNewOntClassInfo(Actuator.MY_URI, factory, 2);
	oci.setResourceComment("A Generic Actuator Device");
	oci.setResourceLabel("Actuator");
	oci.addSuperClass(Device.MY_URI);

	// load PhysicalContainer
	oci = createNewOntClassInfo(PhysicalContainer.MY_URI, factory, 4);
	oci
		.setResourceComment("A Physical thing that contains other Physical things");
	oci.setResourceLabel("Physical Container");
	oci.addSuperClass(PhysicalThing.MY_URI);

	// load PhysicalThing
	oci = createNewOntClassInfo(PhysicalThing.MY_URI, factory, 0);
	oci
		.setResourceComment("The root class for all physical things in the uAAL ontology. Physical things have a location");
	oci.setResourceLabel("Physical Thing");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addObjectProperty(PhysicalThing.PROP_CARRIED_BY, true, false,
		false, false);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PhysicalThing.PROP_CARRIED_BY, PhysicalThing.MY_URI, 0,
			1));
	oci.addObjectProperty(PhysicalThing.PROP_PART_OF, true, false, false,
		false);
	oci
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				PhysicalThing.PROP_PART_OF,
				PhysicalThing.MY_URI, 0, 1));
	oci.addObjectProperty(PhysicalThing.PROP_IS_IN, true, false, false,
		false);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PhysicalThing.PROP_IS_IN, PhysicalContainer.MY_URI, 0,
			1));
	oci.addObjectProperty(PhysicalThing.PROP_PHYSICAL_LOCATION, true,
		false, false, false);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PhysicalThing.PROP_PHYSICAL_LOCATION, Location.MY_URI,
			0, 1));
	oci.addObjectProperty(PhysicalThing.PROP_HAS_SHAPE, true, false, false,
		false);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PhysicalThing.PROP_HAS_SHAPE, Shape.MY_URI, 0, 1));
	oci.addDatatypeProperty(PhysicalThing.PROP_IS_PORTABLE, true);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PhysicalThing.PROP_IS_PORTABLE, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(PhysicalThing.PROP_IS_STATIONARY, true);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PhysicalThing.PROP_IS_STATIONARY, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));

	// load Device
	oci = createNewOntClassInfo(Device.MY_URI, factory, 1);
	oci
		.setResourceComment("The root class for all devices in the uAAL ontology.");
	oci.setResourceLabel("Device");
	oci.addSuperClass(PhysicalThing.MY_URI);
	oci.addObjectProperty(Device.PROP_BATTERY_LEVEL, true, false, false,
		false);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Device.PROP_BATTERY_LEVEL, LevelRating.MY_URI, 0, 1));

	// load DeviceService
	oci = createNewOntClassInfo(DeviceService.MY_URI, factory, 3);
	oci.setResourceComment("The class of services controling devices.");
	oci.setResourceLabel("DeviceService");
	oci.addSuperClass(Service.MY_URI);
	oci.addObjectProperty(DeviceService.PROP_CONTROLS, false, false, false,
		false);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		DeviceService.PROP_CONTROLS, Device.MY_URI));

	// load DimmerActuator
	oci = createNewOntClassInfo(DimmerActuator.MY_URI, factory, 5);
	oci.setResourceComment("A Dimmer kind of Actuator");
	oci.setResourceLabel("Dimmer Actuator");
	oci.addSuperClass(Actuator.MY_URI);
	oci.addDatatypeProperty(DimmerActuator.PROP_DIMMABLE_STATUS, true);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			DimmerActuator.PROP_DIMMABLE_STATUS,
			TypeMapper.getDatatypeURI(Integer.class), 1, 1)
		.addRestriction(
			new BoundingValueRestriction(
				DimmerActuator.PROP_DIMMABLE_STATUS,
				new Integer(0), true, new Integer(100), true)));

	// load OnOffActuator
	oci = createNewOntClassInfo(OnOffActuator.MY_URI, factory, 6);
	oci.setResourceComment("An On/Off kind of Actuator");
	oci.setResourceLabel("On/Off Actuator");
	oci.addSuperClass(Actuator.MY_URI);
	oci.addDatatypeProperty(OnOffActuator.PROP_STATUS, true);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			OnOffActuator.PROP_STATUS, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));

	// load Sensor
	oci = createNewOntClassInfo(Sensor.MY_URI, factory, 7);
	oci.setResourceComment("A Sensor Device");
	oci.setResourceLabel("Sensor");
	oci.addSuperClass(Device.MY_URI);
	oci.addDatatypeProperty(Sensor.PROP_MEASURED_VALUE, true);
	oci.addObjectProperty(Sensor.PROP_MEASURED_VALUE, true, false, false,
		false);
	oci.addRestriction(MergedRestriction.getCardinalityRestriction(
		Sensor.PROP_MEASURED_VALUE, 1, 1));

	// load OnOffSensor
	oci = createNewOntClassInfo(OnOffSensor.MY_URI, factory, 8);
	oci.setResourceComment("A Home Appliance On/Off Sensor Device");
	oci.setResourceLabel("On/Off Sensor");
	oci.addSuperClass(Sensor.MY_URI);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Sensor.PROP_MEASURED_VALUE, TypeMapper
			.getDatatypeURI(Boolean.class)));
    }
}
