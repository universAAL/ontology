/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut fuer Graphische Datenverarbeitung 
	
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

package org.universAAL.ontology.lighting;

import java.util.Hashtable;

import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.service.owl.Service;

/**
 * @author mtazari
 *
 */
public class Lighting extends Service {
	public static final String MY_URI;
	public static final String PROP_CONTROLS;
	public static final String PROP_PHYSICAL_LOCATION;
	public static final String PROP_BRIGHTNESS;
	
	private static Hashtable lightingRestrictions = new Hashtable(2);
	static {
		MY_URI = LightSource.LIGHTING_NAMESPACE + "Lighting";
		PROP_CONTROLS = LightSource.LIGHTING_NAMESPACE + "controls";
		PROP_PHYSICAL_LOCATION = LightSource.LIGHTING_NAMESPACE + "physicalLocation";
		PROP_BRIGHTNESS = LightSource.LIGHTING_NAMESPACE + "brightness";
		register(Lighting.class);
		addRestriction(
				Restriction.getAllValuesRestriction(PROP_CONTROLS, LightSource.MY_URI),
				new String[] {PROP_CONTROLS},
				lightingRestrictions);
		addRestriction(
				Restriction.getAllValuesRestriction(PROP_PHYSICAL_LOCATION, LightSource.MY_URI),
				new String[]{PROP_PHYSICAL_LOCATION},
				lightingRestrictions);
		addRestriction(
				Restriction.getAllValuesRestriction(PROP_BRIGHTNESS, LightSource.MY_URI),
				new String[]{PROP_BRIGHTNESS},
				lightingRestrictions);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (propURI == null)
			return null;
		Object r = lightingRestrictions.get(propURI);
		if (r instanceof Restriction)
			return (Restriction) r;
		return Service.getClassRestrictionsOnProperty(propURI);
	}
	
	public static String getRDFSComment() {
		return "The class of services controling light sources.";
	}
	
	public static String getRDFSLabel() {
		return "Lighting";
	}
	
	public Lighting() {
		super();
	}
	
	public Lighting(String uri) {
		super(uri);
	}

	/* (non-Javadoc)
	 * @see org.universAAL.ontology.Service#getClassLevelRestrictions()
	 */
	protected Hashtable getClassLevelRestrictions() {
		return lightingRestrictions;
	}

	/* (non-Javadoc)
	 * @see org.universAAL.middleware.owl.ManagedIndividual#getPropSerializationType(java.lang.String)
	 */
	public int getPropSerializationType(String propURI) {
		return PROP_CONTROLS.equals(propURI)? PROP_SERIALIZATION_FULL
				: super.getPropSerializationType(propURI);
	}

	public boolean isWellFormed() {
		return true;
	}
}
