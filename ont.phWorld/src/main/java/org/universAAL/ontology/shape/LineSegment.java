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

//import javax.media.j3d.GeometryArray;
//import javax.media.j3d.LineArray;

import jp.go.ipa.jgcl.JgclCartesianPoint3D;
import jp.go.ipa.jgcl.JgclLine3D;
import jp.go.ipa.jgcl.JgclPoint3D;
import jp.go.ipa.jgcl.JgclPointOnCurve3D;

import org.universAAL.ontology.location.position.CoordinateSystem;
import org.universAAL.ontology.location.position.Point;
//import org.universAAL.middleware.rdf.TypeMapper;
//import org.universAAL.middleware.owl.Restriction;
//import org.universAAL.ontology.location.PlaceType;
//import org.universAAL.ontology.ComparableIndividual;

/**
 * Ontological representation of a segment of a line. Methods included in this
 * class are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author chwirth
 * 
 */

public class LineSegment extends Line {

    public static final String MY_URI = ShapeOntology.NAMESPACE + "LineSegment";

    /**
     * Creates a LineSegment object
     * 
     * @param uri
     *            the object URI
     */
    public LineSegment(String uri) {
	super(uri);
    }

    /**
     * Creates a LineSegment object
     */
    public LineSegment() {
	super();
    }

    public LineSegment(String uri, Point start, Point end) {
	super(uri, new Point[] { start, end });
    }

    public LineSegment(Point start, Point end) {
	super(new Point[] { start, end });
    }

    public String getClassURI() {
	return MY_URI;
    }

    public Point getStart() {
	return getPoints()[0];
    }

    public Point getEnd() {
	return getPoints()[1];
    }

    public float getDistanceTo(Point point) {
	if (point == null)
	    throw new IllegalArgumentException();
	CoordinateSystem common = CoordinateSystem.findCommonParentSystem(point
		.getCoordinateSystem(), this.getLocalCoordinateSystem());
	double[] a = getStart().getInHigherCoordinateSystem(common)
		.get3DCoordinates();
	double[] b = getEnd().getInHigherCoordinateSystem(common)
		.get3DCoordinates();
	JgclPoint3D c = new JgclCartesianPoint3D(point
		.getInHigherCoordinateSystem(common).get3DCoordinates());
	JgclPointOnCurve3D[] proj = (new JgclLine3D(
		new JgclCartesianPoint3D(a), new JgclCartesianPoint3D(b))
		.projectFrom(c));
	float dist = Float.MAX_VALUE;
	for (int i = 0; i < proj.length; i++) {
	    double curdist;
	    if ((curdist = proj[i].distance(c)) < dist)
		dist = (float) curdist;
	}
	return dist;
    }

    /**
     * calculates the distance between a LineSegment and a specified shape
     * object
     */
    public float getDistanceTo(Shape shape) {
	if (shape == null)
	    throw new IllegalArgumentException();

	if (shape instanceof Sphere) {
	    float dist = getDistanceTo(((Sphere) shape).getCenter());
	    dist -= ((Sphere) shape).getRadius();
	    if (dist < 0)
		return Point.INTERSECTING;
	    else
		return dist;
	}

	if (shape instanceof Box) {
	    Point start = getStart();
	    Point end = getEnd();
	    Point dir = new Point(end.getX() - start.getX(), end.getY()
		    - start.getY(), end.getZ() - start.getZ(), start
		    .getCoordinateSystem());
	    return distanceRay(start, dir, (Box) shape, 0, 1);
	}

	return Point.NOT_COMPUTABLE_DISTANCE;
    }

    private float distanceRay(Point lineStart, Point lineDir, Box box,
	    float minDir, float maxDir) {

	// at first, the common parent coordinate system has to be found
	CoordinateSystem common = CoordinateSystem
		.findCommonParentSystem(lineStart.getCoordinateSystem(), box
			.getLocalCoordinateSystem());

	// then the direction of the line segment and its start point have to be
	// transformed to the common coordinate system
	lineDir = lineDir.getInHigherCoordinateSystem(common);
	lineStart = lineStart.getInHigherCoordinateSystem(common);

	// a new point with the inverted components of the direction point will
	// be created
	Point invDir = new Point((float) (1f / lineDir.getX()),
		(float) (1f / lineDir.getY()), (float) (1f / lineDir.getZ()),
		new CoordinateSystem());

	// if the component is negative, signDir is true
	boolean signDirX = invDir.getX() < 0;
	boolean signDirY = invDir.getY() < 0;
	boolean signDirZ = invDir.getZ() < 0;

	// the center point of the box shape in the common coordinate system
	Point center = box.getCenter().getInHigherCoordinateSystem(common);

	// creates arrays with the minimum and maximum values for the x, y and z
	// components of the box shape
	double[] min = { center.getX() - box.getWidth() / 2f,
		center.getY() - box.getDepth() / 2f,
		center.getZ() - box.getHeight() / 2f };
	double[] max = { center.getX() + box.getWidth() / 2f,
		center.getY() + box.getDepth() / 2f,
		center.getZ() + box.getHeight() / 2f };

	// 
	double[] bbox;
	bbox = signDirX ? max : min;
	double tmin = (bbox[0] - lineStart.getX()) * invDir.getX();
	bbox = signDirX ? min : max;
	double tmax = (bbox[0] - lineStart.getX()) * invDir.getX();

	bbox = signDirY ? max : min;
	double tymin = (bbox[1] - lineStart.getY()) * invDir.getY();
	bbox = signDirY ? min : max;
	double tymax = (bbox[1] - lineStart.getY()) * invDir.getY();

	// 
	if (tymin > tmin)
	    tmin = tymin;
	if (tymax < tmax)
	    tmax = tymax;

	// 
	bbox = signDirZ ? max : min;
	double tzmin = (bbox[2] - lineStart.getZ()) * invDir.getZ();
	bbox = signDirZ ? min : max;
	double tzmax = (bbox[2] - lineStart.getZ()) * invDir.getZ();

	// 
	if (tzmin > tmin)
	    tmin = tzmin;
	if (tzmax < tmax)
	    tmax = tzmax;
	if ((tmin < maxDir) && (tmax > minDir))
	    return Point.INTERSECTING;

	// 
	double pt[] = { tmin * lineDir.getX(), tmin * lineDir.getY(),
		tmin * lineDir.getZ() };

	// 
	float dist = (float) Math.sqrt(Math.pow(pt[0], 2) + Math.pow(pt[1], 2)
		+ Math.pow(pt[2], 2));

	return dist;
    }
}
