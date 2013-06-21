/*
	Copyright 2008-20104 Fraunhofer IGD, http://www.igd.fraunhofer.de
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
package org.universAAL.ontology.furniture;

import org.universAAL.ontology.phThing.PhysicalThing;
import org.universAAL.ontology.shape.Shape;

/**
 * Ontological representation of any furniture. Methods included in this class
 * are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author Carsten Stockloew
 */
public class Furniture extends PhysicalThing {
    public static final String MY_URI = FurnitureOntology.NAMESPACE
	    + "Furniture";
    public static final String PROP_FURNITURE_TYPE = FurnitureOntology.NAMESPACE
	    + "FurnitureType";

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

    public String getClassURI() {
	return MY_URI;
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
	props.remove(PROP_FURNITURE_TYPE);
    }

    public int getPropSerializationType(String propURI) {
	if (super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL)
	    return super.getPropSerializationType(propURI);
	if (PROP_FURNITURE_TYPE.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }
}
