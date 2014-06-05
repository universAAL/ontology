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

import jp.go.ipa.jgcl.JgclAxis2Placement3D;
import jp.go.ipa.jgcl.JgclCartesianPoint3D;
import jp.go.ipa.jgcl.JgclEllipse3D;
import jp.go.ipa.jgcl.JgclIndefiniteSolution;
import jp.go.ipa.jgcl.JgclPoint3D;

import org.universAAL.ontology.location.position.CoordinateSystem;
import org.universAAL.ontology.location.position.Point;

/**
 * Ontological representation of an elliptic shape. Methods included in this
 * class are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author chwirth
 * 
 */

public class Ellipse extends Shape2D {

    public static final String MY_URI = ShapeOntology.NAMESPACE + "Ellipse";

    public static final String PROP_MINOR_AXIS_LENGTH = ShapeOntology.NAMESPACE + "MinorAxisLength";
    public static final String PROP_MAJOR_AXIS_LENGTH = ShapeOntology.NAMESPACE + "MajorAxisLength";


    public Ellipse(String uri) {
	super(uri);
    }

    public Ellipse() {
	super();
    }

    /**
     * Creates a new ellipse
     * 
     * @param uri
     * @param minorAxisLength
     *            the "small" side of the ellipse
     * @param majorAxisLength
     *            the "long" side of the ellipse
     * @param system
     *            the local coordinate system
     */
    public Ellipse(String uri, double minorAxisLength, double majorAxisLength,
	    CoordinateSystem system) {
	super(uri, system);
	props.put(PROP_MINOR_AXIS_LENGTH, new Double(minorAxisLength));
	props.put(PROP_MAJOR_AXIS_LENGTH, new Double(majorAxisLength));
    }

    /**
     * Creates a new ellipse
     * 
     * @param minorAxisLength
     *            the "small" side of the ellipse
     * @param majorAxisLength
     *            the "long" side of the ellipse
     * @param system
     *            the local coordinate system
     */
    public Ellipse(double minorAxisLength, double majorAxisLength,
	    CoordinateSystem system) {
	super(system);
	props.put(PROP_MINOR_AXIS_LENGTH, new Double(minorAxisLength));
	props.put(PROP_MAJOR_AXIS_LENGTH, new Double(majorAxisLength));
    }

    public String getClassURI() {
	return MY_URI;
    }

    public void setMajorAxisLength(double majorAxisLength) {
	props.put(PROP_MAJOR_AXIS_LENGTH, new Double(majorAxisLength));
    }

    public double getMajorAxisLength() {
	return ((Double) props.get(PROP_MAJOR_AXIS_LENGTH)).doubleValue();
    }

    public void setMinorAxisLength(double minorAxisLength) {
	props.put(PROP_MINOR_AXIS_LENGTH, new Double(minorAxisLength));
    }

    public double getMinorAxisLength() {
	return ((Double) props.get(PROP_MINOR_AXIS_LENGTH)).doubleValue();
    }

    public int getPropSerializationType(String propURI) {
	if (super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL)
	    return super.getPropSerializationType(propURI);
	if (PROP_MINOR_AXIS_LENGTH.equals(propURI)
		|| PROP_MAJOR_AXIS_LENGTH.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }

    public float getDistanceTo(Point point) {
	CoordinateSystem cs = CoordinateSystem.findCommonParentSystem(
		getCenter().getCoordinateSystem(), point.getCoordinateSystem());
	Point p = point.getInHigherCoordinateSystem(cs);
	JgclCartesianPoint3D jgclpoint = new JgclCartesianPoint3D(p.getX(), p
		.getY(), p.getZ());
	// float dist = Float.MAX_VALUE;
	try {
	    JgclPoint3D[] intersect = getProjectedPoints(point);
	    return (float) intersect[0].distance(jgclpoint);
	} catch (JgclIndefiniteSolution e) {
	    return Point.NOT_COMPUTABLE_DISTANCE;
	}
    }

    /**
     * Returns all possible projection points, sorted by distance to the point
     * 
     * @param point
     * @return all projected points, with ascending distance
     * @throws JgclIndefiniteSolution
     */
    public JgclPoint3D[] getProjectedPoints(Point point)
	    throws JgclIndefiniteSolution {
	CoordinateSystem cs = CoordinateSystem.findCommonParentSystem(
		getCenter().getCoordinateSystem(), point.getCoordinateSystem());
	Point p = point.getInHigherCoordinateSystem(cs);
	Point c = getCenter().getInHigherCoordinateSystem(cs);
	JgclEllipse3D ellipse = new JgclEllipse3D(new JgclAxis2Placement3D(
		new JgclCartesianPoint3D(c.getX(), c.getY(), c.getZ()), null,
		null), getMinorAxisLength() / 2d, getMajorAxisLength() / 2d);
	JgclCartesianPoint3D jgclpoint = new JgclCartesianPoint3D(p.getX(), p
		.getY(), p.getZ());
	JgclPoint3D[] intersect = {};
	intersect = ellipse.projectFrom(jgclpoint);
	return sortByDistance(intersect, jgclpoint);
    }

    private JgclPoint3D[] sortByDistance(JgclPoint3D[] intersect, JgclPoint3D p) {
	JgclPoint3D[] sol = new JgclPoint3D[intersect.length];
	for (int i = 0; i < intersect.length; i++) {
	    float dist = (float) intersect[i].distance(p);
	    int j = 0;
	    while (sol[j] != null && sol[j].distance(p) < dist)
		j++;
	    int k = sol.length - 1;
	    while (k > j) {
		sol[k] = sol[k - 1];
		k--;
	    }
	    sol[j] = intersect[i];
	}
	return sol;
    }

    public float getDistanceTo(Shape shape) {
	if (shape == null)
	    throw new IllegalArgumentException();
	// The distance is calculated by
	// "shape distance to center"-"distance center to intersect point"
	// TODO: This is only correct if the closest point is on one line from
	// center to center. Only guaranteed for circle/ellipse
	CoordinateSystem cs = CoordinateSystem.findCommonParentSystem(
		getCenter().getCoordinateSystem(), shape
			.getLocalCoordinateSystem());
	float dist = shape.getDistanceTo(getCenter());
	Point p = shape.getCenter().getInHigherCoordinateSystem(cs);
	Point c = getCenter().getInHigherCoordinateSystem(cs);
	JgclEllipse3D ellipse = new JgclEllipse3D(new JgclAxis2Placement3D(
		new JgclCartesianPoint3D(c.getX(), c.getY(), c.getZ()), null,
		null), getMinorAxisLength() / 2d, getMajorAxisLength() / 2d);
	JgclCartesianPoint3D jgclpoint = new JgclCartesianPoint3D(p.getX(), p
		.getY(), p.getZ());
	JgclPoint3D[] intersect = {};
	try {
	    intersect = ellipse.projectFrom(jgclpoint);
	} catch (JgclIndefiniteSolution e) {
	    e.printStackTrace();
	}
	float disttest = Float.MAX_VALUE;
	int iValue = -1;
	for (int i = 0; i < intersect.length; i++) {
	    if (intersect[i].distance(jgclpoint) < disttest) {
		disttest = (float) intersect[i].distance(jgclpoint);
		iValue = i;
	    }
	}
	return (float) (dist - intersect[iValue]
		.distance(new JgclCartesianPoint3D(c.getX(), c.getY(), c.getZ())));
    }

    public boolean contains(Point p) {
	return getDistanceTo(p) <= 0;
    }

    protected Shape computeBoundingVolume() {
	return new Box(getMinorAxisLength(), getMajorAxisLength(), 1f,
		getLocalCoordinateSystem());
    }
}
