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

import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.location.Location;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.OrderingRestriction;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.ontology.phThing.Device;

/**
 * @author mtazari
 *
 */
public class LightSource extends Device {
	public static final String LIGHTING_NAMESPACE = "http://ontology.persona.ima.igd.fhg.de/Lighting.owl#";
	public static final String MY_URI;
	public static final String PROP_AMBIENT_COVERAGE;
	public static final String PROP_HAS_TYPE;
	public static final String PROP_SOURCE_BRIGHTNESS;
	public static final String PROP_SOURCE_COLOR;
	public static final String PROP_SOURCE_LOCATION;
	
	static {
		MY_URI = LIGHTING_NAMESPACE + "LightSource";
		PROP_AMBIENT_COVERAGE = LIGHTING_NAMESPACE + "ambientCoveage";
		PROP_HAS_TYPE = LIGHTING_NAMESPACE + "hasType";
		PROP_SOURCE_BRIGHTNESS = LIGHTING_NAMESPACE + "srcBrightness";
		PROP_SOURCE_COLOR = LIGHTING_NAMESPACE + "srcColor";
		PROP_SOURCE_LOCATION = LIGHTING_NAMESPACE + "srcLocation";
		register(LightSource.class);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (PROP_AMBIENT_COVERAGE.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					Location.MY_URI, 1, 0);
		if (PROP_HAS_TYPE.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					LightType.MY_URI, 1, 1);
		if (PROP_SOURCE_BRIGHTNESS.equals(propURI))
			return OrderingRestriction.newOrderingRestriction(new Integer(100),
					new Integer(0), true, true,
					Restriction.getAllValuesRestrictionWithCardinality(propURI,
							TypeMapper.getDatatypeURI(Integer.class), 1, 1));
		if (PROP_SOURCE_COLOR.equals(propURI))
			return Restriction.getCardinalityRestriction(propURI, 1, 0);
		if (PROP_SOURCE_LOCATION.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					Location.MY_URI, 1, 1);
		return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
	}
	
	public static String[] getStandardPropertyURIs() {
		return new String[] {
				PROP_AMBIENT_COVERAGE,
				PROP_HAS_TYPE,
				PROP_SOURCE_BRIGHTNESS,
				PROP_SOURCE_COLOR,
				PROP_SOURCE_LOCATION
		};
	}
	
	public static String getRDFSComment() {
		return "The class of all light sources.";
	}
	
	public static String getRDFSLabel() {
		return "Light Source";
	}
	
	public LightSource() {
		super();
	}
	
	public LightSource(String uri) {
		super(uri);
	}
	
	
	public LightSource(String uri, LightType type, Location loc) {
		super(uri);
		if (type == null  ||  loc == null)
			throw new IllegalArgumentException();
		
		props.put(PROP_HAS_TYPE, type);
		props.put(PROP_SOURCE_BRIGHTNESS, new Integer(0));
		props.put(PROP_SOURCE_LOCATION, loc);
	}
	//hier stand nur Location
	public Location getAmbientCoverage() {
		return (Location) props.get(PROP_AMBIENT_COVERAGE);
	}
	
	public int getBrightness() {
		Integer i = (Integer) props.get(PROP_SOURCE_BRIGHTNESS);
		return (i == null)? -1 : i.intValue();
	}
	
	public LightType getLightType() {
		return (LightType) props.get(PROP_HAS_TYPE);
	}
	//hier stand nur Location
	public Location getSourceLocation() {
		return (Location) props.get(PROP_SOURCE_LOCATION);
	}
	
	public void setAmbientCoverage(Location l) {
		if (l != null)
			props.put(PROP_AMBIENT_COVERAGE, l);
	}
	
	public void setBrightness(int percentage) {
		if (percentage > -1  &&  percentage < 101)
			props.put(PROP_SOURCE_BRIGHTNESS, new Integer(percentage));
	}
	
	public void setSourceLocation(Location l) {
		if (l != null)
			props.put(PROP_SOURCE_LOCATION, l);
	}

	/* (non-Javadoc)
	 * @see org.universAAL.middleware.owl.ManagedIndividual#getPropSerializationType(java.lang.String)
	 */
	public int getPropSerializationType(String propURI) {
		return (PROP_AMBIENT_COVERAGE.equals(propURI)
				|| PROP_SOURCE_LOCATION.equals(propURI))?
						PROP_SERIALIZATION_REDUCED : PROP_SERIALIZATION_FULL;
	}

	/* (non-Javadoc)
	 * @see org.universAAL.middleware.owl.ManagedIndividual#isWellFormed()
	 */
	public boolean isWellFormed() {
		return props.containsKey(PROP_HAS_TYPE)
			&& props.containsKey(PROP_SOURCE_BRIGHTNESS)
			&& props.containsKey(PROP_SOURCE_LOCATION);
	}

}
