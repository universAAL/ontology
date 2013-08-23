/*******************************************************************************
 * Copyright 2013 Ericsson Nikola Tesla d.d.
 *
 * See the NOTICE file distributed with this work for additional 
 * information regarding copyright ownership
 *	
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *	
 * http://www.apache.org/licenses/LICENSE-2.0
 *	
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.ui.preferences;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.ui.owl.Preference;

/**
 * @author eandgrg
 * 
 */
public class AuditoryPreferences extends Preference {

    /** MY_URI of this class */
    public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
	    + "AuditoryPreferences";

    /** Speech rate */
    public static final String PROP_SPEECH_RATE = UIPreferencesProfileOntology.NAMESPACE
	    + "speechRate";

    /** Gender of a text to speech engine to be used */
    public static final String PROP_VOICE_GENDER = UIPreferencesProfileOntology.NAMESPACE
	    + "voiceGender";

    /** System sounds status (on/off) */
    public static final String PROP_SYSTEM_SOUNDS = UIPreferencesProfileOntology.NAMESPACE
	    + "systemSounds";

    /** Volume intensity */
    public static final String PROP_VOLUME = UIPreferencesProfileOntology.NAMESPACE
	    + "volume";

    /**
     * Frequency is how fast a sound wave moves. Pitch is how high or low a
     * sound sounds. The faster the sound wave the higher the pitch. This is the
     * pitch intensity property.
     */
    public static final String PROP_PITCH = UIPreferencesProfileOntology.NAMESPACE
	    + "pitch";

    /** Key sound status */
    public static final String PROP_KEY_SOUND = UIPreferencesProfileOntology.NAMESPACE
	    + "keySound";

    /**
     * 
     */
    public AuditoryPreferences() {
	super();
    }

    /**
     * 
     * 
     * @param uri
     */
    public AuditoryPreferences(String uri) {
	super(uri);
    }

    /**
     * 
     * 
     * @return MY_URI of the class
     * @see org.universAAL.middleware.owl.ManagedIndividual#getClassURI()
     */
    public String getClassURI() {
	return MY_URI;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.universAAL.middleware.owl.ManagedIndividual#getPropSerializationType
     * (java.lang.String)
     */
    public int getPropSerializationType(String arg0) {
	return Resource.PROP_SERIALIZATION_FULL;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.universAAL.middleware.owl.ManagedIndividual#isWellFormed()
     */
    public boolean isWellFormed() {
	return true && hasProperty(PROP_SPEECH_RATE)
		&& hasProperty(PROP_VOICE_GENDER)
		&& hasProperty(PROP_SYSTEM_SOUNDS) && hasProperty(PROP_VOLUME)
		&& hasProperty(PROP_PITCH) && hasProperty(PROP_KEY_SOUND);
    }

    /**
     * 
     * 
     * @return volume Intensity
     */
    public Intensity getVolume() {
	return (Intensity) getProperty(PROP_VOLUME);
    }

    /**
     * @param newPropValue
     *            volume Intensity
     */
    public void setVolume(Intensity newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_VOLUME, newPropValue);
    }

    /**
     * 
     * 
     * @return pitch Intensity
     */
    public Intensity getPitch() {
	return (Intensity) getProperty(PROP_PITCH);
    }

    /**
     * 
     * 
     * @param newPropValue
     *            pitch Intensity
     */
    public void setPitch(Intensity newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_PITCH, newPropValue);
    }

    /**
     * 
     * 
     * @return key sound status
     */
    public Status getKeySoundStatus() {
	return (Status) getProperty(PROP_KEY_SOUND);
    }

    /**
     * 
     * 
     * @param newPropValue
     *            key sound status
     */
    public void setKeySoundStatus(Status newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_KEY_SOUND, newPropValue);
    }

    /**
     * 
     * 
     * @return gender of a voice
     */
    public VoiceGender getVoiceGender() {
	return (VoiceGender) getProperty(PROP_VOICE_GENDER);
    }

    /**
     * 
     * 
     * @param newPropValue
     *            gender of a voice
     */
    public void setVoiceGender(VoiceGender newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_VOICE_GENDER, newPropValue);
    }

    /**
     * 
     * 
     * @return speech rate intensity
     */
    public Intensity getSpeechRate() {
	return (Intensity) getProperty(PROP_SPEECH_RATE);
    }

    /**
     * 
     * 
     * @param newPropValue
     *            speech rate intensity
     */
    public void setSpeechRate(Intensity newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_SPEECH_RATE, newPropValue);
    }

    /**
     * 
     * 
     * @return system sounds status
     */
    public Status getSystemSounds() {
	return (Status) getProperty(PROP_SYSTEM_SOUNDS);
    }

    /**
     * 
     * 
     * @param newPropValue
     *            system sounds status
     */
    public void setSystemSounds(Status newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_SYSTEM_SOUNDS, newPropValue);
    }
}
