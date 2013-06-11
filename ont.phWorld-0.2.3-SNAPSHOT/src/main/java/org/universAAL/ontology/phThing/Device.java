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

package org.universAAL.ontology.phThing;

import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.owl.supply.LevelRating;
import org.universAAL.ontology.phThing.PhysicalThing;

/**
 * Represents the class of physical manufactured things that have some
 * capability. It adds no new property to physical things but just provides
 * means for explicit distinction of certain physical things as devices.
 * 
 * @author mtazari
 * 
 */
public class Device extends PhysicalThing {
    public static final String uAAL_DEVICE_NAMESPACE = uAAL_NAMESPACE_PREFIX
	    + "Device.owl#";
    public static final String MY_URI;
    public static final String PROP_BATTERY_LEVEL;
    static {
	MY_URI = uAAL_DEVICE_NAMESPACE + "Device";
	PROP_BATTERY_LEVEL = Device.uAAL_DEVICE_NAMESPACE + "batteryLevel";
	register(Device.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_BATTERY_LEVEL.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    LevelRating.MY_URI, 1, 0);
	return PhysicalThing.getClassRestrictionsOnProperty(propURI);
    }

    /**
     * Returns a human readable description on the essence of this ontology
     * class.
     */
    public static String getRDFSComment() {
	return "The root class for all devices in the uAAL ontology.";
    }

    /**
     * Returns a label with which this ontology class can be introduced to human
     * users.
     */
    public static String getRDFSLabel() {
	return "Device";
    }

    public Device() {
	super();
    }

    public Device(String uri) {
	super(uri);
    }

    public Device(String uriPrefix, int numProps) {
	super(uriPrefix, numProps);
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
