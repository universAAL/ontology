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
package org.universAAL.ontology.echonetontology.cookingHouseholdRelatedDevices;



import org.universAAL.ontology.echonetontology.EchonetOntology;
import org.universAAL.ontology.echonetontology.EchonetSuperDevice;
import org.universAAL.ontology.echonetontology.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationModeSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStateSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;
import org.universAAL.ontology.echonetontology.values.ShapeValue;

public class CommercialShowcase extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "CommercialShowcase";
	public static final String PROPERTY_HAS_OPERATION_MODE_SETTING= EchonetOntology.NAMESPACE + "hasOperationModeSetting";
	public static final String PROPERTY_HAS_MEASURED_DISCHARGE_TEMPERATURE= EchonetOntology.NAMESPACE + "hasMeasuredDischargeTemperature";
	public static final String PROPERTY_HAS_GROUP_INFORMATION= EchonetOntology.NAMESPACE + "hasGroupInformation";
	public static final String PROPERTY_HAS_INTERNAL_LIGHTING_OPERATION_STATUS= EchonetOntology.NAMESPACE + "hasInternalLightingOperationStatus";
	public static final String PROPERTY_HAS_EXTERNAL_LIGHTING_OPERATION_STATUS= EchonetOntology.NAMESPACE + "hasExternalLightingOperationStatus";
	public static final String PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS= EchonetOntology.NAMESPACE + "hasCompressorOperationStatus";
	public static final String PROPERTY_HAS_MEASURED_INTERNAL_TEMPERATURE= EchonetOntology.NAMESPACE + "hasMeasuredInternalTemperature";
	public static final String PROPERTY_HAS_FREEZING_CAPABILITY_VALUE= EchonetOntology.NAMESPACE + "hasFreezingCapabilityValue";
	public static final String PROPERTY_HAS_DEFROSTING_HEATER_POWER_CONSUMPTION= EchonetOntology.NAMESPACE + "hasDefrostingHeaterPowerConsumption";
	public static final String PROPERTY_HAS_FAN_MOTER_POWER_CONSUMPTION= EchonetOntology.NAMESPACE + "hasFanMotorPowerConsumption";
	public static final String PROPERTY_HAS_HEATER_MODE= EchonetOntology.NAMESPACE + "hasHeaterMode";
	public static final String PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_TYPE= EchonetOntology.NAMESPACE + "hasInsideTheShowcaseLightingType";
	public static final String PROPERTY_HAS_OUTSIDE_THE_CASE_LIGHTING_TYPE= EchonetOntology.NAMESPACE + "hasOutsideTheCaseLightingType";
	public static final String PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_ILLUMINANCE_LEVEL= EchonetOntology.NAMESPACE + "hasInsideTheShowcaseLightingIlluminanceLevel";
	public static final String PROPERTY_HAS_OUTSIDE_THE_CASE_LIGHTING_ILLUMINANCE_LEVEL= EchonetOntology.NAMESPACE + "hasOutsideTheCaseLightingIlluminanceLevel";
	public static final String PROPERTY_HAS_INSIDE_THE_CASE_TEMPERATURE_SETTING= EchonetOntology.NAMESPACE + "hasInsideTheCaseTemperatureSetting";
	public static final String PROPERTY_HAS_SHOWCASE_TYPE_INFORMATION= EchonetOntology.NAMESPACE + "hasShowCaseTypeInformation";
	public static final String PROPERTY_HAS_DOOR_TYPE_INFORMATION= EchonetOntology.NAMESPACE + "hasDoorTypeInformation";
	public static final String PROPERTY_HAS_SHOWCASE_CONFIGURATION_INFORMATION= EchonetOntology.NAMESPACE + "hasShowcaseConfigurationInformation";
	public static final String PROPERTY_HAS_SHOWCASE_SHAPE_INFORMATION= EchonetOntology.NAMESPACE + "hasShowcaseShapeInformation";
	public static final String PROPERTY_HAS_INSIDE_THE_CASE_TEMPERATURE_RANGE_INFORMATION= EchonetOntology.NAMESPACE + "hasInsideTheCaseTemperatureRangeInformation";

	public OperationStatusValue getInsideTheCaseTemperatureRangeInformation() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_INSIDE_THE_CASE_TEMPERATURE_RANGE_INFORMATION);	
	}
	public void setInsideTheCaseTemperatureRangeInformation(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INSIDE_THE_CASE_TEMPERATURE_RANGE_INFORMATION, msg);	
	}
	public ShapeValue getShowcaseShapeInformation() {
		return (ShapeValue) getProperty(PROPERTY_HAS_SHOWCASE_SHAPE_INFORMATION);	
	}
	public void setShowcaseShapeInformation(ShapeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SHOWCASE_SHAPE_INFORMATION, msg);	
	}
	public OperationFunctionSettingValue getShowcaseConfigurationInformation() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_SHOWCASE_CONFIGURATION_INFORMATION);	
	}
	public void setShowcaseConfigurationInformation(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SHOWCASE_CONFIGURATION_INFORMATION, msg);	
	}
	public OperationStateSettingValue getDoorTypeInformation() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_DOOR_TYPE_INFORMATION);	
	}
	public void setDoorTypeInformation(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DOOR_TYPE_INFORMATION, msg);	
	}
	public OperationFunctionSettingValue getShowCaseTypeInformation() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_SHOWCASE_TYPE_INFORMATION);	
	}
	public void setShowCaseTypeInformation(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SHOWCASE_TYPE_INFORMATION, msg);	
	}
	public Float getInsideTheCaseTemperatureSetting() {
		return (Float) getProperty(PROPERTY_HAS_INSIDE_THE_CASE_TEMPERATURE_SETTING);	
	}
	public void setInsideTheCaseTemperatureSetting(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INSIDE_THE_CASE_TEMPERATURE_SETTING, msg);	
	}
	public Float getOutsideTheCaseLightingIlluminanceLevel() {
		return (Float) getProperty(PROPERTY_HAS_OUTSIDE_THE_CASE_LIGHTING_ILLUMINANCE_LEVEL);	
	}
	public void setOutsideTheCaseLightingIlluminanceLevel(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OUTSIDE_THE_CASE_LIGHTING_ILLUMINANCE_LEVEL, msg);	
	}
	public Float getInsideTheShowcaseLightingIlluminanceLevel() {
		return (Float) getProperty(PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_ILLUMINANCE_LEVEL);	
	}
	public void setInsideTheCaseLightingIlluminanceLevel(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_ILLUMINANCE_LEVEL, msg);	
	}
	public OperationFunctionSettingValue getOutsideTheShowcaseLightingType() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_ILLUMINANCE_LEVEL);	
	}
	public void setOutsideTheCaseLightingType(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_ILLUMINANCE_LEVEL, msg);	
	}
	public OperationFunctionSettingValue getInsideTheShowcaseLightingType() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_TYPE);	
	}
	public void setInsideTheShowcaseLightingType(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_TYPE, msg);	
	}
	public OperationStatusValue getHeaterMode() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_HEATER_MODE);	
	}
	public void setHeaterMode(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATER_MODE, msg);	
	}
	public Float getFanMotorPowerConsumption() {
		return (Float) getProperty(PROPERTY_HAS_FAN_MOTER_POWER_CONSUMPTION);	
	}
	public void setFanMotorPowerConsumption(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FAN_MOTER_POWER_CONSUMPTION, msg);	
	}
	public Float getDefrostingHeaterPowerConsumption() {
		return (Float) getProperty(PROPERTY_HAS_DEFROSTING_HEATER_POWER_CONSUMPTION);	
	}
	public void setDefrostingHeaterPowerConsumption(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DEFROSTING_HEATER_POWER_CONSUMPTION, msg);	
	}
	public Float getFreezingCapabilityValue() {
		return (Float) getProperty(PROPERTY_HAS_FREEZING_CAPABILITY_VALUE);	
	}
	public void setFreezingCapabilityValue(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FREEZING_CAPABILITY_VALUE, msg);	
	}
	public Float getMeasuredInternalTemperature() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_INTERNAL_TEMPERATURE);	
	}
	public void setMeasuredInternalTemperature(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INTERNAL_TEMPERATURE, msg);	
	}
	public OperationStatusValue getCompressorOperationStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS);	
	}
	public void setCompressorOperationStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS, msg);	
	}
	public OperationStatusValue getExternalLightingOperationStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_EXTERNAL_LIGHTING_OPERATION_STATUS);	
	}
	public void setExternalLightingOperationStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EXTERNAL_LIGHTING_OPERATION_STATUS, msg);	
	}
	public OperationStatusValue getInternalLightingOperationStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_INTERNAL_LIGHTING_OPERATION_STATUS);	
	}
	public void setInternalLightingOperationStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INTERNAL_LIGHTING_OPERATION_STATUS, msg);	
	}
	public String getGroupInformation() {
		return (String) getProperty(PROPERTY_HAS_GROUP_INFORMATION);	
	}
	public void setGroupInformation(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_GROUP_INFORMATION, msg);	
	}
	public Float getMeasuredDischargeTemperature() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_DISCHARGE_TEMPERATURE);	
	}
	public void setMeasuredDischargeTemperature(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_DISCHARGE_TEMPERATURE, msg);	
	}
	public OperationModeSettingValue getOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE_SETTING);	
	}
	public void setOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_MODE_SETTING, msg);	
	}
	

	
	public CommercialShowcase() {
		super();
	}
	public CommercialShowcase(String uri) {
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
