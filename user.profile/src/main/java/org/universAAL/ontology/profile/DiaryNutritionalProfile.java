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

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;

/**
 * Ontological representation of the daily nutritional profile of a person,
 * describing the nutritional values of every day. Methods included in this
 * class are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 */
public class DiaryNutritionalProfile extends ManagedIndividual implements
	PropertyPublisher {

    public static final String PROFILING_NAMESPACE = "http://ontology.persona.ratio.it/DiaryNutritionalProfile.owl#";
    public static final String MY_URI;
    public static final String PROP_D_CALORIES;
    public static final String PROP_D_MEAL;

    static {
	MY_URI = PROFILING_NAMESPACE + "DiaryNutritionalProfile";
	PROP_D_CALORIES = PROFILING_NAMESPACE + "dCalories";
	PROP_D_MEAL = PROFILING_NAMESPACE + "dMeat";
	register(DiaryNutritionalProfile.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_D_CALORIES.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	if (PROP_D_MEAL.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
    }

    public void setProperty(String propURI, Object o) {
	if (PROP_D_CALORIES.equals(propURI) && o instanceof Integer)
	    setCalories((Integer) o);
	else if (PROP_D_MEAL.equals(propURI) && o instanceof Integer)
	    setMeal((Integer) o);
	else
	    super.setProperty(propURI, o);
    }

    public static String[] getStandardPropertyURIs() {
	return new String[] { PROP_D_CALORIES, PROP_D_MEAL, };
    }

    public static String getRDFSComment() {
	return "The value of diary nutritional profile.";
    }

    public static String getRDFSLabel() {
	return "Diary Nutritional Profile";
    }

    public DiaryNutritionalProfile() {
	super();
    }

    public DiaryNutritionalProfile(String uri) {
	super(uri);
    }

    public DiaryNutritionalProfile(String uri, Integer dCalories, Integer dMeal) {
	super(uri);
	if ((dCalories == null) || (dMeal == null))
	    throw new IllegalArgumentException();

	props.put(PROP_D_CALORIES, dCalories);
	props.put(PROP_D_MEAL, dMeal);

    }

    public Integer getCalories() {
	Integer i = (Integer) props.get(PROP_D_CALORIES);
	if (i == null)
	    return new Integer(-1);
	return i;
    }

    public void setCalories(Integer dCalories) {
	props.put(PROP_D_CALORIES, dCalories);
    }

    public Integer getMeat() {
	Integer i = (Integer) props.get(PROP_D_MEAL);
	if (i == null)
	    return new Integer(-1);
	return i;
    }

    public void setMeal(Integer dMeat) {
	props.put(PROP_D_MEAL, dMeat);
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return props.containsKey(PROP_D_CALORIES)
		&& props.containsKey(PROP_D_MEAL);
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
	ProfileProperty[] pp = new ProfileProperty[2];

	pp[0] = new ProfileProperty(getCalories(), PROP_D_CALORIES, "Calories",
		false);
	pp[1] = new ProfileProperty(getMeat(), PROP_D_MEAL, "Number of meals",
		false);

	return pp;
    }

    public ProfileProperty[] getStaticProperties() {
	return new ProfileProperty[0];
    }

    /**
     * @return
     */
    public static DiaryNutritionalProfile loadInstance() {
	return new DiaryNutritionalProfile();
    }
}
