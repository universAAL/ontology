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

import org.universAAL.middleware.ui.rdf.MediaObject;

/**
 * This class describes the concept of QuestionWithMedia, its properties and its
 * associated methods. A question with media is a question that has video,
 * images or other media associated to it.
 * 
 * @author mdelafuente
 * 
 */
public class QuestionWithMedia extends Question {
    public static final String MY_URI = QuestionnaireOntology.NAMESPACE
	    + "QuestionWithMedia";
    public static final String PROP_MEDIA = QuestionnaireOntology.NAMESPACE
	    + "media";

    public QuestionWithMedia() {
	super();
    }

    public QuestionWithMedia(String uri) {
	super(uri);
    }

    /**
     * A QuestionWithMedia can be implemented with the question wording, the
     * answer type and the media object given.
     * 
     * @param media
     * @param questionWording
     * @param answerType
     * @see Question
     */
    public QuestionWithMedia(MediaObject media, String questionWording,
	    String answerType) {
	super(questionWording, answerType);
	this.setImage(media);
    }

    /**
     * A QuestionWithMedia can be implemented with the question wording, the
     * answer type, the choices associated to the question and the media object
     * given.
     * 
     * @param qWording
     * @param answerType
     * @param choices
     * @param media
     * @see Question
     */
    public QuestionWithMedia(String qWording, String answerType,
	    ChoiceLabel[] choices, MediaObject media) {
	super(qWording, answerType, choices);
	this.setImage(media);
    }

    /**
     * A QuestionWithMedia can be implemented with the question wording, the
     * answer type, the correct answer associated to the question, the choices
     * associated to the question and the media object given.
     * 
     * @param qWording
     * @param correctAnswer
     * @param answerType
     * @param choices
     * @param media
     * @see Question
     */
    public QuestionWithMedia(String qWording, Object correctAnswer,
	    String answerType, ChoiceLabel[] choices, MediaObject media) {
	super(qWording, correctAnswer, answerType, choices);
	this.setImage(media);
    }

    /**
     * A QuestionWithMedia can be implemented with the question wording, the
     * answer type, the set of correct answers associated to the question, the
     * choices associated to the question and the media object given.
     * 
     * @param qWording
     * @param correctAnswer
     * @param answerType
     * @param choices
     * @param media
     * @see Question
     */
    public QuestionWithMedia(String qWording, Object[] correctAnswer,
	    String[] answerType, ChoiceLabel[] choices, MediaObject media) {
	super(qWording, correctAnswer, answerType, choices);
	this.setImage(media);
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

    // GETTERS AND SETTERS

    /**
     * The following method gets the associated image to question.
     * 
     * @return media ({@link MediaObject})
     */
    public MediaObject getImage() {
	return (MediaObject) props.get(PROP_MEDIA);
    }

    /**
     * The following method sets the media to which the Question with image is
     * related.
     * 
     * @param media
     *            ({@link MediaObject})
     */
    public void setImage(MediaObject media) {
	if (media != null)
	    props.put(PROP_MEDIA, media);
    }

}