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
package org.universAAL.ontology.location.outdoor;

import org.universAAL.ontology.shape.Shape;

public class CityPlace extends OutdoorPlace {

    public static final String MY_URI;

    static {
	MY_URI = uAAL_LOCATION_NAMESPACE + "CityPlace";
	register(CityPlace.class);
    }

    /**
     * Creates a CityPlace object
     * 
     * @param uri
     *            the object URI
     */
    public CityPlace(String uri) {
	super(uri);
    }

    /**
     * Creates a CityPlace object
     */
    public CityPlace() {
	super();
    }

    /**
     * Creates a CityPlace object
     * 
     * @param uri
     *            this value can also be a null object
     * @param name
     *            The place name. A null object is not allowed
     */
    public CityPlace(String uri, String name) {
	super(uri, name);
    }

    public CityPlace(String uri, String name, Shape shape) {
	super(uri, name, shape);
    }

    public CityPlace(String uri, Shape shape) {
	super(uri, shape);
    }

    /**
     * Returns a human readable description on the essence of this ontology
     * class.
     */
    public static String getRDFSComment() {
	return "A place in a city.";
    }

    /**
     * Returns a label with which this ontology class can be introduced to human
     * users.
     */
    public static String getRDFSLabel() {
	return "CityPlace";
    }
}
