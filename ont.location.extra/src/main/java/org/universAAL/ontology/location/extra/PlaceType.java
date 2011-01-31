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


/**
 * This PlaceType represents the type on a Place.
 * There are 4 available place types (room, building, other, and floor switcher) and it is not possible
 * to create new ones.
 * @author smazzei
 *
 */
public class PlaceType extends ManagedIndividual {
	public static final String MY_URI;
	static {
		MY_URI = uAAL_VOCABULARY_NAMESPACE + "PlaceType";
		register(PlaceType.class);
	}
	
	public static final int BUILDING_PLACETYPE = 0;
	public static final int OTHER_PLACETYPE = 1;
	public static final int ROOM_PLACETYPE = 2;
	public static final int FLOOR_SWITCHER_PLACETYPE = 3;

	private static final String[] names = {
        "building_placetype", "other_placetype", "room_placetype", "floor_switcher_placetype"};
	
	//available place types
	public static final PlaceType buildingPlaceType = new PlaceType(BUILDING_PLACETYPE);
	public static final PlaceType otherPlaceType = new PlaceType(OTHER_PLACETYPE);
	public static final PlaceType roomPlaceType = new PlaceType(ROOM_PLACETYPE);
	public static final PlaceType floorSwitcherPlaceType = new PlaceType(FLOOR_SWITCHER_PLACETYPE);
    private int order;
    
    /**
     * This is a private constructor because it is not possible to create new place types
     */
    private PlaceType(int order) {
    	super(uAAL_VOCABULARY_NAMESPACE + names[order]);
        this.order = order;
    }
	
	/**
	 * @return The ManagedIndividual array of all available place types (i.e. buildingPlaceType,
	 * otherPlaceType, roomPlaceType, and floorSwitcherPlaceType)
	 */
    public static ManagedIndividual[] getEnumerationMembers() {
		return new ManagedIndividual[] {buildingPlaceType, otherPlaceType, roomPlaceType, floorSwitcherPlaceType};
	}
	
	public static String getRDFSComment() {
		return "The type of a place";
	}
	
	public static String getRDFSLabel() {
		return "Place Type";
	}
	
	/**
	 * 
	 * @return The PlaceType with the specified order. If no PlaceType is found the method
	 * returns <I>null
	 */
	public static PlaceType getPlaceTypeByOrder(int order) {
        switch (order) {
        case BUILDING_PLACETYPE: return buildingPlaceType;
        case OTHER_PLACETYPE: return otherPlaceType;
        case ROOM_PLACETYPE: return roomPlaceType;
        case FLOOR_SWITCHER_PLACETYPE: return floorSwitcherPlaceType;
        default: return null;
        }
	}
	/**
	 * @return The PlaceType with the specified name. If no PlaceType is found the method
	 * returns <I>null
	 */
    public static final PlaceType valueOf(String name) {
    	if (name == null)
    		return null;
    	
    	if (name.startsWith(uAAL_VOCABULARY_NAMESPACE))
    		name = name.substring(uAAL_VOCABULARY_NAMESPACE.length());
    	
        for (int i=0;  i<=names.length; i++)
            if (names[i].equals(name))
                return getPlaceTypeByOrder(i);
        return null;
    }
    
	/**
	 * @return The PlaceType with the specified URI. If no PlaceType is found the method
	 * returns <I>null
	 */
    public static ManagedIndividual getIndividualByURI(String instanceURI) {
		if (instanceURI==null || !(instanceURI.startsWith(uAAL_SERVICE_NAMESPACE)))
			return null;
		
		return valueOf(instanceURI);
	}
	
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_REDUCED;
	}
	
	/**
	 * A PlaceType is ever well formed
	 */
	public boolean isWellFormed() {
		return true;
	}
	
    public String getPlaceTypeName() {
        return names[order];
    }
    
    public int getPalceTypeOrder() {
        return order;
    }

    public void setProperty(String propURI, Object o) {
		// do nothing
	}
	
}
