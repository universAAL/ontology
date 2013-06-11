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
package org.universAAL.ontology.location.outdoor;

import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.shape.Shape;

/**
 * Ontological representation of a country as a generic outdoor place. Methods
 * included in this class are the mandatory ones for representing an ontological
 * concept in Java classes for uAAL. Usually it includes getters and setters for
 * most of its properties.
 * 
 */
public class Country extends OutdoorPlace {

    public static final String MY_URI = LocationOntology.NAMESPACE + "Country";

    /**
     * Creates a Country object
     * 
     * @param uri
     *            the object URI
     */
    public Country(String uri) {
	super(uri);
    }

    /**
     * Creates a Country object
     */
    public Country() {
	super();
    }

    /**
     * Creates a Country object
     * 
     * @param uri
     *            this value can also be a null object
     * @param name
     *            The place name. A null object is not allowed
     */
    public Country(String uri, String name) {
	super(uri, name);
    }

    public Country(String uri, String name, Shape shape) {
	super(uri, name, shape);
    }

    public Country(String uri, Shape shape) {
	super(uri, shape);
    }

    public String getClassURI() {
	return MY_URI;
    }
}
