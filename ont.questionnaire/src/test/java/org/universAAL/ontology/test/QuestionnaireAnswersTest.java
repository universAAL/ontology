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
 * The following test class will check that the methods related to answer issues
 * work properly.
 * 
 * @author mdelafuente
 * 
 */
public class QuestionnaireAnswersTest extends OntTestCase {

    Questionnaire questionnaire;
    User peter;

    SingleChoiceQuestion q1;
    SingleChoiceQuestion q2;
    ConditionalQuestion q3;
    MultiChoiceQuestion q4;
    SingleChoiceQuestion q5;
    ConditionalQuestion q6;
    SingleChoiceQuestion q7;

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

	q1 = new SingleChoiceQuestion(
		"Are vegetables good for improving your health condition?",
		Boolean.TRUE, TypeMapper.getDatatypeURI(Boolean.class),
		choices2);
	q2 = new SingleChoiceQuestion("Would you answer one more question?",
		TypeMapper.getDatatypeURI(Boolean.class), choices2);
	q3 = new ConditionalQuestion(
		"When did your caregiver recommended you to practice your relaxation exercices?",
		Boolean.TRUE, q2, correctAnswersURI, choices1, correctAnswers);
	q4 = new MultiChoiceQuestion("When do you have to take your pills?",
		correctAnswers, correctAnswersURI, choices1);
	q5 = new SingleChoiceQuestion("When do you prefer to exercise?",
		TypeMapper.getDatatypeURI(PartsOfDay.class), choices1);
	q6 = new ConditionalQuestion(
		"Do you usually practice sport at this time?",
		PartsOfDay.IN_THE_AFTERNOON, q5, TypeMapper
			.getDatatypeURI(Boolean.class), choices2);
	q7 = new SingleChoiceQuestion("When are you exercising tomorrow?",
		PartsOfDay.IN_THE_MORNING, TypeMapper
			.getDatatypeURI(PartsOfDay.class), choices1);

	Question[] questions = { q1, q2, q3, q4, q5, q6, q7 };
	questionnaire.setQuestions(questions);
    }

    /**
     * In the following test all the questions have been answered and all are
     * correct (the ones that have a correct answer, that is: q1,q3,q4 and q7).
     */

    @Test
    public void testAllCorrectAnswers() {
	AnsweredQuestionnaire aq = new AnsweredQuestionnaire(questionnaire,
		peter);

	aq.answeredToQuestion(q1, Boolean.TRUE);
	aq.answeredToQuestion(q2, Boolean.TRUE);
	Object[] mcqAnswers = { PartsOfDay.IN_THE_MORNING,
		PartsOfDay.IN_THE_EVENING };
	aq.answeredToQuestion(q3, mcqAnswers);
	aq.answeredToQuestion(q4, mcqAnswers);
	aq.answeredToQuestion(q5, PartsOfDay.IN_THE_AFTERNOON);
	aq.answeredToQuestion(q6, Boolean.TRUE);
	aq.answeredToQuestion(q7, PartsOfDay.IN_THE_MORNING);

	assertTrue(aq.getNumberOfCorrectAnswers() == 4);
	assertTrue(aq.getNumberOfIncorrectAnswers() == 0);
	assertTrue(aq.getNumberOfNoCorrectAnswers() == 3);

    }

    /**
     * In the following test all the questions have been answered and all are
     * incorrect (the ones that have a correct answer, that is: q1,q3,q4 and
     * q7).
     */

    @Test
    public void testNoCorrectAnswers() {
	AnsweredQuestionnaire aq = new AnsweredQuestionnaire(questionnaire,
		peter);

	aq.answeredToQuestion(q1, Boolean.FALSE);
	aq.answeredToQuestion(q2, Boolean.TRUE);
	Object[] mcqAnswers = { PartsOfDay.IN_THE_MORNING,
		PartsOfDay.IN_THE_AFTERNOON };
	aq.answeredToQuestion(q3, mcqAnswers);
	aq.answeredToQuestion(q4, mcqAnswers);
	aq.answeredToQuestion(q5, PartsOfDay.IN_THE_AFTERNOON);
	aq.answeredToQuestion(q6, Boolean.TRUE);
	aq.answeredToQuestion(q7, PartsOfDay.IN_THE_EVENING);

	assertTrue(aq.getNumberOfCorrectAnswers() == 0);
	assertTrue(aq.getNumberOfIncorrectAnswers() == 4);
	assertTrue(aq.getNumberOfNoCorrectAnswers() == 3);

    }

    /**
     * In the following test all the questions have been answered and some are
     * incorrect (q3 and q4) and some are correct (q1 and q7).
     */
    @Test
    public void testSomeCorrectAnswers() {
	AnsweredQuestionnaire aq = new AnsweredQuestionnaire(questionnaire,
		peter);

	aq.answeredToQuestion(q1, Boolean.TRUE);
	aq.answeredToQuestion(q2, Boolean.TRUE);
	Object[] mcqAnswers = { PartsOfDay.IN_THE_MORNING,
		PartsOfDay.IN_THE_AFTERNOON };
	aq.answeredToQuestion(q3, mcqAnswers);
	aq.answeredToQuestion(q4, mcqAnswers);
	aq.answeredToQuestion(q5, PartsOfDay.IN_THE_AFTERNOON);
	aq.answeredToQuestion(q6, Boolean.TRUE);
	aq.answeredToQuestion(q7, PartsOfDay.IN_THE_MORNING);

	assertTrue(aq.getNumberOfCorrectAnswers() == 2);
	assertTrue(aq.getNumberOfIncorrectAnswers() == 2);
	assertTrue(aq.getNumberOfNoCorrectAnswers() == 3);

    }

    @Test
    /**
     * The following test, tests the percentages methods.
     * For this test, we have answerer right the same number of questions
     * that we have answered wrong.
     */
    public void testPercentages1() {
	AnsweredQuestionnaire aq = new AnsweredQuestionnaire(questionnaire,
		peter);

	aq.answeredToQuestion(q1, Boolean.TRUE);
	aq.answeredToQuestion(q2, Boolean.TRUE);
	Object[] mcqAnswers = { PartsOfDay.IN_THE_MORNING,
		PartsOfDay.IN_THE_AFTERNOON };
	aq.answeredToQuestion(q3, mcqAnswers);
	aq.answeredToQuestion(q4, mcqAnswers);
	aq.answeredToQuestion(q5, PartsOfDay.IN_THE_AFTERNOON);
	aq.answeredToQuestion(q6, Boolean.TRUE);
	aq.answeredToQuestion(q7, PartsOfDay.IN_THE_MORNING);

	assertTrue(aq.getCorrectAnswersPercentage() == 50.0);
	assertTrue(aq.getIncorrectAnswersPercentage() == 50.0);
    }

    @Test
    /**
     * The following test, tests the percentages methods.
     * For this test, we have answerer right one question, and
     * three wrongly.
     */
    public void testPercentages2() {
	AnsweredQuestionnaire aq = new AnsweredQuestionnaire(questionnaire,
		peter);

	aq.answeredToQuestion(q1, Boolean.TRUE);
	aq.answeredToQuestion(q2, Boolean.TRUE);
	Object[] mcqAnswers = { PartsOfDay.IN_THE_MORNING,
		PartsOfDay.IN_THE_AFTERNOON };
	aq.answeredToQuestion(q3, mcqAnswers);
	aq.answeredToQuestion(q4, mcqAnswers);
	aq.answeredToQuestion(q5, PartsOfDay.IN_THE_AFTERNOON);
	aq.answeredToQuestion(q6, Boolean.TRUE);
	aq.answeredToQuestion(q7, PartsOfDay.IN_THE_EVENING);

	assertTrue(aq.getCorrectAnswersPercentage() == 25.0);
	assertTrue(aq.getIncorrectAnswersPercentage() == 75.0);
    }

    /**
     * The following test, tests the percentages methods. For this test, we have
     * answerer right all the questions.
     */
    @Test
    public void testPercentages3() {
	AnsweredQuestionnaire aq = new AnsweredQuestionnaire(questionnaire,
		peter);

	aq.answeredToQuestion(q1, Boolean.TRUE);
	aq.answeredToQuestion(q2, Boolean.TRUE);
	Object[] mcqAnswers = { PartsOfDay.IN_THE_MORNING,
		PartsOfDay.IN_THE_EVENING };
	aq.answeredToQuestion(q3, mcqAnswers);
	aq.answeredToQuestion(q4, mcqAnswers);
	aq.answeredToQuestion(q5, PartsOfDay.IN_THE_AFTERNOON);
	aq.answeredToQuestion(q6, Boolean.TRUE);
	aq.answeredToQuestion(q7, PartsOfDay.IN_THE_MORNING);

	assertTrue(aq.getCorrectAnswersPercentage() == 100.0);
	assertTrue(aq.getIncorrectAnswersPercentage() == 0.0);

    }

    /**
     * The following test, tests the percentages methods. For this test, we have
     * answerer right one question, and three wrongly.
     */
    @Test
    public void testXQuestionGetter() {
	AnsweredQuestionnaire aq = new AnsweredQuestionnaire(questionnaire,
		peter);

	aq.answeredToQuestion(q1, Boolean.TRUE);
	aq.answeredToQuestion(q2, Boolean.TRUE);
	Object[] mcqAnswers = { PartsOfDay.IN_THE_MORNING,
		PartsOfDay.IN_THE_AFTERNOON };
	aq.answeredToQuestion(q3, mcqAnswers);
	aq.answeredToQuestion(q4, mcqAnswers);
	aq.answeredToQuestion(q5, PartsOfDay.IN_THE_AFTERNOON);
	aq.answeredToQuestion(q6, Boolean.TRUE);
	aq.answeredToQuestion(q7, PartsOfDay.IN_THE_EVENING);

	ArrayList<Question> incorrectQuestions = new ArrayList<Question>(Arrays
		.asList(aq.getAssociatedQuestions(aq.getIncorrectAnswers())));
	ArrayList<Question> correctQuestions = new ArrayList<Question>(Arrays
		.asList(aq.getAssociatedQuestions(aq.getCorrectAnswers())));
	ArrayList<Question> noCorrectQuestions = new ArrayList<Question>(Arrays
		.asList(aq.getAssociatedQuestions(aq.getNoCorrectAnswers())));

	assertTrue(incorrectQuestions.contains(q3)
		&& incorrectQuestions.contains(q4)
		&& incorrectQuestions.contains(q7)
		&& incorrectQuestions.size() == 3);
	assertTrue(correctQuestions.contains(q1)
		&& correctQuestions.size() == 1);
	assertTrue(noCorrectQuestions.contains(q2)
		&& noCorrectQuestions.contains(q5)
		&& noCorrectQuestions.contains(q6)
		&& noCorrectQuestions.size() == 3);
    }

}
