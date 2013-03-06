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

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.universAAL.middleware.owl.ManagedIndividual;

public class TreatmentPlanning extends ManagedIndividual{

// NAMESPACE AND PROPERTIES
  public static final String MY_URI = HealthOntology.NAMESPACE
    + "TreatmentPlanning";
  public static final String PROP_RECURRENCE = HealthOntology.NAMESPACE
    + "recurrence";
  public static final String PROP_START_DATE = HealthOntology.NAMESPACE
    + "startDate";
  public static final String PROP_HAS_PLANNED_SESSIONS = HealthOntology.NAMESPACE
    + "hasSessions";
  public static final String PROP_DESCRIPTION = HealthOntology.NAMESPACE
    + "description";
  public static final String PROP_END_DATE = HealthOntology.NAMESPACE
    + "endDate";

//CONSTRUCTORS
  public TreatmentPlanning () {
    super();
  }
  
  public TreatmentPlanning (String uri) {
    super(uri);
  }
  
  public TreatmentPlanning (XMLGregorianCalendar stDt, XMLGregorianCalendar endDt, String recurrence){
	  this.setStartDate(stDt);
	  this.setEndDate(endDt);
  }

  public TreatmentPlanning(XMLGregorianCalendar startDate, XMLGregorianCalendar endDate){
	
	this.setStartDate(startDate);
	this.setEndDate(endDate);
  }
  
  public TreatmentPlanning(XMLGregorianCalendar startDate, XMLGregorianCalendar endDate, String recurrence, String description){
	this.setStartDate(startDate);
	this.setEndDate(endDate);
	this.setDescription(description);
	this.setRecurrence(recurrence);
}
  
  public String getClassURI() {
    return MY_URI;
  }
  public int getPropSerializationType(String arg0) {
	  return PROP_SERIALIZATION_FULL;
  }

  public boolean isWellFormed() {
	return true 
      && props.containsKey(PROP_RECURRENCE)
      && props.containsKey(PROP_START_DATE)
      && props.containsKey(PROP_HAS_PLANNED_SESSIONS)
      && props.containsKey(PROP_DESCRIPTION)
      && props.containsKey(PROP_END_DATE);
  }
  
//GETTERS & SETTERS

  public XMLGregorianCalendar getStartDate() {
    return (XMLGregorianCalendar)props.get(PROP_START_DATE);
  }		

  public void setStartDate(XMLGregorianCalendar stDate) {
    if (stDate != null)
      props.put(PROP_START_DATE, stDate);
  }		

  public XMLGregorianCalendar getEndDate() {
    return (XMLGregorianCalendar)props.get(PROP_END_DATE);
  }		

  public void setEndDate(XMLGregorianCalendar endDate) {
    if (endDate != null)
      props.put(PROP_END_DATE, endDate);
  }		

  public String getDescription() {
    return (String)props.get(PROP_DESCRIPTION);
  }		

  public void setDescription(String sessionDescription) {
    if (sessionDescription != null)
      props.put(PROP_DESCRIPTION, sessionDescription);
  }		

  public String getRecurrence() {
    return (String)props.get(PROP_RECURRENCE);
  }		

  public void setRecurrence(String recurrence) {
    if (recurrence != null)
      props.put(PROP_RECURRENCE, recurrence);
  }		

  public void setPlannedSession(PerformedSession[] pSession) {
		List propList = new ArrayList(pSession.length);
		for (int i = 0; i < pSession.length; i++) {
			propList.add(pSession[i]);
		}
		props.put(PROP_HAS_PLANNED_SESSIONS, propList);
	}

	public void addPlannedSession(PlannedSession pSession) {
		Object propList = props.get(PROP_HAS_PLANNED_SESSIONS);
		if (propList instanceof List) {
			List list = (List) propList;
			list.add(pSession);
			props.put(PROP_HAS_PLANNED_SESSIONS, list);
		} else if (propList == null) {
			props.put(PROP_HAS_PLANNED_SESSIONS, pSession);
		} else {
			List list = new ArrayList();
			list.add((PlannedSession) propList);
			list.add(pSession);
			props.put(PROP_HAS_PLANNED_SESSIONS, list);
		}
	}
	
	 public PlannedSession[] getPerformedSession() {
		    Object propList = getProperty(PROP_HAS_PLANNED_SESSIONS);
		    if (propList instanceof List)
		      return (PlannedSession[]) ((List) propList).toArray(new PlannedSession[0]);
		    else if (propList != null)
		      return new PlannedSession[] {(PlannedSession)propList}; // Handle special case of a single item not contained in a list
		    return new PlannedSession[0];
		  }
	 
//OTHER METHODS
}
