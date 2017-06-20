/*******************************************************************************
 * Copyright 2017 2011 Universidad Politécnica de Madrid
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
package org.universAAL.ontology.device;

/**
 * @author amedrano
 * 
 */
public class ColorLightController extends ColorLightActuator {

	public static final String MY_URI = DeviceOntology.NAMESPACE
			+ "ColorLightController";

	/**
     * 
     */
	public ColorLightController() {
		super();
	}

	/**
	 * @param uri
	 */
	public ColorLightController(String uri) {
		super(uri);
	}

	/** {@inheritDoc} */
	public String getClassURI() {
		return MY_URI;
	}

	/** {@inheritDoc} */
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}

	/** {@inheritDoc} */
	public boolean isWellFormed() {
		return true && super.isWellFormed();
	}

	// TODO setters and getters for different colors.

}
