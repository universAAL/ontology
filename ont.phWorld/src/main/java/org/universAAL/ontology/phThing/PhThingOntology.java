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

		OntClassInfoSetup oci_phth, oci_dstat, oci_dev, oci_dserv, oci_phc;

		// load PhysicalThing
		oci_phth = createNewOntClassInfo(PhysicalThing.MY_URI, factory, 0);
		oci_dstat = createNewOntClassInfo(DeviceState.MY_URI, factory, 1);
		oci_dev = createNewOntClassInfo(Device.MY_URI, factory, 2);
		oci_dserv = createNewOntClassInfo(DeviceService.MY_URI, factory, 3);
		oci_phc = createNewOntClassInfo(PhysicalContainer.MY_URI, factory, 4);
		
		oci_phth.setResourceComment(
				"The root class for all physical things in the universAAL ontology. Physical things have a location");
		oci_phth.setResourceLabel("Physical Thing");
		oci_phth.addSuperClass(ManagedIndividual.MY_URI);
		oci_phth.addObjectProperty(PhysicalThing.PROP_CARRIED_BY).setFunctional();
		oci_phth.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(PhysicalThing.PROP_CARRIED_BY,
				PhysicalThing.MY_URI, 0, 1));
		oci_phth.addObjectProperty(PhysicalThing.PROP_PART_OF).setFunctional();
		oci_phth.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(PhysicalThing.PROP_PART_OF,
				PhysicalThing.MY_URI, 0, 1));
		oci_phth.addObjectProperty(PhysicalThing.PROP_IS_IN).setFunctional();
		oci_phth.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(PhysicalThing.PROP_IS_IN,
				PhysicalContainer.MY_URI, 0, 1));
		oci_phth.addObjectProperty(PhysicalThing.PROP_PHYSICAL_LOCATION).setFunctional();
		oci_phth.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(PhysicalThing.PROP_PHYSICAL_LOCATION, Location.MY_URI, 0, 1));
		oci_phth.addObjectProperty(PhysicalThing.PROP_HAS_SHAPE).setFunctional();
		oci_phth.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(PhysicalThing.PROP_HAS_SHAPE,
				Shape.MY_URI, 0, 1));
		oci_phth.addDatatypeProperty(PhysicalThing.PROP_IS_PORTABLE).setFunctional();
		oci_phth.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(PhysicalThing.PROP_IS_PORTABLE,
				TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
		oci_phth.addDatatypeProperty(PhysicalThing.PROP_IS_STATIONARY).setFunctional();
		oci_phth.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(PhysicalThing.PROP_IS_STATIONARY,
				TypeMapper.getDatatypeURI(Boolean.class), 1, 1));

		// load DeviceState
		oci_dstat.setResourceComment("The class to represent possible error and status messages of a device.");
		oci_dstat.setResourceLabel("Device State");
		oci_dstat.addSuperClass(ManagedIndividual.MY_URI);
		oci_dstat.addDatatypeProperty(DeviceState.PROP_CODE).setFunctional();
		oci_dstat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(DeviceState.PROP_CODE,
				TypeMapper.getDatatypeURI(String.class), 0, 1));
		// the other two props rdfs:label and rdfs:comment are generally applicable properties
		// and do not need an explicit definition

		// load Device
		oci_dev.setResourceComment("The root class for all devices in the universAAL ontology.");
		oci_dev.setResourceLabel("Device");
		oci_dev.addSuperClass(PhysicalThing.MY_URI);
		oci_dev.addObjectProperty(Device.PROP_BATTERY_LEVEL).setFunctional();
		oci_dev.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Device.PROP_BATTERY_LEVEL,
				LevelRating.MY_URI, 0, 1));
		oci_dev.addObjectProperty(Device.PROP_CONNECTION_LEVEL).setFunctional();
		oci_dev.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Device.PROP_CONNECTION_LEVEL,
				LevelRating.MY_URI, 0, 1));
		oci_dev.addObjectProperty(Device.PROP_ERROR_MESSAGE).setFunctional();
		oci_dev.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Device.PROP_ERROR_MESSAGE,
				DeviceState.MY_URI, 0, 1));
		oci_dev.addObjectProperty(Device.PROP_STATUS_MESSAGE).setFunctional();
		oci_dev.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Device.PROP_STATUS_MESSAGE,
				DeviceState.MY_URI, 0, 1));

		// load DeviceService
		oci_dserv.setResourceComment("The class of services controling devices.");
		oci_dserv.setResourceLabel("DeviceService");
		oci_dserv.addSuperClass(Service.MY_URI);
		oci_dserv.addObjectProperty(DeviceService.PROP_CONTROLS);
		oci_dserv.addRestriction(MergedRestriction.getAllValuesRestriction(DeviceService.PROP_CONTROLS, Device.MY_URI));

		// load PhysicalContainer
		oci_phc.setResourceComment("A Physical thing that contains other Physical things");
		oci_phc.setResourceLabel("Physical Container");
		oci_phc.addSuperClass(PhysicalThing.MY_URI);

	}
}
