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

package org.universAAL.ontology.powersocket;

import java.util.Hashtable;

import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.owl.Restriction;

/**
 * 
 * @author Steeven Zeiss
 * @since 26.11.2009
 *
 */
public class PowersocketController extends Service {
	public static final String MY_URI;
	public static final String PROP_CONTROLS;
	public static final String PROP_PHYSICAL_LOCATION;
	private static Hashtable powersocketServicesRestrictions = new Hashtable(1);
	static {
		MY_URI = Powersocket.POWERSOCKET_NAMESPACE + "PowersocketServices";
		PROP_CONTROLS = Powersocket.POWERSOCKET_NAMESPACE + "controls";
		PROP_PHYSICAL_LOCATION = Powersocket.POWERSOCKET_NAMESPACE + "physicalLocation";
		register(PowersocketController.class);
		addRestriction(
				Restriction.getAllValuesRestriction(PROP_CONTROLS, Powersocket.MY_URI),
				new String[] {PROP_CONTROLS},
				powersocketServicesRestrictions);
		addRestriction(
				Restriction.getAllValuesRestriction(PROP_PHYSICAL_LOCATION, Powersocket.MY_URI),
				new String[]{PROP_PHYSICAL_LOCATION},
				powersocketServicesRestrictions);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (propURI == null)
			return null;
		Object r = powersocketServicesRestrictions.get(propURI);
		if (r instanceof Restriction)
			return (Restriction) r;
		return Service.getClassRestrictionsOnProperty(propURI);
	}
	
	public static String getRDFSComment() {
		return "The class of services controling powersockets.";
	}
	
	public static String getRDFSLabel() {
		return "PowersocketServices";
	}
	
	public PowersocketController() {
		super();
	}
	
	public PowersocketController(String uri) {
		super(uri);
	}

	/* (non-Javadoc)
	 * @see org.persona.ontology.Service#getClassLevelRestrictions()
	 */
	protected Hashtable getClassLevelRestrictions() {
		return powersocketServicesRestrictions;
	}

	/* (non-Javadoc)
	 * @see org.universAAL.middleware.owl.ManagedIndividual#getPropSerializationType(java.lang.String)
	 */
	public int getPropSerializationType(String propURI) {
		return PROP_CONTROLS.equals(propURI)? PROP_SERIALIZATION_FULL
				: PROP_SERIALIZATION_OPTIONAL;
	}

	public boolean isWellFormed() {
		return true;
	}
}
