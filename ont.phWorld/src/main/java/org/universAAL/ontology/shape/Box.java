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

import org.universAAL.ontology.location.Place;
import org.universAAL.ontology.location.position.CoordinateSystem;
import org.universAAL.ontology.location.position.OriginedMetric;
import org.universAAL.ontology.location.position.Point;

/**
 * Ontological representation of a tri-dimensional box shape. Methods included
 * in this class are the mandatory ones for representing an ontological concept
 * in Java classes for uAAL. Usually it includes getters and setters for most of
 * its properties.
 * 
 * @author chwirth
 * 
 */

public class Box extends Shape3D {

    public static final String MY_URI = ShapeOntology.NAMESPACE + "Box";

    public static final String PROP_WIDTH = ShapeOntology.NAMESPACE + "Width";
    public static final String PROP_HEIGHT = ShapeOntology.NAMESPACE + "Height";
    public static final String PROP_DEPTH = ShapeOntology.NAMESPACE + "Depth";

    /**
     * assumes the given coordinate system to be centered at the lower left
     * corner of the object, not the center. Note: the coordinate system will be
     * modified !
     * 
     * @param uri
     * @param width
     * @param height
     * @param depth
     * @param system
     *            the coordinate system centered at the lower left corner
     * @return a Box with the given values.
     */
    public static Box createByCorner(String uri, double width, double depth,
	    double height, OriginedMetric system) {
	Point p = system.getOrigin();
	p.set3DCoordinates(p.getX() + width / 2d, p.getY() + depth / 2d, p
		.getZ()
		+ height / 2d);
	system.setOrigin(p);
	return new Box(uri, width, depth, height, system);
    }

    /**
     * assumes the given coordinate system to be centered at the lower left
     * corner of the object, not the center. Note: the coordinate system will be
     * modified !
     * 
     * @param uri
     * @param width
     * @param height
     * @param depth
     * @param parent
     *            the containing place
     * @return a Box with the given values.
     */
    public static Box createByCorner(String uri, double width, double height,
	    double depth, Place parent) {
	OriginedMetric om = new OriginedMetric(width / 2f, depth / 2f,
		height / 2f, parent);
	return new Box(uri, width, depth, height, om);
    }

    public Box(String uri) {
	super(uri);
    }

    public Box() {
	super();
    }

    public Box(String uri, double width, double height, double depth,
	    CoordinateSystem system) {
	super(uri, system);
	props.put(PROP_WIDTH, new Double(width));
	props.put(PROP_HEIGHT, new Double(height));
	props.put(PROP_DEPTH, new Double(depth));
    }

    public Box(double width, double height, double depth,
	    CoordinateSystem system) {
	super(system);
	props.put(PROP_WIDTH, new Double(width));
	props.put(PROP_HEIGHT, new Double(height));
	props.put(PROP_DEPTH, new Double(depth));
    }

    public Box(String uri, double width, double height, double depth) {
	super(uri);
	props.put(PROP_WIDTH, new Double(width));
	props.put(PROP_HEIGHT, new Double(height));
	props.put(PROP_DEPTH, new Double(depth));
    }

    public Box(double width, double height, double depth) {
	super();
	props.put(PROP_WIDTH, new Double(width));
	props.put(PROP_HEIGHT, new Double(height));
	props.put(PROP_DEPTH, new Double(depth));
    }

    public String getClassURI() {
	return MY_URI;
    }

    public void setWidth(double width) {
	props.put(PROP_WIDTH, new Double(width));
    }

    public double getWidth() {
	return ((Double) props.get(PROP_WIDTH)).doubleValue();
    }

    public void setHeight(double height) {
	props.put(PROP_HEIGHT, new Double(height));
    }

    public double getHeight() {
	return ((Double) props.get(PROP_HEIGHT)).doubleValue();
    }

    public void setDepth(double depth) {
	props.put(PROP_DEPTH, new Double(depth));
    }

    public double getDepth() {
	return ((Double) props.get(PROP_DEPTH)).doubleValue();
    }

    public int getPropSerializationType(String propURI) {
	if (super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL)
	    return super.getPropSerializationType(propURI);
	if (PROP_HEIGHT.equals(propURI) || PROP_WIDTH.equals(propURI)
		|| PROP_DEPTH.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }

    /**
     * defined for Box & Sphere
     * 
     * @param shape
     * @return
     */
    public float getDistanceTo(Shape shape) {
	if (shape == null)
	    throw new IllegalArgumentException("Shape is null");
	if (shape instanceof Sphere) {
	    double radius = ((Sphere) shape).getRadius();
	    float dist = (float) (getDistanceTo(shape.getCenter()) - radius);
	    if (dist <= 0)
		return Point.INTERSECTING;
	    return dist;
	}
	if (shape instanceof Box) {
	    CoordinateSystem cs = CoordinateSystem.findCommonParentSystem(
		    getCenter().getCoordinateSystem(), shape.getCenter()
			    .getCoordinateSystem());
	    double[] center = getCenter().getInHigherCoordinateSystem(cs)
		    .get3DCoordinates();
	    double[] p = shape.getCenter().getInHigherCoordinateSystem(cs)
		    .get3DCoordinates();
	    double halfs[] = { getWidth() / 2d + ((Box) shape).getWidth() / 2d,
		    getDepth() / 2d + ((Box) shape).getDepth() / 2d,
		    getHeight() / 2d + ((Box) shape).getHeight() / 2d };
	    double dist[] = new double[3];
	    for (int i = 0; i < 3; i++) {
		if (center[i] + halfs[i] > p[i])
		    dist[i] = Math.max(0, center[i] - halfs[i] - p[i]);
		else
		    dist[i] = p[i] - center[i] - halfs[i];
	    }
	    if (dist[0] <= 0 && dist[1] <= 0 && dist[2] <= 0)
		return Point.INTERSECTING;
	    return (float) Math.sqrt(Math.pow(dist[0], 2)
		    + Math.pow(dist[1], 2) + Math.pow(dist[2], 2));
	}
	return Point.NOT_COMPUTABLE_DISTANCE;
    }

    public float getDistanceTo(Point point) {
	CoordinateSystem cs = CoordinateSystem.findCommonParentSystem(
		getCenter().getCoordinateSystem(), point.getCoordinateSystem());
	double[] p = point.getInHigherCoordinateSystem(cs).get3DCoordinates();
	double[] center = getCenter().getInHigherCoordinateSystem(cs)
		.get3DCoordinates();
	double halfs[] = { getWidth() / 2d, getDepth() / 2d, getHeight() / 2d };
	double dist[] = new double[3];
	for (int i = 0; i < 3; i++) {
	    if (center[i] + halfs[i] > p[i])
		dist[i] = Math.max(0, center[i] - halfs[i] - p[i]);
	    else
		dist[i] = p[i] - center[i] - halfs[i];
	}
	float realDist = (float) Math.sqrt(Math.pow(dist[0], 2)
		+ Math.pow(dist[1], 2) + Math.pow(dist[2], 2));
	if (dist[0] <= 0 && dist[1] <= 0 && dist[2] <= 0)
	    return Point.INTERSECTING;
	else
	    return realDist;
    }

    protected Shape computeBoundingVolume() {
	setBoundingVolume(this);
	return this;
    }

    public String toString() {
	return "[Center:" + getCenter().getX() + "," + getCenter().getY() + ","
		+ getCenter().getZ() + "|Size:" + getWidth() + "," + getDepth()
		+ "," + getHeight() + "]";
    }

    public boolean contains(Point p) {
	return (getDistanceTo(p) < 0);
    }

    public boolean contains(Shape3D shape) {
	if (shape instanceof Sphere) {
	    float dist = getDistanceTo(shape.getCenter());
	    if (-dist > ((Sphere) shape).getRadius())
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
	    double dist[] = { Math.abs(p1[0] - p2[0]), Math.abs(p1[1] - p2[1]),
		    Math.abs(p1[2] - p2[2]) };
	    double halfs1[] = { getWidth() / 2d, getDepth() / 2d,
		    getHeight() / 2d };
	    double halfs2[] = { ((Box) shape).getWidth() / 2d,
		    ((Box) shape).getDepth() / 2d,
		    ((Box) shape).getHeight() / 2d };
	    for (int i = 0; i < 3; i++) {
		if (halfs1[i] < halfs2[i])
		    return false;
		if (dist[i] > (halfs1[i] - halfs2[i]))
		    return false;
	    }
	    return true;
	}
	return false;
    }
}
