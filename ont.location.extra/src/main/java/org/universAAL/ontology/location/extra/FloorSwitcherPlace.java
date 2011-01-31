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

import java.util.List;
import java.util.Vector;

import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;


/**
 * A FloorSwitcherPlace is a place that allows to move from different floors
 * (usually it is a lift or stairs)
 * @author smazzei
 *
 */
public class FloorSwitcherPlace extends Place {
	
	public static final String MY_URI;
	public static final String PROP_REACHES_Z_COORDINATE;
	public static final String PROP_HAS_INCLINATION;
	
	static {
		MY_URI = uAAL_VOCABULARY_NAMESPACE + "FloorSwitcherPlace";
		//REACHES_Z_COORDINATE represents the Z Coordinate of a reached floor
		//a FloorSwitcher must reach at least 2 floors
		PROP_REACHES_Z_COORDINATE = uAAL_VOCABULARY_NAMESPACE + "reachesZCoordinate";
		//HAS_INCLINATION is the FloorSwitcher inclination. It is 90° for a lift
		// and a lower angle for stairs (negative angles are not allowed)
		PROP_HAS_INCLINATION = uAAL_SERVICE_NAMESPACE + "hasInclination";
		register(FloorSwitcherPlace.class);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {

		//a FloorSwitcher must have at least 2 REACHES_Z_COORDINATE.
		if (PROP_REACHES_Z_COORDINATE.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(Double.class), -1, 2);
		//if HAS_INCLINATION is not present it is assumed that it is a lift
		//(i.e. inclination = 90°)
		if (PROP_HAS_INCLINATION.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(Integer.class), 1, 0);
			return Place.getClassRestrictionsOnProperty(propURI);
	}
	
	public static String[] getStandardPropertyURIs() {
		String[] inherited = Place.getStandardPropertyURIs();
		String[] toReturn = new String[inherited.length+2];
		int i = 0;
		while (i < inherited.length) {
			toReturn[i] = inherited[i];
			i++;
		}
		toReturn[i++] = PROP_REACHES_Z_COORDINATE;
		toReturn[i] = PROP_HAS_INCLINATION;
		return toReturn;
	}
	
	/**
	 * Constructor just for usage by de-serializers. Do not use this constructor
	 * within applications as it may lead to incomplete instances that cause exceptions.
	 */
	public FloorSwitcherPlace() {
		super();
	}
	
	/**
	 * Constructor just for usage by de-serializers. Do not use this constructor
	 * within applications as it may lead to incomplete instances that cause exceptions.
	 */
	public FloorSwitcherPlace(String uri) {
		super(uri);
	}
	
	
	/**
 	 * Creates a FloorSwitcherPlace object
	 * @param uri The created FloorSwitcherPlace object URI
	 * @param reachedZ Z coordinates reached by the FloorSwitcher (this array must contain 
	 * at least 2 elements)
	 */
	public FloorSwitcherPlace(String uri, Double [] reachedZ) {
		super(uri, PlaceType.floorSwitcherPlaceType);
		setReachesZCoordinate(reachedZ);
	}
	
	/**
	 * Creates a FloorSwitcherPlace object
	 * @param reachedZ Z coordinates reached by the FloorSwitcher (this array must contain 
	 * at least 2 elements)
	 */
	public FloorSwitcherPlace(Double [] reachedZ) {
		super(PlaceType.floorSwitcherPlaceType);
		setReachesZCoordinate(reachedZ);
	}
	
	/**
	 * Creates a FloorSwitcherPlace object
	 * @param uri this value can also be a null object
	 * @param reachedZ A Double array with REACHES_Z_COORDINATE attributes (it must contain 
	 * at least 2 elements).
	 * @param name The place name. A null object is not allowed
	 */
	public FloorSwitcherPlace(String uri, Double [] reachedZ, String name) {
		super(uri,PlaceType.floorSwitcherPlaceType, name);
		setReachesZCoordinate(reachedZ);	}
	
	/**
	 * Set REACHES_Z_COORDINATE property
	 * @param reachedZ Z coordinates reached by the FloorSwitcher (this array must contain 
	 * at least 2 elements)
	 */
	public void setReachesZCoordinate(Double [] reachedZ){
		if (reachedZ == null || reachedZ.length<2)
			throw new IllegalArgumentException();
		List rz= new Vector();
		for (int i=0; i<reachedZ.length;i++)
		{
			if (reachedZ[i] == null)
				throw new IllegalArgumentException();
			rz.add(reachedZ[i]);
		}	
		props.put(PROP_REACHES_Z_COORDINATE, rz);
	}
	
	/**
	 * 
	 * @return REACHES_Z_COORDINATE property values as a Double array
	 */
	public Double[] getReachesZCoordinate(){
		if (!props.containsKey(PROP_REACHES_Z_COORDINATE))
			return null;
		List rz=(List)props.get(PROP_REACHES_Z_COORDINATE);
		return (Double[])rz.toArray(new Double[0]);
	}
	
	/**
	 * A well formed FloorSwitcher must have a position and at least two values
	 * of REACHES_Z_COORDINATE property. Moreover, if HAS_INCLINATION property is present
	 * it must be positive.
	 */
	public boolean isWellFormed(){
		if (!props.containsKey(PROP_HAS_POSITION))
			return false;
		if (!props.containsKey(PROP_REACHES_Z_COORDINATE))
			return false;
		List Z = (List)props.get(PROP_REACHES_Z_COORDINATE);
		if (Z.size()<2)
			return false;
		if (props.containsKey(PROP_HAS_INCLINATION) && 
			((Integer)props.get(PROP_HAS_INCLINATION)).intValue()<=0)
			return false;
		
		return super.isWellFormed();
	}
	
	/**
	 * 
	 * @return HAS_INCLINATION property value (degrees). If this property is not present it is assumed
	 * that is it 90°
	 */
	public int getInclination(){
		if (!props.containsKey(PROP_HAS_INCLINATION))
			return 90;
		return ((Integer)props.get(PROP_HAS_INCLINATION)).intValue();		
	}
	
	/**
	 * 
	 * @return HAS_INCLINATION property value (radiant). If this property is not present it is assumed
	 * that is it PI/2
	 */
	public double getInclinationRad(){
		if (!props.containsKey(PROP_HAS_INCLINATION))
			return Math.PI/2;
		double incl=((Integer)props.get(PROP_HAS_INCLINATION)).doubleValue();
		return Math.PI*incl/180;		
	}
	
	/**
	 * Set HAS_INCLINATION property
	 * @param incl FloorSwitcher inclination (degrees). This value must be positive
	 */
	public void setInclination(int incl){
		if (incl<=0)
			throw new IllegalArgumentException();
		props.put(PROP_HAS_INCLINATION, new Integer(incl));
	}
	
}

