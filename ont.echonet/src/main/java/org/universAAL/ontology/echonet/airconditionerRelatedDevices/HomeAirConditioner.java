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
package org.universAAL.ontology.echonet.airconditionerRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.AirFlowDirectionSettingValue;
import org.universAAL.ontology.echonet.values.AirconditionerComponentOperationStatus;
import org.universAAL.ontology.echonet.values.DateTimeValue;
import org.universAAL.ontology.echonet.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.MountedAirCleaningPurifyingMethodValue;
import org.universAAL.ontology.echonet.values.MountedAirRefreshingMethodValue;
import org.universAAL.ontology.echonet.values.MountedAirSelfCleaningMethodValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.RatedPowerConsumptionInModeValue;
import org.universAAL.ontology.echonet.values.ThermostatSettingOverrideFunctionValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class HomeAirConditioner extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "HomeAirConditioner";
	public static final String PROPERTY_HAS_OPERATION_POWER_SAVING_MODE = EchonetOntology.NAMESPACE + "hasOperationPowerSavingMode";
	public static final String PROPERTY_HAS_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "hasOperationModeSetting";
	public static final String PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING = EchonetOntology.NAMESPACE + "hasAutomaticTemperatureControlSetting";
	public static final String PROPERTY_HAS_TYPE_OF_OPERATION_SETTING = EchonetOntology.NAMESPACE + "hasTypeOfOperationSetting";
	public static final String PROPERTY_HAS_CURRENT_SETTING_OF_TEMPERATURE = EchonetOntology.NAMESPACE + "hasCurrentSettingOfTemperature";
	public static final String PROPERTY_HAS_RELATIVE_HUMIDITY_IN_DEHUMIDIFICATION_MODE = EchonetOntology.NAMESPACE + "hasRelativeHumidityInDehumidificationMode";
	public static final String PROPERTY_HAS_SETTING_TEMPERATURE_IN_COOLING_MODE = EchonetOntology.NAMESPACE + "hasSettingTemperatureInCoolingMode";
	public static final String PROPERTY_HAS_SETTING_TEMPERATURE_IN_HEATING_MODE = EchonetOntology.NAMESPACE + "hasSettingTemperatureInHeatingMode";
	public static final String PROPERTY_HAS_SETTING_TEMPERATURE_IN_DEHUMIDICATION_MODE = EchonetOntology.NAMESPACE + "hasSettingTemperatureInDehumidificationMode";
	public static final String PROPERTY_HAS_RATED_POWER_CONSUMPTION_IN_MODES = EchonetOntology.NAMESPACE + "hasRatedPowerConsumptionInModes";
	public static final String PROPERTY_HAS_MEASURED_CURRENT_CONSUMPTION = EchonetOntology.NAMESPACE + "hasMeasuredCurrentConsumption";
	public static final String PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY = EchonetOntology.NAMESPACE + "hasMeasuredRoomHumidity";
	public static final String PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE = EchonetOntology.NAMESPACE + "hasMeasuredRoomTemperature";
	public static final String PROPERTY_HAS_CURRENT_TEMPERATER_SETTING_OF_REMOTE_CONTROL = EchonetOntology.NAMESPACE + "hasCurrentTemperatureSettingOfRemoteControl";
	public static final String PROPERTY_HAS_MEASURED_COOLED_AIR_TEMPERATURE = EchonetOntology.NAMESPACE + "hasMeasuredCooledAirTemperature";
	public static final String PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE = EchonetOntology.NAMESPACE + "hasMeasuredOutdoorAirTemperature";
	public static final String PROPERTY_HAS_RELATIVE_TEMPERATURE_SETTING = EchonetOntology.NAMESPACE + "hasRelativeTemperatureSetting";
	public static final String PROPERTY_HAS_AIR_FLOW_RATE_SETTING = EchonetOntology.NAMESPACE + "hasAirFlowRateSetting";
	public static final String PROPERTY_HAS_AUTOMATIC_CONTROL_OF_AIR_FLOW_DIRECTION_SETTING = EchonetOntology.NAMESPACE + "hasAutomacticControlOfAirFlowDirectionSetting";
	public static final String PROPERTY_HAS_AUTOMATIC_SWING_OF_AIR_FLOW_SETTING = EchonetOntology.NAMESPACE + "hasAutomacticSwingOfAirFlowSetting";
	public static final String PROPERTY_HAS_AIRFLOW_VERTICAL_DIRECTION_SETTING = EchonetOntology.NAMESPACE + "hasAirFlowVerticalDirectionSetting";
	public static final String PROPERTY_HAS_AIRFLOW_HORIZONTAL_DIRECTION_SETTING = EchonetOntology.NAMESPACE + "hasAirFlowHorizontalDirectionSetting";
	public static final String PROPERTY_HAS_SPECIAL_STATE = EchonetOntology.NAMESPACE + "hasSpecialState";
	public static final String PROPERTY_HAS_NON_PRIORITY_STATE = EchonetOntology.NAMESPACE + "hasNonPriorityState";
	public static final String PROPERTY_HAS_VENTILATION_FUNCTION_SETTING = EchonetOntology.NAMESPACE + "hasVentilationFunctionSetting";
	public static final String PROPERTY_HAS_HUMIDIFIER_FUNCTION_SETTING = EchonetOntology.NAMESPACE + "hasHumidifierFunctionSetting";
	public static final String PROPERTY_HAS_VENTILATION_AIR_FLOW_RATE_SETTING = EchonetOntology.NAMESPACE + "hasVentilationAirFlowRateSetting";
	public static final String PROPERTY_HAS_DEGREE_OF_HUMIDIFICATION_SETTING = EchonetOntology.NAMESPACE + "hasDegreeOfHumidificationSetting";
	public static final String PROPERTY_HAS_MOUNTED_AIR_CLEANING_METHOD = EchonetOntology.NAMESPACE + "hasMountedAirCleaningMethod";
	public static final String PROPERTY_HAS_MOUNTED_AIR_PURIFIER_FUNCTION_SETTING= EchonetOntology.NAMESPACE + "hasMountedAirPurifierFunctionSetting";
	public static final String PROPERTY_HAS_MOUNTED_AIR_REFRESH_METHOD= EchonetOntology.NAMESPACE + "hasMountedAirRefreshMethod";
	public static final String PROPERTY_HAS_MOUNTED_AIR_REFRESHER_FUNCTION_SETTING= EchonetOntology.NAMESPACE + "hasMountedAirRefresherFunctionSetting";
	public static final String PROPERTY_HAS_MOUNTED_SELF_CLEANING_METHOD= EchonetOntology.NAMESPACE + "hasMountedSelfCleaningMethod";
	public static final String PROPERTY_HAS_MOUNTED_SELF_CLEANING_FUNCTION_SETTING= EchonetOntology.NAMESPACE + "hasMountedSelfCleaningFunctionSetting";
	public static final String PROPERTY_HAS_SPECIAL_FUNCTION_SETTING= EchonetOntology.NAMESPACE + "hasSpecialFunctionSetting";
	public static final String PROPERTY_HAS_OPERATION_STATUS_OF_COMPONENTS= EchonetOntology.NAMESPACE + "hasOperationStatusOfComponents";
	public static final String PROPERTY_HAS_THERMOSTAT_SETTING_OVERRIDE_FUNCTION= EchonetOntology.NAMESPACE + "hasThermostatSettingOverrideFunction";
	public static final String PROPERTY_HAS_AIR_PURIFICATION_MODE_SETTING= EchonetOntology.NAMESPACE + "hasPurificationModeSetting";
	public static final String PROPERTY_HAS_BUZZER= EchonetOntology.NAMESPACE + "hasBuzzer";
	public static final String PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING= EchonetOntology.NAMESPACE + "hasONTimerBasedReservationSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_TIME= EchonetOntology.NAMESPACE + "hasONTimerTimeSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME= EchonetOntology.NAMESPACE + "hasONTimerRelativeTimeSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING= EchonetOntology.NAMESPACE + "hasOFFTimerBasedReservationSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING_TIME= EchonetOntology.NAMESPACE + "hasOFFTimerTimeSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME= EchonetOntology.NAMESPACE + "hasOFFTimerRelativeTimeSetting";
	
	public HomeAirConditioner() {
		super();
	}
	public HomeAirConditioner(String uri) {
		super(uri);
	}

	public DateTimeValue getOFFTimerRelativeTimeSetting() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME);	
	}
	public void setOFFTimerRelativeTimeSetting(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public DateTimeValue getOFFTimerTimeSetting() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_OFF_TIMER_SETTING_TIME);	
	}
	public void setOFFTimerTimeSetting(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING_TIME, msg);	
	}
	public OperationModeSettingValue getOFFTimerBasedReservationSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING);	
	}
	public void setOFFTimerBasedReservationSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING, msg);	
	}
	public DateTimeValue getONTimerRelativeTimeSetting() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME);	
	}
	public void setONTimerRelativeTimeSetting(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public DateTimeValue getONTimerTimeSetting() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_ON_TIMER_SETTING_TIME);	
	}
	public void setONTimerTimeSetting(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING_TIME, msg);	
	}
	public OperationModeSettingValue getONTimerBasedReservationSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING);	
	}
	public void setONTimerBasedReservationSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING, msg);	
	}
	public OperationStatusValue getPurificationModeSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_AIR_PURIFICATION_MODE_SETTING);	
	}
	public void setPurificationModeSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AIR_PURIFICATION_MODE_SETTING, msg);	
	}
	public ThermostatSettingOverrideFunctionValue getThermostatSettingOverrideFunction() {
		return (ThermostatSettingOverrideFunctionValue) getProperty(PROPERTY_HAS_THERMOSTAT_SETTING_OVERRIDE_FUNCTION);	
	}
	public void setThermostatSettingOverrideFunction(ThermostatSettingOverrideFunctionValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_THERMOSTAT_SETTING_OVERRIDE_FUNCTION, msg);	
	}
	public AirconditionerComponentOperationStatus getOperationStatusOfComponents() {
		return (AirconditionerComponentOperationStatus) getProperty(PROPERTY_HAS_OPERATION_STATUS_OF_COMPONENTS);	
	}
	public void setOperationStatusOfComponents(AirconditionerComponentOperationStatus msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_STATUS_OF_COMPONENTS, msg);	
	}
	public OperationFunctionSettingValue getSpecialFunctionSetting() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_SPECIAL_FUNCTION_SETTING);	
	}
	public void setSpecialFunctionSetting(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPECIAL_FUNCTION_SETTING, msg);	
	}
	public MountedAirSelfCleaningMethodValue getMountedSelfCleaningFunctionSetting() {
		return (MountedAirSelfCleaningMethodValue) getProperty(PROPERTY_HAS_MOUNTED_SELF_CLEANING_FUNCTION_SETTING);	
	}
	public void setMountedSelfCleaningFunctionSetting(MountedAirSelfCleaningMethodValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MOUNTED_SELF_CLEANING_FUNCTION_SETTING, msg);	
	}
	public MountedAirSelfCleaningMethodValue getMountedSelfCleaningMethod() {
		return (MountedAirSelfCleaningMethodValue) getProperty(PROPERTY_HAS_MOUNTED_SELF_CLEANING_METHOD);	
	}
	public void setMountedSelfCleaningMethod(MountedAirSelfCleaningMethodValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MOUNTED_SELF_CLEANING_METHOD, msg);	
	}
	
	public MountedAirRefreshingMethodValue getMountedAirRefresherFunctionSetting() {
		return (MountedAirRefreshingMethodValue) getProperty(PROPERTY_HAS_MOUNTED_AIR_REFRESHER_FUNCTION_SETTING);	
	}
	public void setMountedAirRefresherFunctionSetting(MountedAirRefreshingMethodValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MOUNTED_AIR_REFRESHER_FUNCTION_SETTING, msg);	
	}
	public MountedAirRefreshingMethodValue getMountedAirRefreshMethod() {
		return (MountedAirRefreshingMethodValue) getProperty(PROPERTY_HAS_MOUNTED_AIR_REFRESH_METHOD);	
	}
	public void setMountedAirRefreshMethod(MountedAirRefreshingMethodValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MOUNTED_AIR_REFRESH_METHOD, msg);	
	}
	public MountedAirCleaningPurifyingMethodValue getMountedAirPurifierFunctionSetting() {
		return (MountedAirCleaningPurifyingMethodValue) getProperty(PROPERTY_HAS_MOUNTED_AIR_PURIFIER_FUNCTION_SETTING);	
	}
	public void setMountedAirPurifierFunctionSetting(MountedAirCleaningPurifyingMethodValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MOUNTED_AIR_PURIFIER_FUNCTION_SETTING, msg);	
	}
	public MountedAirCleaningPurifyingMethodValue getMountedAirCleaningMethod() {
		return (MountedAirCleaningPurifyingMethodValue) getProperty(PROPERTY_HAS_MOUNTED_AIR_CLEANING_METHOD);	
	}
	public void setMountedAirCleaningMethod(MountedAirCleaningPurifyingMethodValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MOUNTED_AIR_CLEANING_METHOD, msg);	
	}
	public ThresholdLevelValue getDegreeOfHumidificationSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_DEGREE_OF_HUMIDIFICATION_SETTING);	
	}
	public void setDegreeOfHumidificationSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DEGREE_OF_HUMIDIFICATION_SETTING, msg);	
	}
	public ThresholdLevelValue getVentilationAirFlowRateSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_VENTILATION_AIR_FLOW_RATE_SETTING);	
	}
	public void setVentilationAirFlowRateSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VENTILATION_AIR_FLOW_RATE_SETTING, msg);	
	}
	public OperationStatusValue getHumidifierFunctionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_HUMIDIFIER_FUNCTION_SETTING);	
	}
	public void setHumidifierFunctionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HUMIDIFIER_FUNCTION_SETTING, msg);	
	}
	public OperationStatusValue getVentilationFunctionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_VENTILATION_FUNCTION_SETTING);	
	}
	public void setVentilationFunctionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VENTILATION_FUNCTION_SETTING, msg);	
	}
	public OperationModeSettingValue getOperationPowerSavingMode() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_POWER_SAVING_MODE);	
	}
	public void setOperationPowerSavingMode(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_POWER_SAVING_MODE, msg);	
	}
	public OperationModeSettingValue getOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE_SETTING);	
	}
	public void setOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_MODE_SETTING, msg);	
	}
	public OperationStatusValue getAutomaticTemperatureControlSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING);	
	}
	public void setAutomaticTemperatureControlSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING, msg);	
	}
	public OperationModeSettingValue getTypeOfOperationSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_TYPE_OF_OPERATION_SETTING);	
	}
	public void setTypeOfOperationSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TYPE_OF_OPERATION_SETTING, msg);	
	}
	public MeasuredValue getCurrentSettingOfTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CURRENT_SETTING_OF_TEMPERATURE);	
	}
	public void setCurrentSettingOfTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CURRENT_SETTING_OF_TEMPERATURE, msg);	
	}
	public MeasuredValue getRelativeHumidityInDehumidificationMode() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RELATIVE_HUMIDITY_IN_DEHUMIDIFICATION_MODE);	
	}
	public void setRelativeHumidityInDehumidificationMode(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RELATIVE_HUMIDITY_IN_DEHUMIDIFICATION_MODE, msg);	
	}
	public MeasuredValue getSettingTemperatureInCoolingMode() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SETTING_TEMPERATURE_IN_COOLING_MODE);	
	}
	public void setSettingTemperatureInCoolingMode(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SETTING_TEMPERATURE_IN_COOLING_MODE, msg);	
	}
	public MeasuredValue getSettingTemperatureInHeatingMode() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SETTING_TEMPERATURE_IN_HEATING_MODE);	
	}
	public void setSettingTemperatureInHeatingMode(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SETTING_TEMPERATURE_IN_HEATING_MODE, msg);	
	}
	public MeasuredValue getSettingTemperatureInDehumidificationMode() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SETTING_TEMPERATURE_IN_DEHUMIDICATION_MODE);	
	}
	public void setSettingTemperatureInDehumidificationMode(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SETTING_TEMPERATURE_IN_DEHUMIDICATION_MODE, msg);	
	}
	public RatedPowerConsumptionInModeValue getRatedPowerConsumptionInModes() {
		return (RatedPowerConsumptionInModeValue) getProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_IN_MODES);	
	}
	public void setRatedPowerConsumptionInModes(RatedPowerConsumptionInModeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_IN_MODES, msg);	
	}
	public MeasuredValue getMeasuredCurrentConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CURRENT_CONSUMPTION);	
	}
	public void setMeasuredCurrentConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CURRENT_CONSUMPTION, msg);	
	} 
	public MeasuredValue getMeasuredRoomHumidity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY);	
	}
	public void setMeasuredRoomHumidity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY, msg);	
	}
	public MeasuredValue getMeasuredRoomTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE);	
	}
	public void setMeasuredRoomTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE, msg);	
	}
	public MeasuredValue getCurrentTemperatureSettingOfRemoteControl() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CURRENT_TEMPERATER_SETTING_OF_REMOTE_CONTROL);	
	}
	public void setCurrentTemperatureSettingOfRemoteControl(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CURRENT_TEMPERATER_SETTING_OF_REMOTE_CONTROL, msg);	
	}
	public MeasuredValue getMeasuredCooledAirTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_COOLED_AIR_TEMPERATURE);	
	}
	public void setMeasuredCooledAirTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_COOLED_AIR_TEMPERATURE, msg);	
	}
	public MeasuredValue getMeasuredOutdoorAirTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE);	
	}
	public void setMeasuredOutdoorAirTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE, msg);	
	}
	public MeasuredValue getRelativeTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RELATIVE_TEMPERATURE_SETTING);	
	}
	public void setRelativeTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RELATIVE_TEMPERATURE_SETTING, msg);	
	}
	public ThresholdLevelValue getAirFlowRateSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_AIR_FLOW_RATE_SETTING);	
	}
	public void setAirFlowRateSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AIR_FLOW_RATE_SETTING, msg);	
	}
	public OperationModeSettingValue getAutomacticControlOfAirFlowDirectionSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_AUTOMATIC_CONTROL_OF_AIR_FLOW_DIRECTION_SETTING);	
	}
	public void setAutomacticControlOfAirFlowDirectionSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_CONTROL_OF_AIR_FLOW_DIRECTION_SETTING, msg);	
	}
	public OperationStateSettingValue getAutomacticSwingOfAirFlowSetting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_AUTOMATIC_CONTROL_OF_AIR_FLOW_DIRECTION_SETTING);	
	}
	public void setAutomacticSwingOfAirFlowSetting(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_SWING_OF_AIR_FLOW_SETTING, msg);	
	}
	public AirFlowDirectionSettingValue getAirFlowVerticalDirectionSetting() {
		return (AirFlowDirectionSettingValue) getProperty(PROPERTY_HAS_AIRFLOW_VERTICAL_DIRECTION_SETTING);	
	}
	public void setAirFlowVerticalDirectionSetting(AirFlowDirectionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AIRFLOW_VERTICAL_DIRECTION_SETTING, msg);	
	}
	public AirFlowDirectionSettingValue getAirFlowHorizontalDirectionSetting() {
		return (AirFlowDirectionSettingValue) getProperty(PROPERTY_HAS_AIRFLOW_HORIZONTAL_DIRECTION_SETTING);	
	}
	public void setAirFlowHorizontalDirectionSetting(AirFlowDirectionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AIRFLOW_HORIZONTAL_DIRECTION_SETTING, msg);	
	}
	public OperationStatusValue getSpecialState() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_SPECIAL_STATE);	
	}
	public void setSpecialState(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPECIAL_STATE, msg);	
	}
	public OperationStateSettingValue getNonPriorityState() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_NON_PRIORITY_STATE);	
	}
	public void setNonPriorityState(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NON_PRIORITY_STATE, msg);	
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
