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
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;

public class HouseHoldSmallWindTurbinePowerGeneration extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "HouseHoldSmallWindTurbinePowerGeneration";
	public static final String PROPERTY_HAS_SYSTEM_INTERCONNECTION_STATUS = EchonetOntology.NAMESPACE + "hasSystemInterconnectionStatus";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_GENERATED_ELECTRICITY_AMOUNT = EchonetOntology.NAMESPACE + "hasMeasuredInstantaneousGeneratedElectricityAmount";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_GENERATED_ELECTRICITY_AMOUNT = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeGeneratedElectricityAmount";
	public static final String PROPERTY_RESET_MEASURED_CUMULATIVE_GENERATED_ELECTRICITY_AMOUNT = EchonetOntology.NAMESPACE + "resetMeasuredCumulativeGeneratedElectricityAmount";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_SOLD_ELECTRICITY_AMOUNT = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeSoldElectricityAmount";
	public static final String PROPERTY_RESET_MEASURED_CUMULATIVE_SOLD_ELECTRICITY_AMOUNT = EchonetOntology.NAMESPACE + "resetMeasuredCumulativeSoldElectricityAmount";
	public static final String PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_1 = EchonetOntology.NAMESPACE + "hasPowerGenerationOutputLimitSetting1";
	public static final String PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_2 = EchonetOntology.NAMESPACE + "hasPowerGenerationOutputLimitSetting2";
	public static final String PROPERTY_HAS_AMOUNT_OF_ELECTRICITY_SOLD_LIMIT_SETTING = EchonetOntology.NAMESPACE + "hasAmountOfElectricitySoldLimitSetting";
	public static final String PROPERTY_HAS_RATED_POWER = EchonetOntology.NAMESPACE + "hasRatedPower";
	public static final String PROPERTY_HAS_MEASURED_WIND_SPEED = EchonetOntology.NAMESPACE + "hasMeasuredWindSpeed";
	public static final String PROPERTY_HAS_RATED_WIND_SPEED = EchonetOntology.NAMESPACE + "hasRatedWindSpeed";
	public static final String PROPERTY_HAS_CUT_IN_WIND_SPEED = EchonetOntology.NAMESPACE + "hasCutInWindSpeed";
	public static final String PROPERTY_HAS_CUT_OUT_WIND_SPEED = EchonetOntology.NAMESPACE + "hasCutOutWindSpeed";
	public static final String PROPERTY_HAS_EXTREME_WIND_SPEED = EchonetOntology.NAMESPACE + "hasExtremeWindSpeed";
	public static final String PROPERTY_HAS_BARKING_STATUS = EchonetOntology.NAMESPACE + "hasBarkingStatus";
	
	public OperationStatusValue getBarkingStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_BARKING_STATUS);	
	}
	public void setBarkingStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BARKING_STATUS, msg);	
	}
	public Float getExtremeWindSpeed() {
		return (Float) getProperty(PROPERTY_HAS_EXTREME_WIND_SPEED);	
	}
	public void setExtremeWindSpeed(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EXTREME_WIND_SPEED, msg);	
	}
	public Float getCutOutWindSpeed() {
		return (Float) getProperty(PROPERTY_HAS_CUT_OUT_WIND_SPEED);	
	}
	public void setCutOutWindSpeed(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUT_OUT_WIND_SPEED, msg);	
	}	
	public Float getCutInWindSpeed() {
		return (Float) getProperty(PROPERTY_HAS_CUT_IN_WIND_SPEED);	
	}
	public void setCutInWindSpeed(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUT_IN_WIND_SPEED, msg);	
	}
	public Float getRatedWindSpeed() {
		return (Float) getProperty(PROPERTY_HAS_RATED_WIND_SPEED);	
	}
	public void setRatedWindSpeed(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_WIND_SPEED, msg);	
	}
	public Float getMeasuredWindSpeed() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_WIND_SPEED);	
	}
	public void setMeasuredWindSpeed(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_WIND_SPEED, msg);	
	}
	public Float getRatedPower() {
		return (Float) getProperty(PROPERTY_HAS_RATED_POWER);	
	}
	public void setRatedPower(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER, msg);	
	}
	public Float getAmoundOfElectricitySoldLimitSetting() {
		return (Float) getProperty(PROPERTY_HAS_AMOUNT_OF_ELECTRICITY_SOLD_LIMIT_SETTING);	
	}
	public void setAmoundOfElectricitySoldLimitSetting(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AMOUNT_OF_ELECTRICITY_SOLD_LIMIT_SETTING, msg);	
	}
	public Float getPowerGenerationOutputLimitSetting2() {
		return (Float) getProperty(PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_2);	
	}
	public void setPowerGenerationOutputLimitSetting2(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_2, msg);	
	}
	public Float getPowerGenerationOutputLimitSetting1() {
		return (Float) getProperty(PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_1);	
	}
	public void setPowerGenerationOutputLimitSetting1(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_1, msg);	
	}
	public Float getMeasuredCumulativeSoldElectricityAmount() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_SOLD_ELECTRICITY_AMOUNT);	
	}
	public void setMeasuredCumulativeSoldElectricityAmount(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_SOLD_ELECTRICITY_AMOUNT, msg);	
	}
	public Float getMeasuredCumulativeGeneratedElectricityAmount() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_GENERATED_ELECTRICITY_AMOUNT);	
	}
	public void setMeasuredCumulativeGeneratedElectricityAmount(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_GENERATED_ELECTRICITY_AMOUNT, msg);	
	}
	public Float getMeasuredInstantaneousGeneratedElectricityAmount() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_GENERATED_ELECTRICITY_AMOUNT);	
	}
	public void setMeasuredInstantaneousGeneratedElectricityAmount(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_GENERATED_ELECTRICITY_AMOUNT, msg);	
	}
	public OperationFunctionSettingValue getSystemInterconnectionStatus() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_SYSTEM_INTERCONNECTION_STATUS);	
	}
	public void setSystemInterconnectionStatus(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SYSTEM_INTERCONNECTION_STATUS, msg);	
	}
	
	
	public HouseHoldSmallWindTurbinePowerGeneration() {
		super();
	}
	public HouseHoldSmallWindTurbinePowerGeneration(String uri) {
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
