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
import org.universAAL.ontology.echonetontology.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationModeSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;

public class StorageBattery extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "StorageBattery";
	public static final String PROPERTY_HAS_AC_EFFECTIVE_CAPACITY_CHARGING = EchonetOntology.NAMESPACE + "hasACEffectiveCapacityCharging";
	public static final String PROPERTY_HAS_AC_EFFECTIVE_CAPACITY_DISCHARGING = EchonetOntology.NAMESPACE + "hasACEffectiveCapacityDischarging";
	public static final String PROPERTY_HAS_AC_CHARGEABLE_CAPACITY = EchonetOntology.NAMESPACE + "hasACChargableCapacity";
	public static final String PROPERTY_HAS_AC_DISCHARGEABLE_CAPACITY = EchonetOntology.NAMESPACE + "hasACDischargableCapacity";
	public static final String PROPERTY_HAS_AC_CHARGEABLE_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "hasACChargableElectricEnergy";
	public static final String PROPERTY_HAS_AC_DISCHARGEABLE_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "hasACDischargableElectricEnergy";
	public static final String PROPERTY_HAS_AC_CHARGE_UPPER_LIMIT_SETTING = EchonetOntology.NAMESPACE + "hasACChargeUpperLimitSetting";
	public static final String PROPERTY_HAS_AC_DISCHARGE_LOWER_LIMIT_SETTING = EchonetOntology.NAMESPACE + "hasACDischargeLowerLimitSetting";
	public static final String PROPERTY_HAS_AC_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "hasACMeasuredCumulativeChargingElectricEnergy";
	public static final String PROPERTY_HAS_AC_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "hasACMeasuredCumulativeDischargingElectricEnergy";
	public static final String PROPERTY_HAS_AC_CHARGE_AMOUNT_SETTING_VALUE = EchonetOntology.NAMESPACE + "hasACChargeAmountSettingValue";
	public static final String PROPERTY_HAS_AC_DISCHARGE_AMOUNT_SETTING_VALUE = EchonetOntology.NAMESPACE + "hasACDishargeAmountSettingValue";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_POWER = EchonetOntology.NAMESPACE + "hasMinimumMaximumChargingElectricPower";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_POWER = EchonetOntology.NAMESPACE + "hasMinimumMaximumDischargingElectricPower";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT = EchonetOntology.NAMESPACE + "hasMinimumMaximumChargingCurrent";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_CURRENT = EchonetOntology.NAMESPACE + "hasMinimumMaximumDischargingCurrent";
	public static final String PROPERTY_HAS_RE_INTERCONNECTION_PERMISSION_SETTING = EchonetOntology.NAMESPACE + "hasReInterconnectionPermissionSetting";
	public static final String PROPERTY_HAS_OPERATION_PERMISSION_SETTING = EchonetOntology.NAMESPACE + "hasOperationPermissionSetting";
	public static final String PROPERTY_HAS_INDEPENDENT_OPERATION_PERMISSION_SETTING = EchonetOntology.NAMESPACE + "hasIndependentOperationPermissionSetting";
	public static final String PROPERTY_HAS_WORKING_OPERATION_STATUS = EchonetOntology.NAMESPACE + "hasWorkingOperationStatus";
	public static final String PROPERTY_HAS_AC_RATED_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "hasACRatedElectricEnergy";
	public static final String PROPERTY_HAS_RATED_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "hasRatedElectricEnergy";
	public static final String PROPERTY_HAS_RATED_CAPACITY = EchonetOntology.NAMESPACE + "hasRatedCapacity";
	public static final String PROPERTY_HAS_RATED_VOLTAGE = EchonetOntology.NAMESPACE + "hasRatedVoltage";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_POWER = EchonetOntology.NAMESPACE + "hasMeasuredInstantaneousChargingDischargingElectricPower";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_CURRENT = EchonetOntology.NAMESPACE + "hasMeasuredInstantaneousChargingDischargingElectricCurrent";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_VOLTAGE = EchonetOntology.NAMESPACE + "hasMeasuredInstantaneousChargingDischargingElectricVoltage";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeChargingElectricEnergy";
	public static final String PROPERTY_RESET_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "resetMeasuredCumulativeChargingDischargingElectricEnergy";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeDischargingElectricEnergy";
	public static final String PROPERTY_RESET_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "resetMeasuredCumulativeDischargingDischargingElectricEnergy";
	public static final String PROPERTY_HAS_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "hasOperationModeSetting";
	public static final String PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE = EchonetOntology.NAMESPACE + "hasSystemInterconnectType";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_POWER_INDEPENDENT = EchonetOntology.NAMESPACE + "hasMinimumMaximumChargingElectricPowerIndependent";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_CURRENT_INDEPENDENT = EchonetOntology.NAMESPACE + "hasMinimumMaximumChargingElectricCurrentIndependent";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_POWER_INDEPENDENT = EchonetOntology.NAMESPACE + "hasMinimumMaximumDisChargingElectricPowerIndependent";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_CURRENT_INDEPENDENT = EchonetOntology.NAMESPACE + "hasMinimumMaximumDisChargingElectricCurrentIndependent";
	
	public static final String PROPERTY_HAS_CHARGING_DISCHARGING_AMOUNT_SETTING_1 = EchonetOntology.NAMESPACE + "hasChargingDischargingAmountSetting1";
	public static final String PROPERTY_HAS_CHARGING_DISCHARGING_AMOUNT_SETTING_2 = EchonetOntology.NAMESPACE + "hasChargingDischargingAmountSetting2";
	public static final String PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1 = EchonetOntology.NAMESPACE + "hasRemainingStoredElectric1";
	public static final String PROPERTY_HAS_REMAINING_STORED_ELECTRIC_2 = EchonetOntology.NAMESPACE + "hasRemainingStoredElectric2";
	public static final String PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3 = EchonetOntology.NAMESPACE + "hasRemainingStoredElectric3";
	public static final String PROPERTY_HAS_BATTERY_STATE_OF_HEALTH = EchonetOntology.NAMESPACE + "hasBatteryStateOfHealth";
	public static final String PROPERTY_HAS_BATTERY_TYPE = EchonetOntology.NAMESPACE + "hasBatteryType";
	public static final String PROPERTY_HAS_CHARGING_AMOUNT_SETTING_1 = EchonetOntology.NAMESPACE + "hasChargingAmountSetting1";
	public static final String PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING_1 = EchonetOntology.NAMESPACE + "hasDischargingAmountSetting1";
	public static final String PROPERTY_HAS_CHARGING_AMOUNT_SETTING_2 = EchonetOntology.NAMESPACE + "hasChargingAmountSetting2";
	public static final String PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING_2 = EchonetOntology.NAMESPACE + "hasDischargingAmountSetting2";
	public static final String PROPERTY_HAS_CHARGING_ELECTRIC_POWER_SETTING = EchonetOntology.NAMESPACE + "hasChargingElectricPowerSetting";
	public static final String PROPERTY_HAS_DISCHARGING_ELECTRIC_POWER_SETTING = EchonetOntology.NAMESPACE + "hasDischargingElectricPowerSetting";
	public static final String PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING = EchonetOntology.NAMESPACE + "hasChargingElectricCurrentSetting";
	public static final String PROPERTY_HAS_DISCHARGING_ELECTRIC_CURRENT_SETTING = EchonetOntology.NAMESPACE + "hasDischargingElectricCurrentSetting";
	public static final String PROPERTY_HAS_RATED_VOLTAGE_INDEPENDENT = EchonetOntology.NAMESPACE + "hasRatedVoltageIndependent";

	public Float getRatedVoltageIndependent() {
		return (Float) getProperty(PROPERTY_HAS_RATED_VOLTAGE_INDEPENDENT);	
	}
	public void setRatedVoltageIndependent(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_VOLTAGE_INDEPENDENT, msg);	
	}
	public Float getDischargingElectricCurrentSetting() {
		return (Float) getProperty(PROPERTY_HAS_DISCHARGING_ELECTRIC_CURRENT_SETTING);	
	}
	public void setDischargingElectricCurrentSetting(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DISCHARGING_ELECTRIC_CURRENT_SETTING, msg);	
	}
	public Float getChargingElectricCurrentSetting() {
		return (Float) getProperty(PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING);	
	}
	public void setChargingElectricCurrentSetting(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING, msg);	
	}
	public Float getDischargingElectricPowerSetting() {
		return (Float) getProperty(PROPERTY_HAS_DISCHARGING_ELECTRIC_POWER_SETTING);	
	}
	public void setDischargingElectricPowerSetting(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DISCHARGING_ELECTRIC_POWER_SETTING, msg);	
	}
	public Float getChargingElectricPowerSetting() {
		return (Float) getProperty(PROPERTY_HAS_CHARGING_ELECTRIC_POWER_SETTING);	
	}
	public void setChargingElectricPowerSetting(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_ELECTRIC_POWER_SETTING, msg);	
	}
	public Float getDischargingAmountSetting2() {
		return (Float) getProperty(PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING_2);	
	}
	public void setDischargingAmountSetting2(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING_2, msg);	
	}
	public Float getChargingAmountSetting2() {
		return (Float) getProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING_2);	
	}
	public void setChargingAmountSetting2(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING_2, msg);	
	}
	public Float getDischargingAmountSetting1() {
		return (Float) getProperty(PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING_1);	
	}
	public void setDischargingAmountSetting1(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING_1, msg);	
	}
	public Float getChargingAmountSetting1() {
		return (Float) getProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING_1);	
	}
	public void setChargingAmountSetting1(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING_1, msg);	
	}
	public String getBatteryType() {
		return  getProperty(PROPERTY_HAS_BATTERY_TYPE).toString();	
	}
	public void setBatteryType(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATTERY_TYPE, msg);	
	}
	public Float getBatteryStateOfHealth() {
		return (Float) getProperty(PROPERTY_HAS_BATTERY_STATE_OF_HEALTH);	
	}
	public void setBatteryStateOfHealth(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATTERY_STATE_OF_HEALTH, msg);	
	}
	public Float getRemainingStoredElectric3() {
		return (Float) getProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3);	
	}
	public void setRemainingStoredElectric3(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3, msg);	
	}
	public Float getRemainingStoredElectric2() {
		return (Float) getProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_2);	
	}
	public void setRemainingStoredElectric2(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_2, msg);	
	}
	public Float getRemainingStoredElectric1() {
		return (Float) getProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1);	
	}
	public void setRemainingStoredElectric1(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1, msg);	
	}
	public Float getChargingDischargingAmountSetting2() {
		return (Float) getProperty(PROPERTY_HAS_CHARGING_DISCHARGING_AMOUNT_SETTING_2);	
	}
	public void setChargingDischargingAmountSetting2(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_DISCHARGING_AMOUNT_SETTING_2, msg);	
	}
	public Float getChargingDischargingAmountSetting1() {
		return (Float) getProperty(PROPERTY_HAS_CHARGING_DISCHARGING_AMOUNT_SETTING_1);	
	}
	public void setChargingDischargingAmountSetting1(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_DISCHARGING_AMOUNT_SETTING_1, msg);	
	}
	public String getMinimumMaximumDisChargingElectricCurrentIndependent() {
		return  getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_CURRENT_INDEPENDENT).toString();	
	}
	public void setMinimumMaximumDisChargingElectricCurrentIndependent(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_CURRENT_INDEPENDENT, msg);	
	}
	public String getMinimumMaximumDisChargingElectricPowerIndependent() {
		return  getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_POWER_INDEPENDENT).toString();	
	}
	public void setMinimumMaximumDisChargingElectricPowerIndependent(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_POWER_INDEPENDENT, msg);	
	}
	public String getMinimumMaximumChargingElectricCurrentIndependent() {
		return  getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_CURRENT_INDEPENDENT).toString();	
	}
	public void setMinimumMaximumChargingElectricCurrentIndependent(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_CURRENT_INDEPENDENT, msg);	
	}
	public String getMinimumMaximumChargingElectricPowerIndependent() {
		return  getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_POWER_INDEPENDENT).toString();	
	}
	public void setMinimumMaximumChargingElectricPowerIndependent(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_POWER_INDEPENDENT, msg);	
	}
	public OperationFunctionSettingValue getSystemInterconnectType() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE);	
	}
	public void setSystemInterconnectType(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE, msg);	
	}
	public OperationModeSettingValue getOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE_SETTING);	
	}
	public void setOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_MODE_SETTING, msg);	
	}
	public Float getMeasuredCumulativeChargingElectricEnergy() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY);	
	}
	public void setMeasuredCumulativeChargingElectricEnergy(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY, msg);	
	}
	public Float getMeasuredCumulativeDischargingElectricEnergy() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY);	
	}
	public void setMeasuredCumulativeDischargingElectricEnergy(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY, msg);	
	}
	
	public Float getMeasuredInstantaneousChargingDischargingElectricVoltage() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_VOLTAGE);	
	}
	public void setMeasuredInstantaneousChargingDischargingElectricVoltage(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_VOLTAGE, msg);	
	}	
	
	public Float getMeasuredInstantaneousChargingDischargingElectricCurrent() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_CURRENT);	
	}
	public void setMeasuredInstantaneousChargingDischargingElectricCurrent(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_CURRENT, msg);	
	}
	
	public Float getMeasuredInstantaneousChargingDischargingElectricPower() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_POWER);	
	}
	public void setMeasuredInstantaneousChargingDischargingElectricPower(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_POWER, msg);	
	}
	public Float getRatedVoltage() {
		return (Float) getProperty(PROPERTY_HAS_RATED_CAPACITY);	
	}
	public void setRatedVoltage(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_CAPACITY, msg);	
	}
	public Float getRatedCapacity() {
		return (Float) getProperty(PROPERTY_HAS_RATED_CAPACITY);	
	}
	public void setRatedCapacity(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_CAPACITY, msg);	
	}
	public Float getRatedElectricEnergy() {
		return (Float) getProperty(PROPERTY_HAS_RATED_ELECTRIC_ENERGY);	
	}
	public void setRatedElectricEnergy(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_ELECTRIC_ENERGY, msg);	
	}
	public Float getACRatedElectricEnergy() {
		return (Float) getProperty(PROPERTY_HAS_AC_RATED_ELECTRIC_ENERGY);	
	}
	public void setACRatedElectricEnergy(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_RATED_ELECTRIC_ENERGY, msg);	
	}
	public OperationModeSettingValue getWorkingOperationStatus() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_WORKING_OPERATION_STATUS);	
	}
	public void setWorkingOperationStatus(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WORKING_OPERATION_STATUS, msg);	
	}
	public OperationStatusValue getIndependentOperationPermissionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_INDEPENDENT_OPERATION_PERMISSION_SETTING);	
	}
	public void setIndependentOperationPermissionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INDEPENDENT_OPERATION_PERMISSION_SETTING, msg);	
	}
	public OperationStatusValue getOperationPermissionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_OPERATION_PERMISSION_SETTING);	
	}
	public void setOperationPermissionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_PERMISSION_SETTING, msg);	
	}
	public OperationStatusValue getReInterconnectionPermissionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_RE_INTERCONNECTION_PERMISSION_SETTING);	
	}
	public void setReInterconnectionPermissionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RE_INTERCONNECTION_PERMISSION_SETTING, msg);	
	}
	public String getMinimumMaximumDischargingCurrent() {
		return  getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_CURRENT).toString();	
	}
	public void setMinimumMaximumDischargingCurrent(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_CURRENT, msg);	
	}
	public String getMinimumMaximumChargingCurrent() {
		return  getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT).toString();	
	}
	public void setMinimumMaximumChargingCurrent(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT, msg);	
	}
	public String getMinimumMaximumDischargingElectricPower() {
		return  getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_POWER).toString();	
	}
	public void setMinimumMaximumDischargingElectricPower(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_POWER, msg);	
	}
	public String getMinimumMaximumChargingElectricPower() {
		return  getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_POWER).toString();	
	}
	public void setMinimumMaximumChargingElectricPower(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_POWER, msg);	
	}
	public Float getACDishargeAmountSettingValue() {
		return (Float) getProperty(PROPERTY_HAS_AC_DISCHARGE_AMOUNT_SETTING_VALUE);	
	}
	public void setACDishargeAmountSettingValue(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_DISCHARGE_AMOUNT_SETTING_VALUE, msg);	
	}
	public Float getACChargeAmountSettingValue() {
		return (Float) getProperty(PROPERTY_HAS_AC_CHARGE_AMOUNT_SETTING_VALUE);	
	}
	public void setACChargeAmountSettingValue(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_CHARGE_AMOUNT_SETTING_VALUE, msg);	
	}
	public Float getACMeasuredCumulativeDischargingElectricEnergy() {
		return (Float) getProperty(PROPERTY_HAS_AC_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY);	
	}
	public void setACMeasuredCumulativeDischargingElectricEnergy(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY, msg);	
	}
	public Float getACMeasuredCumulativeChargingElectricEnergy() {
		return (Float) getProperty(PROPERTY_HAS_AC_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY);	
	}
	public void setACMeasuredCumulativeChargingElectricEnergy(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY, msg);	
	}
	public Float getACDischargeLowerLimitSetting() {
		return (Float) getProperty(PROPERTY_HAS_AC_DISCHARGE_LOWER_LIMIT_SETTING);	
	}
	public void setACDischargeLowerLimitSetting(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_DISCHARGE_LOWER_LIMIT_SETTING, msg);	
	}
	public Float getACChargeUpperLimitSetting() {
		return (Float) getProperty(PROPERTY_HAS_AC_CHARGE_UPPER_LIMIT_SETTING);	
	}
	public void setACChargeUpperLimitSetting(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_CHARGE_UPPER_LIMIT_SETTING, msg);	
	}
	public Float getACDischargableElectricEnergy() {
		return (Float) getProperty(PROPERTY_HAS_AC_DISCHARGEABLE_ELECTRIC_ENERGY);	
	}
	public void setACDischargableElectricEnergy(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_DISCHARGEABLE_ELECTRIC_ENERGY, msg);	
	}
	public Float getACChargableElectricEnergy() {
		return (Float) getProperty(PROPERTY_HAS_AC_CHARGEABLE_ELECTRIC_ENERGY);	
	}
	public void setACChargableElectricEnergy(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_CHARGEABLE_ELECTRIC_ENERGY, msg);	
	}
	public Float getACDischargableCapacity() {
		return (Float) getProperty(PROPERTY_HAS_AC_DISCHARGEABLE_CAPACITY);	
	}
	public void setACDischargableCapacity(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_DISCHARGEABLE_CAPACITY, msg);	
	}
	public Float getACChargableCapacity() {
		return (Float) getProperty(PROPERTY_HAS_AC_CHARGEABLE_CAPACITY);	
	}
	public void setACChargableCapacity(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_CHARGEABLE_CAPACITY, msg);	
	}
	public Float getACEffectiveCapacityDisharging() {
		return (Float) getProperty(PROPERTY_HAS_AC_EFFECTIVE_CAPACITY_DISCHARGING);	
	}
	public void setACEffectiveCapacityDisharging(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_EFFECTIVE_CAPACITY_DISCHARGING, msg);	
	}
	public Float getACEffectiveCapacityCharging() {
		return (Float) getProperty(PROPERTY_HAS_AC_EFFECTIVE_CAPACITY_CHARGING);	
	}
	public void setACEffectiveCapacityCharging(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_EFFECTIVE_CAPACITY_CHARGING, msg);	
	}
	
	public StorageBattery() {
		super();
	}
	public StorageBattery(String uri) {
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
