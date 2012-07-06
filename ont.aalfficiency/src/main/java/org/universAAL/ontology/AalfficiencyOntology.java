package org.universAAL.ontology;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.aalfficiency.*;

public class AalfficiencyOntology extends Ontology{
	 
		private static AalfficiencyFactory factory = new AalfficiencyFactory();
		public static final String NAMESPACE = "http://ontology.universAAL.org/Aalfficiency.owl#";
		
		public AalfficiencyOntology() {
			super(NAMESPACE);	
		}
		
		public AalfficiencyOntology(String ontURI) {
			super(ontURI);
			// TODO Auto-generated constructor stub
		}

		
		public void create() {

			Resource r = getInfo();
			//This ontology
			r.setResourceComment("Ontology for Aalfficiency Service and related concepts.");
			r.setResourceLabel("AAL Energy Efficiency Service");
			addImport(AalfficiencyOntology.NAMESPACE);
			
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
			oci = createNewOntClassInfo(AalfficiencyAdvices.MY_URI,factory,factory.AalfficienyAdvices);
			oci.setResourceComment("All usert's Advices in the Aalfficiency world");
			oci.setResourceLabel("AalfficiencyAdvices");
			oci.addSuperClass(ManagedIndividual.MY_URI);
			oci.addObjectProperty(AalfficiencyAdvices.PROP_HAS_ADVICES);
			oci.addRestriction(MergedRestriction.getAllValuesRestriction(AalfficiencyAdvices.PROP_HAS_ADVICES,Advice.MY_URI));
			//Challenge
			oci = createNewOntClassInfo(Challenge.MY_URI,factory,factory.Challenge);
			oci.setResourceComment("A challenge in the Aalfficiency world");
			oci.setResourceLabel("Challenge");
			oci.addSuperClass(ManagedIndividual.MY_URI);
			oci.addDatatypeProperty(Challenge.PROP_HAS_TYPE).setFunctional();
			oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Challenge.PROP_HAS_TYPE, TypeMapper.getDatatypeURI(String.class), 1, 1));
			oci.addDatatypeProperty(Challenge.PROP_HAS_DESCRIPTION).setFunctional();
			oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Challenge.PROP_HAS_DESCRIPTION, TypeMapper.getDatatypeURI(String.class), 1, 1));
			oci.addDatatypeProperty(Challenge.PROP_HAS_GOAL).setFunctional();
			oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Challenge.PROP_HAS_GOAL, TypeMapper.getDatatypeURI(String.class), 1, 1));
			//AalfficiencyChallenges
			oci = createNewOntClassInfo(AalfficiencyChallenges.MY_URI,factory,factory.AalfficiencyChallenges);
			oci.setResourceComment("All user's challenges in the Aalfficiency world");
			oci.setResourceLabel("AalfficiencyChallenges");
			oci.addSuperClass(ManagedIndividual.MY_URI);
			oci.addObjectProperty(AalfficiencyChallenges.PROP_HAS_CHALLENGES);
			oci.addRestriction(MergedRestriction.getAllValuesRestriction(AalfficiencyChallenges.PROP_HAS_CHALLENGES,Challenge.MY_URI));
			//AalfficiencyScore
			oci = createNewOntClassInfo(AalfficiencyScore.MY_URI,factory,factory.AalfficiencyScore);
			oci.setResourceComment("The user's scores in the Aalfficiency game");
			oci.setResourceLabel("AalfficiencyScore");
			oci.addSuperClass(ManagedIndividual.MY_URI);
			oci.addDatatypeProperty(AalfficiencyScore.PROP_HAS_TODAYACTIVITYSCORE).setFunctional();
			oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AalfficiencyScore.PROP_HAS_TODAYACTIVITYSCORE, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
			oci.addDatatypeProperty(AalfficiencyScore.PROP_HAS_TODAYELECTRICITYSCORE).setFunctional();
			oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AalfficiencyScore.PROP_HAS_TODAYELECTRICITYSCORE, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
			oci.addDatatypeProperty(AalfficiencyScore.PROP_HAS_TODAYSCORE).setFunctional();
			oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AalfficiencyScore.PROP_HAS_TODAYSCORE, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
			oci.addDatatypeProperty(AalfficiencyScore.PROP_HAS_TOTALACTIVITYSCORE).setFunctional();
			oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AalfficiencyScore.PROP_HAS_TOTALACTIVITYSCORE, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
			oci.addDatatypeProperty(AalfficiencyScore.PROP_HAS_TOTALELECTRICITYSCORE).setFunctional();
			oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AalfficiencyScore.PROP_HAS_TOTALELECTRICITYSCORE, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
			oci.addDatatypeProperty(AalfficiencyScore.PROP_HAS_TOTALSCORE).setFunctional();
			oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AalfficiencyScore.PROP_HAS_TOTALSCORE, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
			//AalfficiencyService
			oci = createNewOntClassInfo(Aalfficiency.MY_URI, factory, factory.AalfficiencyService);
			oci.setResourceComment("The main service trelated to the Aalfficiency Service game");
			oci.setResourceLabel("Aalfficiency Service");
			oci.addSuperClass(Service.MY_URI);
			oci.addObjectProperty(Aalfficiency.PROP_HAS_ADVICES);
			oci.addRestriction(MergedRestriction.getAllValuesRestriction(Aalfficiency.PROP_HAS_ADVICES,AalfficiencyAdvices.MY_URI));
			oci.addObjectProperty(Aalfficiency.PROP_HAS_CHALLENGES);
			oci.addRestriction(MergedRestriction.getAllValuesRestriction(Aalfficiency.PROP_HAS_CHALLENGES,AalfficiencyChallenges.MY_URI));
			oci.addObjectProperty(Aalfficiency.PROP_HAS_SCORE);
			oci.addRestriction(MergedRestriction.getAllValuesRestriction(Aalfficiency.PROP_HAS_SCORE,AalfficiencyScore.MY_URI));
		}
}
