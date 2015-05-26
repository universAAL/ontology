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

import org.universAAL.ontology.measurement.Measurement;

public class BloodPressure extends HealthMeasurement {
    public static final String MY_URI = HealthMeasurementOntology.NAMESPACE
	    + "BloodPressure";
    public static final String PROP_SYSTOLIC = HealthMeasurementOntology.NAMESPACE
    	    + "systolicBloodPreassure";
    public static final String PROP_DIASTOLIC = HealthMeasurementOntology.NAMESPACE
    	    + "diastolicBloodPreassure";

    public BloodPressure() {
	super();
    }

    public BloodPressure(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
    }
    
    public void setSyst(Measurement m){
	if(m != null){
	    changeProperty(PROP_SYSTOLIC, m);
	}
    }
    public Measurement getSyst(){
	return (Measurement) getProperty(PROP_SYSTOLIC);
    }
    
    public void setDias(Measurement m){
	if(m != null){
	    changeProperty(PROP_DIASTOLIC, m);
	}
    }
    public Measurement getDias(){
	return (Measurement) getProperty(PROP_DIASTOLIC);
    }

    public boolean isWellFormed() {
	return true;
    }
}
