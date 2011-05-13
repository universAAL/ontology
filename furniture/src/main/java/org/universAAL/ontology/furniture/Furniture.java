/*
	Copyright 2008-20104 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut fuer Gtaphische Datenverarbeitung 
	
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
package org.universAAL.ontology.furniture;

import org.universAAL.middleware.owl.Restriction;

import org.universAAL.ontology.phThing.PhysicalThing;
import org.universAAL.ontology.shape.Shape;

/**
 * Ontological representation of any furniture. Methods included in this class
 * are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 */
public class Furniture extends PhysicalThing {
    public static final String MY_URI;
    public static final String PERSONA_FURNITURE_NAMESPACE = uAAL_NAMESPACE_PREFIX
	    + "Furniture.owl#";
    public static final String PROP_FURNITURE_TYPE;

    static {
	MY_URI = PERSONA_FURNITURE_NAMESPACE + "Table";
	PROP_FURNITURE_TYPE = PERSONA_FURNITURE_NAMESPACE + "FurnitureType";
	register(Furniture.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_FURNITURE_TYPE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    FurnitureType.MY_URI, 1, 0);
	return PhysicalThing.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = PhysicalThing.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 1];
	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i] = PROP_FURNITURE_TYPE;
	return toReturn;
    }

    public Furniture() {
    }

    public Furniture(String uri) {
	super(uri);
    }

    public Furniture(String uri, FurnitureType type) {
	super(uri);
	setFurnitureType(type);
    }

    public Furniture(String uri, FurnitureType type, Shape shape) {
	super(uri);
	setShape(shape);
	setFurnitureType(type);
    }

    public static String getRDFSComment() {
	return "A furniture";
    }

    public static String getRDFSLabel() {
	return "Table";
    }

    public boolean isWellFormed() {
	return true;
    }

    public FurnitureType getFurnitureType() {
	return (FurnitureType) props.get(PROP_FURNITURE_TYPE);
    }

    public void setFurnitureType(FurnitureType function) {
	if (function == null)
	    throw new IllegalArgumentException();
	props.put(PROP_FURNITURE_TYPE, function);
    }

    public void clearFurnitureType() {
	props.put(PROP_FURNITURE_TYPE, null);
    }

    public int getPropSerializationType(String propURI) {
	if (super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL)
	    return super.getPropSerializationType(propURI);
	if (PROP_FURNITURE_TYPE.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }

}
