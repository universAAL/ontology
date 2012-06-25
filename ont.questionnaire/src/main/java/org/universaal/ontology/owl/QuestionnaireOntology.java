/*******************************************************************************
 * Copyright 2012 UPM, http://www.upm.es 
 Universidad Politécnica de Madrid
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
package org.universAAL.ontology.owl;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.ProfileOntology;
import org.universAAL.ontology.QuestionnaireOntologyFactory;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.ontology.profile.User;

/**
 * This class describes the questionnaire ontology itself.
 * @author mdelafuente
 *
 */
public final class  QuestionnaireOntology extends Ontology {

  private static  QuestionnaireOntologyFactory factory = new QuestionnaireOntologyFactory();
  public static final String NAMESPACE ="http://ontology.universaal.org/QuestionnaireOntology#";
	
  public  QuestionnaireOntology() {
    super(NAMESPACE);
  }

  public void create() {
    Resource r = getInfo();
    r.setResourceComment("The ontology defining the most general concepts dealing with questionnaires.");
    r.setResourceLabel("Questionnaire");
    addImport(DataRepOntology.NAMESPACE);
    addImport(PhThingOntology.NAMESPACE);
	addImport(ServiceBusOntology.NAMESPACE);
    addImport(ProfileOntology.NAMESPACE);

    OntClassInfoSetup oci;
    
    // ******* Regular classes of the ontology ******* //
    
  
    //load ChoiceLabel 
    oci = createNewOntClassInfo(ChoiceLabel.MY_URI, factory, 5);
    oci.setResourceComment("A 'choice-label' is the composition of a label associated to a choice");
    oci.setResourceLabel("ChoiceLabel");
    oci.addSuperClass(ManagedIndividual.MY_URI); 
    
    oci.addObjectProperty(ChoiceLabel.PROP_CHOICE).setFunctional();
    oci.addRestriction(MergedRestriction.getCardinalityRestriction(ChoiceLabel.PROP_CHOICE, 1, 1)); 
    
    oci.addDatatypeProperty(ChoiceLabel.PROP_LABEL).setFunctional();
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(ChoiceLabel.PROP_LABEL, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    

    //-------------------------------------------------------------------------------------------
    
    
  //load Question 
    oci = createNewAbstractOntClassInfo(Question.MY_URI);
    oci.setResourceComment("This concept describes a question which is the main unit of a questionnaire");
    oci.setResourceLabel("Question");
    oci.addSuperClass(ManagedIndividual.MY_URI); 
    
    oci.addObjectProperty(Question.PROP_CORRECT_ANSWER);
    
    oci.addDatatypeProperty(Question.PROP_HAS_CORRECT_ANSWER).setFunctional();
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Question.PROP_HAS_CORRECT_ANSWER, 
      TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
    
    oci.addObjectProperty(Question.PROP_HAS_CHOICE_LABEL);
      	oci.addRestriction(MergedRestriction.getAllValuesRestriction(Question.PROP_HAS_CHOICE_LABEL,  
       	ChoiceLabel.MY_URI));
	    
    oci.addDatatypeProperty(Question.PROP_ANSWER_TYPE_U_R_I).setFunctional();
    oci.addObjectProperty(Question.PROP_ANSWER_TYPE_U_R_I);
  	oci.addRestriction(MergedRestriction.getAllValuesRestriction(Question.PROP_ANSWER_TYPE_U_R_I,  
  			 TypeMapper.getDatatypeURI(String.class)));
    
    oci.addDatatypeProperty(Question.PROP_QUESTION_WORDING).setFunctional();
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Question.PROP_QUESTION_WORDING, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));

  //------------------------------------------------------------------------------------------- 
    
    //load MultiChoiceQuestion 
    oci = createNewOntClassInfo(MultiChoiceQuestion.MY_URI, factory, 2);
    oci.setResourceComment("A multi-choice question is a question that enables to select several choices as an answer.");
    oci.setResourceLabel("MultiChoiceQuestion");
    oci.addSuperClass(Question.MY_URI); 

    //load SingleChoiceQuestion 
    oci = createNewOntClassInfo(SingleChoiceQuestion.MY_URI, factory, 3);
    oci.setResourceComment("A single-choice question is the kind of question that only has one choice as an answer.");
    oci.setResourceLabel("SingleChoiceQuestion");
    oci.addSuperClass(Question.MY_URI); 
    
    //load QuestionWithMedia 
    oci = createNewOntClassInfo(QuestionWithMedia.MY_URI, factory, 3);
    oci.setResourceComment("A question with media is a question that has some media associated to it (video, images...).");
    oci.setResourceLabel("QuestionWithMedia");
    oci.addSuperClass(Question.MY_URI); 
    
    oci.addObjectProperty(QuestionWithMedia.PROP_MEDIA);
    oci.addRestriction(MergedRestriction
    	      .getCardinalityRestriction(QuestionWithMedia.PROP_MEDIA,
    	    		  1,1));
    
    //load ConditionalQuestion 
    oci = createNewOntClassInfo(ConditionalQuestion.MY_URI, factory, 5);
    oci.setResourceComment("A conditional question is a question that only is shown to the user when he/she has given a specific answer (trigger answer) to a specific  previous question.");
    oci.setResourceLabel("ConditionalQuestion");
    oci.addSuperClass(Question.MY_URI); 
    
    oci.addObjectProperty(ConditionalQuestion.PROP_TRIGGER_ANSWER).setFunctional();
    oci.addRestriction(MergedRestriction.getCardinalityRestriction(ConditionalQuestion.PROP_TRIGGER_ANSWER, 1, 1));//cambiado 
    
    oci.addObjectProperty(ConditionalQuestion.PROP_DEPENDS_ON).setFunctional();
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(ConditionalQuestion.PROP_DEPENDS_ON, 
      Question.MY_URI, 1, 1));
    
  //-------------------------------------------------------------------------------------------
    
    //load Questionnaire 
    oci = createNewOntClassInfo(Questionnaire.MY_URI, factory, 4);
    oci.setResourceComment("A questionnaire is a composition of questions and answers, given by an examined user");
    oci.setResourceLabel("Questionnaire");
    oci.addSuperClass(ManagedIndividual.MY_URI); 
    oci.addDatatypeProperty(Questionnaire.PROP_NAME);
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Questionnaire.PROP_NAME, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    
    oci.addDatatypeProperty(Questionnaire.PROP_DESCRIPTION);
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Questionnaire.PROP_DESCRIPTION, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    
    oci.addObjectProperty(Questionnaire.PROP_HAS_QUESTION).setFunctional();
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Questionnaire.PROP_HAS_QUESTION, 
      Question.MY_URI, 1, -1));
    
    oci.addDatatypeProperty(Questionnaire.PROP_ORDERED_QUESTIONS);
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Questionnaire.PROP_ORDERED_QUESTIONS, 
      TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
    
    
    
  //------------------------------------------------------------------------------------------- 
    
    //load Answer 
    oci = createNewOntClassInfo(Answer.MY_URI, factory, 8);
    oci.setResourceComment("An answer is the response to a question.");
    oci.setResourceLabel("Answer");
    oci.addSuperClass(ManagedIndividual.MY_URI); 
    
    oci.addObjectProperty(Answer.PROP_ANSWER_CONTENT);
    
    oci.addObjectProperty(Answer.PROP_IS_ASSOCIATED_TO_A_QUESTION).setFunctional();
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Answer.PROP_IS_ASSOCIATED_TO_A_QUESTION, 
      Question.MY_URI, 1, 1));
    
    
 //-------------------------------------------------------------------------------------------  
    
    //load AnsweredQuestionnaire 
    oci = createNewOntClassInfo(AnsweredQuestionnaire.MY_URI, factory, 0);
    oci.setResourceComment("An answered questionnaire contains the answers given by the examined user.");
    oci.setResourceLabel("AnsweredQuestionnaire");
    oci.addSuperClass(ManagedIndividual.MY_URI); 
    
    oci.addObjectProperty(AnsweredQuestionnaire.PROP_IS_ASSOCIATED_TO).setFunctional();
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(AnsweredQuestionnaire.PROP_IS_ASSOCIATED_TO, 
      Questionnaire.MY_URI, 1, 1));
    
    oci.addObjectProperty(AnsweredQuestionnaire.PROP_IS_ANSWERED_BY).setFunctional();
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(AnsweredQuestionnaire.PROP_IS_ANSWERED_BY, 
     User.MY_URI, 1, 1));
   
    oci.addObjectProperty(AnsweredQuestionnaire.PROP_IS_COMPOSED_BY).setFunctional();
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(AnsweredQuestionnaire.PROP_IS_COMPOSED_BY, 
      Answer.MY_URI, 1, -1));
    oci.addDatatypeProperty(AnsweredQuestionnaire.PROP_COMPLETENESS);
    oci.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(AnsweredQuestionnaire.PROP_COMPLETENESS, 
      TypeMapper.getDatatypeURI(Double.class), 1, 1));

    
    //load QuestionnaireService
    
    /**/
    oci = createNewOntClassInfo(QuestionnaireService.MY_URI, factory, 9);
    oci.setResourceComment("Description of the questionnaire service.");
    oci.setResourceLabel("QuestionnaireService");
    oci.addSuperClass(Service.MY_URI); 

    oci.addObjectProperty(QuestionnaireService.PROP_PROPOSED_QUESTIONNAIRE);
    oci.addRestriction(MergedRestriction.getAllValuesRestriction(
    		QuestionnaireService.PROP_PROPOSED_QUESTIONNAIRE,  Questionnaire.MY_URI));
    
    oci.addObjectProperty(QuestionnaireService.PROP_TARGET_USER);
    oci.addRestriction(MergedRestriction.getAllValuesRestriction(
    		QuestionnaireService.PROP_TARGET_USER,  User.MY_URI));
    
    
    oci.addObjectProperty(QuestionnaireService.PROP_GENERATES_ANSWERED_QUESTIONNAIRE);
    oci.addRestriction(MergedRestriction.getAllValuesRestriction(
    		QuestionnaireService.PROP_GENERATES_ANSWERED_QUESTIONNAIRE,  AnsweredQuestionnaire.MY_URI));
    
  }
 
}
