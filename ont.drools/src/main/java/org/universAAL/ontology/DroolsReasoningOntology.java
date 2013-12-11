/*
	Copyright 2008-2014 TSB, http://www.tsbtecnologias.es
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
package org.universAAL.ontology;


import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.drools.Consequence;
import org.universAAL.ontology.drools.ConsequenceProperty;
import org.universAAL.ontology.drools.DroolsReasoning;
import org.universAAL.ontology.drools.Fact;
import org.universAAL.ontology.drools.FactProperty;
import org.universAAL.ontology.drools.Rule;

public class DroolsReasoningOntology extends Ontology{
 
	private static DroolsReasoningFactory factory = new DroolsReasoningFactory();
	public static final String NAMESPACE = "http://ontology.universAAL.org/DroolsReasoning.owl#";
	
	public DroolsReasoningOntology() {
		super(NAMESPACE);	
	}
	
	public DroolsReasoningOntology(String ontURI) {
		super(ontURI);
		// TODO Auto-generated constructor stub
	}

	public void create() {
	Resource r = getInfo();
	//This ontology
	r.setResourceComment("Ontology for DroolsReasoner and related concepts.");
	r.setResourceLabel("Rules-based Reasoning (Drools)");
	addImport(DataRepOntology.NAMESPACE);
	OntClassInfoSetup oci;
	//ConsequenceProperty
	oci = createNewOntClassInfo(ConsequenceProperty.MY_URI,factory,4);
	oci.setResourceComment("A key-value pair which describes a property of a consequence.");
	oci.setResourceLabel("Consequence property");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addDatatypeProperty(ConsequenceProperty.PROP_HAS_KEY).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ConsequenceProperty.PROP_HAS_KEY, TypeMapper.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(ConsequenceProperty.PROP_HAS_VALUE).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ConsequenceProperty.PROP_HAS_VALUE, TypeMapper.getDatatypeURI(String.class), 1, 1));
	//Consequence
	oci = createNewOntClassInfo(Consequence.MY_URI, factory, 0);
	oci.setResourceComment("A consequence fired by a Rule from a set of facts and events.");
	oci.setResourceLabel("Consequence");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addDatatypeProperty(Consequence.PROP_HAS_IDENTIFIER).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Consequence.PROP_HAS_IDENTIFIER, TypeMapper.getDatatypeURI(Long.class), 1, 1));
	oci.addObjectProperty(Consequence.PROP_HAS_PROPERTIES);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(Consequence.PROP_HAS_PROPERTIES, ConsequenceProperty.MY_URI));
	//FactProperty
	oci = createNewOntClassInfo(FactProperty.MY_URI,factory,3);
	oci.setResourceComment("A key-value pair which describes a property of a fact.");
	oci.setResourceLabel("Fact property");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addDatatypeProperty(FactProperty.PROP_HAS_KEY).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(FactProperty.PROP_HAS_KEY, TypeMapper.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(FactProperty.PROP_HAS_VALUE).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(FactProperty.PROP_HAS_VALUE, TypeMapper.getDatatypeURI(String.class), 1, 1));
	//Fact
	oci = createNewOntClassInfo(Fact.MY_URI, factory, 1);
	oci.setResourceComment("A element which models some characteristics of the reality in a service or application.");
	oci.setResourceLabel("Fact");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addDatatypeProperty(Fact.PROP_HAS_IDENTIFIER).setFunctional();	
	oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Consequence.PROP_HAS_IDENTIFIER, TypeMapper.getDatatypeURI(Long.class), 1, 1));
	oci.addObjectProperty(Fact.PROP_HAS_PROPERTIES);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(Fact.PROP_HAS_PROPERTIES, FactProperty.MY_URI));
	//Rule
	oci = createNewOntClassInfo(Rule.MY_URI, factory, 2);
	oci.setResourceComment("A rule written in drools format for expressing a group of conditions which combined with a set of facts and input events results as a consequence firing.");
	oci.setResourceLabel("Rule");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addDatatypeProperty(Rule.PROP_HAS_IDENTIFIER).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Rule.PROP_HAS_IDENTIFIER, TypeMapper.getDatatypeURI(Long.class), 1, 1));
	oci.addDatatypeProperty(Rule.PROP_HAS_BODY).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(Rule.PROP_HAS_BODY, TypeMapper.getDatatypeURI(String.class)));	
	//DroolsReasoningService
	oci = createNewOntClassInfo(DroolsReasoning.MY_URI, factory, 5);
	oci.setResourceComment("The main service to request reasoning throught the Drools Business Rules Process Management.");
	oci.setResourceLabel("Drools reasoning service");
	oci.addSuperClass(Service.MY_URI);
	oci.addObjectProperty(DroolsReasoning.PROP_KNOWS_FACTS);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(DroolsReasoning.PROP_KNOWS_FACTS,Fact.MY_URI));
	oci.addObjectProperty(DroolsReasoning.PROP_KNOWS_RULES);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(DroolsReasoning.PROP_KNOWS_RULES, Rule.MY_URI));
	oci.addObjectProperty(DroolsReasoning.PROP_PRODUCES_CONSEQUENCES);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(DroolsReasoning.PROP_PRODUCES_CONSEQUENCES, Consequence.MY_URI));
	}

}
