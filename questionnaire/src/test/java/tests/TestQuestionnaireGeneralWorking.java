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

package tests;

/**
 * The following test class will check the general
 * working when building a questionnaire. We will
 * check that all the methods that inserts the properties
 * of a question work correctly. This test has been
 * checked by visual inspection.
 * @author mdelafuente
 *
 */
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.ui.owl.UIBusOntology;
import org.universAAL.ontology.ProfileOntology;
import org.universAAL.ontology.profile.User;
import org.universaal.ennumerations.ontology.owl.PartsOfDay;
import org.universaal.ennumerations.ontology.owl.QuestionnaireEnnumerationsOntology;
import org.universaal.ontology.owl.ChoiceLabel;
import org.universaal.ontology.owl.Question;
import org.universaal.ontology.owl.Questionnaire;
import org.universaal.ontology.owl.QuestionnaireOntology;

public class TestQuestionnaireGeneralWorking extends SuperTestQuestionnaire{
	
	Questionnaire questionnaire; 
	User peter;
	
	@Before
	public void setUp(){
		
		super.registerAllOntologies();

		questionnaire = new Questionnaire("First questionnaire", "Test questionnaire");
		peter = new User("Pepe");
		ChoiceLabel choice1 = new ChoiceLabel(PartsOfDay.IN_THE_MORNING, "In the morning");
		ChoiceLabel choice2 = new ChoiceLabel(PartsOfDay.IN_THE_AFTERNOON, "In the afternoon");
		ChoiceLabel choice3 = new ChoiceLabel(PartsOfDay.IN_THE_EVENING, "In the evening");
		ChoiceLabel choice4 = new ChoiceLabel(Boolean.TRUE, "Yes");
		ChoiceLabel choice5 = new ChoiceLabel(Boolean.FALSE, "No");
		
		ChoiceLabel[] choices1 = {choice1, choice2, choice3};
		ChoiceLabel[] choices2 = {choice4, choice5};
		
		Object[] correctAnswers ={PartsOfDay.IN_THE_MORNING, PartsOfDay.IN_THE_EVENING};
		String[] correctAnswersURI = {TypeMapper.getDatatypeURI(PartsOfDay.class),TypeMapper.getDatatypeURI(PartsOfDay.class)};
		
		Question q1 = questionnaire.writeASingleChoiceQuestion("Do you plan to follow the treatment?", TypeMapper.getDatatypeURI(Boolean.class), choices2);

		Question q2 = questionnaire.writeAConditionalQuestion("Are you sure?", Boolean.FALSE, q1,TypeMapper.getDatatypeURI(Boolean.class), choices2);
		Question q3 = questionnaire.writeAConditionalQuestion("Do you usually practice sport?", Boolean.TRUE, q1, TypeMapper.getDatatypeURI(Boolean.class), choices2);
		
		Question q4 = questionnaire.writeAConditionalQuestion("Do you know this decission can affect the rest of your life?", Boolean.TRUE, q2, TypeMapper.getDatatypeURI(Boolean.class), choices2);
		Question q5 = questionnaire.writeAConditionalQuestion("Will you consider to change some health habits?", Boolean.FALSE, q2, TypeMapper.getDatatypeURI(Boolean.class), choices2);
		questionnaire.writeAConditionalQuestion("It has been a while since the last time you practiced sport?", Boolean.TRUE, q3, TypeMapper.getDatatypeURI(Boolean.class), choices2);
		
		questionnaire.writeAConditionalQuestion("Will you explain us why?", Boolean.TRUE, q4,TypeMapper.getDatatypeURI(String.class));
		questionnaire.writeAConditionalQuestion("Tell us which ones?", Boolean.TRUE, q5, TypeMapper.getDatatypeURI(String.class));
		questionnaire.writeAConditionalQuestion("Please, tell us why not", Boolean.FALSE, q5, TypeMapper.getDatatypeURI(String.class));
		
		questionnaire.writeASingleChoiceQuestion("When do you prefer to exercise?", TypeMapper.getDatatypeURI(PartsOfDay.class), choices1);
		Question q7 = questionnaire.writeASingleChoiceQuestion("Have you ever done this treatment before?", TypeMapper.getDatatypeURI(Boolean.class), choices2);
		questionnaire.writeAConditionalQuestion("Do you have any questions?", Boolean.TRUE, q7, TypeMapper.getDatatypeURI(Boolean.class), choices2);
		questionnaire.writeAMultiChoiceQuestion("When do you have to take your pills?",correctAnswers,correctAnswersURI,choices1);
	
	}
	
	
	@Test
	/**
	 * The following test prints the full questionnaire.
	 */
	public void testWriteQuestionnaire(){
		System.out.println(questionnaire.questionnaireToString());
	}
}
