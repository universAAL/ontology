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

/**
 * This class describes the concept of ConditionalQuestion, its properties 
 * and its associated methods.
 * A conditional question is a question that only is shown to the user
 * when he/she has given a specific answer (trigger answer) to a specific 
 * previous question.
 * @author mdelafuente
 *
 */
public class ConditionalQuestion extends Question {

	//NAMESPACE & PROPERTIES

	public static final String MY_URI =  QuestionnaireOntology.NAMESPACE
	+ "ConditionalQuestion";
	public static final String PROP_TRIGGER_ANSWER =  QuestionnaireOntology.NAMESPACE
	+ "triggerAnswer";
	public static final String PROP_DEPENDS_ON =  QuestionnaireOntology.NAMESPACE
	+ "dependsOn";

	//CONSTRUCTORS
	public ConditionalQuestion () {
		super();
	}

	public ConditionalQuestion (String uri) {
		super(uri);
	}

	/**
	 * A conditional question can be implemented with the question
	 * wording, the trigger answer, the associated question and the 
	 * answer type
	 * @param qWording
	 * @param triggerAnswer
	 * @param dependingQuestion
	 * @param answerType
	 */
	public ConditionalQuestion (String qWording, Object triggerAnswer, Question dependingQuestion, String answerType) {
		this.setQuestionWording(qWording);  
		this.addTriggerAnswer(triggerAnswer);
		this.setDependsOn(dependingQuestion);
		this.addAnswerTypeURI(answerType);
		this.setHasCorrectAnswer(false);
	}
	/**
	 * A conditional question can be implemented with the question
	 * wording, the trigger answer, the associated question, the choices
	 * given and the answer type
	 * @param qWording
	 * @param triggerAnswer
	 * @param dependingQuestion
	 * @param answerType
	 * @param choices
	 * @see Question
	 */
	public ConditionalQuestion (String qWording, Object triggerAnswer, Question dependingQuestion, String answerType, ChoiceLabel[] choices ) {
		this.setQuestionWording(qWording);  
		this.addTriggerAnswer(triggerAnswer);
		this.setDependsOn(dependingQuestion);
		this.addAnswerTypeURI(answerType);
		this.setChoices(choices);
		this.setHasCorrectAnswer(false);
	}

	/**
	 * A conditional question can be implemented with the question
	 * wording, the trigger answer, the associated question, the choices
	 * given, the answer type and the associated correct answer.
	 * @param qWording
	 * @param triggerAnswer
	 * @param dependingQuestion
	 * @param answerType
	 * @param choices
	 * @param correctAnswer
	 * @see Question
	 */
	public ConditionalQuestion (String qWording, Object triggerAnswer, Question dependingQuestion, String answerType, ChoiceLabel[] choices, Object correctAnswer ) {
		this.setQuestionWording(qWording);  
		this.addTriggerAnswer(triggerAnswer);
		this.setDependsOn(dependingQuestion);
		this.addAnswerTypeURI(answerType);
		this.setChoices(choices);
		this.addCorrectAnswer(correctAnswer);
		this.setHasCorrectAnswer(true);
	}
	
	/**
	 * A conditional question can be implemented with the question
	 * wording, the trigger answer, the associated question, the choices
	 * given, the answer type and the set of correct answers associated.
	 * @param qWording
	 * @param triggerAnswer
	 * @param dependingQuestion
	 * @param answerType
	 * @param choices
	 * @param correctAnswer
	 * @see Question
	 */
	public ConditionalQuestion (String qWording, Object triggerAnswer, Question dependingQuestion, String[] answerType, ChoiceLabel[] choices, Object[] correctAnswer ) {
		this.setQuestionWording(qWording);  
		this.addTriggerAnswer(triggerAnswer);
		this.setDependsOn(dependingQuestion);
		this.setAnswerTypeURI(answerType);
		this.setChoices(choices);
		this.addCorrectAnswer(correctAnswer);
		this.setHasCorrectAnswer(true);
		this.setCorrectAnswer(correctAnswer);
	}

	
	/**
	 * The following constructors are the same as the previous ones, but with the trigger 
	 * answer as a set of objects
	 * 
	 */
	
	public ConditionalQuestion (String qWording, Object[] triggerAnswer, Question dependingQuestion, String answerType) {
		this.setQuestionWording(qWording);  
		this.setTriggerAnswer(triggerAnswer);
		this.setDependsOn(dependingQuestion);
		this.addAnswerTypeURI(answerType);
		this.setHasCorrectAnswer(false);
	}
	
	
	public ConditionalQuestion (String qWording, Object[] triggerAnswer, Question dependingQuestion, String answerType, ChoiceLabel[] choices ) {
		this.setQuestionWording(qWording);  
		this.setTriggerAnswer(triggerAnswer);
		this.setDependsOn(dependingQuestion);
		this.addAnswerTypeURI(answerType);
		this.setChoices(choices);
		this.setHasCorrectAnswer(false);
	}

	public ConditionalQuestion (String qWording, Object[] triggerAnswer, Question dependingQuestion, String answerType, ChoiceLabel[] choices, Object correctAnswer ) {
		this.setQuestionWording(qWording);  
		this.setTriggerAnswer(triggerAnswer);
		this.setDependsOn(dependingQuestion);
		this.addAnswerTypeURI(answerType);
		this.setChoices(choices);
		this.addCorrectAnswer(correctAnswer);
		this.setHasCorrectAnswer(true);
	}
	
	public ConditionalQuestion (String qWording, Object[] triggerAnswer, Question dependingQuestion, String[] answerType, ChoiceLabel[] choices, Object[] correctAnswer ) {
		this.setQuestionWording(qWording);  
		this.setTriggerAnswer(triggerAnswer);
		this.setDependsOn(dependingQuestion);
		this.setAnswerTypeURI(answerType);
		this.setChoices(choices);
		this.addCorrectAnswer(correctAnswer);
		this.setHasCorrectAnswer(true);
		this.setCorrectAnswer(correctAnswer);
	}
	
	public String getClassURI() {
		return MY_URI;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return true 
		&& props.containsKey(PROP_TRIGGER_ANSWER)
		&& props.containsKey(PROP_DEPENDS_ON);
	}

	//GETTERS AND SETTERS

	/**
	 * The following method gets the question to which the Conditional Question
	 * is related to.
	 * @return question ({@link Question})
	 * @see Question
	 */
	public Question getDependsOn() {
		return (Question)props.get(PROP_DEPENDS_ON);
	}		
	/**
	 * The following method sets the question to which the Conditional Question
	 * is related to.
	 * @param dependingQuestion ({@link Question})
	 * @see Question
	 */
	public void setDependsOn(Question dependingQuestion) {
		if (dependingQuestion != null)
			props.put(PROP_DEPENDS_ON, dependingQuestion);
	}		

	/**
	 * The following method gets the trigger that fires the Conditional Question
	 * based on an answer given by the user.
	 * @return question ({@link Question})
	 * @see Question
	 * @see Answer
	 */
	
	public Object[] getTriggerAnswer() {

		Object propList = props.get(PROP_TRIGGER_ANSWER);
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
	 * The following method sets the triggers that fires the Conditional Question
	 * based on an answer given by the user.
	 * @param question ({@link Question})
	 * @see Question
	 * @see Answer
	 */
	
	public void setTriggerAnswer(Object[] triggerAnswers) {
		List propList = new ArrayList(triggerAnswers.length);
		for (int i = 0; i < triggerAnswers.length; i++) {
			propList.add(triggerAnswers[i]);
		}
		props.put(PROP_TRIGGER_ANSWER, propList);
	}
	
	/**
	 * The following method sets the trigger that fires the Conditional Question
	 * based on an answer given by the user.
	 * @param question ({@link Question})
	 * @see Question
	 * @see Answer
	 */
	public void addTriggerAnswer(Object triggerAnswer) {
		Object propList = props.get(PROP_CORRECT_ANSWER);
		if (propList instanceof List) {
			List list = (List) propList;
			list.add(triggerAnswer);
			props.put(PROP_TRIGGER_ANSWER, list);
		} else if (propList == null) {
			props.put(PROP_TRIGGER_ANSWER, triggerAnswer);
		} else {
			List list = new ArrayList();
			list.add((Answer) propList);
			list.add(triggerAnswer);
			props.put(PROP_TRIGGER_ANSWER, list);
		}
	}
	
}
