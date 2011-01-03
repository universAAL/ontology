/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut f�r Graphische Datenverarbeitung 
	
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
 * Superclass for all locations that are defined according to the physical world ontology.
 * New implementations need to be added to the Activator.loadClasses() list.
 * 
 */
package org.universAAL.ontology.location;

import java.util.List;
import java.util.Vector;

import org.universAAL.middleware.owl.ComparableIndividual;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.owl.supply.AbsLocation;
import org.universAAL.middleware.rdf.TypeMapper;


/**
 * @author chwirth
 */
public class Location extends AbsLocation {

	public static final String uAAL_LOCATION_NAMESPACE = "http://ontology.universAAL.org/PhysicalWorld.owl#";
	public static final String MY_URI;

	public static final String PROP_HAS_NAME;
	public static final String PROP_IS_ADJACENT_TO;
	public static final String PROP_IS_CONNECTED_TO;
	public static final String PROP_IS_CONTAINED_IN;
	public static final String PROP_CONTAINS;

	static {
		MY_URI = uAAL_LOCATION_NAMESPACE + "Location";
		PROP_HAS_NAME = uAAL_LOCATION_NAMESPACE + "hasName";
		PROP_IS_ADJACENT_TO =uAAL_LOCATION_NAMESPACE + "isAdjacentTo";
		PROP_IS_CONNECTED_TO =uAAL_LOCATION_NAMESPACE + "isConnectedTo";
		PROP_IS_CONTAINED_IN = uAAL_LOCATION_NAMESPACE + "isContainedIn";
		PROP_CONTAINS = uAAL_LOCATION_NAMESPACE + "contains";
		register(Location.class);
	}

	public static Restriction getClassRestrictionsOnProperty(String propURI) {

		if (PROP_HAS_NAME.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(String.class),1, 0);
		if (PROP_IS_ADJACENT_TO.equals(propURI))
			return Restriction.getAllValuesRestriction(propURI,
					Location.MY_URI);
		if (PROP_IS_CONNECTED_TO.equals(propURI))
			return Restriction.getAllValuesRestriction(propURI,
					Location.MY_URI);
		if (PROP_IS_CONTAINED_IN.equals(propURI))
			return Restriction.getAllValuesRestriction(propURI,
					Location.MY_URI);
		if (PROP_CONTAINS.equals(propURI))
			return Restriction.getAllValuesRestriction(propURI,
					Location.MY_URI);
		return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
	}

	public static String[] getStandardPropertyURIs() {
		String[] inherited = AbsLocation.getStandardPropertyURIs();
		String[] toReturn = new String[inherited.length+5];
		int i = 0;
		while (i < inherited.length) {
			toReturn[i] = inherited[i];
			i++;
		}
		toReturn[i++] = PROP_HAS_NAME;
		toReturn[i++] = PROP_IS_ADJACENT_TO;
		toReturn[i++] = PROP_IS_CONNECTED_TO;
		toReturn[i++] = PROP_IS_CONTAINED_IN;
		toReturn[i] = PROP_CONTAINS;
		return toReturn;
	}

	/**
	 * Constructor just for usage by de-serializers. Do not use this constructor
	 * within applications as it may lead to incomplete instances that cause exceptions.
	 */
	public Location() {
		super();
	}

	/**
	 * Constructor just for usage by de-serializers. Do not use this constructor
	 * within applications as it may lead to incomplete instances that cause exceptions.
	 */
	public Location(String uri) {
		super(uri);
	}

	/**
	 * Creates a new Location object
	 * @param uri The Location instance URI
	 * @param name The name of the location
	 */
	public Location(String uri, String name) {
		super(uri);
		if (name == null)
			throw new IllegalArgumentException();

		props.put(PROP_HAS_NAME, name);
	}

	/**
	 * Returns a human readable description on the essence of this ontology class.
	 */
	public static String getRDFSComment() {
		return "The root class for all locations.";
	}

	/**
	 * Returns a label with which this ontology class can be introduced to human users.
	 */
	public static String getRDFSLabel() {
		return "Location";
	}

	/**
	 * Add a new Location in the given property list
	 * @param propURI the property
	 * @param location If it is null no property is added.
	 * @return false if no property is added.
	 */
	private boolean addMultipleValueLocationProperty(String propURI, Location location){
		if (location==null || (propURI!=PROP_IS_ADJACENT_TO && propURI!=PROP_IS_CONNECTED_TO && propURI!=PROP_CONTAINS))
			return false;
		List locations;
		if (props.containsKey(propURI)){
			locations=(List)props.get(propURI);
			if (locations.contains(location))
				return false;
		}
		else
			locations= new Vector();
		locations.add(location);
		props.put(propURI, locations);
		return true;
	}

	/**
	 * Returns an array of all Locations that are value of the given property
	 * @param propURI
	 * @return
	 */
	private Location[] getMultipleValueLocationProperty(String propURI) {
		if (!props.containsKey(propURI)) return null;
		List conn= (List)props.get(propURI);
		return (Location[])conn.toArray(new Location[0]);
	}

	/**
	 * Removes a Location value in a value list of the given property
	 * @param propURI 
	 * @param location The location to remove, must not be null.
	 * @return false if the location was not removed or not valid
	 */
	private boolean removeMulitpleValueLocationProperty(String propURI,Location location) {
		if (!props.containsKey(propURI) || location==null || (propURI!=PROP_IS_ADJACENT_TO && propURI!=PROP_IS_CONNECTED_TO && propURI!=PROP_IS_CONTAINED_IN && propURI!=PROP_CONTAINS))
			return false;
		List locations;
		if (props.containsKey(propURI)){
			locations=(List)props.get(propURI);
			if (!locations.contains(location))
				return false;
		} else return false;
		locations.remove(location);
		props.put(propURI, location);
		return true;	
	}

	/**
	 * 
	 * @return The value of "is adjacent to" property. If the property is not present a null
	 * object is returned.
	 */
	public Location[] getAdjacentLocations(){
		return getMultipleValueLocationProperty(PROP_IS_ADJACENT_TO);
	}

	/**
	 * Set the "is adjacent to" attribute.
	 * @param location A null value is not admitted.
	 */
	public void addAdjacentLocation(Location location){
		if (location==null) throw new IllegalArgumentException();
		addMultipleValueLocationProperty(PROP_IS_ADJACENT_TO,location);
	}

	/**
	 * removes a location from the "is adjacent to" attribute.
	 * 
	 */
	public void removeAdjacentLocation(Location location) {
		if (location==null) throw new IllegalArgumentException();
		removeMulitpleValueLocationProperty(PROP_IS_ADJACENT_TO,location);
	}

	/**
	 * removes all adjacent locations from this location.
	 */
	public void clearAdjacentLocations() {
		props.put(PROP_IS_ADJACENT_TO, new Vector());
	}

	/**
	 * 
	 * @return The value of "is connected to" property. If the property is not present a null
	 * object is returned.
	 */
	public Location[] getConnectedLocations(){
		return getMultipleValueLocationProperty(PROP_IS_CONNECTED_TO);
	}

	/**
	 * Adds a value to the "is connected to" attribute.
	 * @param location A null value is not admitted.
	 */
	public void addConnectedLocation(Location location){
		if (location==null) throw new IllegalArgumentException();
		addMultipleValueLocationProperty(PROP_IS_CONNECTED_TO,location);
	}

	/**
	 * removes a location from the "is connected to" attribute.
	 * 
	 */
	public void removeConnectedLocation(Location location) {
		if (location==null) throw new IllegalArgumentException();
		removeMulitpleValueLocationProperty(PROP_IS_CONNECTED_TO,location);
	}

	/**
	 * removes all connected locations from this location.
	 */
	public void clearConnectedLocations() {
		props.put(PROP_IS_CONNECTED_TO, new Vector());
	}

	/**
	 * 
	 * @return The value of "contains" property. If the property is not present a null
	 * object is returned.
	 */
	public Location[] getContainedLocations(){
		return getMultipleValueLocationProperty(PROP_CONTAINS);
	}

	/**
	 * Adds a value to the "contains" attribute.
	 * it also sets the location.containedBy property if not set.
	 * @param location A null value is not admitted.
	 */
	public void addContainedLocation(Location location){
		if (location==null) throw new IllegalArgumentException();
		
		addMultipleValueLocationProperty(PROP_CONTAINS,location);
		
		location.setContainingLocation(this);
	}

	/**
	 * removes a location from the "contains" attribute.
	 * 
	 */
	public void removeContainedLocation(Location location) {
		if (location==null) throw new IllegalArgumentException();
		removeMulitpleValueLocationProperty(PROP_CONTAINS,location);
	}

	/**
	 * removes all contained locations from this location.
	 */
	public void clearContainedLocations() {
		props.put(PROP_CONTAINS, new Vector());
	}

	/**
	 * 
	 * @return The value of "is contained in" property. If the property is not present a null
	 * object is returned.
	 */
	public Location getContainingLocation(){
		return (Location) props.get(PROP_IS_CONTAINED_IN);
	}

	/**
	 * Sets the "is contained in" attribute.
	 * @param location A null value is not admitted.
	 */
	public void setContainingLocation(Location location){
		if (location==null) throw new IllegalArgumentException();
		props.put(PROP_IS_CONTAINED_IN,location);
	}


	/**
	 * removes all containing locations from this location.
	 */
	public void clearContainingLocations() {
		props.put(PROP_IS_CONTAINED_IN, null);
	}

	public int getPropSerializationType(String propURI) {
		if (PROP_IS_CONNECTED_TO.equals(propURI)
				||PROP_HAS_NAME.equals(propURI)
				||PROP_IS_ADJACENT_TO.equals(propURI)
				||PROP_IS_CONTAINED_IN.equals(propURI)
				||PROP_CONTAINS.equals(propURI))
			return PROP_SERIALIZATION_REDUCED;

		return PROP_SERIALIZATION_OPTIONAL;
	}

//	private boolean contains(Location[] locs, Location loc) {
//		for(int i=0;i<locs.length;i++) {
//			if(locs[i].equals(loc)) return true;
//		}
//		return false;
//	}

	public int compareTo(Object arg0) {
		if (this.equals(arg0))
			return 0;
		
		if (arg0 instanceof Location) {
			Location currContaining=this.getContainingLocation();
			Location compare = (Location)arg0;
			while(currContaining != null) {
				if(currContaining.equals(compare))
					return -1;
				currContaining = currContaining.getContainingLocation();
			}
			
			currContaining=compare.getContainingLocation();
			compare = this;
			while(currContaining != null) {
				if(currContaining.equals(compare))
					return 1;
				currContaining = currContaining.getContainingLocation();
			}
			
			if (recursiveCompare(getContainedLocations(), (Location) arg0))
				return 1;
			
			if (recursiveCompare(((Location) arg0).getContainedLocations(), this))
				return -1;
		}
		
		return NON_COMPARABLE_INDIVIDUALS;
	}
	
	private boolean recursiveCompare(Location[] current,Location compare) {
		if (current != null) {
			for(int i=0;i<current.length;i++) {
				if(current[i].equals(compare)) return true;
				if(recursiveCompare(current[i].getContainedLocations(),compare)) return true;
			}
		}	
		return false;
	}

	public boolean hasConnectionTo(AbsLocation arg0) {
		List connected = (List)props.get(PROP_IS_CONNECTED_TO);
		return connected.contains(arg0);
	}

	public boolean isAdjacentTo(AbsLocation arg0) {
		List connected = (List)props.get(PROP_IS_ADJACENT_TO);
		return connected.contains(arg0);
	}

	public ComparableIndividual getNext() {
		return getContainingLocation();
	}

	public ComparableIndividual getPrevious() {
		Location[] children = getContainedLocations();
		if (children != null  &&  children.length > 0) {
			// direct children of a location are normally not comparable to each other
			// so, simply pick the first child
			return children[0];
		}
		return null;
	}

	public int ord() {
		// TODO Auto-generated method stub
		return Integer.MIN_VALUE;
	}

	public float getDistanceTo(AbsLocation other) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
