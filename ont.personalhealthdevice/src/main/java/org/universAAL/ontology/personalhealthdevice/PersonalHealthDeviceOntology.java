/*
     Copyright 2010-2014 AIT Austrian Institute of Technology GmbH
	 http://www.ait.ac.at

     Copyright 2015 ITACA-SABIEN, http://www.tsb.upv.es
     Instituto Tecnologico de Aplicaciones de Comunicacion
     Avanzadas - Grupo Tecnologias para la Salud y el
     Bienestar (SABIEN)

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

package org.universAAL.ontology.personalhealthdevice;

import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.ontology.PersonalHealthDeviceFactory;
import org.universAAL.ontology.device.DeviceOntology;
import org.universAAL.ontology.device.Sensor;
import org.universAAL.ontology.healthmeasurement.owl.BloodOxygenSaturation;
import org.universAAL.ontology.healthmeasurement.owl.BloodPressure;
import org.universAAL.ontology.healthmeasurement.owl.HealthMeasurementOntology;
import org.universAAL.ontology.healthmeasurement.owl.HeartRate;
import org.universAAL.ontology.healthmeasurement.owl.PersonWeight;
import org.universAAL.ontology.measurement.MeasurementOntology;

/**
 * The ontology represents the person-related health devices (Continua certified
 * devices) e.g. blood pressure monitor, weighing scale,...
 *
 * @author Thomas Fuxreiter (foex@gmx.at)
 */
public class PersonalHealthDeviceOntology extends Ontology {

	private static PersonalHealthDeviceFactory factory = new PersonalHealthDeviceFactory();

	public static final String NAMESPACE = Resource.NAMESPACE_PREFIX + "PersonalHealthDevice.owl#";

	public PersonalHealthDeviceOntology() {
		super(NAMESPACE);
	}

	public void create() {
		Resource r = getInfo();
		r.setResourceComment("Ontology for person-related health devices (Continua certified devices) "
				+ "e.g. blood pressure monitor, weighing scale,...");
		r.setResourceLabel("PersonalHealthDevice");
		addImport(MeasurementOntology.NAMESPACE);
		addImport(DeviceOntology.NAMESPACE);
		addImport(HealthMeasurementOntology.NAMESPACE);

		OntClassInfoSetup oci;

		// load BloodOxygenSat
		oci = createNewOntClassInfo(BloodOxygenSatSensor.MY_URI, factory, 0);
		oci.setResourceComment("The class of all blood oxygen sensors.");
		oci.setResourceLabel("BloodOxygenSatSensor");
		oci.addSuperClass(Sensor.MY_URI);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Sensor.PROP_HAS_VALUE,
				BloodOxygenSaturation.MY_URI, 1, 1));

		// load BloodPressure 2
		oci = createNewOntClassInfo(BloodPressureSensor.MY_URI, factory, 1);
		oci.setResourceComment("The class of all blood pressure sensors.");
		oci.setResourceLabel("BloodPressureSensor");
		oci.addSuperClass(Sensor.MY_URI);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Sensor.PROP_HAS_VALUE,
				BloodPressure.MY_URI, 1, 1));

		// load HeartRate
		oci = createNewOntClassInfo(HeartRateSensor.MY_URI, factory, 2);
		oci.setResourceComment("The class of all heart rate sensors.");
		oci.setResourceLabel("HeartRateSensor");
		oci.addSuperClass(Sensor.MY_URI);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Sensor.PROP_HAS_VALUE,
				HeartRate.MY_URI, 1, 1));

		// load WeighingScale
		oci = createNewOntClassInfo(WeighingScale.MY_URI, factory, 3);
		oci.setResourceComment("The class of all weighing scales.");
		oci.setResourceLabel("WeighingScale");
		oci.addSuperClass(Sensor.MY_URI);
		oci.addObjectProperty(WeighingScale.PROP_HAS_VALUE).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(WeighingScale.PROP_HAS_VALUE,
				PersonWeight.MY_URI, 1, 1));

	}

}
