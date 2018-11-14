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
import org.universAAL.ontology.echonetontology.values.ChargerDischargerTypeValue;
import org.universAAL.ontology.echonetontology.values.OperationModeSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStateSettingValue;

public class VehicleCharger extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "VehicleCharger";
	public static final String PROPERTY_HAS_RATED_CHARGE_CAPACITY = EchonetOntology.NAMESPACE + "hasRatedChargeCapacity";
	public static final String PROPERTY_HAS_VEHICLE_CONNECTION_CHARGEABLE_STATUS = EchonetOntology.NAMESPACE + "hasVehicleConnectionChargeableStatus";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "hasMinimumMaximumChargingElectricEnergy";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT = EchonetOntology.NAMESPACE + "hasMinimumMaximumChargingCurrent";
	public static final String PROPERTY_HAS_CHARGER_TYPE = EchonetOntology.NAMESPACE + "hasChargerType";
	public static final String PROPERTY_SET_VEHICLE_CONNECTION_CONFIRMATION = EchonetOntology.NAMESPACE + "setVehicleConnectionConfirmation";
	public static final String PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_CAPACITY = EchonetOntology.NAMESPACE + "hasVehicleMountedBatteryChargeableCapacity";
	public static final String PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_REMAINING_CAPACITY = EchonetOntology.NAMESPACE + "hasVehicleMountedBatteryRemainingChargeableCapacity";
	public static final String PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_USED_CAPACITY_1 = EchonetOntology.NAMESPACE + "hasUsedCapacityOfVehicleMountedBattery1";
	public static final String PROPERTY_HAS_RATED_VOLTAGE = EchonetOntology.NAMESPACE + "hasRatedVoltage";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "hasMeasuredInstantaneousChargingElectricEnergy";	
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeChargingElectricEnergy";
	public static final String PROPERTY_RESET_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "resetMeasuredCumulativeChargingDischargingElectricEnergy";
	public static final String PROPERTY_HAS_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "hasOperationModeSetting";
	public static final String PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1 = EchonetOntology.NAMESPACE + "hasRemainingStoredElectric1";
	public static final String PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3 = EchonetOntology.NAMESPACE + "hasRemainingStoredElectric3";
	public static final String PROPERTY_HAS_VEHICLE_ID = EchonetOntology.NAMESPACE + "hasVehicleID";
	public static final String PROPERTY_HAS_CHARGING_AMOUNT_SETTING = EchonetOntology.NAMESPACE + "hasChargingAmountSetting";
	public static final String PROPERTY_HAS_CHARGING_ELECTRIC_ENERGY_SETTING = EchonetOntology.NAMESPACE + "hasChargingElectricEnergySetting";
	public static final String PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING = EchonetOntology.NAMESPACE + "hasChargingElectricCurrentSetting";


	public Float getChargingAmountSetting() {
		return (Float) getProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING);	
	}
	public void setChargingAmountSetting(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING, msg);	
	}
	public String getVehicleID() {
		return  getProperty(PROPERTY_HAS_VEHICLE_ID).toString();	
	}
	public void setVehicleID(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEHICLE_ID, msg);	
	}
	public Float getVehicleMountedBatteryRemainingChargeableCapacity() {
		return (Float) getProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_REMAINING_CAPACITY);	
	}
	public void setVehicleMountedBatteryRemainingChargeableCapacity(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_REMAINING_CAPACITY, msg);	
	}
	public Float getVehicleMountedBatteryChargeableCapacity() {
		return (Float) getProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_CAPACITY);	
	}
	public void setVehicleMountedBatteryChargeableCapacity(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_CAPACITY, msg);	
	}
	public Float getChargingElectricCurrentSetting() {
		return (Float) getProperty(PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING);	
	}
	public void setChargingElectricCurrentSetting(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING, msg);	
	}
	
	public Float getChargingElectricEnergySetting() {
		return (Float) getProperty(PROPERTY_HAS_CHARGING_ELECTRIC_ENERGY_SETTING);	
	}
	public void setChargingElectricEnergySetting(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_ELECTRIC_ENERGY_SETTING, msg);	
	}
	
	public Float getRemainingStoredElectric3() {
		return (Float) getProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3);	
	}
	public void setRemainingStoredElectric3(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3, msg);	
	}
	
	public Float getRemainingStoredElectric1() {
		return (Float) getProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1);	
	}
	public void setRemainingStoredElectric1(Float msg) {
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
	public Float getMeasuredCumulativeChargingElectricEnergy() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY);	
	}
	public void setMeasuredCumulativeChargingElectricEnergy(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY, msg);	
	}
	
	public Float getMeasuredInstantaneousChargingElectricEnergy() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_ELECTRIC_ENERGY);	
	}
	public void setMeasuredInstantaneousChargingElectricEnergy(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_ELECTRIC_ENERGY, msg);	
	}
	public Float getRatedVoltage() {
		return (Float) getProperty(PROPERTY_HAS_RATED_VOLTAGE);	
	}
	public void setRatedVoltage(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_VOLTAGE, msg);	
	}
	
	public Float getUsedCapacityOfVehicleMountedBattery1() {
		return (Float) getProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_USED_CAPACITY_1);	
	}
	public void setUsedCapacityOfVehicleMountedBattery1(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_USED_CAPACITY_1, msg);	
	}
	public ChargerDischargerTypeValue getChargerType() {
		return (ChargerDischargerTypeValue) getProperty(PROPERTY_HAS_CHARGER_TYPE);	
	}
	public void setChargerType(ChargerDischargerTypeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGER_TYPE, msg);	
	}
	
	public String getMinimumMaximumChargingCurrent() {
		return  getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT).toString();	
	}
	public void setMinimumMaximumChargingCurrent(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT, msg);	
	}
	public String getMinimumMaximumChargingElectricEnergy() {
		return  getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_ENERGY).toString();	
	}
	public void setMinimumMaximumChargingElectricEnergy(String msg) {
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
	public Float getRatedChargeCapacity() {
		return (Float) getProperty(PROPERTY_HAS_RATED_CHARGE_CAPACITY);	
	}
	public void setRatedChargeCapacity(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_CHARGE_CAPACITY, msg);	
	}

	public VehicleCharger() {
		super();
	}
	public VehicleCharger(String uri) {
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
