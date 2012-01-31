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
package org.universAAL.ontology.profile;

/**
 * Ontological representation of the specific profile of an elderly person.
 * Methods included in this class are the mandatory ones for representing an
 * ontological concept in Java classes for uAAL. Usually it includes getters and
 * setters for most of its properties.
 * 
 * @author
 * @author Carsten Stockloew
 */
public class ElderlyProfile extends UserProfile {

    public static final String PROFILING_NAMESPACE = "http://ontology.persona.ratio.it/ElderlyProfiling.owl#";
    public static final String MY_URI;
    public static final String PROP_SOCIAL_PROFILE;
    public static final String PROP_HEALTH_PROFILE;
    public static final String PROP_DIARY_ACTIVITY_PROFILE;
    public static final String PROP_DIARY_NUTR_PROFILE;
    public static final String PROP_PERS_PREF_PROFILE;

    static {
	MY_URI = PROFILING_NAMESPACE + "ElderlyProfile";
	PROP_SOCIAL_PROFILE = PROFILING_NAMESPACE + "socialProfile";
	PROP_HEALTH_PROFILE = PROFILING_NAMESPACE + "healthProfile";
	PROP_DIARY_ACTIVITY_PROFILE = PROFILING_NAMESPACE
		+ "diaryActionProfile";
	PROP_DIARY_NUTR_PROFILE = PROFILING_NAMESPACE + "diaryNutrProfile";
	PROP_PERS_PREF_PROFILE = PROFILING_NAMESPACE + "personalPrefPrfile";
    }

    public void setProperty(String propURI, Object o) {
	if (PROP_SOCIAL_PROFILE.equals(propURI) && o instanceof SocialProfile)
	    setSocialProfile((SocialProfile) o);
	else if (PROP_HEALTH_PROFILE.equals(propURI)
		&& o instanceof HealthProfile)
	    setHealthProfile((HealthProfile) o);
	else if (PROP_DIARY_ACTIVITY_PROFILE.equals(propURI)
		&& o instanceof DiaryActivityProfile)
	    setDiaryActivityProfile((DiaryActivityProfile) o);
	else if (PROP_DIARY_NUTR_PROFILE.equals(propURI)
		&& o instanceof DiaryNutritionalProfile)
	    setDiaryNutritionalProfile((DiaryNutritionalProfile) o);
	else if (PROP_PERS_PREF_PROFILE.equals(propURI)
		&& o instanceof PersonalPreferenceProfile)
	    setPersonalPreferenceProfile((PersonalPreferenceProfile) o);
	else
	    super.setProperty(propURI, o);
    }

    public ElderlyProfile() {
	super();
    }

    public ElderlyProfile(String uri) {
	super(uri);
    }

    public ElderlyProfile(String uri, SocialProfile socialProfile,
	    HealthProfile healthProfile,
	    DiaryActivityProfile diaryActionProfile,
	    DiaryNutritionalProfile diaryNutrProfile) {
	super(uri);
	if ((socialProfile == null) || (healthProfile == null)
		|| (diaryActionProfile == null) || (diaryNutrProfile == null))
	    throw new IllegalArgumentException();

	props.put(PROP_SOCIAL_PROFILE, socialProfile);
	props.put(PROP_HEALTH_PROFILE, healthProfile);
	props.put(PROP_DIARY_ACTIVITY_PROFILE, diaryActionProfile);
	props.put(PROP_DIARY_NUTR_PROFILE, diaryNutrProfile);
    }

    public SocialProfile getSocialProfile() {
	Object o = props.get(PROP_SOCIAL_PROFILE);
	return (o == null) ? null : (SocialProfile) o;
    }

    public void setSocialProfile(SocialProfile socialProfile) {
	if (socialProfile != null)
	    props.put(PROP_SOCIAL_PROFILE, socialProfile);
    }

    public HealthProfile getHealthProfile() {
	Object o = props.get(PROP_HEALTH_PROFILE);
	return (o == null) ? null : (HealthProfile) o;
    }

    public void setHealthProfile(HealthProfile healthProfile) {
	if (healthProfile != null)
	    props.put(PROP_HEALTH_PROFILE, healthProfile);
    }

    public DiaryActivityProfile getDiaryActivityProfile() {
	Object o = props.get(PROP_DIARY_ACTIVITY_PROFILE);
	return (o == null) ? null : (DiaryActivityProfile) o;
    }

    public void setDiaryActivityProfile(
	    DiaryActivityProfile diaryActivityProfile) {
	if (diaryActivityProfile != null)
	    props.put(PROP_DIARY_ACTIVITY_PROFILE, diaryActivityProfile);
    }

    public DiaryNutritionalProfile getDiaryNutritionalProfile() {
	Object o = props.get(PROP_DIARY_NUTR_PROFILE);
	return (o == null) ? null : (DiaryNutritionalProfile) o;
    }

    public void setDiaryNutritionalProfile(
	    DiaryNutritionalProfile diaryNutritionalProfile) {
	if (diaryNutritionalProfile != null)
	    props.put(PROP_DIARY_NUTR_PROFILE, diaryNutritionalProfile);
    }

    public void setPersonalPreferenceProfile(PersonalPreferenceProfile ppp) {
	if (ppp != null)
	    props.put(PROP_PERS_PREF_PROFILE, ppp);
    }

    public PersonalPreferenceProfile getPersonalPreferenceProfile() {
	Object o = props.get(PROP_PERS_PREF_PROFILE);
	return (o == null) ? null : (PersonalPreferenceProfile) o;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return props.containsKey(PROP_SOCIAL_PROFILE)
		&& props.containsKey(PROP_HEALTH_PROFILE)
		&& props.containsKey(PROP_DIARY_ACTIVITY_PROFILE)
		&& props.containsKey(PROP_DIARY_NUTR_PROFILE)
		&& props.containsKey(PROP_PERS_PREF_PROFILE);
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
	ProfileProperty[] inherited = super.getDynamicProperties();
	ProfileProperty[] allProperties = new ProfileProperty[inherited.length + 4];
	int i = 0;
	for (; i < inherited.length; ++i) {
	    allProperties[i] = inherited[i];
	}

	allProperties[i++] = new ProfileProperty(new SocialProfile(),
		PROP_SOCIAL_PROFILE, "Social Profile", false);
	allProperties[i++] = new ProfileProperty(new HealthProfile(),
		PROP_HEALTH_PROFILE, "Health Profile", false);
	allProperties[i++] = new ProfileProperty(new DiaryActivityProfile(),
		PROP_DIARY_ACTIVITY_PROFILE, "Diary Activity Profile", false);
	allProperties[i++] = new ProfileProperty(new DiaryNutritionalProfile(),
		PROP_DIARY_NUTR_PROFILE, "Diary Nutritional Profile", false);

	return allProperties;
    }

    public ProfileProperty[] getStaticProperties() {
	ProfileProperty[] inherited = super.getDynamicProperties();
	ProfileProperty[] allProperties = new ProfileProperty[inherited.length + 5];
	int i = 0;
	for (; i < inherited.length; ++i) {
	    allProperties[i] = inherited[i];
	}

	allProperties[i++] = new ProfileProperty(
		((getSocialProfile() == null) ? new SocialProfile()
			: getSocialProfile()), PROP_SOCIAL_PROFILE,
		"Social Profile", true);
	allProperties[i++] = new ProfileProperty(
		((getHealthProfile() == null) ? new HealthProfile()
			: getHealthProfile()), PROP_HEALTH_PROFILE,
		"Health Profile", true);
	allProperties[i++] = new ProfileProperty(
		((getDiaryActivityProfile() == null) ? new DiaryActivityProfile()
			: getDiaryActivityProfile()),
		PROP_DIARY_ACTIVITY_PROFILE, "Diary Activity Profile", true);
	allProperties[i++] = new ProfileProperty(
		((getDiaryNutritionalProfile() == null) ? new DiaryNutritionalProfile()
			: getDiaryNutritionalProfile()),
		PROP_DIARY_NUTR_PROFILE, "Diary Nutritional Profile", true);
	allProperties[i++] = new ProfileProperty(
		((getPersonalPreferenceProfile() == null) ? new PersonalPreferenceProfile()
			: getPersonalPreferenceProfile()),
		PROP_PERS_PREF_PROFILE, "Personal Preference Profile", true);

	return allProperties;
    }
}
