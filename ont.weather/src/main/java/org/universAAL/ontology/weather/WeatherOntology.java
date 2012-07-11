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
package org.universAAL.ontology.weather;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.WeatherFactory;
import org.universAAL.ontology.phThing.OnOffActuator;
import org.universAAL.ontology.phThing.Sensor;

/**
 * The Ontology.
 * 
 * @author Carsten Stockloew
 */

public final class WeatherOntology extends Ontology {

    private static WeatherFactory factory = new WeatherFactory();

    public static final String NAMESPACE = Resource.uAAL_NAMESPACE_PREFIX
	    + "Weather.owl#";

    public WeatherOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r
		.setResourceComment("he ontology defining the most general concepts dealing with weather.");
	r.setResourceLabel("Weather");
	addImport(DataRepOntology.NAMESPACE);

	OntClassInfoSetup oci;

	// load Temperature
	oci = createNewOntClassInfo(Temperature.MY_URI, factory, 0);
	oci.setResourceComment("The class of all temperatures.");
	oci.setResourceLabel("Temperature");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addDatatypeProperty(Temperature.PROP_VALUE).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Temperature.PROP_VALUE,
			TypeMapper.getDatatypeURI(Integer.class), 1, 1));

	// load HeaterActuator
	oci = createNewOntClassInfo(HeaterActuator.MY_URI, factory, 1);
	oci.setResourceComment("A Controllable Heater On/Off Actuator");
	oci.setResourceLabel("Heater Actuator");
	oci.addSuperClass(OnOffActuator.MY_URI);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		OnOffActuator.PROP_STATUS, TypeMapper
			.getDatatypeURI(Boolean.class)));

	// load TempSensor
	oci = createNewOntClassInfo(TempSensor.MY_URI, factory, 2);
	oci.setResourceComment("A Temperature Sensor Device");
	oci.setResourceLabel("Temperature Sensor");
	oci.addSuperClass(Sensor.MY_URI);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Sensor.PROP_MEASURED_VALUE, TypeMapper
			.getDatatypeURI(Float.class)));

	// load RelHumiditySensor
	oci = createNewOntClassInfo(RelHumiditySensor.MY_URI, factory, 3);
	oci.setResourceComment("A Relative Humidity Sensor Device");
	oci.setResourceLabel("Relative Humidity Sensor");
	oci.addSuperClass(Sensor.MY_URI);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Sensor.PROP_MEASURED_VALUE, TypeMapper
			.getDatatypeURI(Integer.class)));
    }
}
