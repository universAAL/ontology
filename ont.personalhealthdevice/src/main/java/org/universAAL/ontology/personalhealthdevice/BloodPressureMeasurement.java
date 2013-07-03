/*
     Copyright 2010-2014 AIT Austrian Institute of Technology GmbH
	 http://www.ait.ac.at
     
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

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.measurement.Measurement;

/**
 * Ontological representation of a blood pressure measurement (systolic,
 * diastolic pressure and heart rate).
 * 
 * @author Thomas Fuxreiter (foex@gmx.at)
 */
public class BloodPressureMeasurement extends ManagedIndividual {

    public static final String MY_URI = PersonalHealthDeviceOntology.NAMESPACE
	    + "BloodPressureMeasurement";

    /** systolic blood pressure */
    public static final String PROP_HAS_MEASURED_BPSYS = PersonalHealthDeviceOntology.NAMESPACE
	    + "hasMeasuredBPSys";

    /** diastolic blood pressure */
    public static final String PROP_HAS_MEASURED_BPDIA = PersonalHealthDeviceOntology.NAMESPACE
	    + "hasMeasuredBPDia";

    /** heart rate */
    public static final String PROP_HAS_MEASURED_HEARTRATE = PersonalHealthDeviceOntology.NAMESPACE
	    + "hasMeasuredHeartRate";

    public BloodPressureMeasurement() {
	super();
    }

    public BloodPressureMeasurement(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    public void setMeasuredBPSys(Measurement m) {
	props.put(PROP_HAS_MEASURED_BPSYS, m);
    }

    public Measurement getMeasuredBPSys() {
	return ((Measurement) props.get(PROP_HAS_MEASURED_BPSYS));
    }

    public void setMeasuredBPDia(Measurement m) {
	props.put(PROP_HAS_MEASURED_BPDIA, m);
    }

    public Measurement getMeasuredBPDia() {
	return ((Measurement) props.get(PROP_HAS_MEASURED_BPDIA));
    }

    public void setMeasuredHeartRate(Measurement m) {
	props.put(PROP_HAS_MEASURED_HEARTRATE, m);
    }

    public Measurement getMeasuredHeartRate() {
	return ((Measurement) props.get(PROP_HAS_MEASURED_HEARTRATE));
    }
}
