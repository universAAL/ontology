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
package org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class ElectricHotWaterPot extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ElectricHotWaterPot";
	public static final String PROPERTY_HAS_COVER_OPEN_CLOSE_STATUS= EchonetOntology.NAMESPACE + "hasCoverOpenCloseStatus";
	public static final String PROPERTY_HAS_NO_WATER_WARNING = EchonetOntology.NAMESPACE + "hasNoWaterWarning";
	public static final String PROPERTY_HAS_BOIL_UP_SETTING = EchonetOntology.NAMESPACE + "hasBoilUpSetting";
	public static final String PROPERTY_HAS_BOIL_UP_WARMER_MODE_SETTING = EchonetOntology.NAMESPACE + "hasBoilUpWarmerModeSetting";
	public static final String PROPERTY_HAS_WARMER_TEMPERATURE_SETTING_VALUE = EchonetOntology.NAMESPACE + "hasWarmerTemperatureSettingValue";
	public static final String PROPERTY_HAS_HOT_WATER_DISCHARGE_STATUS = EchonetOntology.NAMESPACE + "hasHotWaterDischargeStatus";
	public static final String PROPERTY_HAS_LOCK_STATUS = EchonetOntology.NAMESPACE + "hasLockStatus";
	
	public OperationStateSettingValue getLockStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_LOCK_STATUS);	
	}
	public void setLockStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LOCK_STATUS, msg);	
	}
	public OperationStatusValue getHotWaterDischargeStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_HOT_WATER_DISCHARGE_STATUS);	
	}
	public void setHotWaterDischargeStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HOT_WATER_DISCHARGE_STATUS, msg);	
	}
	public MeasuredValue getWarmerTemperatureSettingValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_WARMER_TEMPERATURE_SETTING_VALUE);	
	}
	public void setWarmerTemperatureSettingValue(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WARMER_TEMPERATURE_SETTING_VALUE, msg);	
	}
	public OperationModeSettingValue getBoilUpWarmerModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_BOIL_UP_WARMER_MODE_SETTING);	
	}
	public void setBoilUpWarmerModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BOIL_UP_WARMER_MODE_SETTING, msg);	
	}
	public OperationStatusValue getBoilUpSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_BOIL_UP_SETTING);	
	}
	public void setBoilUpSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BOIL_UP_SETTING, msg);	
	}
	public OccurenceStatusValue getNoWaterWarning() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_NO_WATER_WARNING);	
	}
	public void setNoWaterWarning(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NO_WATER_WARNING, msg);	
	}
	public OperationStateSettingValue getCoverOpenCloseStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_COVER_OPEN_CLOSE_STATUS);	
	}
	public void setCoverOpenCloseStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_COVER_OPEN_CLOSE_STATUS, msg);	
	}

	public ElectricHotWaterPot() {
		super();
	}
	public ElectricHotWaterPot(String uri) {
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
