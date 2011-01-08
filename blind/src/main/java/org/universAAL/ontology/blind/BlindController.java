/*
	Copyright 2008-2010 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute of Computer Graphics Research 
	
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

package org.persona.platform.casf.ontology.device.lighting.blind;

import java.util.Hashtable;

import org.persona.ontology.Service;
import org.persona.ontology.expr.Restriction;

/**
 * 
 * @author Steeven Zeiss
 * @since 26.11.2009
 *
 */
public class BlindController extends Service {// Lighting {
	public static final String MY_URI;
	public static final String PROP_CONTROLS;

	private static Hashtable blindServicesRestrictions = new Hashtable(1);
	static {
		MY_URI = Blind.BLIND_NAMESPACE + "BlindController";
		PROP_CONTROLS = Blind.BLIND_NAMESPACE + "controls";
		//PROP_STATUS = Blind.BLIND_NAMESPACE+ "status";
		register(BlindController.class);
		addRestriction(
				Restriction.getAllValuesRestriction(PROP_CONTROLS, Blind.MY_URI),
				new String[] {PROP_CONTROLS},
				blindServicesRestrictions);
//		addRestriction(
//				Restriction.getAllValuesRestriction(PROP_STATUS, Blind.MY_URI),
//				new String[]{PROP_STATUS},
//				blindServicesRestrictions);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (propURI == null)
			return null;
		Object r = blindServicesRestrictions.get(propURI);
		if (r instanceof Restriction)
			return (Restriction) r;
		return Service.getClassRestrictionsOnProperty(propURI);
	}
	
	public static String getRDFSComment() {
		return "The class of services controling blinds.";
	}
	
	public static String getRDFSLabel() {
		return "BlindsServices";
	}
	
	public BlindController() {
		super();
	}
	
	public BlindController(String uri) {
		super(uri);
	}

	/* (non-Javadoc)
	 * @see org.persona.ontology.Service#getClassLevelRestrictions()
	 */
	protected Hashtable getClassLevelRestrictions() {
		return blindServicesRestrictions;
	}

	/* (non-Javadoc)
	 * @see org.persona.ontology.ManagedIndividual#getPropSerializationType(java.lang.String)
	 */
	public int getPropSerializationType(String propURI) {
		return PROP_CONTROLS.equals(propURI)? PROP_SERIALIZATION_FULL
				: PROP_SERIALIZATION_OPTIONAL;
	}

	public boolean isWellFormed() {
		return true;
	}
}
