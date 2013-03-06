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

//import net.fortuna.ical4j.model.Date;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.middleware.ui.owl.UIBusOntology;
import org.universAAL.middleware.ui.rdf.Form;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.profile.AssistedPerson;
import org.universAAL.ontology.profile.AssistedPersonProfile;
import org.universAAL.ontology.profile.Caregiver;
import org.universAAL.ontology.profile.Gender;
import org.universAAL.ontology.profile.Profile;
import org.universAAL.ontology.profile.ProfileOntology;
import org.universAAL.ontology.profile.SubProfile;
import org.universaal.ontology.disease.owl.Disease;
import org.universaal.ontology.disease.owl.DiseaseOntology;
import org.universaal.ontology.health.HealthOntologyFactory;
import org.universaal.ontology.health.owl.services.DisplayTreatmentService;
import org.universaal.ontology.health.owl.services.HealthService;
import org.universaal.ontology.health.owl.services.PerformedSessionManagementService;
import org.universaal.ontology.health.owl.services.PlannedSessionManagementService;
import org.universaal.ontology.health.owl.services.ProfileManagementService;
import org.universaal.ontology.health.owl.services.TreatmentManagementService;
import org.universaal.ontology.healthmeasurement.owl.BloodPressure;
import org.universaal.ontology.healthmeasurement.owl.HealthMeasurement;
import org.universaal.ontology.healthmeasurement.owl.HealthMeasurementOntology;
import org.universaal.ontology.healthmeasurement.owl.HeartRate;
import org.universaal.ontology.healthmeasurement.owl.PersonWeight;

/**
 * @author AAL Studio 
 */
public final class HealthOntology extends Ontology {

  private static HealthOntologyFactory factory = new HealthOntologyFactory();
  public static final String NAMESPACE ="http://health.ontology.universaal.org/HealthOntology#";
  
  public static final String PROP_HAS_HEALTH_PROFILE = HealthOntology.NAMESPACE
  + "hasHealthProfile";
  public static final String PROP_PRESCRIBES_TREATMENT = HealthOntology.NAMESPACE
  + "prescribesTreatment";
private static final String DISEASE_PROP_DIAGNOSE_DATE = HealthOntology.NAMESPACE + "diagnoseDate";
private static final String DISEASE_PROP_DISCHARGE_DATE = HealthOntology.NAMESPACE + "dischargeDate";
  
  public HealthOntology() {
    super(NAMESPACE);
  }

  public void create() {
    Resource r = getInfo();
    r.setResourceComment("The ontology defining the health service, based on the treatment concept.");
    r.setResourceLabel("HealthOntology");
    addImport(DataRepOntology.NAMESPACE);
    addImport(ServiceBusOntology.NAMESPACE);
    addImport(LocationOntology.NAMESPACE);
    addImport(ProfileOntology.NAMESPACE);
    addImport(HealthMeasurementOntology.NAMESPACE);
    addImport(DiseaseOntology.NAMESPACE);
    addImport(UIBusOntology.NAMESPACE);
   
	OntClassInfoSetup oci;
	OntClassInfoSetup oci_treatment;

    // ******* Enumeration classes of the ontology ******* //

    // load StatusType
    oci = createNewAbstractOntClassInfo(StatusType.MY_URI);
    oci.setResourceComment("This class defines the types of possible status of the treatment: planned, actived, finished or cancelled.");
    oci.setResourceLabel("StatusType");
    oci.toEnumeration(new ManagedIndividual[] {
       StatusType.planned, StatusType.actived, StatusType.finished, StatusType.cancelled, StatusType.prolonged });

    // load MotivationalStatusType
    oci = createNewAbstractOntClassInfo(MotivationalStatusType.MY_URI);
    oci.setResourceComment("This class defines the types of motivational status of the treatment: precontemplation, contemplation, action or maintenance.");
    oci.setResourceLabel("MotivationalStatusType");
    oci.toEnumeration(new ManagedIndividual[] {
       MotivationalStatusType.precontemplation, MotivationalStatusType.contemplation, MotivationalStatusType.action, MotivationalStatusType.maintenance, MotivationalStatusType.undefined });


    // ******* Regular classes of the ontology ******* //

    //load PlannedSession 
    oci = createNewOntClassInfo(PlannedSession.MY_URI, factory, 4);
    oci.setResourceComment("A planned session is a session that has been schedule so as to perform an assigned activity.");
    oci.setResourceLabel("PlannedSession");
    
    oci.addDatatypeProperty(PlannedSession.PROP_DATE).setFunctional();
    oci.addRestriction(MergedRestriction 
    		.getAllValuesRestrictionWithCardinality(PlannedSession.PROP_DATE, 
    		TypeMapper.getDatatypeURI(XMLGregorianCalendar.class), 1, 1));
    
    oci.addDatatypeProperty(PlannedSession.PROP_START_TIME).setFunctional();
    oci.addRestriction(MergedRestriction 
    		.getAllValuesRestrictionWithCardinality(PlannedSession.PROP_START_TIME, 
    		TypeMapper.getDatatypeURI(XMLGregorianCalendar.class), 1, 1));
    
    oci.addDatatypeProperty(PlannedSession.PROP_DURATION).setFunctional();
    //oci.addRestriction(MergedRestriction.getCardinalityRestriction(PlannedSession.PROP_DURATION, 1, 1));
    oci.addRestriction(MergedRestriction 
    		.getAllValuesRestrictionWithCardinality(PlannedSession.PROP_DURATION, 
    		TypeMapper.getDatatypeURI(Duration.class), 1, 1));
    
    oci.addDatatypeProperty(PlannedSession.PROP_DETAILS);
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(PlannedSession.PROP_DETAILS, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    
    OntClassInfoSetup oci2 = oci;
    
    //load PerformedSession
    oci = createNewOntClassInfo(PerformedSession.MY_URI, factory, 13);
    oci.setResourceComment("A performed session is a session that has been performed.");
    oci.setResourceLabel("PerformedSession");
    
    //- property from planned session
    oci2.addObjectProperty(PlannedSession.PROP_PERFORMED).setFunctional();
    oci2.addRestriction(MergedRestriction 
    		.getAllValuesRestrictionWithCardinality(PlannedSession.PROP_PERFORMED, 
    		PerformedSession.MY_URI, 0, 1));    
    
    //- back to performedSession
    /*oci.addDatatypeProperty(PerformedSession.PROP_DATE).setFunctional();
    oci.addRestriction(MergedRestriction 
    		.getAllValuesRestrictionWithCardinality(PerformedSession.PROP_DATE, 
    		TypeMapper.getDatatypeURI(XMLGregorianCalendar.class), 1, 1));
    */
    oci.addDatatypeProperty(PerformedSession.PROP_START_TIME).setFunctional();
    oci.addRestriction(MergedRestriction 
    		.getAllValuesRestrictionWithCardinality(PerformedSession.PROP_START_TIME, 
    		TypeMapper.getDatatypeURI(XMLGregorianCalendar.class), 1, 1));
    
    oci.addDatatypeProperty(PerformedSession.PROP_END_TIME).setFunctional();
    //oci.addRestriction(MergedRestriction.getCardinalityRestriction(PerformedSession.PROP_DURATION, 1, 1));
    oci.addRestriction(MergedRestriction 
    		.getAllValuesRestrictionWithCardinality(PerformedSession.PROP_END_TIME, 
    		TypeMapper.getDatatypeURI(XMLGregorianCalendar.class), 1, 1));
    
    oci.addDatatypeProperty(PerformedSession.PROP_IS_VALID).setFunctional();
    oci.addRestriction(MergedRestriction 
    		.getAllValuesRestrictionWithCardinality(PerformedSession.PROP_IS_VALID, 
    		TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
    
  //load TreatmentPlanning 
    oci = createNewOntClassInfo(TreatmentPlanning.MY_URI, factory, 9);
    oci.setResourceComment("This class describes the planning of the sessions that composes the treatment.");
    oci.setResourceLabel("TreatmentPlanning");
    
    oci.addDatatypeProperty(TreatmentPlanning.PROP_RECURRENCE).setFunctional();
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(TreatmentPlanning.PROP_RECURRENCE, 
      TypeMapper.getDatatypeURI(String.class), 0, 1));
    
    oci.addObjectProperty(TreatmentPlanning.PROP_START_DATE).setFunctional();
    oci.addRestriction(MergedRestriction 
    		.getAllValuesRestrictionWithCardinality(TreatmentPlanning.PROP_START_DATE, 
    		TypeMapper.getDatatypeURI(XMLGregorianCalendar.class), 1, 1));
    
    oci.addObjectProperty(TreatmentPlanning.PROP_END_DATE).setFunctional();
    oci.addRestriction(MergedRestriction 
    		.getAllValuesRestrictionWithCardinality(TreatmentPlanning.PROP_END_DATE, 
    		TypeMapper.getDatatypeURI(XMLGregorianCalendar.class), 0, 1));
    
    oci.addObjectProperty(TreatmentPlanning.PROP_HAS_PLANNED_SESSIONS).setFunctional();
  	oci.addRestriction(MergedRestriction.getAllValuesRestriction(TreatmentPlanning.PROP_HAS_PLANNED_SESSIONS,  
  			PlannedSession.MY_URI));
  	
    oci.addDatatypeProperty(TreatmentPlanning.PROP_DESCRIPTION);
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(TreatmentPlanning.PROP_DESCRIPTION, 
      TypeMapper.getDatatypeURI(String.class), 0, 1));
    
   
    //load PerformedSession
    oci = createNewOntClassInfo(PerformedSession.MY_URI, factory, 13);
    oci.setResourceComment("This class describes a session that has been performed.");
    oci.setResourceLabel("PerformedSession");
    
    
    //load PerformedMeasurementSession
    oci = createNewOntClassInfo(PerformedMeasurementSession.MY_URI, factory, 5);
    oci.setResourceComment("This class describes a session with a health measurement involved that has been performed.");
    oci.setResourceLabel("PerformedSession");
    
    oci.addObjectProperty(PerformedMeasurementSession.PROP_HAS_HEALTH_MEASUREMENT).setFunctional();
    oci.addRestriction(MergedRestriction
    	      .getAllValuesRestrictionWithCardinality(PerformedMeasurementSession.PROP_HAS_HEALTH_MEASUREMENT, 
    	      HealthMeasurement.MY_URI, 1, 1));
    
  //load Privacy 
    /*
    oci = createNewOntClassInfo(Privacy.MY_URI, factory, 12);
    oci.setResourceComment("This class describes the concept of privacy, that is who has access to the treatment information of a especific assisted person.");
    oci.setResourceLabel("Privacy");
    */
    
    
    //load MeasurementRequirements 
    oci = createNewOntClassInfo(MeasurementRequirements.MY_URI, factory, 2);
    oci.setResourceComment("This concept involves all the measurement types that are required in a treatment.");
    oci.setResourceLabel("MeasurementRequirements");
    
    oci.addDatatypeProperty(MeasurementRequirements.PROP_MAX_VALUE_ALLOWED);
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(MeasurementRequirements.PROP_MAX_VALUE_ALLOWED, 
      TypeMapper.getDatatypeURI(Integer.class), 0, 1));
    
    oci.addDatatypeProperty(MeasurementRequirements.PROP_MIN_VALUE_ALLOWED);
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(MeasurementRequirements.PROP_MIN_VALUE_ALLOWED, 
      TypeMapper.getDatatypeURI(Integer.class), 0, 1));
    
    
  //load WeightRequirement 
    oci = createNewOntClassInfo(WeightRequirement.MY_URI, factory, 3);
    oci.setResourceComment("This class describes a weight measurement requirement.");
    oci.setResourceLabel("WeightMeasurement");
    oci.addSuperClass(MeasurementRequirements.MY_URI); 

    oci.addDatatypeProperty(WeightRequirement.PROP_MIN_VALUE_ALLOWED)
    .addSuperProperty(MeasurementRequirements.PROP_MIN_VALUE_ALLOWED);
    oci.addRestriction(MergedRestriction
    		.getAllValuesRestrictionWithCardinality(WeightRequirement.PROP_MIN_VALUE_ALLOWED, 
    				PersonWeight.MY_URI, 1, 1));

    oci.addDatatypeProperty(WeightRequirement.PROP_MAX_VALUE_ALLOWED)
    .addSuperProperty(MeasurementRequirements.PROP_MAX_VALUE_ALLOWED);
    oci.addRestriction(MergedRestriction
    		.getAllValuesRestrictionWithCardinality(WeightRequirement.PROP_MAX_VALUE_ALLOWED, 
    				PersonWeight.MY_URI, 1, 1));
    
    
    //load BloodPressureRequirement 
    oci = createNewOntClassInfo(BloodPressureRequirement.MY_URI, factory, 0);
    oci.setResourceComment("This class describes a blood pressure measurement requirement.");
    oci.setResourceLabel("BloodPressureMeasurement");
    oci.addSuperClass(MeasurementRequirements.MY_URI); 
    
    
    //load DiastolicBloodPressureRequirement
    oci = createNewOntClassInfo(DiastolicBloodPressureRequirement.MY_URI, factory, 14);
    oci.setResourceComment("This class describes a diastolic blood pressure measurement requirement.");
    oci.setResourceLabel("DiastolicBloodPressureRequirement");
    oci.addSuperClass(BloodPressureRequirement.MY_URI);
    
    
    oci.addDatatypeProperty(DiastolicBloodPressureRequirement.PROP_MAX_VALUE_ALLOWED)
    .addSuperProperty(MeasurementRequirements.PROP_MAX_VALUE_ALLOWED);
    oci.addRestriction(MergedRestriction
    		.getAllValuesRestrictionWithCardinality(DiastolicBloodPressureRequirement.PROP_MAX_VALUE_ALLOWED, 
    				BloodPressure.MY_URI, 1, 1));
    
    oci.addDatatypeProperty(DiastolicBloodPressureRequirement.PROP_MIN_VALUE_ALLOWED)
    .addSuperProperty(MeasurementRequirements.PROP_MIN_VALUE_ALLOWED);
    oci.addRestriction(MergedRestriction
    		.getAllValuesRestrictionWithCardinality(DiastolicBloodPressureRequirement.PROP_MIN_VALUE_ALLOWED, 
    				BloodPressure.MY_URI, 1, 1));
    
    //load SystolicBloodPressureRequirement
    oci = createNewOntClassInfo(SystolicBloodPressureRequirement.MY_URI, factory, 15);
    oci.setResourceComment("This class describes a systolic blood pressure measurement requirement.");
    oci.setResourceLabel("SystolicBloodPressureRequirement");
    oci.addSuperClass(BloodPressureRequirement.MY_URI);
    
    oci.addDatatypeProperty(SystolicBloodPressureRequirement.PROP_MIN_VALUE_ALLOWED)
    .addSuperProperty(MeasurementRequirements.PROP_MIN_VALUE_ALLOWED);
    oci.addRestriction(MergedRestriction
    		.getAllValuesRestrictionWithCardinality(SystolicBloodPressureRequirement.PROP_MIN_VALUE_ALLOWED, 
    				BloodPressure.MY_URI, 1, 1));
    oci.addDatatypeProperty(SystolicBloodPressureRequirement.PROP_MAX_VALUE_ALLOWED)
    .addSuperProperty(MeasurementRequirements.PROP_MAX_VALUE_ALLOWED);
    oci.addRestriction(MergedRestriction
    		.getAllValuesRestrictionWithCardinality(SystolicBloodPressureRequirement.PROP_MAX_VALUE_ALLOWED, 
    				BloodPressure.MY_URI, 1, 1));
    
    //load HeartRateRequirement 
    oci = createNewOntClassInfo(HeartRateRequirement.MY_URI, factory, 6);
    oci.setResourceComment("This class describes a heart rate measurement requirement.");
    oci.setResourceLabel("HeartRateRequirement");
    oci.addSuperClass(MeasurementRequirements.MY_URI); 
    
    //load ActivityHeartRateRequirement
    oci = createNewOntClassInfo(ActivityHeartRateRequirement.MY_URI, factory, 16);
    oci.setResourceComment("This class describes a heart rate measurement requirement during the activity.");
    oci.setResourceLabel("HeartRateRequirement");
    oci.addSuperClass(HeartRateRequirement.MY_URI); 
    
    oci.addDatatypeProperty(ActivityHeartRateRequirement.PROP_MIN_VALUE_ALLOWED)
    .addSuperProperty(MeasurementRequirements.PROP_MIN_VALUE_ALLOWED);
    oci.addRestriction(MergedRestriction
    		.getAllValuesRestrictionWithCardinality(ActivityHeartRateRequirement.PROP_MIN_VALUE_ALLOWED, 
    				HeartRate.MY_URI, 1, 1));

    oci.addDatatypeProperty(ActivityHeartRateRequirement.PROP_MAX_VALUE_ALLOWED)
    .addSuperProperty(MeasurementRequirements.PROP_MAX_VALUE_ALLOWED);
    oci.addRestriction(MergedRestriction
    		.getAllValuesRestrictionWithCardinality(ActivityHeartRateRequirement.PROP_MAX_VALUE_ALLOWED, 
    				HeartRate.MY_URI, 1, 1));
    
  //load ReposeHeartRateRequirement
    oci = createNewOntClassInfo(ReposeHeartRateRequirement.MY_URI, factory, 17);
    oci.setResourceComment("This class describes a reposed heart rate measurement requirement.");
    oci.setResourceLabel("HeartRateMeasurement");
    oci.addSuperClass(HeartRateRequirement.MY_URI); 
    
    
    oci.addDatatypeProperty(ReposeHeartRateRequirement.PROP_MIN_VALUE_ALLOWED)
    .addSuperProperty(MeasurementRequirements.PROP_MIN_VALUE_ALLOWED);
    oci.addRestriction(MergedRestriction
    		.getAllValuesRestrictionWithCardinality(ReposeHeartRateRequirement.PROP_MIN_VALUE_ALLOWED, 
    				HeartRate.MY_URI, 1, 1));

    oci.addDatatypeProperty(ReposeHeartRateRequirement.PROP_MAX_VALUE_ALLOWED)
    .addSuperProperty(MeasurementRequirements.PROP_MAX_VALUE_ALLOWED);
    oci.addRestriction(MergedRestriction
    		.getAllValuesRestrictionWithCardinality(ReposeHeartRateRequirement.PROP_MAX_VALUE_ALLOWED, 
    				HeartRate.MY_URI, 1, 1));

    
    //load Treatment 
    oci_treatment = createNewAbstractOntClassInfo(Treatment.MY_URI);
    oci_treatment.setResourceComment("This class describes the concept of treatment, that is the set of activities that an assisted person is suggested to do.");
    oci_treatment.setResourceLabel("Treatment");
    oci_treatment.addSuperClass(ManagedIndividual.MY_URI); 
    
    oci_treatment.addDatatypeProperty(Treatment.PROP_NAME);
    oci_treatment.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Treatment.PROP_NAME, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    
    oci_treatment.addDatatypeProperty(Treatment.PROP_COMPLETENESS);
    oci_treatment.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Treatment.PROP_COMPLETENESS, 
      TypeMapper.getDatatypeURI(Float.class), 1, 1));
    
    oci_treatment.addDatatypeProperty(Treatment.PROP_STATUS);
    oci_treatment.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Treatment.PROP_STATUS, 
      StatusType.MY_URI, 1, 1));
/*    
    oci2 = extendExistingOntClassInfo(Illness.MY_URI);
    */
   oci_treatment.addObjectProperty(Treatment.PROP_IS_ASSOCIATED_TO_DISEASE).setFunctional();
    oci_treatment.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Treatment.PROP_IS_ASSOCIATED_TO_DISEASE, 
    		  TypeMapper.getDatatypeURI(String.class), 1, 1));
   
    oci_treatment.addObjectProperty(Treatment.PROP_HAS_TREATMENT_PLANNING).setFunctional();
    oci_treatment.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Treatment.PROP_HAS_TREATMENT_PLANNING, 
      TreatmentPlanning.MY_URI, 1, 1));
    
    oci_treatment.addObjectProperty(Treatment.PROP_IS_PRESCRIBED_BY_CAREGIVER).setFunctional();
    oci_treatment.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Treatment.PROP_IS_PRESCRIBED_BY_CAREGIVER, 
    		  Caregiver.MY_URI, 1, 1));
    
    oci_treatment.addDatatypeProperty(Treatment.PROP_MOTIVATIONAL_STATUS);
    oci_treatment.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Treatment.PROP_MOTIVATIONAL_STATUS, 
      MotivationalStatusType.MY_URI, 1, 1));
    /*
    oci.addObjectProperty(Treatment.PROP_HAS_PRIVACY).setFunctional();
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Treatment.PROP_HAS_PRIVACY, 
      Privacy.MY_URI, 1, 1));
    */
    oci_treatment.addDatatypeProperty(Treatment.PROP_DESCRIPTION);
    oci_treatment.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Treatment.PROP_DESCRIPTION, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    
    oci_treatment.addObjectProperty(Treatment.PROP_MEASUREMENT_REQUIREMENTS);
    oci_treatment.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Treatment.PROP_MEASUREMENT_REQUIREMENTS, 
      MeasurementRequirements.MY_URI, 0, 1));
    
    oci_treatment.addObjectProperty(Treatment.PROP_HAS_PERFORMED_SESSION);
    oci_treatment.addRestriction(MergedRestriction
      .getAllValuesRestriction(Treatment.PROP_HAS_PERFORMED_SESSION, 
      PerformedSession.MY_URI));
    
  //load HealthyHabitsAdoption 
    oci = createNewAbstractOntClassInfo(HealthyHabitsAdoption.MY_URI);
    oci.setResourceComment("This concept describes all the activities that can be considered as healthy habits");
    oci.setResourceLabel("HealthyHabitsAdoption");
    oci.addSuperClass(Treatment.MY_URI);
    
    // load Walking 
    oci = createNewOntClassInfo(Walking.MY_URI, factory, 34);
    oci.setResourceComment("This concept describes all the activities that can be considered as healthy habits");
    oci.setResourceLabel("Walking");
    oci.addSuperClass(HealthyHabitsAdoption.MY_URI);
    
    //load TakeMeasurementActivity 
    oci = createNewOntClassInfo(TakeMeasurementActivity.MY_URI, factory, 7);
    oci.setResourceComment("This is a treatment that consists of taking measurements.");
    oci.setResourceLabel("TakeMeasurementActivity");
    oci.addSuperClass(Treatment.MY_URI); 
    oci.addObjectProperty(TakeMeasurementActivity.PROP_HAS_MEASUREMENT_REQUIREMENTS).setFunctional();
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(TakeMeasurementActivity.PROP_HAS_MEASUREMENT_REQUIREMENTS, 
      MeasurementRequirements.MY_URI, 0, 1));
    
    
    //load PhysicalActivity 
    oci = createNewOntClassInfo(MeasuredPhysicalActivity.MY_URI, factory, 1);
    oci.setResourceComment("This concept describes a physical activity.");
    oci.setResourceLabel("MeasuredPhysicalActivity");
    oci.addSuperClass(HealthyHabitsAdoption.MY_URI); 
    oci.addObjectProperty(MeasuredPhysicalActivity.PROP_HAS_ASSOCIATED_MEASUREMENT).setFunctional();
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(MeasuredPhysicalActivity.PROP_HAS_ASSOCIATED_MEASUREMENT, 
      TakeMeasurementActivity.MY_URI, 1, 1));
    
    
    //Disease Extension
    OntClassInfoSetup ocid = extendExistingOntClassInfo(Disease.MY_URI);
    ocid.addDatatypeProperty(DISEASE_PROP_DIAGNOSE_DATE);
    ocid.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
    		DISEASE_PROP_DISCHARGE_DATE, TypeMapper.getDatatypeURI(XMLGregorianCalendar.class), 0, 1));
    ocid.addDatatypeProperty(DISEASE_PROP_DISCHARGE_DATE);
    ocid.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
    		DISEASE_PROP_DISCHARGE_DATE, TypeMapper.getDatatypeURI(XMLGregorianCalendar.class), 0, 1));
    
    
    // load HealthProfile
    oci = createNewOntClassInfo(HealthProfile.MY_URI, factory, 12);  
    oci.setResourceLabel("HealthProfile");
    oci.setResourceComment("Health profile listing all treatments for an Assisted Person");
    oci.addSuperClass(SubProfile.MY_URI);
    
    oci.addObjectProperty(HealthProfile.PROP_HAS_TREATMENT);
    //oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(HealthProfile.PROP_HAS_TREATMENT, Treatment.MY_URI, 0, -1));
    oci.addRestriction(MergedRestriction.getAllValuesRestriction(HealthProfile.PROP_HAS_TREATMENT, Treatment.MY_URI));
    
    oci.addObjectProperty(HealthProfile.PROP_IS_ASSIGNED_TO_AP);
    oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(HealthProfile.PROP_IS_ASSIGNED_TO_AP, AssistedPerson.MY_URI, 1, 1));
    
    oci.addObjectProperty(HealthProfile.PROP_LAST_MEASUREMENTS);
    oci.addRestriction(MergedRestriction.getAllValuesRestriction(HealthProfile.PROP_LAST_MEASUREMENTS,
    		HealthMeasurement.MY_URI));
    
    oci.addDatatypeProperty(HealthProfile.PROP_BIRTH_DATE);
    oci.addRestriction(
    		MergedRestriction.getAllValuesRestrictionWithCardinality(
    				HealthProfile.PROP_BIRTH_DATE, TypeMapper.getDatatypeURI(XMLGregorianCalendar.class), 1, 1));
    
    oci.addObjectProperty(HealthProfile.PROP_GENDER);
    oci.addRestriction(
    		MergedRestriction.getAllValuesRestrictionWithCardinality(
    				HealthProfile.PROP_GENDER, Gender.MY_URI, 1, 1));
    
    oci.addObjectProperty(HealthProfile.PROP_DIAGNOSED_DISEASES);
    oci.addRestriction(MergedRestriction.getAllValuesRestriction(
    		HealthProfile.PROP_DIAGNOSED_DISEASES, Disease.MY_URI));
    
    //TODO: Add Habits property (needs new Ontolgoy)
    
    //TODO: Add Current Symthoms (needs new Ontolgoy)
    
    //TODO: Add Health Contact Subprofile to compile all health contacts (hospital, emergencgy, doctor...) (needs a taxonomy of health specialities?)
    
    //load Diet
    oci = createNewOntClassInfo(Diet.MY_URI, factory, 32);  
    oci.setResourceLabel("Diet");
    oci.setResourceComment("");
    
    //load WeightMeasurementTreatment
    oci = createNewOntClassInfo(WeightMeasurementTreatment.MY_URI, factory, 33);  
    oci.setResourceLabel("WeightMeasurementTreatment");
    oci.setResourceComment("");
    
    // extension for AssistedPersonProfile: an assisted person can contain a health profile, where treatments are specified.
    oci=extendExistingOntClassInfo(AssistedPersonProfile.MY_URI);
    oci.addObjectProperty(PROP_HAS_HEALTH_PROFILE).addSuperProperty(Profile.PROP_HAS_SUB_PROFILE);
    oci.addRestriction(MergedRestriction
    	      .getAllValuesRestrictionWithCardinality(PROP_HAS_HEALTH_PROFILE, 
    	      HealthProfile.MY_URI, 0, 1));//NO ES LA MÍA, TIENE QUE SER LA DE CARSTEN
    
    
    // extension for Caregiver: a caregiver can prescribe treatments
    oci=extendExistingOntClassInfo(org.universAAL.ontology.profile.Caregiver.MY_URI);
    oci.addObjectProperty(PROP_PRESCRIBES_TREATMENT);
    oci.addRestriction(MergedRestriction
    	      .getAllValuesRestriction(PROP_PRESCRIBES_TREATMENT, 
    	      Treatment.MY_URI));
    
    /*
     * Services
     */

    //load HealthService
    oci = createNewAbstractOntClassInfo(HealthService.MY_URI);
    oci.setResourceComment("Description of the health service.");
    oci.setResourceLabel("HealthService");
    oci.addSuperClass(Service.MY_URI); 
    
    oci.addObjectProperty(HealthService.PROP_ASSISTED_USER);
    oci.addRestriction(MergedRestriction
    		.getAllValuesRestrictionWithCardinality(
    				HealthService.PROP_ASSISTED_USER, AssistedPerson.MY_URI, 0, 1));
    
    oci.addObjectProperty(HealthService.PROP_ASSISTED_USER_PROFILE);
    oci.addRestriction(MergedRestriction
    		.getAllValuesRestrictionWithCardinality(
    				HealthService.PROP_ASSISTED_USER_PROFILE, HealthProfile.MY_URI, 0, 1));
    
    //load TreatmentManagementService
    oci = createNewAbstractOntClassInfo(TreatmentManagementService.MY_URI);
    oci.setResourceComment("Description of the treatment management service.");
    oci.setResourceLabel("TreatmentManagementService");
    oci.addSuperClass(HealthService.MY_URI); 

    oci.addObjectProperty(TreatmentManagementService.PROP_MANAGES_TREATMENT);
    oci.addRestriction(MergedRestriction.getAllValuesRestriction(
    		TreatmentManagementService.PROP_MANAGES_TREATMENT,  Treatment.MY_URI));
    
    oci.addDatatypeProperty(TreatmentManagementService.PROP_TIMESTAMP_FROM);
    oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
    		TreatmentManagementService.PROP_TIMESTAMP_FROM, 
    		TypeMapper.getDatatypeURI(Long.class), 0, 1));
    //TODO change to XMLGregorianCalendar!
    
    oci.addDatatypeProperty(TreatmentManagementService.PROP_TIMESTAMP_TO);
    oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
    		TreatmentManagementService.PROP_TIMESTAMP_TO, 
    		TypeMapper.getDatatypeURI(Long.class), 0, 1));
  //TODO change to XMLGregorianCalendar!
    
    
    //load PlannedSessionManagementService
    
    oci = createNewAbstractOntClassInfo(PlannedSessionManagementService.MY_URI);
    oci.setResourceComment("Description of the planned session management service.");
    oci.setResourceLabel("PlannedSessionManagementService");
    oci.addSuperClass(HealthService.MY_URI); 

    oci.addObjectProperty(PlannedSessionManagementService.PROP_MANAGES_SESSION);
    oci.addRestriction(MergedRestriction.getAllValuesRestriction(
    		PlannedSessionManagementService.PROP_MANAGES_SESSION, PlannedSession.MY_URI));
    
    oci.addObjectProperty(PlannedSessionManagementService.PROP_ASSOCIATED_TREATMENT);
    oci.addRestriction(MergedRestriction.getAllValuesRestriction(
    		PlannedSessionManagementService.PROP_ASSOCIATED_TREATMENT, Treatment.MY_URI));
    
//    oci.addObjectProperty(PlannedSessionManagementService.PROP_LISTS_SESSIONS);
//    oci.addRestriction(MergedRestriction.getAllValuesRestriction(
//    		PlannedSessionManagementService.PROP_LISTS_SESSIONS, PlannedSession.MY_URI));    
    
    //load PerformedSessionManagementService
    oci = createNewAbstractOntClassInfo(PerformedSessionManagementService.MY_URI);
    oci.setResourceComment("Description of the performed session management service.");
    oci.setResourceLabel("PerformedSessionManagementService");
    oci.addSuperClass(HealthService.MY_URI); 

    oci.addObjectProperty(PerformedSessionManagementService.PROP_MANAGES_SESSION);
    oci.addRestriction(MergedRestriction.getAllValuesRestriction(
    		PerformedSessionManagementService.PROP_MANAGES_SESSION,  PlannedSession.MY_URI));
    
    oci.addObjectProperty(PerformedSessionManagementService.PROP_ASSOCIATED_TREATMENT);
    oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
    		PerformedSessionManagementService.PROP_ASSOCIATED_TREATMENT, Treatment.MY_URI, 0, 1));
    
    oci.addDatatypeProperty(PerformedSessionManagementService.PROP_TIMESTAMP_FROM);
    oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
    		PerformedSessionManagementService.PROP_TIMESTAMP_FROM, 
    		TypeMapper.getDatatypeURI(Long.class), 0, 1));
  //TODO change to XMLGregorianCalendar!
    
    oci.addDatatypeProperty(PerformedSessionManagementService.PROP_TIMESTAMP_TO);
    oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
    		PerformedSessionManagementService.PROP_TIMESTAMP_TO, 
    		TypeMapper.getDatatypeURI(Long.class), 0, 1)); 
  //TODO change to XMLGregorianCalendar!
    
    //load ProfileManagementService
    oci = createNewAbstractOntClassInfo(ProfileManagementService.MY_URI);
    oci.setResourceComment("Services to manage Health Profile.");
    oci.setResourceLabel("HealthProfileManagementService");
    oci.addSuperClass(HealthService.MY_URI);
    
  //load DisplayTreatmentService
    oci = createNewAbstractOntClassInfo(DisplayTreatmentService.MY_URI);
    oci.setResourceComment("Services to display specific treatments.");
    oci.setResourceLabel("HealthDisplayTreatmentService");
    oci.addSuperClass(Service.MY_URI);
    
    oci.addObjectProperty(DisplayTreatmentService.PROP_TREATMENT);
    oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
    		DisplayTreatmentService.PROP_TREATMENT, Treatment.MY_URI, 1, 1));
    
    oci.addObjectProperty(DisplayTreatmentService.PROP_FORM_FOR_TREATMENT);
    oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
    		DisplayTreatmentService.PROP_FORM_FOR_TREATMENT, Form.MY_URI, 1, 1));
  }
}
