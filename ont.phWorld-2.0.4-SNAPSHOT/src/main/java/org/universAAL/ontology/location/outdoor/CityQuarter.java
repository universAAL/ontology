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
 * Ontological representation of a city quarter or neighborhood. Methods
 * included in this class are the mandatory ones for representing an ontological
 * concept in Java classes for uAAL. Usually it includes getters and setters for
 * most of its properties.
 * 
 */
public class CityQuarter extends OutdoorPlace {

    public static final String MY_URI = LocationOntology.NAMESPACE + "CityQuarter";

    /**
     * Creates a CityQuarter object
     * 
     * @param uri
     *            the object URI
     */
    public CityQuarter(String uri) {
	super(uri);
    }

    /**
     * Creates a CityQuarter object
     */
    public CityQuarter() {
	super();
    }

    /**
     * Creates a CityQuarter object
     * 
     * @param uri
     *            this value can also be a null object
     * @param name
     *            The place name. A null object is not allowed
     */
    public CityQuarter(String uri, String name) {
	super(uri, name);
    }

    public CityQuarter(String uri, String name, Shape shape) {
	super(uri, name, shape);
    }

    public CityQuarter(String uri, Shape shape) {
	super(uri, shape);
    }

    public String getClassURI() {
	return MY_URI;
    }
}
