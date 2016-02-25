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

package org.universAAL.ontology.hvac;

import org.universAAL.middleware.*;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.owl.SomeValuesFromRestriction;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.device.DeviceOntology;
//import org.universAAL.ontology.healthmeasurement.owl.BloodPressure;
//import org.universAAL.ontology.healthmeasurement.owl.HealthMeasurement;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.measurement.Measurement;
import org.universAAL.ontology.measurement.MeasurementOntology;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.unit.MeasurableDimension;
import org.universAAL.ontology.unit.Unit;
import org.universAAL.ontology.unit.UnitOntology;
import org.universAAL.ontology.HvacFactory;
import org.universAAL.ontology.device.*;
//import the factory for this ontology



/**
 * @author AAL Studio: UML2Java transformation
 */
public final class HvacOntology extends Ontology {

    private static HvacFactory factory = new HvacFactory();
    public static final String NAMESPACE = "http://ontology.universAAL.org/Hvac.owl#";

    public HvacOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r.setResourceComment("The Collection of Hvac Ontology");
	r.setResourceLabel("Hvac");
	addImport(DataRepOntology.NAMESPACE); 
	addImport(ServiceBusOntology.NAMESPACE);
	addImport(LocationOntology.NAMESPACE);
	addImport(MeasurementOntology.NAMESPACE);
	addImport(DeviceOntology.NAMESPACE);
	addImport(UnitOntology.NAMESPACE);
    //////////////////////////////////////////////////////////////////////////////
	// ******* Declaration of enumeration classes of the ontology ******* //
	/////////////////////////////////////////////////////////////////////////////
	
	
	OntClassInfoSetup oci_Air_Conditioning_Mode = createNewAbstractOntClassInfo(Air_Conditioning_Mode.MY_URI);
	OntClassInfoSetup oci_Heating_Mode = createNewAbstractOntClassInfo(Heating_Mode.MY_URI);
	OntClassInfoSetup oci_Level = createNewAbstractOntClassInfo(Level.MY_URI);
	OntClassInfoSetup oci_StatusValue = createNewAbstractOntClassInfo(StatusValue.MY_URI);
	OntClassInfoSetup oci_Swing = createNewAbstractOntClassInfo(Swing.MY_URI);
	OntClassInfoSetup oci_Ventilation_Mode = createNewAbstractOntClassInfo(Ventilation_Mode.MY_URI);
	OntClassInfoSetup oci_Fan = createNewAbstractOntClassInfo(Fan.MY_URI);

	OntClassInfoSetup oci_Mode = createNewAbstractOntClassInfo(Mode.MY_URI);

	OntClassInfoSetup oci_Target_Temperature = createNewAbstractOntClassInfo(Target_Temperature.MY_URI);
	
	//OntClassInfoSetup oci_Timer = createNewAbstractOntClassInfo(Timer.MY_URI);
	
	
	
	
    //////////////////////////////////////////////////////////////////////
	// ******* Declaration of regular classes of the ontology ******* //
	//////////////////////////////////////////////////////////////////////

	
	OntClassInfoSetup oci_Air_Conditioning = createNewOntClassInfo(Air_Conditioning.MY_URI,
		factory, 0);
	OntClassInfoSetup oci_Heating = createNewOntClassInfo(Heating.MY_URI, factory, 1);
	OntClassInfoSetup oci_Ventilation = createNewOntClassInfo(Ventilation.MY_URI, factory, 2);
	
	////////////////////////////////////////////////////////////////////(/////
	// ******* Add content to enumeration classes of the ontology ******* //
	/////////////////////////////////////////////////////////////////////////////
	
	oci_Air_Conditioning_Mode.setResourceComment("The different modes of Air Conditioning that we can choose ");
	oci_Air_Conditioning_Mode.setResourceLabel("Air_Conditioning_Mode");
	oci_Air_Conditioning_Mode.toEnumeration(new ManagedIndividual[] {
			Air_Conditioning_Mode.NonAutomatic,
			Air_Conditioning_Mode.SleepMode,
			Air_Conditioning_Mode.SummerMode});	
	
	oci_Level.setResourceComment("The different levels of the properties of an Hvac");
	oci_Level.setResourceLabel("Level");
	oci_Level.toEnumeration(new ManagedIndividual[] {
		Level.high,
		Level.low,
		Level.med});
	
	oci_Level.setResourceComment("The Intensity of the air");
	oci_Level.setResourceLabel("Fan");
	oci_Level.toEnumeration(new ManagedIndividual[] {
		Level.high,
		Level.low,
		Level.med});
		
	oci_Level.setResourceComment("Choose the mouvement of the air");
	oci_Level.setResourceLabel("Swing");
	oci_Level.toEnumeration(new ManagedIndividual[] {
		Level.high,
		Level.low,
		Level.med});
	
	oci_StatusValue.setResourceComment("Indicates which is the state of the module");
	oci_StatusValue.setResourceLabel("StatusValue");
	oci_StatusValue.toEnumeration(new ManagedIndividual[] {
		StatusValue.Activated, 
		StatusValue.NotActivated,
		StatusValue.NoCondition });


	
	oci_Heating_Mode.setResourceComment("The different modes of Heating that we can choose");
	oci_Heating_Mode.setResourceLabel("Heating_Mode");
	oci_Heating_Mode.toEnumeration(new ManagedIndividual[] {
			Heating_Mode.NonAutomatic,
			Heating_Mode.SleepMode,
			Heating_Mode.winterMode});
	
	oci_Ventilation_Mode.setResourceComment("The different modes of Ventilation that we can choose");
	oci_Ventilation_Mode.setResourceLabel("Ventilation_Mode");
	oci_Ventilation_Mode.toEnumeration(new ManagedIndividual[] {
			
			Ventilation_Mode.NonAutomatic,
			Ventilation_Mode.SleepMode,
			Ventilation_Mode.Dry});

		
	//////////////////////////////////////////////////////////////////
	// ******* Add content to regular classes of the ontology ******* //
	/////////////////////////////////////////////////////////////////////
	
	
	/////AIR CONDITIONING
	
	oci_Air_Conditioning.setResourceComment("Air Conditioning");
	oci_Air_Conditioning.setResourceLabel("Air_Conditioning");
	oci_Air_Conditioning.addSuperClass(Target_Temperature.MY_URI);
	
//	oci_Air_Conditioning.addObjectProperty(
//			Air_Conditioning.PROP_HAS_TEMPERATURE).setFunctional();
//	oci_Air_Conditioning.addRestriction(MergedRestriction
//			.getAllValuesRestrictionWithCardinality(
//					Air_Conditioning.PROP_HAS_TEMPERATURE, StatusValue.MY_URI,
//				1, 1));
	
	oci_Air_Conditioning.addObjectProperty(
			Air_Conditioning.PROP_HAS_FAN).setFunctional();
	oci_Air_Conditioning.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
					Air_Conditioning.PROP_HAS_FAN, StatusValue.MY_URI,
			    0, 1));
	
	oci_Air_Conditioning.addObjectProperty(
			Air_Conditioning.PROP_HAS_AIR_CONDITIONING_MODE).setFunctional();
	oci_Air_Conditioning.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
					Air_Conditioning.PROP_HAS_AIR_CONDITIONING_MODE, StatusValue.MY_URI,
			    0, 3));
	
	oci_Air_Conditioning.addObjectProperty(
			Air_Conditioning.PROP_HAS_SWING).setFunctional();
	oci_Air_Conditioning.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
					Air_Conditioning.PROP_HAS_SWING, StatusValue.MY_URI,
			    0, 3));
	
	oci_Air_Conditioning.addObjectProperty(
			Air_Conditioning.PROP_HAS_TIMER).setFunctional();
	oci_Air_Conditioning.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
					Air_Conditioning.PROP_HAS_TIMER, StatusValue.MY_URI,
			    0, 1));
	oci_Air_Conditioning.addObjectProperty(
			Target_Temperature.PROP_HAS_TEMPERATURE).setFunctional();
	oci_Air_Conditioning.addRestriction(MergedRestriction
			.getFixedValueRestriction(Target_Temperature.PROP_HAS_TEMPERATURE, MeasurableDimension.Temperature));
	
	///// HEATING
	
	oci_Heating.setResourceComment("Heating");
	oci_Heating.setResourceLabel("Heating");
	oci_Heating.addSuperClass(Target_Temperature.MY_URI);
	
//	oci_Heating.addObjectProperty(
//			Heating.PROP_HAS_TEMPERATURE).setFunctional();
//	oci_Heating.addRestriction(MergedRestriction
//			.getAllValuesRestrictionWithCardinality(
//					Heating.PROP_HAS_TEMPERATURE, StatusValue.MY_URI,
//				1, 1));
	
	oci_Heating.addObjectProperty(
			Heating.PROP_HAS_FAN).setFunctional();
	oci_Heating.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
					Heating.PROP_HAS_FAN, StatusValue.MY_URI,
			    0, 1));
	
	oci_Heating.addObjectProperty(
			Heating.PROP_HAS_HEATING_MODE).setFunctional();
	oci_Heating.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
					Heating.PROP_HAS_HEATING_MODE, StatusValue.MY_URI,
			    0, 3));
	
	oci_Heating.addObjectProperty(
			Heating.PROP_HAS_SWING).setFunctional();
	oci_Heating.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
					Heating.PROP_HAS_SWING, StatusValue.MY_URI,
			    0, 3));
	
	oci_Heating.addObjectProperty(
			Heating.PROP_HAS_TIMER).setFunctional();
	oci_Heating.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
					Heating.PROP_HAS_TIMER, StatusValue.MY_URI,
			    0, 1));
	oci_Heating.addObjectProperty(
			Target_Temperature.PROP_HAS_TEMPERATURE).setFunctional();
	oci_Heating.addRestriction(MergedRestriction
			.getFixedValueRestriction(Target_Temperature.PROP_HAS_TEMPERATURE, MeasurableDimension.Temperature));
	
	/////VENTILATION
	
	oci_Ventilation.setResourceComment("");
	oci_Ventilation.setResourceLabel("Ventilation");
	oci_Ventilation.addSuperClass(Hvac.MY_URI);
	
	
	
	oci_Ventilation.addObjectProperty(
			Ventilation.PROP_HAS_FAN).setFunctional();
	oci_Ventilation.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
					Ventilation.PROP_HAS_FAN, StatusValue.MY_URI,
			    0, 1));
	
	oci_Ventilation.addObjectProperty(
			Ventilation.PROP_HAS_VENTILATION_MODE).setFunctional();
	oci_Ventilation.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
					Ventilation.PROP_HAS_VENTILATION_MODE, StatusValue.MY_URI,
			    0, 3));
	
	oci_Ventilation.addObjectProperty(
			Ventilation.PROP_HAS_SWING).setFunctional();
	oci_Ventilation.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
					Ventilation.PROP_HAS_SWING, StatusValue.MY_URI,
			    0, 3));
	
	oci_Ventilation.addObjectProperty(
			Ventilation.PROP_HAS_TIMER).setFunctional();
	oci_Ventilation.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
					Ventilation.PROP_HAS_TIMER, StatusValue.MY_URI,
			    0, 1));


	
	// Target Temperature
		oci_Target_Temperature.setResourceComment("");
		oci_Target_Temperature.setResourceLabel("Target_Temperature");
		oci_Target_Temperature.addSuperClass(Hvac.MY_URI);

		

		
		MergedRestriction unitR = MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						Target_Temperature.PROP_TEMPERATURE_UNIT,Unit.MY_URI, 1, 1);
		MergedRestriction unitR2 = MergedRestriction.getFixedValueRestriction(
				Unit.PROP_DIMENSION,MeasurableDimension.Temperature);
		
		unitR2.appendTo(unitR, new String[] { Target_Temperature.PROP_TEMPERATURE_UNIT, Unit.PROP_DIMENSION });
		
		
		

		oci_Target_Temperature.addObjectProperty(Target_Temperature.PROP_TEMPERATURE_UNIT);
		oci_Target_Temperature.addRestriction(unitR);
		
		
		MergedRestriction cT = MergedRestriction.getAllValuesRestriction(
				Target_Temperature.PROP_CURRENT_TEMPERATURE_VALUE, TypeMapper.getDatatypeURI(Float.class));

		oci_Target_Temperature.addObjectProperty(Target_Temperature.PROP_CURRENT_TEMPERATURE_VALUE);
		oci_Target_Temperature.addRestriction(cT);
	
		
		MergedRestriction tT = MergedRestriction.getAllValuesRestriction(
				Target_Temperature.PROP_TARGET_TEMPERATURE_VALUE, TypeMapper.getDatatypeURI(Float.class));
		
		oci_Target_Temperature.addObjectProperty(Target_Temperature.PROP_TARGET_TEMPERATURE_VALUE);
		oci_Target_Temperature.addRestriction(tT);
	
    }
}
