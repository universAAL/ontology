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

package org.universaal.ontology.healthmeasurement.owl;

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;

public class Signal extends ManagedIndividual {
  public static final String MY_URI = HealthMeasurementOntology.NAMESPACE
    + "Signal";
  public static final String PROP_MEASUREMENT = HealthMeasurementOntology.NAMESPACE
  + "measurement";
  public static final String PROP_MEASUREMENT_INTERVAL = HealthMeasurementOntology.NAMESPACE
  + "measurementInterval";
  
  public Signal () {
    super();
  }
  
  public Signal (String uri) {
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
	      && hasProperty(PROP_MEASUREMENT)
	      && hasProperty(PROP_MEASUREMENT_INTERVAL);
  }
  
  //GETTERS & SETTERS
  
  public Measurement getMeasurementInterval() {
	    return (Measurement)getProperty(PROP_MEASUREMENT_INTERVAL);
  }		

  public void setMeasurementInterval(Measurement interval) {
	  if (interval != null)
		  setProperty(PROP_MEASUREMENT_INTERVAL, interval);
  }		
  
  public Measurement[] getMeasurements() {

		Object propList = props.get(PROP_MEASUREMENT);
		if (propList instanceof List) {
			return (Measurement[]) ((List) propList).toArray(new Measurement[0]);
		} else {
			List returnList = new ArrayList();
			if (propList != null)
				returnList.add((Measurement) propList);
			return (Measurement[]) returnList.toArray(new Measurement[0]);
		}  
	}	
	
	public void setMeasurements(Measurement[] measurements) {
		List propList = new ArrayList(measurements.length);
		for (int i = 0; i < measurements.length; i++) {
			propList.add(measurements[i]);
		}
		props.put(PROP_MEASUREMENT, propList);
	}

	public void addMeasurement(Measurement measurement) {
		Object propList = props.get(PROP_MEASUREMENT);
		if (propList instanceof List) {
			List list = (List) propList;
			list.add(measurement);
			props.put(PROP_MEASUREMENT, list);
		} else if (propList == null) {
			props.put(PROP_MEASUREMENT, measurement);
		} else {
			List list = new ArrayList();
			list.add((Measurement) propList);
			list.add(measurement);
			props.put(PROP_MEASUREMENT, list);
		}
	}
  
}
