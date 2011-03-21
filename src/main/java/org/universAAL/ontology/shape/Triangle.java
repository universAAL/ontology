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

import java.util.Vector;

import org.universAAL.middleware.owl.Restriction;
import org.universAAL.ontology.location.position.Point;

/**
 * 
 * @author chwirth
 * 
 */

public class Triangle extends Polygon {

    public static final String MY_URI;

    static {
	MY_URI = uAAL_SHAPE_NAMESPACE + "Triangle";
	register(Triangle.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_VERTICES.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    Point.MY_URI, 3, 3);
	return Shape3D.getClassRestrictionsOnProperty(propURI);
    }

    /**
     * Creates a Triangle object
     * 
     * @param uri
     *            the object URI
     */
    public Triangle(String uri) {
	super(uri);
    }

    /**
     * Creates a Polygon object
     */
    public Triangle() {
	super();
    }

    /**
     * Creates a triangle object. All vertices have to be in the same coordinate
     * system
     * 
     * @param uri
     *            this value can also be a null object
     * @param verts
     *            an array of all vertices in counter clockwise order
     */
    public Triangle(String uri, Point[] verts) {
	super(uri);
	setVertices(verts);
	checkValid();
	setLocalCoordinateSystem(verts[0].getCoordinateSystem());
    }

    public Triangle(Point[] verts) {
	super();
	setVertices(verts);
	checkValid();
	setLocalCoordinateSystem(verts[0].getCoordinateSystem());
    }

    /**
     * Returns a human readable description on the essence of this ontology
     * class.
     */
    public static String getRDFSComment() {
	return "A triangle.";
    }

    /**
     * Returns a label with which this ontology class can be introduced to human
     * users.
     */
    public static String getRDFSLabel() {
	return "Triangle";
    }

    public void setVertices(Point[] verts) {
	if (verts == null)
	    throw new IllegalArgumentException();
	if (verts.length != 3)
	    throw new IllegalArgumentException("Must have 3 vertices");
	Vector vmapper = new Vector();
	for (int i = 0; i < verts.length; i++)
	    vmapper.add(verts[i]);
	props.put(PROP_VERTICES, vmapper);
	checkValid();
    }

}
