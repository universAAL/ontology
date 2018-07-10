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
package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;


import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.AlarmStatusValue;
import org.universAAL.ontology.echonet.values.DateTimeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.SurplusElectricEnergyPowerPredictionValue;
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
	public static final String PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_1 = EchonetOntology.NAMESPACE + "hasDateTimeValuetimeHeatingShiftTime1";
	public static final String PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_1 = EchonetOntology.NAMESPACE + "hasExpectedEnergyOfDateTimeValuetimeHeatingShiftTime1";
	public static final String PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_1 = EchonetOntology.NAMESPACE + "hasEnergyConsumptionPerHour1";
	public static final String PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_2 = EchonetOntology.NAMESPACE + "hasDateTimeValuetimeHeatingShiftTime2";
	public static final String PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_2 = EchonetOntology.NAMESPACE + "hasExpectedEnergyOfDateTimeValuetimeHeatingShiftTime2";
	public static final String PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_2 = EchonetOntology.NAMESPACE + "hasEnergyConsumptionPerHour2";
	
	
	public String getEnergyConsumptionPerHour2() {
		return (String) getProperty(PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_2);	
	}
	public void setEnergyConsumptionPerHour2(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_2, msg);	
	}
	public String getExpectedEnergyOfDateTimeValuetimeHeatingShiftTime2() {
		return (String) getProperty(PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_2);	
	}
	public void setExpectedEnergyOfDateTimeValuetimeHeatingShiftTime2(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_2, msg);	
	}
	public void setDateTimeValuetimeHeatingShiftTime2(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_2, msg);	
	}
	public DateTimeValue getDateTimeValuetimeHeatingShiftTime2() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_2);	
	}
	public String getEnergyConsumptionPerHour1() {
		return (String) getProperty(PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_1);	
	}
	public void setEnergyConsumptionPerHour1(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_1, msg);	
	}
	public String getExpectedEnergyOfDateTimeValuetimeHeatingShiftTime1() {
		return (String) getProperty(PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_1);	
	}
	public void setExpectedEnergyOfDateTimeValuetimeHeatingShiftTime1(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_1, msg);	
	}
	public DateTimeValue getDateTimeValuetimeHeatingShiftTime1() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_1);	
	}
	public void setDateTimeValuetimeHeatingShiftTime1(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_1, msg);	
	}
	public MeasuredValue getNumberOfEnergyShifts() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_NUMBER_OF_ENERGY_SHIFTS);	
	}
	public void setNumberOfEnergyShifts(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_OF_ENERGY_SHIFTS, msg);	
	}
	public DateTimeValue getStandardTimeToStartHeating() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_STANDARD_TIME_TO_START_HEATING);	
	}
	public void setStandardTimeToStartHeating(DateTimeValue msg) {
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
	public MeasuredValue getRatedPowerConsumptionOfHPUnitInSummer() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_SUMMER);	
	}
	public void setRatedPowerConsumptionOfHPUnitInSummer(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_SUMMER, msg);	
	}
	public MeasuredValue getRatedPowerConsumptionOfHPUnitInBetweenSeason() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_BETWEEN_SEASON);	
	}
	public void setRatedPowerConsumptionOfHPUnitInBetweenSeason(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_BETWEEN_SEASON, msg);	
	}
	public MeasuredValue getRatedPowerConsumptionOfHPUnitInWinter() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_WINTER);	
	}
	public void setRatedPowerConsumptionOfHPUnitInWinter(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_WINTER, msg);	
	}
	public SurplusElectricEnergyPowerPredictionValue getSurplusElectricEnergyPowerPredictionValue() {
		return (SurplusElectricEnergyPowerPredictionValue) getProperty(PROPERTY_HAS_SURPLUS_ELECTRIC_ENERGY_POWER_PREDICTION_VALUE);	
	}
	public void setSurplusElectricEnergyPowerPredictionValue(SurplusElectricEnergyPowerPredictionValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SURPLUS_ELECTRIC_ENERGY_POWER_PREDICTION_VALUE, msg);	
	}
	public MeasuredValue getRemainingHotWaterVolume() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_REMAINING_HOT_WATER_VOLUME);	
	}
	public void setRemainingHotWaterVolume(MeasuredValue msg) {
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
	public MeasuredValue getVolumeSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_VOLUME_SETTING);	
	}
	public void setVolumeSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VOLUME_SETTING, msg);	
	}
	public DateTimeValue getOnTimerSetting() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_ON_TIMER_SETTING);	
	}
	public void setOnTimerSetting(DateTimeValue msg) {
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
	public MeasuredValue getBathWaterVolumeSetting4MaximumSettableLevel() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETABLE_LEVEL);	
	}
	public void setBathWaterVolumeSetting4MaximumSettableLevel(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETABLE_LEVEL, msg);	
	}
	public MeasuredValue getBathWaterVolumeSetting4() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4);	
	}
	public void setBathWaterVolumeSetting4(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4, msg);	
	}
	public MeasuredValue getBathWaterVolumeSetting3() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_3);	
	}
	public void setBathWaterVolumeSetting3(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_3, msg);	
	}
	public MeasuredValue getBathWaterVolumeSetting2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_2);	
	}
	public void setBathWaterVolumeSetting2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_2, msg);	
	}	
	public MeasuredValue getBathWaterVolumeSetting1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_1);	
	}
	public void setBathWaterVolumeSetting1(MeasuredValue msg) {
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
	public MeasuredValue getTankCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_TANK_CAPACITY);	
	}
	public void setTankCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TANK_CAPACITY, msg);	
	}
	public MeasuredValue getMeasuredAmountOfRemainingWaterInTank() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_AMOUNT_OF_REMAINING_WATER_IN_TANK);	
	}
	public void getMeasuredAmountOfRemainingWaterInTank(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_AMOUNT_OF_REMAINING_WATER_IN_TANK, msg);	
	}
	public MeasuredValue getBathWaterVolumeSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING);	
	}
	public void setBathWaterVolumeSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING, msg);	
	}
	public MeasuredValue getBathWaterTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATH_WATER_TEMPERATURE_SETTING);	
	}
	public void setBathWaterTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_TEMPERATURE_SETTING, msg);	
	}
	public MeasuredValue getTemperatureOfSuppliedWaterSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_TEMPERATURE_OF_SUPPLIED_WATER_SETTING);	
	}
	public void setTemperatureOfSuppliedWaterSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TEMPERATURE_OF_SUPPLIED_WATER_SETTING, msg);	
	}
	public DateTimeValue getRelativeTimeSettingForKeepingBathTemperature() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_RELATIVE_TIME_SETTING_FOR_KEEPING_BATH_TEMPERATURE);	
	}
	public void setRelativeTimeSettingForKeepingBathTemperature(DateTimeValue msg) {
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
	public MeasuredValue getMeasuredWaterTemperatureOfWaterHeater() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_OF_WATER_HEATER);	
	}
	public void setMeasuredWaterTemperatureOfWaterHeater(MeasuredValue msg) {
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
	public DateTimeValue getRelativeTimeForManualWaterHeatingOffSetting() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_RELATIVE_TIME_FOR_MANUAL_WATER_HEATING_OFF_SETTING);	
	}
	public void setRelativeTimeForManualWaterHeatingOffSetting(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RELATIVE_TIME_FOR_MANUAL_WATER_HEATING_OFF_SETTING, msg);	
	}
	public DateTimeValue getManualWaterHeatingStopDaySetting() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_MANUAL_WATER_HEATING_STOP_DAY_SETTING);	
	}
	public void setManualWaterHeatingStopDaySetting(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MANUAL_WATER_HEATING_STOP_DAY_SETTING, msg);	
	}
	public MeasuredValue getWaterHeatingTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_WATER_HEATING_TEMPERATURE_SETTING);	
	}
	public void setWaterHeatingTemperatureSetting(MeasuredValue msg) {
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
