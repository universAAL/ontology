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

import org.universAAL.middleware.owl.ComparableIndividual;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.ontology.location.Location;
import org.universAAL.ontology.weather.Temperature;

/**
 * A location is the ontologic object that represents a physical thing position
 * in the space. A location can have 3 properties: HAS_POSITION, IS_IN PLACE,
 * and IS_NEAR_ADDRESS. A location position can be absolute (i.e. a GPS global
 * position) or relative (in such case the referring system is related to the
 * place indicated in IS_IN_PLACE attribute). It is possible to indicate a
 * location without using a position, but in this case the IS_IN_PLACE attribute
 * must be present. IS_IN_PLACE represents the place when the subject is
 * located. There are 4 different kind of places (please read PLACE ontology).
 * IS_NEAR_ADDRESS represents a physical address near to the location. This
 * attribute doesn't state that the location is inside the building, but it can
 * be also used for outdoor locations.
 * 
 * 
 * 
 * @author smazzei
 */
public class PLocation extends Location {

    public static final String MY_URI;

    public static final String PROP_HAS_POSITION;
    public static final String PROP_IS_IN_PLACE;
    public static final String PROP_IS_NEAR_ADDRESS;
    public static final String PROP_HAS_TEMPERATURE;
    public static final String PROP_TARGET_TEMPERATURE;
    public static final int NOT_COMPARABLE_LOCATIONS = -5;
    public static final float NOT_COMPUTABLE_DISTANCE = -1;

    public static final double EARTH_QUADRATIC_MEAN_RADIUS = 6372795.477598;
    private boolean hasAbsolutePosition;
    private static final int ROOMS_MEDIUM_HEIGHT = 3;

    static {
	MY_URI = uAAL_VOCABULARY_NAMESPACE + "PLocation";
	PROP_HAS_POSITION = uAAL_VOCABULARY_NAMESPACE + "has_position";
	PROP_IS_IN_PLACE = uAAL_VOCABULARY_NAMESPACE + "is_in_place";
	PROP_IS_NEAR_ADDRESS = uAAL_VOCABULARY_NAMESPACE + "is_near_address";
	PROP_HAS_TEMPERATURE = uAAL_VOCABULARY_NAMESPACE + "has_temperature";
	PROP_TARGET_TEMPERATURE = uAAL_VOCABULARY_NAMESPACE
		+ "target_temperature";
	register(PLocation.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {

	if (PROP_HAS_POSITION.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    Position.MY_URI, 1, 0);
	if (PROP_IS_IN_PLACE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    Place.MY_URI, 1, 0);
	if (PROP_IS_NEAR_ADDRESS.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    PhysicalAddress.MY_URI, 1, 0);
	if (PROP_HAS_TEMPERATURE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    Temperature.MY_URI, 1, 0);
	if (PROP_TARGET_TEMPERATURE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    Temperature.MY_URI, 1, 0);
	return Location.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = Location.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 5];
	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i++] = PROP_HAS_POSITION;
	toReturn[i++] = PROP_IS_IN_PLACE;
	toReturn[i++] = PROP_IS_NEAR_ADDRESS;
	toReturn[i++] = PROP_HAS_TEMPERATURE;
	toReturn[i] = PROP_TARGET_TEMPERATURE;
	return toReturn;
    }

    /**
     * Constructor just for usage by de-serializers. Do not use this constructor
     * within applications as it may lead to incomplete instances that cause
     * exceptions.
     */
    public PLocation() {
	super();
    }

    /**
     * Constructor just for usage by de-serializers. Do not use this constructor
     * within applications as it may lead to incomplete instances that cause
     * exceptions.
     */
    public PLocation(String uri) {
	super(uri);
    }

    /**
     * Creates a new Location object
     * 
     * @param uri
     *            The Location instance URI
     * @param position
     *            An AbsolutePosition that represents the user GPS position
     */
    public PLocation(String uri, AbsolutePosition position) {
	super(uri);
	if (position == null)
	    throw new IllegalArgumentException();

	props.put(PROP_HAS_POSITION, position);
	hasAbsolutePosition = true;

    }

    /**
     * Creates a new Location object
     * 
     * @param position
     *            An AbsolutePosition that represents the user GPS position
     */
    public PLocation(AbsolutePosition position) {
	super();
	if (position == null)
	    throw new IllegalArgumentException();

	props.put(PROP_HAS_POSITION, position);
	hasAbsolutePosition = true;
    }

    /**
     * Creates a new Location object
     * 
     * @param uri
     *            The Location instance URI
     * @param place
     *            The place where the user is located. A null value or a not
     *            well formed place are not allowed.
     */
    public PLocation(String uri, Place place) {
	super(uri);
	if (place == null)
	    throw new IllegalArgumentException();

	props.put(PROP_IS_IN_PLACE, place);
	hasAbsolutePosition = false;
    }

    /**
     * Creates a new Location object
     * 
     * @param place
     *            The place where the user is located. A null value or a not
     *            well formed place are not allowed.
     */
    public PLocation(Place place) {
	super();
	if (place == null)
	    throw new IllegalArgumentException();

	props.put(PROP_IS_IN_PLACE, place);
	hasAbsolutePosition = false;
    }

    /**
     * Returns a human readable description on the essence of this ontology
     * class.
     */
    public static String getRDFSComment() {
	return "The root class for all locations.";
    }

    /**
     * Returns a label with which this ontology class can be introduced to human
     * users.
     */
    public static String getRDFSLabel() {
	return "Location";
    }

    /**
     * 
     * @return The value of "is in place" property. If the property is not
     *         present a null object is returned.
     */
    public Place getIsInPlace() {
	if (!props.containsKey(PROP_IS_IN_PLACE))
	    return null;
	return (Place) props.get(PROP_IS_IN_PLACE);
    }

    /**
     * Set the "is in place" attribute.
     * 
     * @param place
     *            A null value is not admitted.
     */
    public void setIsInPlace(Place place) {
	if (place == null)
	    throw new IllegalArgumentException();
	props.put(PROP_IS_IN_PLACE, place);
    }

    /**
     * remove the "is in place" attribute from the location object.
     * 
     */
    public void removeIsInPlace() {
	props.remove(PROP_IS_IN_PLACE);
    }

    /**
     * 
     * @return The value of "has position" property. If the property is not
     *         present a null object is returned.
     */
    public Position getPosition() {
	if (!props.containsKey(PROP_HAS_POSITION))
	    return null;
	return (Position) props.get(PROP_HAS_POSITION);
    }

    /**
     * Set the "has position" property using an absolute position (i.e. GPS
     * coordinates)
     */
    public void setAbsolutePosition(AbsolutePosition position) {
	if (position == null)
	    throw new IllegalArgumentException();
	props.put(PROP_HAS_POSITION, position);
	hasAbsolutePosition = true;
    }

    /**
     * Set the "has position" property using a relative position (it is possible
     * to use a relative position only when the "is in place" attribute is
     * present)
     */
    public void setRelativePosition(RelativePosition position) {
	if (position == null)
	    throw new IllegalArgumentException();
	props.put(PROP_HAS_POSITION, position);
	hasAbsolutePosition = false;
    }

    /**
     * Remove the location position.
     */
    public void removePosition() {
	props.remove(PROP_HAS_POSITION);
	hasAbsolutePosition = false;
    }

    /**
     * 
     * @return The value of "is near address" property. If the property is not
     *         present a null object is returned.
     */
    public PhysicalAddress getIsNearAddress() {
	if (!props.containsKey(PROP_IS_NEAR_ADDRESS))
	    return null;
	return (PhysicalAddress) props.get(PROP_IS_NEAR_ADDRESS);
    }

    /**
     * Set the "is near address" property
     */
    public void setIsNearAddress(PhysicalAddress address) {
	if (address == null)
	    throw new IllegalArgumentException();
	props.put(PROP_IS_NEAR_ADDRESS, address);
    }

    /**
     * Remove the "is near address" property
     */
    public void removeIsNearAddress() {
	props.remove(PROP_IS_NEAR_ADDRESS);
    }

    /**
     * Get the "has temperature" property
     */
    public Temperature getTemperature() {
	if (!props.containsKey(PROP_HAS_TEMPERATURE))
	    return null;
	return (Temperature) props.get(PROP_HAS_TEMPERATURE);
    }

    /**
     * Set the "has temperature" property
     */
    public void setTemperature(Temperature temperature) {
	if (temperature == null)
	    throw new IllegalArgumentException();
	props.put(PROP_HAS_TEMPERATURE, temperature);
    }

    /**
     * Get the "target temperature" property
     */
    public Temperature getTargetTemperature() {
	if (!props.containsKey(PROP_TARGET_TEMPERATURE))
	    return null;
	return (Temperature) props.get(PROP_TARGET_TEMPERATURE);
    }

    /**
     * Set the "target temperature" property
     */
    public void setTargetTemperature(Temperature temperature) {
	if (temperature == null)
	    throw new IllegalArgumentException();
	props.put(PROP_TARGET_TEMPERATURE, temperature);
    }

    /**
     * Returns the distance (meters) between the current location and the
     * argument location. This is an estimation of the actual distance between
     * locations. The following cases are possible (let's consider the distance
     * between location A and location B):
     * <ol>
     * <li>A and B "has_position" attribute is present and it is an <u>absolute
     * position</u>. The method returns the distance between A and B GPS
     * positions applying Euler's theorem (i.e. ignoring altitude).
     * <li>A and B "has_position" attribute is present and it is a <u>relative
     * position</u>. In this case there are two options:
     * <ul>
     * <li>A and B <i>his_in_place </i> attributes are both present and they
     * have the same global position (i.e. they refer to the same coordinate
     * system). Compute the distance between A and B using their relative
     * positions and Manhattan distance algorithm. For buildings with more than
     * one floor, lifts / stairs positions are taken in account.
     * <li>A and B <i>his_in_place </i> attributes are both present and they
     * have different global positions. In this case the method takes in account
     * only the places global positions and compute their distance using Euler's
     * theorem.
     * </ul>
     * A and B "has position" attribute is NOT present, but "is in place"
     * attribute is present. Calculate d(A,B) using their "is in place" places
     * coordinates.
     * <li>In any other case A or B are not well formed and the method returns
     * NOT_COMPUTABLE_DISTANCE.
     */
    public float getDistanceTo(Location other) {
	if (other == null)
	    return NOT_COMPUTABLE_DISTANCE;
	PLocation otherPLoc = (PLocation) other;
	if (this.hasAbsolutePosition && otherPLoc.hasAbsolutePosition)
	    return (float) getGPSDistanceTo(otherPLoc);
	if (props.containsKey(PROP_IS_IN_PLACE)
		&& otherPLoc.props.containsKey(PROP_IS_IN_PLACE))
	    return (float) getMetricDistanceTo(otherPLoc);
	return (float) getMixedDistanceTo(otherPLoc);
    }

    /**
     * 
     * Get the distance between 2 points represented using longitude/latitude
     * pairs
     */
    public static double getDistanceFromLatLong(
	    double[] current2DCoordinatesDeg, double[] other2DCoordinatesDeg) {
	if (current2DCoordinatesDeg == null || other2DCoordinatesDeg == null)
	    return NOT_COMPUTABLE_DISTANCE;

	// convert current and other location longitude and latitude in radiant

	double[] current2DCoordinatesRad = {
		Math.PI * current2DCoordinatesDeg[0] / 180,
		Math.PI * current2DCoordinatesDeg[1] / 180 };
	double[] other2DCoordinatesRad = {
		Math.PI * other2DCoordinatesDeg[0] / 180,
		Math.PI * other2DCoordinatesDeg[1] / 180 };

	// calculate fi, the absolute value of the two longitudes

	double fi = Math.abs(current2DCoordinatesRad[1]
		- other2DCoordinatesRad[1]);

	// calculate p, the distance in radiant (applying an Eulero's theorem)

	double p = Math.acos(Math.sin(current2DCoordinatesRad[0])
		* Math.sin(other2DCoordinatesRad[0])
		+ Math.cos(current2DCoordinatesRad[0])
		* Math.cos(other2DCoordinatesRad[0]) * Math.cos(fi));

	// calculate the required distance by multiplying the radiant distance
	// with the
	// earth quadratic mean radius

	return p * EARTH_QUADRATIC_MEAN_RADIUS;

    }

    /**
     * Returns the distance between two locations that have absolute position
     */
    private double getGPSDistanceTo(PLocation other) {
	Position currentPosition = this.getPosition();
	Position otherPosition = other.getPosition();
	if ((!currentPosition.getClass().equals(AbsolutePosition.class))
		|| (!otherPosition.getClass().equals(AbsolutePosition.class)))
	    return NOT_COMPUTABLE_DISTANCE;

	double[] current2DCoordinatesDeg = currentPosition.get2DCoordinates();
	double[] other2DCoordinatesDeg = otherPosition.get2DCoordinates();

	return getDistanceFromLatLong(current2DCoordinatesDeg,
		other2DCoordinatesDeg);
    }

    /**
     * Returns the distance between two locations that have not absolute
     * position
     */
    private double getMetricDistanceTo(PLocation other) {
	Place currentPlace = this.getIsInPlace();
	Place otherPlace = other.getIsInPlace();
	AbsolutePosition currentOrigin = currentPlace.getGlobalPosition();
	AbsolutePosition otherOrigin = otherPlace.getGlobalPosition();
	RelativePosition currentPlacePosition = currentPlace
		.getRelativePosition();
	RelativePosition otherPlacePosition = otherPlace.getRelativePosition();

	if (currentOrigin == null || otherOrigin == null)
	    return NOT_COMPUTABLE_DISTANCE;

	// if relative positions uses different systems return the distance
	// between
	// places absolute positions.
	if (!currentOrigin.equals(otherOrigin))
	    return getDistanceFromLatLong(currentOrigin.get2DCoordinates(),
		    otherOrigin.get2DCoordinates());

	// get relative positions
	double[] currentRelativeXYZ = getRelativeXYZ();
	double[] otherRelativeXYZ = other.getRelativeXYZ();
	double Z_distance = Math.abs(currentRelativeXYZ[2]
		- otherRelativeXYZ[2]);

	// Z_roomDistance is used to check if the two locations are on the same
	// floor
	double Z_roomDistance = -1;
	if (currentPlacePosition != null && otherPlacePosition != null)
	    Z_roomDistance = Math
		    .abs(currentPlacePosition.get3DCoordinates()[2]
			    - otherPlacePosition.get3DCoordinates()[2]);

	// if the places are on the same floor return Manhattan distance
	if ((Z_roomDistance != -1 && Z_roomDistance <= ROOMS_MEDIUM_HEIGHT)
		|| (Z_roomDistance == -1 && Z_distance <= ROOMS_MEDIUM_HEIGHT))
	    return Math.abs(currentRelativeXYZ[0] - otherRelativeXYZ[0])
		    + Math.abs(currentRelativeXYZ[1] - otherRelativeXYZ[1])
		    + Z_distance;

	// get all floor switchers (i.e. lifts or stairs)
	FloorSwitcherPlace[] switchers = currentPlace.getFloorSwitchers();

	// if there are no lifts/stairs return Manhattan distance
	if (switchers == null)
	    return Math.abs(currentRelativeXYZ[0] - otherRelativeXYZ[0])
		    + Math.abs(currentRelativeXYZ[1] - otherRelativeXYZ[1])
		    + Z_distance;

	// choose the nearest lift/stair and calculate Manhattan distance
	double currentDinstance = -1;
	for (int i = 0; i < switchers.length; i++) {
	    Double[] rz = switchers[i].getReachesZCoordinate();
	    boolean currentZMatch = false;
	    boolean otherZMatch = false;
	    int rzLength = 0;
	    if (rz != null)
		rzLength = rz.length;
	    for (int j = 0; j < rzLength; j++) {
		currentZMatch = currentZMatch
			|| ((currentRelativeXYZ[2] - rz[j].doubleValue()) < ROOMS_MEDIUM_HEIGHT && currentRelativeXYZ[2] >= rz[j]
				.doubleValue());
		otherZMatch = otherZMatch
			|| ((otherRelativeXYZ[2] - rz[j].doubleValue()) < ROOMS_MEDIUM_HEIGHT && otherRelativeXYZ[2] >= rz[j]
				.doubleValue());
	    }

	    if (!(currentZMatch && otherZMatch))
		continue;

	    double tempDinst;
	    double[] temp2DCoord = switchers[i].getRelativePosition()
		    .get2DCoordinates();

	    tempDinst = Math.abs(currentRelativeXYZ[0] - temp2DCoord[0])
		    + Math.abs(currentRelativeXYZ[1] - temp2DCoord[1])
		    + Math.abs(temp2DCoord[0] - otherRelativeXYZ[0])
		    + Math.abs(temp2DCoord[1] - otherRelativeXYZ[1])
		    + Z_distance / Math.sin(switchers[i].getInclinationRad());

	    if (currentDinstance == -1 || tempDinst < currentDinstance)
		currentDinstance = tempDinst;
	}

	if (currentDinstance == -1)
	    return Math.abs(currentRelativeXYZ[0] - otherRelativeXYZ[0])
		    + Math.abs(currentRelativeXYZ[1] - otherRelativeXYZ[1])
		    + Z_distance;

	return currentDinstance;

    }

    /**
     * 
     * @return the current location relative position. If a relative position is
     *         present, it is returned. If "is in place" is present, the place
     *         relative coordinates are returned. <br>
     *         The method returns {0,0,0} if no relative position is present.
     */
    public double[] getRelativeXYZ() {
	RelativePosition pos = null;

	if (!props.containsKey(PROP_HAS_POSITION)
		&& props.containsKey(PROP_IS_IN_PLACE))
	    pos = getIsInPlace().getRelativePosition();
	else if (props.containsKey(PROP_HAS_POSITION) && !hasAbsolutePosition)
	    pos = (RelativePosition) props.get(PROP_HAS_POSITION);

	if (pos != null)
	    return pos.get3DCoordinates();

	double[] result = { 0, 0, 0 };
	return result;
    }

    /**
     * @return the current location absolute position (long/lat). Than, if an
     *         absolute position is present, it is returned. If "is in place" is
     *         present, the place absolute coordinates are returned. <br>
     *         The method return null if no absolute position is present.
     */
    public double[] getAbsoluteLatLong() {
	AbsolutePosition pos = null;

	if (hasAbsolutePosition)
	    pos = (AbsolutePosition) props.get(PROP_HAS_POSITION);
	else if (props.containsKey(PROP_IS_IN_PLACE))
	    pos = getIsInPlace().getGlobalPosition();

	if (pos != null)
	    return pos.get2DCoordinates();

	return null;
    }

    /**
     * Get the distance between a location with absolute position and another
     * one with relative
     * 
     */
    private double getMixedDistanceTo(PLocation other) {
	double[] currentAbsoluteLatLong = this.getAbsoluteLatLong();
	double[] otherAbsoluteLatLong = other.getAbsoluteLatLong();
	if (currentAbsoluteLatLong == null || otherAbsoluteLatLong == null)
	    return NOT_COMPUTABLE_DISTANCE;
	return getDistanceFromLatLong(currentAbsoluteLatLong,
		otherAbsoluteLatLong);
    }

    /**
     * @return <b>true</b> if two locations are in connected places. If at least
     *         one location doesn't have "is in place" property the method
     *         returns <b>false</b>.
     */
    public boolean hasConnectionTo(Location other) {
	if (other == null)
	    return false;
	Place currentPlace = this.getIsInPlace();
	Place otherPlace = ((PLocation) other).getIsInPlace();
	if (currentPlace == null || otherPlace == null)
	    return false;
	return currentPlace.isConnectedTo(otherPlace);
    }

    /**
     * @return <b>true</b> if two locations are in adjacent places. If at least
     *         one location doesn't have "is in place" property the method
     *         returns <b>false</b>.
     */
    public boolean isAdjacentTo(Location other) {
	if (other == null)
	    return false;
	Place currentPlace = this.getIsInPlace();
	Place otherPlace = ((PLocation) other).getIsInPlace();
	if (currentPlace == null || otherPlace == null)
	    return false;
	return currentPlace.isAdjacentTo(otherPlace);
    }

    public int getPropSerializationType(String propURI) {
	if (PROP_HAS_POSITION.equals(propURI)
		|| PROP_IS_IN_PLACE.equals(propURI)
		|| PROP_IS_NEAR_ADDRESS.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }

    /**
     * A location is well formed when every attribute is well formed and at
     * least one of the following conditions is respected:
     * <ol>
     * <li><i> has position </i> attribute is present and it is an absolute
     * position
     * <li><i>is in place </i> attribute is present
     */
    public boolean isWellFormed() {
	if (!hasAbsolutePosition && !props.containsKey(PROP_IS_IN_PLACE))
	    return false;
	if (props.containsKey(PROP_IS_IN_PLACE)
		&& !getIsInPlace().isWellFormed())
	    return false;
	if (props.containsKey(PROP_HAS_POSITION)
		&& !getPosition().isWellFormed())
	    return false;
	if (props.containsKey(PROP_IS_NEAR_ADDRESS)
		&& !getIsNearAddress().isWellFormed())
	    return false;
	if (props.containsKey(PROP_HAS_TEMPERATURE)
		&& !getTemperature().isWellFormed())
	    return false;
	if (props.containsKey(PROP_TARGET_TEMPERATURE)
		&& !getTargetTemperature().isWellFormed())
	    return false;

	return true;
    }

    /**
     * @return <b>zero </b>if current location and argument location are in the
     *         same Place.<br>
     *         <b> -1 </b> if current location is in a Place contained in
     *         argument location Place.<br>
     *         <b>1 </b> if argument location is in a Place contained in current
     *         location Place.<br>
     *         <b>NOT_COMPARABLE_LOCATIONS</b> if two locations are not
     *         comparable.
     */
    public int compareTo(Object arg0) {
	if (arg0 == null || arg0.getClass() != Location.class)
	    throw new IllegalArgumentException();

	Place curr = this.getIsInPlace();
	Place other = ((PLocation) arg0).getIsInPlace();
	if (curr == null || other == null)
	    return NOT_COMPARABLE_LOCATIONS;
	if (curr.equals(other))
	    return 0;

	Place currContainer = curr.getIsInPlace();

	while (currContainer != null) {
	    if (currContainer.equals(other))
		return 1;
	    Place temp = currContainer.getIsInPlace();
	    currContainer = temp;
	}

	Place otherContainer = other.getIsInPlace();

	while (otherContainer != null) {
	    if (otherContainer.equals(curr))
		return -1;
	    Place temp = otherContainer.getIsInPlace();
	    otherContainer = temp;
	}

	return NOT_COMPARABLE_LOCATIONS;
    }

    public ComparableIndividual getNext() {
	// TODO Auto-generated method stub
	return null;
    }

    public ComparableIndividual getPrevious() {
	// TODO Auto-generated method stub
	return null;
    }

    public int ord() {
	// TODO Auto-generated method stub
	return Integer.MIN_VALUE;
    }
}
