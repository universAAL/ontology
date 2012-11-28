/*	Copyright 2008-2010 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute of Computer Graphics Research

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
package org.universAAL.ontology.powersocket;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.IntRestriction;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.ontology.PowersocketFactory;
import org.universAAL.ontology.location.Location;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.ontology.phThing.PhysicalThing;

/**
 * The Ontology.
 * 
 * @author Carsten Stockloew
 */

public final class PowersocketOntology extends Ontology {

    private static PowersocketFactory factory = new PowersocketFactory();

    public static final String NAMESPACE = "http://ontology.universaal.org/Powersocket.owl#";

    public PowersocketOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r
		.setResourceComment("The upper ontology defining a first set of concepts from the power socket domain. ");
	r.setResourceLabel("Powersocket");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ServiceBusOntology.NAMESPACE);
	addImport(PhThingOntology.NAMESPACE);

	OntClassInfoSetup oci;

	// load Powersocket
	oci = createNewOntClassInfo(Powersocket.MY_URI, factory, 0);
	oci.setResourceComment("The class of all powersockets.");
	oci.setResourceLabel("Powersocket");
	oci.addSuperClass(Device.MY_URI);
	oci.addDatatypeProperty(Powersocket.PROP_SOCKET_VALUE).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Powersocket.PROP_SOCKET_VALUE, new IntRestriction(
				new Integer(0), true, new Integer(100), true),
			1, 1));
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PhysicalThing.PROP_PHYSICAL_LOCATION, Location.MY_URI,
			1, 1));

	// load PowersocketController
	oci = createNewOntClassInfo(PowersocketController.MY_URI, factory, 1);
	oci
		.setResourceComment("The class of services controling powersockets.");
	oci.setResourceLabel("PowersocketServices");
	oci.addSuperClass(Service.MY_URI);
	oci.addObjectProperty(PowersocketController.PROP_CONTROLS);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		PowersocketController.PROP_CONTROLS, Powersocket.MY_URI));

	// load SwitchableSocket
	oci = createNewOntClassInfo(SwitchableSocket.MY_URI, factory, 2);
	oci.setResourceComment("The class of all switchable powersockets.");
	oci.setResourceLabel("SwitchablePowersocket");
	oci.addSuperClass(Powersocket.MY_URI);

	// load DimmableSocket
	oci = createNewOntClassInfo(DimmableSocket.MY_URI, factory, 3);
	oci.setResourceComment("The class of all dimmable powersockets.");
	oci.setResourceLabel("DimmablePowersocket");
	oci.addSuperClass(Powersocket.MY_URI);
    }
}
