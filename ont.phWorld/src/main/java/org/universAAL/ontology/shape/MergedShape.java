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

import org.universAAL.ontology.location.position.Point;

/**
 * Ontological representation of a merged boolean shape. Methods included in
 * this class are the mandatory ones for representing an ontological concept in
 * Java classes for uAAL. Usually it includes getters and setters for most of
 * its properties.
 * 
 * @author chwirth
 * 
 */

public class MergedShape extends BooleanShape {

    public static final String MY_URI = ShapeOntology.NAMESPACE + "MergedShape";

    public MergedShape(String uri) {
	super(uri);
    }

    public MergedShape(Shape[] shapes) {
	super();
	setShapes(shapes);
    }

    public MergedShape(String uri, Shape[] shapes) {
	super(uri);
	setShapes(shapes);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public float getDistanceTo(Point other) {
	if (other == null)
	    throw new IllegalArgumentException();
	float dist = Float.MAX_VALUE;
	Shape[] shapes = getShapes();
	for (int i = 0; i < shapes.length; i++) {
	    float curdist;
	    if ((curdist = shapes[i].getDistanceTo(other)) < dist)
		dist = curdist;
	}
	return dist;
    }

    public Point getCenter() {
	Shape[] shapes = getShapes();
	float[] center = { 0, 0, 0 };
	for (int i = 0; i < shapes.length; i++) {
	    double[] c = shapes[i].getCenter().get3DCoordinates();
	    center[0] += c[0];
	    center[1] += c[1];
	    center[2] += c[2];
	}
	center[0] /= shapes.length;
	center[1] /= shapes.length;
	center[2] /= shapes.length;
	return new Point(center[0], center[1], center[2], shapes[0].getCenter()
		.getCoordinateSystem());
    }

    protected Shape computeBoundingVolume() {
	Shape[] shapes = getShapes();
	Shape[] bounds = new Shape[shapes.length];
	for (int i = 0; i < shapes.length; i++) {
	    bounds[i] = shapes[i].getBoundingVolume();
	}
	Shape vol = new MergedShape(bounds);
	setBoundingVolume(vol);
	return vol;
    }

    public boolean intersects(Point base, Point dir) {
	BooleanShape vol = (BooleanShape) getBoundingVolume();
	Shape[] shapes = vol.getShapes();
	for (int i = 0; i < shapes.length; i++) {
	    if (shapes[i].intersects(base, dir))
		return true;
	}
	return false;
    }

    public boolean contains(Point p) {
	BooleanShape vol = (BooleanShape) getBoundingVolume();
	Shape[] shapes = vol.getShapes();
	for (int i = 0; i < shapes.length; i++) {
	    if (shapes[i].contains(p))
		return true;
	}
	return false;
    }
}
