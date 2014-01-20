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

package org.universAAL.ontology.phThing;

import org.universAAL.middleware.owl.supply.LevelRating;

/**
 * Represents the class of physical manufactured things that have some
 * capability. It adds no new property to physical things but just provides
 * means for explicit distinction of certain physical things as devices.
 * 
 * @author mtazari
 * 
 */
public class Device extends PhysicalThing {

    public static final String MY_URI = PhThingOntology.NAMESPACE + "Device";

    public static final String PROP_BATTERY_LEVEL = PhThingOntology.NAMESPACE
	    + "batteryLevel";

    public Device() {
	super();
    }

    public Device(String uri) {
	super(uri);
    }

    public Device(String uriPrefix, int numProps) {
	super(uriPrefix, numProps);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    public LevelRating getBatteryLevel() {
	return (LevelRating) props.get(PROP_BATTERY_LEVEL);
    }

    public void setBatteryLevel(LevelRating value) {
	props.put(PROP_BATTERY_LEVEL, value);
    }
}
