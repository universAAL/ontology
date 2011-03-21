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

public class switchableSocket extends Powersocket {

    public static final String POWERSOCKET_NAMESPACE = "http://ontology.persona.ima.igd.fhg.de/Powersocket.owl#";
    public static final String MY_URI;

    static {
	MY_URI = POWERSOCKET_NAMESPACE + "dimmableSocket";
	register(Powersocket.class);
    }

    public static String[] getStandardPropertyURIs() {
	return new String[] { PROP_SOCKET_VALUE, PROP_SOCKET_LOCATION };
    }

    public static String getRDFSComment() {
	return "The class of all dimmable powersockets.";
    }

    public static String getRDFSLabel() {
	return "dimmablePowersocket";
    }

    public switchableSocket() {
	super();
    }

    public switchableSocket(String uri) {
	super(uri);
    }

    public switchableSocket(String uri, Location loc) {
	super(uri);
	if (loc == null)
	    throw new IllegalArgumentException();

	// TODO
	setLocation(loc);

	props.put(PROP_SOCKET_VALUE, new Integer(0));
	props.put(PROP_SOCKET_LOCATION, loc);
    }
}
