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


import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.location.LocationOntology;

import org.universAAL.middleware.owl.ManagedIndividual;


//import the factory for this ontology
import org.universAAL.ontology.FitbitdataFactory;


/**
 * @author AAL Studio: UML2Java transformation
 */
public final class FitbitdataOntology extends Ontology {

  private static FitbitdataFactory factory = new FitbitdataFactory();
  public static final String NAMESPACE ="http://ontology.universAAL.org/fitbitdata#";
	
  public FitbitdataOntology() {
    super(NAMESPACE);
  }

  public void create() {
	  
    Resource r = getInfo();
    
    r.setResourceComment("The ontology containing the data obtained by the Fitbit");
    r.setResourceLabel("fitbitdata");
    
	addImport(NAMESPACE);
		
	OntClassInfoSetup oci;

    // ******* Add content to regular classes of the ontology ******* //
    //Sleep
    oci = createNewOntClassInfo(Sleep.MY_URI, factory, factory.Sleep);
    oci.setResourceComment("Sleep data of the user");
    oci.setResourceLabel("Sleep");
    oci.addSuperClass(ManagedIndividual.MY_URI);
    oci.addDatatypeProperty(Sleep.PROP_TIME_IN_BED).setFunctional();
    oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Sleep.PROP_TIME_IN_BED, 
  	      TypeMapper.getDatatypeURI(Integer.class), 1, 1));
    oci.addDatatypeProperty(Sleep.PROP_IS_MAIN_SLEEP).setFunctional();
    oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Sleep.PROP_IS_MAIN_SLEEP, 
    	      TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
    oci.addDatatypeProperty(Sleep.PROP_MINUTES_ASLEEP).setFunctional();
    oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Sleep.PROP_MINUTES_ASLEEP, 
    	      TypeMapper.getDatatypeURI(Integer.class), 1, 1));
    
    //Activity
    oci = createNewOntClassInfo(Activity.MY_URI, factory, factory.Activity);
    oci.setResourceComment("Activity data of the user");
    oci.setResourceLabel("Activity");
    oci.addSuperClass(ManagedIndividual.MY_URI);
    oci.addDatatypeProperty(Activity.PROP_STEPS).setFunctional();
    oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Activity.PROP_STEPS, 
    	      TypeMapper.getDatatypeURI(Integer.class), 1, 1));
    oci.addDatatypeProperty(Activity.PROP_CALORIES).setFunctional();
    oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Activity.PROP_CALORIES, 
  	      TypeMapper.getDatatypeURI(Integer.class), 1, 1));
    
    //FitbitData
    oci = createNewOntClassInfo(FitbitData.MY_URI, factory,factory.FitbitData);
    oci.setResourceComment("");
    oci.setResourceLabel("FitbitData");
    oci.addSuperClass(ManagedIndividual.MY_URI); 
    oci.addDatatypeProperty(FitbitData.PROP_DATE).setFunctional();
    oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(FitbitData.PROP_DATE, 
  	     TypeMapper.getDatatypeURI(String.class), 1, 1));
    
    oci.addObjectProperty(FitbitData.PROP_SLEEP).setFunctional();
    oci.addRestriction(MergedRestriction.getAllValuesRestriction(FitbitData.PROP_SLEEP,Sleep.MY_URI));
    
    oci.addObjectProperty(FitbitData.PROP_ACTIVITY).setFunctional();
    oci.addRestriction(MergedRestriction.getAllValuesRestriction(FitbitData.PROP_ACTIVITY,Activity.MY_URI));
    
  }
}
