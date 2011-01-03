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

import org.universAAL.middleware.owl.Restriction;

import org.universAAL.ontology.location.position.CoordinateSystem;
import org.universAAL.ontology.location.position.Point;

/**
 * 
 * @author chwirth
 *
 */

public abstract class Shape3D extends Shape {
	
	public static final String MY_URI;
	
	public static final String PROP_2D_REPRESENTATION;
	
	static {
		MY_URI = uAAL_SHAPE_NAMESPACE + "Shape3D";
		PROP_2D_REPRESENTATION = uAAL_SHAPE_NAMESPACE + "2DReperesentation";
		register(Shape3D.class);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (PROP_2D_REPRESENTATION.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					Shape2D.MY_URI,1, 0);
		return Shape.getClassRestrictionsOnProperty(propURI);
	}
	
	/**
	 * Creates a Shape object
	 * @param uri the object URI
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
	 * @param uri this value can also be a null object
	 * @param name The place name. A null object is not allowed
	 * @param system the local coordinate system
	 */
	public Shape3D(String uri, Point pointRep,CoordinateSystem system) {
		super(uri,pointRep,system);
	}
	
	/**
	 * Creates a Shape object
	 * @param name a single point representing the shape
	 * @param system the local coordinate system
	 */
	public Shape3D(Point pointRep,CoordinateSystem system) {
		super(pointRep,system);
	}
	
	/**
	 * Creates a Shape object
	 * @param system the local coordinate system
	 */
	public Shape3D(CoordinateSystem system) {
		super(system);
	}
	
	/**
	 * Creates a Shape object
	 * @param the identifier for the shape
	 * @param system the local coordinate system
	 */
	public Shape3D(String uri,CoordinateSystem system) {
		super(uri,system);
	}
	
	/**
	 * Returns a human readable description on the essence of this ontology class.
	 */
	public static String getRDFSComment() {
		return "The root class for all 3d shapes.";
	}
	
	/**
	 * Returns a label with which this ontology class can be introduced to human users.
	 */
	public static String getRDFSLabel() {
		return "Shape3D";
	}
	
	/**
	 * @return a projected 2d representation of the object, if the property was set
	 */
	public Shape2D get2DRepresentation() {
		Shape2D p = (Shape2D)props.get(PROP_2D_REPRESENTATION);
		return p;
	}
		
	public void set2DRepresentation(Shape2D shape) {
		if(shape==null) throw new IllegalArgumentException();
		props.put(PROP_2D_REPRESENTATION, shape);
	}
	
	public void remove2DRepresentation() {
		props.put(PROP_2D_REPRESENTATION, null);
	}
		
	public int getPropSerializationType(String propURI) {
		if(super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL) return super.getPropSerializationType(propURI);
		if (PROP_2D_REPRESENTATION.equals(propURI))
				return PROP_SERIALIZATION_REDUCED;
		
		return PROP_SERIALIZATION_OPTIONAL;
	}
	
	public static String[] getStandardPropertyURIs() {
		String[] inherited = Shape.getStandardPropertyURIs();
		String[] toReturn = new String[inherited.length+1];
		int i = 0;
		while (i < inherited.length) {
			toReturn[i] = inherited[i];
			i++;
		}
		toReturn[i] = PROP_2D_REPRESENTATION;
		return toReturn;
	}
	
}
