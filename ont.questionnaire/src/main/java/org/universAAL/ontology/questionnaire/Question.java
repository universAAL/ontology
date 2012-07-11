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

/**
 * This class describes the concept of Question, its properties 
 * and its associated methods.
 * @author mdelafuente
 */

public abstract class Question extends ManagedIndividual {

	//NAMESPACE & PROPERTIES
	public static final String MY_URI =  QuestionnaireOntology.NAMESPACE
	+ "Question";
	public static final String PROP_CORRECT_ANSWER =  QuestionnaireOntology.NAMESPACE
	+ "correcAnswer";
	public static final String PROP_HAS_CORRECT_ANSWER =  QuestionnaireOntology.NAMESPACE
	+ "hasCorrectAnswer";
	public static final String PROP_HAS_CHOICE_LABEL =  QuestionnaireOntology.NAMESPACE
	+ "hasChoiceLabel";
	public static final String PROP_ANSWER_TYPE_U_R_I =  QuestionnaireOntology.NAMESPACE
	+ "answerTypeURI";
	public static final String PROP_QUESTION_WORDING =  QuestionnaireOntology.NAMESPACE
	+ "questionWording";

	//CONSTRUCTORS
	public Question () {
		super();
	}

	public Question (String uri) {
		super(uri);
	}

	/**
	 * A Question can be implemented with the question wording and the
	 * answer type if there is not a correct answer for the question.
	 * @param qWording
	 * @param hasCorrectAnswer
	 * @param answerType
	 */
	public Question(String qWording, String answerType){
		this.setQuestionWording(qWording);
		this.setHasCorrectAnswer(false);
		this.addAnswerTypeURI(answerType);

	}

	/**
	 * A Question can be implemented with the question wording, the
	 * answer type and the possible choices, when a correct answer is not specified
	 * @param qWording
	 * @param answerType
	 * @param choices
	 */
	
	public Question(String qWording, String answerType,ChoiceLabel[] choices){
		this.setQuestionWording(qWording);
		this.setHasCorrectAnswer(false);
		this.addAnswerTypeURI(answerType);
		this.setChoices(choices);
	}

	/**
	 * A Question can be implemented with the question wording, the
	 * answer type, and the possible choices, when a correct answer is given.
	 * @param qWording
	 * @param hasCorrectAnswer
	 * @param correctAnswer
	 * @param answerType
	 * @param choices
	 */
	public Question(String qWording, Object correctAnswer, String answerType, ChoiceLabel[] choices){
		this.setQuestionWording(qWording);
		this.setHasCorrectAnswer(true);
		this.addCorrectAnswer(correctAnswer);
		this.setChoices(choices);
		this.addAnswerTypeURI(answerType);
	}
	/**
	 * A Question can be implemented with the question wording, the
	 * answer type, and the possible choices, when a set of correct answers is given.
	 * @param qWording
	 * @param correctAnswer
	 * @param answerType
	 * @param choices
	 */
	public Question(String qWording, Object[] correctAnswer, String[] answerType, ChoiceLabel[] choices){
		this.setQuestionWording(qWording);
		this.setHasCorrectAnswer(true);
		this.setCorrectAnswer(correctAnswer);
		this.setChoices(choices);
		this.setAnswerTypeURI(answerType);
	}
	public String getClassURI() {
		return MY_URI;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return true 
		&& props.containsKey(PROP_CORRECT_ANSWER)
		&& props.containsKey(PROP_HAS_CORRECT_ANSWER)
		&& props.containsKey(PROP_HAS_CHOICE_LABEL)
		&& props.containsKey(PROP_ANSWER_TYPE_U_R_I)
		&& props.containsKey(PROP_QUESTION_WORDING);
	}

	//GETTERS & SETTERS

	/**
	 * The following method gets the question wording
	 * @return question wording ({@link String})
	 */
	public String getQuestionWording() {
		return (String)props.get(PROP_QUESTION_WORDING);
	}		

	/**
	 * The following method sets the question wording
	 * @param qWording, the question wording ({@link String})
	 */
	public void setQuestionWording(String qWording) {
		if (qWording != null)
			props.put(PROP_QUESTION_WORDING, qWording);
	}		
	/**
	 * The following method checks whether a question
	 * has or not a correct answer. 
	 * @return true if the question has a correct answer
	 * @return false if the question has NOT a correct answer
	 */
	public boolean isHasCorrectAnswer() {
		Boolean b = (Boolean) props.get(PROP_HAS_CORRECT_ANSWER);
		return (b == null) ? false : b.booleanValue();
	}		

	/**
	 * The following method sets whether a question
	 * has or not a correct answer. 
	 * @param correctAnswer ({@link boolean}) 
	 * true if the question has a correct answer, false if not.
	 */
	public void setHasCorrectAnswer(boolean correctAnswer) {
		props.put(PROP_HAS_CORRECT_ANSWER, new Boolean(correctAnswer));
	}		

	/**
	 * The following method gets the correct answer associated to a question.
	 * @return correctAnswer ({@link Object}) 
	 * @see Answer
	 */

	public Object[] getCorrectAnswers() {

		Object propList = props.get(PROP_CORRECT_ANSWER);
		if (propList instanceof List) {
			return (Object[]) ((List) propList).toArray(new Object[0]);
		} else {
			List returnList = new ArrayList();
			if (propList != null)
				returnList.add((Object) propList);
			return (Object[]) returnList.toArray(new Object[0]);
		}  
	}	

	/**
	 * The following method sets the correct answers associated to a question.
	 * @param correctAnswers ({@link Object}) 
	 * @see Answer
	 */
	public void setCorrectAnswer(Object[] correctAnswers) {
		List propList = new ArrayList(correctAnswers.length);
		for (int i = 0; i < correctAnswers.length; i++) {
			propList.add(correctAnswers[i]);
		}
		props.put(PROP_CORRECT_ANSWER, propList);
	}


	/**
	 * The following method sets the correct answer associated to a question.
	 * @param correctAnswer ({@link Object}) 
	 * @see Answer
	 */
	public void addCorrectAnswer(Object correctAnswer) {
		Object propList = props.get(PROP_CORRECT_ANSWER);
		if (propList instanceof List) {
			List list = (List) propList;
			list.add(correctAnswer);
			props.put(PROP_CORRECT_ANSWER, list);
		} else if (propList == null) {
			props.put(PROP_CORRECT_ANSWER, correctAnswer);
		} else {
			List list = new ArrayList();
			list.add((Answer) propList);
			list.add(correctAnswer);
			props.put(PROP_CORRECT_ANSWER, list);
		}
	}

	/**
	 * The following method gets the answer type associated to a question.
	 * @return answer type URI ({@link String}) 
	 */
	
	public String[] getAnswerTypeURI() {

		Object propList = props.get(PROP_ANSWER_TYPE_U_R_I);
		if (propList instanceof List) {
			return (String[]) ((List) propList).toArray(new String[0]);
		} else {
			List returnList = new ArrayList();
			if (propList != null)
				returnList.add((String) propList);
			return (String[]) returnList.toArray(new String[0]);
		}  
	}	
	
	
	/**
	 * The following method sets the answer type associated to a question.
	 * @param answerType, the URI of the answer type ({@link String}) 
	 */
	public void addAnswerTypeURI(String answerType) {
		if (answerType != null)
			props.put(PROP_ANSWER_TYPE_U_R_I, answerType);
	}	

	public void setAnswerTypeURI(String[] answerType) {
		Object propList = props.get(PROP_ANSWER_TYPE_U_R_I);
		if (propList instanceof List) {
			List list = (List) propList;
			list.add(answerType);
			props.put(PROP_ANSWER_TYPE_U_R_I, list);
		} else if (propList == null) {
			props.put(PROP_ANSWER_TYPE_U_R_I, answerType);
		} else {
			List list = new ArrayList();
			list.add((String) propList);
			list.add(answerType);
			props.put(PROP_ANSWER_TYPE_U_R_I, list);
		}
	}


	/**
	 * The following method returns the choices of a question
	 * @return choices ({@link ChoiceLabel}) 
	 * @see ChoiceLabel
	 */
	public ChoiceLabel[] getChoiceLabel() {
		Object propList = props.get(PROP_HAS_CHOICE_LABEL);
		if (propList instanceof List) {
			return (ChoiceLabel[]) ((List) propList).toArray(new ChoiceLabel[0]);
		} else {
			List returnList = new ArrayList();
			if (propList != null)
				returnList.add((ChoiceLabel) propList);
			return (ChoiceLabel[]) returnList.toArray(new ChoiceLabel[0]);
		}  
	}		

	/**
	 * The following method set the choices of a question
	 * @param choices ({@link ChoiceLabel}) 
	 * @see ChoiceLabel
	 */
	public void setChoices(ChoiceLabel[] choices) {
		List propList = new ArrayList(choices.length);
		for (int i = 0; i < choices.length; i++) {
			propList.add(choices[i]);
		}
		props.put(PROP_HAS_CHOICE_LABEL, propList);
	}
	
	//OTHER METHODS

	/**
	 * The following method returns the number of questions
	 * associated to a question
	 * @return number of questions ({@link integer})
	 */
	public int getNumberOfChoices(){
		ChoiceLabel[] cl = getChoiceLabel();
		int noc = cl.length;
		return noc;
	}

	/**
	 * The following method gets the label associated to a choice.
	 * @param choice ({@link Object})
	 * @return label ({@link String})
	 * @return null if the choice has not associated label
	 * @see ChoiceLabel
	 */
	public String getLabel(Object choice){
		ChoiceLabel[] choicesLabels = getChoiceLabel();
		for(int i=0;i<choicesLabels.length;i++){
			if((choicesLabels[i].getChoice()).equals(choice)){
				return choicesLabels[i].getLabel();
			}
		}
		return null;
	}
}
