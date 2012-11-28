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
import org.universAAL.middleware.service.owl.Service;


public class FitbitData extends ManagedIndividual {
  public static final String MY_URI = FitbitdataOntology.NAMESPACE
    + "FitbitData";
  public static final String PROP_DATE = FitbitdataOntology.NAMESPACE
    + "date";
  public static final String PROP_SLEEP = FitbitdataOntology.NAMESPACE
    + "sleep";
  public static final String PROP_ACTIVITY = FitbitdataOntology.NAMESPACE
    + "activity";


  public FitbitData () {
    super();
  }
  
  public FitbitData (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }
  public int getPropSerializationType(String propURI) {
	// TODO Implement or if for Device subclasses: remove 
	  return PROP_SERIALIZATION_FULL;

  }

  public boolean isWellFormed() {
	return true 
      && hasProperty(PROP_DATE)
      && hasProperty(PROP_SLEEP)
      && hasProperty(PROP_ACTIVITY);
  }

  public Sleep getSleep() {
    return (Sleep)getProperty(PROP_SLEEP);
  }		

  public void setSleep(Sleep newPropValue) {
   props.put(PROP_SLEEP, newPropValue);
  }		

  public Activity getActivity() {
    return (Activity)getProperty(PROP_ACTIVITY);
  }		

  public void setActivity(Activity newPropValue) {
	  props.put(PROP_ACTIVITY, newPropValue);
  }		

  public String getDate() {
    return (String)getProperty(PROP_DATE);
  }		

  public void setDate(String newPropValue) {
	  props.put(PROP_DATE, newPropValue);
  }		
}
