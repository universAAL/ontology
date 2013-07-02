/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute for Computer Graphics Research
	
	Copyright 2008-2010 ITACA-TSB, http://www.tsb.upv.es
        Instituto Tecnologico de Aplicaciones de Comunicacion 
        Avanzadas - Grupo Tecnologias para la Salud y el 
        Bienestar (TSB)
	
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
package org.universAAL.ontology.location.address;

import java.util.ArrayList;
import java.util.List;

import org.universAAL.ontology.location.LocationOntology;

/**
 * Ontological representation of a Physical Address. It is used when the address
 * represents a physical entity that can be placed in the world. Methods
 * included in this class are the mandatory ones for representing an ontological
 * concept in Java classes for uAAL. Usually it includes getters and setters for
 * most of its properties.
 * 
 * @author alfiva
 * 
 */
public class PhysicalAddress extends Address {

    public static final String MY_URI = LocationOntology.NAMESPACE + "PhysicalAddress";
    public static final String PROP_HAS_BUILDING_ID = LocationOntology.NAMESPACE + "hasBuildingID";
    public static final String PROP_HAS_HALL_ID = LocationOntology.NAMESPACE + "hasHallID";
    public static final String PROP_HAS_FLOOR_ID = LocationOntology.NAMESPACE + "hasFloorID";
    public static final String PROP_HAS_DOOR_ID = LocationOntology.NAMESPACE + "hasDoorID";
    public static final String PROP_HAS_DESK_ID = LocationOntology.NAMESPACE + "hasDeskID";
    public static final String PROP_HAS_OFFICE_ID = LocationOntology.NAMESPACE + "hasOfficeID";
    public static final String PROP_HAS_ADDITIONAL_ID = LocationOntology.NAMESPACE + "hasAdditionalID";


    /**
     * Creates a PhysicalAddress object
     */
    public PhysicalAddress() {

    }

    /**
     * Creates a PhysicalAddress object
     * 
     * @param uri
     *            the object URI
     */
    public PhysicalAddress(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    // public PhysicalAddress(String uri, Street street) {
    // super(uri);
    // props.put(PROP_HAS_STREET, street);
    // }

    public int getPropSerializationType(String propURI) {
	// if (PROP_HAS_STREET.equals(propURI))
	// return PROP_SERIALIZATION_FULL;
	return PROP_SERIALIZATION_OPTIONAL;
    }

    public boolean isWellFormed() {
	// return props.contains(PROP_HAS_STREET);
	return true;
    }

    /**
     * Gets the Building value of the Address
     * 
     * @return The Building value
     */
    public String getBuildingID() {
	return (String) props.get(PROP_HAS_BUILDING_ID);
    }

    /**
     * Sets the Building value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setBuildingID(String val) {
	props.put(PROP_HAS_BUILDING_ID, val);
    }

    /**
     * Gets the Hall value of the Address
     * 
     * @return The Hall value
     */
    public String getHallID() {
	return (String) props.get(PROP_HAS_HALL_ID);
    }

    /**
     * Sets the Hall value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setHallID(String val) {
	props.put(PROP_HAS_HALL_ID, val);
    }

    /**
     * Gets the Floor value of the Address
     * 
     * @return The Floor value
     */
    public String getFloorID() {
	return (String) props.get(PROP_HAS_FLOOR_ID);
    }

    /**
     * Sets the Floor value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setFloorID(String val) {
	props.put(PROP_HAS_FLOOR_ID, val);
    }

    /**
     * Gets the Door value of the Address
     * 
     * @return The Door value
     */
    public String getDoorID() {
	return (String) props.get(PROP_HAS_DOOR_ID);
    }

    /**
     * Sets the Door value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setDoorID(String val) {
	props.put(PROP_HAS_DOOR_ID, val);
    }

    /**
     * Gets the Desk value of the Address
     * 
     * @return The Desk value
     */
    public String getDeskID() {
	return (String) props.get(PROP_HAS_DESK_ID);
    }

    /**
     * Sets the Desk value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setDeskID(String val) {
	props.put(PROP_HAS_DESK_ID, val);
    }

    /**
     * Gets the Office value of the Address
     * 
     * @return The Office value
     */
    public String getOfficeID() {
	return (String) props.get(PROP_HAS_OFFICE_ID);
    }

    /**
     * Sets the Office value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setOfficeID(String val) {
	props.put(PROP_HAS_OFFICE_ID, val);
    }

    public String[] getAdditionalID() {
	Object propList = props.get(PROP_HAS_ADDITIONAL_ID);
	if (propList instanceof List) {
	    return (String[]) ((List) propList).toArray(new String[0]);
	} else {
	    List returnList = new ArrayList();
	    if (propList != null)
		returnList.add((String) propList);
	    return (String[]) returnList.toArray(new String[0]);
	}
    }

    public void addAdditionalID(String id) {
	Object propList = props.get(PROP_HAS_ADDITIONAL_ID);
	if (propList instanceof List) {
	    List list = (List) propList;
	    list.add(id);
	    props.put(PROP_HAS_ADDITIONAL_ID, list);
	} else if (propList == null) {
	    props.put(PROP_HAS_ADDITIONAL_ID, id);
	} else {
	    List list = new ArrayList();
	    list.add((String) propList);
	    list.add(id);
	    props.put(PROP_HAS_ADDITIONAL_ID, list);
	}
    }

    public void setAdditionalID(String[] id) {
	List propList = new ArrayList(id.length);
	for (int i = 0; i < id.length; i++) {
	    propList.add(id[i]);
	}
	props.put(PROP_HAS_ADDITIONAL_ID, id);
    }

    // public Street getStreet() {
    // return (Street) props.get(PROP_HAS_STREET);
    // }
    //
    // public void setStreet(Street val) {
    // props.put(PROP_HAS_STREET, val);
    // }

    // public Integer getNumber() {
    // return (Integer) props.get(PROP_HAS_NUMBER);
    // }
    //
    // public void setStreet(Integer val) {
    // props.put(PROP_HAS_NUMBER, val);
    // }

    public String toReadableString() {
	// String street;
	// if(this.getStreet()!=null){
	// street=this.getStreet().getName();
	// }
	StringBuilder address = new StringBuilder();
	StringBuilder buildings = new StringBuilder();
	StringBuilder cities = new StringBuilder();
	// if(this.getNumber()!=null){
	// buildings.append(this.getNumber());
	// }
	if (this.getBuildingID() != null) {
	    if (buildings.length() > 0)
		buildings.append(", ");
	    buildings.append("Building " + this.getBuildingID());
	}
	if (this.getHallID() != null) {
	    if (buildings.length() > 0)
		buildings.append(", ");
	    buildings.append("Hall " + this.getHallID());
	}
	if (this.getFloorID() != null) {
	    if (buildings.length() > 0)
		buildings.append(", ");
	    buildings.append("Floor " + this.getFloorID());
	}
	if (this.getDoorID() != null) {
	    if (buildings.length() > 0)
		buildings.append(", ");
	    buildings.append("Door " + this.getDoorID());
	}
	if (this.getDeskID() != null) {
	    if (buildings.length() > 0)
		buildings.append(", ");
	    buildings.append("Desk " + this.getDeskID());
	}
	if (this.getOfficeID() != null) {
	    if (buildings.length() > 0)
		buildings.append(", ");
	    buildings.append("Office " + this.getOfficeID());
	}
	if (this.getCityPlace() != null) {
	    cities.append(this.getCityPlace());
	}
	if (this.getCityQuarter() != null) {
	    if (cities.length() > 0)
		cities.append(", ");
	    cities.append(this.getCityQuarter());
	}
	if (this.getCityRegion() != null) {
	    if (cities.length() > 0)
		cities.append(", ");
	    cities.append(this.getCityRegion());
	}
	if (this.getCity() != null) {
	    if (cities.length() > 0)
		cities.append(", ");
	    cities.append(this.getCity());
	}
	if (cities.length() > 0)
	    cities.append("\n");
	if (this.getRegion() != null) {
	    cities.append(this.getRegion());
	}
	if (this.getState() != null) {
	    if (cities.length() > 0)
		cities.append(", ");
	    cities.append(this.getState());
	}
	if (this.getCountry() != null) {
	    if (cities.length() > 0)
		cities.append(", ");
	    cities.append(this.getCountry());
	}
	// address.append(street+" ");
	if (buildings.length() > 0)
	    address.append(buildings.toString() + ".\n");
	if (this.getPostalCode() != null)
	    address.append(this.getPostalCode() + ". \n");
	if (cities.length() > 0)
	    address.append(cities.toString() + ".\n");
	if (this.getExtAddress() != null)
	    address.append(this.getExtAddress() + ". \n");

	return address.toString();
    }
}
