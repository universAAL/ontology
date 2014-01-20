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
 * Ontological representation of a tri-dimensional path. Methods included in
 * this class are the mandatory ones for representing an ontological concept in
 * Java classes for uAAL. Usually it includes getters and setters for most of
 * its properties.
 * 
 * @author chwirth
 * 
 */

public abstract class Path extends Shape3D {

    public static final String MY_URI = ShapeOntology.NAMESPACE + "Path";

    public static final String PROP_POINTS = ShapeOntology.NAMESPACE + "Points";


    /**
     * Creates a Path object
     * 
     * @param uri
     *            the object URI
     */
    public Path(String uri) {
	super(uri);
    }

    /**
     * Creates a Path object
     */
    public Path() {
	super();
    }

    /**
     * Creates a Path object. All points have to be in the same coordinate
     * system
     * 
     * @param uri
     *            this value can also be a null object
     * @param points
     *            an array of all points of the path
     */
    public Path(String uri, Point[] points) {
	super(uri);
	setPoints(points);
	checkValid();
	setLocalCoordinateSystem(points[0].getCoordinateSystem());
    }

    public Path(Point[] points) {
	super();
	setPoints(points);
	checkValid();
	setLocalCoordinateSystem(points[0].getCoordinateSystem());
    }

    public String getClassURI() {
	return MY_URI;
    }

    /**
     * This method returns an Point array with the points which define the Path
     * object
     * 
     * @return
     */
    public Point[] getPoints() {
	Object[] o = ((Vector) props.get(PROP_POINTS)).toArray();
	Point p[] = new Point[o.length];
	for (int i = 0; i < o.length; i++)
	    p[i] = (Point) o[i];
	return p;
    }

    public void setPoints(Point[] points) {
	if (points == null)
	    throw new IllegalArgumentException();
	if (points.length < 2)
	    throw new IllegalArgumentException("Not enough points");
	Vector vmapper = new Vector();
	for (int i = 0; i < points.length; i++)
	    vmapper.add(points[i]);
	props.put(PROP_POINTS, vmapper);
	checkValid();
    }

    public abstract float getDistanceTo(Shape shape);

    public void setLocalCoordinateSystem(CoordinateSystem cs) {
	super.setLocalCoordinateSystem(cs);
	Point[] pts = getPoints();
	for (int i = 0; i < pts.length; i++) {
	    pts[i].setCoordinateSystem(cs);
	}
	setPoints(pts);
    }

    public int getPropSerializationType(String propURI) {
	if (super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL)
	    return super.getPropSerializationType(propURI);
	if (PROP_POINTS.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }

    protected void checkValid() {
	Iterator verts = ((Vector) props.get(PROP_POINTS)).iterator();
	CoordinateSystem system = ((Point) verts.next()).getCoordinateSystem();
	while (verts.hasNext()) {
	    if (((Point) verts.next()).getCoordinateSystem() != system)
		throw new IllegalArgumentException(
			"A point has a other coordinate system");
	}
    }

    protected Shape computeBoundingVolume() {
	Point[] points = getPoints();
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

    public boolean contains(Point p) {
	return false;
    }
}
