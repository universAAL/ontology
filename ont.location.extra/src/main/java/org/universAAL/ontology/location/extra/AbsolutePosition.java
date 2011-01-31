/*
	Copyright 2008-2010 Vodafone Italy, http://www.vodafone.it
	Vodafone Omnitel N.V.
	
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
package org.universAAL.ontology.location.extra;

import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;



/**
 * AbsolutePosition is a subclass of Point, because an absolute position is a Point on the 
 * Earth surface.
 * @author smazzei
 *
 */
public class AbsolutePosition extends Point implements Position {

	
	public static final String MY_URI;
	public static final String PROP_ALTITUDE_ACCURACY;
	public static final String PROP_HAS_TRACK_MADE_GOOD;
	
	static {
		MY_URI = uAAL_VOCABULARY_NAMESPACE + "absolutePosition";
		PROP_ALTITUDE_ACCURACY = uAAL_VOCABULARY_NAMESPACE + "altitudeAccuracy";
		PROP_HAS_TRACK_MADE_GOOD = uAAL_VOCABULARY_NAMESPACE + "has_track_made_good";
		register(Position.class);
		register(AbsolutePosition.class);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (PROP_ALTITUDE_ACCURACY.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(Double.class), 1, 0);
		if (PROP_HAS_TRACK_MADE_GOOD.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(Double.class), 1, 0);
		//ACCURACY is declared in the Position interface
		if (PROP_ACCURACY.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(Double.class), 1, 0);
		return Point.getClassRestrictionsOnProperty(propURI);
	}
	
	public static String[] getStandardPropertyURIs() {
		String[] inherited = Point.getStandardPropertyURIs();
		String[] toReturn = new String[inherited.length+3];
		int i = 0;
		while (i < inherited.length) {
			toReturn[i] = inherited[i];
			i++;
		}
		toReturn[i++] = PROP_ALTITUDE_ACCURACY;
		toReturn[i++] = PROP_ACCURACY;
		toReturn[i] = PROP_HAS_TRACK_MADE_GOOD;
		return toReturn;
	}
	
	public int getPropSerializationType(String propURI) {
		if (PROP_ALTITUDE_ACCURACY.equals(propURI)
			||PROP_ACCURACY.equals(propURI)
			||PROP_HAS_TRACK_MADE_GOOD.equals(propURI))
				return PROP_SERIALIZATION_REDUCED;
		
		return super.getPropSerializationType(propURI);
	}
	
	/**
	 * Constructor just for usage by de-serializers. Do not use this constructor
	 * within applications as it may lead to incomplete instances that cause exceptions.
	 */
	public AbsolutePosition() {
		super();
	}
	
	/**
	 * Constructor just for usage by de-serializers. Do not use this constructor
	 * within applications as it may lead to incomplete instances that cause exceptions.
	 */
	public AbsolutePosition(String uri) {
		super(uri);
	}
	
	
	
	/**
	 * 
	 * @param uri The object URI
	 * @param latitude (degrees)
	 * @param longitude (degrees)
	 * @param altitude (meters)
	 */
	public AbsolutePosition(String uri, double latitude, double longitude, double altitude) {
		super(uri, latitude, longitude, altitude);
	}

	/**
	 * 
	 * @param latitude (degrees)
	 * @param longitude (degrees)
	 * @param altitude (meters)
	 */
	public AbsolutePosition(double latitude, double longitude, double altitude) {
		super(latitude, longitude, altitude);
	}

	/**
	 * 
	 * @param uri The object URI
	 * @param latitude (degrees)
	 * @param longitude (degrees)
	 */
	public AbsolutePosition(String uri, double latitude, double longitude) {
		super(uri, latitude, longitude);
	}

	/**
	* 
	* @param latitude (degrees)
	* @param longitude (degrees)
	*/
	public AbsolutePosition(double latitude, double longitude) {
		super(latitude, longitude);
	}
	
	/**
	 * @return 2D coordinates accuracy (i.e. long/lat accuracy). If the current position
	 * has no accuracy, a null object is returned.
	 * 
	 */
	public Double getAccuracy() {
		if (!props.containsKey(PROP_ACCURACY))
			return null;
		return (Double)props.get(PROP_ACCURACY);
	}

	/**
	 * Set 2D coordinates accuracy (i.e. long/lat accuracy)
	 * @param acc The position accuracy.
	 */
	public void setAccuracy(double acc) {
		props.put(PROP_ACCURACY, new Double(acc));
	}

	/**
	 * Set the Track Made Good value retrieved by a GPS receiver
	 * @param tmg The track made good value (degrees).
	 */
	public void setTrackMadeGood(double tmg) {
		props.put(PROP_ACCURACY, new Double(tmg));
	}
	
	/**
	 * 
	 * @return The current position track made good value (degrees)
	 */
	public Double getTrackMadeGood() {
		return (Double)props.get(PROP_HAS_TRACK_MADE_GOOD);
	}	
	
	
	/**
	 * 
	 * @return The current position altitude accuracy (usually is it different from 2D
	 * position accuracy)
	 */
	public Double getAltitudeAccuracy() {
		return (Double)props.get(PROP_ALTITUDE_ACCURACY);
	}

	/**
	 * 
	 * @param altitudeAcc
	 */
	public void setAltitudeAccuracy(double altitudeAcc) {
		props.put(PROP_ALTITUDE_ACCURACY, new Double(altitudeAcc));
	}

	public static String getRDFSComment() {
		return "The class of Absolute position";
	}
	
	public static String getRDFSLabel() {
		return "Absolute Position";
	}
	
		
}
