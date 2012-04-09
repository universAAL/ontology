/*	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
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
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.phThing.OnOffActuator;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.ontology.phThing.Sensor;
import org.universAAL.ontology.water.WaterFloodDetector;
import org.universAAL.ontology.water.FaucetSensor;
import org.universAAL.ontology.water.WaterActuator;

/**
 * The Ontology.
 * 
 * @author Carsten Stockloew
 */

public final class WaterOntology extends Ontology {

    private static WaterFactory factory = new WaterFactory();

    public static final String NAMESPACE = Resource.uAAL_NAMESPACE_PREFIX
	    + "Water.owl#";

    public WaterOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r
		.setResourceComment("The ontology defining devices that control water management and situations.");
	r.setResourceLabel("Water");
	addImport(DataRepOntology.NAMESPACE);
	addImport(PhThingOntology.NAMESPACE);

	OntClassInfoSetup oci;

	// load WaterFloodDetector
	oci = createNewOntClassInfo(WaterFloodDetector.MY_URI, factory, 0);
	oci.setResourceComment("A Water Flood Detector Device");
	oci.setResourceLabel("Water Flood Detector");
	oci.addSuperClass(Sensor.MY_URI);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Sensor.PROP_MEASURED_VALUE, TypeMapper
			.getDatatypeURI(Boolean.class)));

	// load FaucetSensor
	oci = createNewOntClassInfo(FaucetSensor.MY_URI, factory, 1);
	oci.setResourceComment("A Faucet State Sensor Device");
	oci.setResourceLabel("Faucet State Sensor");
	oci.addSuperClass(Sensor.MY_URI);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Sensor.PROP_MEASURED_VALUE, TypeMapper
			.getDatatypeURI(Boolean.class)));

	// load WaterActuator
	oci = createNewOntClassInfo(WaterActuator.MY_URI, factory, 2);
	oci.setResourceComment("A Water Flow Actuator");
	oci.setResourceLabel("Water Actuator");
	oci.addSuperClass(OnOffActuator.MY_URI);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		OnOffActuator.PROP_STATUS, TypeMapper
			.getDatatypeURI(Boolean.class)));

    }
}
