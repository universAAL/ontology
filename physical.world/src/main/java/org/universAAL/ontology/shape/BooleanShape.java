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
import org.universAAL.ontology.shape.Shape;

/**
 * 
 * @author chwirth
 *
 */

public abstract class BooleanShape extends Shape {

	public static final String MY_URI;

	public static final String PROP_SHAPES;

	static {
		MY_URI = uAAL_SHAPE_NAMESPACE + "BooleanShape";
		PROP_SHAPES = uAAL_SHAPE_NAMESPACE + "Shapes";
		register(BooleanShape.class);
	}

	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (PROP_SHAPES.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					Point.MY_URI,0, 2);
		return Shape3D.getClassRestrictionsOnProperty(propURI);
	}

	/**
	 * Creates a Polygon object
	 * @param uri the object URI
	 */
	public BooleanShape(String uri) {
		super(uri);
	}

	/**
	 * Creates a Polygon object
	 */
	public BooleanShape() {
		super();
	}

	/**
	 * Creates a Polygon object
	 * @param uri this value can also be a null object
	 * @param shapes an array of all shapes
	 */
	public BooleanShape(String uri, Shape[] shapes) {
		super(uri);
		setShapes(shapes);
	}

	/**
	 * Returns a human readable description on the essence of this ontology class.
	 */
	public static String getRDFSComment() {
		return "A boolean shape: Merge, Intersect or Substract.";
	}

	/**
	 * Returns a label with which this ontology class can be introduced to human users.
	 */
	public static String getRDFSLabel() {
		return "BooleanShape";
	}

	public Shape[] getShapes() {
		Object[] o = ((Vector)props.get(PROP_SHAPES)).toArray();
		Shape p[] = new Shape[o.length];
		for(int i=0;i<o.length;i++) p[i] = (Shape)o[i];
		return p; 
	}

	public void setShapes(Shape[] shapes) {
		if(shapes==null || shapes.length<2) throw new IllegalArgumentException();
		Vector vmapper = new Vector();
		for(int i=0;i<shapes.length;i++) vmapper.add(shapes[i]);
		props.put(PROP_SHAPES, vmapper);
	}

	public int getPropSerializationType(String propURI) {
		if(super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL) return super.getPropSerializationType(propURI);
		if (PROP_SHAPES.equals(propURI))
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
		toReturn[i] = PROP_SHAPES;
		return toReturn;
	}

}
