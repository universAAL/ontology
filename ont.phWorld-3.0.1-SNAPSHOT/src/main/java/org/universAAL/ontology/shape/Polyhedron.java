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

import java.util.Vector;

import org.universAAL.ontology.location.Place;
import org.universAAL.ontology.location.position.OriginedMetric;
import org.universAAL.ontology.location.position.Point;

/**
 * Ontological representation of a tri-dimensional polyhedron. Methods included
 * in this class are the mandatory ones for representing an ontological concept
 * in Java classes for uAAL. Usually it includes getters and setters for most of
 * its properties.
 * 
 * @author chwirth
 * 
 */

public class Polyhedron extends Shape3D {

    public static final String MY_URI = ShapeOntology.NAMESPACE + "Polyhedron";

    public static final String PROP_FACES = ShapeOntology.NAMESPACE + "Faces";


    /**
     * Creates a Polygon object
     * 
     * @param uri
     *            the object URI
     */
    public Polyhedron(String uri) {
	super(uri);
    }

    /**
     * Creates a Polygon object
     */
    public Polyhedron() {
	super();
    }

    /**
     * Creates a Polygon object
     * 
     * @param uri
     *            this value can also be a null object
     * @param faces
     *            an array of all faces
     */
    public Polyhedron(String uri, Polygon[] faces) {
	super(uri);
	setFaces(faces);
    }

    public Polyhedron(Polygon[] faces) {
	super();
	setFaces(faces);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public Polygon[] getFaces() {
	Object[] o = ((Vector) props.get(PROP_FACES)).toArray();
	Polygon p[] = new Polygon[o.length];
	for (int i = 0; i < o.length; i++)
	    p[i] = (Polygon) o[i];
	return p;
    }

    public void setFaces(Polygon[] faces) {
	if (faces == null)
	    throw new IllegalArgumentException();
	if (faces.length < 4)
	    throw new IllegalArgumentException("Not enough faces");
	Vector vmapper = new Vector();
	for (int i = 0; i < faces.length; i++) {
	    faces[i].castTo3D();
	    vmapper.add(faces[i]);
	}
	props.put(PROP_FACES, vmapper);
    }

    public int getPropSerializationType(String propURI) {
	if (super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL)
	    return super.getPropSerializationType(propURI);
	if (PROP_FACES.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }

    public float getDistanceTo(Point other) {
	if (other == null)
	    throw new IllegalArgumentException();
	float dist = Float.MAX_VALUE;
	Polygon[] faces = getFaces();
	for (int i = 0; i < faces.length; i++) {
	    float curdist;
	    if ((curdist = faces[i].getDistanceTo(other)) < dist)
		dist = curdist;
	}
	return dist;
    }

    protected Shape computeBoundingVolume() {
	Polygon[] faces = getFaces();
	double max[] = { Double.MAX_VALUE, Double.MIN_VALUE, Double.MAX_VALUE,
		Double.MIN_VALUE, Double.MAX_VALUE, Double.MIN_VALUE };
	for (int i = 0; i < faces.length; i++) {
	    Box curBox = (Box) faces[i].getBoundingVolume();
	    Point center = curBox.getCenter();
	    if (max[0] > center.getX() - curBox.getWidth() / 2d)
		max[0] = center.getX() - curBox.getWidth() / 2d;
	    if (max[1] < center.getX() + curBox.getWidth() / 2d)
		max[1] = center.getX() + curBox.getWidth() / 2d;
	    if (max[2] > center.getY() - curBox.getDepth() / 2d)
		max[2] = center.getY() - curBox.getDepth() / 2d;
	    if (max[3] < center.getY() + curBox.getDepth() / 2d)
		max[3] = center.getY() + curBox.getDepth() / 2d;
	    if (max[4] > center.getZ() - curBox.getHeight() / 2d)
		max[4] = center.getZ() - curBox.getHeight() / 2d;
	    if (max[5] < center.getZ() + curBox.getHeight() / 2d)
		max[5] = center.getZ() + curBox.getHeight() / 2d;
	}
	return new Box(max[1] - max[0], max[3] - max[2], max[5] - max[4],
		new OriginedMetric((float) (max[0] + (max[1] - max[0]) / 2f),
			(float) (max[2] + (max[3] - max[2]) / 2f),
			(float) (max[4] + (max[5] - max[4]) / 2f),
			(Place) getCenter().getContainingLocation()));
    }

    public boolean contains(Point p) {
	// TODO
	return false;
    }
}
