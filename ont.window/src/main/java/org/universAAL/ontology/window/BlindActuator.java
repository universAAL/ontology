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

package org.universAAL.ontology.window;

import org.universAAL.ontology.WindowOntology;
import org.universAAL.ontology.phThing.DimmerActuator;

/**
 * Ontological representation of a blind as a device. Methods included in this
 * class are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author Steeven Zeiss
 * @author Carsten Stockloew
 * @since 26.11.2009
 */
public class BlindActuator extends DimmerActuator {

    public static final String MY_URI;
    public static final String PROP_IN_WINDOW;

    static {
	MY_URI = WindowOntology.NAMESPACE + "BlindActuator";
	PROP_IN_WINDOW = WindowOntology.NAMESPACE + "inWindow";
    }

    public BlindActuator() {
    }

    public BlindActuator(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }
}
