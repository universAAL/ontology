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
package org.universAAL.ontology.location.indoor;

import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.shape.Shape;

/**
 * Ontological representation of a stairway connecting levels. Methods included
 * in this class are the mandatory ones for representing an ontological concept
 * in Java classes for uAAL. Usually it includes getters and setters for most of
 * its properties.
 * 
 */
public class StairWay extends IndoorPlace {

    public static final String MY_URI = LocationOntology.NAMESPACE + "StairWay";
    public static final String PROP_FROM_LEVEL = LocationOntology.NAMESPACE + "toLevel";
    public static final String PROP_TO_LEVEL = LocationOntology.NAMESPACE + "fromLevel";

    /**
     * Creates a StairWay object
     * 
     * @param uri
     *            the object URI
     */
    public StairWay(String uri) {
	super(uri);
    }

    /**
     * Creates a StairWay object
     */
    public StairWay() {
	super();
    }

    /**
     * Creates a StairWay object
     * 
     * @param uri
     *            this value can also be a null object
     * @param name
     *            The place name. A null object is not allowed
     * @param from
     *            the lower level
     * @param to
     *            the upper level
     */
    public StairWay(String uri, String name, BuildingLevel from,
	    BuildingLevel to) {
	super(uri, name);
	props.put(PROP_FROM_LEVEL, from);
	props.put(PROP_TO_LEVEL, to);
    }

    public StairWay(String uri, String name, Shape shape, BuildingLevel from,
	    BuildingLevel to) {
	super(uri, name, shape);
	props.put(PROP_FROM_LEVEL, from);
	props.put(PROP_TO_LEVEL, to);
    }

    public StairWay(String uri, Shape shape, BuildingLevel from,
	    BuildingLevel to) {
	super(uri, shape);
	props.put(PROP_FROM_LEVEL, from);
	props.put(PROP_TO_LEVEL, to);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public BuildingLevel getFromLevel() {
	return (BuildingLevel) props.get(PROP_FROM_LEVEL);
    }

    public void setFromLevel(BuildingLevel level) {
	if (level == null)
	    throw new IllegalArgumentException();
	props.put(PROP_FROM_LEVEL, level);
    }

    public BuildingLevel getToLevel() {
	return (BuildingLevel) props.get(PROP_TO_LEVEL);
    }

    public void setToLevel(BuildingLevel level) {
	if (level == null)
	    throw new IllegalArgumentException();
	props.put(PROP_TO_LEVEL, level);
    }

    public int getPropSerializationType(String propURI) {
	if (super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL)
	    return super.getPropSerializationType(propURI);
	if (PROP_FROM_LEVEL.equals(propURI) || PROP_TO_LEVEL.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }
}
