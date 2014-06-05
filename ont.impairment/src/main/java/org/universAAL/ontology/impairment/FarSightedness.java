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
package org.universAAL.ontology.impairment;

import org.universAAL.middleware.owl.supply.LevelRating;

/**
 * Ontological representation of far-sightedness impairment. Methods included in
 * this class are the mandatory ones for representing an ontological concept in
 * Java classes for uAAL. Usually it includes getters and setters for most of
 * its properties.
 * 
 * @author mtazari
 * @author Carsten Stockloew
 */
public class FarSightedness extends SightImpairment {
    public static final String MY_URI = ImpairmentOntology.NAMESPACE
	    + "FarSightedness";

    /**
     * The constructor for (de-)serializers.
     */
    public FarSightedness() {
	super();
    }

    /**
     * The constructor for use by applications.
     */
    public FarSightedness(LevelRating impairmentLevel) {
	super(impairmentLevel);
    }

    /** @see org.universAAL.middleware.owl.ManagedIndividual#getClassURI() */
    public String getClassURI() {
	return MY_URI;
    }

    public static SightImpairment loadInstance() {
	return new FarSightedness(LevelRating.none);
    }

    public String toString() {
	return "Farsightedness: " + this.getImpaimentLevel().name();
    }
}
