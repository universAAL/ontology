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

//import javax.media.j3d.Transform3D;
//import javax.vecmath.Point3d;
//import javax.vecmath.Vector3d;
import org.universAAL.ontology.location.Location;
import org.universAAL.ontology.location.LocationOntology;

/**
 * Ontological representation of an exact point in a geometric coordinate
 * system. Methods included in this class are the mandatory ones for
 * representing an ontological concept in Java classes for uAAL. Usually it
 * includes getters and setters for most of its properties.
 * 
 * @author chwirth
 * 
 */

public class Point extends Location {

    public static final String MY_URI = LocationOntology.NAMESPACE + "Point";
    public static final String PROP_X = LocationOntology.NAMESPACE + "xPosition";
    public static final String PROP_Y = LocationOntology.NAMESPACE + "yPosition";
    public static final String PROP_Z = LocationOntology.NAMESPACE + "zPosition";
    public static final String PROP_COORDINATE_SYSTEM = LocationOntology.NAMESPACE + "coordianteSystem";

    public static final int NOT_COMPUTABLE_DISTANCE = -1;
    public static final int INTERSECTING = -2;
    public static final double EARTH_QUADRATIC_MEAN_RADIUS = 6372795.477598;


    /**
     * Constructor just for usage by de-serializers. Do not use this constructor
     * within applications as it may lead to incomplete instances that cause
     * exceptions.
     */
    public Point() {
	super();
    }

    /**
     * Constructor just for usage by de-serializers. Do not use this constructor
     * within applications as it may lead to incomplete instances that cause
     * exceptions.
     */
    public Point(String uri) {
	super(uri);
    }

    /**
     * Point constructor.
     * 
     * @param uri
     *            The ontological object URI
     * @param x
     * @param y
     * @param z
     * @param system
     *            the coordinate system of the point
     */
    public Point(String uri, double x, double y, double z,
	    CoordinateSystem system) {
	super(uri);
	props.put(PROP_Y, new Double(y));
	props.put(PROP_Z, new Double(z));
	props.put(PROP_X, new Double(x));
	props.put(PROP_COORDINATE_SYSTEM, system);
    }

    public Point(double x, double y, double z, CoordinateSystem system) {
	super();
	props.put(PROP_Y, new Double(y));
	props.put(PROP_Z, new Double(z));
	props.put(PROP_X, new Double(x));
	props.put(PROP_COORDINATE_SYSTEM, system);
    }

    public Point(double x, double y, CoordinateSystem system) {
	super();
	props.put(PROP_Y, new Double(y));
	props.put(PROP_Z, new Double(Double.NaN));
	props.put(PROP_X, new Double(x));
	props.put(PROP_COORDINATE_SYSTEM, system);
    }

    /**
     * Point constructor.
     * 
     * @param uri
     *            The ontological object URI
     * @param x
     * @param y
     * @param system
     *            the coordinate system of the point
     */
    public Point(String uri, double x, double y, CoordinateSystem system) {
	super(uri);
	props.put(PROP_Y, new Double(y));
	props.put(PROP_X, new Double(x));
	props.put(PROP_Z, new Double(Double.NaN));
	props.put(PROP_COORDINATE_SYSTEM, system);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	if (super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL)
	    return super.getPropSerializationType(propURI);
	if (PROP_X.equals(propURI) || PROP_Y.equals(propURI)
		|| PROP_Z.equals(propURI)
		|| PROP_COORDINATE_SYSTEM.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }

    /**
     * 
     * @return the double array {x, y, z}.If the point z property is missing the
     *         method assumes that it is zero.
     */
    public double[] get3DCoordinates() {
	double z = 0;
	if (props.containsKey(PROP_Z))
	    z = ((Double) props.get(PROP_Z)).doubleValue();
	double[] get3DCoordinates = {
		((Double) props.get(PROP_X)).doubleValue(),
		((Double) props.get(PROP_Y)).doubleValue(), z };
	return get3DCoordinates;
    }

    /**
     * @return the double array {x, y}
     */
    public double[] get2DCoordinates() {
	double[] get2DCoordinates = {
		((Double) props.get(PROP_X)).doubleValue(),
		((Double) props.get(PROP_Y)).doubleValue() };
	return get2DCoordinates;
    }

    public double getZ() {
	double z = Double.NaN;
	if (props.containsKey(PROP_Z))
	    z = ((Double) props.get(PROP_Z)).doubleValue();
	return z;
    }

    public double getX() {
	return ((Double) props.get(PROP_X)).doubleValue();
    }

    public double getY() {
	return ((Double) props.get(PROP_Y)).doubleValue();
    }

    public void set2DCoordinates(double x, double y) {
	props.put(PROP_X, new Double(x));
	props.put(PROP_Y, new Double(y));
	props.put(PROP_Z, new Double(Double.NaN));
    }

    public void set3DCoordinates(double x, double y, double z) {
	props.put(PROP_Y, new Double(y));
	props.put(PROP_Z, new Double(z));
	props.put(PROP_X, new Double(x));
    }

    public void setZ(double z) {
	props.put(PROP_Z, new Double(z));
    }

    public void setCoordinateSystem(CoordinateSystem system) {
	if (system == null)
	    throw new IllegalArgumentException();
	props.put(PROP_COORDINATE_SYSTEM, system);
    }

    public CoordinateSystem getCoordinateSystem() {
	return (CoordinateSystem) props.get(PROP_COORDINATE_SYSTEM);
    }

    public boolean isWellFormed() {
	return props.containsKey(PROP_X) && props.containsKey(PROP_Y)
		&& props.containsKey(PROP_COORDINATE_SYSTEM);
    }

    /**
     * Both points have to be in the same CoordinateSystem If the System is
     * WGS84, a point in latitude/longitude is assume If not, the euclidean
     * distance is returned.
     */
    public float getDistanceTo(Location other) {
	if (other == null || other.getClass() != Point.class)
	    throw new IllegalArgumentException();
	CoordinateSystem commonsys = CoordinateSystem.findCommonParentSystem(
		getCoordinateSystem(), ((Point) other).getCoordinateSystem());
	Point p1 = this.getInHigherCoordinateSystem(commonsys);
	Point p2 = ((Point) other).getInHigherCoordinateSystem(commonsys);
	if (p1.getCoordinateSystem() == p2.getCoordinateSystem()) {
	    if (this.getCoordinateSystem().getURI().indexOf("WGS84") > -1) {
		return (float) getDistanceFromLatLong(p1.get2DCoordinates(), p2
			.get2DCoordinates());
	    } else {
		double[] otherCoords = p2.get3DCoordinates();
		double[] thisCoords = p1.get3DCoordinates();
		double[] SolVec = { otherCoords[0] - thisCoords[0],
			otherCoords[1] - thisCoords[1],
			otherCoords[2] - thisCoords[2] };
		double squaredEuclidean = Math.pow(SolVec[0], 2)
			+ Math.pow(SolVec[1], 2);
		if (!Double.isNaN(SolVec[2]))
		    squaredEuclidean += Math.pow(SolVec[2], 2);
		if (squaredEuclidean == 0)
		    return 0;
		return (float) Math.sqrt(squaredEuclidean);
	    }
	}

	return NOT_COMPUTABLE_DISTANCE;
    }

    /**
     * 
     * Get the distance between 2 points represented using longitude/latitude
     * pairs
     */
    private double getDistanceFromLatLong(double[] current2DCoordinatesDeg,
	    double[] other2DCoordinatesDeg) {
	if (current2DCoordinatesDeg == null || other2DCoordinatesDeg == null)
	    return NOT_COMPUTABLE_DISTANCE;

	// convert current and other location longitude and latitude in radiant

	double[] current2DCoordinatesRad = {
		Math.PI * current2DCoordinatesDeg[0] / 180,
		Math.PI * current2DCoordinatesDeg[1] / 180 };
	double[] other2DCoordinatesRad = {
		Math.PI * other2DCoordinatesDeg[0] / 180,
		Math.PI * other2DCoordinatesDeg[1] / 180 };

	// calculate fi, the absolute value of the two longitudes

	double fi = Math.abs(current2DCoordinatesRad[1]
		- other2DCoordinatesRad[1]);

	// calculate p, the distance in radiant (applying an Eulero's theorem)

	double p = Math.acos(Math.sin(current2DCoordinatesRad[0])
		* Math.sin(other2DCoordinatesRad[0])
		+ Math.cos(current2DCoordinatesRad[0])
		* Math.cos(other2DCoordinatesRad[0]) * Math.cos(fi));

	// calculate the required distance by multiplying the radiant distance
	// with the
	// earth quadratic mean radius

	return p * EARTH_QUADRATIC_MEAN_RADIUS;

    }

    /**
     * if the point is in a OriginedMetric, the point will be transformed to the
     * next higher system A 2d point gets transformed to a 3d point, because all
     * non local coordinate systems are 3d
     * 
     * @return the point
     */
    public Point getInHigherCoordinateSystem() {
//	CoordinateSystem Sys = getCoordinateSystem();
//	if (!(Sys instanceof OriginedMetric))
//	    throw new IllegalArgumentException(
//		    "Point is not in an OriginedMetric");
//	Point origin = ((OriginedMetric) Sys).getOrigin();
//	if (Sys.getClass() != origin.getCoordinateSystem().getClass())
//	    throw new IllegalArgumentException(
//		    "Higher system is of an other type");
//	double[] p = get3DCoordinates();
//	double[] o = origin.get3DCoordinates();
//	if (Double.isNaN(p[2]))
//	    p[2] = 0;
//	Point3d point = new Point3d(p[0], p[1], p[2]);
//	Transform3D map = new Transform3D(), rmap = new Transform3D();
//	rmap.rotX(Math.toRadians(((OriginedMetric) Sys).getRotateX()));
//	map.mul(rmap);
//	rmap.rotY(Math.toRadians(((OriginedMetric) Sys).getRotateY()));
//	map.mul(rmap);
//	rmap.rotY(Math.toRadians(((OriginedMetric) Sys).getRotateZ()));
//	map.mul(rmap);
//	map.setTranslation(new Vector3d(o[0], o[1], o[2]));
//	map.transform(point);
//	return new Point(point.x, point.y, point.z, origin
//		.getCoordinateSystem());
	try {
	    throw new Exception(
		    "The method 'getInHigherCoordinateSystem' is disabled in this version of to "
			    + "avoid GPL libraries. If you really need this method, use the restricted GPL version, or"
			    + "modify source code of this version to include the dependencies you need:"
			    + "j3d-core and vecmath, versions at least 1.3.1.");
	} catch (Exception e) {
	    System.out
		    .println("The method 'getInHigherCoordinateSystem' is disabled in this version of to "
			    + "avoid GPL libraries. If you really need this method, use the restricted GPL version, or"
			    + "modify source code of this version to include the dependencies you need:"
			    + "j3d-core and vecmath, versions at least 1.3.1.");
	    e.printStackTrace();
	}
	return null;
    }

    /**
     * if the point is in a OriginedMetric, the point will be transformed to the
     * given higher system A 2d point gets transformed to a 3d point, because
     * all non local coordinate systems are 3d
     * 
     * @param system
     *            the target system
     * @return the point or null if the target system is not part of the higher
     *         coordinate systems chain
     */
    public Point getInHigherCoordinateSystem(CoordinateSystem system) {
	Point p = this;
	while (p.getCoordinateSystem() != system) {
	    if (p.getCoordinateSystem().getClass() != OriginedMetric.class)
		return null;
	    p = p.getInHigherCoordinateSystem();
	}
	return p;
    }

    public String toString() {
	return "[" + props.get(PROP_X) + "," + props.get(PROP_Y) + ","
		+ props.get(PROP_Z) + "," + getCoordinateSystem() + "]";
    }

    /**
     * 
     * @return true, if the point is defined by only two values
     */
    public boolean is2D() {
	return ((Double) props.get(PROP_Z)).isNaN();
    }

    /**
     * ensures a valid z value
     */
    public void castTo3D() {
	if (is2D())
	    props.put(PROP_Z, new Double(0));
    }
}
