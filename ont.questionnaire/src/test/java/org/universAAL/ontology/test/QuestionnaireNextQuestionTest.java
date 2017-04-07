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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.universAAL.ennumerations.ontology.owl.PartsOfDay;
import org.universAAL.middleware.bus.junit.OntTestCase;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.profile.User;
import org.universAAL.ontology.questionnaire.AnsweredQuestionnaire;
import org.universAAL.ontology.questionnaire.ChoiceLabel;
import org.universAAL.ontology.questionnaire.ConditionalQuestion;
import org.universAAL.ontology.questionnaire.MultiChoiceQuestion;
import org.universAAL.ontology.questionnaire.Question;
import org.universAAL.ontology.questionnaire.Questionnaire;
import org.universAAL.ontology.questionnaire.SingleChoiceQuestion;

/**
 * This test checks the method nextQuestion, when the given questionnaire has
 * the questions ordered or out of order.
 * 
 * @author mdelafuente
 * 
 */

public class QuestionnaireNextQuestionTest extends OntTestCase {
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
    public void simulatePath(AnsweredQuestionnaire aq,
	    Map<Question, Object> userAnswers) {
	AnsweredQuestionnaire aqPathX = aq;
	Question q = aqPathX.nextQuestion();
	Question previousQuestion = null;
	ArrayList<Question> questions = new ArrayList<Question>(Arrays
		.asList(aqPathX.getAssociatedQuestionnaire().getQuestions()));

	while (q != null) {

	    if (!(aqPathX.getAssociatedQuestionnaire().isOrderedQuestions())) { // if
		// the
		// question
		// has
		// NOT
		// ordered
		// questions
		assertTrue(userAnswers.containsKey(q));
		aqPathX.answeredToQuestion(q, userAnswers.get(q));
		q = aqPathX.nextQuestion();
	    }

	    else { // the questions within a questionnaire are ordered
		if (previousQuestion == null)
		    previousQuestion = q;

		assertTrue(userAnswers.containsKey(q)
			&& (questions.indexOf(q) >= questions
				.indexOf(previousQuestion)));
		aqPathX.answeredToQuestion(q, userAnswers.get(q));
		previousQuestion = q;
		q = aqPathX.nextQuestion();
	    }
	}
    }

    @Test
    /**
     * The following test sets Path1, that consists of
     * q1,q2,q3,q4,q5,q8,q11
     */
    public void testPath1() {
	AnsweredQuestionnaire aqPath1 = new AnsweredQuestionnaire(
		questionnaire, peter);
	Map<Question, Object> userAnswers = new HashMap<Question, Object>();
	userAnswers.put(q1, Boolean.FALSE);
	userAnswers.put(q2, PartsOfDay.IN_THE_AFTERNOON);
	userAnswers.put(q3, Boolean.FALSE);
	Object[] mcqAnswers = { PartsOfDay.IN_THE_MORNING,
		PartsOfDay.IN_THE_EVENING };
	userAnswers.put(q4, mcqAnswers);
	userAnswers.put(q5, Boolean.TRUE);
	userAnswers.put(q8, Boolean.TRUE);
	userAnswers.put(q11, Boolean.FALSE);

	simulatePath(aqPath1, userAnswers);
    }

    @Test
    /**
     * The following test sets Path2, that consists of
     * q1,q2,q3,q4,q6,q7,q10
     */
    public void testPath2() {
	AnsweredQuestionnaire aqPath2 = new AnsweredQuestionnaire(
		questionnaire, peter);
	Map<Question, Object> userAnswers = new HashMap<Question, Object>();
	userAnswers.put(q1, Boolean.TRUE);
	userAnswers.put(q6, Boolean.TRUE);
	userAnswers.put(q10, Boolean.FALSE);
	userAnswers.put(q2, PartsOfDay.IN_THE_AFTERNOON);
	userAnswers.put(q3, Boolean.TRUE);
	userAnswers.put(q7, Boolean.FALSE);
	Object[] mcqAnswers = { PartsOfDay.IN_THE_MORNING,
		PartsOfDay.IN_THE_EVENING };
	userAnswers.put(q4, mcqAnswers);

	simulatePath(aqPath2, userAnswers);
    }

    @Test
    /**
     * The following test sets Path1, that consists of
     * q1,q2,q3,q4,q5,q8,q11
     */
    public void testPath1NotOrdered() {
	Questionnaire notOrderedQuestionnaire = questionnaire;
	notOrderedQuestionnaire.setName("Questionnaire 2");
	notOrderedQuestionnaire
		.setDescription("A questionnaire with not ordered questions");
	notOrderedQuestionnaire.setOrderedQuestions(false);
	AnsweredQuestionnaire aqPath1NO = new AnsweredQuestionnaire(
		notOrderedQuestionnaire, peter);
	Map<Question, Object> userAnswers = new HashMap<Question, Object>();
	userAnswers.put(q1, Boolean.FALSE);
	userAnswers.put(q2, PartsOfDay.IN_THE_AFTERNOON);
	userAnswers.put(q3, Boolean.FALSE);
	Object[] mcqAnswers = { PartsOfDay.IN_THE_MORNING,
		PartsOfDay.IN_THE_EVENING };
	userAnswers.put(q4, mcqAnswers);
	userAnswers.put(q5, Boolean.TRUE);
	userAnswers.put(q8, Boolean.TRUE);
	userAnswers.put(q11, Boolean.FALSE);

	simulatePath(aqPath1NO, userAnswers);
    }

}
