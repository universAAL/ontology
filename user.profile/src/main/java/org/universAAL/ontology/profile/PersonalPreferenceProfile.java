/*
	Copyright 2008-2010 SPIRIT, http://www.spirit-intl.com/
	SPIRIT S.A. E-BUSINESS AND COMMUNICATIONS ENGINEERING 
	
	See the NOTICE file distributed with this work for additional 
	information regarding copyright ownership
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */
/**
 *
 */
package org.universAAL.ontology.profile;

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.io.owl.Gender;
import org.universAAL.middleware.io.owl.Modality;
import org.universAAL.middleware.io.owl.PrivacyLevel;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;

/**
 * @author KAgnantis
 * 
 */
public class PersonalPreferenceProfile extends ManagedIndividual implements
	PropertyPublisher {

    public static final String PROFILING_NAMESPACE = "http://ontology.persona.anco.gr/PersonalPreferencesProfile.owl#";
    public static final String MY_URI;
    public static final String PROP_D_PRIVACY_LEVELS_MAPPED_TO_INSENSIBLE;
    public static final String PROP_D_PRIVACY_LEVELS_MAPPED_TO_PERSONAL;
    public static final String PROP_D_INTERACTION_MODALITY;
    public static final String PROP_D_VOICE_GENDER;
    public static final String PROP_D_INSENSIBLE_VOLUME_LEVEL;
    public static final String PROP_D_PERSONAL_VOLUME_LEVEL;
    public static final String PROP_D_INSENSIBLE_MAX_RESOLUTION_X;
    public static final String PROP_D_INSENSIBLE_MAX_RESOLUTION_Y;
    public static final String PROP_D_PERSONAL_MIN_RESOLUTION_X;
    public static final String PROP_D_PERSONAL_MIN_RESOLUTION_Y;

    static {
	MY_URI = PROFILING_NAMESPACE + "PersonalPreferencesProfile";
	PROP_D_VOICE_GENDER = PROFILING_NAMESPACE + "dVoiceGender";
	PROP_D_PRIVACY_LEVELS_MAPPED_TO_INSENSIBLE = PROFILING_NAMESPACE
		+ "dPrivacyLevelToInsensible";
	PROP_D_PRIVACY_LEVELS_MAPPED_TO_PERSONAL = PROFILING_NAMESPACE
		+ "dPrivacyLevelToPersonal";
	PROP_D_INTERACTION_MODALITY = PROFILING_NAMESPACE
		+ "dInteractionModality";
	PROP_D_INSENSIBLE_VOLUME_LEVEL = PROFILING_NAMESPACE
		+ "dInsensibleVolumeLevel";
	PROP_D_PERSONAL_VOLUME_LEVEL = PROFILING_NAMESPACE
		+ "dPersonalVolumeLevel";
	PROP_D_INSENSIBLE_MAX_RESOLUTION_X = PROFILING_NAMESPACE
		+ "dInsensibleMaxResolutionX";
	PROP_D_INSENSIBLE_MAX_RESOLUTION_Y = PROFILING_NAMESPACE
		+ "dInsensibleMaxResolutionY";
	PROP_D_PERSONAL_MIN_RESOLUTION_X = PROFILING_NAMESPACE
		+ "dPersonalMinResolutionX";
	PROP_D_PERSONAL_MIN_RESOLUTION_Y = PROFILING_NAMESPACE
		+ "dPersonalMaxResolutionX";
	register(PersonalPreferenceProfile.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_D_VOICE_GENDER.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    Gender.MY_URI, 1, 1);
	if (PROP_D_PRIVACY_LEVELS_MAPPED_TO_INSENSIBLE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    PrivacyLevel.MY_URI, 0, 1);
	if (PROP_D_PRIVACY_LEVELS_MAPPED_TO_PERSONAL.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    PrivacyLevel.MY_URI, 0, 1);
	if (PROP_D_INTERACTION_MODALITY.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    Modality.MY_URI, 1, 1);
	if (PROP_D_INSENSIBLE_VOLUME_LEVEL.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	if (PROP_D_PERSONAL_VOLUME_LEVEL.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	if (PROP_D_INSENSIBLE_MAX_RESOLUTION_X.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	if (PROP_D_INSENSIBLE_MAX_RESOLUTION_Y.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	if (PROP_D_PERSONAL_MIN_RESOLUTION_X.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	if (PROP_D_PERSONAL_MIN_RESOLUTION_Y.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
    }

    public void setProperty(String propURI, Object o) {
	if (PROP_D_VOICE_GENDER.equals(propURI) && o instanceof Gender)
	    setVoiceGender((Gender) o);
	else if (PROP_D_PRIVACY_LEVELS_MAPPED_TO_INSENSIBLE.equals(propURI)
		&& o instanceof PrivacyLevel[])
	    setPLsMappedToInsensible((PrivacyLevel[]) o);
	else if (PROP_D_PRIVACY_LEVELS_MAPPED_TO_PERSONAL.equals(propURI)
		&& o instanceof PrivacyLevel[])
	    setPLsMappedToPersonal((PrivacyLevel[]) o);
	else if (PROP_D_INTERACTION_MODALITY.equals(propURI)
		&& o instanceof Modality)
	    setXactionModality((Modality) o);
	else if (PROP_D_INSENSIBLE_VOLUME_LEVEL.equals(propURI)
		&& o instanceof Integer)
	    setInsensibleVolumeLevel((Integer) o);
	else if (PROP_D_PERSONAL_VOLUME_LEVEL.equals(propURI)
		&& o instanceof Integer)
	    setPersonalVolumeLevel((Integer) o);
	else if (PROP_D_INSENSIBLE_MAX_RESOLUTION_X.equals(propURI)
		&& o instanceof Integer)
	    setInsensibleMaxX((Integer) o);
	else if (PROP_D_INSENSIBLE_MAX_RESOLUTION_Y.equals(propURI)
		&& o instanceof Integer)
	    setInsensibleMaxY((Integer) o);
	else if (PROP_D_PERSONAL_MIN_RESOLUTION_X.equals(propURI)
		&& o instanceof Integer)
	    setPersonalMinX((Integer) o);
	else if (PROP_D_PERSONAL_MIN_RESOLUTION_Y.equals(propURI)
		&& o instanceof Integer)
	    setPersonalMinY((Integer) o);
	else
	    super.setProperty(propURI, o);
    }

    public static String[] getStandardPropertyURIs() {
	return new String[] { PROP_D_PRIVACY_LEVELS_MAPPED_TO_INSENSIBLE,
		PROP_D_PRIVACY_LEVELS_MAPPED_TO_PERSONAL,
		PROP_D_INTERACTION_MODALITY, PROP_D_VOICE_GENDER,
		PROP_D_INSENSIBLE_VOLUME_LEVEL, PROP_D_PERSONAL_VOLUME_LEVEL,
		PROP_D_INSENSIBLE_MAX_RESOLUTION_X,
		PROP_D_INSENSIBLE_MAX_RESOLUTION_Y,
		PROP_D_PERSONAL_MIN_RESOLUTION_X,
		PROP_D_PERSONAL_MIN_RESOLUTION_Y };
    }

    public static String getRDFSComment() {
	return "The value of personal preferences profile.";
    }

    public static String getRDFSLabel() {
	return "Personal Preferences Profile";
    }

    public PersonalPreferenceProfile() {
	super();
    }

    public PersonalPreferenceProfile(String uri) {
	super(uri);
    }

    // voice gender
    public Gender getVoiceGender() {
	Object o = props.get(PROP_D_VOICE_GENDER);

	return (o == null ? null : (Gender) o);
    }

    public void setVoiceGender(Gender voice) {
	if (voice != null)
	    props.put(PROP_D_VOICE_GENDER, voice);
    }

    // privacy level
    public PrivacyLevel[] getPLsMappedToInsensible() {
	Object o = props.get(PROP_D_PRIVACY_LEVELS_MAPPED_TO_INSENSIBLE);
	if (o instanceof List) {
	    List l = (List) o;
	    PrivacyLevel[] pls = new PrivacyLevel[l.size()];
	    for (int i = 0; i < l.size(); ++i) {
		if (l.get(i) instanceof PrivacyLevel)
		    pls[i] = (PrivacyLevel) l.get(i);
	    }
	} else if (o instanceof PrivacyLevel) {
	    PrivacyLevel[] pls = new PrivacyLevel[1];
	    pls[0] = (PrivacyLevel) o;
	}

	return null;
    }

    public void setPLsMappedToInsensible(PrivacyLevel[] privacyLevels) {
	if (privacyLevels == null)
	    return;
	List l = new ArrayList(privacyLevels.length);
	for (int i = 0; i < privacyLevels.length; ++i) {
	    l.add(privacyLevels[i]);
	}
	props.put(PROP_D_PRIVACY_LEVELS_MAPPED_TO_INSENSIBLE, l);
    }

    // privacy level
    public PrivacyLevel[] getPLsMappedToPersonal() {
	Object o = props.get(PROP_D_PRIVACY_LEVELS_MAPPED_TO_PERSONAL);
	if (o instanceof List) {
	    List l = (List) o;
	    PrivacyLevel[] pls = new PrivacyLevel[l.size()];
	    for (int i = 0; i < l.size(); ++i) {
		if (l.get(i) instanceof PrivacyLevel)
		    pls[i] = (PrivacyLevel) l.get(i);
	    }
	} else if (o instanceof PrivacyLevel) {
	    PrivacyLevel[] pls = new PrivacyLevel[1];
	    pls[0] = (PrivacyLevel) o;
	}

	return null;
    }

    public void setPLsMappedToPersonal(PrivacyLevel[] privacyLevels) {
	if (privacyLevels == null)
	    return;
	List l = new ArrayList(privacyLevels.length);
	for (int i = 0; i < privacyLevels.length; ++i) {
	    l.add(privacyLevels[i]);
	}
	props.put(PROP_D_PRIVACY_LEVELS_MAPPED_TO_PERSONAL, l);
    }

    // interaction modality
    public Modality getXactionModality() {
	Object o = props.get(PROP_D_INTERACTION_MODALITY);

	return (o == null ? null : (Modality) o);
    }

    public void setXactionModality(Modality interactionModality) {
	if (interactionModality != null)
	    props.put(PROP_D_INTERACTION_MODALITY, interactionModality);
    }

    // insensible volume level
    public Integer getInsensibleVolumeLevel() {
	Object o = props.get(PROP_D_INSENSIBLE_VOLUME_LEVEL);
	return (o == null ? new Integer(-1) : (Integer) o);
    }

    public void setInsensibleVolumeLevel(Integer level) {
	props.put(PROP_D_INSENSIBLE_VOLUME_LEVEL, level);
    }

    // personal volume level
    public Integer getPersonalVolumeLevel() {
	Object o = props.get(PROP_D_PERSONAL_VOLUME_LEVEL);
	return (o == null ? new Integer(-1) : (Integer) o);
    }

    public void setPersonalVolumeLevel(Integer level) {
	props.put(PROP_D_PERSONAL_VOLUME_LEVEL, level);
    }

    // insensible max resolution X
    public Integer getInsensibleMaxX() {
	Object o = props.get(PROP_D_INSENSIBLE_MAX_RESOLUTION_X);
	return (o == null ? new Integer(-1) : (Integer) o);
    }

    public void setInsensibleMaxX(Integer level) {
	props.put(PROP_D_INSENSIBLE_MAX_RESOLUTION_X, level);
    }

    // insensible max resolution Y
    public Integer getInsensibleMaxY() {
	Object o = props.get(PROP_D_INSENSIBLE_MAX_RESOLUTION_Y);
	return (o == null ? new Integer(-1) : (Integer) o);
    }

    public void setInsensibleMaxY(Integer level) {
	props.put(PROP_D_INSENSIBLE_MAX_RESOLUTION_Y, level);
    }

    // personal min resolution X
    public Integer getPersonalMinX() {
	Object o = props.get(PROP_D_PERSONAL_MIN_RESOLUTION_X);
	return (o == null ? new Integer(-1) : (Integer) o);
    }

    public void setPersonalMinX(Integer level) {
	props.put(PROP_D_PERSONAL_MIN_RESOLUTION_X, level);
    }

    // personal min resolution Y
    public Integer getPersonalMinY() {
	Object o = props.get(PROP_D_PERSONAL_MIN_RESOLUTION_Y);
	return (o == null ? new Integer(-1) : (Integer) o);
    }

    public void setPersonalMinY(Integer level) {
	props.put(PROP_D_PERSONAL_MIN_RESOLUTION_Y, level);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.persona.ontology.ManagedIndividual#getPropSerializationType(java.
     * lang.String)
     */
    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.persona.ontology.ManagedIndividual#isWellFormed()
     */
    public boolean isWellFormed() {
	return true;
    }

    public ProfileProperty[] getAllProperties() {
	ProfileProperty[] staticProperties = getStaticProperties();
	ProfileProperty[] dynamicProperties = getDynamicProperties();

	int staticLength = staticProperties.length;
	int dynamicLength = dynamicProperties.length;
	int allLength = staticLength + dynamicLength;

	ProfileProperty[] allProperties = new ProfileProperty[allLength];

	for (int i = 0; i < staticLength; ++i) {
	    allProperties[i] = staticProperties[i];
	}
	for (int i = staticLength; i < allLength; ++i) {
	    allProperties[i] = dynamicProperties[staticLength - i];
	}

	return allProperties;
    }

    public ProfileProperty[] getDynamicProperties() {
	ProfileProperty[] ppArray = new ProfileProperty[9];

	ppArray[0] = new ProfileProperty(
		(getVoiceGender() == null ? Gender.male : getVoiceGender()),
		PROP_D_VOICE_GENDER, "Voice Gender", false);
	ppArray[1] = new ProfileProperty(
		((getPLsMappedToInsensible() == null) ? new PrivacyLevel[0]
			: getPLsMappedToInsensible()),
		PROP_D_PRIVACY_LEVELS_MAPPED_TO_INSENSIBLE, "Privacy level",
		false);
	ppArray[2] = new ProfileProperty(
		((getPLsMappedToPersonal() == null) ? new PrivacyLevel[0]
			: getPLsMappedToPersonal()),
		PROP_D_INTERACTION_MODALITY, "Interaction modality", false);
	ppArray[3] = new ProfileProperty((getInsensibleVolumeLevel()),
		PROP_D_INSENSIBLE_VOLUME_LEVEL, "Insensible volume level",
		false);
	ppArray[4] = new ProfileProperty((getPersonalVolumeLevel()),
		PROP_D_PERSONAL_VOLUME_LEVEL, "Personal volume level", false);
	ppArray[5] = new ProfileProperty((getInsensibleMaxX()),
		PROP_D_INSENSIBLE_MAX_RESOLUTION_X,
		"Insensible max resolution X", false);
	ppArray[6] = new ProfileProperty((getInsensibleMaxY()),
		PROP_D_INSENSIBLE_MAX_RESOLUTION_Y,
		"Insensible max resolution Y", false);
	ppArray[7] = new ProfileProperty((getPersonalMinX()),
		PROP_D_PERSONAL_MIN_RESOLUTION_X, "Personal min resolution X",
		false);
	ppArray[8] = new ProfileProperty((getPersonalMinY()),
		PROP_D_PERSONAL_MIN_RESOLUTION_Y, "Personal min resolution Y",
		false);

	return ppArray;
    }

    public ProfileProperty[] getStaticProperties() {
	return new ProfileProperty[0];
    }

    /**
     * @return
     */
    public static PersonalPreferenceProfile loadInstance() {
	return new PersonalPreferenceProfile();
    }
}
