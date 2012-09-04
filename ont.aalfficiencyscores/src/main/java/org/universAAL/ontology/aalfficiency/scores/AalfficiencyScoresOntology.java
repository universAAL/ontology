package org.universAAL.ontology.aalfficiency.scores;

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
	public static final String NAMESPACE = "http://ontology.universAAL.org/Aalfficiency.owl#";
	
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
		
		addImport(AalfficiencyScoresOntology.NAMESPACE);
		
		OntClassInfoSetup oci;
		
		//Advice
		oci = createNewOntClassInfo(Advice.MY_URI,factory,factory.Advice);
		oci.setResourceComment("An Advice in the Aalfficiency world");
		oci.setResourceLabel("Advice");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addDatatypeProperty(Advice.PROP_HAS_TYPE).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Advice.PROP_HAS_TYPE, TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci.addDatatypeProperty(Advice.PROP_HAS_TEXT).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Advice.PROP_HAS_TEXT, TypeMapper.getDatatypeURI(String.class), 1, 1));
		//AalfficiencyAdvices
		oci = createNewOntClassInfo(AalfficiencyAdvices.MY_URI,factory,factory.AalfficiencyAdvices);
		oci.setResourceComment("All user's Advices in the Aalfficiency world");
		oci.setResourceLabel("AalfficiencyAdvices");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addObjectProperty(AalfficiencyAdvices.PROP_HAS_ADVICES);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(AalfficiencyAdvices.PROP_HAS_ADVICES,Advice.MY_URI));
		
		//Challenge
		oci = createNewOntClassInfo(Challenge.MY_URI, factory, factory.Challenge);
		oci.setResourceComment("A Challenge to accomplish in AAlfficiency");
		oci.setResourceLabel("Challenge");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addDatatypeProperty(Challenge.PROP_HAS_DESCRIPTION).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Challenge.PROP_HAS_DESCRIPTION, TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci.addDatatypeProperty(Challenge.PROP_HAS_GOAL).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Challenge.PROP_HAS_GOAL, TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci.addDatatypeProperty(Challenge.PROP_HAS_NAME).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Challenge.PROP_HAS_NAME, TypeMapper.getDatatypeURI(String.class), 1, 1));
		
		//ElectricityScore
		oci = createNewOntClassInfo(ElectricityScore.MY_URI, factory, factory.ElectricityData);
		oci.setResourceComment("The electricity saving part of AAlfficiency");
		oci.setResourceLabel("ElectricityScore");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addDatatypeProperty(ElectricityScore.PROP_HAS_TOTAL_SCORE).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ElectricityScore.PROP_HAS_TOTAL_SCORE, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
		oci.addDatatypeProperty(ElectricityScore.PROP_HAS_TODAY_SCORE).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ElectricityScore.PROP_HAS_TODAY_SCORE, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
		oci.addDatatypeProperty(ElectricityScore.PROP_HAS_SAVING).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ElectricityScore.PROP_HAS_SAVING, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
		oci.addDatatypeProperty(ElectricityScore.PROP_HAS_SENT_BY_PUBLISHER).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ElectricityScore.PROP_HAS_SENT_BY_PUBLISHER, TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci.addDatatypeProperty(ElectricityScore.PROP_HAS_CHALLENGE).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(ElectricityScore.PROP_HAS_CHALLENGE, Challenge.MY_URI));
		
		//ActivityScore
		oci = createNewOntClassInfo(ActivityScore.MY_URI, factory, factory.ActivityData);
		oci.setResourceComment("The Activity saving part of AAlfficiency");
		oci.setResourceLabel("ActivityScore");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addDatatypeProperty(ActivityScore.PROP_HAS_TOTAL_SCORE).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ActivityScore.PROP_HAS_TOTAL_SCORE, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
		oci.addDatatypeProperty(ActivityScore.PROP_HAS_TODAY_SCORE).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ActivityScore.PROP_HAS_TODAY_SCORE, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
		oci.addDatatypeProperty(ActivityScore.PROP_HAS_STEPS).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ActivityScore.PROP_HAS_STEPS, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
		oci.addDatatypeProperty(ActivityScore.PROP_HAS_KCAL).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ActivityScore.PROP_HAS_KCAL, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
		oci.addDatatypeProperty(ActivityScore.PROP_HAS_SENT_BY_PUBLISHER).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(ActivityScore.PROP_HAS_SENT_BY_PUBLISHER, TypeMapper.getDatatypeURI(String.class)));
		oci.addDatatypeProperty(ActivityScore.PROP_HAS_CHALLENGE).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ActivityScore.PROP_HAS_CHALLENGE, Challenge.MY_URI, 1, 1));
			
		//AalfficiencyScores
		oci = createNewOntClassInfo(AalfficiencyScores.MY_URI, factory, factory.AalfficiencyScoresService);
		oci.setResourceComment("The main service trelated to the Aalfficiency Service game");
		oci.setResourceLabel("Aalfficiency Service");
		oci.addSuperClass(Service.MY_URI);
		oci.addObjectProperty(AalfficiencyScores.PROP_HAS_ADVICES);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(AalfficiencyScores.PROP_HAS_ADVICES,AalfficiencyAdvices.MY_URI));
		oci.addObjectProperty(AalfficiencyScores.PROP_HAS_ELECTRICITY_SCORE);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(AalfficiencyScores.PROP_HAS_ELECTRICITY_SCORE,ElectricityScore.MY_URI));
		oci.addObjectProperty(AalfficiencyScores.PROP_HAS_ACTIVITY_SCORE);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(AalfficiencyScores.PROP_HAS_ACTIVITY_SCORE,ActivityScore.MY_URI));
		
		
	}

}
