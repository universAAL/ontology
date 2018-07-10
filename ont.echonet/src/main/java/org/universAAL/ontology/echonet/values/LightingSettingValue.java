/*******************************************************************************
 * Copyright 2018 PHAM Van Cu, Tan laboratory, Japan Advanced Institute of Science and Technology (JAIST),
 *  Japan as a part of the CARESSES project (http://www.caressesrobot.org/).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class LightingSettingValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "LightingSettingValue";
	public static final String PROPERTY_HAS_ILLUMINANCE_VALUE = EchonetOntology.NAMESPACE + "hasIlluminanceValue";
	public static final String PROPERTY_HAS_LIGHT_COLOR = EchonetOntology.NAMESPACE + "hasLightColor";

	public LightingSettingValue() {
		super();
	}
	public LightingSettingValue(String uri) {
		super(uri);
	}
	public LightingSettingValue(String uri, MeasuredValue illuminanceValue,ColorValue color ) {
		super(uri);
		setIlluminanceValue(illuminanceValue);
		setLightColor(color);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public MeasuredValue getIlluminanceValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_ILLUMINANCE_VALUE);
	}
	public void setIlluminanceValue(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_ILLUMINANCE_VALUE,msg);
	}
	public ColorValue getLightColor() {
		return (ColorValue) getProperty(PROPERTY_HAS_LIGHT_COLOR);
	}
	public void setLightColor(ColorValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_LIGHT_COLOR,msg);
	}
	public String getClassURI() {
		return MY_URI;
	}

}
