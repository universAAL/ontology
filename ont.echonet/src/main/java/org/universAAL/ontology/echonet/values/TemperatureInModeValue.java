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

public class TemperatureInModeValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "TemperatureInModeValue";
	public static final String PROPERTY_HAS_OPERATION_MODE = EchonetOntology.NAMESPACE + "hasOperationMode";
	public static final String PROPERTY_HAS_TEMPERATURE_LEVEL_SETTING = EchonetOntology.NAMESPACE + "hasTemperatureLevelSetting";
	public TemperatureInModeValue(String uri) {
		super(uri);	
	}
	public TemperatureInModeValue() {
		super();	
	}
	public TemperatureInModeValue(String uri,OperationModeSettingValue operationMode, ThresholdLevelValue temperatureLevel) {
		super(uri);	
		setTemperatureLevelSetting(temperatureLevel);
		setOperationMode(operationMode);
	}
	public void setTemperatureLevelSetting(ThresholdLevelValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_TEMPERATURE_LEVEL_SETTING, msg);
	} 
	public ThresholdLevelValue getTemperatureLevelSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_TEMPERATURE_LEVEL_SETTING);
	}
	public void setOperationMode(OperationModeSettingValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_OPERATION_MODE, msg);
	} 
	public OperationModeSettingValue getOperationMode() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE);
	}
	public String getClassURI() {
		return MY_URI;
	}
	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}
}
