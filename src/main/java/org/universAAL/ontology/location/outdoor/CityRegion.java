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

import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.owl.Restriction;

import org.universAAL.ontology.shape.Shape;

/**
 * 
 * @author chwirth
 * 
 */

public class CityRegion extends OutdoorPlace {

    public static final String MY_URI;

    public static final String PROP_HAS_ZIP_CODE;

    static {
	MY_URI = uAAL_LOCATION_NAMESPACE + "CityRegion";
	PROP_HAS_ZIP_CODE = uAAL_LOCATION_NAMESPACE + "hasZIPCode";
	register(CityRegion.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_HAS_ZIP_CODE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 0);
	return OutdoorPlace.getClassRestrictionsOnProperty(propURI);
    }

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

    /**
     * Returns a human readable description on the essence of this ontology
     * class.
     */
    public static String getRDFSComment() {
	return "A class for a city region that can be described by a ZIP code.";
    }

    /**
     * Returns a label with which this ontology class can be introduced to human
     * users.
     */
    public static String getRDFSLabel() {
	return "CityRegion";
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
	props.put(PROP_HAS_ZIP_CODE, null);
    }

    public int getPropSerializationType(String propURI) {
	if (super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL)
	    return super.getPropSerializationType(propURI);
	if (PROP_HAS_ZIP_CODE.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = OutdoorPlace.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 1];
	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i] = PROP_HAS_ZIP_CODE;
	return toReturn;
    }

}
