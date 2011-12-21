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

import javax.xml.datatype.XMLGregorianCalendar;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;

/**
 * Ontological representation of the daily activity profile of a person,
 * describing the activities of daily life. Methods included in this class are
 * the mandatory ones for representing an ontological concept in Java classes
 * for uAAL. Usually it includes getters and setters for most of its properties.
 * 
 */
public class DiaryActivityProfile extends ManagedIndividual implements
	PropertyPublisher {

    public static final String PROFILING_NAMESPACE = "http://ontology.persona.ratio.it/DiaryActivityProfile.owl#";
    public static final String MY_URI;

    // static
    public static final String PROP_S_EXERCISE;
    public static final String PROP_S_BREAKFAST_TIME;
    public static final String PROP_S_LAUNCH_TIME;
    public static final String PROP_S_DINNER_TIME;
    public static final String PROP_S_RECOM_ACTIVITY;

    // dynamic
    public static final String PROP_D_GET_UP;
    public static final String PROP_D_BED_TIME;
    public static final String PROP_D_DIARY_ACTIVITIES;

    static {
	MY_URI = PROFILING_NAMESPACE + "DiaryActivityProfile";

	PROP_S_EXERCISE = PROFILING_NAMESPACE + "sExercise";
	PROP_S_BREAKFAST_TIME = PROFILING_NAMESPACE + "sBreakfastTime";
	PROP_S_LAUNCH_TIME = PROFILING_NAMESPACE + "sLaunchTime";
	PROP_S_DINNER_TIME = PROFILING_NAMESPACE + "sDinnerTime";
	PROP_S_RECOM_ACTIVITY = PROFILING_NAMESPACE + "sRecomActivity";

	PROP_D_BED_TIME = PROFILING_NAMESPACE + "dBedTime";
	PROP_D_DIARY_ACTIVITIES = PROFILING_NAMESPACE + "dDiaryActivities";
	PROP_D_GET_UP = PROFILING_NAMESPACE + "dGetUp";

	register(DiaryActivityProfile.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_S_EXERCISE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    ExerciseType.MY_URI, 1, 1);
	if (PROP_S_BREAKFAST_TIME.equals(propURI))
	    return Restriction
		    .getAllValuesRestrictionWithCardinality(propURI, TypeMapper
			    .getDatatypeURI(XMLGregorianCalendar.class), 1, 1);
	if (PROP_S_LAUNCH_TIME.equals(propURI))
	    return Restriction
		    .getAllValuesRestrictionWithCardinality(propURI, TypeMapper
			    .getDatatypeURI(XMLGregorianCalendar.class), 1, 1);
	if (PROP_S_DINNER_TIME.equals(propURI))
	    return Restriction
		    .getAllValuesRestrictionWithCardinality(propURI, TypeMapper
			    .getDatatypeURI(XMLGregorianCalendar.class), 1, 1);
	if (PROP_S_RECOM_ACTIVITY.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);

	if (PROP_D_BED_TIME.equals(propURI))
	    return Restriction
		    .getAllValuesRestrictionWithCardinality(propURI, TypeMapper
			    .getDatatypeURI(XMLGregorianCalendar.class), 1, 1);
	if (PROP_D_DIARY_ACTIVITIES.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);
	if (PROP_D_GET_UP.equals(propURI))
	    return Restriction
		    .getAllValuesRestrictionWithCardinality(propURI, TypeMapper
			    .getDatatypeURI(XMLGregorianCalendar.class), 1, 1);

	return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
    }

    public void setProperty(String propURI, Object o) {
	if (PROP_S_EXERCISE.equals(propURI) && o instanceof ExerciseType)
	    setExerciseType((ExerciseType) o);
	else if (PROP_S_BREAKFAST_TIME.equals(propURI)
		&& o instanceof XMLGregorianCalendar)
	    setBreakfastTime((XMLGregorianCalendar) o);
	else if (PROP_S_LAUNCH_TIME.equals(propURI)
		&& o instanceof XMLGregorianCalendar)
	    setLaunchTime((XMLGregorianCalendar) o);
	else if (PROP_S_DINNER_TIME.equals(propURI)
		&& o instanceof XMLGregorianCalendar)
	    setDinnerTime((XMLGregorianCalendar) o);
	else if (PROP_D_BED_TIME.equals(propURI)
		&& o instanceof XMLGregorianCalendar)
	    setBedTime((XMLGregorianCalendar) o);
	else if (PROP_S_RECOM_ACTIVITY.equals(propURI) && o instanceof String)
	    setRecommendedActivity((String) o);
	else if (PROP_D_DIARY_ACTIVITIES.equals(propURI) && o instanceof String)
	    setDiaryActivities((String) o);
	else if (PROP_D_GET_UP.equals(propURI)
		&& o instanceof XMLGregorianCalendar)
	    setGetUp((XMLGregorianCalendar) o);
	else
	    super.setProperty(propURI, o);
    }

    public static String[] getStandardPropertyURIs() {
	return new String[] { PROP_S_EXERCISE, PROP_S_BREAKFAST_TIME,
		PROP_S_LAUNCH_TIME, PROP_S_DINNER_TIME, PROP_S_RECOM_ACTIVITY,
		PROP_D_BED_TIME, PROP_D_DIARY_ACTIVITIES, PROP_D_GET_UP, };
    }

    public static String getRDFSComment() {
	return "The list of activity profile.";
    }

    public static String getRDFSLabel() {
	return "Diary Activity Profile";
    }

    public DiaryActivityProfile() {
	super();
    }

    public DiaryActivityProfile(String uri) {
	super(uri);
    }

    public XMLGregorianCalendar getBreakfastTime() {
	Object o = props.get(PROP_S_BREAKFAST_TIME);
	return (o == null) ? null : (XMLGregorianCalendar) o;
    }

    public void setBreakfastTime(XMLGregorianCalendar breakfastTime) {
	if (breakfastTime != null)
	    props.put(PROP_S_BREAKFAST_TIME, breakfastTime);
    }

    public XMLGregorianCalendar getLaunchTime() {
	Object o = props.get(PROP_S_LAUNCH_TIME);
	return (o == null) ? null : (XMLGregorianCalendar) o;
    }

    public void setLaunchTime(XMLGregorianCalendar launchTime) {
	if (launchTime != null)
	    props.put(PROP_S_LAUNCH_TIME, launchTime);
    }

    public XMLGregorianCalendar getDinnerTime() {
	Object o = props.get(PROP_S_DINNER_TIME);
	return (o == null) ? null : (XMLGregorianCalendar) o;
    }

    public void setDinnerTime(XMLGregorianCalendar dinnerTime) {
	if (dinnerTime != null)
	    props.put(PROP_S_DINNER_TIME, dinnerTime);
    }

    public String getRecommendedActivity() {
	Object o = props.get(PROP_S_RECOM_ACTIVITY);
	return (o == null) ? null : (String) o;
    }

    public void setRecommendedActivity(String recomActivity) {
	if (recomActivity != null)
	    props.put(PROP_S_RECOM_ACTIVITY, recomActivity);
    }

    public ExerciseType getExerciseType() {
	Object o = props.get(PROP_S_EXERCISE);
	return (o == null) ? null : (ExerciseType) o;
    }

    public void setExerciseType(ExerciseType eType) {
	if (eType != null)
	    props.put(PROP_S_EXERCISE, eType);
    }

    public XMLGregorianCalendar getBedTime() {
	Object o = props.get(PROP_D_BED_TIME);
	return (o == null) ? null : (XMLGregorianCalendar) o;
    }

    public void setBedTime(XMLGregorianCalendar dBedTime) {
	if (dBedTime != null)
	    props.put(PROP_D_BED_TIME, dBedTime);
    }

    public String getDiaryActivities() {
	String i = (String) props.get(PROP_D_DIARY_ACTIVITIES);
	return i;
    }

    public void setDiaryActivities(String dDiaryActivities) {
	props.put(PROP_D_DIARY_ACTIVITIES, new String(dDiaryActivities));
    }

    public XMLGregorianCalendar getGetUp() {
	Object o = props.get(PROP_D_GET_UP);
	return (o == null) ? null : (XMLGregorianCalendar) o;

    }

    public void setGetUp(XMLGregorianCalendar dGetUp) {
	if (dGetUp != null)
	    props.put(PROP_D_GET_UP, dGetUp);
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
	ProfileProperty[] propArray = new ProfileProperty[3];
	propArray[0] = new ProfileProperty(((getGetUp() == null) ? TypeMapper
		.getDataTypeFactory().newXMLGregorianCalendar() : getGetUp()),
		PROP_D_GET_UP, "Get up time", false);
	propArray[1] = new ProfileProperty(
		((getBedTime() == null) ? TypeMapper.getDataTypeFactory()
			.newXMLGregorianCalendar() : getBedTime()),
		PROP_D_BED_TIME, "Bed time", false);
	propArray[2] = new ProfileProperty(((getDiaryActivities() == null) ? ""
		: getDiaryActivities()), PROP_D_DIARY_ACTIVITIES,
		"Dairy Activities", false);

	return propArray;
    }

    public ProfileProperty[] getStaticProperties() {
	ProfileProperty[] propArray = new ProfileProperty[5];

	propArray[0] = new ProfileProperty(
		((getExerciseType() == null) ? ExerciseType
			.getExerciseTypeByOrder(0) : getExerciseType()),
		PROP_S_EXERCISE, "Exercise Type", true);
	propArray[1] = new ProfileProperty(
		((getBreakfastTime() == null) ? TypeMapper.getDataTypeFactory()
			.newXMLGregorianCalendar() : getBreakfastTime()),
		PROP_S_BREAKFAST_TIME, "Breakfast time", true);
	propArray[2] = new ProfileProperty(
		((getLaunchTime() == null) ? TypeMapper.getDataTypeFactory()
			.newXMLGregorianCalendar() : getLaunchTime()),
		PROP_S_LAUNCH_TIME, "Launch time", true);
	propArray[3] = new ProfileProperty(
		((getDinnerTime() == null) ? TypeMapper.getDataTypeFactory()
			.newXMLGregorianCalendar() : getDinnerTime()),
		PROP_S_DINNER_TIME, "Dinner time", true);
	propArray[4] = new ProfileProperty(
		((getRecommendedActivity() == null) ? ""
			: getRecommendedActivity()), PROP_S_RECOM_ACTIVITY,
		"Recommended Activity", true);

	return propArray;
    }

    /**
     * @return
     */
    public static DiaryActivityProfile loadInstance() {
	return new DiaryActivityProfile();
    }
}
