/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut f�r Graphische Datenverarbeitung 
	
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
package org.universAAL.ontology.location;

import org.universAAL.middleware.owl.Restriction;

import org.universAAL.ontology.shape.Path;
import org.universAAL.ontology.shape.Shape;

/**
 * 
 * @author chwirth
 *
 */

public class Way extends Place {

	public static final String MY_URI;

	static {
		MY_URI = uAAL_LOCATION_NAMESPACE + "Way";
		register(Way.class);
	}

	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (PROP_HAS_SHAPE.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					Path.MY_URI,1, 0);
		return Location.getClassRestrictionsOnProperty(propURI);
	}

	/**
	 * Creates a Wayobject
	 * @param uri the object URI
	 */
	public Way(String uri) {
		super(uri);
	}

	/**
	 * Creates a Way object
	 */
	public Way() {
		super();
	}

	/**
	 * Creates a Way object
	 * @param uri this value can also be a null object
	 * @param name The way name. A null object is not allowed
	 */
	public Way(String uri, String name) {
		super(uri,name);
	}
	
	public Way(String uri,String name,Shape shape) {
		super(uri,name,shape);
	}
	
	public Way(String uri,Shape shape) {
		super(uri,shape);
	}

	/**
	 * Returns a human readable description on the essence of this ontology class.
	 */
	public static String getRDFSComment() {
		return "A way.";
	}

	/**
	 * Returns a label with which this ontology class can be introduced to human users.
	 */
	public static String getRDFSLabel() {
		return "Way";
	}

}
