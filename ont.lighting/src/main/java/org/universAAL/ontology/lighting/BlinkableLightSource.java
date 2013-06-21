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

package org.universAAL.ontology.lighting;

import org.universAAL.ontology.location.Location;

/**
 * Ontological representation of a blinkable light source. Methods included in
 * this class are the mandatory ones for representing an ontological concept in
 * Java classes for uAAL. Usually it includes getters and setters for most of
 * its properties.
 * 
 * @author mtazari
 * 
 */
public class BlinkableLightSource extends LightSource {
    public static final String MY_URI = LightingOntology.NAMESPACE
	    + "BlinkableLightSource";
    public static final String PROP_BLINKING_STATE = LightingOntology.NAMESPACE
	    + "blinkingState";

    public BlinkableLightSource() {
	super();
    }

    public BlinkableLightSource(String uri) {
	super(uri);
    }

    /** @see org.universAAL.middleware.owl.ManagedIndividual#getClassURI() */
    public String getClassURI() {
	return MY_URI;
    }

    public BlinkableLightSource(String uri, LightType type, Location loc) {
	super(uri, type, loc);
	props.put(PROP_BLINKING_STATE, Boolean.FALSE);
    }

    public boolean isBlinking() {
	return ((Boolean) props.get(PROP_BLINKING_STATE)).booleanValue();
    }

    public boolean isWellFormed() {
	return props.containsKey(PROP_BLINKING_STATE) && super.isWellFormed();
    }

    public void setBlinkingState(boolean state) {
	props.put(PROP_BLINKING_STATE, Boolean.valueOf(state));
    }
}
