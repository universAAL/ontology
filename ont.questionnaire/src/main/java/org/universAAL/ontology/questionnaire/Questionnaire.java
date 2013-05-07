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
package org.universAAL.ontology.questionnaire;

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.ui.rdf.MediaObject;

/**
 * This class describes the concept of Questionnaire, its properties and its
 * associated methods. A questionnaire is a composition of questions and
 * answers, given by an examined user.
 * 
 * @author mdelafuente
 * 
 */
// NAMESPACE & PROPERTIES
public class Questionnaire extends ManagedIndividual {
    public static final String MY_URI = QuestionnaireOntology.NAMESPACE
	    + "Questionnaire";
    public static final String PROP_NAME = QuestionnaireOntology.NAMESPACE
	    + "name";
    public static final String PROP_DESCRIPTION = QuestionnaireOntology.NAMESPACE
	    + "description";
    public static final String PROP_HAS_QUESTION = QuestionnaireOntology.NAMESPACE
	    + "hasQuestion";
    public static final String PROP_ORDERED_QUESTIONS = QuestionnaireOntology.NAMESPACE
	    + "orderedQuestions";

    // CONSTRUCTORS
    public Questionnaire() {
	super();
    }

    public Questionnaire(String uri) {
	super(uri);
    }

    public Questionnaire(String name, String description, Question[] questions) {
	this.setName(name);
	this.setDescription(description);
	this.setQuestions(questions);
	this.setOrderedQuestions(true); // by default, the questions within a
	// questionnaire are ordered.
    }

    public Questionnaire(String name, String description, Question question) {
	this.setName(name);
	this.setDescription(description);
	this.addQuestion(question);
	this.setOrderedQuestions(true); // by default, the questions within a
	// questionnaire are ordered.
    }

    public Questionnaire(String name, String description, Question[] questions,
	    boolean ordered) {
	this.setName(name);
	this.setDescription(description);
	this.setQuestions(questions);
	this.setOrderedQuestions(ordered);
    }

    public Questionnaire(String name, String description) {
	this.setName(name);
	this.setDescription(description);
	this.setOrderedQuestions(true); // by default, the questions within a
	// questionnaire are ordered.
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true && props.containsKey(PROP_NAME)
		&& props.containsKey(PROP_DESCRIPTION)
		&& props.containsKey(PROP_HAS_QUESTION)
		&& props.containsKey(PROP_ORDERED_QUESTIONS);
    }

    // GETTERS & SETTERS

    /**
     * The following method gets the questions associated to a questionnaire.
     * For more intuitive use, the method's name has been changed from
     * "getHasQuestion" to "getQuestions"
     * 
     * @return Question[] ({@link Question})
     * @see Questionnaire
     * @see Question
     */
    public Question[] getQuestions() {
	Object propList = props.get(PROP_HAS_QUESTION);
	if (propList instanceof List) {
	    return (Question[]) ((List) propList).toArray(new Question[0]);
	} else {
	    List returnList = new ArrayList();
	    if (propList != null)
		returnList.add((Question) propList);
	    return (Question[]) returnList.toArray(new Question[0]);
	}
    }

    /**
     * The following method sets the questions associated to a questionnaire.
     * For more intuitive use, the method's name has been changed from
     * "setHasQuestion" to "setQuestions"
     * 
     * @param questions
     *            , the array of questions that composes the questionnaire
     * @see Question
     */
    public void setQuestions(Question[] questions) {
	List propList = new ArrayList(questions.length);
	for (int i = 0; i < questions.length; i++) {
	    propList.add(questions[i]);
	}
	props.put(PROP_HAS_QUESTION, propList);
    }

    /**
     * The following method sets the question associated to a questionnaire.
     * 
     * @param question
     *            , the array of questions that composes the questionnaire
     * @see Question
     */
    public void addQuestion(Question question) {
	Object propList = props.get(PROP_HAS_QUESTION);
	if (propList instanceof List) {
	    List list = (List) propList;
	    list.add(question);
	    props.put(PROP_HAS_QUESTION, list);
	} else if (propList == null) {
	    props.put(PROP_HAS_QUESTION, question);
	} else {
	    List list = new ArrayList();
	    list.add((Question) propList);
	    list.add(question);
	    props.put(PROP_HAS_QUESTION, list);
	}
    }

    /**
     * The following method gets the name of a questionnaire
     * 
     * @return the questionnaire's name ({@link String})
     */
    public String getName() {
	return (String) props.get(PROP_NAME);
    }

    /**
     * The following method sets the name of a questionnaire
     * 
     * @param name
     *            , the questionnaire's name ({@link String})
     */
    public void setName(String qName) {
	if (qName != null)
	    props.put(PROP_NAME, qName);
    }

    /**
     * The following method gets the description of a questionnaire
     * 
     * @return the questionnaire's name ({@link String})
     */
    public String getDescription() {
	return (String) props.get(PROP_DESCRIPTION);
    }

    /**
     * The following method sets the name of a questionnaire
     * 
     * @param qDescription
     *            , the questionnaire's name ({@link String})
     */
    public void setDescription(String qDescription) {
	if (qDescription != null)
	    props.put(PROP_DESCRIPTION, qDescription);
    }

    /**
     * The following method checks if the questions within a questionnaire are
     * ordered.
     * 
     * @return true if the questions are ordered
     * @return false if the questions are NOT ordered
     */
    public boolean isOrderedQuestions() {
	Boolean b = (Boolean) props.get(PROP_ORDERED_QUESTIONS);
	return (b == null) ? false : b.booleanValue();
    }

    /**
     * The following method sets if the questions within a questionnaire are
     * ordered or not.
     * 
     * @param isOrdered
     *            (true if the questions are ordered, false if not)
     */
    public void setOrderedQuestions(boolean isOrdered) {
	props.put(PROP_ORDERED_QUESTIONS, Boolean.valueOf(isOrdered));
    }

    // OTHER METHODS

    /**
     * The following method calculates the number of questions within a
     * questionnaire.
     * 
     * @return number of questions ({@link integer})
     */
    public int getNumberOfTotalQuestions() {
	Question[] q = getQuestions();
	int noq = q.length;
	return noq;
    }

    /**
     * The following method checks if the questionnaire contains
     * ConditionalQuestions.
     * 
     * @return true if the questionnaire contains conditional questions
     * @return false if the questionnaire doesn't contain conditional questions
     * @see ConditionalQuestion
     */
    public boolean containsConditionalQuestion() {
	Question[] questions = getQuestions();

	for (int i = 0; i < questions.length; i++) {
	    String className = questions[i].getClassURI();
	    if (className.equals(ConditionalQuestion.MY_URI))
		return true;
	}
	return false;
    }

    /**
     * The following method checks if the questionnaire contains
     * MultiChoiceQuestions
     * 
     * @return true if the questionnaire contains multi-choice questions
     * @return false if the questionnaire doesn't contain multi-choice questions
     * @see MultiChoiceQuestion
     */
    public boolean containsMultiChoiceQuestion() {
	Question[] questions = getQuestions();
	for (int i = 0; i < questions.length; i++) {
	    String className = questions[i].getClassURI();
	    if (className.equals(MultiChoiceQuestion.MY_URI))
		return true;
	}
	return false;
    }

    /**
     * The following method checks if the questionnaire contains
     * SingleChoiceQuestions
     * 
     * @return true if the questionnaire contains single-choice questions
     * @return false if the questionnaire doesn't contain single-choice
     *         questions
     * @see SingleChoiceQuestion
     */
    public boolean containsSingleChoiceQuestion() {
	Question[] questions = getQuestions();
	for (int i = 0; i < questions.length; i++) {
	    String className = questions[i].getClassURI();
	    if (className.equals(SingleChoiceQuestion.MY_URI))
		return true;
	}
	return false;
    }

    /**
     * The following method checks if the questionnaire contains
     * QuestionWithMedia
     * 
     * @return true if the questionnaire contains questions with media
     * @return false if the questionnaire doesn't contain questions with media
     * @see QuestionWithMedia
     */
    public boolean containsQuestionWithMedia() {
	Question[] questions = getQuestions();
	for (int i = 0; i < questions.length; i++) {
	    String className = questions[i].getClassURI();
	    if (className.equals(QuestionWithMedia.MY_URI))
		return true;
	}
	return false;
    }

    /**
     * The following method returns all the ConditionalChoiceQuestions within a
     * questionnaire.
     * 
     * @return the set of conditional-choice questions
     * @return null if there is not ConditionalQuestions in the questionnaire
     * @see ConditionalChoiceQuestion
     */
    public ConditionalQuestion[] getConditionalQuestions() {
	Question[] questions = getQuestions();
	int numberOfCQ = getNumberOfXQuestion(ConditionalQuestion.MY_URI);
	ConditionalQuestion[] conditionalQuestions;
	int index = 0;
	if (containsMultiChoiceQuestion()) {
	    conditionalQuestions = new ConditionalQuestion[numberOfCQ];
	    for (int i = 0; i < questions.length; i++) {
		String className = questions[i].getClassURI();
		if (className.equals(ConditionalQuestion.MY_URI)) {
		    conditionalQuestions[index] = (ConditionalQuestion) questions[i];
		    index++;
		}
	    }

	    return conditionalQuestions;
	}
	return null;
    }

    /**
     * The following method returns all the MultiChoiceQuestions within a
     * questionnaire. Although a conditional question can be itself also a
     * multi-choice or single-choice question, we consider them separately.
     * 
     * @return the set of multi-choice questions
     * @return null if there is not MultiChoiceQuestions in the questionnaire
     * @see MultiChoiceQuestion
     */
    public MultiChoiceQuestion[] getMultiChoiceQuestions() {
	Question[] questions = getQuestions();
	int numberOfMCQ = getNumberOfXQuestion(MultiChoiceQuestion.MY_URI);
	int index = 0;
	if (containsMultiChoiceQuestion()) {
	    MultiChoiceQuestion[] multiChoiceQuestions = new MultiChoiceQuestion[numberOfMCQ];
	    for (int i = 0; i < questions.length; i++) {
		String className = questions[i].getClassURI();
		if (className.equals(MultiChoiceQuestion.MY_URI)) {
		    multiChoiceQuestions[index] = (MultiChoiceQuestion) questions[i];
		    index++;
		}
	    }
	    return multiChoiceQuestions;
	}
	return null;
    }

    /**
     * The following method returns all the SingleChoiceQuestions within a
     * questionnaire. Although a conditional question can be itself also a
     * multi-choice or single-choice question, we consider them separately.
     * 
     * @return the set of single-choice questions
     * @return null if there is not SingleChoiceQuestions in the questionnaire
     * @see SingleChoiceQuestion
     */
    public SingleChoiceQuestion[] getSingleChoiceQuestions() {
	Question[] questions = getQuestions();
	int numberOfSCQ = getNumberOfXQuestion(SingleChoiceQuestion.MY_URI);
	int index = 0;
	if (containsSingleChoiceQuestion()) {
	    SingleChoiceQuestion[] singleChoiceQuestions = new SingleChoiceQuestion[numberOfSCQ];
	    for (int i = 0; i < questions.length; i++) {
		String className = questions[i].getClassURI();
		if (className.equals(SingleChoiceQuestion.MY_URI)) {
		    singleChoiceQuestions[index] = (SingleChoiceQuestion) questions[i];
		    index++;
		}
	    }
	    return singleChoiceQuestions;
	}
	return null;

    }

    /**
     * The following method returns all the QuestionWithMedia within a
     * questionnaire. Although a question with media can be itself also a
     * multi-choice or single-choice question, we consider them separately.
     * 
     * @return the set of questions with media
     * @return null if there is not QuestionWithMedia in the questionnaire
     * @see QuestionWithMedia
     */
    public QuestionWithMedia[] getQuestionsWithImage() {
	Question[] questions = getQuestions();
	int numberOfQWM = getNumberOfXQuestion(QuestionWithMedia.MY_URI);
	int index = 0;
	if (containsQuestionWithMedia()) {
	    QuestionWithMedia[] conditionalQuestions = new QuestionWithMedia[numberOfQWM];
	    for (int i = 0; i < questions.length; i++) {
		String className = questions[i].getClassURI();
		if (className.equals(QuestionWithMedia.MY_URI)) {
		    conditionalQuestions[index] = (QuestionWithMedia) questions[i];
		    index++;
		}
	    }
	    return conditionalQuestions;
	}
	return null;
    }

    /**
     * The following method gets the number of type of question, within the
     * questionnaire.
     * 
     * @param uri
     *            , that indicates whether the question is MultiChoice,
     *            SingleChoice, Conditional or WithImage
     * @return the number of that type of question within the questionnaire.
     * @return null if the uri is not a specified one.
     */
    public int getNumberOfXQuestion(String uri) {

	Question[] questions = getQuestions();

	int cq = 0;
	int mcq = 0;
	int scq = 0;
	int qwm = 0;

	for (int i = 0; i < questions.length; i++) {
	    String className = questions[i].getClassURI();

	    if (className.equals(MultiChoiceQuestion.MY_URI)) {
		mcq++;
	    } else if (className.equals(SingleChoiceQuestion.MY_URI)) {
		scq++;
	    } else if (className.equals(QuestionWithMedia.MY_URI)) {
		qwm++;
	    } else if (className.equals(ConditionalQuestion.MY_URI)) {
		cq++;
	    }
	}

	if (uri.equals(MultiChoiceQuestion.MY_URI))
	    return mcq;
	else if (uri.equals(SingleChoiceQuestion.MY_URI))
	    return scq;
	else if (uri.equals(ConditionalQuestion.MY_URI))
	    return cq;
	else if (uri.equals(QuestionWithMedia.MY_URI))
	    return qwm;
	else
	    return -1;
    }

    public Question writeASingleChoiceQuestion(String qWording,
	    String answerType) {
	SingleChoiceQuestion scq = new SingleChoiceQuestion(qWording,
		answerType);
	addQuestion(scq);
	return scq;
    }

    public Question writeASingleChoiceQuestion(String qWording,
	    String answerType, ChoiceLabel[] choices) {
	SingleChoiceQuestion scq = new SingleChoiceQuestion(qWording,
		answerType, choices);
	addQuestion(scq);
	return scq;
    }

    public Question writeASingleChoiceQuestion(String qWording,
	    Object correctAnswer, String answerType, ChoiceLabel[] choices) {
	SingleChoiceQuestion scq = new SingleChoiceQuestion(qWording,
		correctAnswer, answerType, choices);
	addQuestion(scq);
	return scq;
    }

    public Question writeAMultiChoiceQuestion(String qWording,
	    String answerType, ChoiceLabel[] choices) {
	MultiChoiceQuestion mcq = new MultiChoiceQuestion(qWording, answerType,
		choices);
	addQuestion(mcq);
	return mcq;
    }

    public Question writeAMultiChoiceQuestion(String qWording,
	    Object[] correctAnswer, String[] answerType, ChoiceLabel[] choices) {
	MultiChoiceQuestion mcq = new MultiChoiceQuestion(qWording,
		correctAnswer, answerType, choices);
	addQuestion(mcq);
	return mcq;
    }

    public Question writeAConditionalQuestion(String qWording,
	    Object triggerAnswer, Question dependingQuestion, String answerType) {
	ConditionalQuestion cq = new ConditionalQuestion(qWording,
		triggerAnswer, dependingQuestion, answerType);
	addQuestion(cq);
	return cq;
    }

    public Question writeAConditionalQuestion(String qWording,
	    Object triggerAnswer, Question dependingQuestion,
	    String answerType, ChoiceLabel[] choices) {
	ConditionalQuestion cq = new ConditionalQuestion(qWording,
		triggerAnswer, dependingQuestion, answerType, choices);
	addQuestion(cq);
	return cq;
    }

    public Question writeAConditionalQuestion(String qWording,
	    Object triggerAnswer, Question dependingQuestion,
	    String answerType, ChoiceLabel[] choices, Object correctAnswer) {
	ConditionalQuestion cq = new ConditionalQuestion(qWording,
		triggerAnswer, dependingQuestion, answerType, choices,
		correctAnswer);
	addQuestion(cq);
	return cq;
    }

    public Question writeAConditionalQuestion(String qWording,
	    Object triggerAnswer, Question dependingQuestion,
	    String[] answerType, ChoiceLabel[] choices, Object[] correctAnswer) {
	ConditionalQuestion cq = new ConditionalQuestion(qWording,
		triggerAnswer, dependingQuestion, answerType, choices,
		correctAnswer);
	addQuestion(cq);
	return cq;
    }

    public Question writeQuestionWithMedia(MediaObject image,
	    String questionWording, String answerType) {
	QuestionWithMedia qwm = new QuestionWithMedia(image, questionWording,
		answerType);
	addQuestion(qwm);
	return qwm;
    }

    public Question writeQuestionWithMedia(String qWording, String answerType,
	    ChoiceLabel[] choices, MediaObject image) {
	QuestionWithMedia qwm = new QuestionWithMedia(qWording, answerType,
		choices, image);
	addQuestion(qwm);
	return qwm;
    }

    public Question writeQuestionWithMedia(String qWording,
	    Object correctAnswer, String answerType, ChoiceLabel[] choices,
	    MediaObject image) {
	QuestionWithMedia qwm = new QuestionWithMedia(qWording, correctAnswer,
		answerType, choices, image);
	addQuestion(qwm);
	return qwm;
    }

    public Question writeQuestionWithMedia(String qWording,
	    Object[] correctAnswer, String[] answerType, ChoiceLabel[] choices,
	    MediaObject image) {
	QuestionWithMedia qwm = new QuestionWithMedia(qWording, correctAnswer,
		answerType, choices, image);
	addQuestion(qwm);
	return qwm;
    }

    /**
     * The following method parses to String a questionnaire
     * 
     * @return the questionnaire as a String.
     * @see Question
     */
    public String questionnaireToString() {
	StringBuffer writtenQuestionnaire = new StringBuffer();
		writtenQuestionnaire.append(getName() + "\n" + getDescription()
		+ "\n");
	Question[] questions = getQuestions();
	int index = 0;

	for (int i = 0; i < questions.length; i++) {
	    writtenQuestionnaire.append( "Question " + index
		    + ": " + questions[i].getQuestionWording() + "\n");

	    if (questions[i] instanceof ConditionalQuestion) {
		ConditionalQuestion cq = (ConditionalQuestion) questions[i];
		Object[] ta = cq.getTriggerAnswer();
		if (ta.length == 1) {
		    writtenQuestionnaire.append( "Answer this question ONLY if you have answered "
			    + "\"" + cq.getDependsOn().getLabel(ta[0]) + "\""
			    + " to question " + "\""
			    + cq.getDependsOn().getQuestionWording() + "\""
			    + "\n");
		}

		else {
		    writtenQuestionnaire.append("Answer this question ONLY if you have answered ");

		    for (int k = 0; k < ta.length; k++) {
			writtenQuestionnaire.append("\""
				+ cq.getDependsOn().getLabel(ta[k]) + "\"");
			if (!(k == (ta.length - 1))) {
			    writtenQuestionnaire.append( " and ");
			}
		    }
		    writtenQuestionnaire.append(" to question " + "\""
			    + cq.getDependsOn().getQuestionWording() + "\""
			    + "\n");
		}
	    }

	    int nChoices = questions[i].getNumberOfChoices();

	    for (int j = 0; j < nChoices; j++) {
		ChoiceLabel[] choices = questions[i].getChoiceLabel();
		writtenQuestionnaire.append(choices[j].getLabel() + "\n");
	    }

	    index++;
	}
	return writtenQuestionnaire.toString();
    }
}
