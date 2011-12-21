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
 * Ontological enumeration of possible contact types. Methods included in this
 * class are the mandatory ones for representing an ontological enumeration in
 * Java classes for uAAL.
 *
 */
public class ContactType extends ManagedIndividual implements EnumProperty {
    public static final String MY_URI;
    static {
	MY_URI = Profile.PROFILING_NAMESPACE + "ContactType";
	register(ContactType.class);
    }
    // for example ... are these roles enumeration defined?

    private static final String[] names = {

    };

    public static ManagedIndividual[] getEnumerationMembers() {
	return new ManagedIndividual[] {};
    }

    public static ManagedIndividual getIndividualByURI(String instanceURI) {
	return (instanceURI != null && instanceURI
		.startsWith(Profile.PROFILING_NAMESPACE)) ? valueOf(instanceURI
		.substring(Profile.PROFILING_NAMESPACE.length())) : null;
    }

    public static ContactType getContactTypeByOrder(int order) {
	switch (order) {
	default:
	    return null;
	}
    }

    public static String getRDFSComment() {
	return "The enum of contact type.";
    }

    public static String getRDFSLabel() {
	return "Contact Type";
    }

    public static final ContactType valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(Profile.PROFILING_NAMESPACE))
	    name = name.substring(Profile.PROFILING_NAMESPACE.length());

	// for (int i=ELDERLYUSER; i<=ELDERLYUSER; i++)
	// if (names[i].equals(name))
	// return getContactTypeByOrder(i);

	return null;
    }

    private int order;

    private ContactType(int order) {
	super(Profile.PROFILING_NAMESPACE + names[order]);
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

    public List getAllValues() {
	List l = new ArrayList();
	for (int i = 0; i < names.length; ++i) {
	    l
		    .add(new Object[] { names[i],
			    ContactType.getContactTypeByOrder(i) });
	}
	return l;
	// return this.names;
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
}