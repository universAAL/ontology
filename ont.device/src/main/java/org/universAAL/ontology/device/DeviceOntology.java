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

package org.universAAL.ontology.device;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.measurement.Measurement;
import org.universAAL.ontology.measurement.MeasurementOntology;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.PhThingOntology;

//import the factory for this ontology
import org.universAAL.ontology.DeviceFactory;

/**
 * @author AAL Studio: UML2Java transformation
 */
public final class DeviceOntology extends Ontology {

    private static DeviceFactory factory = new DeviceFactory();
    public static final String NAMESPACE = "http://ontology.universAAL.org/Device.owl#";

    public DeviceOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r.setResourceComment("The Collection of Devices Ontology");
	r.setResourceLabel("device");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ServiceBusOntology.NAMESPACE);
	addImport(LocationOntology.NAMESPACE);
	addImport(MeasurementOntology.NAMESPACE);
	addImport(PhThingOntology.NAMESPACE);

	// ******* Declaration of enumeration classes of the ontology ******* //

	OntClassInfoSetup oci_TemperatureLevelValue = createNewAbstractOntClassInfo(TemperatureLevelValue.MY_URI);
	OntClassInfoSetup oci_ExitValue = createNewAbstractOntClassInfo(ExitValue.MY_URI);
	OntClassInfoSetup oci_MotionValue = createNewAbstractOntClassInfo(MotionValue.MY_URI);
	OntClassInfoSetup oci_StatusValue = createNewAbstractOntClassInfo(StatusValue.MY_URI);
	OntClassInfoSetup oci_DosageValue = createNewAbstractOntClassInfo(DosageValue.MY_URI);
	OntClassInfoSetup oci_ValueType = createNewAbstractOntClassInfo(ValueType.MY_URI);

	// ******* Declaration of regular classes of the ontology ******* //
	// OntClassInfoSetup oci_MeasuredEvent =
	// createNewAbstractOntClassInfo(MeasuredEvent.MY_URI);
	// OntClassInfoSetup oci_MeasuredState =
	// createNewAbstractOntClassInfo(MeasuredState.MY_URI);
	OntClassInfoSetup oci_COSensor = createNewOntClassInfo(COSensor.MY_URI,
		factory, 0);
	OntClassInfoSetup oci_WaterFlowActuator = createNewOntClassInfo(
		WaterFlowActuator.MY_URI, factory, 1);
	OntClassInfoSetup oci_WindowController = createNewOntClassInfo(
		WindowController.MY_URI, factory, 2);
	OntClassInfoSetup oci_Actuator = createNewAbstractOntClassInfo(Actuator.MY_URI);
	OntClassInfoSetup oci_LightController = createNewOntClassInfo(
		LightController.MY_URI, factory, 3);
	OntClassInfoSetup oci_FallSensor = createNewOntClassInfo(
		FallSensor.MY_URI, factory, 4);
	OntClassInfoSetup oci_SwitchActuator = createNewOntClassInfo(
		SwitchActuator.MY_URI, factory, 5);
	OntClassInfoSetup oci_DimmerActuator = createNewOntClassInfo(
		DimmerActuator.MY_URI, factory, 6);
	OntClassInfoSetup oci_DosageSensor = createNewOntClassInfo(
		DosageSensor.MY_URI, factory, 7);
	OntClassInfoSetup oci_PanicButtonSensor = createNewOntClassInfo(
		PanicButtonSensor.MY_URI, factory, 8);
	OntClassInfoSetup oci_HeaterSensor = createNewOntClassInfo(
		HeaterSensor.MY_URI, factory, 9);
	OntClassInfoSetup oci_CurtainSensor = createNewOntClassInfo(
		CurtainSensor.MY_URI, factory, 10);
	// OntClassInfoSetup oci_MyService =
	// createNewOntClassInfo(MyService.MY_URI, factory, 11);
	OntClassInfoSetup oci_PresenceSensor = createNewOntClassInfo(
		PresenceSensor.MY_URI, factory, 12);
	OntClassInfoSetup oci_EnuresisSensor = createNewOntClassInfo(
		EnuresisSensor.MY_URI, factory, 13);
	OntClassInfoSetup oci_DimmerSensor = createNewOntClassInfo(
		DimmerSensor.MY_URI, factory, 14);
	OntClassInfoSetup oci_MotionSensor = createNewOntClassInfo(
		MotionSensor.MY_URI, factory, 15);
	OntClassInfoSetup oci_SmokeSensor = createNewOntClassInfo(
		SmokeSensor.MY_URI, factory, 16);
	OntClassInfoSetup oci_CurtainController = createNewOntClassInfo(
		CurtainController.MY_URI, factory, 17);
	OntClassInfoSetup oci_SwitchController = createNewOntClassInfo(
		SwitchController.MY_URI, factory, 18);
	OntClassInfoSetup oci_BlindSensor = createNewOntClassInfo(
		BlindSensor.MY_URI, factory, 19);
	OntClassInfoSetup oci_HeaterController = createNewOntClassInfo(
		HeaterController.MY_URI, factory, 20);
	OntClassInfoSetup oci_ValueDevice = createNewAbstractOntClassInfo(ValueDevice.MY_URI);
	OntClassInfoSetup oci_SwitchSensor = createNewOntClassInfo(
		SwitchSensor.MY_URI, factory, 21);
	OntClassInfoSetup oci_ExitSensor = createNewOntClassInfo(
		ExitSensor.MY_URI, factory, 22);
	OntClassInfoSetup oci_GlassBreakSensor = createNewOntClassInfo(
		GlassBreakSensor.MY_URI, factory, 23);
	OntClassInfoSetup oci_HumiditySensor = createNewOntClassInfo(
		HumiditySensor.MY_URI, factory, 24);
	OntClassInfoSetup oci_Sensor = createNewAbstractOntClassInfo(Sensor.MY_URI);
	OntClassInfoSetup oci_WaterFlowSensor = createNewOntClassInfo(
		WaterFlowSensor.MY_URI, factory, 25);
	OntClassInfoSetup oci_WaterFlowController = createNewOntClassInfo(
		WaterFlowController.MY_URI, factory, 26);
	OntClassInfoSetup oci_TemperatureLevelSensor = createNewOntClassInfo(
		TemperatureLevelSensor.MY_URI, factory, 27);
	OntClassInfoSetup oci_GasSensor = createNewOntClassInfo(
		GasSensor.MY_URI, factory, 28);
	OntClassInfoSetup oci_EnvironmentSensor = createNewOntClassInfo(
		EnvironmentSensor.MY_URI, factory, 29);
	OntClassInfoSetup oci_WindowSensor = createNewOntClassInfo(
		WindowSensor.MY_URI, factory, 30);
	OntClassInfoSetup oci_FloodSensor = createNewOntClassInfo(
		FloodSensor.MY_URI, factory, 31);
	OntClassInfoSetup oci_ContactSensor = createNewOntClassInfo(
		ContactSensor.MY_URI, factory, 32);
	OntClassInfoSetup oci_DimmerController = createNewOntClassInfo(
		DimmerController.MY_URI, factory, 33);
	OntClassInfoSetup oci_CurtainActuator = createNewOntClassInfo(
		CurtainActuator.MY_URI, factory, 34);
	OntClassInfoSetup oci_BlindActuator = createNewOntClassInfo(
		BlindActuator.MY_URI, factory, 35);
	OntClassInfoSetup oci_BlindController = createNewOntClassInfo(
		BlindController.MY_URI, factory, 36);
	OntClassInfoSetup oci_WindowActuator = createNewOntClassInfo(
		WindowActuator.MY_URI, factory, 37);
	OntClassInfoSetup oci_LightSensor = createNewOntClassInfo(
		LightSensor.MY_URI, factory, 38);
	OntClassInfoSetup oci_TemperatureSensor = createNewOntClassInfo(
		TemperatureSensor.MY_URI, factory, 39);
	OntClassInfoSetup oci_HeaterActuator = createNewOntClassInfo(
		HeaterActuator.MY_URI, factory, 40);
	OntClassInfoSetup oci_LightActuator = createNewOntClassInfo(
		LightActuator.MY_URI, factory, 41);
	OntClassInfoSetup oci_DoorActuator = createNewOntClassInfo(
			DoorActuator.MY_URI, factory, 42);
	OntClassInfoSetup oci_DoorController = createNewOntClassInfo(
			DoorController.MY_URI, factory, 43);
	OntClassInfoSetup oci_DoorSensor = createNewOntClassInfo(
			DoorSensor.MY_URI, factory, 44);
	OntClassInfoSetup oci_CO2Sensor = createNewOntClassInfo(
		CO2Sensor.MY_URI, factory, 45);
	OntClassInfoSetup oci_EnvironmentMeter = createNewOntClassInfo(
		EnvironmentMeter.MY_URI, factory, 46);
	OntClassInfoSetup oci_CO2Meter = createNewOntClassInfo(CO2Meter.MY_URI,
		factory, 47);
	OntClassInfoSetup oci_COMeter = createNewOntClassInfo(COMeter.MY_URI,
		factory, 48);
	OntClassInfoSetup oci_GasMeter = createNewOntClassInfo(GasMeter.MY_URI,
		factory, 49);
	OntClassInfoSetup oci_SmokeMeter = createNewOntClassInfo(
		SmokeMeter.MY_URI, factory, 50);

	// ******* Add content to enumeration classes of the ontology ******* //

	oci_TemperatureLevelValue.setResourceComment("");
	oci_TemperatureLevelValue.setResourceLabel("TemperatureLevelValue");
	oci_TemperatureLevelValue.toEnumeration(new ManagedIndividual[] {
		TemperatureLevelValue.HighTemperature,
		TemperatureLevelValue.LowTemperature,
		TemperatureLevelValue.ChangeTooFast });

	oci_ExitValue.setResourceComment("");
	oci_ExitValue.setResourceLabel("ExitValue");
	oci_ExitValue.toEnumeration(new ManagedIndividual[] { ExitValue.Exit,
		ExitValue.DoorLeftOpen, ExitValue.NoCondition });

	oci_MotionValue.setResourceComment("");
	oci_MotionValue.setResourceLabel("MotionValue");
	oci_MotionValue
		.toEnumeration(new ManagedIndividual[] { MotionValue.Detected,
			MotionValue.Delayed, MotionValue.Tampered });

	oci_StatusValue.setResourceComment("");
	oci_StatusValue.setResourceLabel("StatusValue");
	oci_StatusValue.toEnumeration(new ManagedIndividual[] {
		StatusValue.Activated, StatusValue.NotActivated,
		StatusValue.NoCondition });

	oci_DosageValue.setResourceComment("");
	oci_DosageValue.setResourceLabel("DosageValue");
	oci_DosageValue
		.toEnumeration(new ManagedIndividual[] { DosageValue.Taken,
			DosageValue.Missed, DosageValue.NoCondition });

	oci_ValueType.setResourceComment("");
	oci_ValueType.setResourceLabel("ValueType");
	oci_ValueType.toEnumeration(new ManagedIndividual[] { ValueType.event,
		ValueType.state });

	// ******* Add content to regular classes of the ontology ******* //

	oci_COSensor.setResourceComment("");
	oci_COSensor.setResourceLabel("COSensor");
	oci_COSensor.addSuperClass(EnvironmentSensor.MY_URI);
	
	oci_CO2Sensor.setResourceComment("");
	oci_CO2Sensor.setResourceLabel("CO2Sensor");
	oci_CO2Sensor.addSuperClass(EnvironmentSensor.MY_URI);
	
	oci_WaterFlowActuator.setResourceComment("");
	oci_WaterFlowActuator.setResourceLabel("WaterFlowActuator");
	oci_WaterFlowActuator.addSuperClass(Actuator.MY_URI);
	oci_WaterFlowActuator.addObjectProperty(
		WaterFlowActuator.PROP_HAS_VALUE).setFunctional();
	oci_WaterFlowActuator.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			WaterFlowActuator.PROP_HAS_VALUE, StatusValue.MY_URI,
			1, 1));

	oci_WindowController.setResourceComment("");
	oci_WindowController.setResourceLabel("WindowController");
	oci_WindowController.addSuperClass(WindowActuator.MY_URI);
	oci_WindowController.addSuperClass(WindowSensor.MY_URI);
	oci_WindowController.addObjectProperty(WindowController.PROP_HAS_VALUE)
		.setFunctional();
	oci_WindowController.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			WindowController.PROP_HAS_VALUE, StatusValue.MY_URI, 1,
			1));

	oci_Actuator.setResourceComment("");
	oci_Actuator.setResourceLabel("Actuator");
	oci_Actuator.addSuperClass(ValueDevice.MY_URI);
	oci_LightController.setResourceComment("");
	oci_LightController.setResourceLabel("LightController");
	oci_LightController.addSuperClass(LightActuator.MY_URI);
	oci_LightController.addSuperClass(LightSensor.MY_URI);
	oci_LightController.addDatatypeProperty(LightController.PROP_HAS_VALUE)
		.setFunctional();
	oci_LightController.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			LightController.PROP_HAS_VALUE, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));

	oci_FallSensor.setResourceComment("");
	oci_FallSensor.setResourceLabel("FallSensor");
	oci_FallSensor.addSuperClass(Sensor.MY_URI);
	oci_FallSensor.addObjectProperty(FallSensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_FallSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			FallSensor.PROP_HAS_VALUE, StatusValue.MY_URI, 1, 1));

	oci_SwitchActuator.setResourceComment("");
	oci_SwitchActuator.setResourceLabel("SwitchActuator");
	oci_SwitchActuator.addSuperClass(Actuator.MY_URI);
	oci_SwitchActuator.addObjectProperty(SwitchActuator.PROP_HAS_VALUE)
		.setFunctional();
	oci_SwitchActuator
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				SwitchActuator.PROP_HAS_VALUE,
				StatusValue.MY_URI, 1, 1));

	oci_DimmerActuator.setResourceComment("");
	oci_DimmerActuator.setResourceLabel("DimmerActuator");
	oci_DimmerActuator.addSuperClass(Actuator.MY_URI);
	oci_DimmerActuator.addDatatypeProperty(DimmerActuator.PROP_HAS_VALUE)
		.setFunctional();
	oci_DimmerActuator.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			DimmerActuator.PROP_HAS_VALUE, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));

	oci_DosageSensor.setResourceComment("");
	oci_DosageSensor.setResourceLabel("DosageSensor");
	oci_DosageSensor.addSuperClass(Sensor.MY_URI);
	oci_DosageSensor.addObjectProperty(DosageSensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_DosageSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			DosageSensor.PROP_HAS_VALUE, DosageValue.MY_URI, 1, 1));

	oci_PanicButtonSensor.setResourceComment("");
	oci_PanicButtonSensor.setResourceLabel("PanicButtonSensor");
	oci_PanicButtonSensor.addSuperClass(Sensor.MY_URI);
	oci_PanicButtonSensor.addObjectProperty(
		PanicButtonSensor.PROP_HAS_VALUE).setFunctional();
	oci_PanicButtonSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PanicButtonSensor.PROP_HAS_VALUE, StatusValue.MY_URI,
			1, 1));

	oci_HeaterSensor.setResourceComment("");
	oci_HeaterSensor.setResourceLabel("HeaterSensor");
	oci_HeaterSensor.addSuperClass(Sensor.MY_URI);
	oci_HeaterSensor.addObjectProperty(HeaterSensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_HeaterSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HeaterSensor.PROP_HAS_VALUE, StatusValue.MY_URI, 1, 1));

	oci_CurtainSensor.setResourceComment("");
	oci_CurtainSensor.setResourceLabel("CurtainSensor");
	oci_CurtainSensor.addSuperClass(Sensor.MY_URI);
	oci_CurtainSensor.addDatatypeProperty(CurtainSensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_CurtainSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			CurtainSensor.PROP_HAS_VALUE, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));

	oci_PresenceSensor.setResourceComment("");
	oci_PresenceSensor.setResourceLabel("PresenceSensor");
	oci_PresenceSensor.addSuperClass(Sensor.MY_URI);
	oci_PresenceSensor.addObjectProperty(PresenceSensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_PresenceSensor
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				PresenceSensor.PROP_HAS_VALUE,
				StatusValue.MY_URI, 1, 1));

	oci_EnuresisSensor.setResourceComment("");
	oci_EnuresisSensor.setResourceLabel("EnuresisSensor");
	oci_EnuresisSensor.addSuperClass(Sensor.MY_URI);
	oci_EnuresisSensor.addObjectProperty(EnuresisSensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_EnuresisSensor
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				EnuresisSensor.PROP_HAS_VALUE,
				StatusValue.MY_URI, 1, 1));

	oci_DimmerSensor.setResourceComment("");
	oci_DimmerSensor.setResourceLabel("DimmerSensor");
	oci_DimmerSensor.addSuperClass(Sensor.MY_URI);
	oci_DimmerSensor.addDatatypeProperty(DimmerSensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_DimmerSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			DimmerSensor.PROP_HAS_VALUE, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));

	oci_MotionSensor.setResourceComment("");
	oci_MotionSensor.setResourceLabel("MotionSensor");
	oci_MotionSensor.addSuperClass(Sensor.MY_URI);
	oci_MotionSensor.addObjectProperty(MotionSensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_MotionSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			MotionSensor.PROP_HAS_VALUE, MotionValue.MY_URI, 1, 1));

	oci_SmokeSensor.setResourceComment("");
	oci_SmokeSensor.setResourceLabel("SmokeSensor");
	oci_SmokeSensor.addSuperClass(EnvironmentSensor.MY_URI);
	oci_CurtainController.setResourceComment("");
	oci_CurtainController.setResourceLabel("CurtainController");
	oci_CurtainController.addSuperClass(CurtainActuator.MY_URI);
	oci_CurtainController.addSuperClass(CurtainSensor.MY_URI);
	oci_CurtainController.addDatatypeProperty(
		CurtainController.PROP_HAS_VALUE).setFunctional();
	oci_CurtainController.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			CurtainController.PROP_HAS_VALUE, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));

	oci_SwitchController.setResourceComment("");
	oci_SwitchController.setResourceLabel("SwitchController");
	oci_SwitchController.addSuperClass(SwitchActuator.MY_URI);
	oci_SwitchController.addSuperClass(SwitchSensor.MY_URI);
	oci_SwitchController.addObjectProperty(SwitchController.PROP_HAS_VALUE)
		.setFunctional();
	oci_SwitchController.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			SwitchController.PROP_HAS_VALUE, StatusValue.MY_URI, 1,
			1));

	oci_BlindSensor.setResourceComment("");
	oci_BlindSensor.setResourceLabel("BlindSensor");
	oci_BlindSensor.addSuperClass(Sensor.MY_URI);
	oci_BlindSensor.addDatatypeProperty(BlindSensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_BlindSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			BlindSensor.PROP_HAS_VALUE, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));

	oci_HeaterController.setResourceComment("");
	oci_HeaterController.setResourceLabel("HeaterController");
	oci_HeaterController.addSuperClass(HeaterActuator.MY_URI);
	oci_HeaterController.addSuperClass(HeaterSensor.MY_URI);
	oci_HeaterController.addObjectProperty(HeaterController.PROP_HAS_VALUE)
		.setFunctional();
	oci_HeaterController.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HeaterController.PROP_HAS_VALUE, StatusValue.MY_URI, 1,
			1));

	oci_ValueDevice.setResourceComment("");
	oci_ValueDevice.setResourceLabel("ValueDevice");
	oci_ValueDevice.addSuperClass(Device.MY_URI);
	oci_ValueDevice.addObjectProperty(ValueDevice.PROP_HAS_VALUE)
		.setFunctional();
	// The only restriction on this property is cardinality
	oci_ValueDevice.addRestriction(MergedRestriction
		.getCardinalityRestriction(ValueDevice.PROP_HAS_VALUE, 1, 1));

	oci_ValueDevice.addObjectProperty(ValueDevice.PROP_VALUE_TYPE)
		.setFunctional();
	oci_ValueDevice.addRestriction(MergedRestriction
		.getAllValuesRestriction(ValueDevice.PROP_VALUE_TYPE,
			ValueType.MY_URI));

	oci_SwitchSensor.setResourceComment("");
	oci_SwitchSensor.setResourceLabel("SwitchSensor");
	oci_SwitchSensor.addSuperClass(Sensor.MY_URI);
	oci_SwitchSensor.addObjectProperty(SwitchSensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_SwitchSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			SwitchSensor.PROP_HAS_VALUE, StatusValue.MY_URI, 1, 1));

	oci_ExitSensor.setResourceComment("");
	oci_ExitSensor.setResourceLabel("ExitSensor");
	oci_ExitSensor.addSuperClass(Sensor.MY_URI);
	oci_ExitSensor.addObjectProperty(ExitSensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_ExitSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			ExitSensor.PROP_HAS_VALUE, ExitValue.MY_URI, 1, 1));

	oci_GlassBreakSensor.setResourceComment("");
	oci_GlassBreakSensor.setResourceLabel("GlassBreakSensor");
	oci_GlassBreakSensor.addSuperClass(Sensor.MY_URI);
	oci_GlassBreakSensor.addObjectProperty(GlassBreakSensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_GlassBreakSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			GlassBreakSensor.PROP_HAS_VALUE, StatusValue.MY_URI, 1,
			1));

	oci_HumiditySensor.setResourceComment("");
	oci_HumiditySensor.setResourceLabel("HumiditySensor");
	oci_HumiditySensor.addSuperClass(Sensor.MY_URI);
	oci_HumiditySensor.addDatatypeProperty(HumiditySensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_HumiditySensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HumiditySensor.PROP_HAS_VALUE, TypeMapper
				.getDatatypeURI(Float.class), 1, 1));

	oci_Sensor.setResourceComment("");
	oci_Sensor.setResourceLabel("Sensor");
	oci_Sensor.addSuperClass(ValueDevice.MY_URI);
	oci_WaterFlowSensor.setResourceComment("");
	oci_WaterFlowSensor.setResourceLabel("WaterFlowSensor");
	oci_WaterFlowSensor.addSuperClass(Sensor.MY_URI);
	oci_WaterFlowSensor.addObjectProperty(WaterFlowSensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_WaterFlowSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			WaterFlowSensor.PROP_HAS_VALUE, StatusValue.MY_URI, 1,
			1));

	oci_WaterFlowController.setResourceComment("");
	oci_WaterFlowController.setResourceLabel("WaterFlowController");
	oci_WaterFlowController.addSuperClass(WaterFlowActuator.MY_URI);
	oci_WaterFlowController.addSuperClass(WaterFlowSensor.MY_URI);
	oci_WaterFlowController.addObjectProperty(
		WaterFlowController.PROP_HAS_VALUE).setFunctional();
	oci_WaterFlowController.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			WaterFlowController.PROP_HAS_VALUE, StatusValue.MY_URI,
			1, 1));

	oci_TemperatureLevelSensor.setResourceComment("");
	oci_TemperatureLevelSensor.setResourceLabel("TemperatureLevelSensor");
	oci_TemperatureLevelSensor.addSuperClass(Sensor.MY_URI);
	oci_TemperatureLevelSensor.addObjectProperty(
		TemperatureLevelSensor.PROP_HAS_VALUE).setFunctional();
	oci_TemperatureLevelSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			TemperatureLevelSensor.PROP_HAS_VALUE,
			TemperatureLevelValue.MY_URI, 1, 1));

	oci_GasSensor.setResourceComment("");
	oci_GasSensor.setResourceLabel("GasSensor");
	oci_GasSensor.addSuperClass(EnvironmentSensor.MY_URI);
	
	oci_EnvironmentSensor.setResourceComment("");
	oci_EnvironmentSensor.setResourceLabel("EnvironmentSensor");
	oci_EnvironmentSensor.addSuperClass(Sensor.MY_URI);
	oci_EnvironmentSensor.addObjectProperty(
		EnvironmentSensor.PROP_HAS_VALUE).setFunctional();
	oci_EnvironmentSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			EnvironmentSensor.PROP_HAS_VALUE, StatusValue.MY_URI,
			1, 1));
	
	oci_EnvironmentMeter.setResourceComment("");
	oci_EnvironmentMeter.setResourceLabel("EnvironmentMeter");
	oci_EnvironmentMeter.addSuperClass(Sensor.MY_URI);
	oci_EnvironmentMeter.addObjectProperty(
		EnvironmentMeter.PROP_HAS_VALUE).setFunctional();
	oci_EnvironmentMeter.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			EnvironmentMeter.PROP_HAS_VALUE, Measurement.MY_URI,
			1, 1));
	
	oci_GasMeter.setResourceComment("");
	oci_GasMeter.setResourceLabel("GasMeter");
	oci_GasMeter.addSuperClass(EnvironmentMeter.MY_URI);
	
	oci_SmokeMeter.setResourceComment("");
	oci_SmokeMeter.setResourceLabel("SmokeMeter");
	oci_SmokeMeter.addSuperClass(EnvironmentMeter.MY_URI);
	
	oci_COMeter.setResourceComment("");
	oci_COMeter.setResourceLabel("COMeter");
	oci_COMeter.addSuperClass(EnvironmentMeter.MY_URI);
	
	oci_CO2Meter.setResourceComment("");
	oci_CO2Meter.setResourceLabel("CO2Meter");
	oci_CO2Meter.addSuperClass(EnvironmentMeter.MY_URI);

	oci_WindowSensor.setResourceComment("");
	oci_WindowSensor.setResourceLabel("WindowSensor");
	oci_WindowSensor.addSuperClass(Sensor.MY_URI);
	oci_WindowSensor.addObjectProperty(WindowSensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_WindowSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			WindowSensor.PROP_HAS_VALUE, StatusValue.MY_URI, 1, 1));

	oci_FloodSensor.setResourceComment("");
	oci_FloodSensor.setResourceLabel("FloodSensor");
	oci_FloodSensor.addSuperClass(Sensor.MY_URI);
	oci_FloodSensor.addObjectProperty(FloodSensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_FloodSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			FloodSensor.PROP_HAS_VALUE, StatusValue.MY_URI, 1, 1));

	oci_ContactSensor.setResourceComment("");
	oci_ContactSensor.setResourceLabel("ContactSensor");
	oci_ContactSensor.addSuperClass(Sensor.MY_URI);
	oci_ContactSensor.addObjectProperty(ContactSensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_ContactSensor
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				ContactSensor.PROP_HAS_VALUE,
				StatusValue.MY_URI, 1, 1));

	oci_DimmerController.setResourceComment("");
	oci_DimmerController.setResourceLabel("DimmerController");
	oci_DimmerController.addSuperClass(DimmerActuator.MY_URI);
	oci_DimmerController.addSuperClass(DimmerSensor.MY_URI);
	oci_DimmerController.addDatatypeProperty(
		DimmerController.PROP_HAS_VALUE).setFunctional();
	oci_DimmerController.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			DimmerController.PROP_HAS_VALUE, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));

	oci_CurtainActuator.setResourceComment("");
	oci_CurtainActuator.setResourceLabel("CurtainActuator");
	oci_CurtainActuator.addSuperClass(Actuator.MY_URI);
	oci_CurtainActuator.addDatatypeProperty(CurtainActuator.PROP_HAS_VALUE)
		.setFunctional();
	oci_CurtainActuator.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			CurtainActuator.PROP_HAS_VALUE, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));

	oci_BlindActuator.setResourceComment("");
	oci_BlindActuator.setResourceLabel("BlindActuator");
	oci_BlindActuator.addSuperClass(Actuator.MY_URI);
	oci_BlindActuator.addDatatypeProperty(BlindActuator.PROP_HAS_VALUE)
		.setFunctional();
	oci_BlindActuator.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			BlindActuator.PROP_HAS_VALUE, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));

	oci_BlindController.setResourceComment("");
	oci_BlindController.setResourceLabel("BlindController");
	oci_BlindController.addSuperClass(BlindActuator.MY_URI);
	oci_BlindController.addSuperClass(BlindSensor.MY_URI);
	oci_BlindController.addDatatypeProperty(BlindController.PROP_HAS_VALUE)
		.setFunctional();
	oci_BlindController.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			BlindController.PROP_HAS_VALUE, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));

	oci_WindowActuator.setResourceComment("");
	oci_WindowActuator.setResourceLabel("WindowActuator");
	oci_WindowActuator.addSuperClass(Actuator.MY_URI);
	oci_WindowActuator.addObjectProperty(WindowActuator.PROP_HAS_VALUE)
		.setFunctional();
	oci_WindowActuator
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				WindowActuator.PROP_HAS_VALUE,
				StatusValue.MY_URI, 1, 1));

	oci_LightSensor.setResourceComment("");
	oci_LightSensor.setResourceLabel("LightSensor");
	oci_LightSensor.addSuperClass(Sensor.MY_URI);
	oci_LightSensor.addDatatypeProperty(LightSensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_LightSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			LightSensor.PROP_HAS_VALUE, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));

	oci_TemperatureSensor.setResourceComment("");
	oci_TemperatureSensor.setResourceLabel("TemperatureSensor");
	oci_TemperatureSensor.addSuperClass(Sensor.MY_URI);
	oci_TemperatureSensor.addDatatypeProperty(
		TemperatureSensor.PROP_HAS_VALUE).setFunctional();
	oci_TemperatureSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			TemperatureSensor.PROP_HAS_VALUE, TypeMapper
				.getDatatypeURI(Float.class), 1, 1));

	oci_HeaterActuator.setResourceComment("");
	oci_HeaterActuator.setResourceLabel("HeaterActuator");
	oci_HeaterActuator.addSuperClass(Actuator.MY_URI);
	oci_HeaterActuator.addObjectProperty(HeaterActuator.PROP_HAS_VALUE)
		.setFunctional();
	oci_HeaterActuator
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				HeaterActuator.PROP_HAS_VALUE,
				StatusValue.MY_URI, 1, 1));

	oci_LightActuator.setResourceComment("");
	oci_LightActuator.setResourceLabel("LightActuator");
	oci_LightActuator.addSuperClass(Actuator.MY_URI);
	oci_LightActuator.addDatatypeProperty(LightActuator.PROP_HAS_VALUE)
		.setFunctional();
	oci_LightActuator.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			LightActuator.PROP_HAS_VALUE, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));

	oci_DoorActuator.setResourceComment("");
	oci_DoorActuator.setResourceLabel("DoorActuator");
	oci_DoorActuator.addSuperClass(Actuator.MY_URI);
	oci_DoorActuator.addObjectProperty(DoorActuator.PROP_HAS_VALUE)
		.setFunctional();
	oci_DoorActuator
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
					DoorActuator.PROP_HAS_VALUE,
				StatusValue.MY_URI, 1, 1));
	
	oci_DoorSensor.setResourceComment("");
	oci_DoorSensor.setResourceLabel("DoorSensor");
	oci_DoorSensor.addSuperClass(Sensor.MY_URI);
	oci_DoorSensor.addObjectProperty(DoorSensor.PROP_HAS_VALUE)
		.setFunctional();
	oci_DoorSensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
				DoorSensor.PROP_HAS_VALUE, StatusValue.MY_URI, 1, 1));


	oci_DoorController.setResourceComment("");
	oci_DoorController.setResourceLabel("DoorController");
	oci_DoorController.addSuperClass(DoorActuator.MY_URI);
	oci_DoorController.addSuperClass(DoorSensor.MY_URI);
	oci_DoorController.addObjectProperty(DoorController.PROP_HAS_VALUE)
		.setFunctional();
	oci_DoorController.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
				DoorController.PROP_HAS_VALUE, StatusValue.MY_URI, 1,
			1));
	
    }
}
