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
 * Ontological representation of a tri-dimensional shape. Methods included in
 * this class are the mandatory ones for representing an ontological concept in
 * Java classes for uAAL. Usually it includes getters and setters for most of
 * its properties.
 * 
 * @author chwirth
 * 
 */

public abstract class Shape3D extends Shape {

    public static final String MY_URI = ShapeOntology.NAMESPACE + "Shape3D";

    public static final String PROP_2D_REPRESENTATION = ShapeOntology.NAMESPACE + "2DReperesentation";

    /**
     * Creates a Shape object
     * 
     * @param uri
     *            the object URI
     */
    public Shape3D(String uri) {
	super(uri);
    }

    /**
     * Creates a Shape object
     */
    public Shape3D() {
	super();
    }

    /**
     * Creates a Shape object
     * 
     * @param uri
     *            this value can also be a null object
     * @param pointRep
     *            The place name. A null object is not allowed
     * @param system
     *            the local coordinate system
     */
    public Shape3D(String uri, Point pointRep, CoordinateSystem system) {
	super(uri, pointRep, system);
    }

    /**
     * Creates a Shape object
     * 
     * @param pointRep
     *            a single point representing the shape
     * @param system
     *            the local coordinate system
     */
    public Shape3D(Point pointRep, CoordinateSystem system) {
	super(pointRep, system);
    }

    /**
     * Creates a Shape object
     * 
     * @param system
     *            the local coordinate system
     */
    public Shape3D(CoordinateSystem system) {
	super(system);
    }

    /**
     * Creates a Shape object
     * 
     * @param uri
     *            identifier for the shape
     * @param system
     *            the local coordinate system
     */
    public Shape3D(String uri, CoordinateSystem system) {
	super(uri, system);
    }

    public String getClassURI() {
	return MY_URI;
    }

    /**
     * @return a projected 2d representation of the object, if the property was
     *         set
     */
    public Shape2D get2DRepresentation() {
	Shape2D p = (Shape2D) props.get(PROP_2D_REPRESENTATION);
	return p;
    }

    public void set2DRepresentation(Shape2D shape) {
	if (shape == null)
	    throw new IllegalArgumentException();
	props.put(PROP_2D_REPRESENTATION, shape);
    }

    public void remove2DRepresentation() {
	props.remove(PROP_2D_REPRESENTATION);
    }

    public int getPropSerializationType(String propURI) {
	if (super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL)
	    return super.getPropSerializationType(propURI);
	if (PROP_2D_REPRESENTATION.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }
}
