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
package org.universAAL.ontology.powersocket;

import org.universAAL.ontology.location.Location;

/**
 * Ontological representation of a switchable (on/off) power socket (do not
 * mistake with On Off Actuator). Methods included in this class are the
 * mandatory ones for representing an ontological concept in Java classes for
 * uAAL. Usually it includes getters and setters for most of its properties.
 * 
 * @author
 * @author Carsten Stockloew
 */
public class SwitchableSocket extends Powersocket {

    public static final String MY_URI = PowersocketOntology.NAMESPACE
	    + "dimmableSocket";

    public SwitchableSocket() {
	super();
    }

    public SwitchableSocket(String uri) {
	super(uri);
    }

    public SwitchableSocket(String uri, Location loc) {
	super(uri, loc);
	setValue(0);
    }

    public String getClassURI() {
	return MY_URI;
    }
}
