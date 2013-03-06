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
import javax.xml.datatype.Duration;

public class HeartRateSignal extends Signal {
  public static final String MY_URI = HealthMeasurementOntology.NAMESPACE
    + "HeartRateSignal";
  public static final String PROP_IS_COMPOSED_BY = HealthMeasurementOntology.NAMESPACE
    + "isComposedBy";
  public static final String PROP_INTERVAL = HealthMeasurementOntology.NAMESPACE
    + "PROP_INTERVAL";//eliminar, porque ya la tiene signal.


  public HeartRateSignal () {
    super();
  }
  
  public HeartRateSignal (String uri) {
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
      && hasProperty(PROP_IS_COMPOSED_BY)
      && hasProperty(PROP_INTERVAL);
  }

  public HeartRate[] getIsComposedBy() {
    Object propList = getProperty(PROP_IS_COMPOSED_BY);
    if (propList instanceof List)
      return (HeartRate[]) ((List) propList).toArray(new HeartRate[0]);
    else if (propList != null)
      return new HeartRate[] {(HeartRate)propList}; // Handle special case of a single item not contained in a list
    return new HeartRate[0];
  }

  public void addIsComposedBy(HeartRate newValue) {
    Object propList = getProperty(PROP_IS_COMPOSED_BY);
    List newList;
    if (propList instanceof List)
      newList = (List)propList;
    else {
      newList = new ArrayList();
      if (propList != null)
        newList.add(propList); // Handle special case of a single previous item not contained in a list
    }
    newList.add(newValue);
    setProperty(PROP_IS_COMPOSED_BY, newList);
  }
  

  public void setIsComposedBy(HeartRate[] propertyValue) {
    List propList = new ArrayList(propertyValue.length);
    for (int i = 0; i < propertyValue.length; i++) {
      propList.add(propertyValue[i]);
    }
    setProperty(PROP_IS_COMPOSED_BY, propList);
  }

  public Duration getPROP_INTERVAL() {
    return (Duration)getProperty(PROP_INTERVAL);
  }		

  public void setPROP_INTERVAL(Duration duration) {
    if (duration != null)
      setProperty(PROP_INTERVAL, duration);
  }		
}
