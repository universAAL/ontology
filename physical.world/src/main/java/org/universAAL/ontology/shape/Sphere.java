/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut fuer Graphische Datenverarbeitung 
	
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
package org.universAAL.ontology.shape;

import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.ontology.location.position.CoordinateSystem;
import org.universAAL.ontology.location.position.Point;

/**
 * 
 * @author chwirth
 * 
 */

public class Sphere extends Shape3D {

    public static final String MY_URI;
    public static final String PROP_RADIUS;

    static {
	MY_URI = uAAL_SHAPE_NAMESPACE + "FHSphere";
	PROP_RADIUS = uAAL_SHAPE_NAMESPACE + "Radius";
	register(Sphere.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_RADIUS.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Double.class), 1, 1);
	return Shape3D.getClassRestrictionsOnProperty(propURI);
    }

    /**
     * Creates a Shape object
     * 
     * @param uri
     *            the object URI
     */
    public Sphere(String uri) {
	super(uri);
    }

    /**
     * Creates a Shape object
     */
    public Sphere() {
	super();
    }

    /**
     * create a new Sphere
     * 
     * @param uri
     *            the universal identifier
     * @param radius
     *            the radius of the sphere
     * @param system
     *            the local coordinate system
     */
    public Sphere(String uri, double radius, CoordinateSystem system) {
	super(uri, system);
	props.put(PROP_RADIUS, new Double(radius));
    }

    public Sphere(double radius, CoordinateSystem system) {
	super(system);
	props.put(PROP_RADIUS, new Double(radius));
    }

    /**
     * Returns a human readable description on the essence of this ontology
     * class.
     */
    public static String getRDFSComment() {
	return "A sphere.";
    }

    /**
     * Returns a label with which this ontology class can be introduced to human
     * users.
     */
    public static String getRDFSLabel() {
	return "Sphere";
    }

    public double getRadius() {
	Double p = (Double) props.get(PROP_RADIUS);
	return p.doubleValue();
    }

    public void setRadius(double radius) {
	props.put(PROP_RADIUS, new Double(radius));
    }

    public int getPropSerializationType(String propURI) {
	if (super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL)
	    return super.getPropSerializationType(propURI);
	if (PROP_RADIUS.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = Shape3D.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 1];
	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i] = PROP_RADIUS;
	return toReturn;
    }

    /**
     * only defined for Sphere
     * 
     * @param shape
     * @return
     */
    public float getDistanceTo(Shape shape) {
	float dist = Point.NOT_COMPUTABLE_DISTANCE;
	if (shape instanceof Sphere) {
	    CoordinateSystem commonsys = CoordinateSystem
		    .findCommonParentSystem(getLocalCoordinateSystem(), shape
			    .getLocalCoordinateSystem());
	    if (commonsys == null)
		throw new IllegalArgumentException(
			"Not part of the same coordinate system chain");
	    dist = Math
		    .abs(((Sphere) shape).getCenter()
			    .getInHigherCoordinateSystem(commonsys)
			    .getDistanceTo(
				    getCenter().getInHigherCoordinateSystem(
					    commonsys)));
	    dist -= ((Sphere) shape).getRadius();
	    dist -= getRadius();
	    if (dist < 0)
		dist = Point.INTERSECTING;
	    return dist;
	}
	return Point.NOT_COMPUTABLE_DISTANCE;
    }

    public float getDistanceTo(Point point) {
	CoordinateSystem commonsys = CoordinateSystem.findCommonParentSystem(
		getLocalCoordinateSystem(), point.getCoordinateSystem());
	if (commonsys == null)
	    throw new IllegalArgumentException(
		    "Not part of the same coordinate system chain");
	float dist = Math.abs(point.getInHigherCoordinateSystem(commonsys)
		.getDistanceTo(
			getCenter().getInHigherCoordinateSystem(commonsys)));
	dist -= getRadius();
	return Math.abs(dist);
    }

    protected Shape computeBoundingVolume() {
	setBoundingVolume(this);
	return this;
    }

    public boolean contains(Point p) {
	return (getDistanceTo(p) == Point.INTERSECTING);
    }

    public boolean contains(Shape3D shape) {
	if (shape instanceof Sphere) {
	    if (getRadius() < ((Sphere) shape).getRadius())
		return false;
	    float dist = getDistanceTo(shape.getCenter());
	    if (dist > 0)
		return false;
	    if (Math.abs(dist) + ((Sphere) shape).getRadius() < getRadius())
		return true;
	}
	if (shape instanceof Box) {
	    CoordinateSystem common = CoordinateSystem.findCommonParentSystem(
		    getLocalCoordinateSystem(), shape
			    .getLocalCoordinateSystem());
	    double[] p1 = getCenter().getInHigherCoordinateSystem(common)
		    .get3DCoordinates();
	    double[] p2 = shape.getCenter().getInHigherCoordinateSystem(common)
		    .get3DCoordinates();

	    double radius = getRadius();
	    double dist[] = { Math.abs(p1[0] - p2[0]), Math.abs(p1[1] - p2[1]),
		    Math.abs(p1[2] - p2[2]) };
	    double halfs[] = { ((Box) shape).getWidth() / 2d,
		    ((Box) shape).getDepth() / 2d,
		    ((Box) shape).getHeight() / 2d };
	    for (int i = 0; i < 3; i++) {
		if (halfs[i] > radius)
		    return false;
		if (dist[i] > (radius - halfs[i]))
		    return false;
	    }
	    return true;
	}
	return false;
    }

}
