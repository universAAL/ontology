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

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;


/**
 * The ontological object Point represents a point using GPS coordinates (i.e. longitude, latitude, and altitude)
 * 
 * @author smazzei
 *
 */

public class Point extends ManagedIndividual {
	
	public static final String MY_URI;
	public static final String PROP_ALTITUDE;
	public static final String PROP_LATITUDE;
	public static final String PROP_LONGITUDE;
	
	static {
		MY_URI = uAAL_VOCABULARY_NAMESPACE + "Point";
		PROP_ALTITUDE = uAAL_VOCABULARY_NAMESPACE + "altitude";
		PROP_LATITUDE = uAAL_VOCABULARY_NAMESPACE + "latitude";
		PROP_LONGITUDE = uAAL_VOCABULARY_NAMESPACE + "longitude";
		register(Point.class);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		//altitude is optional
		if (PROP_ALTITUDE.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(Double.class), 1, 0);
		if (PROP_LATITUDE.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(Double.class), 1, 1);
		if (PROP_LONGITUDE.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(Double.class), 1, 1);
		return ManagedIndividual.getClassRestrictionsOnProperty(propURI);

	}
	
	public static String[] getStandardPropertyURIs() {
		return new String[] {
				PROP_ALTITUDE,
				PROP_LATITUDE,
				PROP_LONGITUDE
		};
	}
	
	
	/**
	 * Constructor just for usage by de-serializers. Do not use this constructor
	 * within applications as it may lead to incomplete instances that cause exceptions.
	 */
	public Point() {
		super();
	}
	
	/**
	 * Constructor just for usage by de-serializers. Do not use this constructor
	 * within applications as it may lead to incomplete instances that cause exceptions.
	 */
	public Point(String uri) {
		super(uri);
	}
	
	/**
	 * Point constructor.
	 * @param uri The ontological object URI
	 * @param latitude (degrees)
	 * @param longitude (degrees)
	 * @param altitude (meters)
	 * 
	 */
	public Point(String uri, double latitude, double longitude, double altitude) {
		super(uri);
		props.put(PROP_LATITUDE, new Double(latitude));
		props.put(PROP_LONGITUDE, new Double(longitude));
		props.put(PROP_ALTITUDE, new Double(altitude));
	}
	
	/**
	 * Point constructor.
	 * @param latitude (degrees)
	 * @param longitude (degrees)
	 * @param altitude (meters)	 * 
	 */
	public Point(double latitude, double longitude, double altitude) {
		super();

		props.put(PROP_LATITUDE, new Double(latitude));
		props.put(PROP_LONGITUDE, new Double(longitude));
		props.put(PROP_ALTITUDE, new Double(altitude));
	}
	
	/**
	 * Point constructor.
	 * @param uri The ontological object URI
	 * @param latitude (degrees)
	 * @param longitude (degrees)
	 * 
	 */
	public Point(String uri, double latitude, double longitude) {
		super(uri);

		props.put(PROP_LATITUDE, new Double(latitude));
		props.put(PROP_LONGITUDE, new Double(longitude));
	}

	/**
	 * Point constructor.
	 * @param latitude (degrees)
	 * @param longitude (degrees)
	 * 
	 */
	public Point(double latitude, double longitude) {
		super();
		props.put(PROP_LATITUDE, new Double(latitude));
		props.put(PROP_LONGITUDE, new Double(longitude));
	}
	
	public int getPropSerializationType(String propURI) {
		if (PROP_ALTITUDE.equals(propURI)
			||PROP_LATITUDE.equals(propURI)
			||PROP_LONGITUDE.equals(propURI))
			return PROP_SERIALIZATION_REDUCED;
		
		return PROP_SERIALIZATION_OPTIONAL;
	}
	
	/**
	 * 
	 * @return the double array {latitude(degrees), longitude(degrees), altitude(meters)}.If the point altitude property is missing the method assumes that it is zero.
	 */
	public double [] get3DCoordinates(){
		double altitude=0;
		if (props.containsKey(PROP_ALTITUDE))
			altitude= ((Double)props.get(PROP_ALTITUDE)).doubleValue();
		double [] get3DCoordinates = {((Double)props.get(PROP_LATITUDE)).doubleValue(), 
				((Double)props.get(PROP_LONGITUDE)).doubleValue(),altitude};
		return get3DCoordinates;
	}
	/**
	 * 	@return the double array {latitude(degrees), longitude(degrees)}

	 */
	public double [] get2DCoordinates(){
		double [] get2DCoordinates = {((Double)props.get(PROP_LATITUDE)).doubleValue(), ((Double)props.get(PROP_LONGITUDE)).doubleValue()};
		return get2DCoordinates;
	}

	/**
	 * @return the point altitude(meters).If the point altitude property is missing the method assumes that it is zero.
	 */
	public double getAltitude(){
		double altitude=0;
		if (props.containsKey(PROP_ALTITUDE))
			altitude= ((Double)props.get(PROP_ALTITUDE)).doubleValue();
		return altitude;
	}
	
	
	/**
	 * Set a Point latitude and longitude
	 * @param latitude (degrees)
	 * @param longitude (degrees)
	 */
	public void set2DCoordinates(double latitude, double longitude){
		props.put(PROP_LATITUDE, new Double(latitude));
		props.put(PROP_LONGITUDE, new Double(longitude));
	}
	
	/**
	 * Set a Point latitude, longitude, and altitude
	 * @param latitude (degrees)
	 * @param longitude (degrees)
	 * @param altitude (meters)
	 */
	public void set3DCoordinates(double latitude, double longitude, double altitude){
		props.put(PROP_LATITUDE, new Double(latitude));
		props.put(PROP_LONGITUDE, new Double(longitude));
		props.put(PROP_ALTITUDE, new Double(altitude));
	}
	
	/**
	 * Set a Point altitude
	 * @param altitude (meters)
	 */
	public void setAltitude(double altitude){
		props.put(PROP_ALTITUDE, new Double(altitude));
	}
	
	
	public static String getRDFSComment() {
		return "The class of geographical Points (WGS84 Geo Positioning as defined in http://www.w3.org/2003/01/geo/wgs84_pos#)";
	}
	
	public static String getRDFSLabel() {
		return "geo:Point";
	}

	/**
	 * @return true when latitude and longitude are present
	 */
	public boolean isWellFormed() {
		return props.containsKey(PROP_LATITUDE)&&props.containsKey(PROP_LONGITUDE);
	}

}
