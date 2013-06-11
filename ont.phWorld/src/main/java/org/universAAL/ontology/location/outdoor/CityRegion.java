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
 * Ontological representation of a region in which a city is divided. Methods
 * included in this class are the mandatory ones for representing an ontological
 * concept in Java classes for uAAL. Usually it includes getters and setters for
 * most of its properties.
 * 
 * @author chwirth
 * 
 */

public class CityRegion extends OutdoorPlace {

    public static final String MY_URI = LocationOntology.NAMESPACE + "CityRegion";

    public static final String PROP_HAS_ZIP_CODE = LocationOntology.NAMESPACE
	    + "hasZIPCode";

    /**
     * Creates a CityRegion object
     * 
     * @param uri
     *            the object URI
     */
    public CityRegion(String uri) {
	super(uri);
    }

    /**
     * Creates a CityRegion object
     */
    public CityRegion() {
	super();
    }

    /**
     * Creates a CityRegion object
     * 
     * @param uri
     *            this value can also be a null object
     * @param name
     *            The place name. A null object is not allowed
     */
    public CityRegion(String uri, String name) {
	super(uri, name);
    }

    public CityRegion(String uri, String name, Shape shape) {
	super(uri, name, shape);
    }

    public CityRegion(String uri, Shape shape) {
	super(uri, shape);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public String getZIPCode() {
	return (String) props.get(PROP_HAS_ZIP_CODE);
    }

    public void setZIPCode(String zipcode) {
	if (zipcode == null)
	    throw new IllegalArgumentException();
	props.put(PROP_HAS_ZIP_CODE, zipcode);
    }

    public void removeShape() {
	props.remove(PROP_HAS_ZIP_CODE);
    }

    public int getPropSerializationType(String propURI) {
	if (super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL)
	    return super.getPropSerializationType(propURI);
	if (PROP_HAS_ZIP_CODE.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }
}
