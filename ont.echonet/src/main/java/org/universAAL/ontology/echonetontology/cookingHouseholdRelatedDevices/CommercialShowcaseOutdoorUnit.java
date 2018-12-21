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
package org.universAAL.ontology.echonetontology.cookingHouseholdRelatedDevices;



import org.universAAL.ontology.echonetontology.EchonetOntology;
import org.universAAL.ontology.echonetontology.EchonetSuperDevice;
import org.universAAL.ontology.echonetontology.values.OperationModeSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;

public class CommercialShowcaseOutdoorUnit extends EchonetSuperDevice{
	
	public static final String MY_URI = EchonetOntology.NAMESPACE + "CommercialShowcaseOutdoorUnit";
	public static final String PROPERTY_HAS_OPERATION_MODE_SETTING= EchonetOntology.NAMESPACE + "hasOperationModeSetting";
	public static final String PROPERTY_HAS_GROUP_INFORMATION= EchonetOntology.NAMESPACE + "hasGroupInformation";
	public static final String PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS= EchonetOntology.NAMESPACE + "hasCompressorOperationStatus";
	public static final String PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE= EchonetOntology.NAMESPACE + "hasMeasuredOutDoorAirTemperature";
	public static final String PROPERTY_HAS_EXCEPTIONAL_STATUS= EchonetOntology.NAMESPACE + "hasExceptionalStatus";
	
	
	public OperationModeSettingValue getExceptionalStatus() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE);	
	}
	public void setExceptionalStatus(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE, msg);	
	}
	
	public Float getMeasuredOutDoorAirTemperature() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE);	
	}
	public void setMeasuredOutDoorAirTemperature(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE, msg);	
	}
	public OperationStatusValue getCompressorOperationStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS);	
	}
	public void setCompressorOperationStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS, msg);	
	}
	
	public String getGroupInformation() {
		return (String) getProperty(PROPERTY_HAS_GROUP_INFORMATION);	
	}
	public void setGroupInformation(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_GROUP_INFORMATION, msg);	
	}
	
	public OperationModeSettingValue getOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE_SETTING);	
	}
	public void setOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_MODE_SETTING, msg);	
	}
	

	
	public CommercialShowcaseOutdoorUnit() {
		super();
	}
	public CommercialShowcaseOutdoorUnit(String uri) {
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
