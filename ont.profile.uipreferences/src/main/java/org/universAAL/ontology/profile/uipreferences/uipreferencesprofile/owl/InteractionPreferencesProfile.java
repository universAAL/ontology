/*******************************************************************************
 * Copyright 2011 Ericsson Nikola Tesla d.d.
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
package org.universAAL.ontology.profile.uipreferences.uipreferencesprofile.owl;

import java.util.List;

import org.universAAL.middleware.ui.owl.Gender;
import org.universAAL.middleware.ui.owl.Modality;
import org.universAAL.middleware.ui.owl.PrivacyLevel;
import org.universAAL.ontology.profile.SubProfile;

/**
 * Ontology class representing user preferences related to interaction.
 * 
 * @author eandgrg
 * 
 */
public class InteractionPreferencesProfile extends SubProfile {
    public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
	    + "InteractionPreferencesProfile";
    public static final String PROP_INSENSIBLE_VOLUME_LEVEL = UIPreferencesProfileOntology.NAMESPACE
	    + "insensibleVolumeLevel";
    public static final String PROP_PERSONAL_VOLUME_LEVEL = UIPreferencesProfileOntology.NAMESPACE
	    + "personalVolumeLevel";
    public static final String PROP_INSENSIBLE_MAX_RESOLUTION_Y = UIPreferencesProfileOntology.NAMESPACE
	    + "insensibleMaxResolutionY";
    public static final String PROP_INSENSIBLE_MAX_RESOLUTION_X = UIPreferencesProfileOntology.NAMESPACE
	    + "insensibleMaxResolutionX";
    public static final String PROP_PRIVACY_LEVELS_MAPPED_TO_INSENSIBLE = UIPreferencesProfileOntology.NAMESPACE
	    + "privacyLevelsMappedToInsensible";
    public static final String PROP_PRIVACY_LEVELS_MAPPED_TO_PERSONAL = UIPreferencesProfileOntology.NAMESPACE
	    + "privacyLevelsMappedToPersonal";
    public static final String PROP_PERSONAL_MIN_RESOLUTION_Y = UIPreferencesProfileOntology.NAMESPACE
	    + "personalMinResolutionY";
    public static final String PROP_PERSONAL_MIN_RESOLUTION_X = UIPreferencesProfileOntology.NAMESPACE
	    + "personalMinResolutionX";
    public static final String PROP_INTERACTION_MODALITY = UIPreferencesProfileOntology.NAMESPACE
	    + "interactionModality";
    public static final String PROP_VOICE_GENDER = UIPreferencesProfileOntology.NAMESPACE
	    + "voiceGender";

    public InteractionPreferencesProfile() {
	super();
    }

    public InteractionPreferencesProfile(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	// TODO Implement or if for Device subclasses: remove
	return 0;
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_INSENSIBLE_VOLUME_LEVEL)
		&& hasProperty(PROP_PERSONAL_VOLUME_LEVEL)
		&& hasProperty(PROP_INSENSIBLE_MAX_RESOLUTION_Y)
		&& hasProperty(PROP_INSENSIBLE_MAX_RESOLUTION_X)
		&& hasProperty(PROP_PRIVACY_LEVELS_MAPPED_TO_INSENSIBLE)
		&& hasProperty(PROP_PRIVACY_LEVELS_MAPPED_TO_PERSONAL)
		&& hasProperty(PROP_PERSONAL_MIN_RESOLUTION_Y)
		&& hasProperty(PROP_PERSONAL_MIN_RESOLUTION_X)
		&& hasProperty(PROP_INTERACTION_MODALITY)
		&& hasProperty(PROP_VOICE_GENDER);
    }

    public Integer getInsensibleVolumeLevel() {
	Integer i = (Integer) getProperty(PROP_INSENSIBLE_VOLUME_LEVEL);
	return (i == null) ? new Integer(-1) : i;
    }

    public void setInsensibleVolumeLevel(Integer newPropValue) {
	setProperty(PROP_INSENSIBLE_VOLUME_LEVEL, newPropValue);
    }

    public Integer getPersonalVolumeLevel() {
	Integer i = (Integer) getProperty(PROP_PERSONAL_VOLUME_LEVEL);
	return (i == null) ? new Integer(-1) : i;
    }

    public void setPersonalVolumeLevel(Integer newPropValue) {
	setProperty(PROP_PERSONAL_VOLUME_LEVEL, newPropValue);
    }

    public Integer getInsensibleMaxResolutionX() {
	Integer i = (Integer) getProperty(PROP_INSENSIBLE_MAX_RESOLUTION_X);
	return (i == null) ? new Integer(-1) : i;
    }

    public void setInsensibleMaxResolutionX(Integer newPropValue) {
	setProperty(PROP_INSENSIBLE_MAX_RESOLUTION_X, newPropValue);
    }

    public Integer getInsensibleMaxResolutionY() {
	Integer i = (Integer) getProperty(PROP_INSENSIBLE_MAX_RESOLUTION_Y);
	return (i == null) ? new Integer(-1) : i;
    }

    public void setInsensibleMaxResolutionY(Integer newPropValue) {
	setProperty(PROP_INSENSIBLE_MAX_RESOLUTION_Y, newPropValue);
    }

    public Integer getPersonalMinResolutionX() {
	Integer i = (Integer) getProperty(PROP_PERSONAL_MIN_RESOLUTION_X);
	return (i == null) ? new Integer(-1) : i;
    }

    public void setPersonalMinResolutionX(Integer newPropValue) {
	setProperty(PROP_PERSONAL_MIN_RESOLUTION_X, newPropValue);
    }

    public Integer getPersonalMinResolutionY() {
	Integer i = (Integer) getProperty(PROP_PERSONAL_MIN_RESOLUTION_Y);
	return (i == null) ? new Integer(-1) : i;
    }

    public void setPersonalMinResolutionY(Integer newPropValue) {
	setProperty(PROP_PERSONAL_MIN_RESOLUTION_Y, newPropValue);
    }

    public Gender getVoiceGender() {
	return (Gender) getProperty(PROP_VOICE_GENDER);
    }

    public void setVoiceGender(Gender newPropValue) {
	if (newPropValue != null)
	    setProperty(PROP_VOICE_GENDER, newPropValue);
    }

    public PrivacyLevel[] getPrivacyLevelsMappedToPersonal() {
	Object o = getProperty(PROP_PRIVACY_LEVELS_MAPPED_TO_PERSONAL);
	if (o instanceof List) {
	    List l = (List) o;
	    PrivacyLevel[] pls = new PrivacyLevel[l.size()];
	    for (int i = 0; i < l.size(); ++i) {
		if (l.get(i) instanceof PrivacyLevel)
		    pls[i] = (PrivacyLevel) l.get(i);
	    }
	    return pls;
	} else if (o instanceof PrivacyLevel) {
	    PrivacyLevel[] pls = new PrivacyLevel[1];
	    pls[0] = (PrivacyLevel) o;
	    return pls;
	}

	return null;
    }

    public void setPrivacyLevelsMappedToPersonal(PrivacyLevel[] newPropValue) {
	if (newPropValue != null)
	    setProperty(PROP_PRIVACY_LEVELS_MAPPED_TO_PERSONAL, newPropValue);
    }

    public PrivacyLevel[] getPrivacyLevelsMappedToInsensible() {
	Object o = getProperty(PROP_PRIVACY_LEVELS_MAPPED_TO_INSENSIBLE);
	if (o instanceof List) {
	    List l = (List) o;
	    PrivacyLevel[] pls = new PrivacyLevel[l.size()];
	    for (int i = 0; i < l.size(); ++i) {
		if (l.get(i) instanceof PrivacyLevel)
		    pls[i] = (PrivacyLevel) l.get(i);
	    }
	    return pls;
	} else if (o instanceof PrivacyLevel) {
	    PrivacyLevel[] pls = new PrivacyLevel[1];
	    pls[0] = (PrivacyLevel) o;
	    return pls;
	}

	return null;
    }

    public void setPrivacyLevelsMappedToInsensible(PrivacyLevel[] newPropValue) {
	if (newPropValue != null)
	    setProperty(PROP_PRIVACY_LEVELS_MAPPED_TO_INSENSIBLE, newPropValue);
    }

    public Modality getInteractionModality() {
	return (Modality) getProperty(PROP_INTERACTION_MODALITY);
    }

    public void setInteractionModality(Modality newPropValue) {
	if (newPropValue != null)
	    setProperty(PROP_INTERACTION_MODALITY, newPropValue);
    }
}
