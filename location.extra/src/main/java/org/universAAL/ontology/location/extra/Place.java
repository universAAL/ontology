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

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;

/**
 * The class Place represents a generic place. This is an abstract class because
 * it is not possible to create a Place without a place type or with an
 * arbitrary place type. It is possible to create a place instance using the
 * following subclasses: BuildindPlace, RoomPlace, and OtherPlace
 * 
 * 
 * @author smazzei
 * 
 */
public abstract class Place extends ManagedIndividual {

    public static final String MY_URI;
    public static final String PROP_HAS_CONNECTION;
    public static final String PROP_HAS_POSITION;
    public static final String PROP_HAS_NAME;
    public static final String PROP_HAS_PLACETYPE;
    public static final String PROP_IS_ADJACENT_TO;
    public static final String PROP_IS_IN_PLACE;
    public static final String PROP_HAS_ADDRESS;
    public static final String PROP_CONTAINS_PLACE;

    static {
	MY_URI = uAAL_VOCABULARY_NAMESPACE + "Place";
	// a place can be connected to another place (i.e. there is a door that
	// connects them)
	PROP_HAS_CONNECTION = uAAL_VOCABULARY_NAMESPACE + "hasConnection";
	// a place can have a relative or an absolute position
	PROP_HAS_POSITION = uAAL_VOCABULARY_NAMESPACE + "hasPosition";
	PROP_HAS_NAME = uAAL_VOCABULARY_NAMESPACE + "hasName";
	PROP_HAS_PLACETYPE = uAAL_VOCABULARY_NAMESPACE + "hasPlaceType";
	PROP_IS_ADJACENT_TO = uAAL_VOCABULARY_NAMESPACE + "isAdjacentTo";
	// usually a room place is contained in a building place
	PROP_IS_IN_PLACE = uAAL_VOCABULARY_NAMESPACE + "isInPlace";
	// usually a building place contains one or more places
	PROP_CONTAINS_PLACE = uAAL_VOCABULARY_NAMESPACE + "containsPlace";
	PROP_HAS_ADDRESS = uAAL_VOCABULARY_NAMESPACE + "hasAddress";
	register(Place.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {

	if (PROP_HAS_CONNECTION.equals(propURI))
	    return Restriction.getAllValuesRestriction(propURI, Place.MY_URI);
	if (PROP_HAS_POSITION.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    Position.MY_URI, 1, 0);
	if (PROP_HAS_NAME.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 0);
	// HAS_PLACETYPE is the only mandatory property
	if (PROP_HAS_PLACETYPE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    PlaceType.MY_URI, 1, 1);
	if (PROP_IS_ADJACENT_TO.equals(propURI))
	    return Restriction.getAllValuesRestriction(propURI, Place.MY_URI);
	if (PROP_IS_IN_PLACE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    Place.MY_URI, 1, 0);
	if (PROP_HAS_ADDRESS.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    PhysicalAddress.MY_URI, 1, 0);
	if (PROP_CONTAINS_PLACE.equals(propURI))
	    return Restriction.getAllValuesRestriction(propURI, Place.MY_URI);

	return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	return new String[] { PROP_CONTAINS_PLACE, PROP_HAS_ADDRESS,
		PROP_HAS_CONNECTION, PROP_HAS_NAME, PROP_HAS_PLACETYPE,
		PROP_HAS_POSITION, PROP_IS_ADJACENT_TO, PROP_IS_IN_PLACE };
    }

    /**
     * Constructor just for usage by de-serializers. Do not use this constructor
     * within applications as it may lead to incomplete instances that cause
     * exceptions.
     */
    public Place() {
	super();
    }

    /**
     * Constructor just for usage by de-serializers. Do not use this constructor
     * within applications as it may lead to incomplete instances that cause
     * exceptions.
     */
    public Place(String uri) {
	super(uri);
    }

    /**
     * @param uri
     *            object URI
     * @param type
     *            PlaceType
     */
    protected Place(String uri, PlaceType type) {
	super(uri);
	if (type == null)
	    throw new IllegalArgumentException();
	props.put(PROP_HAS_PLACETYPE, type);
    }

    /**
     * @param type
     *            PlaceType
     */
    protected Place(PlaceType type) {
	super();
	if (type == null)
	    throw new IllegalArgumentException();
	props.put(PROP_HAS_PLACETYPE, type);
    }

    /**
     * @param uri
     *            object URI
     * @param type
     *            PlaceType
     * @param name
     *            The object name property
     */
    protected Place(String uri, PlaceType type, String name) {
	super(uri);
	if (type == null || name == null || name == "")
	    throw new IllegalArgumentException();
	props.put(PROP_HAS_PLACETYPE, type);
	props.put(PROP_HAS_NAME, name);
    }

    public static String getRDFSComment() {
	return "The class of places.";
    }

    public static String getRDFSLabel() {
	return "Place";
    }

    public int getPropSerializationType(String propURI) {
	if (PROP_HAS_CONNECTION.equals(propURI)
		|| PROP_HAS_POSITION.equals(propURI)
		|| PROP_HAS_NAME.equals(propURI)
		|| PROP_HAS_PLACETYPE.equals(propURI)
		|| PROP_IS_ADJACENT_TO.equals(propURI)
		|| PROP_IS_IN_PLACE.equals(propURI)
		|| PROP_HAS_ADDRESS.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }

    /**
     * @return true if:
     *         <ul>
     *         <li>HAS_CONNECTION and IS_ADJACENT_TO are symmetric
     *         <li>two connected places are also adjacent
     *         <li>the Place has an absolute position or it is contained in a
     *         place that has an absolute position
     * 
     */
    public boolean isWellFormed() {
	// if HAS_CONNECTION is not symmetric or connected places are not
	// adjacent return false
	Place[] ConnectedPlaces = this.getConnectedPlaces();
	int ConnectedPlacesLenght = 0;
	if (ConnectedPlaces != null)
	    ConnectedPlacesLenght = ConnectedPlaces.length;
	for (int i = 0; i < ConnectedPlacesLenght; i++)
	    if ((!ConnectedPlaces[i].isConnectedTo(this))
		    || (!this.isAdjacentTo(ConnectedPlaces[i])))
		return false;

	// if IS_CONNECTED_TO is not symmetric return false
	Place[] AdjacentPlaces = this.getAdjacentPlaces();
	int AdjacentPlacesLenght = 0;
	if (AdjacentPlaces != null)
	    AdjacentPlacesLenght = AdjacentPlaces.length;
	for (int i = 0; i < AdjacentPlacesLenght; i++)
	    if (!AdjacentPlaces[i].isAdjacentTo(this))
		return false;
	// return false if getGlobalPosition returns a null object
	if (getGlobalPosition() == null)
	    return false;
	return true;
    }

    /**
     * 
     * @return The "is_in_place property as a Place object. This value can be
     *         null
     */
    public Place getIsInPlace() {
	return (Place) props.get(PROP_IS_IN_PLACE);
    }

    /**
     * Set the is_in_place property
     * 
     * @param containingPlace
     *            A null value is not admitted as argument
     */
    public void setIsInPlace(Place containingPlace) {
	if (containingPlace == null)
	    throw new IllegalArgumentException();
	props.put(PROP_IS_IN_PLACE, containingPlace);
	if (!containingPlace.Contains(this))
	    containingPlace.addContainedPlace(this);
    }

    public boolean isInPlace(Place containingPlace) {
	if (containingPlace == null)
	    return false;
	Place p = this.getIsInPlace();
	return (p != null && containingPlace.equals(p));
    }

    /**
     * Remove is_in_place property. This method also remove the current place
     * from the "Contains Place" property of argument place.
     */
    public void removeIsInPlace() {
	Place container = (Place) props.remove(PROP_IS_IN_PLACE);
	if (container != null && container.Contains(this))
	    container.removeContainedPlace(this);
    }

    /**
     * 
     * @return the name property as a String. This value can be null
     */
    public String getName() {
	return (String) props.get(PROP_HAS_NAME);
    }

    /**
     * Set the name property
     * 
     * @param Name
     *            A null value or an empty string are not admitted
     */
    public void setName(String Name) {
	if (Name == null || Name == "")
	    throw new IllegalArgumentException();
	props.put(PROP_HAS_NAME, Name);
    }

    /**
     * 
     * @return The PlaceType property. For a well formed place this property is
     *         ever present
     */
    public String getPlaceType() {
	PlaceType type = (PlaceType) props.get(PROP_HAS_PLACETYPE);
	return type.getPlaceTypeName();
    }

    /**
     * 
     * @return an array of connected places. This value can be null.
     */
    public Place[] getConnectedPlaces() {
	if (!props.containsKey(PROP_HAS_CONNECTION))
	    return null;
	List conn = (List) props.get(PROP_HAS_CONNECTION);
	Place[] result = (Place[]) conn.toArray(new Place[0]);
	return result;
    }

    /**
     * Add a new connection. This is a symmetric property, so the current place
     * is added in the argument place has_connection property. Two connected
     * places must be adjacent, so the argument place is also added in
     * IS_ADJACENT_TO property. If two places are already connected no new
     * connection is created.
     * 
     * @param connectedPlace
     *            A null value is not allowed
     */
    public void addConnectedPlace(Place connectedPlace) {
	if (addMultipleValuePlaceProperty(PROP_HAS_CONNECTION, connectedPlace)) {
	    connectedPlace.addMultipleValuePlaceProperty(PROP_HAS_CONNECTION,
		    this);
	    this.addAdiacentPlace(connectedPlace);
	}
    }

    /**
     * Remove a connection. This is a symmetric property, so the current place
     * is removed from the argument place has_connection property
     * 
     * @param noMoreConnectedPlace
     *            If the argument is a not connected place or a null object no
     *            action is performed
     */
    public void removeConnectedPlace(Place noMoreConnectedPlace) {
	if (removeMultipleValuePlaceProperty(PROP_HAS_CONNECTION,
		noMoreConnectedPlace))
	    noMoreConnectedPlace.removeMultipleValuePlaceProperty(
		    PROP_HAS_CONNECTION, this);
    }

    /**
     * Add a new adjacent place. This is a symmetric property, so the current
     * place is added in the argument place is_adiacent_to property
     * 
     * @param adiacentPlace
     */
    public void addAdiacentPlace(Place adiacentPlace) {
	if (addMultipleValuePlaceProperty(PROP_IS_ADJACENT_TO, adiacentPlace))
	    adiacentPlace.addMultipleValuePlaceProperty(PROP_IS_ADJACENT_TO,
		    this);
    }

    /**
     * Remove an adjacent place. This is a symmetric property, so the current
     * place is removed from the argument place is_adiacent_to property. Two not
     * adjacent places cannot be connected, so if they are connected the
     * connection is removed.
     * 
     * @param noMoreAdiacentPlace
     *            If the argument is a not adjacent place or a null object no
     *            action is performed
     */
    public void removeAdiacentPlace(Place noMoreAdiacentPlace) {
	if (removeMultipleValuePlaceProperty(PROP_IS_ADJACENT_TO,
		noMoreAdiacentPlace))
	    noMoreAdiacentPlace.removeMultipleValuePlaceProperty(
		    PROP_IS_ADJACENT_TO, this);
    }

    /**
     * 
     * @return an array of adjacent places. This value can be null.
     */
    public Place[] getAdjacentPlaces() {
	if (!props.containsKey(PROP_IS_ADJACENT_TO))
	    return null;
	List conn = (List) props.get(PROP_IS_ADJACENT_TO);
	Place[] result = (Place[]) conn.toArray(new Place[0]);
	return result;
    }

    /**
     * Add a new place in the property list "is_in_place" or "has_connection"
     * (it depends on the propURI argument)
     * 
     * @param propURI
     *            It can be PROP_HAS_CONNECTION or PROP_IS_ADJACENT_TO
     * @param place
     *            If it is null no property is added.
     * @return false if no property is added.
     */
    private boolean addMultipleValuePlaceProperty(String propURI, Place place) {
	if (place == null
		|| (propURI != PROP_HAS_CONNECTION
			&& propURI != PROP_IS_ADJACENT_TO && propURI != PROP_CONTAINS_PLACE))
	    return false;
	List places;
	if (props.containsKey(propURI)) {
	    places = (List) props.get(propURI);
	    if (places.contains(place))
		return false;
	} else
	    places = new Vector();
	places.add(place);
	props.put(propURI, places);
	return true;
    }

    /**
     * Remove a place from the property list "is_in_place" or "has_connection"
     * (it depends on the propURI argument)
     * 
     * @param propURI
     *            It can be PROP_HAS_CONNECTION or PROP_IS_ADJACENT_TO
     * @param place
     *            If it is null no property is removed.
     * @return false if no property is removed.
     */
    private boolean removeMultipleValuePlaceProperty(String propURI,
	    Place noMoreConnectedPlace) {
	if (noMoreConnectedPlace == null
		|| (propURI != PROP_HAS_CONNECTION
			&& propURI != PROP_IS_ADJACENT_TO && propURI != PROP_CONTAINS_PLACE)
		|| !props.containsKey(propURI))
	    return false;
	List connections = (List) props.get(propURI);
	if (!connections.remove(noMoreConnectedPlace))
	    return false;
	props.put(propURI, connections);
	return true;
    }

    /**
     * 
     * @param connectedPlace
     *            If the argument is a null object the method returns false
     * @return true if the argument place is connected to the current place.
     */
    public boolean isConnectedTo(Place connectedPlace) {
	if (!props.containsKey(PROP_HAS_CONNECTION))
	    return false;
	List connections = (List) props.get(PROP_HAS_CONNECTION);
	return (connectedPlace != null && connections.contains(connectedPlace));
    }

    /**
     * 
     * @param adjiacentPlace
     *            If the argument is a null object the method returns false
     * @return true if the argument place is adjacent to the current place.
     */
    public boolean isAdjacentTo(Place adjiacentPlace) {
	if (!props.containsKey(PROP_IS_ADJACENT_TO))
	    return false;
	List adjacents = (List) props.get(PROP_IS_ADJACENT_TO);
	return (adjiacentPlace != null && adjacents.contains(adjiacentPlace));
    }

    public void addContainedPlace(Place containedPlace) {
	if (addMultipleValuePlaceProperty(PROP_CONTAINS_PLACE, containedPlace)
		&& (!containedPlace.isInPlace(this)))
	    containedPlace.setIsInPlace(this);
    }

    public void removeContainedPlace(Place containedPlace) {
	if (removeMultipleValuePlaceProperty(PROP_CONTAINS_PLACE,
		containedPlace)
		&& containedPlace.isInPlace(this))
	    containedPlace.removeIsInPlace();
    }

    public Place[] getContainedPlaces() {
	if (!props.containsKey(PROP_CONTAINS_PLACE))
	    return null;
	List cont = (List) props.get(PROP_CONTAINS_PLACE);
	Place[] result = (Place[]) cont.toArray(new Place[0]);
	return result;
    }

    /**
     * 
     * @return true if the current place contains the argument place
     */
    public boolean Contains(Place contained) {
	if (!props.containsKey(PROP_CONTAINS_PLACE))
	    return false;
	List places = (List) props.get(PROP_CONTAINS_PLACE);
	return (places != null && places.contains(contained));
    }

    /**
     * 
     * @return The place global position (i.e. GPS coordinates). If the place
     *         has not the has_position property or if it is a relative
     *         position, the method gets the containing place position. For a
     *         well formed place this method doesn't return a null object.
     * 
     */
    public AbsolutePosition getGlobalPosition() {
	Object o = props.get(PROP_HAS_POSITION);
	if (o instanceof AbsolutePosition)
	    return (AbsolutePosition) o;

	Place parent = this.getIsInPlace();
	return (parent == null) ? null : parent.getGlobalPosition();
    }

    /**
     * 
     *@return the room relative position. We can have the following cases:
     *         <ol>
     *         <li>The HAS_POSITION property is present and it is a relative
     *         position. In this case the method returns this position.
     *         <li>The HAS_POSITION property is present and it is an absolute
     *         position. In this case the Place position is the same of its
     *         referring system origin, then the method returns a relative
     *         position with X=Y=Z=0
     *         <li>The HAS_POSITION property is NOT present and the IS_IN_PLACE
     *         property is present. In this case the containing place relative
     *         position is returned.
     *         <li>The HAS_POSITION property is NOT present and the IS_IN_PLACE
     *         property is NOT present. In this case the place is not well
     *         formed and the method returns null.
     */
    public RelativePosition getRelativePosition() {
	if (!props.containsKey(PROP_HAS_POSITION))
	    if (props.containsKey(PROP_IS_IN_PLACE))
		return this.getIsInPlace().getRelativePosition();
	    else
		return null;

	if (((Position) props.get(PROP_HAS_POSITION)).getClass().equals(
		RelativePosition.class))
	    return (RelativePosition) props.get(PROP_HAS_POSITION);
	return new RelativePosition(new Double(0), new Double(0), new Double(0));
    }

    /**
     * Set the Place position. It can be an absolute or a relative position.
     * 
     * @param pos
     *            A null object is not allowed
     */
    public void setPosition(Position pos) {
	if (pos == null)
	    throw new IllegalArgumentException();
	props.put(PROP_HAS_POSITION, pos);
    }

    /**
     * Set the Place Relative position.
     * 
     */
    public void setRelativePosition(double x, double y, double z) {
	RelativePosition pos = new RelativePosition(new Double(x),
		new Double(y), new Double(z));
	props.put(PROP_HAS_POSITION, pos);
    }

    /**
     * Set the Place Relative position.
     * 
     */
    public void setRelativePosition(double x, double y) {
	RelativePosition pos = new RelativePosition(new Double(x),
		new Double(y));
	props.put(PROP_HAS_POSITION, pos);
    }

    /**
     * Set the Place Absolute position.
     * 
     */
    public void setAbsolutePosition(double latitude, double longitude) {
	AbsolutePosition pos = new AbsolutePosition(latitude, longitude);
	props.put(PROP_HAS_POSITION, pos);
    }

    /**
     * Set the Place Absolute position.
     * 
     */
    public void setAbsolutePosition(double latitude, double longitude,
	    double altitude) {
	AbsolutePosition pos = new AbsolutePosition(latitude, longitude,
		altitude);
	props.put(PROP_HAS_POSITION, pos);
    }

    /**
     * Get the place PhysicalAddress. If the place has no physical address the
     * containing place physical address is returned (if it is present)
     * 
     * @return this method can return a null object
     */
    public PhysicalAddress getHasAddress() {
	if (!props.containsKey(PROP_HAS_ADDRESS))
	    if (props.containsKey(PROP_IS_IN_PLACE))
		return this.getIsInPlace().getHasAddress();
	    else
		return null;
	return (PhysicalAddress) props.get(PROP_HAS_ADDRESS);
    }

    /**
     * Set the place physical address.
     * 
     * @param address
     *            A null object is not allowed.
     */
    public void setHasAddress(PhysicalAddress address) {
	if (address == null)
	    throw new IllegalArgumentException();
	props.put(PROP_HAS_ADDRESS, address);
    }

    private List checkedPlaces;
    private List FloorSwitchers;

    public FloorSwitcherPlace[] getFloorSwitchers() {
	checkedPlaces = new Vector();
	FloorSwitchers = new Vector();
	if (this.getClassURI() == FloorSwitcherPlace.MY_URI)
	    FloorSwitchers.add(this);
	checkedPlaces.add(this);
	findFloorSwitchers(this);
	if (FloorSwitchers.size() == 0)
	    return null;

	return (FloorSwitcherPlace[]) FloorSwitchers
		.toArray(new FloorSwitcherPlace[0]);
    }

    private void findFloorSwitchers(Place currentPlace) {
	Place[] connections = currentPlace.getConnectedPlaces();
	if (connections == null)
	    return;
	for (int i = 0; i < connections.length; i++) {
	    if (checkedPlaces.contains(connections[i]))
		continue;

	    checkedPlaces.add(connections[i]);

	    if (connections[i].getClassURI() == FloorSwitcherPlace.MY_URI)
		FloorSwitchers.add(connections[i]);
	    else
		findFloorSwitchers(connections[i]);
	}

    }

}
