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
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.hazard.FireDetector;
import org.universAAL.ontology.hazard.GasDetector;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.ontology.phThing.Sensor;

/**
 * The Ontology.
 * 
 * @author Carsten Stockloew
 */

public final class HazardOntology extends Ontology {

    private static HazardFactory factory = new HazardFactory();

    public static final String NAMESPACE = Resource.uAAL_NAMESPACE_PREFIX
	    + "Hazard.owl#";

    public HazardOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r
		.setResourceComment("The ontology defining concepts for all kinds of environment hazard detectors (gas, fire...). ");
	r.setResourceLabel("Hazard");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ServiceBusOntology.NAMESPACE);
	addImport(PhThingOntology.NAMESPACE);

	OntClassInfoSetup oci;

	// load FireDetector
	oci = createNewOntClassInfo(FireDetector.MY_URI, factory, 0);
	oci.setResourceComment("A Fire Detector Device");
	oci.setResourceLabel("Fire Detector");
	oci.addSuperClass(Sensor.MY_URI);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Sensor.PROP_MEASURED_VALUE, TypeMapper
			.getDatatypeURI(Boolean.class)));

	// load GasDetector
	oci = createNewOntClassInfo(GasDetector.MY_URI, factory, 1);
	oci.setResourceComment("A Gas Detector Device");
	oci.setResourceLabel("Gas Detector");
	oci.addSuperClass(Sensor.MY_URI);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Sensor.PROP_MEASURED_VALUE, TypeMapper
			.getDatatypeURI(Boolean.class)));
    }
}
