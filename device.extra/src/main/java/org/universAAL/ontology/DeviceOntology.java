/*
	Copyright 2008-2014 ITACA-TSB, http://www.tsb.upv.es
	Instituto Tecnologico de Aplicaciones de Comunicacion 
	Avanzadas - Grupo Tecnologias para la Salud y el 
	Bienestar (TSB)
	
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
package org.universAAL.ontology;

import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.device.home.*;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.OnOffActuator;
import org.universAAL.ontology.phThing.Sensor;

public class DeviceOntology extends Ontology {

    public static final String NAMESPACE = "http://ontology.universAAL.org/DeviceExtra.owl#";

    private static DeviceFactory factory = new DeviceFactory();

    public DeviceOntology(String ontURI) {
	super(ontURI);
    }
    
    public DeviceOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r.setResourceComment("Ontology for extra devices");
	r.setResourceLabel("Device extra");

	OntClassInfoSetup oci;

	oci = extendExistingOntClassInfo(Device.MY_URI);
	oci = extendExistingOntClassInfo(Sensor.MY_URI);
	oci = extendExistingOntClassInfo(OnOffActuator.MY_URI);

	// CarpetSensor
	oci = createNewOntClassInfo(CarpetSensor.MY_URI, factory, 0);
	oci.setResourceComment("A Carpet Presence Detector Device");
	oci.setResourceLabel("Carpet Presence Detector");
	oci.addSuperClass(Sensor.MY_URI);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Sensor.PROP_MEASURED_VALUE,
			TypeMapper.getDatatypeURI(Boolean.class), 0, 1));

	// ContactSensor
	oci = createNewOntClassInfo(ContactSensor.MY_URI, factory, 1);
	oci.setResourceComment("A Magnetic Contact Sensor Device");
	oci.setResourceLabel("Contact Sensor");
	oci.addSuperClass(Sensor.MY_URI);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Sensor.PROP_MEASURED_VALUE,
			TypeMapper.getDatatypeURI(Boolean.class), 0, 1));

	// Oven
	oci = createNewOntClassInfo(Oven.MY_URI, factory, 2);
	oci.setResourceComment("The class of all Ovens.");
	oci.setResourceLabel("Oven");
	oci.addSuperClass(Device.MY_URI);
	oci.addObjectProperty(Oven.PROP_IS_ON).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Oven.PROP_IS_ON,
			TypeMapper.getDatatypeURI(Boolean.class), 0, 1));

	// PresenceDetector
	oci = createNewOntClassInfo(PresenceDetector.MY_URI, factory, 3);
	oci.setResourceComment("A Presence Detector Device");
	oci.setResourceLabel("Presence Detector");
	oci.addSuperClass(Sensor.MY_URI);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Sensor.PROP_MEASURED_VALUE,
			TypeMapper.getDatatypeURI(Boolean.class), 0, 1));

	// SirenActuator
	oci = createNewOntClassInfo(SirenActuator.MY_URI, factory, 4);
	oci.setResourceComment("An Acoustic Siren Actuator");
	oci.setResourceLabel("Siren Actuator");
	oci.addSuperClass(OnOffActuator.MY_URI);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			OnOffActuator.PROP_STATUS,
			TypeMapper.getDatatypeURI(Boolean.class), 0, 1));

	// Strap
	oci = createNewOntClassInfo(Strap.MY_URI, factory, 5);
	oci.setResourceComment("A Strap Device");
	oci.setResourceLabel("Strap");
	oci.addSuperClass(Device.MY_URI);

    }

}
