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
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.MinMaxSettingValue;
import org.universAAL.ontology.echonet.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonet.values.ChargerDischargerTypeValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;

public class ElectricVehicleChargerDischager extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ElectricVehicleChargerDischager";
	public static final String PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_DISCHARGEABLE_CAPACITY_1 = EchonetOntology.NAMESPACE + "hasVehicleMountedBattery1_DischargeableCapacity";
	public static final String PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_DISCHARGEABLE_CAPACITY_2 = EchonetOntology.NAMESPACE + "hasVehicleMountedBattery2_DischargeableCapacity";
	public static final String PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_REMANING_DISCHARGEABLE_CAPACITY_1 = EchonetOntology.NAMESPACE + "hasVehicleMountedBattery1_RemainingDischargeableCapacity";
	public static final String PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_REMANING_DISCHARGEABLE_CAPACITY_2 = EchonetOntology.NAMESPACE + "hasVehicleMountedBattery2_RemainingDischargeableCapacity";
	public static final String PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_REMANING_DISCHARGEABLE_CAPACITY_3 = EchonetOntology.NAMESPACE + "hasVehicleMountedBattery3_RemainingDischargeableCapacity";
	public static final String PROPERTY_HAS_RATED_CHARGE_CAPACITY = EchonetOntology.NAMESPACE + "hasRatedChargeCapacity";
	public static final String PROPERTY_HAS_RATED_DISCHARGE_CAPACITY = EchonetOntology.NAMESPACE + "hasRatedDisChargeCapacity";
	public static final String PROPERTY_HAS_VEHICLE_CONNECTION_CHARGEABLE_STATUS = EchonetOntology.NAMESPACE + "hasVehicleConnectionChargeableStatus";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "hasMinimumMaximumChargingElectricEnergy";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT = EchonetOntology.NAMESPACE + "hasMinimumMaximumChargingCurrent";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "hasMinimumMaximumDisChargingElectricEnergy";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_CURRENT = EchonetOntology.NAMESPACE + "hasMinimumMaximumDisChargingCurrent";
	public static final String PROPERTY_HAS_CHARGER_TYPE = EchonetOntology.NAMESPACE + "hasChargerType";
	public static final String PROPERTY_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_CAPACITY = EchonetOntology.NAMESPACE + "hasVehicleMountedBatteryChargeableCapacity";
	public static final String PROPERTY_VEHICLE_MOUNTED_BATTERY_REMAINING_CHARGEABLE_CAPACITY = EchonetOntology.NAMESPACE + "hasVehicleMountedBatteryRemainingChargeableCapacity";
	public static final String PROPERTY_SET_VEHICLE_CONNECTION_CONFIRMATION = EchonetOntology.NAMESPACE + "setVehicleConnectionConfirmation";
	public static final String PROPERTY_HAS_USED_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_1 = EchonetOntology.NAMESPACE + "hasUsedCapacityOfVehicleMountedBattery1";
	public static final String PROPERTY_HAS_USED_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_2 = EchonetOntology.NAMESPACE + "hasUsedCapacityOfVehicleMountedBattery2";
	public static final String PROPERTY_HAS_RATED_VOLTAGE = EchonetOntology.NAMESPACE + "hasRatedVoltage";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "hasMeasuredInstantaneousChargingDisChargingElectricEnergy";	
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_CURRENT = EchonetOntology.NAMESPACE + "hasMeasuredInstantaneousDisChargingChargingCurrent";	
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_VOLTAGE = EchonetOntology.NAMESPACE + "hasMeasuredInstantaneousDisChargingChargingVoltage";	
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeDisChargingElectricEnergy";
	public static final String PROPERTY_RESET_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "resetMeasuredCumulativeDisChargingElectricEnergy";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeChargingElectricEnergy";
	public static final String PROPERTY_RESET_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "resetMeasuredCumulativeChargingDischargingElectricEnergy";
	public static final String PROPERTY_HAS_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "hasOperationModeSetting";
	public static final String PROPERTY_HAS_SYSTEM_INTERCONNECTED_TYPE = EchonetOntology.NAMESPACE + "hasSystemInterconnectedType";
	public static final String PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1 = EchonetOntology.NAMESPACE + "hasRemainingStoredElectric1";
	public static final String PROPERTY_HAS_REMAINING_STORED_ELECTRIC_2 = EchonetOntology.NAMESPACE + "hasRemainingStoredElectric2";
	public static final String PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3 = EchonetOntology.NAMESPACE + "hasRemainingStoredElectric3";
	public static final String PROPERTY_HAS_VEHICLE_ID = EchonetOntology.NAMESPACE + "hasVehicleID";
	public static final String PROPERTY_HAS_CHARGING_AMOUNT_SETTING_1 = EchonetOntology.NAMESPACE + "hasChargingAmountSetting1";
	public static final String PROPERTY_HAS_CHARGING_AMOUNT_SETTING_2 = EchonetOntology.NAMESPACE + "hasChargingAmountSetting2";
	public static final String PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING = EchonetOntology.NAMESPACE + "hasDisChargingAmountSetting";
	public static final String PROPERTY_HAS_CHARGING_ELECTRIC_ENERGY_SETTING = EchonetOntology.NAMESPACE + "hasChargingElectricEnergySetting";
	public static final String PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING = EchonetOntology.NAMESPACE + "hasChargingElectricCurrentSetting";
	public static final String PROPERTY_HAS_DISCHARGING_ELECTRIC_ENERGY_SETTING = EchonetOntology.NAMESPACE + "hasDisChargingElectricEnergySetting";
	public static final String PROPERTY_HAS_DISCHARGING_ELECTRIC_CURRENT_SETTING = EchonetOntology.NAMESPACE + "hasDisChargingElectricCurrentSetting";
	public static final String PROPERTY_HAS_RATED_VOLTAGE_INDEPENDENT = EchonetOntology.NAMESPACE + "hasRatedVoltageIndependent";
	
	public MeasuredValue getRatedVoltageIndependent() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_VOLTAGE_INDEPENDENT);	
	}
	public void setRatedVoltageIndependent(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_VOLTAGE_INDEPENDENT, msg);	
	}
	public MeasuredValue getDisChargingElectricEnergySetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_DISCHARGING_ELECTRIC_ENERGY_SETTING);	
	}
	public void setDisChargingElectricEnergySetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DISCHARGING_ELECTRIC_ENERGY_SETTING, msg);	
	}
	public MeasuredValue getDisChargingElectricCurrentSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_DISCHARGING_ELECTRIC_CURRENT_SETTING);	
	}
	public void setDisChargingElectricCurrentSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DISCHARGING_ELECTRIC_CURRENT_SETTING, msg);	
	}
	public MeasuredValue getDisChargingAmountSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING);	
	}
	public void setDisChargingAmountSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING, msg);	
	}
	public MeasuredValue getChargingAmountSetting2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING_2);	
	}
	public void setChargingAmountSetting2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING_2, msg);	
	}
	public MeasuredValue getChargingAmountSetting1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING_1);	
	}
	public void setChargingAmountSetting1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING_1, msg);	
	}
	public String getVehicleID() {
		return (String) getProperty(PROPERTY_HAS_VEHICLE_ID);	
	}
	public void setVehicleID(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEHICLE_ID, msg);	
	}
	public MeasuredValue getRemainingStoredElectric2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_2);	
	}
	public void setRemainingStoredElectric2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_2, msg);	
	}
	public OperationFunctionSettingValue getSystemInterconnectedType() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_SYSTEM_INTERCONNECTED_TYPE);	
	}
	public void setSystemInterconnectedType(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SYSTEM_INTERCONNECTED_TYPE, msg);	
	}
	public MeasuredValue getMeasuredCumulativeDisChargingElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY);	
	}
	public void setMeasuredCumulativeDisChargingElectricEnergy(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY, msg);	
	}
	public MeasuredValue getMeasuredInstantaneousDisChargingChargingVoltage() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_VOLTAGE);	
	}
	public void setMeasuredInstantaneousDisChargingChargingVoltage(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_VOLTAGE, msg);	
	}
	public MeasuredValue getMeasuredInstantaneousDisChargingChargingCurrent() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_CURRENT);	
	}
	public void setMeasuredInstantaneousDisChargingChargingCurrent(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_CURRENT, msg);	
	}
	public MeasuredValue getMeasuredInstantaneousChargingDisChargingElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_ENERGY);	
	}
	public void setMeasuredInstantaneousChargingDisChargingElectricEnergy(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_ENERGY, msg);	
	}
	public MeasuredValue getVehicleMountedBatteryRemainingChargeableCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_VEHICLE_MOUNTED_BATTERY_REMAINING_CHARGEABLE_CAPACITY);	
	}
	public void setVehicleMountedBatteryRemainingChargeableCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_VEHICLE_MOUNTED_BATTERY_REMAINING_CHARGEABLE_CAPACITY, msg);	
	}
	public MeasuredValue getVehicleMountedBatteryChargeableCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_CAPACITY);	
	}
	public void setVehicleMountedBatteryChargeableCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_CAPACITY, msg);	
	}
	public MeasuredValue getVehicleMountedBattery3_RemainingDischargeableCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_REMANING_DISCHARGEABLE_CAPACITY_3);	
	}
	public void setVehicleMountedBattery3_RemainingDischargeableCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_REMANING_DISCHARGEABLE_CAPACITY_3, msg);	
	}
	public MeasuredValue getVehicleMountedBattery2_RemainingDischargeableCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_REMANING_DISCHARGEABLE_CAPACITY_2);	
	}
	public void setVehicleMountedBattery2_RemainingDischargeableCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_REMANING_DISCHARGEABLE_CAPACITY_2, msg);	
	}
	public MeasuredValue getVehicleMountedBattery1_RemainingDischargeableCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_REMANING_DISCHARGEABLE_CAPACITY_1);	
	}
	public void setVehicleMountedBattery1_RemainingDischargeableCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_REMANING_DISCHARGEABLE_CAPACITY_1, msg);	
	}
	public MeasuredValue getVehicleMountedBattery2_DischargeableCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_DISCHARGEABLE_CAPACITY_2);	
	}
	public void setVehicleMountedBattery2_DischargeableCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_DISCHARGEABLE_CAPACITY_2, msg);	
	}
	public MeasuredValue getVehicleMountedBattery1_DischargeableCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_DISCHARGEABLE_CAPACITY_1);	
	}
	public void setVehicleMountedBattery1_DischargeableCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_DISCHARGEABLE_CAPACITY_1, msg);	
	}
	public MeasuredValue getChargingElectricCurrentSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING);	
	}
	public void setChargingElectricCurrentSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING, msg);	
	}
	
	public MeasuredValue getChargingElectricEnergySetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHARGING_ELECTRIC_ENERGY_SETTING);	
	}
	public void setChargingElectricEnergySetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_ELECTRIC_ENERGY_SETTING, msg);	
	}
	
	public MeasuredValue getRemainingStoredElectric3() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3);	
	}
	public void setRemainingStoredElectric3(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3, msg);	
	}
	
	public MeasuredValue getRemainingStoredElectric1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1);	
	}
	public void setRemainingStoredElectric1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1, msg);	
	}
	
	public OperationModeSettingValue getOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE_SETTING);	
	}
	public void setOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_MODE_SETTING, msg);	
	}
	public MeasuredValue getMeasuredCumulativeChargingElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY);	
	}
	public void setMeasuredCumulativeChargingElectricEnergy(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY, msg);	
	}
	
	public MeasuredValue getRatedVoltage() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_VOLTAGE);	
	}
	public void setRatedVoltage(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_VOLTAGE, msg);	
	}
	
	public MeasuredValue getUsedCapacityOfVehicleMountedBattery1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_USED_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_1);	
	}
	public void setUsedCapacityOfVehicleMountedBattery1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_USED_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_1, msg);	
	}
	public MeasuredValue getUsedCapacityOfVehicleMountedBattery2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_USED_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_2);	
	}
	public void setUsedCapacityOfVehicleMountedBattery2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_USED_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_2, msg);	
	}
	public ChargerDischargerTypeValue getChargerType() {
		return (ChargerDischargerTypeValue) getProperty(PROPERTY_HAS_CHARGER_TYPE);	
	}
	public void setChargerType(ChargerDischargerTypeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGER_TYPE, msg);	
	}	
	public MinMaxSettingValue getMinimumMaximumDisChargingCurrent() {
		return (MinMaxSettingValue) getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_CURRENT);	
	}
	public void setMinimumMaximumDisChargingCurrent(MinMaxSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_CURRENT, msg);	
	}
	public MinMaxSettingValue getMinimumMaximumDisChargingElectricEnergy() {
		return (MinMaxSettingValue) getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_ENERGY);	
	}
	public void setMinimumMaximumDisChargingElectricEnergy(MinMaxSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_ENERGY, msg);	
	}
	public MinMaxSettingValue getMinimumMaximumChargingCurrent() {
		return (MinMaxSettingValue) getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT);	
	}
	public void setMinimumMaximumChargingCurrent(MinMaxSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT, msg);	
	}
	public MinMaxSettingValue getMinimumMaximumChargingElectricEnergy() {
		return (MinMaxSettingValue) getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_ENERGY);	
	}
	public void setMinimumMaximumChargingElectricEnergy(MinMaxSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_ENERGY, msg);	
	}
	public OperationStateSettingValue getVehicleConnectionChargeableStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_VEHICLE_CONNECTION_CHARGEABLE_STATUS);	
	}
	public void setVehicleConnectionChargeableStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEHICLE_CONNECTION_CHARGEABLE_STATUS, msg);	
	}
	public MeasuredValue getRatedDisChargeCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_DISCHARGE_CAPACITY);	
	}
	public void setRatedDisChargeCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_DISCHARGE_CAPACITY, msg);	
	}
	public MeasuredValue getRatedChargeCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_CHARGE_CAPACITY);	
	}
	public void setRatedChargeCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_CHARGE_CAPACITY, msg);	
	}

	public ElectricVehicleChargerDischager() {
		super();
	}
	public ElectricVehicleChargerDischager(String uri) {
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
