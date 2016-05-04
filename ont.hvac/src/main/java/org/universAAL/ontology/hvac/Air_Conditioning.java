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

/**
 * Class for All Air Conditioning systems. Where an Air Conditioning is defined as a system that is capable of cooling the air in a room.
 * @author Ricardo
 */
public class Air_Conditioning extends Target_Temperature {
	public static final String MY_URI = HvacOntology.NAMESPACE
			+ "Air_Conditioning";
	public static final String PROP_HAS_AIR_CONDITIONING_MODE = HvacOntology.NAMESPACE
			+ "hasAir_Conditioning_Mode";

	public Air_Conditioning() {
		super();
	}

	public Air_Conditioning(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {

		return true && hasProperty(PROP_HAS_STATUSVALUE);

	}

	public Air_Conditioning_Mode getAir_Conditioning_Mode() {
		return (Air_Conditioning_Mode) getProperty(PROP_HAS_AIR_CONDITIONING_MODE);
	}

	public boolean setMode(Air_Conditioning_Mode air_conditioning_Mode) {
		return changeProperty(PROP_HAS_AIR_CONDITIONING_MODE,
				air_conditioning_Mode);

	}

}