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

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Ontological representation of the Gender of a person. Methods included in
 * this class are the mandatory ones for representing an ontological concept in
 * Java classes for uAAL. Usually it includes getters and setters for most of
 * its properties.
 * 
 * @author
 * @author Carsten Stockloew
 */
public class Sex extends ManagedIndividual implements EnumProperty {
    public static final String MY_URI = UserIdentificationProfile.PROFILING_NAMESPACE
	    + "Sex";

    public static final int MALE = 0;
    public static final int FEMALE = 1;

    private static final String[] names = { "male", "female" };
    public static final Sex male = new Sex(MALE);
    public static final Sex female = new Sex(FEMALE);

    public static Sex getGenderByOrder(int order) {
	switch (order) {
	case MALE:
	    return male;
	case FEMALE:
	    return female;
	default:
	    return null;
	}
    }

    public static final Sex valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(UserIdentificationProfile.PROFILING_NAMESPACE))
	    name = name.substring(UserIdentificationProfile.PROFILING_NAMESPACE
		    .length());

	for (int i = MALE; i <= FEMALE; i++)
	    if (names[i].equals(name))
		return getGenderByOrder(i);

	return null;
    }

    private int order;

    private Sex(int order) {
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
	    l.add(new Object[] { names[i], Sex.getGenderByOrder(i) });
	}
	return l;
	// return Sex.names;
    }
}