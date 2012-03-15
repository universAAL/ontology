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
package org.universaal.ontology.owl;

/**
 * This class describes the concept of SingleChoiceQuestion, its properties 
 * and its associated methods.
 * A single-choice question is the kind of question that only has one choice
 * as an answer. 
 * @author mdelafuente
 *
 */
public class SingleChoiceQuestion extends Question {
  public static final String MY_URI =  QuestionnaireOntology.NAMESPACE
    + "SingleChoiceQuestion";


  public SingleChoiceQuestion () {
    super();
  }
  
  public SingleChoiceQuestion (String uri) {
    super(uri);
  }

  /**
   * A SingleChoiceQuestion can be implemented with the question wording and the
   * answer type if there is not a correct answer for the question.
   * @param qWording
   * @param hasCorrectAnswer
   * @param answerType
   * @see Question
   */
  
  public SingleChoiceQuestion(String qWording, String answerType){
	  super(qWording, answerType);
  }
  /**
   * A SingleChoiceQuestion can be implemented with the question wording, the
   * answer type and the possible choices, when a correct answer is not specified
   * @param qWording
   * @param answerType
   * @param choices
   * @see Question
   */
  public SingleChoiceQuestion(String qWording, String answerType,ChoiceLabel[] choices){
	  super(qWording, answerType, choices);
  }
  /**
   * A SingleChoiceQuestion can be implemented with the question wording, the
   * answer type, and the possible choices, when a correct answer is given.
   * @param qWording
   * @param hasCorrectAnswer
   * @param correctAnswer
   * @param answerType
   * @param choices
   * @see Question
   */
public SingleChoiceQuestion(String qWording, Object correctAnswer, String answerType, ChoiceLabel[] choices){
	  super(qWording, correctAnswer, answerType, choices);
  }
  
  public String getClassURI() {
    return MY_URI;
  }
  public int getPropSerializationType(String arg0) {
	  return PROP_SERIALIZATION_FULL;
  }

  public boolean isWellFormed() {
	return true ;
  }
}
