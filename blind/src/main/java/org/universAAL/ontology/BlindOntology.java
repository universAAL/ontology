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
package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.owl.BoundingValueRestriction;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.blind.Blind;
import org.universAAL.ontology.blind.BlindController;
import org.universAAL.ontology.location.Location;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.phThing.Device;

/**
 * The Ontology.
 * 
 * @author Carsten Stockloew
 */

public final class BlindOntology extends Ontology {

    private static BlindFactory factory = new BlindFactory();

    public static final String NAMESPACE = "http://ontology.persona.ima.igd.fhg.de/Blind.owl#";

    public BlindOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r.setResourceComment("");
	r.setResourceLabel("Blind");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ServiceBusOntology.NAMESPACE);
	addImport(LocationOntology.NAMESPACE);

	OntClassInfoSetup oci;

	// load Blind
	oci = createNewOntClassInfo(Blind.MY_URI, factory, 0);
	oci.setResourceComment("The class of all blinds.");
	oci.setResourceLabel("Blind");
	oci.addSuperClass(Device.MY_URI);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Blind.PROP_PHYSICAL_LOCATION, Location.MY_URI, 1, 1));
	oci.addDatatypeProperty(Blind.PROP_BLIND_STATUS).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Blind.PROP_BLIND_STATUS,
			TypeMapper.getDatatypeURI(Integer.class), 1, 1)
		.addRestriction(
			new BoundingValueRestriction(Blind.PROP_BLIND_STATUS,
				new Integer(0), true, new Integer(100), true)));

	// load BlindController
	oci = createNewOntClassInfo(BlindController.MY_URI, factory, 1);
	oci.setResourceComment("The class of services controling blinds.");
	oci.setResourceLabel("BlindsServices");
	oci.addSuperClass(Service.MY_URI);
	oci.addObjectProperty(BlindController.PROP_CONTROLS);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		BlindController.PROP_CONTROLS, Blind.MY_URI));
    }
}
