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
package org.universAAL.ontology.location.position;

import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.location.Place;
import org.universAAL.ontology.shape.Shape;

/**
 * Ontological representation of an origined metric in a geometric coordinate
 * system. Methods included in this class are the mandatory ones for
 * representing an ontological concept in Java classes for uAAL. Usually it
 * includes getters and setters for most of its properties.
 * 
 * @author chwirth
 * 
 */

public class OriginedMetric extends CoordinateSystem {

    public static final String MY_URI = LocationOntology.NAMESPACE + "OriginedMetric";

    public static final String PROP_ORIGIN = LocationOntology.NAMESPACE + "origin";
    public static final String PROP_ROTATE_X = LocationOntology.NAMESPACE + "rotateX";
    public static final String PROP_ROTATE_Y = LocationOntology.NAMESPACE + "rotateY";
    public static final String PROP_ROTATE_Z = LocationOntology.NAMESPACE + "rotateZ";

    /**
     * Creates a OriginedMetric object
     * 
     * @param uri
     *            the object URI
     */
    public OriginedMetric(String uri) {
	super(uri);
    }

    /**
     * Creates a OriginedMetric object
     */
    public OriginedMetric() {
	super();
    }

    /**
     * 
     * @param uri
     *            the uri
     * @param x
     *            the x position of the origin
     * @param y
     *            the y position of the origin
     * @param z
     *            the z position of the origin
     * @param place
     *            the containing/top level place of the CoordinateSystem. Must
     *            have a shape
     */
    public OriginedMetric(String uri, float x, float y, float z, Place place) {
	super(uri);
	Shape shape = place.getShape();
	CoordinateSystem parent = (shape == null) ?
	// TODO: first check the DB
	// TODO: check if it is ok to use WGS84 as last possibility
	CoordinateSystem.WGS84
		: shape.getLocalCoordinateSystem();
	Point p = new Point(x, y, z, parent);
	p.setContainingLocation(place);
	props.put(PROP_ORIGIN, p);
	props.put(PROP_ROTATE_X, new Float(0));
	props.put(PROP_ROTATE_Y, new Float(0));
	props.put(PROP_ROTATE_Z, new Float(0));
    }

    /**
     * creates a coordinate system with the origin at the coordinates x,y,z in
     * the coordinate system of the place's shape
     * 
     * @param x
     *            the x position of the origin
     * @param y
     *            the y position of the origin
     * @param z
     *            the z position of the origin
     * @param place
     *            the containing/top level place of the CoordinateSystem. Must
     *            have a shape
     */
    public OriginedMetric(double x, double y, double z, Place place) {
	super();
	Point p = new Point(x, y, z, place.getShape()
		.getLocalCoordinateSystem());
	p.setContainingLocation(place);
	props.put(PROP_ORIGIN, p);
	props.put(PROP_ROTATE_X, new Float(0));
	props.put(PROP_ROTATE_Y, new Float(0));
	props.put(PROP_ROTATE_Z, new Float(0));
    }

    public String getClassURI() {
	return MY_URI;
    }

    public Point getOrigin() {
	return (Point) props.get(PROP_ORIGIN);
    }

    public void setOrigin(Point origin) {
	if (origin == null)
	    throw new IllegalArgumentException();
	props.put(PROP_ORIGIN, origin);
    }

    /**
     * @return the rotation around the x axis in degree
     */
    public float getRotateX() {
	return ((Float) props.get(PROP_ROTATE_X)).floatValue();
    }

    /**
     * 
     * @param angle
     *            in degree
     */
    public void setRotateX(float angle) {
	props.put(PROP_ROTATE_X, new Float(angle));
    }

    /**
     * @return the rotation around the y axis in degree
     */
    public float getRotateY() {
	return ((Float) props.get(PROP_ROTATE_Y)).floatValue();
    }

    /**
     * 
     * @param angle
     *            in degree
     */
    public void setRotateY(float angle) {
	props.put(PROP_ROTATE_Y, new Float(angle));
    }

    /**
     * @return the rotation around the z axis in degree
     */
    public float getRotateZ() {
	return ((Float) props.get(PROP_ROTATE_Z)).floatValue();
    }

    /**
     * 
     * @param angle
     *            in degree
     */
    public void setRotateZ(float angle) {
	props.put(PROP_ROTATE_Z, new Float(angle));
    }

    public int getPropSerializationType(String propURI) {
	if (super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL)
	    return super.getPropSerializationType(propURI);
	if (PROP_ORIGIN.equals(propURI) || PROP_ROTATE_X.equals(propURI)
		|| PROP_ROTATE_Y.equals(propURI)
		|| PROP_ROTATE_Z.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }
}
