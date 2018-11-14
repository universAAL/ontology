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
import org.universAAL.ontology.echonetontology.values.AlarmStatusValue;
import org.universAAL.ontology.echonetontology.values.OperationModeSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStateSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;
import org.universAAL.ontology.echonetontology.values.ThresholdLevelValue;
public class WaterHeater extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "WaterHeater";
	public static final String PROPERTY_HAS_AUTOMATIC_WATER_HEATING_SETTING = EchonetOntology.NAMESPACE + "hasAutomaticWaterHeatingSetting";
	public static final String PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING = EchonetOntology.NAMESPACE + "hasAutomaticTemperatureControlSetting";
	public static final String PROPERTY_HAS_WATER_HEATER_STATUS = EchonetOntology.NAMESPACE + "hasWaterHeaterStatus";
	public static final String PROPERTY_HAS_WATER_HEATING_TEMPERATURE_SETTING = EchonetOntology.NAMESPACE + "hasWaterHeatingTemperatureSetting";
	public static final String PROPERTY_HAS_MANUAL_WATER_HEATING_STOP_DAY_SETTING = EchonetOntology.NAMESPACE + "hasManualWaterHeatingStopDaySetting";
	public static final String PROPERTY_HAS_RELATIVE_TIME_FOR_MANUAL_WATER_HEATING_OFF_SETTING = EchonetOntology.NAMESPACE + "hasRelativeTimeForManualWaterHeatingOffSetting";
	public static final String PROPERTY_HAS_TANK_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "hasTankOperationModeSetting";
	public static final String PROPERTY_HAS_DAYTIME_REHEATING_PERMISSION_SETTING = EchonetOntology.NAMESPACE + "hasDaytimeReheatingPermissionSetting";
	public static final String PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_OF_WATER_HEATER = EchonetOntology.NAMESPACE + "hasMeasuredWaterTemperatureOfWaterHeater";
	public static final String PROPERTY_HAS_ALARM_STATUS = EchonetOntology.NAMESPACE + "hasAlarmStatus";
	public static final String PROPERTY_HAS_HOT_WATER_SUPPLY_STATUS = EchonetOntology.NAMESPACE + "hasHotWaterSupplyStatus";
	public static final String PROPERTY_HAS_RELATIVE_TIME_SETTING_FOR_KEEPING_BATH_TEMPERATURE = EchonetOntology.NAMESPACE + "hasRelativeTimeSettingForKeepingBathTemperature";
	public static final String PROPERTY_HAS_TEMPERATURE_OF_SUPPLIED_WATER_SETTING = EchonetOntology.NAMESPACE + "hasTemperatureOfSuppliedWaterSetting";
	public static final String PROPERTY_HAS_BATH_WATER_TEMPERATURE_SETTING = EchonetOntology.NAMESPACE + "hasBathWaterTemperatureSetting";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING = EchonetOntology.NAMESPACE + "hasBathWaterVolumeSetting";
	public static final String PROPERTY_HAS_MEASURED_AMOUNT_OF_REMAINING_WATER_IN_TANK = EchonetOntology.NAMESPACE + "hasMeasuredAmountOfRemainingWaterInTank";
	public static final String PROPERTY_HAS_TANK_CAPACITY = EchonetOntology.NAMESPACE + "hasTankCapacity";
	public static final String PROPERTY_HAS_AUTOMATIC_BATH_WATER_HEATING_MODE_SETTING = EchonetOntology.NAMESPACE + "hasAutomaticBathWaterHeatingModeSetting";
	public static final String PROPERTY_HAS_BATHROOM_PRIORITY_SETTING = EchonetOntology.NAMESPACE + "hasBathroomPrioritySetting";
	public static final String PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR = EchonetOntology.NAMESPACE + "hasBathOperationStatusMonitor";
	public static final String PROPERTY_HAS_MANUAL_BATH_REHEATING_OPERATION_SETTING = EchonetOntology.NAMESPACE + "hasManualBathReheatingOperationSetting";
	public static final String PROPERTY_HAS_MANUAL_BATH_HOT_WATER_ADDITION_FUNCTION_SETTING = EchonetOntology.NAMESPACE + "hasManualBathHotWaterAdditionFunctionSetting";
	public static final String PROPERTY_HAS_MANUAL_LUKEWARM_WATER_TEMPERATURE_LOWERING_FUNCTION_SETTING = EchonetOntology.NAMESPACE + "hasManualLukewarmWaterTemperatureLoweringFunctionSetting";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_1 = EchonetOntology.NAMESPACE + "hasBathWaterVolumeSetting1";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_2 = EchonetOntology.NAMESPACE + "hasBathWaterVolumeSetting2";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_3 = EchonetOntology.NAMESPACE + "hasBathWaterVolumeSetting3";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4 = EchonetOntology.NAMESPACE + "hasBathWaterVolumeSetting4";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETABLE_LEVEL = EchonetOntology.NAMESPACE + "hasBathWaterVolumeSetting4MaximumSettableLevel";
	public static final String PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING = EchonetOntology.NAMESPACE + "hasOnTimerReservationSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING = EchonetOntology.NAMESPACE + "hasOnTimerSetting";
	public static final String PROPERTY_HAS_VOLUME_SETTING = EchonetOntology.NAMESPACE + "hasVolumeSetting";
	public static final String PROPERTY_HAS_MUTE_SETTING = EchonetOntology.NAMESPACE + "hasMuteSetting";
	public static final String PROPERTY_HAS_REMAINING_HOT_WATER_VOLUME = EchonetOntology.NAMESPACE + "hasRemainingHotWaterVolume";
	public static final String PROPERTY_HAS_SURPLUS_ELECTRIC_ENERGY_POWER_PREDICTION_VALUE = EchonetOntology.NAMESPACE + "hasSurplusElectricEnergyPowerPredictionValue";
	public static final String PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_WINTER = EchonetOntology.NAMESPACE + "hasRatedPowerConsumptionOfHPUnitInWinter";
	public static final String PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_BETWEEN_SEASON = EchonetOntology.NAMESPACE + "hasRatedPowerConsumptionOfHPUnitInBetweenSeason";
	public static final String PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_SUMMER = EchonetOntology.NAMESPACE + "hasRatedPowerConsumptionOfHPUnitInSummer";
	public static final String PROPERTY_HAS_PARTICIPATION_IN_ENERGY_SHIFT = EchonetOntology.NAMESPACE + "hasParticipationInEnergyShift";
	public static final String PROPERTY_HAS_STANDARD_TIME_TO_START_HEATING= EchonetOntology.NAMESPACE + "hasStandardTimeToStartHeating";
	public static final String PROPERTY_HAS_NUMBER_OF_ENERGY_SHIFTS = EchonetOntology.NAMESPACE + "hasNumberOfEnergyShifts";
	public static final String PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_1 = EchonetOntology.NAMESPACE + "hasTimeHeatingShiftTime1";
	public static final String PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_1 = EchonetOntology.NAMESPACE + "hasExpectedEnergyOfTimeHeatingShiftTime1";
	public static final String PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_1 = EchonetOntology.NAMESPACE + "hasEnergyConsumptionPerHour1";
	public static final String PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_2 = EchonetOntology.NAMESPACE + "hasTimeHeatingShiftTime2";
	public static final String PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_2 = EchonetOntology.NAMESPACE + "hasExpectedEnergyOfTimeHeatingShiftTime2";
	public static final String PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_2 = EchonetOntology.NAMESPACE + "hasEnergyConsumptionPerHour2";
	
	
	public Integer getEnergyConsumptionPerHour2() {
		return  (Integer) getProperty(PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_2);	
	}
	public void setEnergyConsumptionPerHour2(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_2, msg);	
	}
	public Integer getExpectedEnergyOfTimeHeatingShiftTime2() {
		return  (Integer)getProperty(PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_2);	
	}
	public void setExpectedEnergyOfTimeHeatingShiftTime2(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_2, msg);	
	}
	public void setTimeHeatingShiftTime2(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_2, msg);	
	}
	public String getTimeHeatingShiftTime2() {
		return  getProperty(PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_2).toString();	
	}
	public Integer getEnergyConsumptionPerHour1() {
		return  (Integer) getProperty(PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_1);	
	}
	public void setEnergyConsumptionPerHour1(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_1, msg);	
	}
	public Integer getExpectedEnergyOfTimeHeatingShiftTime1() {
		return  (Integer)getProperty(PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_1);	
	}
	public void setExpectedEnergyOfTimeHeatingShiftTime1(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_1, msg);	
	}
	public String getTimeHeatingShiftTime1() {
		return  getProperty(PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_1).toString();	
	}
	public void setTimeHeatingShiftTime1(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_1, msg);	
	}
	public Integer getNumberOfEnergyShifts() {
		return (Integer) getProperty(PROPERTY_HAS_NUMBER_OF_ENERGY_SHIFTS);	
	}
	public void setNumberOfEnergyShifts(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_OF_ENERGY_SHIFTS, msg);	
	}
	public Integer getStandardTimeToStartHeating() {
		return  (Integer)getProperty(PROPERTY_HAS_STANDARD_TIME_TO_START_HEATING);	
	}
	public void setStandardTimeToStartHeating(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_STANDARD_TIME_TO_START_HEATING, msg);	
	}
	public OperationStatusValue getParticipationInEnergyShift() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_PARTICIPATION_IN_ENERGY_SHIFT);	
	}
	public void setParticipationInEnergyShift(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_PARTICIPATION_IN_ENERGY_SHIFT, msg);	
	}
	public Integer getRatedPowerConsumptionOfHPUnitInSummer() {
		return (Integer) getProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_SUMMER);	
	}
	public void setRatedPowerConsumptionOfHPUnitInSummer(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_SUMMER, msg);	
	}
	public Integer getRatedPowerConsumptionOfHPUnitInBetweenSeason() {
		return (Integer) getProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_BETWEEN_SEASON);	
	}
	public void setRatedPowerConsumptionOfHPUnitInBetweenSeason(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_BETWEEN_SEASON, msg);	
	}
	public Integer getRatedPowerConsumptionOfHPUnitInWinter() {
		return (Integer) getProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_WINTER);	
	}
	public void setRatedPowerConsumptionOfHPUnitInWinter(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_WINTER, msg);	
	}
	public String getSurplusElectricEnergyPowerPredictionValue() {
		return  getProperty(PROPERTY_HAS_SURPLUS_ELECTRIC_ENERGY_POWER_PREDICTION_VALUE).toString();	
	}
	public void setSurplusElectricEnergyPowerPredictionValue(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SURPLUS_ELECTRIC_ENERGY_POWER_PREDICTION_VALUE, msg);	
	}
	public Integer getRemainingHotWaterVolume() {
		return (Integer) getProperty(PROPERTY_HAS_REMAINING_HOT_WATER_VOLUME);	
	}
	public void setRemainingHotWaterVolume(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_HOT_WATER_VOLUME, msg);	
	}
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
	public String getOnTimerSetting() {
		return  getProperty(PROPERTY_HAS_ON_TIMER_SETTING).toString();	
	}
	public void setOnTimerSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING, msg);	
	}
	public OperationStatusValue getOnTimerReservationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING);	
	}
	public void setOnTimerReservationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING, msg);	
	}
	public Integer getBathWaterVolumeSetting4MaximumSettableLevel() {
		return (Integer) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETABLE_LEVEL);	
	}
	public void setBathWaterVolumeSetting4MaximumSettableLevel(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETABLE_LEVEL, msg);	
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
	public OperationStatusValue getManualLukewarmWaterTemperatureLoweringFunctionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_MANUAL_LUKEWARM_WATER_TEMPERATURE_LOWERING_FUNCTION_SETTING);	
	}
	public void setManualLukewarmWaterTemperatureLoweringFunctionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MANUAL_LUKEWARM_WATER_TEMPERATURE_LOWERING_FUNCTION_SETTING, msg);	
	}
	public OperationStatusValue getManualBathHotWaterAdditionFunctionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_MANUAL_BATH_HOT_WATER_ADDITION_FUNCTION_SETTING);	
	}
	public void setManualBathHotWaterAdditionFunctionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MANUAL_BATH_HOT_WATER_ADDITION_FUNCTION_SETTING, msg);	
	}
	public OperationStatusValue getManualBathReheatingOperationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_MANUAL_BATH_REHEATING_OPERATION_SETTING);	
	}
	public void setManualBathReheatingOperationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MANUAL_BATH_REHEATING_OPERATION_SETTING, msg);	
	}
	public OperationStateSettingValue getBathOperationStatusMonitor() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR);	
	}
	public void setBathOperationStatusMonitor(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR, msg);	
	}
	
	public OperationStatusValue getBathroomPrioritySetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_BATHROOM_PRIORITY_SETTING);	
	}
	public void setBathroomPrioritySetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATHROOM_PRIORITY_SETTING, msg);	
	}
	public OperationStatusValue getAutomaticBathWaterHeatingModeSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_AUTOMATIC_BATH_WATER_HEATING_MODE_SETTING);	
	}
	public void setAutomaticBathWaterHeatingModeSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_BATH_WATER_HEATING_MODE_SETTING, msg);	
	}
	public Integer getTankCapacity() {
		return (Integer) getProperty(PROPERTY_HAS_TANK_CAPACITY);	
	}
	public void setTankCapacity(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TANK_CAPACITY, msg);	
	}
	public Integer getMeasuredAmountOfRemainingWaterInTank() {
		return (Integer) getProperty(PROPERTY_HAS_MEASURED_AMOUNT_OF_REMAINING_WATER_IN_TANK);	
	}
	public void getMeasuredAmountOfRemainingWaterInTank(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_AMOUNT_OF_REMAINING_WATER_IN_TANK, msg);	
	}
	public Integer getBathWaterVolumeSetting() {
		return (Integer) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING);	
	}
	public void setBathWaterVolumeSetting(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING, msg);	
	}
	public Integer getBathWaterTemperatureSetting() {
		return (Integer) getProperty(PROPERTY_HAS_BATH_WATER_TEMPERATURE_SETTING);	
	}
	public void setBathWaterTemperatureSetting(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_TEMPERATURE_SETTING, msg);	
	}
	public Integer getTemperatureOfSuppliedWaterSetting() {
		return (Integer) getProperty(PROPERTY_HAS_TEMPERATURE_OF_SUPPLIED_WATER_SETTING);	
	}
	public void setTemperatureOfSuppliedWaterSetting(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TEMPERATURE_OF_SUPPLIED_WATER_SETTING, msg);	
	}
	public String getRelativeTimeSettingForKeepingBathTemperature() {
		return  getProperty(PROPERTY_HAS_RELATIVE_TIME_SETTING_FOR_KEEPING_BATH_TEMPERATURE).toString();	
	}
	public void setRelativeTimeSettingForKeepingBathTemperature(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RELATIVE_TIME_SETTING_FOR_KEEPING_BATH_TEMPERATURE, msg);	
	}
	public OperationStatusValue getHotWaterSupplyStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_HOT_WATER_SUPPLY_STATUS);	
	}
	public void setHotWaterSupplyStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HOT_WATER_SUPPLY_STATUS, msg);	
	}
	public AlarmStatusValue getAlarmStatus() {
		return (AlarmStatusValue) getProperty(PROPERTY_HAS_ALARM_STATUS);	
	}
	public void setAlarmStatus(AlarmStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ALARM_STATUS, msg);	
	}
	public Integer getMeasuredWaterTemperatureOfWaterHeater() {
		return (Integer) getProperty(PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_OF_WATER_HEATER);	
	}
	public void setMeasuredWaterTemperatureOfWaterHeater(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_OF_WATER_HEATER, msg);	
	}
	public OperationStatusValue getDaytimeReheatingPermissionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_DAYTIME_REHEATING_PERMISSION_SETTING);	
	}
	public void setDaytimeReheatingPermissionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAYTIME_REHEATING_PERMISSION_SETTING, msg);	
	}
	public OperationModeSettingValue getTankOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_TANK_OPERATION_MODE_SETTING);	
	}
	public void setTankOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TANK_OPERATION_MODE_SETTING, msg);	
	}
	public String getRelativeTimeForManualWaterHeatingOffSetting() {
		return  getProperty(PROPERTY_HAS_RELATIVE_TIME_FOR_MANUAL_WATER_HEATING_OFF_SETTING).toString();	
	}
	public void setRelativeTimeForManualWaterHeatingOffSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RELATIVE_TIME_FOR_MANUAL_WATER_HEATING_OFF_SETTING, msg);	
	}
	public String getManualWaterHeatingStopDaySetting() {
		return  getProperty(PROPERTY_HAS_MANUAL_WATER_HEATING_STOP_DAY_SETTING).toString();	
	}
	public void setManualWaterHeatingStopDaySetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MANUAL_WATER_HEATING_STOP_DAY_SETTING, msg);	
	}
	public Integer getWaterHeatingTemperatureSetting() {
		return (Integer) getProperty(PROPERTY_HAS_WATER_HEATING_TEMPERATURE_SETTING);	
	}
	public void setWaterHeatingTemperatureSetting(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_HEATING_TEMPERATURE_SETTING, msg);	
	}
	public OperationStatusValue PROPERTY_HAS_WATER_HEAT_STATUS() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_WATER_HEATER_STATUS);	
	}
	public void setWaterHeaterStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_HEATER_STATUS, msg);	
	}
	public OperationStatusValue getAutomaticTemperatureControlSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING);	
	}
	public void setAutomaticTemperatureControlSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING, msg);	
	}
	public OperationStatusValue getAutomaticWaterHeatingSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_AUTOMATIC_WATER_HEATING_SETTING);	
	}
	public void setAutomaticWaterHeatingSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_WATER_HEATING_SETTING, msg);	
	}
	
	
	public WaterHeater() {
		super();
	}
	public WaterHeater(String uri) {
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
