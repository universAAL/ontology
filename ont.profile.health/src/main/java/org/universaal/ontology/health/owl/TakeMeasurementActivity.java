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

import javax.xml.datatype.XMLGregorianCalendar;

import org.universAAL.ontology.profile.AssistedPersonProfile;
import org.universAAL.ontology.profile.Caregiver;
import org.universaal.ontology.disease.owl.Disease;

public class TakeMeasurementActivity extends Treatment {

//NAMESPACE & PROPERTIES
  public static final String MY_URI = HealthOntology.NAMESPACE
    + "TakeMeasurementActivity";
  public static final String PROP_HAS_MEASUREMENT_REQUIREMENTS = HealthOntology.NAMESPACE
    + "hasMeasurementRequirements";

//CONSTRUCTORS
  public TakeMeasurementActivity () {
    super();
  }
  
  public TakeMeasurementActivity (String uri) {
    super(uri);
  }
  
  public TakeMeasurementActivity ( AssistedPersonProfile assistedPerson, Caregiver caregiver, String tname, String description, XMLGregorianCalendar stDt, String diseaseURI){
	  super(assistedPerson, caregiver, tname, description, stDt, diseaseURI);
  }
  
  public TakeMeasurementActivity (AssistedPersonProfile assistedPerson, Caregiver caregiver, String tname, TreatmentPlanning tp, String description, String diseaseURI){
	  super(assistedPerson, caregiver, tname, tp, description, diseaseURI);
  }
  
  public TakeMeasurementActivity (String tname, String description, String diseaseURI){
	  super(tname, description,diseaseURI);
  }
  
  public TakeMeasurementActivity(String tname, String description, XMLGregorianCalendar stDt, String diseaseURI){
	  super(tname, description,stDt, diseaseURI);
  }
  
  public TakeMeasurementActivity(String tname, String description, TreatmentPlanning tp, String diseaseURI){
	  super(tname, description, tp, diseaseURI);
  }
  
  public String getClassURI() {
    return MY_URI;
  }
  public int getPropSerializationType(String arg0) {
	  return PROP_SERIALIZATION_FULL;
  }

  public boolean isWellFormed() {
	return true 
      && props.containsKey(PROP_HAS_MEASUREMENT_REQUIREMENTS);
  }
  
  //GETTERS & SETTERS

  public MeasurementRequirements getHasMeasurementRequirements() {
    return (MeasurementRequirements)props.get(PROP_HAS_MEASUREMENT_REQUIREMENTS);
  }		

  public void setHasMeasurementRequirements(MeasurementRequirements newPropValue) {
    if (newPropValue != null)
      props.put(PROP_HAS_MEASUREMENT_REQUIREMENTS, newPropValue);
  }		
}
