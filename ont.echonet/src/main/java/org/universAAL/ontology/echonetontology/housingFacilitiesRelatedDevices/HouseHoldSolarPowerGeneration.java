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

public class HouseHoldSolarPowerGeneration extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "HouseHoldSolarPowerGeneration";
	public static final String PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE = EchonetOntology.NAMESPACE + "hasSystemInterconnectType";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_GENERATED_AMOUNT = EchonetOntology.NAMESPACE + "hasMeasuredCummulativeElectricEnergyGeneratedAmount";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_ELECTRIC_ENERGY_GENERATED_AMOUNT = EchonetOntology.NAMESPACE + "hasMeasuredInstantaneousElectricEnergyGeneratedAmount";
	public static final String PROPERTY_RESETTING_CUMMULATIVE_ELECTRIC_ENERGY_GENERATED_AMOUNT = EchonetOntology.NAMESPACE + "resetMeasuredCummulativeElectricEnergyGeneratedAmount";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_SOLD_AMOUNT = EchonetOntology.NAMESPACE + "hasMeasuredCummulativeElectricEnergySoldAmount";
	public static final String PROPERTY_RESETTING_CUMMULATIVE_ELECTRIC_ENERGY_SOLD_AMOUNT = EchonetOntology.NAMESPACE + "resetMeasuredCummulativeElectricEnergySoldAmount";
	public static final String PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_1 = EchonetOntology.NAMESPACE + "hasPowerGenerationOutputLimitSetting1";
	public static final String PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_2 = EchonetOntology.NAMESPACE + "hasPowerGenerationOutputLimitSetting2";
	public static final String PROPERTY_HAS_AMOUNT_OF_ELECTRICITY_SOLD_LIMIT_SETTING = EchonetOntology.NAMESPACE + "hasAmountOfElectricitySoldLimitSetting";
	public static final String PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_SYSTEM_INTERCONNECTED = EchonetOntology.NAMESPACE + "hasPowerGenerationOutputSystemInterconnected";
	public static final String PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_INDEPENDENT = EchonetOntology.NAMESPACE + "hasPowerGenerationOutputSystemIndependent";

	public Integer getPowerGenerationOutputSystemIndependent() {
		return (Integer) getProperty(PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_INDEPENDENT);	
	}
	public void setPowerGenerationOutputSystemIndependent(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_INDEPENDENT, msg);	
	}
	public Integer getPowerGenerationOutputSystemInterconnected() {
		return (Integer) getProperty(PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_SYSTEM_INTERCONNECTED);	
	}
	public void setPowerGenerationOutputSystemInterconnected(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_SYSTEM_INTERCONNECTED, msg);	
	}
	public Integer getAmountOfElectricitySoldLimitSetting() {
		return (Integer) getProperty(PROPERTY_HAS_AMOUNT_OF_ELECTRICITY_SOLD_LIMIT_SETTING);	
	}
	public void setAmountOfElectricitySoldLimitSetting(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AMOUNT_OF_ELECTRICITY_SOLD_LIMIT_SETTING, msg);	
	}
	public Integer getPowerGenerationOutputLimitSetting2() {
		return (Integer) getProperty(PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_2);	
	}
	public void setPowerGenerationOutputLimitSetting2(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_2, msg);	
	}
	public Integer getPowerGenerationOutputLimitSetting1() {
		return (Integer) getProperty(PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_1);	
	}
	public void setPowerGenerationOutputLimitSetting1(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_1, msg);	
	}
	public Float getMeasuredCummulativeElectricEnergySoldAmount() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_SOLD_AMOUNT);	
	}
	public void setMeasuredCummulativeElectricEnergySoldAmount(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_SOLD_AMOUNT, msg);	
	}
	public Integer getMeasuredInstantaneousElectricEnergyGeneratedAmount() {
		return (Integer) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_ELECTRIC_ENERGY_GENERATED_AMOUNT);	
	}
	public void setMeasuredInstantaneousElectricEnergyGeneratedAmount(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_ELECTRIC_ENERGY_GENERATED_AMOUNT, msg);	
	}
	public Float getMeasuredCummulativeElectricEnergyGeneratedAmount() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_GENERATED_AMOUNT);	
	}
	public void setMeasuredCummulativeElectricEnergyGeneratedAmount(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_GENERATED_AMOUNT, msg);	
	}
	public OperationFunctionSettingValue getSystemInterconnectType() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE);	
	}
	public void setSystemInterconnectType(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE, msg);	
	}
	
	public HouseHoldSolarPowerGeneration() {
		super();
	}
	public HouseHoldSolarPowerGeneration(String uri) {
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
