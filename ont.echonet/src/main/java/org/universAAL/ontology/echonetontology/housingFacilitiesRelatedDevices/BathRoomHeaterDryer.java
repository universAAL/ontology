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
import org.universAAL.ontology.echonetontology.values.OccurenceStatusValue;
import org.universAAL.ontology.echonetontology.values.OperationModeSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;
import org.universAAL.ontology.echonetontology.values.ThresholdLevelValue;

public class BathRoomHeaterDryer extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "BathRoomHeaterDryer";
	public static final String PROPERTY_HAS_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "hasOperationModeSetting";
	public static final String PROPERTY_HAS_VENTILATION_OPERATION_SETTING = EchonetOntology.NAMESPACE + "hasVentilationOperationSetting";
	public static final String PROPERTY_HAS_BATHROOM_PRE_WARM_OPERATION_SETTING = EchonetOntology.NAMESPACE + "hasBathroomPreWarmOperationSetting";
	public static final String PROPERTY_HAS_BATHROOM_HEATER_OPERATION_SETTING = EchonetOntology.NAMESPACE + "hasBathroomHeaterOperationSetting";
	public static final String PROPERTY_HAS_BATHROOM_DRYER_OPERATION_SETTING = EchonetOntology.NAMESPACE + "hasBathroomDryerOperationSetting";
	public static final String PROPERTY_HAS_BATHROOM_AIR_CICURLATOR_OPERATION_SETTING = EchonetOntology.NAMESPACE + "hasBathroomAirCirculatorOperationSetting";
	public static final String PROPERTY_HAS_MEASURED_BATHROOM_RELATIVE_HUMIDITY = EchonetOntology.NAMESPACE + "hasMeasuredBathroomHumidity";
	public static final String PROPERTY_HAS_MEASURED_BATHROOM_TEMPERATURE = EchonetOntology.NAMESPACE + "hasMeasuredBathroomTemperature";
	public static final String PROPERTY_HAS_VENTILATION_AIR_FLOW_RATE_SETTING = EchonetOntology.NAMESPACE + "hasVentilationAirFlowRateSetting";
	public static final String PROPERTY_HAS_FILTER_CLEANING_REMINDER_SIGN_SETTING = EchonetOntology.NAMESPACE + "hasFilterCleaningReminderSignSetting";
	public static final String PROPERTY_HAS_HUMAN_BODY_DETECTION_STATUS = EchonetOntology.NAMESPACE + "hasHumanBodyDetectionStatus";
	public static final String PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_1 = EchonetOntology.NAMESPACE + "hasOnTimerBasedReservationSetting1";
	public static final String PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_2 = EchonetOntology.NAMESPACE + "hasOnTimerBasedReservationSetting2";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_TIME = EchonetOntology.NAMESPACE + "hasOnTimerSettingTime";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME = EchonetOntology.NAMESPACE + "hasOnTimerSettingRelativeTime";
	public static final String PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING = EchonetOntology.NAMESPACE + "hasOffTimerBasedReservationSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING_TIME = EchonetOntology.NAMESPACE + "hasOffTimerSettingTime";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME = EchonetOntology.NAMESPACE + "hasOffTimerSettingRelativeTime";
	
	public String getOffTimerSettingRelativeTime() {
		return  getProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME).toString();	
	}
	public void setOffTimerSettingRelativeTime(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public String getOffTimerSettingTime() {
		return  getProperty(PROPERTY_HAS_OFF_TIMER_SETTING_TIME).toString();	
	}
	public void setOffTimerSettingTime(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING_TIME, msg);	
	}
	public OperationModeSettingValue getOffTimerBasedReservationSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING);	
	}
	public void setOffTimerBasedReservationSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING, msg);	
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
	public OperationModeSettingValue getOnTimerBasedReservationSetting2() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_2);	
	}
	public void setOnTimerBasedReservationSetting2(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_2, msg);	
	}
	public OperationStatusValue getOnTimerBasedReservationSetting1() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_1);	
	}
	public void setOnTimerBasedReservationSetting1(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_1, msg);	
	}
	public OccurenceStatusValue getHumanBodyDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_HUMAN_BODY_DETECTION_STATUS);	
	}
	public void setHumanBodyDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HUMAN_BODY_DETECTION_STATUS, msg);	
	}
	public OccurenceStatusValue getFilterCleaningReminderSignSetting() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_FILTER_CLEANING_REMINDER_SIGN_SETTING);	
	}
	public void setFilterCleaningReminderSignSetting(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FILTER_CLEANING_REMINDER_SIGN_SETTING, msg);	
	}
	public ThresholdLevelValue getVentilationAirFlowRateSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_VENTILATION_AIR_FLOW_RATE_SETTING);	
	}
	public void setVentilationAirFlowRateSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VENTILATION_AIR_FLOW_RATE_SETTING, msg);	
	}
	public Integer getMeasuredBathroomTemperature() {
		return (Integer) getProperty(PROPERTY_HAS_MEASURED_BATHROOM_TEMPERATURE);	
	}
	public void setMeasuredBathroomTemperature(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_BATHROOM_TEMPERATURE, msg);	
	}
	public Integer getMeasuredBathroomHumidity() {
		return (Integer) getProperty(PROPERTY_HAS_MEASURED_BATHROOM_RELATIVE_HUMIDITY);	
	}
	public void setMeasuredBathroomHumidity(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_BATHROOM_RELATIVE_HUMIDITY, msg);	
	}
	public ThresholdLevelValue getBathroomAirCirculatorOperationSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_BATHROOM_AIR_CICURLATOR_OPERATION_SETTING);	
	}
	public void setBathroomAirCirculatorOperationSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATHROOM_AIR_CICURLATOR_OPERATION_SETTING, msg);	
	}
	public ThresholdLevelValue getBathroomDryerOperationSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_BATHROOM_DRYER_OPERATION_SETTING);	
	}
	public void setBathroomDryerOperationSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATHROOM_DRYER_OPERATION_SETTING, msg);	
	}
	public ThresholdLevelValue getBathroomHeaterOperationSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_BATHROOM_HEATER_OPERATION_SETTING);	
	}
	public void setBathroomHeaterOperationSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATHROOM_HEATER_OPERATION_SETTING, msg);	
	}
	public ThresholdLevelValue getBathroomPreWarmOperationSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_BATHROOM_PRE_WARM_OPERATION_SETTING);	
	}
	public void setBathroomPreWarmOperationSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATHROOM_PRE_WARM_OPERATION_SETTING, msg);	
	}
	public ThresholdLevelValue getVentilationOperationSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_VENTILATION_OPERATION_SETTING);	
	}
	public void setVentilationOperationSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VENTILATION_OPERATION_SETTING, msg);	
	}
	public OperationModeSettingValue getOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE_SETTING);	
	}
	public void setOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_MODE_SETTING, msg);	
	}
	
	
	
	public BathRoomHeaterDryer() {
		super();
	}
	public BathRoomHeaterDryer(String uri) {
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
