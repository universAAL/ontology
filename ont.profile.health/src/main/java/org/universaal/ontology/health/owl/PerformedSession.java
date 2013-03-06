/*******************************************************************************
 * Copyright 2012 UPM, http://www.upm.es - Universidad Politécnica de Madrid
 *
 * OCO Source Materials
 * � Copyright IBM Corp. 2011
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
import javax.xml.datatype.XMLGregorianCalendar;

import org.universAAL.middleware.owl.ManagedIndividual;

public class PerformedSession extends ManagedIndividual{

	//NAMESPACE & PROPERTIES
	  public static final String MY_URI = HealthOntology.NAMESPACE
	    + "PerformedSession";
	  //public static final String PROP_DATE = HealthOntology.NAMESPACE
	  //+ "date";
	  public static final String PROP_START_TIME = HealthOntology.NAMESPACE
	  + "sessionStartTime";
	  public static final String PROP_END_TIME = HealthOntology.NAMESPACE
	  + "sessionEndTime";
	  
	  public static final String PROP_IS_VALID = HealthOntology.NAMESPACE
	  + "isValid";
	  
	  public static final String PROP_HAS_ASSOCIATED_TREATMENT = HealthOntology.NAMESPACE
	  + "associatedTreatment";
	  
	//CONSTRUCTORS
	  public PerformedSession () {
	    super();
	  }
	  
	  public PerformedSession (String uri) {
	    super(uri);
	  }
	  
	  public PerformedSession(Treatment t, XMLGregorianCalendar stTime, XMLGregorianCalendar endTime, boolean isValid){
		  this.setAssociatedTreatment(t);
		  this.setSessionStartTime(stTime);
		  this.setSessionEndTime(endTime);
		  this.setIsValid(isValid);
	  }
	  
	  public PerformedSession(Treatment t, XMLGregorianCalendar stTime, XMLGregorianCalendar endTime){
		  this.setAssociatedTreatment(t);
		  this.setSessionStartTime(stTime);
		  this.setSessionEndTime(endTime);
	  }

	  public String getClassURI() {
	    return MY_URI;
	  }
	  public int getPropSerializationType(String arg0) {
		  return PROP_SERIALIZATION_FULL;
	  }

	  //GETTERS AND SETTERS
	  
	  /*
	  public XMLGregorianCalendar getDate() {
		  return (XMLGregorianCalendar)props.get(PROP_DATE);
	  }		

	  public void setDate(XMLGregorianCalendar date) {
		  if(date != null)
			  props.put(PROP_DATE, date);
	  }
	  */
	  public XMLGregorianCalendar getSessionStartTime() {
		  return (XMLGregorianCalendar)props.get(PROP_START_TIME);
	  }		

	  public void setSessionStartTime(XMLGregorianCalendar stT) {
		  if(stT != null)
			  props.put(PROP_START_TIME, stT);
	  }		

	  public XMLGregorianCalendar getSessionEndTime() {
		  return (XMLGregorianCalendar)props.get(PROP_END_TIME);
	  }		

	  public void setSessionEndTime(XMLGregorianCalendar stT) {
		  if(stT != null)
			  props.put(PROP_END_TIME, stT);
	  }			  
	  public boolean getIsValid() {
			Boolean b = (Boolean) props.get(PROP_IS_VALID);
			return (b == null) ? false : b.booleanValue();
	  }	
	  
	  public void setIsValid(boolean valid) {
			props.put(PROP_IS_VALID, new Boolean(valid));
	  }		

	  public Treatment getAssociatedTreatment() {
		  return (Treatment)props.get(PROP_HAS_ASSOCIATED_TREATMENT);
	  }		

	  public void setAssociatedTreatment(Treatment t) {
		  if(t != null)
			  props.put(PROP_HAS_ASSOCIATED_TREATMENT, t);
	  }		
	  
	  public boolean isWellFormed() {
		return true
		//&& props.containsKey(PROP_DATE)
		&& props.containsKey(PROP_START_TIME)
		&& props.containsKey(PROP_END_TIME)
		&& props.containsKey(PROP_IS_VALID)
		&& props.containsKey(PROP_HAS_ASSOCIATED_TREATMENT);
	  }

}
