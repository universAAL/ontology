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
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.owl.BoundingValueRestriction;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.DeviceService;
import org.universAAL.ontology.phThing.DimmerActuator;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.ontology.phThing.Sensor;
import org.universAAL.ontology.window.BlindController;
import org.universAAL.ontology.window.GlassBreakSensor;
import org.universAAL.ontology.window.WindowActuator;
import org.universAAL.ontology.window.WindowController;
import org.universAAL.ontology.window.CurtainController;
import org.universAAL.ontology.window.BlindActuator;
import org.universAAL.ontology.window.CurtainActuator;
import org.universAAL.ontology.window.WindowType;

/**
 * The Ontology.
 * 
 * @author Carsten Stockloew
 */

public final class WindowOntology extends Ontology {

    private static WindowFactory factory = new WindowFactory();

    public static final String NAMESPACE = Resource.uAAL_NAMESPACE_PREFIX
	    + "Window.owl#";

    public WindowOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r
		.setResourceComment("Devices related to windows and their accesories.");
	r.setResourceLabel("Window");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ServiceBusOntology.NAMESPACE);
	addImport(PhThingOntology.NAMESPACE);

	OntClassInfoSetup oci;

	// load WindowType
	oci = createNewAbstractOntClassInfo(WindowType.MY_URI);
	oci.setResourceComment("The type of a window");
	oci.setResourceLabel("Window Type");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	
	// load WindowActuator
	oci = createNewOntClassInfo(WindowActuator.MY_URI, factory, 1);
	oci.setResourceComment("The class of all windows.");
	oci.setResourceLabel("Window");
	oci.addSuperClass(Device.MY_URI);
	oci.addObjectProperty(WindowActuator.PROP_HAS_TYPE).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			WindowActuator.PROP_HAS_TYPE, WindowType.MY_URI, 1, 1));
	oci.addDatatypeProperty(WindowActuator.PROP_WINDOW_STATUS)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			WindowActuator.PROP_WINDOW_STATUS,
			TypeMapper.getDatatypeURI(Integer.class), 1, 1)
		.addRestriction(
			new BoundingValueRestriction(
				WindowActuator.PROP_WINDOW_STATUS, new Integer(
					0), true, new Integer(100), true)));

	// load CurtainActuator
	oci = createNewOntClassInfo(CurtainActuator.MY_URI, factory, 5);
	oci.setResourceComment("A Curtain Dimmable Actuator");
	oci.setResourceLabel("Curtain Actuator");
	oci.addSuperClass(DimmerActuator.MY_URI);
	oci.addObjectProperty(CurtainActuator.PROP_IN_WINDOW);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			CurtainActuator.PROP_IN_WINDOW, WindowActuator.MY_URI,
			0, 1));
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			DimmerActuator.PROP_DIMMABLE_STATUS,
			TypeMapper.getDatatypeURI(Integer.class), 1, 1)
		.addRestriction(
			new BoundingValueRestriction(
				DimmerActuator.PROP_DIMMABLE_STATUS,
				new Integer(0), true, new Integer(100), true)));

	// load BlindActuator
	oci = createNewOntClassInfo(BlindActuator.MY_URI, factory, 4);
	oci.setResourceComment("A Blind Dimmable Actuator");
	oci.setResourceLabel("Blind Actuator");
	oci.addSuperClass(DimmerActuator.MY_URI);
	oci.addObjectProperty(BlindActuator.PROP_IN_WINDOW);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			BlindActuator.PROP_IN_WINDOW, WindowActuator.MY_URI, 0,
			1));
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			DimmerActuator.PROP_DIMMABLE_STATUS,
			TypeMapper.getDatatypeURI(Integer.class), 1, 1)
		.addRestriction(
			new BoundingValueRestriction(
				DimmerActuator.PROP_DIMMABLE_STATUS,
				new Integer(0), true, new Integer(100), true)));

	// load BlindController
	oci = createNewOntClassInfo(BlindController.MY_URI, factory, 0);
	oci.setResourceComment("The class of services controling blinds.");
	oci.setResourceLabel("BlindsServices");
	oci.addSuperClass(DeviceService.MY_URI);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		DeviceService.PROP_CONTROLS, BlindActuator.MY_URI));

	// load WindowController
	oci = createNewOntClassInfo(WindowController.MY_URI, factory, 2);
	oci.setResourceComment("The class of services controling windows.");
	oci.setResourceLabel("WindowServices");
	oci.addSuperClass(DeviceService.MY_URI);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		DeviceService.PROP_CONTROLS, WindowActuator.MY_URI));

	// load CurtainController
	oci = createNewOntClassInfo(CurtainController.MY_URI, factory, 3);
	oci.setResourceComment("The class of services controling blinds.");
	oci.setResourceLabel("BlindsServices");
	oci.addSuperClass(DeviceService.MY_URI);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		DeviceService.PROP_CONTROLS, BlindActuator.MY_URI));

	// load GlassBreakSensor
	oci = createNewOntClassInfo(GlassBreakSensor.MY_URI, factory, 6);
	oci.setResourceComment("A Glass Break Sensor Device");
	oci.setResourceLabel("Glass Break Sensor");
	oci.addSuperClass(DimmerActuator.MY_URI);
	oci.addObjectProperty(GlassBreakSensor.PROP_IN_WINDOW);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			GlassBreakSensor.PROP_IN_WINDOW, WindowActuator.MY_URI,
			0, 1));
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Sensor.PROP_MEASURED_VALUE, TypeMapper
			.getDatatypeURI(Boolean.class)));
    }
}
