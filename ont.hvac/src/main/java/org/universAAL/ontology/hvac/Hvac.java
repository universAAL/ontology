/*******************************************************************************
 * Copyright 2015 UPM - Universidad Politécnica de Madrid
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.hvac;

import org.universAAL.middleware.owl.supply.LevelRating;
import org.universAAL.ontology.device.DeviceOntology;
import org.universAAL.ontology.phThing.Device;

/**
 * HVAC stands for Heather,Ventilation and Air Conditioning, in this class are
 * defined the different properties that can find in any {@link Hvac} system.
 * 
 * @author Ricardo
 */
public abstract class Hvac extends Device {

	public static final String MY_URI = HvacOntology.NAMESPACE + "Hvac";

	/**
	 * Has ventilation function.
	 */
	public static final String PROP_HAS_FAN = HvacOntology.NAMESPACE + "hasFan";

	/**
	 * The status of a device, on or off.
	 */
	public static final String PROP_HAS_STATUSVALUE = DeviceOntology.NAMESPACE
			+ "hasStatusValue";

	/**
	 * The setting to change the direction of the air.
	 */
	public static final String PROP_HAS_SWING = HvacOntology.NAMESPACE
			+ "hasSwing";

	public Hvac() {
		super();
	}

	public Hvac(String uri) {
		super(uri);
	}

	public Hvac(String uriPrefix, int numProps) {
		super(uriPrefix, numProps);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

}
