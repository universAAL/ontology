/*	
	Copyright 2007-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
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
package org.universAAL.ontology.lighting;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.IntRestriction;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.LightingFactory;
import org.universAAL.ontology.location.Location;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.PhThingOntology;

/**
 * 
 * @author Carsten Stockloew
 * 
 */
public final class LightingOntology extends Ontology {

    private static LightingFactory factory = new LightingFactory();;

    public static final String NAMESPACE = "http://ontology.universaal.org/Lighting.owl#";

    public LightingOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r
		.setResourceComment("The ontology defining the most general concepts dealing with light sources and their control.");
	r.setResourceLabel("Lighting");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ServiceBusOntology.NAMESPACE);
	addImport(LocationOntology.NAMESPACE);
	addImport(PhThingOntology.NAMESPACE);

	OntClassInfoSetup oci;

	// load LightType
	oci = createNewAbstractOntClassInfo(LightType.MY_URI);
	oci.setResourceComment("The type of a light source");
	oci.setResourceLabel("Light Type");

	// load NaturalLight
	oci = createNewAbstractOntClassInfo(NaturalLight.MY_URI);
	oci.setResourceComment("The type of natural light sources");
	oci.setResourceLabel("Natural Light");
	oci.addSuperClass(LightType.MY_URI);
	// NaturalLight.init();
	oci.toEnumeration(new ManagedIndividual[] { NaturalLight.moonShine,
		NaturalLight.sunShine });

	// load FlamingLight
	oci = createNewAbstractOntClassInfo(FlamingLight.MY_URI);
	oci.setResourceComment("The type of faming light sources");
	oci.setResourceLabel("Flaming Light");
	oci.addSuperClass(LightType.MY_URI);
	oci.toEnumeration(new ManagedIndividual[] { FlamingLight.candleLight,
		FlamingLight.gasLamp, FlamingLight.oilLamp });

	// load ElectricLight
	oci = createNewAbstractOntClassInfo(ElectricLight.MY_URI);
	oci.setResourceComment("The type of electric light sources");
	oci.setResourceLabel("Electric Light");
	oci.addSuperClass(LightType.MY_URI);
	oci.toEnumeration(new ManagedIndividual[] {
		ElectricLight.carbonArcLamp, ElectricLight.dischargeLamp,
		ElectricLight.fluorescentLamp, ElectricLight.halogenLamp,
		ElectricLight.ledLamp, ElectricLight.lightBulb });

	// load LightSource
	oci = createNewOntClassInfo(LightSource.MY_URI, factory, 0);
	oci.setResourceComment("The class of all light sources");
	oci.setResourceLabel("Light Source");
	oci.addSuperClass(Device.MY_URI);
	oci.addObjectProperty(LightSource.PROP_AMBIENT_COVERAGE)
		.setFunctional();
	oci.addObjectProperty(LightSource.PROP_HAS_TYPE).setFunctional();
	oci.addDatatypeProperty(LightSource.PROP_SOURCE_BRIGHTNESS)
		.setFunctional();
	oci.addObjectProperty(LightSource.PROP_SOURCE_COLOR).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			LightSource.PROP_AMBIENT_COVERAGE, Location.MY_URI, 0,
			1));
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			LightSource.PROP_HAS_TYPE, LightType.MY_URI, 1, 1));
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			LightSource.PROP_SOURCE_BRIGHTNESS, new IntRestriction(
				new Integer(0), true, new Integer(100), true),
			1, 1));
	oci.addRestriction(MergedRestriction.getCardinalityRestriction(
		LightSource.PROP_SOURCE_COLOR, 0, 1));

	// load BeamingSource
	oci = createNewOntClassInfo(BeamingSource.MY_URI, factory, 1);
	oci.setResourceComment("The class of beaming light sources");
	oci.setResourceLabel("Beaming Source");
	oci.addSuperClass(LightSource.MY_URI);
	oci.addObjectProperty(BeamingSource.PROP_BEAMING_DIRECTION)
		.setFunctional();
	oci.addObjectProperty(BeamingSource.PROP_TARGET_SURFACE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			BeamingSource.PROP_BEAMING_DIRECTION, Location.MY_URI,
			0, 1));
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			BeamingSource.PROP_TARGET_SURFACE, Location.MY_URI, 0,
			1));

	// load BlinkableLightSource
	oci = createNewOntClassInfo(BlinkableLightSource.MY_URI, factory, 2);
	oci.setResourceComment("The class of blinkable light sources");
	oci.setResourceLabel("Blinkable Light Source");
	oci.addSuperClass(LightSource.MY_URI);
	oci.addDatatypeProperty(BlinkableLightSource.PROP_BLINKING_STATE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			BlinkableLightSource.PROP_BLINKING_STATE, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));

	// load BlinkableBeamingSource
	oci = createNewOntClassInfo(BlinkableBeamingSource.MY_URI, factory, 3);
	oci.setResourceComment("The class of blinkable beaming sources");
	oci.setResourceLabel("Blinkable Beaming Source");
	oci.addSuperClass(BeamingSource.MY_URI);
	oci.addSuperClass(BlinkableLightSource.MY_URI);

	// load Lighting
	oci = createNewOntClassInfo(Lighting.MY_URI, factory, 4);
	oci
		.setResourceComment("The class of services controling light sources");
	oci.setResourceLabel("Lighting");
	oci.addSuperClass(Service.MY_URI);
	oci.addObjectProperty(Lighting.PROP_CONTROLS);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Lighting.PROP_CONTROLS, LightSource.MY_URI));

	// load Beaming
	oci = createNewOntClassInfo(Beaming.MY_URI, factory, 5);
	oci
		.setResourceComment("The class of services controling beaming sources");
	oci.setResourceLabel("Beaming");
	oci.addSuperClass(Lighting.MY_URI);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Lighting.PROP_CONTROLS, BeamingSource.MY_URI));

	// load BlinkableLighting
	oci = createNewOntClassInfo(BlinkableLighting.MY_URI, factory, 6);
	oci
		.setResourceComment("The class of services controling blinkable light sources");
	oci.setResourceLabel("Blinkable Lighting"); // see
	oci.addSuperClass(Lighting.MY_URI);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Lighting.PROP_CONTROLS, BlinkableLightSource.MY_URI));

	// load BlinkableBeaming
	oci = createNewOntClassInfo(BlinkableBeaming.MY_URI, factory, 7);
	oci
		.setResourceComment("The class of services controling blinkable beaming sources");
	oci.setResourceLabel("Blinkable Beaming");
	oci.addSuperClass(Beaming.MY_URI);
	oci.addSuperClass(BlinkableLighting.MY_URI);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Lighting.PROP_CONTROLS, BlinkableBeamingSource.MY_URI));
    }
}
