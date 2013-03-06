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

public class MultiValueMeasurement extends Measurement {
  public static final String MY_URI = HealthMeasurementOntology.NAMESPACE
    + "MultiValueMeasurement";
  public static final String PROP_UNIT = HealthMeasurementOntology.NAMESPACE
    + "unit";
  public static final String PROP_VALUE = HealthMeasurementOntology.NAMESPACE
    + "value";


  public MultiValueMeasurement () {
    super();
  }
  
  public MultiValueMeasurement (String uri) {
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
      && hasProperty(PROP_UNIT)
      && hasProperty(PROP_VALUE);
  }

  public String getValue() {
    return (String)getProperty(PROP_VALUE);
  }		

  public void setValue(String newPropValue) {
    if (newPropValue != null)
      setProperty(PROP_VALUE, newPropValue);
  }		

  public String getUnit() {
    return (String)getProperty(PROP_UNIT);
  }		

  public void setUnit(String newPropValue) {
    if (newPropValue != null)
      setProperty(PROP_UNIT, newPropValue);
  }		
}
