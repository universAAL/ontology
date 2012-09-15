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
package org.universAAL.ontology.location.indoor;

import org.universAAL.ontology.shape.Shape;

/**
 * Ontological representation of a staircase area in a house. Methods included
 * in this class are the mandatory ones for representing an ontological concept
 * in Java classes for uAAL. Usually it includes getters and setters for most of
 * its properties.
 * 
 */
public class StairCase extends IndoorPlace {

    public static final String MY_URI;

    static {
	MY_URI = uAAL_LOCATION_NAMESPACE + "StairCase";
    }

    /**
     * Creates a StairCase object
     * 
     * @param uri
     *            the object URI
     */
    public StairCase(String uri) {
	super(uri);
    }

    /**
     * Creates a StairCase object
     */
    public StairCase() {
	super();
    }

    /**
     * Creates a StairCase object
     * 
     * @param uri
     *            this value can also be a null object
     * @param name
     *            The place name. A null object is not allowed
     */
    public StairCase(String uri, String name) {
	super(uri, name);
    }

    public StairCase(String uri, String name, Shape shape) {
	super(uri, name, shape);
    }

    public StairCase(String uri, Shape shape) {
	super(uri, shape);
    }

    public String getClassURI() {
	return MY_URI;
    }
}
