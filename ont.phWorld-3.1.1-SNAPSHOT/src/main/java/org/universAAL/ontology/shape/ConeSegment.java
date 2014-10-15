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

import jp.go.ipa.jgcl.JgclCartesianPoint3D;
import jp.go.ipa.jgcl.JgclLine3D;
import jp.go.ipa.jgcl.JgclPoint3D;
import jp.go.ipa.jgcl.JgclPointOnCurve3D;

import org.universAAL.middleware.util.Constants;
import org.universAAL.ontology.location.position.CoordinateSystem;
import org.universAAL.ontology.location.position.Point;

/**
 * Ontological representation of a cone segment shape. Methods included in this
 * class are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author chwirth
 * 
 */

public class ConeSegment extends LineSegment {

    public static final String MY_URI = ShapeOntology.NAMESPACE + "ConeSegment";
    public static final String PROP_RADIUS_START = ShapeOntology.NAMESPACE + "RadiusStart";
    public static final String PROP_RADIUS_END = ShapeOntology.NAMESPACE + "RadiusEnd";

    public int getPropSerializationType(String propURI) {
	if (PROP_RADIUS_START.equals(propURI)
		|| PROP_RADIUS_END.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;
	return super.getPropSerializationType(propURI);

    }

    /**
     * Creates a LineSegment object
     * 
     * @param uri
     *            the object URI
     */
    public ConeSegment(String uri) {
	super(uri);
    }

    /**
     * Creates a LineSegment object
     */
    public ConeSegment() {
	super();
    }

    public ConeSegment(String uri, Point start, Point end, float radius_start,
	    float radius_end) {
	super((uri == null || uri.lastIndexOf('#') > 0) ? uri
		: Constants.uAAL_MIDDLEWARE_LOCAL_ID_PREFIX + uri, start, end);
	setRadiusStart(radius_start);
	setRadiusEnd(radius_end);
    }

    public ConeSegment(Point start, Point end, float radius_start,
	    float radius_end) {
	super(start, end);
	setRadiusStart(radius_start);
	setRadiusEnd(radius_end);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public float getRadiusStart() {
	return ((Float) props.get(PROP_RADIUS_START)).floatValue();
    }

    public void setRadiusStart(float radius) {
	props.put(PROP_RADIUS_START, new Float(radius));
    }

    public float getRadiusEnd() {
	return ((Float) props.get(PROP_RADIUS_END)).floatValue();
    }

    public void setRadiusEnd(float radius) {
	props.put(PROP_RADIUS_END, new Float(radius));
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
	JgclPoint3D jgcla = new JgclCartesianPoint3D(a), jgclb = new JgclCartesianPoint3D(
		b);
	JgclPointOnCurve3D[] proj = (new JgclLine3D(jgcla, jgclb)
		.projectFrom(c));
	float dist = Float.MAX_VALUE;
	for (int i = 0; i < proj.length; i++) {
	    double curdist;
	    float t = getT(proj[i], jgcla, jgclb);
	    if ((curdist = proj[i].distance(c) - radiusAt(t)) < dist)
		dist = (float) curdist;
	}
	return dist;
    }

    private float getT(JgclPoint3D p, JgclPoint3D a, JgclPoint3D b) {
	double dista = Math.abs(p.distance(a));
	double distb = Math.abs(p.distance(b));
	return (float) ((1.0f / (dista + distb)) * dista);
    }

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

    /**
     * Cone radius at position t
     * 
     * @param t
     *            a value between 0 and 1
     * @return
     */
    private float radiusAt(float t) {
	float rs = getRadiusStart();
	float re = getRadiusEnd();
	return rs + (re - rs) * t;
    }

    private float distanceRay(Point start, Point dir, Box box, float minDir,
	    float maxDir) {

	CoordinateSystem common = CoordinateSystem.findCommonParentSystem(start
		.getCoordinateSystem(), box.getLocalCoordinateSystem());
	dir = dir.getInHigherCoordinateSystem(common);
	start = start.getInHigherCoordinateSystem(common);

	Point invDir = new Point((float) (1f / dir.getX()), (float) (1f / dir
		.getY()), (float) (1f / dir.getZ()), new CoordinateSystem());

	boolean signDirX = invDir.getX() < 0;
	boolean signDirY = invDir.getY() < 0;
	boolean signDirZ = invDir.getZ() < 0;

	Point center = box.getCenter().getInHigherCoordinateSystem(common);

	// TODO: is the association between width, depth, height and x,y,z right
	// at this place?
	double[] min = { center.getX() - box.getWidth() / 2f,
		center.getY() - box.getDepth() / 2f,
		center.getZ() - box.getHeight() / 2f };
	double[] max = { center.getX() + box.getWidth() / 2f,
		center.getY() + box.getDepth() / 2f,
		center.getZ() + box.getHeight() / 2f };

	double[] bbox;
	bbox = signDirX ? max : min;
	double tmin = (bbox[0] - start.getX()) * invDir.getX();
	bbox = signDirX ? min : max;
	double tmax = (bbox[0] - start.getX()) * invDir.getX();

	bbox = signDirY ? max : min;
	double tymin = (bbox[1] - start.getY()) * invDir.getY();
	bbox = signDirY ? min : max;
	double tymax = (bbox[1] - start.getY()) * invDir.getY();

	if (tymin > tmin)
	    tmin = tymin;
	if (tymax < tmax)
	    tmax = tymax;

	bbox = signDirZ ? max : min;
	double tzmin = (bbox[2] - start.getZ()) * invDir.getZ();
	bbox = signDirZ ? min : max;
	double tzmax = (bbox[2] - start.getZ()) * invDir.getZ();

	if (tzmin > tmin)
	    tmin = tzmin;
	if (tzmax < tmax)
	    tmax = tzmax;
	if ((tmin < maxDir) && (tmax > minDir))
	    return Point.INTERSECTING;

	double pt[] = { tmin * dir.getX(), tmin * dir.getY(), tmin * dir.getZ() };

	//
	float dist = (float) (Math.sqrt(Math.pow(pt[0], 2) + Math.pow(pt[1], 2)
		+ Math.pow(pt[2], 2)) - radiusAt((float) tmin));

	if (dist < 0)
	    return Point.INTERSECTING;
	return dist;
    }
}
