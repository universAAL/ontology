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

package org.universAAL.ontology.powersocket;

import org.universAAL.ontology.location.Location;
import org.universAAL.ontology.phThing.Device;

/**
 * Ontological representation of a power socket. Methods included in this class
 * are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author Steeven Zeiss
 * @author Carsten Stockloew
 * @since 26.11.2009
 */
public class Powersocket extends Device {

    public static final String MY_URI;
    public static final String PROP_SOCKET_VALUE;

    static {
	MY_URI = PowersocketOntology.NAMESPACE + "Powersocket";
	PROP_SOCKET_VALUE = PowersocketOntology.NAMESPACE + "socketValue";
    }

    public Powersocket() {
	super();
    }

    public Powersocket(String uri) {
	super(uri);
    }

    public Powersocket(String uri, Location loc) {
	super(uri);
	if (loc == null)
	    throw new IllegalArgumentException();

	props.put(PROP_SOCKET_VALUE, new Integer(0));
	setLocation(loc);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getValue() {
	Integer i = (Integer) props.get(PROP_SOCKET_VALUE);
	return (i == null) ? -1 : i.intValue();
    }

    public void setValue(int percentage) {
	if (percentage > -1 && percentage < 101)
	    props.put(PROP_SOCKET_VALUE, new Integer(percentage));
    }

    /**
     * @see org.universAAL.middleware.owl.ManagedIndividual#getPropSerializationType
     *      (java.lang.String)
     */
    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    /** @see org.universAAL.middleware.owl.ManagedIndividual#isWellFormed() */
    public boolean isWellFormed() {
	return props.containsKey(PROP_SOCKET_VALUE);
    }
}
