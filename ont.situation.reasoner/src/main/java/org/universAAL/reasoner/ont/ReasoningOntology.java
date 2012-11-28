/*	
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut für Graphische Datenverarbeitung 
	
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
package org.universAAL.reasoner.ont;

import org.universAAL.middleware.context.ContextEvent;
import org.universAAL.middleware.context.owl.ContextBusOntology;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;

import org.universAAL.middleware.service.owl.Service;
import org.universAAL.reasoner.ont.factory.OntFactory;

/**
 * @author AAL Studio: UML2Java transformation
 */
public final class ReasoningOntology extends Ontology {

  private static OntFactory factory = new OntFactory();
  public static final String NAMESPACE ="http://reasoner.universAAL.org/ReasoningOntology#";
	
  public ReasoningOntology() {
    super(NAMESPACE);
  }

  public void create() {
    Resource r = getInfo();
    r.setResourceComment("Ontology for the generic situation reasoner");
    r.setResourceLabel("ont");
    addImport(DataRepOntology.NAMESPACE);
    addImport(ServiceBusOntology.NAMESPACE);
    addImport(ContextBusOntology.NAMESPACE);
		
    // ******* Declaration of regular classes of the ontology ******* //
    OntClassInfoSetup oci_Persistent = createNewAbstractOntClassInfo(Persistent.MY_URI);
    OntClassInfoSetup oci_Situation = createNewOntClassInfo(Situation.MY_URI, factory, 0);
    OntClassInfoSetup oci_Query = createNewOntClassInfo(Query.MY_URI, factory, 1);
    OntClassInfoSetup oci_Rule = createNewOntClassInfo(Rule.MY_URI, factory, 2);
    OntClassInfoSetup oci_SituationService = createNewOntClassInfo(ReasoningService.MY_URI, factory, 3);
    

    // ******* Add content to regular classes of the ontology ******* //
    // Persistent
    oci_Persistent.setResourceComment("Determines if an object is persistent");
    oci_Persistent.setResourceLabel("Persistent");
    oci_Persistent.addSuperClass(ManagedIndividual.MY_URI);
    oci_Persistent.addDatatypeProperty(Persistent.PROP_PERSISTENT).setFunctional();
    oci_Persistent.addRestriction(MergedRestriction
	      .getAllValuesRestrictionWithCardinality(Persistent.PROP_PERSISTENT, 
	      TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
    
    // Situation
    oci_Situation.setResourceComment("");
    oci_Situation.setResourceLabel("Situation");
    oci_Situation.addSuperClass(Persistent.MY_URI); 
    oci_Situation.addDatatypeProperty(Situation.PROP_RDF_PREDICATE).setFunctional();
    oci_Situation.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Situation.PROP_RDF_PREDICATE, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    
    oci_Situation.addDatatypeProperty(Situation.PROP_RDF_SUBJECT).setFunctional();
    oci_Situation.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Situation.PROP_RDF_SUBJECT, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    
    oci_Situation.addDatatypeProperty(Situation.PROP_RDF_OBJECT).setFunctional();
    oci_Situation.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Situation.PROP_RDF_OBJECT, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    
    // Query
    oci_Query.setResourceComment("");
    oci_Query.setResourceLabel("Query");
    oci_Query.addSuperClass(Persistent.MY_URI);
    
    oci_Query.addDatatypeProperty(Query.PROP_FULL_TEXT_QUERY).setFunctional();
    oci_Query.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Query.PROP_FULL_TEXT_QUERY, 
      TypeMapper.getDatatypeURI(String.class), 0, 1));
    
    oci_Query.addDatatypeProperty(Query.PROP_SEARCH_STRING).setFunctional();
    oci_Query.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Query.PROP_SEARCH_STRING, 
      TypeMapper.getDatatypeURI(String.class), 0, 1));
    
    oci_Query.addObjectProperty(Query.PROP_RESULTING_EVENT).setFunctional();
    oci_Query.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Query.PROP_RESULTING_EVENT, 
      TypeMapper.getDatatypeURI(ContextEvent.class), 0, 1));
    
    // Rule
    oci_Rule.setResourceComment("");
    oci_Rule.setResourceLabel("Rule");
    oci_Rule.addSuperClass(Persistent.MY_URI); 
    oci_Rule.addDatatypeProperty(Rule.PROP_SITUATION).setFunctional();
    oci_Rule.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Rule.PROP_SITUATION, 
      Situation.MY_URI, 1, 1));
    
    oci_Rule.addDatatypeProperty(Rule.PROP_QUERY).setFunctional();
    oci_Rule.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Rule.PROP_QUERY, 
      Query.MY_URI, 1, 1));
    
    // SituationService
    oci_SituationService.setResourceComment("");
    oci_SituationService.setResourceLabel("ReasoningService");
    oci_SituationService.addSuperClass(Service.MY_URI); 
    oci_SituationService.addObjectProperty(ReasoningService.PROP_SITUATIONS).setFunctional();
    oci_SituationService.addObjectProperty(ReasoningService.PROP_QUERIES).setFunctional();
    oci_SituationService.addObjectProperty(ReasoningService.PROP_RULES).setFunctional();
    oci_SituationService.addRestriction(MergedRestriction.getAllValuesRestriction(ReasoningService.PROP_SITUATIONS,  
       	Situation.MY_URI));
    oci_SituationService.addRestriction(MergedRestriction.getAllValuesRestriction(ReasoningService.PROP_QUERIES,  
	Query.MY_URI));
    oci_SituationService.addRestriction(MergedRestriction.getAllValuesRestriction(ReasoningService.PROP_RULES,  
	Rule.MY_URI));   
  }
}
