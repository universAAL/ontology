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

package org.universAAL.ontology.powersocketadapter;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Ontological enumeration of possible powersocket adapter types. Currently empty. Methods
 * included in this class are the mandatory ones for representing an ontological
 * enumeration in Java classes for uAAL.
 * 
 * @author Steeven Zeiss
 * @since 26.11.2009
 * 
 */
public abstract class WindowType extends ManagedIndividual {
    public static final String MY_URI;
    static {
	MY_URI = WindowActuator.WINDOW_NAMESPACE + "windowType";
	register(WindowType.class);
    }

    public static String getRDFSComment() {
	return "The type of a window";
    }

    public static String getRDFSLabel() {
	return "Window Type";
    }

    protected WindowType(String uri) {
	super(uri);
    }
}
