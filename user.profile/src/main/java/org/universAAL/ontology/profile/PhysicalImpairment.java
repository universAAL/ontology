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

import org.universAAL.middleware.io.owl.AccessImpairment;
import org.universAAL.middleware.owl.supply.LevelRating;

/**
 * Ontological representation of any physical impairment. Methods included in this class are the
 * mandatory ones for representing an ontological concept in Java classes for
 * uAAL. Usually it includes getters and setters for most of its properties.
 * @author mtazari
 * 
 */
public class PhysicalImpairment extends AccessImpairment implements
	PropertyPublisher {
    public static final String MY_URI;

    static {
	MY_URI = uAAL_VOCABULARY_NAMESPACE + "PhysicalImpairment";
	register(PhysicalImpairment.class);
    }

    public static String getRDFSComment() {
	return "Represents the level of the user's difficulty in providing input by the hands, e.g. in using maus and keyboard.";
    }

    public static String getRDFSLabel() {
	return "Physical Impairment";
    }

    /**
     * The constructor for (de-)serializers.
     */
    public PhysicalImpairment() {
	super();
    }

    /**
     * The constructor for use by applications.
     */
    public PhysicalImpairment(LevelRating impairmentLevel) {
	super(impairmentLevel);
    }

    public ProfileProperty[] getAllProperties() {
	return getStaticProperties();
    }

    public ProfileProperty[] getDynamicProperties() {
	return new ProfileProperty[0];
    }

    public ProfileProperty[] getStaticProperties() {
	ProfileProperty[] propArray = new ProfileProperty[1];
	LevelRating lr = this.getImpaimentLevel();
	if (lr == null)
	    lr = LevelRating.none;

	propArray[0] = new ProfileProperty(lr, PROP_IMPAIRMENT_LEVEL, "Level",
		true);

	return propArray;
    }

    public static PhysicalImpairment loadInstance() {
	return new PhysicalImpairment(LevelRating.none);
    }

    public void setImpairment(LevelRating rating) {
	props.put(AccessImpairment.PROP_IMPAIRMENT_LEVEL, rating);
    }

    public String toString() {
	return "Physical Impairment: " + this.getImpaimentLevel().name();
    }
}
