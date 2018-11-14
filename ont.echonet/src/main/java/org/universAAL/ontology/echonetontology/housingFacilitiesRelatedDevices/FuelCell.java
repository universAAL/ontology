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
import org.universAAL.ontology.echonetontology.values.OperationStateSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;

public class FuelCell extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "FuelCell";
	public static final String PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_IN_WATER_HEATER_MODE = EchonetOntology.NAMESPACE + "hasMeasuredWaterTemperatureInWaterHeaterMode";
	public static final String PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT= EchonetOntology.NAMESPACE + "hasRatedPowerGenerationOutput";
	public static final String PROPERTY_HAS_HEATING_VALUE_OF_HOT_WATER_STORAGE_TANK= EchonetOntology.NAMESPACE + "hasHeatingValueOfHotWaterStorageTank";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_GENERATION_OUTPUT = EchonetOntology.NAMESPACE + "hasMeasuredInstantaneousPowerGenerationOutput";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_POWER_GENERATION_OUTPUT = EchonetOntology.NAMESPACE + "hasMeasuredCummulativePowerGenerationOutput";
	public static final String PROPERTY_RESET_MEASURED_CUMMULATIVE_POWER_GENERATION_OUTPUT = EchonetOntology.NAMESPACE + "resetMeasuredCummulativePowerGenerationOutput";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_GAS_CONSUMPTION = EchonetOntology.NAMESPACE + "hasMeasuredInstantaneousGasConsumption";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION = EchonetOntology.NAMESPACE + "hasMeasuredCummulativeGasConsumption";
	public static final String PROPERTY_RESET_MEASURED_CUMMULATIVE_GAS_CONSUMPTION = EchonetOntology.NAMESPACE + "resetMeasuredCummulativeGasConsumption";
	public static final String PROPERTY_HAS_POWER_GENERATION_SETTING = EchonetOntology.NAMESPACE + "hasPowerGenerationSetting";
	public static final String PROPERTY_HAS_POWER_GENERATION_STATE= EchonetOntology.NAMESPACE + "hasPowerGenerationState";
	public static final String PROPERTY_HAS_MEASURED_IN_HOUSE_CUMMULATIVE_POWER_CONSUMPTION = EchonetOntology.NAMESPACE + "hasMeasuredInHouseCummulativePowerConsumption";
	public static final String PROPERTY_HAS_MEASURED_IN_HOUSE_INSTANTANEOUS_POWER_POWER_CONSUMPTION = EchonetOntology.NAMESPACE + "hasMeasuredInHouseInstantaneousPowerConsumption";
	public static final String PROPERTY_RESET_MEASURED_IN_HOUSE_CUMMULATIVE_POWER_CONSUMPTION  = EchonetOntology.NAMESPACE + "resetMeasuredInHouseCummulativePowerConsumption";
	public static final String PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE = EchonetOntology.NAMESPACE + "hasSystemInterconnectType";
	public static final String PROPERTY_HAS_MEASURED_REMAINING_HOT_WATER_AMOUNT = EchonetOntology.NAMESPACE + "hasMeasuredRemainingHotWaterAmount";
	public static final String PROPERTY_HAS_TANK_CAPACITY = EchonetOntology.NAMESPACE + "hasTankCapacity";
		
	public Float getTankCapacity() {
		return (Float) getProperty(PROPERTY_HAS_TANK_CAPACITY);	
	}
	public void setTankCapacity(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TANK_CAPACITY, msg);	
	}
	public Float getMeasuredRemainingHotWaterAmount() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_REMAINING_HOT_WATER_AMOUNT);	
	}
	public void setMeasuredRemainingHotWaterAmount(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_REMAINING_HOT_WATER_AMOUNT, msg);	
	}
	public OperationFunctionSettingValue getSystemInterconnectType() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE);	
	}
	public void setSystemInterconnectType(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE, msg);	
	}
	public Float getMeasuredInHouseInstantaneousPowerConsumption() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_IN_HOUSE_INSTANTANEOUS_POWER_POWER_CONSUMPTION);	
	}
	public void setMeasuredInHouseInstantaneousPowerConsumption(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_IN_HOUSE_INSTANTANEOUS_POWER_POWER_CONSUMPTION, msg);	
	}
	public Float getMeasuredInHouseCummulativePowerConsumption() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_IN_HOUSE_CUMMULATIVE_POWER_CONSUMPTION);	
	}
	public void setMeasuredInHouseCummulativePowerConsumption(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_IN_HOUSE_CUMMULATIVE_POWER_CONSUMPTION, msg);	
	}
	public OperationStateSettingValue getPowerGenerationState() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_POWER_GENERATION_SETTING);	
	}
	public void setPowerGenerationState(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_GENERATION_SETTING, msg);	
	}
	public OperationStatusValue getPowerGenerationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_POWER_GENERATION_SETTING);	
	}
	public void setPowerGenerationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_GENERATION_SETTING, msg);	
	}
	public Float getMeasuredCummulativeGasConsumption() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION);	
	}
	public void setMeasuredCummulativeGasConsumption(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION, msg);	
	}
	public Float getMeasuredInstantaneousGasConsumption() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_GAS_CONSUMPTION);	
	}
	public void setMeasuredInstantaneousGasConsumption(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_GAS_CONSUMPTION, msg);	
	}
	public Float getMeasuredCummulativePowerGenerationOutput() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_POWER_GENERATION_OUTPUT);	
	}
	public void setMeasuredCummulativePowerGenerationOutput(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_POWER_GENERATION_OUTPUT, msg);	
	}
	public Float getMeasuredInstantaneousPowerGenerationOutput() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_GENERATION_OUTPUT);	
	}
	public void setMeasuredInstantaneousPowerGenerationOutput(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_GENERATION_OUTPUT, msg);	
	}
	public Float getHeatingValueOfHotWaterStorageTank() {
		return (Float) getProperty(PROPERTY_HAS_HEATING_VALUE_OF_HOT_WATER_STORAGE_TANK);	
	}
	public void setHeatingValueOfHotWaterStorageTank(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_VALUE_OF_HOT_WATER_STORAGE_TANK, msg);	
	}
	public Float getRatedPowerGenerationOutput() {
		return (Float) getProperty(PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT);	
	}
	public void setRatedPowerGenerationOutput(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT, msg);	
	}
	public Float getMeasuredWaterTemperatureInWaterHeaterMode() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_IN_WATER_HEATER_MODE);	
	}
	public void setMeasuredWaterTemperatureInWaterHeaterMode(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_IN_WATER_HEATER_MODE, msg);	
	}
	
	public FuelCell() {
		super();
	}
	public FuelCell(String uri) {
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
