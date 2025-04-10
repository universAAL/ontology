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

	public static final String PROP_BATTERY_LEVEL = PhThingOntology.NAMESPACE + "batteryLevel";
	public static final String PROP_CONNECTION_LEVEL = PhThingOntology.NAMESPACE + "connectionLevel";
	public static final String PROP_ERROR_MESSAGE = PhThingOntology.NAMESPACE + "errorMsg";
	public static final String PROP_STATUS_MESSAGE = PhThingOntology.NAMESPACE + "statusMsg";

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
		Object o = props.get(PROP_BATTERY_LEVEL);
		return (o instanceof LevelRating)?  (LevelRating) o : null;
	}

	public LevelRating getConnectionLevel() {
		Object o = props.get(PROP_CONNECTION_LEVEL);
		return (o instanceof LevelRating)?  (LevelRating) o : null;
	}
	
	public DeviceState getErrorMsg() {
		Object o = props.get(PROP_ERROR_MESSAGE);
		return (o instanceof DeviceState)?  (DeviceState) o : null;
	}
	
	public DeviceState getStatusMsg() {
		Object o = props.get(PROP_STATUS_MESSAGE);
		return (o instanceof DeviceState)?  (DeviceState) o : null;
	}

	public void setBatteryLevel(LevelRating value) {
		if (value != null)
			props.put(PROP_BATTERY_LEVEL, value);
	}

	public void setConnectionLevel(LevelRating value) {
		if (value != null)
			props.put(PROP_CONNECTION_LEVEL, value);
	}

	public void setErrorMsg(DeviceState value) {
		if (value != null)
			props.put(PROP_ERROR_MESSAGE, value);
	}

	public void setStatusMsg(DeviceState value) {
		if (value != null)
			props.put(PROP_STATUS_MESSAGE, value);
	}
}
