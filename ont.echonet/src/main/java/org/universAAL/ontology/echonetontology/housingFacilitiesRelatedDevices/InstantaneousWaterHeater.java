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
package org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices;


import org.universAAL.ontology.echonetontology.EchonetOntology;
import org.universAAL.ontology.echonetontology.EchonetSuperDevice;
import org.universAAL.ontology.echonetontology.values.OperationStateSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;
import org.universAAL.ontology.echonetontology.values.ThresholdLevelValue;

public class InstantaneousWaterHeater extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "InstantaneousWaterHeater";
	public static final String PROPERTY_HAS_HOT_WATER_HEATING_STATUS = EchonetOntology.NAMESPACE + "hasHotWaterHeatingStatus";
	public static final String PROPERTY_HAS_HOT_WATER_TEMPERATURE_SETTING = EchonetOntology.NAMESPACE + "hasHotWaterTemperatureSetting";
	public static final String PROPERTY_HAS_HOT_WATER_WARMER_SETTING = EchonetOntology.NAMESPACE + "hasHotWaterWarmerSetting";
	public static final String PROPERTY_HAS_DURATION_OF_AUTOMATIC_OPERATION_SETTING = EchonetOntology.NAMESPACE + "hasDurationOfAutomaticOperationSetting";
	public static final String PROPERTY_HAS_REMAINING_AUTOMATIC_OPERATION_TIME = EchonetOntology.NAMESPACE + "hasRemainingAutomaticOperationTime";
	public static final String PROPERTY_HAS_BATH_TEMPERATURE_SETTING = EchonetOntology.NAMESPACE + "hasBathTemperatureSetting";
	public static final String PROPERTY_HAS_BATH_WATER_HEATER_STATUS = EchonetOntology.NAMESPACE + "hasBathWaterHeaterStatus";
	public static final String PROPERTY_HAS_BATH_AUTO_MODE_SETTING = EchonetOntology.NAMESPACE + "hasBathAutoModeSetting";
	public static final String PROPERTY_HAS_BATH_ADDITIONAL_BOILUP_OPERATION_SETTING = EchonetOntology.NAMESPACE + "hasBathAdditionalBoilUpOpeartionSetting";
	public static final String PROPERTY_HAS_BATH_HOT_WATER_ADDING_OPERATION_SETTING = EchonetOntology.NAMESPACE + "hasBathHotWaterAddingOpeartionSetting";
	public static final String PROPERTY_HAS_BATH_WATER_LOWERING_OPERATION_SETTING = EchonetOntology.NAMESPACE + "hasBathWaterLoweringOpeartionSetting";	
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_1 = EchonetOntology.NAMESPACE + "hasBathWaterVolumeSetting1";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_2 = EchonetOntology.NAMESPACE + "hasBathWaterVolumeSetting2";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_3 = EchonetOntology.NAMESPACE + "hasBathWaterVolumeSetting3";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4 = EchonetOntology.NAMESPACE + "hasBathWaterVolumeSetting4";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETTABLE_LEVEL = EchonetOntology.NAMESPACE + "hasBathWaterVolumeSetting4MaximumSettableLevel";
	public static final String PROPERTY_HAS_BATHROOM_PRIORITY_SETTING = EchonetOntology.NAMESPACE + "hasBathroomPrioritySetting";
	public static final String PROPERTY_HAS_SHOWER_HOT_WATER_SUPPLY_STATUS = EchonetOntology.NAMESPACE + "hasShowerHotWaterSupplyStatus";
	public static final String PROPERTY_HAS_KITCHEN_HOT_WATER_SUPPLY_STATUS = EchonetOntology.NAMESPACE + "hasKitchenHotWaterSupplyStatus";	
	public static final String PROPERTY_HAS_WATER_WARMER_ON_TIMER_RESERVATION_SETTING = EchonetOntology.NAMESPACE + "hasWaterWarmerOnTimerReservationSetting";
	public static final String PROPERTY_HAS_WATER_WARMER_ON_TIMER_SETTING_TIME = EchonetOntology.NAMESPACE + "hasWaterWarmerOnTimerSettingTime";
	public static final String PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR = EchonetOntology.NAMESPACE + "hasBathOperationStatusMonitor";
	public static final String PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING = EchonetOntology.NAMESPACE + "hasOnTimerReservationSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_TIME = EchonetOntology.NAMESPACE + "hasOnTimerSettingTime";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME = EchonetOntology.NAMESPACE + "hasOnTimerSettingRelativeTime";
	public static final String PROPERTY_HAS_VOLUME_SETTING = EchonetOntology.NAMESPACE + "hasVolumeSetting";
	public static final String PROPERTY_HAS_MUTE_SETTING = EchonetOntology.NAMESPACE + "hasMuteSetting";
	
	public OperationStatusValue getMuteSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_MUTE_SETTING);	
	}
	public void setMuteSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MUTE_SETTING, msg);	
	}
	public Integer getVolumeSetting() {
		return (Integer) getProperty(PROPERTY_HAS_VOLUME_SETTING);	
	}
	public void setVolumeSetting(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VOLUME_SETTING, msg);	
	}
	public String getOnTimerSettingRelativeTime() {
		return  getProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).toString();	
	}
	public void setOnTimerSettingRelativeTime(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public String getOnTimerSettingTime() {
		return  getProperty(PROPERTY_HAS_ON_TIMER_SETTING_TIME).toString();	
	}
	public void setOnTimerSettingTime(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING_TIME, msg);	
	}
	public OperationStatusValue getOnTimerReservationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING);	
	}
	public void setOnTimerReservationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING, msg);	
	}
	public OperationStateSettingValue getBathOperationStatusMonitor() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR);	
	}
	public void setBathOperationStatusMonitor(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR, msg);	
	}
	
	public OperationStatusValue getWaterWarmerOnTimerReservationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_WATER_WARMER_ON_TIMER_RESERVATION_SETTING);	
	}
	public void setWaterWarmerOnTimerReservationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_WARMER_ON_TIMER_RESERVATION_SETTING, msg);	
	}
	public String getWaterWarmerOnTimerSettingTime() {
		return  getProperty(PROPERTY_HAS_WATER_WARMER_ON_TIMER_SETTING_TIME).toString();	
	}
	public void setWaterWarmerOnTimerSettingTime(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_WARMER_ON_TIMER_SETTING_TIME, msg);	
	}
	public OperationStatusValue getKitchenHotWaterSupplyStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_KITCHEN_HOT_WATER_SUPPLY_STATUS);	
	}
	public void setKitchenHotWaterSupplyStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_KITCHEN_HOT_WATER_SUPPLY_STATUS, msg);	
	}
	public OperationStatusValue getShowerHotWaterSupplyStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_SHOWER_HOT_WATER_SUPPLY_STATUS);	
	}
	public void setShowerHotWaterSupplyStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SHOWER_HOT_WATER_SUPPLY_STATUS, msg);	
	}
	public OperationStatusValue getBathroomPrioritySetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_BATHROOM_PRIORITY_SETTING);	
	}
	public void setBathroomPrioritySetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATHROOM_PRIORITY_SETTING, msg);	
	}

	public Integer getBathWaterVolumeSetting4MaximumSettableLevel() {
		return (Integer) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETTABLE_LEVEL);	
	}
	public void setBathWaterVolumeSetting4MaximumSettableLevel(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETTABLE_LEVEL, msg);	
	}
	public Integer getBathWaterVolumeSetting4() {
		return (Integer) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4);	
	}
	public void setBathWaterVolumeSetting4(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4, msg);	
	}
	public Integer getBathWaterVolumeSetting3() {
		return (Integer) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_3);	
	}
	public void setBathWaterVolumeSetting3(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_3, msg);	
	}
	public ThresholdLevelValue getBathWaterVolumeSetting2() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_2);	
	}
	public void setBathWaterVolumeSetting2(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_2, msg);	
	}	
	public Integer getBathWaterVolumeSetting1() {
		return (Integer) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_1);	
	}
	public void setBathWaterVolumeSetting1(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_1, msg);	
	}
	
	public OperationStatusValue getBathWaterLoweringOpeartionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_BATH_WATER_LOWERING_OPERATION_SETTING);	
	}
	public void setBathWaterLoweringOpeartionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_LOWERING_OPERATION_SETTING, msg);	
	}
	public OperationStatusValue getBathHotWaterAddingOpeartionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_BATH_HOT_WATER_ADDING_OPERATION_SETTING);	
	}
	public void setBathHotWaterAddingOpeartionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_HOT_WATER_ADDING_OPERATION_SETTING, msg);	
	}
	public OperationStatusValue getBathAdditionalBoilUpOpeartionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_BATH_ADDITIONAL_BOILUP_OPERATION_SETTING);	
	}
	public void setBathAdditionalBoilUpOpeartionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_ADDITIONAL_BOILUP_OPERATION_SETTING, msg);	
	}
	public OperationStatusValue getBathAutoModeSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_BATH_AUTO_MODE_SETTING);	
	}
	public void setBathAutoModeSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_AUTO_MODE_SETTING, msg);	
	}
	public OperationStatusValue getBathWaterHeaterStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_BATH_WATER_HEATER_STATUS);	
	}
	public void setBathWaterHeaterStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_HEATER_STATUS, msg);	
	}
	public Integer getBathTemperatureSetting() {
		return (Integer) getProperty(PROPERTY_HAS_BATH_TEMPERATURE_SETTING);	
	}
	public void setBathTemperatureSetting(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_TEMPERATURE_SETTING, msg);	
	}
	public String getRemainingAutomaticOperationTime() {
		return  getProperty(PROPERTY_HAS_REMAINING_AUTOMATIC_OPERATION_TIME).toString();	
	}
	public void setRemainingAutomaticOperationTime(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_AUTOMATIC_OPERATION_TIME, msg);	
	}
	public String getDurationOfAutomaticOperationSetting() {
		return  getProperty(PROPERTY_HAS_DURATION_OF_AUTOMATIC_OPERATION_SETTING).toString();	
	}
	public void setDurationOfAutomaticOperationSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DURATION_OF_AUTOMATIC_OPERATION_SETTING, msg);	
	}
	public OperationStatusValue getHotWaterWarmerSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_HOT_WATER_WARMER_SETTING);	
	}
	public void setHotWaterWarmerSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HOT_WATER_WARMER_SETTING, msg);	
	}
	public Integer getHotWaterTemperatureSetting() {
		return (Integer) getProperty(PROPERTY_HAS_HOT_WATER_TEMPERATURE_SETTING);	
	}
	public void setHotWaterTemperatureSetting(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HOT_WATER_TEMPERATURE_SETTING, msg);	
	}
	public OperationStatusValue getHotWaterHeatingStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_HOT_WATER_HEATING_STATUS);	
	}
	public void setHotWaterHeatingStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HOT_WATER_HEATING_STATUS, msg);	
	}	
	
	public InstantaneousWaterHeater() {
		super();
	}
	public InstantaneousWaterHeater(String uri) {
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
