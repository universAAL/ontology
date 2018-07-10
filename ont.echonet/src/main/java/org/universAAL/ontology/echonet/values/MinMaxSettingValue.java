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

public class MinMaxSettingValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "MinMaxSettingValue";
	public static final String PROPERTY_HAS_MIN_VALUE = EchonetOntology.NAMESPACE + "hasMinValue";
	public static final String PROPERTY_HAS_MAX_VALUE = EchonetOntology.NAMESPACE + "hasMaxValue";

	public MinMaxSettingValue() {
		super();
	}
	public MinMaxSettingValue(String uri) {
		super(uri);
	}
	public MinMaxSettingValue(String uri, MeasuredValue minValue,MeasuredValue maxValue) {
		super(uri);
		setMinValue(minValue);
		setMaxValue(maxValue);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}
	public MeasuredValue getMinValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MIN_VALUE);
	}
	public void setMinValue(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_MIN_VALUE,msg);
	}
	public MeasuredValue getMaxValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MAX_VALUE);
	}
	public void setMaxValue(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_MAX_VALUE,msg);
	}

	public String getClassURI() {
		return MY_URI;
	}

}
