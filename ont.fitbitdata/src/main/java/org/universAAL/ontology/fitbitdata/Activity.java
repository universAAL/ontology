/*
	Copyright 2011-2012 TSB, http://www.tsbtecnologias.es
	TSB - Tecnologías para la Salud y el Bienestar
	
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
package org.universAAL.ontology.fitbitdata;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;


public class Activity extends ManagedIndividual {
  public static final String MY_URI = FitbitdataOntology.NAMESPACE
    + "Activity";
  public static final String PROP_STEPS = FitbitdataOntology.NAMESPACE
    + "steps";
  public static final String PROP_CALORIES = FitbitdataOntology.NAMESPACE
    + "calories";


  public Activity () {
    super();
  }
  
  public Activity (String uri) {
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
      && hasProperty(PROP_STEPS)
      && hasProperty(PROP_CALORIES);
  }

  public String getCalories() {
    return (String)getProperty(PROP_CALORIES);
  }		

  public void setCalories(String newPropValue) {
	  props.put(PROP_CALORIES, newPropValue);
  }		

  public String getSteps() {
    return (String)getProperty(PROP_STEPS);
  }		

  public void setSteps(String newPropValue) {
	  props.put(PROP_STEPS, newPropValue);
  }		
}
