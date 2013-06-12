/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute for Computer Graphics Research
	
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
package org.universAAL.ontology.location;

import org.universAAL.ontology.location.address.Address;
import org.universAAL.ontology.location.position.OriginedMetric;
import org.universAAL.ontology.location.position.Point;
import org.universAAL.ontology.phThing.PhysicalThing;
import org.universAAL.ontology.shape.Box;
import org.universAAL.ontology.shape.Shape;

/**
 * Ontological representation of a place (which is not only a location but also
 * has some more properties. It is more concrete). Methods included in this
 * class are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author chwirth
 * 
 */

public class Place extends Location {

    public static final String MY_URI = LocationOntology.NAMESPACE + "Place";

    public static final String PROP_HAS_SHAPE = LocationOntology.NAMESPACE + "hasShape";
    public static final String PROP_LOCATION_OF_PHYSICAL_THING = LocationOntology.NAMESPACE
    		+ "locationOf";
    public static final String PROP_HAS_ADDRESS = LocationOntology.NAMESPACE + "hasAddress";


    /**
     * Creates a Place object
     * 
     * @param uri
     *            the object URI
     */
    public Place(String uri) {
	super(uri);
    }

    /**
     * Creates a Place object
     */
    public Place() {
	super();
    }

    /**
     * Creates a Place object
     * 
     * @param uri
     *            this value can also be a null object
     * @param name
     *            The place name. A null object is not allowed
     */
    public Place(String uri, String name) {
	super(uri, name);
    }

    /**
     * Creates a Place object
     * 
     * @param uri
     *            this value can also be a null object
     * @param name
     *            The place name. A null object is not allowed
     * @param shape
     *            the shape of the place. IS not allowed to have a
     *            OriginedMetric as local Coordinate System
     */
    public Place(String uri, String name, Shape shape) {
	super(uri, name);
	// if(shape.getLocalCoordinateSystem() instanceof OriginedMetric) throw
	// new
	// IllegalArgumentException("Shape is not allowed to have a OriginedMetric, must be unanchored");
	props.put(PROP_HAS_SHAPE, shape);
    }

    /**
     * for interal use only
     * 
     * @param shape
     */
    public Place(Shape shape) {
	super();
	props.put(PROP_HAS_SHAPE, shape);
    }

    /**
     * Creates a Place object
     * 
     * @param uri
     *            this value can also be a null object
     * @param shape
     *            the shape of the place. IS not allowed to have a
     *            OriginedMetric as local Coordinate System
     */
    public Place(String uri, Shape shape) {
	super(uri);
	// if(shape.getLocalCoordinateSystem() instanceof OriginedMetric) throw
	// new
	// IllegalArgumentException("Shape is not allowed to have a OriginedMetric, must be unanchored");
	props.put(PROP_HAS_SHAPE, shape);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public Shape getShape() {
	return (Shape) props.get(PROP_HAS_SHAPE);
    }

    public PhysicalThing getPhysicalThingofLocation() {
	return (PhysicalThing) props.get(PROP_LOCATION_OF_PHYSICAL_THING);
    }

    /**
     * this is a simple setter method of the property location_of_physical_thing
     * of the location
     * 
     * @param pt
     */
    public void setPhysicalThingofLocation(PhysicalThing pt) {
	props.put(PROP_LOCATION_OF_PHYSICAL_THING, pt);
    }

    public int getPropSerializationType(String propURI) {
	if (super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL)
	    return super.getPropSerializationType(propURI);
	if (PROP_HAS_SHAPE.equals(propURI)
		|| PROP_LOCATION_OF_PHYSICAL_THING.equals(propURI)
		|| PROP_HAS_ADDRESS.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }

    /**
     * This method calculates the distance between a Place object and a Location
     * object.
     * 
     * 
     * @param other
     *            the Location object
     * @return a float value which provides information about the distance
     *         between the Place object and the Location Object
     * 
     */
    public float getDistanceTo(Location other) {
	if (other == null || !(other instanceof Location))
	    throw new IllegalArgumentException();

	// if other is an instance of Location, it only can be of the type Place
	// of Point
	if (other instanceof Place)
	    // other is an instance of shape,
	    // the distance will be calculated as the distance by the bounding
	    // volumes
	    // between this' shape and other's shape.
	    return this.getShape().getDistanceByBoundingVolume(
		    ((Place) other).getShape());
	else
	    // other is an instance of Point
	    // the distance will be calculated between this' shape and the Point
	    // "other"
	    return this.getShape().getDistanceTo((Point) other);
    }

    /**
     * returns the smallest, contained place that contains the given point does
     * not consider overlapping Places
     * 
     * @param p
     * @return the smallest containing place or null if the point is not
     *         contained
     */
    public Place getSmallestContaining(Point p) {
	if (p == null)
	    throw new IllegalArgumentException();
	if (!getShape().contains(p))
	    return null;
	Location[] locs = getContainedLocations();
	if (locs != null) {
	    for (int i = 0; i < locs.length; i++) {
		Place place;
		if (locs[i].getClass() != Point.class
			&& (place = ((Place) locs[i]).getSmallestContaining(p)) != null)
		    return place;
	    }
	}
	return this;
    }

    public boolean contains(Point p) {
	return getShape().contains(p);
    }

    public Location getContainingLocation() {
	Location ret = (Location) props.get(PROP_IS_CONTAINED_IN);
	if (ret != null)
	    return ret;
	else {
	    Shape s = getShape();
	    return (s == null) ? null : s.getCenter().getContainingLocation();
	}
    }

    /**
     * Sets the place this place is contained in, originated at the given point
     * 
     * @param place
     *            must have a shape
     * @param x
     *            the x origin of this place
     * @param y
     *            the y origin of this place
     * @param z
     *            the z origin of this place
     */
    public void setContainingLocation(Place place, float x, float y, float z) {
	if (place == null || place.getShape() == null)
	    throw new IllegalArgumentException();
	this.getShape().setLocalCoordinateSystem(
		new OriginedMetric(x, y, z, place));
	super.setContainingLocation(place);
    }

    /**
     * Adds a place this place contains, originated at the given point
     * 
     * @param place
     *            must have a shape
     * @param x
     *            the x origin of this place
     * @param y
     *            the y origin of this place
     * @param z
     *            the z origin of this place
     */
    public void addContainedLocation(Place location, float x, float y, float z) {
	if (location == null)
	    throw new IllegalArgumentException();
	super.addContainedLocation(location);
	location.setContainingLocation(this, x, y, z);

    }

    /**
     * Adds a place this place contains, originated at the given point. The
     * origin is not the center of the object, but the lower, left corner
     * 
     * @param place
     *            must have a box shape
     * @param x
     *            the x origin of this place
     * @param y
     *            the y origin of this place
     * @param z
     *            the z origin of this place
     */
    public void addContainedLocationRelativeToCorner(Place location, float x,
	    float y, float z) {
	if (location == null || location.getShape() == null
		|| !(location.getShape() instanceof Box))
	    throw new IllegalArgumentException();
	super.addContainedLocation(location);

	// for adding the lower location in the middle of the higher location,
	// relative to the corner
	// we need the half shape measures of the lower location additional to
	// the coordinates of the corner in the coordinate system of the higher
	// location
	Box box = (Box) (location.getShape());
	// the association between x,y,z and width, height and depth is right in
	// this line
	location.setContainingLocation(this, (float) (x + box.getWidth() / 2f),
		(float) (y + box.getDepth() / 2f),
		(float) (z + box.getHeight() / 2f));

    }

    /**
     * Gets the Address value
     * 
     * @return The Address value
     */
    public Address getAddress() {
	return (Address) props.get(PROP_HAS_ADDRESS);
    }

    /**
     * Sets the Address value
     * 
     * @param reg
     *            The value to set
     */
    public void setAddress(Address val) {
	props.put(PROP_HAS_ADDRESS, val);
    }
}
