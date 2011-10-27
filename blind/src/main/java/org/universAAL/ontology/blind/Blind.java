/*
	Copyright 2008-2010 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute of Computer Graphics Research 
	
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

package org.universAAL.ontology.blind;

import org.universAAL.ontology.BlindOntology;
import org.universAAL.ontology.location.Location;
import org.universAAL.ontology.phThing.Device;

/**
 * Ontological representation of a blind as a device. Methods included in this
 * class are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author Steeven Zeiss
 * @author Carsten Stockloew
 * @since 26.11.2009
 * 
 */
public class Blind extends Device {

    public static final String MY_URI;
    public static final String PROP_BLIND_STATUS;

    static {
	MY_URI = BlindOntology.NAMESPACE + "Blind";
	PROP_BLIND_STATUS = BlindOntology.NAMESPACE + "blindStatus";
    }

    // if (PROP_HAS_TYPE.equals(propURI))
    // return Restriction.getAllValuesRestrictionWithCardinality(propURI,
    // NaturalLight.sunShine.MY_URI, 1, 1);

    public Blind() {
	super();
    }

    public Blind(String uri) {
	super(uri);
    }

    public Blind(String uri, Location loc) {
	super(uri);
	if (loc == null)
	    throw new NullPointerException("Location must be not null");

	setLocation(loc);
	// props.put(PROP_HAS_TYPE, NaturalLight.sunShine.getType());
	props.put(PROP_BLIND_STATUS, new Integer(0));
    }

    public String getClassURI() {
	return MY_URI;
    }

    // public String getBlindType() {
    // return (String) props.get(PROP_HAS_TYPE);
    // }

    /**
     * Set the status.
     * 
     * @param status
     *            The status as integer between 0 an 100 (incl.).
     */
    public void setStatus(int status) {
	if (status < 0 || status > 100)
	    throw new IllegalArgumentException(
		    "The status must be between 0 and 100");
	props.put(PROP_BLIND_STATUS, new Integer(status));
    }

    /**
     * Get the current status.
     * 
     * @return The status, or null if status is not set.
     */
    public Integer getStatus() {
	return (Integer) props.get(PROP_BLIND_STATUS);
    }

    /**
     * @see org.universAAL.middleware.rdf.Resource#isWellFormed()
     */
    public boolean isWellFormed() {
	return props.containsKey(PROP_PHYSICAL_LOCATION)
		&& props.containsKey(PROP_BLIND_STATUS);
    }
}
