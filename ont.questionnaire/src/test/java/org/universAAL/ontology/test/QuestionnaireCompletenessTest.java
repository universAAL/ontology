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
 * The following test class will check the methods related to the completeness
 * of the questionnaire.
 * 
 * @author mdelafuente
 * 
 */
public class QuestionnaireCompletenessTest extends OntTestCase {

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
     * The following test answers all the questions in the test
     * so the completeness expected is 100%
     */
    public void testCheckCompletenessAQ1() {
	AnsweredQuestionnaire aq = new AnsweredQuestionnaire(questionnaire,
		peter);

	aq.answeredToQuestion(q1, Boolean.FALSE);
	aq.answeredToQuestion(q2, PartsOfDay.IN_THE_AFTERNOON);
	aq.answeredToQuestion(q3, Boolean.FALSE);
	Object[] mcqAnswers = { PartsOfDay.IN_THE_MORNING,
		PartsOfDay.IN_THE_EVENING };
	aq.answeredToQuestion(q4, mcqAnswers);
	aq.answeredToQuestion(q5, Boolean.TRUE);
	aq.answeredToQuestion(q8, Boolean.TRUE);
	aq.answeredToQuestion(q11, Boolean.FALSE);

	double expectedCompleteness = 100;
	assertTrue(aq.calculateCompleteness() == expectedCompleteness);
    }

    @Test
    /**
     * The following test answers some of the questions in the test
     * so the completeness expected is (4/7)%
     */
    public void testCheckCompletenessAQ2() {
	AnsweredQuestionnaire aq = new AnsweredQuestionnaire(questionnaire,
		peter);

	aq.answeredToQuestion(q1, Boolean.FALSE);
	aq.answeredToQuestion(q5, Boolean.TRUE);
	aq.answeredToQuestion(q8, Boolean.TRUE);
	aq.answeredToQuestion(q11, Boolean.FALSE);

	double expectedCompleteness = Math.floor((4.0 / 7) * 10000);
	double realCompleteness = Math.floor(aq.calculateCompleteness() * 100);
	assertTrue(expectedCompleteness == realCompleteness);
    }

    /**
     * The following test answers no questions in the test so the completeness
     * expected is 0%
     */
    @Test
    public void testCheckCompletenessAQ3() {
	AnsweredQuestionnaire aq = new AnsweredQuestionnaire(questionnaire,
		peter);

	double expectedCompleteness = 0;
	assertTrue(aq.calculateCompleteness() == expectedCompleteness);
    }

    /**
     * The following test answers some of the questions in the test so the
     * completeness expected is (4/5)%
     */
    @Test
    public void testCheckCompletenessAQ4() {
	AnsweredQuestionnaire aq = new AnsweredQuestionnaire(questionnaire,
		peter);

	aq.answeredToQuestion(q2, PartsOfDay.IN_THE_AFTERNOON);
	aq.answeredToQuestion(q3, Boolean.FALSE);
	aq.answeredToQuestion(q7, Boolean.FALSE);
	Object[] mcqAnswers = { PartsOfDay.IN_THE_MORNING,
		PartsOfDay.IN_THE_EVENING };
	aq.answeredToQuestion(q4, mcqAnswers);

	double expectedCompleteness = (4.0 / 5) * 100;
	assertTrue(aq.calculateCompleteness() == expectedCompleteness);
    }

}
