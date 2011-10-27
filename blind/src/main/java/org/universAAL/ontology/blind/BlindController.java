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

import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.BlindOntology;

/**
 * Ontological service that controls a blind. Methods included in this class are
 * the mandatory ones for representing an ontological service in Java classes
 * for uAAL.
 * 
 * @author Steeven Zeiss
 * @author Carsten Stockloew
 * @since 26.11.2009
 */
public class BlindController extends Service {// Lighting {
    public static final String MY_URI;
    public static final String PROP_CONTROLS;

    static {
	MY_URI = BlindOntology.NAMESPACE + "BlindController";
	PROP_CONTROLS = BlindOntology.NAMESPACE + "controls";
    }

    public BlindController() {
	super();
    }

    public BlindController(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    /**
     * @see org.persona.ontology.ManagedIndividual#getPropSerializationType(java.
     *      lang.String)
     */
    public int getPropSerializationType(String propURI) {
	return PROP_CONTROLS.equals(propURI) ? PROP_SERIALIZATION_FULL
		: PROP_SERIALIZATION_OPTIONAL;
    }
}
