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
 * The following test class will check that the conditional questions associated
 * to a multi- trigger answer work properly.
 * 
 * @author mdelafuente
 * 
 */

public class QuestionnaireMultiTriggerTest extends OntTestCase {

    Questionnaire questionnaire;
    User peter;

    SingleChoiceQuestion q1;
    MultiChoiceQuestion q2;
    ConditionalQuestion q3;
    ConditionalQuestion q4;
    ConditionalQuestion q5;

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

	q1 = new SingleChoiceQuestion("Is tobacco bad for health?",
		Boolean.TRUE, TypeMapper.getDatatypeURI(Boolean.class),
		choices2);
	q2 = new MultiChoiceQuestion("When do you have to take your pills?",
		correctAnswers, correctAnswersURI, choices1);

	q3 = new ConditionalQuestion("Are you sure?", Boolean.FALSE, q1,
		TypeMapper.getDatatypeURI(Boolean.class), choices2);
	q4 = new ConditionalQuestion("Do you smoke?", Boolean.TRUE, q1,
		TypeMapper.getDatatypeURI(Boolean.class), choices2);

	q5 = new ConditionalQuestion("Do you agree with this schedule?",
		correctAnswers, q2, TypeMapper.getDatatypeURI(Boolean.class),
		choices2);

	Question[] questions = { q1, q2, q3, q4, q5 };
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
     * The following test tests that the conditional question associated to a
     * multi-trigger answer is correctly fired.
     */
    public void testMultiTriggerCQ() {
	AnsweredQuestionnaire aq = new AnsweredQuestionnaire(questionnaire,
		peter);
	Map<Question, Object> userAnswers = new HashMap<Question, Object>();

	userAnswers.put(q1, Boolean.TRUE);
	Object[] mcqAnswers = { PartsOfDay.IN_THE_MORNING,
		PartsOfDay.IN_THE_EVENING };
	userAnswers.put(q2, mcqAnswers);
	userAnswers.put(q4, Boolean.TRUE);
	userAnswers.put(q5, Boolean.TRUE);

	simulatePath(aq, userAnswers);

    }

    @Test
    /**
     * The following test tests that the conditional question associated to a
     * multi-trigger answer is correctly detected when evaluating its
     * correction. In this case, all the questions with correct answer
     * has been answered properly.
     */
    public void testMultiTriggerCQAnswers() {
	AnsweredQuestionnaire aq = new AnsweredQuestionnaire(questionnaire,
		peter);
	aq.answeredToQuestion(q1, Boolean.TRUE);
	Object[] mcqAnswers = { PartsOfDay.IN_THE_MORNING,
		PartsOfDay.IN_THE_EVENING };
	aq.answeredToQuestion(q2, mcqAnswers);
	aq.answeredToQuestion(q4, Boolean.TRUE);
	aq.answeredToQuestion(q5, Boolean.TRUE);

	assertTrue(aq.getNumberOfCorrectAnswers() == 2);
	assertTrue(aq.getNumberOfIncorrectAnswers() == 0);
	assertTrue(aq.getNumberOfNoCorrectAnswers() == 2);
    }

    @Test
    /**
     * The following test tests that the conditional question associated to a
     * multi-trigger answer is correctly detected when evaluating its
     * correction, even if the answers given in the multi-choice question
     * are not in the same order as expected. 
     * In this case, all the questions with correct answer
     * has been answered properly.
     */
    public void testMultiTriggerCQAnswersMessy() {
	AnsweredQuestionnaire aq = new AnsweredQuestionnaire(questionnaire,
		peter);
	aq.answeredToQuestion(q1, Boolean.TRUE);
	Object[] mcqAnswers = { PartsOfDay.IN_THE_EVENING,
		PartsOfDay.IN_THE_MORNING };
	aq.answeredToQuestion(q2, mcqAnswers);
	aq.answeredToQuestion(q4, Boolean.TRUE);
	aq.answeredToQuestion(q5, Boolean.TRUE);

	assertTrue(aq.getNumberOfCorrectAnswers() == 2);
	assertTrue(aq.getNumberOfIncorrectAnswers() == 0);
	assertTrue(aq.getNumberOfNoCorrectAnswers() == 2);
    }

    /**
     * The following test tests that the conditional question associated to a
     * multi-trigger answer is correctly detected when evaluating its
     * correction, even if the answers given in the multi-choice question are
     * not in the same order as expected. In this case, half of the questions
     * with correct answer has been answered properly, and the other half,
     * wrongly.
     */
    @Test
    public void testMultiTriggerCQAnswersIncorrect() {
	AnsweredQuestionnaire aq = new AnsweredQuestionnaire(questionnaire,
		peter);
	aq.answeredToQuestion(q1, Boolean.TRUE);
	Object[] mcqAnswers = { PartsOfDay.IN_THE_AFTERNOON,
		PartsOfDay.IN_THE_MORNING };
	aq.answeredToQuestion(q2, mcqAnswers);
	aq.answeredToQuestion(q4, Boolean.TRUE);
	aq.answeredToQuestion(q5, Boolean.TRUE);

	assertTrue(aq.getNumberOfCorrectAnswers() == 1);
	assertTrue(aq.getNumberOfIncorrectAnswers() == 1);
	assertTrue(aq.getNumberOfNoCorrectAnswers() == 2);
    }

}
