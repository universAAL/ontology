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

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Superclass for the different modes of HVAC, include
 * {@link Air_Conditioning_Mode}, {@link Heating_Mode} and
 * {@link Ventilation_Mode}.
 * 
 * @author Ricardo
 */
public class Mode extends ManagedIndividual {
	public static final String MY_URI = HvacOntology.NAMESPACE + "Mode";

	protected static final String[] tipo = { "Air_Conditioning_Mode",
			"Heating_Mode", "Ventilation_Mode" };

	public Mode() {
		super();
	}

	public Mode(String uriPrefix, int numProps) {
		super(uriPrefix, numProps);
	}

	public Mode(String names) {
		super(names);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}

}