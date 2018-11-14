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
package org.universAAL.ontology.echonetontology.airconditionerRelatedDevices;

import org.universAAL.ontology.echonetontology.EchonetOntology;
import org.universAAL.ontology.echonetontology.EchonetSuperDevice;
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;
import org.universAAL.ontology.echonetontology.values.ThresholdLevelValue;

public class VentilationFan extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "VentilationFan";
	public static final String PROPERTY_HAS_VENTILATION_AUTO_SETTING = EchonetOntology.NAMESPACE + "hasVentilationAutoSetting";
	public static final String PROPERTY_HAS_VALUE_OF_VENTILATION_AIR_FLOW_RATE = EchonetOntology.NAMESPACE + "hasValueOfVentilationAirFlowRate";
	
	public ThresholdLevelValue getVentilationAirFlowRate() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_VALUE_OF_VENTILATION_AIR_FLOW_RATE);
	}
	public void setVentilationAirFlowRate(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VALUE_OF_VENTILATION_AIR_FLOW_RATE, msg);
	}
	public OperationStatusValue getVentilationAutoSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_VENTILATION_AUTO_SETTING);
	}
	public void setVentilationAutoSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VENTILATION_AUTO_SETTING, msg);
	}
	public VentilationFan() {
		super();
	}
	public VentilationFan(String uri) {
		super(uri);
	}
	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	public boolean isWellFormed() {
		return true;
	}
	

}
