/*******************************************************************************
 * Copyright 2012 UPM, http://www.upm.es - Universidad Politécnica de Madrid
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
package org.universaal.ontology.health.owl;

import org.universAAL.middleware.owl.ManagedIndividual;

public class MeasurementRequirements extends ManagedIndividual {
	public static final String MY_URI = HealthOntology.NAMESPACE
	+ "MeasurementRequirements";
	public static final String PROP_MAX_VALUE_ALLOWED = HealthOntology.NAMESPACE
	+ "maxValueAllowed";
	public static final String PROP_MIN_VALUE_ALLOWED = HealthOntology.NAMESPACE
	+ "minValueAllowed";

  public MeasurementRequirements () {
    super();
  }
  
  public MeasurementRequirements (String uri) {
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
      && props.containsKey(PROP_MAX_VALUE_ALLOWED)
      && props.containsKey(PROP_MIN_VALUE_ALLOWED);
  }
  
  public int getMaxValueAllowed() {
		Integer i = (Integer) props.get(PROP_MAX_VALUE_ALLOWED);
		return (i == null) ? 0 : i.intValue();
	  }		

	  public void setMaxValueAllowed(int maxValue) {
	      props.put(PROP_MAX_VALUE_ALLOWED, new Integer(maxValue));
	  }		

	  public int getMinValueAllowed() {
		Integer i = (Integer) props.get(PROP_MIN_VALUE_ALLOWED);
		return (i == null) ? 0 : i.intValue();
	  }		

	  public void setMinValueAllowed(int minValue) {
	      props.put(PROP_MIN_VALUE_ALLOWED, new Integer(minValue));
	  }		
  
}
