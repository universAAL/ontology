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

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.universAAL.middleware.owl.ManagedIndividual;

public class PlannedSession extends ManagedIndividual{
  public static final String MY_URI = HealthOntology.NAMESPACE
    + "Session";
  public static final String PROP_DATE = HealthOntology.NAMESPACE
    + "date";
  public static final String PROP_START_TIME = HealthOntology.NAMESPACE
    + "startTime";
  public static final String PROP_DURATION = HealthOntology.NAMESPACE
    + "duration";
  public static final String PROP_PERFORMED = HealthOntology.NAMESPACE
    + "performed";
  public static final String PROP_DETAILS = HealthOntology.NAMESPACE
  + "details";


  public PlannedSession () {
    super();
  }
  
  public PlannedSession (String uri) {
    super(uri);
  }

  public PlannedSession(XMLGregorianCalendar stDt, XMLGregorianCalendar stTime, Duration duration, boolean performed){
	  this.setDate(stDt);
  }
  public String getClassURI() {
    return MY_URI;
  }
  public int getPropSerializationType(String arg0) {
	  return PROP_SERIALIZATION_FULL;
  }

  public boolean isWellFormed() {
	return true 
      && props.containsKey(PROP_DATE)
      && props.containsKey(PROP_START_TIME)
      && props.containsKey(PROP_DURATION)
      && props.containsKey(PROP_PERFORMED)
      && props.containsKey(PROP_DETAILS);
  }

  public XMLGregorianCalendar getDate() {
    return (XMLGregorianCalendar)props.get(PROP_DATE);
  }		

  public void setDate(XMLGregorianCalendar stDt) {
    if (stDt != null)
      props.put(PROP_DATE, stDt);
  }		

  public XMLGregorianCalendar getStartTime() {
    return (XMLGregorianCalendar)props.get(PROP_START_TIME);
  }		

  public void setStartTime(XMLGregorianCalendar stTime) {
    if (stTime != null)
      props.put(PROP_START_TIME, stTime);
  }		

  public Duration getDuration() {
    return (Duration)props.get(PROP_DURATION);
  }		

  public void setDuration(Duration duration) {
    if (duration != null)
      props.put(PROP_DURATION, duration);
  }		

  public PerformedSession getPerformance() {
	  return (PerformedSession)props.get(PROP_PERFORMED);
  }		

  public void setPerformance(PerformedSession performance) {
	  if (performance != null)
	      props.put(PROP_PERFORMED, performance);
  }	
  
  public String getDetails() {
	  return (String)props.get(PROP_DETAILS);
  }		

  public void setDetails(String details) {
	  if (details != null)
	      props.put(PROP_DETAILS, details);
  }	
  
  

}
