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

import org.persona.middleware.TypeMapper;
import org.persona.ontology.Location;
import org.persona.ontology.ManagedIndividual;
import org.persona.ontology.expr.OrderingRestriction;
import org.persona.ontology.expr.Restriction;
import org.persona.platform.casf.ontology.device.Device;
import org.persona.platform.casf.ontology.location.PLocation;

/**
 * 
 * @author Steeven Zeiss
 * @since 26.11.2009
 *
 */
public class Blind extends Device {
	public static final String BLIND_NAMESPACE = "http://ontology.persona.ima.igd.fhg.de/Blind.owl#";
	public static final String MY_URI;
//	public static final String PROP_HAS_TYPE;
	public static final String PROP_BLIND_LOCATION;
	public static final String PROP_BLIND_STATUS;
	static {
		MY_URI = BLIND_NAMESPACE + "Blind";
//		PROP_HAS_TYPE = BLIND_NAMESPACE + "hasType";
		PROP_BLIND_LOCATION = BLIND_NAMESPACE + "blindLocation";
		PROP_BLIND_STATUS = BLIND_NAMESPACE + "blindStatus";
		register(Blind.class);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
//		if (PROP_HAS_TYPE.equals(propURI))
//			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
//					NaturalLight.sunShine.MY_URI, 1, 1);
		if (PROP_BLIND_LOCATION.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					PLocation.MY_URI, 1, 1);
		if (PROP_BLIND_STATUS.equals(propURI))
			return OrderingRestriction.newOrderingRestriction(new Integer(100),
					new Integer(0), true, true,
					Restriction.getAllValuesRestrictionWithCardinality(propURI,
							TypeMapper.getDatatypeURI(Integer.class), 1, 1));
		return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
	}
	
	public static String[] getStandardPropertyURIs() {
		return new String[] {
//				PROP_HAS_TYPE,
				PROP_BLIND_LOCATION,
				PROP_BLIND_STATUS
		};
	}
	
	public static String getRDFSComment() {
		return "The class of all blinds.";
	}
	
	public static String getRDFSLabel() {
		return "Blind";
	}
	
	public Blind() {
		super();
	}
	
	public Blind(String uri) {
		super(uri);
	}
	
	public Blind(String uri, Location loc) {
		super(uri);
		if ( loc == null)
			throw new IllegalArgumentException();

		//TODO: richtig?
		//setLocation(loc);
		
//		props.put(PROP_HAS_TYPE, NaturalLight.sunShine.getType());
		props.put(PROP_BLIND_LOCATION, loc);
		props.put(PROP_BLIND_STATUS, new Integer(0));
	}

	
//	public String getBlindType() {
//		return (String) props.get(PROP_HAS_TYPE);
//	}
	
	public Location getBlindLocation() {
		return (Location) props.get(PROP_BLIND_LOCATION);
	}
	
	public void setBlindLocation(Location l) {
		if (l != null)
			props.put(PROP_BLIND_LOCATION, l);
	}

	/* (non-Javadoc)
	 * @see org.persona.ontology.ManagedIndividual#getPropSerializationType(java.lang.String)
	 */
	public int getPropSerializationType(String propURI) {
		return  PROP_BLIND_LOCATION.equals(propURI)?
						PROP_SERIALIZATION_REDUCED : PROP_SERIALIZATION_FULL;
	}

	/* (non-Javadoc)
	 * @see org.persona.ontology.ManagedIndividual#isWellFormed()
	 */
	public boolean isWellFormed() {
		return props.containsKey(PROP_BLIND_LOCATION)&& props.containsKey(PROP_BLIND_STATUS);
	}

}
