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
*//**
 * 
 */
package org.universAAL.ontology.profile;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.supply.LevelRating;


/**
 * @author mtazari
 *
 */
public class ColorBlindness extends SightImpairment implements PropertyPublisher {
	public static final String MY_URI;
	
	static {
		MY_URI = uAAL_VOCABULARY_NAMESPACE + "ColorBlindness";
		register(ColorBlindness.class);
	}
	
	public static String getRDFSComment() {
		return "Represents the level of the user's color-blindness.";
	}
	
	public static String getRDFSLabel() {
		return "ColorBlindness";
	}
	
	/**
	 * The constructor for (de-)serializers.
	 */
	public ColorBlindness() {
		super();
	}
	
	/**
	 * The constructor for use by applications.
	 */
	public ColorBlindness(LevelRating impairmentLevel) {
		super(impairmentLevel);
	}

	public static ManagedIndividual getIndividualByURI(String instanceURI) {
		return new ColorBlindness();
	}

	public ProfileProperty[] getAllProperties() {
		return super.getAllProperties();
	}

	public ProfileProperty[] getDynamicProperties() {
		return super.getDynamicProperties();
	}

	public ProfileProperty[] getStaticProperties() {
		return super.getStaticProperties();
	}
	
	public static SightImpairment loadInstance() {
		return new ColorBlindness(LevelRating.none);
	}

	public String toString() {
		return "Colorblindness: " + this.getImpaimentLevel().name();
	}
}
