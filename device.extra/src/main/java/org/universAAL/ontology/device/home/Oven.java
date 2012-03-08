/*
	Copyright 2008-2010 R&S Info, http://www.rsinfo.eu
	R&S INFO s.r.l. 
	
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
package org.universAAL.ontology.device.home;

import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.OnOffActuator;

/**
 * Ontological representation of an oven appliance. Methods included in this
 * class are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author amoretti
 * 
 */
public class Oven extends OnOffActuator {
    
    /** Class URI */
    public static final String MY_URI = Device.uAAL_DEVICE_NAMESPACE + "Oven";

    public Oven() {
	super();
    }

    public Oven(String uri) {
	super(uri);
    }

    public Oven(String uri, Boolean isOn) {
	super(uri);

	if (isOn == null)
	    throw new IllegalArgumentException();

	props.put(PROP_STATUS, isOn);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public boolean isWellFormed() {
	return true;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

}
