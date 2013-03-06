/*******************************************************************************
 * Copyright 2012 UPM, http://www.upm.es 
 Universidad PolitÃ©cnica de Madrid
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

package org.universaal.ontology.healthmeasurement.owl;

import javax.xml.datatype.Duration;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.ontology.profile.ProfileOntology;
import org.universAAL.ontology.profile.User;
import org.universaal.ontology.healthmeasurement.HealthMeasurementFactory;

/**
 * @author AAL Studio 
 */
public final class HealthMeasurementOntology extends Ontology {

  private static HealthMeasurementFactory factory = new HealthMeasurementFactory();
  public static final String NAMESPACE ="http://ontology.universaal.org/HealthMeasurement#";
	
  public HealthMeasurementOntology() {
    super(NAMESPACE);
  }

  public void create() {
    Resource r = getInfo();
    r.setResourceComment("");
    r.setResourceLabel("HealthMeasurement");
    addImport(DataRepOntology.NAMESPACE);
    addImport(ServiceBusOntology.NAMESPACE);
    addImport(LocationOntology.NAMESPACE);
    addImport(PhThingOntology.NAMESPACE);
    addImport(ProfileOntology.NAMESPACE);
    
    
    // ******* Declaration of regular classes of the ontology ******* //
    OntClassInfoSetup oci_HealthMeasurement = createNewOntClassInfo(HealthMeasurement.MY_URI, factory, 0);
    OntClassInfoSetup oci_Unit = createNewOntClassInfo(Unit.MY_URI, factory, 1);
    OntClassInfoSetup oci_MultiValueMeasurement = createNewOntClassInfo(MultiValueMeasurement.MY_URI, factory, 2);
    OntClassInfoSetup oci_PersonWeight = createNewOntClassInfo(PersonWeight.MY_URI, factory, 3);
    OntClassInfoSetup oci_SingleValueMeasurement = createNewOntClassInfo(SingleValueMeasurement.MY_URI, factory, 4);
    OntClassInfoSetup oci_Measurement = createNewOntClassInfo(Measurement.MY_URI, factory, 5);
    OntClassInfoSetup oci_BloodPressure = createNewOntClassInfo(BloodPressure.MY_URI, factory, 6);
    OntClassInfoSetup oci_HeartRate = createNewOntClassInfo(HeartRate.MY_URI, factory, 7);
    OntClassInfoSetup oci_HeartRateSignal = createNewOntClassInfo(HeartRateSignal.MY_URI, factory, 8);
    OntClassInfoSetup oci_Signal = createNewOntClassInfo(Signal.MY_URI, factory, 9);


    // ******* Add content to regular classes of the ontology ******* //
    
    //Health Measurement
    oci_HealthMeasurement.setResourceComment("");
    oci_HealthMeasurement.setResourceLabel("HealthMeasurement");
    oci_HealthMeasurement.addSuperClass(Measurement.MY_URI); 
    oci_HealthMeasurement.addObjectProperty(HealthMeasurement.PROP_OBTAINED_FROM).setFunctional();
    oci_HealthMeasurement.addRestriction(MergedRestriction
  	      .getAllValuesRestrictionWithCardinality(HealthMeasurement.PROP_OBTAINED_FROM, 
  	    		User.MY_URI, 1, 1));

    oci_HealthMeasurement.addObjectProperty(HealthMeasurement.PROP_MEASURED_BY).setFunctional();
    //oci_HealthMeasurement.addRestriction(MergedRestriction.getCardinalityRestriction(HealthMeasurement.PROP_MEASURED_BY, 1, 1));
    oci_HealthMeasurement.addRestriction(MergedRestriction
    	      .getAllValuesRestrictionWithCardinality(HealthMeasurement.PROP_MEASURED_BY, 
    	    		Device.MY_URI, 1, 1));

    //Unit
    oci_Unit.setResourceComment("");
    oci_Unit.setResourceLabel("Unit");
    oci_Unit.addSuperClass(ManagedIndividual.MY_URI); 
    
  //Multi-Value Measurement
    oci_MultiValueMeasurement.setResourceComment("");
    oci_MultiValueMeasurement.setResourceLabel("MultiValueMeasurement");
    oci_MultiValueMeasurement.addSuperClass(Measurement.MY_URI); 
    
    oci_MultiValueMeasurement.addObjectProperty(MultiValueMeasurement.PROP_UNIT).setFunctional();
    oci_MultiValueMeasurement.addRestriction(MergedRestriction.getAllValuesRestriction(MultiValueMeasurement.PROP_UNIT,  
           	Unit.MY_URI));
    
    oci_MultiValueMeasurement.addDatatypeProperty(MultiValueMeasurement.PROP_VALUE).setFunctional();
    oci_MultiValueMeasurement.addRestriction(MergedRestriction
    	      .getAllValuesRestriction(MultiValueMeasurement.PROP_VALUE, 
    	    		  TypeMapper.getDatatypeURI(Double.class)));
    
    // Person Weight
    oci_PersonWeight.setResourceComment("");
    oci_PersonWeight.setResourceLabel("PersonWeight");
    oci_PersonWeight.addSuperClass(HealthMeasurement.MY_URI); 
    oci_PersonWeight.addSuperClass(SingleValueMeasurement.MY_URI);
    
    // Single-value Measurement
    oci_SingleValueMeasurement.setResourceComment("");
    oci_SingleValueMeasurement.setResourceLabel("SingleValueMeasurement");
    oci_SingleValueMeasurement.addSuperClass(Measurement.MY_URI); 
    
    
    oci_SingleValueMeasurement.addObjectProperty(MultiValueMeasurement.PROP_UNIT).setFunctional();
    //oci_SingleValueMeasurement.addRestriction(MergedRestriction.getCardinalityRestriction(MultiValueMeasurement.PROP_UNIT, 1, 1));
    oci_SingleValueMeasurement.addRestriction(MergedRestriction
  	      .getAllValuesRestrictionWithCardinality(MultiValueMeasurement.PROP_UNIT, 
  	    		Unit.MY_URI, 1, 1));
    
    oci_SingleValueMeasurement.addDatatypeProperty(MultiValueMeasurement.PROP_VALUE).setFunctional();
    oci_SingleValueMeasurement.addRestriction(MergedRestriction
    	      .getAllValuesRestrictionWithCardinality(MultiValueMeasurement.PROP_VALUE, 
    	    		  TypeMapper.getDatatypeURI(Double.class), 1, 1));
    
    // Measurement
    oci_Measurement.setResourceComment("");
    oci_Measurement.setResourceLabel("Measurement");
    oci_Measurement.addSuperClass(ManagedIndividual.MY_URI); 
    
    //Blood pressure
    oci_BloodPressure.setResourceComment("");
    oci_BloodPressure.setResourceLabel("BloodPressure");
    oci_BloodPressure.addSuperClass(HealthMeasurement.MY_URI); 
    oci_BloodPressure.addSuperClass(MultiValueMeasurement.MY_URI); 
    
    //Heart rate
    oci_HeartRate.setResourceComment("");
    oci_HeartRate.setResourceLabel("HeartRate");
    oci_HeartRate.addSuperClass(HealthMeasurement.MY_URI); 
    oci_HeartRate.addSuperClass(SingleValueMeasurement.MY_URI); 
   
    //Heart rate signal
    oci_HeartRateSignal.setResourceComment("");
    oci_HeartRateSignal.setResourceLabel("HeartRateSignal");
    oci_HeartRateSignal.addSuperClass(Signal.MY_URI); 
    oci_HeartRateSignal.addObjectProperty(HeartRateSignal.PROP_IS_COMPOSED_BY).setFunctional();
    oci_HeartRateSignal.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(HeartRateSignal.PROP_IS_COMPOSED_BY, 
      HeartRate.MY_URI, 1, -1));
    
    oci_HeartRateSignal.addObjectProperty(HeartRateSignal.PROP_INTERVAL).setFunctional();
    oci_HeartRateSignal.addRestriction(MergedRestriction
  	      .getAllValuesRestrictionWithCardinality(HeartRateSignal.PROP_INTERVAL, 
  	    		  TypeMapper.getDatatypeURI(Duration.class), 1, 1));
    
    //Signal
    oci_Signal.setResourceComment("");
    oci_Signal.setResourceLabel("Signal");
    
    oci_Signal.addObjectProperty(Signal.PROP_MEASUREMENT_INTERVAL).setFunctional();
    oci_Signal.addRestriction(MergedRestriction
  	      .getAllValuesRestrictionWithCardinality(Signal.PROP_MEASUREMENT_INTERVAL, 
  	    		  Measurement.MY_URI, 1, 1));
    
    oci_Signal.addObjectProperty(Signal.PROP_MEASUREMENT).setFunctional();
    oci_Signal.addRestriction(MergedRestriction
  	      .getAllValuesRestriction(Signal.PROP_MEASUREMENT, 
  	    		  Measurement.MY_URI));
  }
}
