/*******************************************************************************
 * Copyright 2012 UPM, http://www.upm.es 
 Universidad PolitÃ©cnica de Madrid
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

package org.universAAL.ontology.healthmeasurement.owl;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.healthmeasurement.HealthMeasurementFactory;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.measurement.Measurement;
import org.universAAL.ontology.measurement.Signal;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.ontology.profile.ProfileOntology;
import org.universAAL.ontology.profile.User;
import org.universAAL.ontology.unit.DividedUnit;
import org.universAAL.ontology.unit.MeasurableDimension;
import org.universAAL.ontology.unit.Unit;
import org.universAAL.ontology.unit.system.InternationalSystem;
import org.universAAL.ontology.unit.system.TimeSystem;
import org.universAAL.ontology.unit.system.Util;

/**
 * @author AAL Studio
 */
public final class HealthMeasurementOntology extends Ontology {

    private static HealthMeasurementFactory factory = new HealthMeasurementFactory();
    public static final String NAMESPACE = "http://ontology.universaal.org/HealthMeasurement.owl#";

    public HealthMeasurementOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r.setResourceComment("");
	r.setResourceLabel("HealthMeasurement");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ServiceBusOntology.NAMESPACE);
	addImport(LocationOntology.NAMESPACE);
	addImport(PhThingOntology.NAMESPACE);
	addImport(ProfileOntology.NAMESPACE);

	// ******* Declaration of regular classes of the ontology ******* //
	OntClassInfoSetup oci_HealthMeasurement = createNewOntClassInfo(
		HealthMeasurement.MY_URI, factory, 0);
	OntClassInfoSetup oci_PersonWeight = createNewOntClassInfo(
		PersonWeight.MY_URI, factory, 3);
	OntClassInfoSetup oci_BloodPressure = createNewOntClassInfo(
		BloodPressure.MY_URI, factory, 6);
	OntClassInfoSetup oci_HeartRate = createNewOntClassInfo(
		HeartRate.MY_URI, factory, 7);
	OntClassInfoSetup oci_HeartRateSignal = createNewOntClassInfo(
		HeartRateSignal.MY_URI, factory, 8);
	OntClassInfoSetup oci_BloodOxygenSat = createNewOntClassInfo(
		BloodOxygenSaturation.MY_URI, factory, 9);

	// ******* Add content to regular classes of the ontology ******* //

	// Health Measurement
	oci_HealthMeasurement.setResourceComment("");
	oci_HealthMeasurement.setResourceLabel("HealthMeasurement");
	oci_HealthMeasurement.addSuperClass(ManagedIndividual.MY_URI);
	oci_HealthMeasurement.addObjectProperty(
		HealthMeasurement.PROP_OBTAINED_BY).setFunctional();
	oci_HealthMeasurement
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				HealthMeasurement.PROP_OBTAINED_BY,
				User.MY_URI, 1, 1));

	oci_HealthMeasurement.addObjectProperty(
		HealthMeasurement.PROP_MEASURED_FROM).setFunctional();
	// oci_HealthMeasurement.addRestriction(MergedRestriction.getCardinalityRestriction(HealthMeasurement.PROP_MEASURED_BY,
	// 1, 1));
	oci_HealthMeasurement
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				HealthMeasurement.PROP_MEASURED_FROM,
				Device.MY_URI, 1, 1));
	
	oci_HealthMeasurement
		.addDatatypeProperty(HealthMeasurement.PROP_NAME);
	oci_HealthMeasurement
		.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				HealthMeasurement.PROP_NAME, TypeMapper.getDatatypeURI(String.class), 1, 1));
	
	oci_HealthMeasurement
	.addDatatypeProperty(HealthMeasurement.PROP_DESCIPTION);
	oci_HealthMeasurement
	.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
			HealthMeasurement.PROP_DESCIPTION, TypeMapper.getDatatypeURI(String.class), 1, 1));

	// Person Weight
	oci_PersonWeight.setResourceComment("");
	oci_PersonWeight.setResourceLabel("PersonWeight");
	oci_PersonWeight.addSuperClass(HealthMeasurement.MY_URI);
	oci_PersonWeight.addSuperClass(Measurement.MY_URI);
	
	oci_PersonWeight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
			Measurement.PROP_VALUE, TypeMapper.getDatatypeURI(Float.class), 1, 1));
	
	oci_PersonWeight.addRestriction(MergedRestriction.getFixedValueRestriction(
			Measurement.PROP_HAS_PREFIX, InternationalSystem.IND_PREFIX_SI_KILO));
	oci_PersonWeight.addRestriction(MergedRestriction.getFixedValueRestriction(
			Measurement.PROP_HAS_UNIT, InternationalSystem.IND_UNIT_SI_GRAM));


	// Blood pressure
	oci_BloodPressure.setResourceComment("");
	oci_BloodPressure.setResourceLabel("BloodPressure");
	oci_BloodPressure.addSuperClass(HealthMeasurement.MY_URI);

	Unit mmHg = new Unit("mmHg", "mm Hg", "mm Hg",
		MeasurableDimension.Derived);

	MergedRestriction diasR = MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			BloodPressure.PROP_DIASTOLIC, Measurement.MY_URI, 1, 1);
	MergedRestriction sysR = MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			BloodPressure.PROP_SYSTOLIC, Measurement.MY_URI, 1, 1);
	MergedRestriction unitR = MergedRestriction.getFixedValueRestriction(
		Measurement.PROP_HAS_UNIT, mmHg);
	MergedRestriction typeR = MergedRestriction.getAllValuesRestriction(
		Measurement.PROP_VALUE, TypeMapper.getDatatypeURI(Float.class));

	unitR.appendTo(diasR, new String[] { BloodPressure.PROP_DIASTOLIC, Measurement.PROP_HAS_UNIT });
	typeR.appendTo(diasR, new String[] { BloodPressure.PROP_DIASTOLIC, Measurement.PROP_VALUE });

	unitR.appendTo(sysR, new String[] { BloodPressure.PROP_SYSTOLIC, Measurement.PROP_HAS_UNIT });
	typeR.appendTo(sysR, new String[] { BloodPressure.PROP_SYSTOLIC, Measurement.PROP_VALUE });

	oci_BloodPressure.addObjectProperty(BloodPressure.PROP_SYSTOLIC);
	oci_BloodPressure.addRestriction(sysR);

	oci_BloodPressure.addObjectProperty(BloodPressure.PROP_DIASTOLIC);
	oci_BloodPressure.addRestriction(diasR);
	
	// Heart rate
	oci_HeartRate.setResourceComment("");
	oci_HeartRate.setResourceLabel("HeartRate");
	oci_HeartRate.addSuperClass(HealthMeasurement.MY_URI);
	oci_HeartRate.addSuperClass(Measurement.MY_URI);
	Unit beatsPerMinute = new DividedUnit("BPM", Util.IND_UNIT_UNITY,
    		TimeSystem.IND_UNIT_TS_MINUTE);
	oci_HeartRate.addRestriction(MergedRestriction.getFixedValueRestriction(
			Measurement.PROP_HAS_UNIT, beatsPerMinute));
	oci_HeartRate.addRestriction(MergedRestriction.getAllValuesRestriction(
		Measurement.PROP_VALUE, TypeMapper.getDatatypeURI(Integer.class)));
	
	// Blood Oxygen Sat
	oci_BloodOxygenSat.setResourceComment("Blood Oxygen Saturation SpO2");
	oci_BloodOxygenSat.setResourceLabel("BloodOxygenSaturation");
	oci_BloodOxygenSat.addSuperClass(HealthMeasurement.MY_URI);
	oci_BloodOxygenSat.addSuperClass(Measurement.MY_URI);
	Unit spo2 = new Unit("spo2", "SpO2", "%SpO2",
    		MeasurableDimension.Adiemnsional);
	oci_BloodOxygenSat.addRestriction(MergedRestriction.getFixedValueRestriction(
		Measurement.PROP_HAS_UNIT, spo2));

	// Heart rate signal
	oci_HeartRateSignal.setResourceComment("");
	oci_HeartRateSignal.setResourceLabel("HeartRateSignal");
	oci_HeartRateSignal.addSuperClass(Signal.MY_URI);

	oci_HeartRateSignal.addDatatypeProperty(HeartRateSignal.PROP_INTERVAL)
		.addSuperProperty(Signal.PROP_MEASUREMENT_INTERVAL);
	// XXX: set restriction so that the interval unit is for time.
	// XXX: set restriction so that the unit if the signal is the same as HeartRate.

    }
}
