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
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.profile.AssistedPersonProfile;
import org.universAAL.ontology.profile.Caregiver;
import org.universaal.ontology.disease.owl.Disease;

public abstract class Treatment extends ManagedIndividual {

	// NAMESPACE AND PROPERTIES

	public static final String MY_URI = HealthOntology.NAMESPACE
	+ "Treatment";
	public static final String PROP_NAME = HealthOntology.NAMESPACE
	+ "name";
	public static final String PROP_COMPLETENESS = HealthOntology.NAMESPACE
	+ "completeness";
	public static final String PROP_STATUS = HealthOntology.NAMESPACE
	+ "status";

	public static final String PROP_HAS_TREATMENT_PLANNING = HealthOntology.NAMESPACE
	+ "hasTreatmentPlanning";
	public static final String PROP_IS_PRESCRIBED_BY_CAREGIVER = HealthOntology.NAMESPACE
	+ "hasCaregiver";
	public static final String PROP_MOTIVATIONAL_STATUS = HealthOntology.NAMESPACE
	+ "motivationalStatus";
	public static final String PROP_HAS_PRIVACY = HealthOntology.NAMESPACE
	+ "hasPrivacy";
	public static final String PROP_DESCRIPTION = HealthOntology.NAMESPACE
	+ "description";
	public static final String PROP_MEASUREMENT_REQUIREMENTS = HealthOntology.NAMESPACE
	+ "measurementRequirements";

	public static final String PROP_HAS_PERFORMED_SESSION = HealthOntology.NAMESPACE
	+ "hasPerformedSession";

	public static final String PROP_IS_ASSOCIATED_TO_DISEASE = HealthOntology.NAMESPACE
	+ "isAssociatedToADisease";


	public float completenessUnit = 0;

	// CONSTRUCTORS
	public Treatment () {
		super();
	}

	public Treatment (String uri) {
		super(uri);
	}

	public Treatment(AssistedPersonProfile assistedPerson, Caregiver caregiver, String tname, String description, XMLGregorianCalendar stDt, String diseaseURI ){
		//super(assistedPerson + "." + name);
		this.setName(tname);
		this.setCaregiver(caregiver);
		this.setCompleteness(0);
		this.setMotivationalStatus(MotivationalStatusType.precontemplation); //until the treatment is not accepted by the user, it remains in precontemplation status
		this.checkStatus(stDt); // depending on the date, the treatment will be actived or planned
		this.setAssociatedDisease(diseaseURI);
	}

	public Treatment(AssistedPersonProfile assistedPerson, Caregiver caregiver, String tname, TreatmentPlanning tp, String description, String diseaseURI){
		//super(assistedPerson + "." + name);
		this.setName(tname);
		this.setCaregiver(caregiver);
		this.setCompleteness(0);
		this.setTreatmentPlanning(tp);
		this.setMotivationalStatus(MotivationalStatusType.precontemplation); //until the treatment is not accepted by the user, it remains in precontemplation status
		this.checkStatus(tp.getStartDate()); // depending on the date, the treatment will be actived or planned
		this.setAssociatedDisease(diseaseURI);
	}

	public Treatment(String tname, String description, String diseaseURI){
		//super(assistedPerson + "." + name);
		this.setName(tname);
		this.setDescription(description);
		this.setCompleteness(0);
		this.setMotivationalStatus(MotivationalStatusType.precontemplation); //until the treatment is not accepted by the user, it remains in precontemplation status
		this.checkStatus(); // depending on the date, the treatment will be actived or planned
		this.setAssociatedDisease(diseaseURI);
	}

	public Treatment(String tname, String description, XMLGregorianCalendar stDt, String diseaseURI){
		//super(assistedPerson + "." + name);
		this.setName(tname);
		this.setCompleteness(0);
		this.setMotivationalStatus(MotivationalStatusType.precontemplation); //until the treatment is not accepted by the user, it remains in precontemplation status
		this.checkStatus(stDt); // depending on the date, the treatment will be actived or planned
		this.setAssociatedDisease(diseaseURI);
	}

	public Treatment(String tname, String description, TreatmentPlanning tp, String diseaseURI){
		//super(assistedPerson + "." + name);
		this.setName(tname);
		this.setCompleteness(0);
		this.setMotivationalStatus(MotivationalStatusType.precontemplation); //until the treatment is not accepted by the user, it remains in precontemplation status
		this.checkStatus(); // depending on the date, the treatment will be actived or planned
		this.setAssociatedDisease(diseaseURI);
		this.setTreatmentPlanning(tp);
	}

	public String getClassURI() {
		return MY_URI;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return true 
		&& props.containsKey(PROP_NAME)
		&& props.containsKey(PROP_COMPLETENESS)
		&& props.containsKey(PROP_STATUS)
		&& props.containsKey(PROP_HAS_TREATMENT_PLANNING)
		&& props.containsKey(PROP_IS_PRESCRIBED_BY_CAREGIVER)
		&& props.containsKey(PROP_MOTIVATIONAL_STATUS)
		&& props.containsKey(PROP_HAS_PRIVACY)
		&& props.containsKey(PROP_DESCRIPTION)
		&& props.containsKey(PROP_MEASUREMENT_REQUIREMENTS)
		&& props.containsKey(PROP_HAS_PERFORMED_SESSION)
		&& props.containsKey(PROP_IS_ASSOCIATED_TO_DISEASE);
	}

	//GETTERS & SETTERS

	public String getName() {
		return (String)props.get(PROP_NAME);
	}		

	public void setName(String treatmentName) {
		if (treatmentName != null)
			props.put(PROP_NAME, treatmentName);
	}		

	public float getCompleteness() {
		Float i = (Float) props.get(PROP_COMPLETENESS);
		return (i == null) ? 0 : i.intValue();
	}		

	public void setCompleteness(float completeness) {
		props.put(PROP_COMPLETENESS, new Float(completeness));
	}		

	public StatusType getStatus() {
		return (StatusType)props.get(PROP_STATUS);
	}		

	public void setStatus(StatusType status) {
		if (status != null)
			props.put(PROP_STATUS, status);
	}		

	public MotivationalStatusType getMotivationalStatus() {
		return (MotivationalStatusType)props.get(PROP_MOTIVATIONAL_STATUS);
	}		

	public void setMotivationalStatus(MotivationalStatusType motStatus) {
		if (motStatus != null)
			props.put(PROP_MOTIVATIONAL_STATUS, motStatus);
	}		

	public String getDescription() {
		return (String)props.get(PROP_DESCRIPTION);
	}		

	public void setDescription(String treatmentDescription) {
		if (treatmentDescription != null)
			props.put(PROP_DESCRIPTION, treatmentDescription);
	}		

	public TreatmentPlanning getTreatmentPlanning() {
		return (TreatmentPlanning)props.get(PROP_HAS_TREATMENT_PLANNING);
	}		

	public void setTreatmentPlanning(TreatmentPlanning treatmentPlanning) {
		if (treatmentPlanning != null)
			props.put(PROP_HAS_TREATMENT_PLANNING, treatmentPlanning);
	}		

	public Caregiver getCaregiver() {
		return (Caregiver)props.get(PROP_IS_PRESCRIBED_BY_CAREGIVER);
	}		

	public void setCaregiver(Caregiver caregiver) {
		if (caregiver != null)
			props.put(PROP_IS_PRESCRIBED_BY_CAREGIVER, caregiver);
	}	

	public String getAssociatedDiseaseURI() {
		return (String)props.get(PROP_IS_ASSOCIATED_TO_DISEASE);
	}		

	public void setAssociatedDisease(String diseaseURI) {
		if (diseaseURI != null)
			props.put(PROP_IS_ASSOCIATED_TO_DISEASE, diseaseURI);
	}	

	/*
  public Privacy getPrivacy() {
    return (Privacy)props.get(PROP_HAS_PRIVACY);
  }		

  public void setPrivacy(Privacy privacy) {
    if (privacy != null)
      props.put(PROP_HAS_PRIVACY, privacy);
  }		
	 */
	public MeasurementRequirements getMeasurementRequirements() {
		return (MeasurementRequirements) props.get(PROP_MEASUREMENT_REQUIREMENTS);
	}		

	public void setMeasurementRequirements(MeasurementRequirements mr) {
		if (mr != null)
			props.put(PROP_MEASUREMENT_REQUIREMENTS, mr);
	}		

	public void setPerformedSessions(PerformedSession[] pSession) {
		List propList = new ArrayList(pSession.length);
		for (int i = 0; i < pSession.length; i++) {
			propList.add(pSession[i]);
		}
		props.put(PROP_HAS_PERFORMED_SESSION, propList);
	}

	public void addPerformedSession(PerformedSession pSession) {
		Object propList = props.get(PROP_HAS_PERFORMED_SESSION);
		if (propList instanceof List) {
			List list = (List) propList;
			list.add(pSession);
			props.put(PROP_HAS_PERFORMED_SESSION, list);
		} else if (propList == null) {
			props.put(PROP_HAS_PERFORMED_SESSION, pSession);
		} else {
			List list = new ArrayList();
			list.add((PerformedSession) propList);
			list.add(pSession);
			props.put(PROP_HAS_PERFORMED_SESSION, list);
		}
	}

	public PerformedSession[] getPerformedSessions() {
		Object propList = getProperty(PROP_HAS_PERFORMED_SESSION);
		if (propList instanceof List)
			return (PerformedSession[]) ((List) propList).toArray(new PerformedSession[0]);
		else if (propList != null)
			return new PerformedSession[] {(PerformedSession)propList}; // Handle special case of a single item not contained in a list
		return new PerformedSession[0];
	}


	// OTHER METHODS

	/**
	 * This method checks if the start date of the treatment has passed or not, so as
	 * to establish the treatment status (planned or actived)
	 * @param void
	 * @return void  
	 */

	public void checkStatus(XMLGregorianCalendar stDate){
		GregorianCalendar cDate = new GregorianCalendar();
		try{
			XMLGregorianCalendar currentDate = (DatatypeFactory.newInstance()).newXMLGregorianCalendar(cDate);

			if (currentDate.compare(stDate)== DatatypeConstants.GREATER || currentDate.compare(stDate)==DatatypeConstants.EQUAL)
				this.setStatus(StatusType.actived);
			else
				this.setStatus(StatusType.planned);
		}catch(Exception e){}
	}
	
	public void checkStatus(){
		this.setStatus(StatusType.actived);
		//si no se proporciona una fecha de inicio se toma la actual como inicio
		//por tanto el tratamiento se activa automáticamente.
	}
	
	/**
	 * This method checks if the start date of the treatment has passed or not, so as
	 * to establish the treatment status (planned or actived)
	 * @param void
	 * @return void  
	 */
	public boolean isActived(){
		if(this.getStatus()==StatusType.actived)
			return true;
		else
			return false;
	}

	/**
	 * The following method checks if the treatment is planned, that is if the current date is after the
	 * start date.
	 * @param void
	 * @return isPlanned (boolean)  
	 */
	public boolean isPlanned(){
		if(this.getStatus()==StatusType.planned)
			return true;
		else
			return false;
	}

	/**
	 * The following method checks if the treatment has been cancelled
	 * @param void
	 * @return isCancelled (boolean)  
	 */
	public boolean isCancelled(){
		if(this.getStatus()==StatusType.cancelled)
			return true;
		else
			return false;
	}
	
	/**
	 * The following method checks if the treatment is finished, that is if the current date is 
	 * after the end date.
	 * @param void
	 * @return isFinished (boolean)  
	 */
	public boolean isFinished(){
		if(this.getStatus()==StatusType.finished)
			return true;
		else
			return false;
	}

	/**
	 * The following method changes the treatment status to "cancelled".
	 * @param void
	 * @return void
	 */
	public void cancelTreatment(){
		this.setStatus(StatusType.cancelled);
	}

	/**
	 * The following method changes the treatment status to "planned".
	 * @param void
	 * @return void
	 */
	public void changeToPlanned(){
		this.setStatus(StatusType.planned);
	}
	/**
	 * The following method changes the treatment status to "actived".
	 * @param void
	 * @return void
	 */
	public void changeToActived(){
		this.setStatus(StatusType.actived);
	}
	/**
	 * The following method changes the treatment status to "finished".
	 * @param void
	 * @return void
	 */
	public void changeToFinished(){
		this.setStatus(StatusType.finished);
	}

	/**
	 * The following method initializes the treatment planning
	 * @param void
	 * @return void
	 */
	public void inicializateTP(XMLGregorianCalendar stDt, XMLGregorianCalendar endDt){
		TreatmentPlanning tp = new TreatmentPlanning(stDt, endDt);
		this.setTreatmentPlanning(tp);

	}

	public boolean hasMeasurementRequirements(){
		if(getMeasurementRequirements()!=null)
			return true;
		else
			return false;
	}

	public void setCompletenessUnit(float unit){
		completenessUnit=unit;
	}

	public float getCompletenessUnit(){
		return completenessUnit;
	}

}
