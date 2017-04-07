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

package org.universAAL.ontology.test;

/**
 * The following test class will check that the methods
 * related to question issues work properly. 
 * @author mdelafuente
 *
 */

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.universAAL.ennumerations.ontology.owl.PartsOfDay;
import org.universAAL.middleware.bus.junit.OntTestCase;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.profile.User;
import org.universAAL.ontology.questionnaire.ChoiceLabel;
import org.universAAL.ontology.questionnaire.ConditionalQuestion;
import org.universAAL.ontology.questionnaire.MultiChoiceQuestion;
import org.universAAL.ontology.questionnaire.Question;
import org.universAAL.ontology.questionnaire.Questionnaire;
import org.universAAL.ontology.questionnaire.SingleChoiceQuestion;

public class QuestionnaireQuestionsTest extends OntTestCase {

    Questionnaire questionnaire;
    User peter;

    SingleChoiceQuestion q1;
    SingleChoiceQuestion q2;
    SingleChoiceQuestion q3;
    MultiChoiceQuestion q4;
    ConditionalQuestion q5;
    ConditionalQuestion q6;
    ConditionalQuestion q7;
    ConditionalQuestion q8;
    ConditionalQuestion q9;
    ConditionalQuestion q10;
    ConditionalQuestion q11;
    ConditionalQuestion q12;
    ConditionalQuestion q13;

    @Override
    protected void setUp() throws Exception {
		super.setUp();
	questionnaire = new Questionnaire("First questionnaire",
		"Test questionnaire");
	peter = new User("Pepe");

	ChoiceLabel choice1 = new ChoiceLabel(PartsOfDay.IN_THE_MORNING,
		"In the morning");
	ChoiceLabel choice2 = new ChoiceLabel(PartsOfDay.IN_THE_AFTERNOON,
		"In the afternoon");
	ChoiceLabel choice3 = new ChoiceLabel(PartsOfDay.IN_THE_EVENING,
		"In the evening");
	ChoiceLabel choice4 = new ChoiceLabel(Boolean.TRUE, "Yes");
	ChoiceLabel choice5 = new ChoiceLabel(Boolean.FALSE, "No");

	ChoiceLabel[] choices1 = { choice1, choice2, choice3 };
	ChoiceLabel[] choices2 = { choice4, choice5 };

	Object[] correctAnswers = { PartsOfDay.IN_THE_MORNING,
		PartsOfDay.IN_THE_EVENING };
	String[] correctAnswersURI = {
		TypeMapper.getDatatypeURI(PartsOfDay.class),
		TypeMapper.getDatatypeURI(PartsOfDay.class) };

	q1 = new SingleChoiceQuestion("Do you plan to follow the treatment?",
		TypeMapper.getDatatypeURI(Boolean.class), choices2);
	q2 = new SingleChoiceQuestion("When do you prefer to exercise?",
		TypeMapper.getDatatypeURI(PartsOfDay.class), choices1);
	q3 = new SingleChoiceQuestion(
		"Have you ever done this treatment before?", TypeMapper
			.getDatatypeURI(Boolean.class), choices2);
	q4 = new MultiChoiceQuestion("When do you have to take your pills?",
		correctAnswers, correctAnswersURI, choices1);
	q5 = new ConditionalQuestion("Are you sure?", Boolean.FALSE, q1,
		TypeMapper.getDatatypeURI(Boolean.class), choices2);
	q6 = new ConditionalQuestion("Do you usually practice sport?",
		Boolean.TRUE, q1, TypeMapper.getDatatypeURI(Boolean.class),
		choices2);
	q7 = new ConditionalQuestion("Do you have any questions?",
		Boolean.TRUE, q3, TypeMapper.getDatatypeURI(Boolean.class),
		choices2);
	q8 = new ConditionalQuestion(
		"Do you know this decission can affect the rest of your life?",
		Boolean.TRUE, q5, TypeMapper.getDatatypeURI(Boolean.class),
		choices2);
	q9 = new ConditionalQuestion(
		"Will you consider to change some health habits?",
		Boolean.FALSE, q5, TypeMapper.getDatatypeURI(Boolean.class),
		choices2);
	q10 = new ConditionalQuestion(
		"It has been a while since the last time you practiced sport?",
		Boolean.TRUE, q6, TypeMapper.getDatatypeURI(Boolean.class),
		choices2);
	q11 = new ConditionalQuestion("Will you explain us why?", Boolean.TRUE,
		q8, TypeMapper.getDatatypeURI(String.class));
	q12 = new ConditionalQuestion("Tell us which ones?", Boolean.TRUE, q9,
		TypeMapper.getDatatypeURI(String.class));
	q13 = new ConditionalQuestion("Please, tell us why not", Boolean.TRUE,
		q9, TypeMapper.getDatatypeURI(String.class));

	Question[] questions = { q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11,
		q12, q13 };
	questionnaire.setQuestions(questions);
    }

    @Test
    /**
     * This test checks if the questionnaire have some specific
     * type of questions.
     */
    public void testContainsSpecificTypeQuestions() {
	assertTrue(questionnaire.containsConditionalQuestion());
	assertTrue(questionnaire.containsSingleChoiceQuestion());
	assertTrue(questionnaire.containsMultiChoiceQuestion());
	assertFalse(questionnaire.containsQuestionWithMedia());
    }

    @Test
    /**
     * This test checks the number of specific questions within a questionnaire.
     */
    public void testNumberOfSpecificTypeQuestions() {
	assertTrue(questionnaire
		.getNumberOfXQuestion(ConditionalQuestion.MY_URI) == 9);
	assertTrue(questionnaire
		.getNumberOfXQuestion(SingleChoiceQuestion.MY_URI) == 3);
	assertTrue(questionnaire
		.getNumberOfXQuestion(MultiChoiceQuestion.MY_URI) == 1);
    }

    @Test
    /**
     * This test checks the getters of specific
     * type of questions within the questionnaire.
     */
    public void testGetSpecificTypeQuestions() {
	ArrayList<ConditionalQuestion> cq = new ArrayList<ConditionalQuestion>(
		Arrays.asList(questionnaire.getConditionalQuestions()));
	ArrayList<SingleChoiceQuestion> scq = new ArrayList<SingleChoiceQuestion>(
		Arrays.asList(questionnaire.getSingleChoiceQuestions()));
	ArrayList<MultiChoiceQuestion> mcq = new ArrayList<MultiChoiceQuestion>(
		Arrays.asList(questionnaire.getMultiChoiceQuestions()));
	assertTrue(cq.size() == 9 && cq.contains(q5) && cq.contains(q6)
		&& cq.contains(q7) && cq.contains(q8) && cq.contains(q9)
		&& cq.contains(q10) && cq.contains(q11) && cq.contains(q12)
		&& cq.contains(q13));
	assertTrue((scq.size() == 3) && (scq.contains(q1))
		&& (scq.contains(q2)) && (scq.contains(q3)));
	assertTrue((mcq.size() == 1) && (mcq.contains(q4)));

    }

    /**
     * The following test checks the method getNumberOfQuestions. The
     * questionnaire used has 13 questions so the expected result is 13.
     */
    @Test
    public void testNumberOfQuestions() {
	assertTrue(questionnaire.getNumberOfTotalQuestions() == 13);
    }
}
