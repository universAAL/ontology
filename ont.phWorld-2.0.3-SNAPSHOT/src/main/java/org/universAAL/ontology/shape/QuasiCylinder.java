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
import org.universAAL.ontology.location.position.OriginedMetric;
import org.universAAL.ontology.location.position.Point;

/**
 * Ontological representation of a quasi-cylinder. Methods included in this
 * class are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author chwirth
 * 
 */

public class QuasiCylinder extends Shape3D {

    public static final String MY_URI = ShapeOntology.NAMESPACE + "QuasiCylinder";

    public static final String PROP_HEAD = ShapeOntology.NAMESPACE + "Head";
    public static final String PROP_FOOT = ShapeOntology.NAMESPACE + "Foot";


    /**
     * Creates a Shape object
     * 
     * @param uri
     *            the object URI
     */
    public QuasiCylinder(String uri) {
	super(uri);
    }

    /**
     * Creates a Shape object
     */
    public QuasiCylinder() {
	super();
    }

    /**
     * Creates a new QuasiCylinder. Head and foot have to have the same parent
     * coordinate system. This means
     * head/foot.getLocalCoordinateSystem().getOrigin().getCoordinateSystem()
     * have to return the same object
     * 
     * @param uri
     * @param head
     * @param foot
     */
    public QuasiCylinder(String uri, Ellipse head, Ellipse foot) {
	super(uri);
	props.put(PROP_HEAD, head);
	props.put(PROP_FOOT, foot);
	checkValid();
	setLocalCoordinateSystem(((OriginedMetric) head
		.getLocalCoordinateSystem()).getOrigin().getCoordinateSystem());
    }

    /**
     * Creates a new QuasiCylinder. Head and foot have to have the same parent
     * coordinate system. This means
     * head/foot.getLocalCoordinateSystem().getOrigin().getCoordinateSystem()
     * have to return the same object
     * 
     * @param head
     * @param foot
     */
    public QuasiCylinder(Ellipse head, Ellipse foot) {
	super();
	props.put(PROP_HEAD, head);
	props.put(PROP_FOOT, foot);
	checkValid();
	setLocalCoordinateSystem(((OriginedMetric) head
		.getLocalCoordinateSystem()).getOrigin().getCoordinateSystem());
    }

    public String getClassURI() {
	return MY_URI;
    }

    private void checkValid() {
	Ellipse head = (Ellipse) props.get(PROP_HEAD);
	Ellipse foot = (Ellipse) props.get(PROP_FOOT);
	if (head.getLocalCoordinateSystem().getClass() != OriginedMetric.class
		|| foot.getLocalCoordinateSystem().getClass() != OriginedMetric.class
		|| ((OriginedMetric) head.getLocalCoordinateSystem())
			.getOrigin().getCoordinateSystem() != ((OriginedMetric) foot
			.getLocalCoordinateSystem()).getOrigin()
			.getCoordinateSystem())
	    throw new IllegalArgumentException(
		    "head and foot does not have the same parent coordinate system");
    }

    public Ellipse getHead() {
	return (Ellipse) props.get(PROP_HEAD);
    }

    public void setHead(Ellipse head) {
	props.put(PROP_HEAD, head);
	checkValid();
    }

    public Ellipse getFoot() {
	return (Ellipse) props.get(PROP_FOOT);
    }

    public void setFoot(Ellipse foot) {
	props.put(PROP_FOOT, foot);
	checkValid();
    }

    /**
     * returns the midpoint of the object
     * 
     * @return the midpoint
     */
    public Point getMidpoint() {
	double[] headcenter = getHead().getCenter().get3DCoordinates();
	double[] footcenter = getFoot().getCenter().get3DCoordinates();
	Point center = new Point((headcenter[0] - footcenter[0]) / 2d
		+ footcenter[0], (headcenter[1] - footcenter[1]) / 2d
		+ footcenter[1], (headcenter[2] - footcenter[2]) / 2d
		+ footcenter[2], getHead().getCenter().getCoordinateSystem());
	return center;
    }

    public int getPropSerializationType(String propURI) {
	if (super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL)
	    return super.getPropSerializationType(propURI);
	if (PROP_HEAD.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;
	if (PROP_FOOT.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }

    /**
     * NOT IMPLEMENTED
     */
    public float getDistanceTo(Point point) {
	// TODO
	return Point.NOT_COMPUTABLE_DISTANCE;
    }

    protected Shape computeBoundingVolume() {
	Ellipse head = getHead();
	Ellipse foot = getFoot();
	double axis1 = head.getMajorAxisLength();
	double axis2 = head.getMinorAxisLength();
	double axis3 = foot.getMajorAxisLength();
	double axis4 = foot.getMinorAxisLength();
	Point[] pts = {
		new Point(axis1 / 2d, axis2 / 2d, 0, head
			.getLocalCoordinateSystem())
			.getInHigherCoordinateSystem(),
		new Point(-axis1 / 2d, -axis2 / 2d, 0, head
			.getLocalCoordinateSystem())
			.getInHigherCoordinateSystem(),
		new Point(axis3 / 2d, axis4 / 2d, 0, foot
			.getLocalCoordinateSystem())
			.getInHigherCoordinateSystem(),
		new Point(-axis3 / 2d, -axis4 / 2d, 0, foot
			.getLocalCoordinateSystem())
			.getInHigherCoordinateSystem() };
	Point[] bnds = {
		new Point(Math.max(Math.max(Math.max(pts[0].getX(), pts[1]
			.getX()), pts[2].getX()), pts[3].getX()), Math.max(Math
			.max(Math.max(pts[0].getY(), pts[1].getY()), pts[2]
				.getY()), pts[3].getY()), Math.max(Math.max(
			Math.max(pts[0].getZ(), pts[1].getZ()), pts[2].getZ()),
			pts[3].getZ()), getLocalCoordinateSystem()),
		new Point(Math.min(Math.min(Math.min(pts[0].getX(), pts[1]
			.getX()), pts[2].getX()), pts[3].getX()), Math.min(Math
			.min(Math.min(pts[0].getY(), pts[1].getY()), pts[2]
				.getY()), pts[3].getY()), Math.min(Math.min(
			Math.min(pts[0].getZ(), pts[1].getZ()), pts[2].getZ()),
			pts[3].getZ()), getLocalCoordinateSystem()) };
	return new Box(bnds[0].getX() - bnds[1].getX(), bnds[0].getY()
		- bnds[1].getY(), bnds[0].getZ() - bnds[1].getZ(),
		new OriginedMetric(
			(float) (bnds[0].getX() + (bnds[1].getX() - bnds[0]
				.getX()) / 2d),
			(float) (bnds[0].getY() + (bnds[1].getY() - bnds[0]
				.getY()) / 2d),
			(float) (bnds[0].getZ() + (bnds[1].getZ() - bnds[0]
				.getZ()) / 2d), (Place) getCenter()
				.getContainingLocation()));
    }

    /**
     * NOT IMPLEMENTED
     */
    public boolean contains(Point p) {
	// TODO
	return false;
    }
}
