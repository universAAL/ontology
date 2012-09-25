/*	
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut für Graphische Datenverarbeitung 
	
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
package org.universAAL.reasoner.ont;

import org.universAAL.middleware.owl.ManagedIndividual;

public class Persistent extends ManagedIndividual {
    public static final String MY_URI = ReasoningOntology.NAMESPACE
	    + "Persistent";
    public static final String PROP_PERSISTENT = ReasoningOntology.NAMESPACE
	    + "saveIt";

    public Persistent() {
	super();
	setPersistent(true);
    }

    public Persistent(String uri) {
	super(uri);
	setPersistent(true);
    }

    public Persistent(boolean saveIt) {
	this();
	setPersistent(saveIt);
    }

    public Persistent(String uri, boolean saveIt) {
	this(uri);
	setPersistent(saveIt);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return hasProperty(PROP_PERSISTENT);
    }

    public boolean isPersistent() {
	return ((Boolean) getProperty(PROP_PERSISTENT)).booleanValue();
    }

    public void setPersistent(boolean saveIt) {
	changeProperty(PROP_PERSISTENT, new Boolean(saveIt));
    }
}
