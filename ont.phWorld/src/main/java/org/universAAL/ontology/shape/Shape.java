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
/**
 * Superclass for all Shapes, 2d and 3d.
 * New implementations have to be added to the Activator.loadClasses list
 */
package org.universAAL.ontology.shape;

//import javax.media.j3d.BoundingBox;
//import javax.media.j3d.BoundingSphere;
//import javax.media.j3d.Bounds;
//import javax.vecmath.Point3d;
//import javax.vecmath.Vector3d;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.location.position.CoordinateSystem;
import org.universAAL.ontology.location.position.OriginedMetric;
import org.universAAL.ontology.location.position.Point;

/**
 * Ontological representation of any geometric shape. Methods included in this
 * class are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author chwirth
 * 
 */

public abstract class Shape extends ManagedIndividual {

    public static final String MY_URI = ShapeOntology.NAMESPACE + "Shape";

    public static final String PROP_POINT_REPRESENTATION = ShapeOntology.NAMESPACE
    		+ "PointReperesentation";
    public static final String PROP_LOCAL_COORDINATE_SYSTEM = ShapeOntology.NAMESPACE
    		+ "localCoordSys";
    public static final String PROP_BOUNDING_VOLUME = ShapeOntology.NAMESPACE + "boundingVolume";


    /**
     * Creates a Shape object
     * 
     * @param uri
     *            the object URI
     */
    public Shape(String uri) {
	super(uri);
    }

    /**
     * Creates a Shape object
     */
    public Shape() {
	super();
    }

    /**
     * Creates a Shape object
     * 
     * @param uri
     *            this value can also be a null object
     * @param pointRep
     *            a (optional) single point Represenation
     * @param system
     *            The local coordinate system, normally a OriginedMetric
     */
    public Shape(String uri, Point pointRep, CoordinateSystem system) {
	super(uri);
	props.put(PROP_POINT_REPRESENTATION, pointRep);
	props.put(PROP_LOCAL_COORDINATE_SYSTEM, system);
    }

    /**
     * Creates a Shape object
     * 
     * @param pointRep
     *            a (optional) single point Represenation
     * @param system
     *            The local coordinate system, normally a OriginedMetric
     */
    public Shape(Point pointRep, CoordinateSystem system) {
	super();
	props.put(PROP_POINT_REPRESENTATION, pointRep);
	props.put(PROP_LOCAL_COORDINATE_SYSTEM, system);
    }

    /**
     * Creates a Shape object
     * 
     * @param uri
     *            the universal identifier
     * @param system
     *            The local coordinate system, normally a OriginedMetric
     */
    public Shape(String uri, CoordinateSystem system) {
	super(uri);
	props.put(PROP_LOCAL_COORDINATE_SYSTEM, system);
    }

    /**
     * Creates a Shape object
     * 
     * @param system
     *            The local coordinate system, normally a OriginedMetric
     */
    public Shape(CoordinateSystem system) {
	super();
	props.put(PROP_LOCAL_COORDINATE_SYSTEM, system);
    }

    public String getClassURI() {
	return MY_URI;
    }

    /**
     * if no explicit point representation was set, the center of the shape is
     * returned
     * 
     * @return
     */
    public Point getPointRepresentation() {
	Point p = (Point) props.get(PROP_POINT_REPRESENTATION);
	if (p == null)
	    return getCenter();
	else
	    return p;
    }

    /**
     * returns the centerpoint of the object
     * 
     * @return the centerpoint
     */
    public Point getCenter() {
	CoordinateSystem system = (CoordinateSystem) props
		.get(PROP_LOCAL_COORDINATE_SYSTEM);
	if (system instanceof OriginedMetric)
	    return ((OriginedMetric) system).getOrigin();
	else
	    return new Point(0d, 0d, 0d, system);
    }

    /**
     * 
     * @param shape
     * @return
     */
    public float getDistanceByBoundingVolume(Shape shape) {

	Shape bound = shape.getBoundingVolume();

	if (this instanceof Path)
	    return ((Path) this).getDistanceTo(bound);
	if (bound instanceof Box)
	    return ((Box) bound).getDistanceTo(getBoundingVolume());
	else if (this instanceof Box)
	    return ((Box) this).getDistanceTo(bound);
	else
	    return ((Sphere) this).getDistanceTo(bound);

    }

    /**
     * Implementation Note: The points have to be transformed to a common
     * coordinate system via CoordinateSystem.findCommonCoordinateSystem and
     * getInHigherCoordinateSystem(commonSystem)
     * 
     * @param p
     * @return the distance as positiv value or Point.NO_COMPUTABLE_DISTANCE or
     *         Point.INTERSECTING
     */
    public abstract float getDistanceTo(Point p);

    public void setPointRepresentation(Point point) {
	if (point == null)
	    throw new IllegalArgumentException();
	props.put(PROP_POINT_REPRESENTATION, point);
    }

    public void removePointRepresentation() {
	props.remove(PROP_POINT_REPRESENTATION);
    }

    public int getPropSerializationType(String propURI) {
	if (PROP_POINT_REPRESENTATION.equals(propURI)
		|| PROP_LOCAL_COORDINATE_SYSTEM.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }

    public void setLocalCoordinateSystem(CoordinateSystem system) {
	if (system == null)
	    throw new IllegalArgumentException();
	props.put(PROP_LOCAL_COORDINATE_SYSTEM, system);
    }

    public CoordinateSystem getLocalCoordinateSystem() {
	return (CoordinateSystem) props.get(PROP_LOCAL_COORDINATE_SYSTEM);
    }

    /**
     * Returns the bounding volume of this Shape3D. If no volume was set, a
     * minimal axis aligned bounding box or sphere will be returned.
     * 
     * @return the shape object representing the bounding volume
     */
    public Shape getBoundingVolume() {
	Shape p = (Shape) props.get(PROP_BOUNDING_VOLUME);
	if (p == null)
	    return computeBoundingVolume();
	return p;
    }

    /**
     * Implementation Note: Must compute and set bounding sphere or box as
     * PROP_BOUNDING_VOLUME
     * 
     * @return the bounding volume
     */
    protected abstract Shape computeBoundingVolume();

    /**
     * Sets an explicit bounding volume, disabling the automated bounding volume
     * calculation If an other Shape than a Sphere or Box should be used, the
     * ray intersection method in Shape has to be extended
     * 
     * @param shape
     *            FHSphere or a Box
     */
    public void setBoundingVolume(Shape shape) {
	if (shape == null)
	    throw new IllegalArgumentException();
	props.put(PROP_BOUNDING_VOLUME, shape);
    }

    public void removeBoundingVolume() {
	props.remove(PROP_BOUNDING_VOLUME);
    }

    /**
     * Calculates the intersection of an ray with the bounding volume of the
     * shape
     * 
     * @param base
     *            the base of the ray
     * @param dir
     *            the direction vector of the ray
     * @return true, if the ray intersects the shape
     */
    public boolean intersects(Point base, Point dir) {
//	Shape bound = getBoundingVolume();
//	Bounds bounds = null;
//	CoordinateSystem cs = CoordinateSystem
//		.findCommonParentSystem(base.getCoordinateSystem(), bound
//			.getCenter().getCoordinateSystem());
//	double[] center = bound.getCenter().getInHigherCoordinateSystem(cs)
//		.get3DCoordinates();
//	if (bound.getClass() == Box.class) {
//	    bounds = new BoundingBox(new Point3d(center[0]
//		    - ((Box) bound).getWidth() / 2d, center[1]
//		    - ((Box) bound).getDepth() / 2d, center[2]
//		    - ((Box) bound).getHeight() / 2d), new Point3d(center[0]
//		    + ((Box) bound).getWidth() / 2d, center[1]
//		    + ((Box) bound).getDepth() / 2d, center[2]
//		    + ((Box) bound).getHeight() / 2d));
//	}
//	if (bound.getClass() == Sphere.class) {
//	    bounds = new BoundingSphere(new Point3d(center[0], center[1],
//		    center[2]), ((Sphere) bound).getRadius());
//	}
//	return bounds.intersect(new Point3d(base.getX(), base.getY(), base
//		.getZ()), new Vector3d(dir.getX(), dir.getY(), dir.getZ()));
	try {
	    throw new Exception(
		    "The method 'intersects' is disabled in this version to "
			    + "avoid GPL libraries. If you really need this method, use the restricted GPL version, or"
			    + "modify source code of this version to include the dependencies you need:"
			    + "j3d-core and vecmath, versions at least 1.3.1.");
	} catch (Exception e) {
	    System.out
		    .println("The method 'intersects' is disabled in this version of to "
			    + "avoid GPL libraries. If you really need this method, use the restricted GPL version, or"
			    + "modify source code of this version to include the dependencies you need:"
			    + "j3d-core and vecmath, versions at least 1.3.1.");
	    e.printStackTrace();
	}
	return false;
    }

    /**
     * returns if the given point is within the shape
     * 
     * @param p
     * @return
     */
    public abstract boolean contains(Point p);

}
