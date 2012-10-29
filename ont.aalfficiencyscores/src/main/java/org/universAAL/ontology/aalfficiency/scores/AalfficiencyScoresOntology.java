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
package org.universAAL.ontology.aalfficiency.scores;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.AalfficiencyScoresFactory;

public class AalfficiencyScoresOntology extends Ontology{
	
	private static AalfficiencyScoresFactory factory = new AalfficiencyScoresFactory();
	public static final String NAMESPACE = "http://ontology.universAAL.org/AalfficiencyScores.owl#";
	
	public AalfficiencyScoresOntology() {
		super(NAMESPACE);	
	}
	
	public AalfficiencyScoresOntology(String ontURI) {
		super(ontURI);
		// TODO Auto-generated constructor stub
	}

	public void create() {
		
		Resource r = getInfo();
		//This ontology
		r.setResourceComment("Ontology for Aalfficiency Service and related concepts.");
		r.setResourceLabel("AAL Energy Efficiency Service");
		
		addImport(DataRepOntology.NAMESPACE);
		
	    // ******* Declaration of regular classes of the ontology ******* //
	    OntClassInfoSetup oci_Advice = createNewOntClassInfo(Advice.MY_URI, factory, factory.Advice);
	    OntClassInfoSetup oci_ElectricityScore = createNewOntClassInfo(ElectricityScore.MY_URI, factory, factory.ElectricityData);
	    OntClassInfoSetup oci_ActivityScore = createNewOntClassInfo(ActivityScore.MY_URI, factory, factory.ActivityData);
	    OntClassInfoSetup oci_Challenge = createNewOntClassInfo(Challenge.MY_URI, factory, factory.Challenge);
	    OntClassInfoSetup oci_AalfficiencyAdvices = createNewOntClassInfo(AalfficiencyAdvices.MY_URI, factory, factory.AalfficiencyAdvices);
	    OntClassInfoSetup oci_AalfficiencyScores = createNewOntClassInfo(AalfficiencyScores.MY_URI, factory, factory.AalfficiencyScoresService);


	    // ******* Add content to regular classes of the ontology ******* //
	    oci_Advice.setResourceComment("");
	    oci_Advice.setResourceLabel("Advice");
	    oci_Advice.addSuperClass(ManagedIndividual.MY_URI); 
	    oci_Advice.addDatatypeProperty(Advice.PROP_TYPE).setFunctional();
	    oci_Advice.addRestriction(MergedRestriction
	      .getAllValuesRestrictionWithCardinality(Advice.PROP_TYPE, 
	      TypeMapper.getDatatypeURI(String.class), 1, 1));
	    
	    oci_Advice.addDatatypeProperty(Advice.PROP_TEXT).setFunctional();
	    oci_Advice.addRestriction(MergedRestriction
	      .getAllValuesRestrictionWithCardinality(Advice.PROP_TEXT, 
	      TypeMapper.getDatatypeURI(String.class), 1, 1));
	    
	    oci_ElectricityScore.setResourceComment("");
	    oci_ElectricityScore.setResourceLabel("ElectricityScore");
	    oci_ElectricityScore.addSuperClass(ManagedIndividual.MY_URI); 
	    oci_ElectricityScore.addObjectProperty(ElectricityScore.PROP_CHALLENGE).setFunctional();
	    oci_ElectricityScore.addRestriction(MergedRestriction
	      .getAllValuesRestrictionWithCardinality(ElectricityScore.PROP_CHALLENGE, 
	      Challenge.MY_URI, 1, 1));
	    
	    oci_ElectricityScore.addDatatypeProperty(ElectricityScore.PROP_TOTAL_ELECTRICITY_SCORE).setFunctional();
	    oci_ElectricityScore.addRestriction(MergedRestriction
	      .getAllValuesRestrictionWithCardinality(ElectricityScore.PROP_TOTAL_ELECTRICITY_SCORE, 
	      TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	    
	    oci_ElectricityScore.addDatatypeProperty(ElectricityScore.PROP_TODAY_ELECTRICITY_SCORE).setFunctional();
	    oci_ElectricityScore.addRestriction(MergedRestriction
	      .getAllValuesRestrictionWithCardinality(ElectricityScore.PROP_TODAY_ELECTRICITY_SCORE, 
	      TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	    
	    oci_ElectricityScore.addDatatypeProperty(ElectricityScore.PROP_SAVING).setFunctional();
	    oci_ElectricityScore.addRestriction(MergedRestriction
	      .getAllValuesRestrictionWithCardinality(ElectricityScore.PROP_SAVING, 
	      TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	    
	    oci_ActivityScore.setResourceComment("");
	    oci_ActivityScore.setResourceLabel("ActivityScore");
	    oci_ActivityScore.addSuperClass(ManagedIndividual.MY_URI); 
	    oci_ActivityScore.addDatatypeProperty(ActivityScore.PROP_STEPS).setFunctional();
	    oci_ActivityScore.addRestriction(MergedRestriction
	      .getAllValuesRestrictionWithCardinality(ActivityScore.PROP_STEPS, 
	      TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	    
	    oci_ActivityScore.addObjectProperty(ActivityScore.PROP_CHALLENGE).setFunctional();
	    oci_ActivityScore.addRestriction(MergedRestriction
	      .getAllValuesRestrictionWithCardinality(ActivityScore.PROP_CHALLENGE, 
	      Challenge.MY_URI, 1, 1));
	    
	    oci_ActivityScore.addDatatypeProperty(ActivityScore.PROP_TOTAL_ACTIVITY_SCORE).setFunctional();
	    oci_ActivityScore.addRestriction(MergedRestriction
	      .getAllValuesRestrictionWithCardinality(ActivityScore.PROP_TOTAL_ACTIVITY_SCORE, 
	      TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	    
	    oci_ActivityScore.addDatatypeProperty(ActivityScore.PROP_KCAL).setFunctional();
	    oci_ActivityScore.addRestriction(MergedRestriction
	      .getAllValuesRestrictionWithCardinality(ActivityScore.PROP_KCAL, 
	      TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	    
	    oci_ActivityScore.addDatatypeProperty(ActivityScore.PROP_TODAY_ACTIVITY_SCORE).setFunctional();
	    oci_ActivityScore.addRestriction(MergedRestriction
	      .getAllValuesRestrictionWithCardinality(ActivityScore.PROP_TODAY_ACTIVITY_SCORE, 
	      TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	    
	    oci_Challenge.setResourceComment("");
	    oci_Challenge.setResourceLabel("Challenge");
	    oci_Challenge.addSuperClass(ManagedIndividual.MY_URI); 
	    oci_Challenge.addDatatypeProperty(Challenge.PROP_GOAL).setFunctional();
	    oci_Challenge.addRestriction(MergedRestriction
	      .getAllValuesRestrictionWithCardinality(Challenge.PROP_GOAL, 
	      TypeMapper.getDatatypeURI(String.class), 1, 1));
	    
	    oci_Challenge.addDatatypeProperty(Challenge.PROP_DESCRIPTION).setFunctional();
	    oci_Challenge.addRestriction(MergedRestriction
	      .getAllValuesRestrictionWithCardinality(Challenge.PROP_DESCRIPTION, 
	      TypeMapper.getDatatypeURI(String.class), 1, 1));
	    
	    oci_AalfficiencyAdvices.setResourceComment("");
	    oci_AalfficiencyAdvices.setResourceLabel("AalfficiencyAdvices");
	    oci_AalfficiencyAdvices.addSuperClass(ManagedIndividual.MY_URI); 
	    oci_AalfficiencyAdvices.addObjectProperty(AalfficiencyAdvices.PROP_ADVICE).setFunctional();
	    oci_AalfficiencyAdvices.addRestriction(MergedRestriction
	      .getAllValuesRestriction(AalfficiencyAdvices.PROP_ADVICE, 
	      Advice.MY_URI));
	    
	    oci_AalfficiencyScores.setResourceComment("");
	    oci_AalfficiencyScores.setResourceLabel("AalfficiencyScores");
	    oci_AalfficiencyScores.addSuperClass(Service.MY_URI); 
	    oci_AalfficiencyScores.addObjectProperty(AalfficiencyScores.PROP_AALFFICIENCY_ADVICES).setFunctional();
	    oci_AalfficiencyScores.addRestriction(MergedRestriction
	      .getAllValuesRestrictionWithCardinality(AalfficiencyScores.PROP_AALFFICIENCY_ADVICES, 
	      AalfficiencyAdvices.MY_URI, 1, 1));
	    
	    oci_AalfficiencyScores.addObjectProperty(AalfficiencyScores.PROP_ELECTRICITY_SCORE).setFunctional();
	    oci_AalfficiencyScores.addRestriction(MergedRestriction
	      .getAllValuesRestrictionWithCardinality(AalfficiencyScores.PROP_ELECTRICITY_SCORE, 
	      ElectricityScore.MY_URI, 1, 1));
	    
	    oci_AalfficiencyScores.addObjectProperty(AalfficiencyScores.PROP_ACTIVITY_SCORE).setFunctional();
	    oci_AalfficiencyScores.addRestriction(MergedRestriction
	      .getAllValuesRestrictionWithCardinality(AalfficiencyScores.PROP_ACTIVITY_SCORE, 
	      ActivityScore.MY_URI, 1, 1));
		
	}

}
