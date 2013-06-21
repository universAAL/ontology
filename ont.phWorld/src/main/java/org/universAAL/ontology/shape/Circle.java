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

import org.universAAL.ontology.location.position.CoordinateSystem;
import org.universAAL.ontology.location.position.Point;

/**
 * Ontological representation of a circle shape. Methods included in this class
 * are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author chwirth
 * 
 */

public class Circle extends Ellipse {

    public static final String MY_URI = ShapeOntology.NAMESPACE + "Circle";

    /**
     * Creates a Circle object
     * 
     * @param uri
     *            the object URI
     */
    public Circle(String uri) {
	super(uri);
    }

    /**
     * Creates a Circle object
     */
    public Circle() {
	super();
    }

    /**
     * @param uri
     * @param radius
     * @param system
     *            the local coordinate system
     */
    public Circle(String uri, double radius, CoordinateSystem system) {
	super(uri, radius * 2, radius * 2, system);
    }

    public Circle(double radius, CoordinateSystem system) {
	super(radius * 2, radius * 2, system);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public double getRadius() {
	return getMajorAxisLength() / 2.0d;
    }

    public void setRadius(double radius) {
	setMajorAxisLength(radius * 2);
	setMinorAxisLength(radius * 2);
    }

    public float getDistanceTo(Point point) {
	return (float) (point.getDistanceTo(getCenter()) - getRadius());
    }
}
