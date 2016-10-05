/*******************************************************************************
 * Copyright 2015 UPM - Universidad Politécnica de Madrid
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.hvac;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.owl.supply.LevelRating;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.HvacFactory;
import org.universAAL.ontology.device.DeviceOntology;
import org.universAAL.ontology.device.StatusValue;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.unit.MeasurableDimension;
import org.universAAL.ontology.unit.Unit;
import org.universAAL.ontology.unit.UnitOntology;

/**
 * HVAC (Heating, Ventilation and Air Conditioning Ontology.
 * 
 * @author Ricardo
 */
public final class HvacOntology extends Ontology {

	private static HvacFactory factory = new HvacFactory();
	public static final String NAMESPACE = "http://ontology.universAAL.org/Hvac.owl#";

	public HvacOntology() {
		super(NAMESPACE);
	}

	public void create() {
		Resource r = getInfo();
		r.setResourceComment("The Collection of HVAC Concepts");
		r.setResourceLabel("Hvac");
		addImport(DataRepOntology.NAMESPACE);
		addImport(ServiceBusOntology.NAMESPACE);
		addImport(LocationOntology.NAMESPACE);
		addImport(DeviceOntology.NAMESPACE);
		addImport(UnitOntology.NAMESPACE);
		// ////////////////////////////////////////////////////////////////////////////
		// ******* Declaration of enumeration classes of the ontology ******* //
		// ///////////////////////////////////////////////////////////////////////////

		OntClassInfoSetup oci_Air_Conditioning_Mode = createNewAbstractOntClassInfo(Air_Conditioning_Mode.MY_URI);
		OntClassInfoSetup oci_Heating_Mode = createNewAbstractOntClassInfo(Heating_Mode.MY_URI);
		OntClassInfoSetup oci_Ventilation_Mode = createNewAbstractOntClassInfo(Ventilation_Mode.MY_URI);
		OntClassInfoSetup oci_Hvac = createNewAbstractOntClassInfo(Hvac.MY_URI);

		OntClassInfoSetup oci_Mode = createNewAbstractOntClassInfo(Mode.MY_URI);

		OntClassInfoSetup oci_Target_Temperature = createNewAbstractOntClassInfo(Target_Temperature.MY_URI);

		// ////////////////////////////////////////////////////////////////////
		// ******* Declaration of regular classes of the ontology ******* //
		// ////////////////////////////////////////////////////////////////////

		OntClassInfoSetup oci_Air_Conditioning = createNewOntClassInfo(
				Air_Conditioning.MY_URI, factory, 0);
		OntClassInfoSetup oci_Heating = createNewOntClassInfo(Heating.MY_URI,
				factory, 1);
		OntClassInfoSetup oci_Ventilation = createNewOntClassInfo(
				Ventilation.MY_URI, factory, 2);
		// //////////////////////////////////////////////////////////////////(/////
		// ******* Add content to abstract classes of the ontology ******* //
		// ///////////////////////////////////////////////////////////////////////////
		oci_Hvac.setResourceComment("Heating, Air Conditioning and Ventilation Systems");
		oci_Hvac.setResourceLabel("Hvac");
		oci_Hvac.addSuperClass(Device.MY_URI);
		oci_Hvac.addObjectProperty(Hvac.PROP_HAS_FAN).setFunctional();
		oci_Hvac.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(Hvac.PROP_HAS_FAN,
						LevelRating.MY_URI, 0, 1));

		oci_Hvac.addObjectProperty(Hvac.PROP_HAS_SWING).setFunctional();
		oci_Hvac.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(Hvac.PROP_HAS_SWING,
						LevelRating.MY_URI, 0, 1));

		oci_Hvac.addObjectProperty(Hvac.PROP_HAS_STATUSVALUE).setFunctional();
		oci_Hvac.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						Hvac.PROP_HAS_STATUSVALUE, StatusValue.MY_URI, 1, 1));

		oci_Mode.setResourceComment("The diffents modes of Hvac Systems");
		oci_Mode.setResourceLabel("Mode");
		oci_Mode.addSuperClass(ManagedIndividual.MY_URI);

		// //////////////////////////////////////////////////////////////////(/////
		// ******* Add content to enumeration classes of the ontology ******* //
		// ///////////////////////////////////////////////////////////////////////////

		Air_Conditioning_Mode.Automatic
				.setResourceLabel("Automatic Air Conditioning Mode");
		Air_Conditioning_Mode.Automatic
				.setResourceComment("its a mode in which the user sets the temperature that (s)he wants");
		Air_Conditioning_Mode.Cool
				.setResourceLabel(" Air Conditioning Cool Mode");
		Air_Conditioning_Mode.Cool
				.setResourceComment("its a mode that produces cold air");

		oci_Air_Conditioning_Mode
				.setResourceComment("The different modes of Air Conditioning that we can choose ");
		oci_Air_Conditioning_Mode.setResourceLabel("Air_Conditioning_Mode");
		oci_Air_Conditioning_Mode.toEnumeration(new ManagedIndividual[] {
				Air_Conditioning_Mode.Automatic, Air_Conditioning_Mode.Cool });

		Heating_Mode.Automatic.setResourceLabel("Automatic Heating Mode");
		Heating_Mode.Automatic
				.setResourceComment("its a mode in which the user sets the temperature that (s)he wants");
		Heating_Mode.heat.setResourceLabel("Heat Mode");
		Heating_Mode.heat.setResourceComment("its a mode that heats the air");

		oci_Heating_Mode
				.setResourceComment("The different modes of Heating that we can choose");
		oci_Heating_Mode.setResourceLabel("Heating_Mode");
		oci_Heating_Mode.toEnumeration(new ManagedIndividual[] {
				Heating_Mode.Automatic, Heating_Mode.heat });

		Ventilation_Mode.Fan.setResourceLabel("Automatic Ventilation Mode");
		Ventilation_Mode.Fan
				.setResourceComment("its a mode in which the user sets the ventilation mode is On,"
						+ "also in many hvac system this mode is known as Fan Mode ");
		Ventilation_Mode.Dry.setResourceLabel("Dry Mode");
		Ventilation_Mode.Dry
				.setResourceComment("enables dehumidifier technology");
		oci_Ventilation_Mode
				.setResourceComment("The different modes of Ventilation that we can choose");
		oci_Ventilation_Mode.setResourceLabel("Ventilation_Mode");
		oci_Ventilation_Mode.toEnumeration(new ManagedIndividual[] {

		Ventilation_Mode.Fan, Ventilation_Mode.Dry });

		// ////////////////////////////////////////////////////////////////
		// ******* Add content to regular classes of the ontology ******* //
		// ///////////////////////////////////////////////////////////////////

		// ///AIR CONDITIONING

		oci_Air_Conditioning
				.setResourceComment("System that is acapable of cooling the air in a room.");
		oci_Air_Conditioning.setResourceLabel("Air Conditioning");
		oci_Air_Conditioning.addSuperClass(Target_Temperature.MY_URI);

		oci_Air_Conditioning.addObjectProperty(
				Air_Conditioning.PROP_HAS_AIR_CONDITIONING_MODE)
				.setFunctional();
		oci_Air_Conditioning.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						Air_Conditioning.PROP_HAS_AIR_CONDITIONING_MODE,
						StatusValue.MY_URI, 0, 3));

		// /// HEATING

		oci_Heating
				.setResourceComment("System that is capable of heating the air in a room.");
		oci_Heating.setResourceLabel("Heating");
		oci_Heating.addSuperClass(Target_Temperature.MY_URI);

		oci_Heating.addObjectProperty(Heating.PROP_HAS_HEATING_MODE)
				.setFunctional();
		oci_Heating
				.addRestriction(MergedRestriction
						.getAllValuesRestrictionWithCardinality(
								Heating.PROP_HAS_HEATING_MODE,
								StatusValue.MY_URI, 0, 3));

		// ///VENTILATION

		oci_Ventilation
				.setResourceComment("System that is capable of moving the air in a room");
		oci_Ventilation.setResourceLabel("Ventilation");
		oci_Ventilation.addSuperClass(Hvac.MY_URI);
		//
		// oci_Ventilation.addObjectProperty(Ventilation.PROP_HAS_FAN)
		// .setFunctional();
		// oci_Ventilation.addRestriction(MergedRestriction
		// .getAllValuesRestrictionWithCardinality(
		// Ventilation.PROP_HAS_FAN, LevelRating.MY_URI, 0, 1));

		oci_Ventilation
				.addObjectProperty(Ventilation.PROP_HAS_VENTILATION_MODE)
				.setFunctional();
		oci_Ventilation.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						Ventilation.PROP_HAS_VENTILATION_MODE,
						StatusValue.MY_URI, 0, 3));

		// oci_Ventilation.addObjectProperty(Ventilation.PROP_HAS_SWING)
		// .setFunctional();
		// oci_Ventilation.addRestriction(MergedRestriction
		// .getAllValuesRestrictionWithCardinality(
		// Ventilation.PROP_HAS_SWING, LevelRating.MY_URI, 0, 3));

		// Target Temperature
		oci_Target_Temperature
				.setResourceComment("System that is capable of keeping a room at a targeted temperature.");
		oci_Target_Temperature.setResourceLabel("Target Temperature");
		oci_Target_Temperature.addSuperClass(Hvac.MY_URI);

		MergedRestriction unitR = MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						Target_Temperature.PROP_TEMPERATURE_UNIT, Unit.MY_URI,
						1, 1);
		MergedRestriction unitR2 = MergedRestriction.getFixedValueRestriction(
				Unit.PROP_DIMENSION, MeasurableDimension.Temperature);

		unitR2.appendTo(unitR, new String[] {
				Target_Temperature.PROP_TEMPERATURE_UNIT, Unit.PROP_DIMENSION });

		oci_Target_Temperature
				.addObjectProperty(Target_Temperature.PROP_TEMPERATURE_UNIT);
		oci_Target_Temperature.addRestriction(unitR);

		MergedRestriction cT = MergedRestriction.getAllValuesRestriction(
				Target_Temperature.PROP_CURRENT_TEMPERATURE_VALUE,
				TypeMapper.getDatatypeURI(Float.class));

		oci_Target_Temperature
				.addDatatypeProperty(Target_Temperature.PROP_CURRENT_TEMPERATURE_VALUE);

		oci_Target_Temperature.addRestriction(cT);

		MergedRestriction tT = MergedRestriction.getAllValuesRestriction(
				Target_Temperature.PROP_TARGET_TEMPERATURE_VALUE,
				TypeMapper.getDatatypeURI(Float.class));

		oci_Target_Temperature
				.addDatatypeProperty(Target_Temperature.PROP_TARGET_TEMPERATURE_VALUE);

		oci_Target_Temperature.addRestriction(tT);

	}
}
