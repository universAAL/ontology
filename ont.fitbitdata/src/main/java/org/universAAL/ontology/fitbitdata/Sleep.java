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

import org.universAAL.middleware.owl.ManagedIndividual;


public class Sleep extends ManagedIndividual {
  public static final String MY_URI = FitbitdataOntology.NAMESPACE
    + "Sleep";
  public static final String PROP_TIME_IN_BED = FitbitdataOntology.NAMESPACE
    + "timeInBed";
  public static final String PROP_IS_MAIN_SLEEP = FitbitdataOntology.NAMESPACE
    + "isMainSleep";
  public static final String PROP_MINUTES_ASLEEP = FitbitdataOntology.NAMESPACE
    + "minutesAsleep";


  public Sleep () {
    super();
  }
  
  public Sleep (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }
  public int getPropSerializationType(String arg0) {
	// TODO Implement or if for Device subclasses: remove 
	return PROP_SERIALIZATION_FULL;
  }

  public boolean isWellFormed() {
	return true 
      && hasProperty(PROP_TIME_IN_BED)
      && hasProperty(PROP_IS_MAIN_SLEEP)
      && hasProperty(PROP_MINUTES_ASLEEP);
  }

  public String getIsMainSleep() {
    return (String)getProperty(PROP_IS_MAIN_SLEEP);
  }		

  public void setIsMainSleep(String newPropValue) {
	  props.put(PROP_IS_MAIN_SLEEP, newPropValue);
  }		

  public String getMinutesAsleep() {
    return (String)getProperty(PROP_MINUTES_ASLEEP);
  }		

  public void setMinutesAsleep(String newPropValue) {
	  props.put(PROP_MINUTES_ASLEEP, newPropValue);
  }		

  public String getTimeInBed() {
    return (String)getProperty(PROP_TIME_IN_BED);
  }		

  public void setTimeInBed(String newPropValue) {
	  props.put(PROP_TIME_IN_BED, newPropValue);
  }		
}
