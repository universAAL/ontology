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

/**
 * This class describes the concept of MultiChoiceQuestion, its properties and
 * its associated methods. A multi-choice question is a question that enables to
 * select several choices within a question.
 *
 * @author mdelafuente
 *
 */
public class MultiChoiceQuestion extends Question {

	// NAMESPACE AND PROPERTIES
	public static final String MY_URI = QuestionnaireOntology.NAMESPACE + "MultiChoiceQuestion";

	// CONSTRUCTORS

	public MultiChoiceQuestion() {
		super();
	}

	public MultiChoiceQuestion(String uri) {
		super(uri);
	}

	/**
	 * A MultichoiceQuestion can be implemented with the question wording, the
	 * answer type and the possible choices, when a correct answer is not
	 * specified
	 *
	 * @param qWording
	 * @param answerType
	 * @param choices
	 * @see Question
	 */
	public MultiChoiceQuestion(String qWording, String answerType, ChoiceLabel[] choices) {
		super(qWording, answerType, choices);
	}

	/**
	 * A MultichoiceQuestion can be implemented with the question wording, the
	 * set of answer type, and the possible choices, when a set of correct
	 * answer is given.
	 *
	 * @param qWording
	 * @param correctAnswer
	 * @param answerType
	 * @param choices
	 */
	public MultiChoiceQuestion(String qWording, Object[] correctAnswer, String[] answerType, ChoiceLabel[] choices) {
		super(qWording, correctAnswer, answerType, choices);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return true;
	}
}
