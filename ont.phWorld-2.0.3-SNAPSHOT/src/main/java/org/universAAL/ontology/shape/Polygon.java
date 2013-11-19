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
package org.universAAL.ontology.shape;

import java.util.Iterator;
import java.util.Vector;

import org.universAAL.ontology.location.Place;
import org.universAAL.ontology.location.position.CoordinateSystem;
import org.universAAL.ontology.location.position.OriginedMetric;
import org.universAAL.ontology.location.position.Point;

/**
 * Ontological representation of a polygon in a tri-dimensional space. Methods
 * included in this class are the mandatory ones for representing an ontological
 * concept in Java classes for uAAL. Usually it includes getters and setters for
 * most of its properties.
 * 
 * @author chwirth
 * 
 */

public class Polygon extends Shape3D {

    public static final String MY_URI = ShapeOntology.NAMESPACE + "Polygon";

    public static final String PROP_VERTICES = ShapeOntology.NAMESPACE + "Vertices";


    /**
     * Creates a Polygon object
     * 
     * @param uri
     *            the object URI
     */
    public Polygon(String uri) {
	super(uri);
    }

    /**
     * Creates a Polygon object
     */
    public Polygon() {
	super();
    }

    /**
     * Creates a Polygon object. All vertices have to be in the same coordinate
     * system
     * 
     * @param uri
     *            this value can also be a null object
     * @param verts
     *            an array of all vertices in counter clockwise order
     */
    public Polygon(String uri, Point[] verts) {
	super(uri);
	setVertices(verts);
	checkValid();
	setLocalCoordinateSystem(verts[0].getCoordinateSystem());
    }

    public Polygon(Point[] verts) {
	super();
	setVertices(verts);
	checkValid();
	setLocalCoordinateSystem(verts[0].getCoordinateSystem());
    }

    public String getClassURI() {
	return MY_URI;
    }

    public Point[] getVertices() {
	Object[] o = ((Vector) props.get(PROP_VERTICES)).toArray();
	Point p[] = new Point[o.length];
	for (int i = 0; i < o.length; i++)
	    p[i] = (Point) o[i];
	return p;
    }

    public void setVertices(Point[] verts) {
	if (verts == null)
	    throw new IllegalArgumentException();
	if (verts.length < 3)
	    throw new IllegalArgumentException("Not enough vertices");
	Vector vmapper = new Vector();
	for (int i = 0; i < verts.length; i++)
	    vmapper.add(verts[i]);
	props.put(PROP_VERTICES, vmapper);
	checkValid();
    }

    public int getPropSerializationType(String propURI) {
	if (super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL)
	    return super.getPropSerializationType(propURI);
	if (PROP_VERTICES.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }

    public float getDistanceTo(Point other) {
	if (other == null)
	    throw new IllegalArgumentException();
	float dist = Float.MAX_VALUE;
	Point[] verts = getVertices();
	for (int i = 0; i < verts.length; i++) {
	    float curdist;
	    if ((curdist = other.getDistanceTo(verts[i])) < dist)
		dist = curdist;
	}
	return dist;
    }

    /**
     * the center point of all vertices, assuming an even weights
     * 
     * @return the midpoint
     */
    public Point getMidpoint() {
	Point[] points = getVertices();
	float[] center = { 0, 0, 0 };
	for (int i = 0; i < points.length; i++) {
	    double[] c = points[i].get3DCoordinates();
	    center[0] += c[0];
	    center[1] += c[1];
	    center[2] += c[2];
	}
	center[0] /= points.length;
	center[1] /= points.length;
	center[2] /= points.length;
	return new Point(center[0], center[1], center[2], points[0]
		.getCoordinateSystem());
    }

    protected void checkValid() {
	Iterator verts = ((Vector) props.get(PROP_VERTICES)).iterator();
	CoordinateSystem system = ((Point) verts.next()).getCoordinateSystem();
	while (verts.hasNext()) {
	    if (((Point) verts.next()).getCoordinateSystem() != system)
		throw new IllegalArgumentException(
			"A vertice has a other coordinate system");
	}
    }

    /**
     * ensures that all points have a valid z value
     */
    public void castTo3D() {
	Point[] points = getVertices();
	for (int i = 0; i < points.length; i++) {
	    points[i].castTo3D();
	}
    }

    protected Shape computeBoundingVolume() {
	Point[] points = getVertices();
	double max[] = { Double.MAX_VALUE, Double.MIN_VALUE, Double.MAX_VALUE,
		Double.MIN_VALUE, Double.MAX_VALUE, Double.MIN_VALUE };
	for (int i = 0; i < points.length; i++) {
	    if (max[0] > points[i].getX())
		max[0] = points[i].getX();
	    if (max[1] < points[i].getX())
		max[1] = points[i].getX();
	    if (max[2] > points[i].getY())
		max[2] = points[i].getY();
	    if (max[3] < points[i].getY())
		max[3] = points[i].getY();
	    if (max[4] > points[i].getZ())
		max[4] = points[i].getZ();
	    if (max[5] < points[i].getZ())
		max[5] = points[i].getZ();
	}
	return new Box(max[1] - max[0], max[3] - max[2], max[5] - max[4],
		new OriginedMetric((float) (max[0] + (max[1] - max[0]) / 2f),
			(float) (max[2] + (max[3] - max[2]) / 2f),
			(float) (max[4] + (max[5] - max[4]) / 2f),
			(Place) getCenter().getContainingLocation()));
    }

    /**
     * accuracy limited to 4 digits after the dot
     * 
     */
    public boolean contains(Point p) {
	if (!p.is2D())
	    throw new IllegalArgumentException();
	CoordinateSystem cs = CoordinateSystem.findCommonParentSystem(
		getLocalCoordinateSystem(), p.getCoordinateSystem());
	Point[] points = getVertices();
	java.awt.Polygon poly = new java.awt.Polygon();
	for (int i = 0; i < points.length; i++) {
	    Point curr = points[i].getInHigherCoordinateSystem(cs);
	    poly.addPoint((int) (curr.getX() * 1000),
		    (int) (curr.getY() * 1000));
	}
	p = p.getInHigherCoordinateSystem(cs);
	return poly.contains(p.getX() * 1000, p.getY() * 1000);
    }
}
