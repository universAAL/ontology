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
 */package org.universAAL.ontology.profile;

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Ontological enumeration of possible physical exercise types. Methods included
 * in this class are the mandatory ones for representing an ontological
 * enumeration in Java classes for uAAL.
 * 
 * @author KAgnantis
 * 
 */
public class ExerciseType extends ManagedIndividual implements EnumProperty {
    public static final String MY_URI;
    static {
	MY_URI = UserIdentificationProfile.PROFILING_NAMESPACE + "ExerciseType";
	register(ExerciseType.class);
    }

    public static final int SEDENTARY = 0;
    public static final int MODERATE = 1;
    public static final int ACTIVE = 2;

    private static final String[] names = { "sedentary", "moderate", "active" };
    public static final ExerciseType sedentary = new ExerciseType(SEDENTARY);
    public static final ExerciseType moderate = new ExerciseType(MODERATE);
    public static final ExerciseType active = new ExerciseType(ACTIVE);

    public static ManagedIndividual[] getEnumerationMembers() {
	return new ManagedIndividual[] { sedentary, moderate, active };
    }

    public static ManagedIndividual getIndividualByURI(String instanceURI) {
	return (instanceURI != null && instanceURI
		.startsWith(UserIdentificationProfile.PROFILING_NAMESPACE)) ? valueOf(instanceURI
		.substring(UserIdentificationProfile.PROFILING_NAMESPACE
			.length()))
		: null;
    }

    public static ExerciseType getExerciseTypeByOrder(int order) {
	switch (order) {
	case SEDENTARY:
	    return sedentary;
	case MODERATE:
	    return moderate;
	case ACTIVE:
	    return active;
	default:
	    return null;
	}
    }

    public static String getRDFSComment() {
	return "The enum of Exercise type.";
    }

    public static String getRDFSLabel() {
	return "Exercise Type";
    }

    public static final ExerciseType valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(UserIdentificationProfile.PROFILING_NAMESPACE))
	    name = name.substring(UserIdentificationProfile.PROFILING_NAMESPACE
		    .length());

	for (int i = SEDENTARY; i <= ACTIVE; i++)
	    if (names[i].equals(name))
		return getExerciseTypeByOrder(i);

	return null;
    }

    private int order;

    private ExerciseType(int order) {
	super(UserIdentificationProfile.PROFILING_NAMESPACE + names[order]);
	this.order = order;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_OPTIONAL;
    }

    public boolean isWellFormed() {
	return true;
    }

    public String name() {
	return names[order];
    }

    public int ord() {
	return order;
    }

    public void setProperty(String propURI, Object o) {
	// do nothing
    }

    public ProfileProperty[] getAllProperties() {
	return new ProfileProperty[0];
    }

    public ProfileProperty[] getDynamicProperties() {
	return new ProfileProperty[0];
    }

    public ProfileProperty[] getStaticProperties() {
	return new ProfileProperty[0];
    }

    public List getAllValues() {
	List l = new ArrayList();
	for (int i = 0; i < names.length; ++i) {
	    l.add(new Object[] { names[i],
		    ExerciseType.getExerciseTypeByOrder(i) });
	}
	return l;
    }
}