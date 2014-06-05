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

package org.universAAL.ontology.measurement;

import java.util.ArrayList;
import java.util.List;

public class Signal extends Measurement {
    public static final String MY_URI = MeasurementOntology.NAMESPACE
	    + "Signal";
    public static final String PROP_MEASUREMENTS = MeasurementOntology.NAMESPACE
	    + "measurement";
    public static final String PROP_MEASUREMENT_INTERVAL = MeasurementOntology.NAMESPACE
	    + "measurementInterval";

    public Signal() {
	super();
    }

    public Signal(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true 
		&& hasProperty(PROP_MEASUREMENT_INTERVAL);
    }

    // GETTERS & SETTERS

	public Measurement getMeasurementInterval() {
		return (Measurement) getProperty(PROP_MEASUREMENT_INTERVAL);
	}
	
    public void setMeasurementInterval(Measurement interval) {
	if (interval != null)
	    setProperty(PROP_MEASUREMENT_INTERVAL, interval);
    }

    public Object[] getArray() {

	Object propList = props.get(PROP_MEASUREMENTS);
	if (propList instanceof List) {
	    return (Object[]) ((List) propList)
		    .toArray(new Object[0]);
	} else {
	    List returnList = new ArrayList();
	    if (propList != null)
		returnList.add((Object) propList);
	    return (Object[]) returnList.toArray(new Object[0]);
	}
    }

    public void setArray(Object[] array) {
    	List propList = new ArrayList(array.length);
    	for (int i = 0; i < array.length; i++) {
    		propList.add(array[i]);
    	}
    	props.put(PROP_MEASUREMENTS, propList);
    }

    public void addValue(Object newValue) {
	Object propList = props.get(PROP_MEASUREMENTS);
	if (propList instanceof List) {
	    List list = (List) propList;
	    list.add(newValue);
	    props.put(PROP_MEASUREMENTS, list);
//	} else if (propList == null) {
//	    props.put(PROP_MEASUREMENTS, newValue);
	} else {
	    List list = new ArrayList();
	    list.add((Measurement) propList);
	    list.add(newValue);
	    props.put(PROP_MEASUREMENTS, list);
	}
    }

}
