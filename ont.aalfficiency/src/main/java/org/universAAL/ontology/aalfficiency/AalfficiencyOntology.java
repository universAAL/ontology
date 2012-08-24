package org.universAAL.ontology.aalfficiency;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.AalfficiencyFactory;
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
			

			//ActivityData
			oci = createNewOntClassInfo(ActivityData.MY_URI,factory,factory.ActivityData);
			oci.setResourceComment("The data of the activity part of the service");
			oci.setResourceLabel("ActivityData");
			oci.addSuperClass(ManagedIndividual.MY_URI);
			oci.addDatatypeProperty(ActivityData.PROP_HAS_TOTAL_SCORE).setFunctional();
			oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ActivityData.PROP_HAS_TOTAL_SCORE, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
			oci.addDatatypeProperty(ActivityData.PROP_HAS_TODAY_SCORE).setFunctional();
			oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ActivityData.PROP_HAS_TODAY_SCORE, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
			oci.addDatatypeProperty(ActivityData.PROP_HAS_STEPS).setFunctional();
			oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ActivityData.PROP_HAS_STEPS, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
			oci.addDatatypeProperty(ActivityData.PROP_HAS_KCAL).setFunctional();
			oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ActivityData.PROP_HAS_KCAL, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
			oci.addObjectProperty(ActivityData.PROP_HAS_CHALLENGE);
			oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ActivityData.PROP_HAS_CHALLENGE,Challenge.MY_URI,1,1));
			
			//ElectricityData
			oci = createNewOntClassInfo(ElectricityData.MY_URI,factory,factory.ElectricityData);
			oci.setResourceComment("The data of the electricity part of the service");
			oci.setResourceLabel("ElectricityData");
			oci.addSuperClass(ManagedIndividual.MY_URI);
			oci.addDatatypeProperty(ElectricityData.PROP_HAS_TOTAL_SCORE).setFunctional();
			oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ElectricityData.PROP_HAS_TOTAL_SCORE, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
			oci.addDatatypeProperty(ElectricityData.PROP_HAS_TODAY_SCORE).setFunctional();
			oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ElectricityData.PROP_HAS_TODAY_SCORE, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
			oci.addDatatypeProperty(ElectricityData.PROP_HAS_SAVING).setFunctional();
			oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ElectricityData.PROP_HAS_SAVING, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
			oci.addObjectProperty(ElectricityData.PROP_HAS_CHALLENGE);
			oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ElectricityData.PROP_HAS_CHALLENGE,Challenge.MY_URI,1,1));
			
			
			//AalfficiencyService
			oci = createNewOntClassInfo(Aalfficiency.MY_URI, factory, factory.AalfficiencyService);
			oci.setResourceComment("The main service trelated to the Aalfficiency Service game");
			oci.setResourceLabel("Aalfficiency Service");
			oci.addSuperClass(Service.MY_URI);
			oci.addObjectProperty(Aalfficiency.PROP_HAS_ADVICES);
			oci.addRestriction(MergedRestriction.getAllValuesRestriction(Aalfficiency.PROP_HAS_ADVICES,AalfficiencyAdvices.MY_URI));
			oci.addObjectProperty(Aalfficiency.PROP_HAS_ELECTRICITY_DATA);
			oci.addRestriction(MergedRestriction.getAllValuesRestriction(Aalfficiency.PROP_HAS_ELECTRICITY_DATA,ElectricityData.MY_URI));
			oci.addObjectProperty(Aalfficiency.PROP_HAS_ACTIVITY_DATA);
			oci.addRestriction(MergedRestriction.getAllValuesRestriction(Aalfficiency.PROP_HAS_ACTIVITY_DATA,ActivityData.MY_URI));
			
		}
}
