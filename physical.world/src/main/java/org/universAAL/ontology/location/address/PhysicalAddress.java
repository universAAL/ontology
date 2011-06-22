package org.universAAL.ontology.location.address;

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.location.Location;

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

    public static final String MY_URI;
    public static final String PROP_HAS_BUILDING_ID;
    public static final String PROP_HAS_HALL_ID;
    public static final String PROP_HAS_FLOOR_ID;
    public static final String PROP_HAS_DOOR_ID;
    public static final String PROP_HAS_DESK_ID;
    public static final String PROP_HAS_OFFICE_ID;
    public static final String PROP_HAS_ADDITIONAL_ID;
    // public static final String PROP_HAS_STREET;
    // public static final String PROP_HAS_NUMBER;

    static {
	MY_URI = Location.uAAL_LOCATION_NAMESPACE + "PhysicalAddress";

	PROP_HAS_BUILDING_ID = Location.uAAL_LOCATION_NAMESPACE
		+ "hasBuildingID";
	PROP_HAS_HALL_ID = Location.uAAL_LOCATION_NAMESPACE + "hasHallID";
	PROP_HAS_FLOOR_ID = Location.uAAL_LOCATION_NAMESPACE + "hasFloorID";
	PROP_HAS_DOOR_ID = Location.uAAL_LOCATION_NAMESPACE + "hasDoorID";
	PROP_HAS_DESK_ID = Location.uAAL_LOCATION_NAMESPACE + "hasDeskID";
	PROP_HAS_OFFICE_ID = Location.uAAL_LOCATION_NAMESPACE + "hasOfficeID";
	PROP_HAS_ADDITIONAL_ID = Location.uAAL_LOCATION_NAMESPACE
		+ "hasAdditionalID";
	// PROP_HAS_STREET = Location.uAAL_LOCATION_NAMESPACE +
	// "hasAddressStreet";
	// PROP_HAS_STREET = Location.uAAL_LOCATION_NAMESPACE +
	// "hasAddressNumber";

	register(PhysicalAddress.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {

	if (PROP_HAS_BUILDING_ID.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 0);// Building
	if (PROP_HAS_HALL_ID.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 0);// Hall
	if (PROP_HAS_FLOOR_ID.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 0);// BuildingLevel
	if (PROP_HAS_DOOR_ID.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 0);// Home
	if (PROP_HAS_DESK_ID.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 0);
	if (PROP_HAS_OFFICE_ID.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 0);
	if (PROP_HAS_ADDITIONAL_ID.equals(propURI))
	    return Restriction.getAllValuesRestriction(propURI, TypeMapper
		    .getDatatypeURI(String.class));// IndoorPlace
	// if (PROP_HAS_STREET.equals(propURI))
	// return
	// Restriction.getAllValuesRestrictionWithCardinality(propURI,
	// Street.MY_URI, 1, 1);
	// if (PROP_HAS_NUMBER.equals(propURI))
	// return
	// Restriction.getAllValuesRestrictionWithCardinality(propURI,
	// TypeMapper.getDatatypeURI(Integer.class), 1, 0);

	return Address.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = Address.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 7];

	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i++] = PROP_HAS_BUILDING_ID;
	toReturn[i++] = PROP_HAS_HALL_ID;
	toReturn[i++] = PROP_HAS_FLOOR_ID;
	toReturn[i++] = PROP_HAS_DOOR_ID;
	toReturn[i++] = PROP_HAS_DESK_ID;
	toReturn[i++] = PROP_HAS_OFFICE_ID;
	toReturn[i] = PROP_HAS_ADDITIONAL_ID;
	// toReturn[i++] = PROP_HAS_STREET;
	// toReturn[i] = PROP_HAS_NUMBER;
	return toReturn;
    }

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

    // public PhysicalAddress(String uri, Street street) {
    // super(uri);
    // props.put(PROP_HAS_STREET, street);
    // }
    /**
     * Returns a human readable description on the essence of this ontology
     * class.
     */
    public static String getRDFSComment() {
	return "An extended address for a physical place";
    }
    /**
     * Returns a label with which this ontology class can be introduced to human
     * users.
     */
    public static String getRDFSLabel() {
	return "Physical Address";
    }

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
