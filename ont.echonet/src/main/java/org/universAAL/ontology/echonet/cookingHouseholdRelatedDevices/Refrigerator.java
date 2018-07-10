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
package org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class Refrigerator extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "Refrigerator";
	public static final String PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS = EchonetOntology.NAMESPACE + "hasDoorOpenCloseStatus";
	public static final String PROPERTY_HAS_DOOR_OPEN_WARNING = EchonetOntology.NAMESPACE + "hasDoorOpenWarning";
	public static final String PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_DOOR_STATUS = EchonetOntology.NAMESPACE + "hasRefrigeratorCompartmentDoorStatus";
	public static final String PROPERTY_HAS_FREEZER_COMPARTMENT_DOOR_STATUS = EchonetOntology.NAMESPACE + "hasFreezerCompartmentDoorStatus";
	public static final String PROPERTY_HAS_ICE_COMPARTMENT_DOOR_STATUS = EchonetOntology.NAMESPACE + "hasIceCompartmentDoorStatus";
	public static final String PROPERTY_HAS_VEGETABLE_COMPARTMENT_DOOR_STATUS = EchonetOntology.NAMESPACE + "hasVegetableCompartmentDoorStatus";
	public static final String PROPERTY_HAS_MULTI_REFRIGERATING_MODE_COMPARTMENT_DOOR_STATUS = EchonetOntology.NAMESPACE + "hasMultiRefrigeratingModeCompartmentDoorStatus";
	public static final String PROPERTY_HAS_MAXIMUM_ALLOWABLE_TEMEPRATURE_SETTING_LEVEL = EchonetOntology.NAMESPACE + "hasMaximumAllowableTemperatureSettingLevel";
	public static final String PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_TEMPERATURER_SETTING = EchonetOntology.NAMESPACE + "hasRefrigeratorCompartmentTemperatureSetting";
	public static final String PROPERTY_HAS_FREEZER_COMPARTMENT_TEMPERATURER_SETTING = EchonetOntology.NAMESPACE + "hasFreezerCompartmentTemperatureSetting";
	public static final String PROPERTY_HAS_ICE_COMPARTMENT_TEMPERATURER_SETTING = EchonetOntology.NAMESPACE + "hasIceCompartmentTemperatureSetting";
	public static final String PROPERTY_HAS_VEGETABLE_COMPARTMENT_TEMPERATURER_SETTING = EchonetOntology.NAMESPACE + "hasVegetableCompartmentTemperatureSetting";
	public static final String PROPERTY_HAS_MULTI_REFRIGERATOR_COMPARTMENT_TEMPERATURER_SETTING = EchonetOntology.NAMESPACE + "hasMultiRefrigeratorCompartmentTemperatureSetting";
	public static final String PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_TEMPERATURER_LEVEL_SETTING = EchonetOntology.NAMESPACE + "hasRefrigeratorCompartmentTemperatureLevelSetting";
	public static final String PROPERTY_HAS_FREEZER_COMPARTMENT_TEMPERATURER_LEVEL_SETTING = EchonetOntology.NAMESPACE + "hasFreezerCompartmentTemperatureLevelSetting";
	public static final String PROPERTY_HAS_ICE_COMPARTMENT_TEMPERATURER_LEVEL_SETTING = EchonetOntology.NAMESPACE + "hasIceCompartmentTemperatureLevelSetting";
	public static final String PROPERTY_HAS_VEGETABLE_COMPARTMENT_TEMPERATURER_LEVEL_SETTING = EchonetOntology.NAMESPACE + "hasVegetableCompartmentTemperatureLevelSetting";
	public static final String PROPERTY_HAS_MULTI_REFRIGERATOR_COMPARTMENT_TEMPERATURER_LEVEL_SETTING = EchonetOntology.NAMESPACE + "hasMultiRefrigeratorCompartmentTemperatureLevelSetting";
	public static final String PROPERTY_HAS_MEASURED_REFRIGERATOR_COMPARTMENT_TEMPERATURER = EchonetOntology.NAMESPACE + "hasMeasuredRefrigeratorCompartmentTemperature";
	public static final String PROPERTY_HAS_MEASURED_FREEZER_COMPARTMENT_TEMPERATURER = EchonetOntology.NAMESPACE + "hasMeasuredFreezerCompartmentTemperature";
	public static final String PROPERTY_HAS_MEASURED_SUB_ZERO_FRESH_COMPARTMENT_TEMPERATURER = EchonetOntology.NAMESPACE + "hasMeasuredSubZeroFreshCompartmentTemperature";
	public static final String PROPERTY_HAS_MEASURED_VEGETABLE_COMPARTMENT_TEMPERATURER = EchonetOntology.NAMESPACE + "hasMeasuredVegetableCompartmentTemperature";
	public static final String PROPERTY_HAS_MEASURED_MULTI_REFRIGERATOR_COMPARTMENT_TEMPERATURER = EchonetOntology.NAMESPACE + "hasMeasuredMultiRefrigeratorCompartmentTemperature";
	public static final String PROPERTY_HAS_COMPRESSOR_ROTATION_SPEED = EchonetOntology.NAMESPACE + "hasCompressorRotationSpeed";
	public static final String PROPERTY_HAS_MEASURED_ELECTRIC_CURRENT_CONSUMPTION = EchonetOntology.NAMESPACE + "hasMeasuredElectricCurrentConsumption";
	public static final String PROPERTY_HAS_RATED_POWER_CONSUMPTION = EchonetOntology.NAMESPACE + "hasRatedPowerConsumption";
	public static final String PROPERTY_HAS_QUICK_FREEZE_FUNCTION_SETTING = EchonetOntology.NAMESPACE + "hasQuickFreezeFunctionSetting";
	public static final String PROPERTY_HAS_QUICK_REFRIGERATION_FUNCTION_SETTING = EchonetOntology.NAMESPACE + "hasQuickRefrigerationFunctionSetting";
	public static final String PROPERTY_HAS_ICE_MAKER_SETTING = EchonetOntology.NAMESPACE + "hasIceMakerSetting";
	public static final String PROPERTY_HAS_ICE_MAKER_OPERATION_STATUS = EchonetOntology.NAMESPACE + "hasIceMakerOperationStatus";
	public static final String PROPERTY_HAS_ICE_MAKER_WATER_TANK_STATUS = EchonetOntology.NAMESPACE + "hasIceMakerWaterTankStatus";
	public static final String PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_HUMIDIFICATION_FUNCTION_SETTING = EchonetOntology.NAMESPACE + "hasRefrigeratorCompartmentHumidificationFunctionSetting";
	public static final String PROPERTY_HAS_VEGETABLE_COMPARTMENT_HUMIDIFICATION_FUNCTION_SETTING = EchonetOntology.NAMESPACE + "hasVegetableCompartmentHumidificationFunctionSetting";
	public static final String PROPERTY_HAS_DEODORIZATION_FUNCTION_SETTING = EchonetOntology.NAMESPACE + "hasDeodorizationFunctionSetting";

	public OperationStatusValue getDeodorizationFunctionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_DEODORIZATION_FUNCTION_SETTING);	
	}
	public void setDeodorizationFunctionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DEODORIZATION_FUNCTION_SETTING, msg);	
	}
	public OperationStatusValue getVegetableCompartmentHumidificationFunctionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_VEGETABLE_COMPARTMENT_HUMIDIFICATION_FUNCTION_SETTING);	
	}
	public void setVegetableCompartmentHumidificationFunctionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEGETABLE_COMPARTMENT_HUMIDIFICATION_FUNCTION_SETTING, msg);	
	}
	public OperationStatusValue getRefrigeratorCompartmentHumidificationFunctionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_HUMIDIFICATION_FUNCTION_SETTING);	
	}
	public void setRefrigeratorCompartmentHumidificationFunctionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_HUMIDIFICATION_FUNCTION_SETTING, msg);	
	}
	public OccurenceStatusValue getIceMakerWaterTankStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_ICE_MAKER_WATER_TANK_STATUS);	
	}
	public void setIceMakerWaterTankStatus(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ICE_MAKER_WATER_TANK_STATUS, msg);	
	}
	public OperationStateSettingValue getIceMakerOperationStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_ICE_MAKER_OPERATION_STATUS);	
	}
	public void setIceMakerOperationStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ICE_MAKER_OPERATION_STATUS, msg);	
	}
	public OperationStateSettingValue getIceMakerSetting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_ICE_MAKER_SETTING);	
	}
	public void setIceMakerSetting(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ICE_MAKER_SETTING, msg);	
	}
	public OperationModeSettingValue getQuickRefrigerationFunctionSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_QUICK_REFRIGERATION_FUNCTION_SETTING);	
	}
	public void setQuickRefrigerationFunctionSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_QUICK_REFRIGERATION_FUNCTION_SETTING, msg);	
	}
	public OperationModeSettingValue getQuickFreezeFunctionSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_QUICK_FREEZE_FUNCTION_SETTING);	
	}
	public void setQuickFreezeFunctionSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_QUICK_FREEZE_FUNCTION_SETTING, msg);	
	}
	public MeasuredValue getRatedPowerConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION);	
	}
	public void setRatedPowerConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION, msg);	
	}
	public MeasuredValue getMeasuredElectricCurrentConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_ELECTRIC_CURRENT_CONSUMPTION);	
	}
	public void setMeasuredElectricCurrentConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_ELECTRIC_CURRENT_CONSUMPTION, msg);	
	}
	public MeasuredValue getCompressorRotationSpeed() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_COMPRESSOR_ROTATION_SPEED);	
	}
	public void setCompressorRotationSpeed(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_COMPRESSOR_ROTATION_SPEED, msg);	
	}
	public MeasuredValue getMeasuredMultiRefrigeratorCompartmentTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_MULTI_REFRIGERATOR_COMPARTMENT_TEMPERATURER);	
	}
	public void setMeasuredMultiRefrigeratorCompartmentTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_MULTI_REFRIGERATOR_COMPARTMENT_TEMPERATURER, msg);	
	}
	public MeasuredValue getMeasuredVegetableCompartmentTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_VEGETABLE_COMPARTMENT_TEMPERATURER);	
	}
	public void setMeasuredVegetableCompartmentTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_VEGETABLE_COMPARTMENT_TEMPERATURER, msg);	
	}
	public MeasuredValue getMeasuredSubZeroFreshCompartmentTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_SUB_ZERO_FRESH_COMPARTMENT_TEMPERATURER);	
	}
	public void setMeasuredSubZeroFreshCompartmentTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_SUB_ZERO_FRESH_COMPARTMENT_TEMPERATURER, msg);	
	}
	public MeasuredValue getMeasuredFreezerCompartmentTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_FREEZER_COMPARTMENT_TEMPERATURER);	
	}
	public void setMeasuredFreezerCompartmentTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_FREEZER_COMPARTMENT_TEMPERATURER, msg);	
	}
	public MeasuredValue getMeasuredRefrigeratorCompartmentTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_REFRIGERATOR_COMPARTMENT_TEMPERATURER);	
	}
	public void setMeasuredRefrigeratorCompartmentTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_REFRIGERATOR_COMPARTMENT_TEMPERATURER, msg);	
	}
	public ThresholdLevelValue getMultiRefrigeratorCompartmentTemperatureLevelSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_MULTI_REFRIGERATOR_COMPARTMENT_TEMPERATURER_LEVEL_SETTING);	
	}
	public void setMultiRefrigeratorCompartmentTemperatureLevelSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MULTI_REFRIGERATOR_COMPARTMENT_TEMPERATURER_LEVEL_SETTING, msg);	
	}
	public ThresholdLevelValue getVegetableCompartmentTemperatureLevelSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_VEGETABLE_COMPARTMENT_TEMPERATURER_LEVEL_SETTING);	
	}
	public void setVegetableCompartmentTemperatureLevelSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEGETABLE_COMPARTMENT_TEMPERATURER_LEVEL_SETTING, msg);	
	}
	public ThresholdLevelValue getIceCompartmentTemperatureLevelSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_ICE_COMPARTMENT_TEMPERATURER_LEVEL_SETTING);	
	}
	public void setIceCompartmentTemperatureLevelSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ICE_COMPARTMENT_TEMPERATURER_LEVEL_SETTING, msg);	
	}
	public ThresholdLevelValue getFreezerCompartmentTemperatureLevelSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_FREEZER_COMPARTMENT_TEMPERATURER_LEVEL_SETTING);	
	}
	public void setFreezerCompartmentTemperatureLevelSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FREEZER_COMPARTMENT_TEMPERATURER_LEVEL_SETTING, msg);	
	}
	public ThresholdLevelValue getRefrigeratorCompartmentTemperatureLevelSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_TEMPERATURER_LEVEL_SETTING);	
	}
	public void setRefrigeratorCompartmentTemperatureLevelSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_TEMPERATURER_LEVEL_SETTING, msg);	
	}
	public MeasuredValue getMultiRefrigeratorCompartmentTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MULTI_REFRIGERATOR_COMPARTMENT_TEMPERATURER_SETTING);	
	}
	public void setMultiRefrigeratorCompartmentTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MULTI_REFRIGERATOR_COMPARTMENT_TEMPERATURER_SETTING, msg);	
	}
	public MeasuredValue getVegetableCompartmentTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_VEGETABLE_COMPARTMENT_TEMPERATURER_SETTING);	
	}
	public void setVegetableCompartmentTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEGETABLE_COMPARTMENT_TEMPERATURER_SETTING, msg);	
	}
	public MeasuredValue getIceCompartmentTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_ICE_COMPARTMENT_TEMPERATURER_SETTING);	
	}
	public void setIceCompartmentTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ICE_COMPARTMENT_TEMPERATURER_SETTING, msg);	
	}
	public MeasuredValue getFreezerCompartmentTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_FREEZER_COMPARTMENT_TEMPERATURER_SETTING);	
	}
	public void setFreezerCompartmentTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FREEZER_COMPARTMENT_TEMPERATURER_SETTING, msg);	
	}
	public MeasuredValue getRefrigeratorCompartmentTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_TEMPERATURER_SETTING);	
	}
	public void setRefrigeratorCompartmentTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_TEMPERATURER_SETTING, msg);	
	}
	public MeasuredValue getMaximumAllowableTemperatureSettingLevel() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MAXIMUM_ALLOWABLE_TEMEPRATURE_SETTING_LEVEL);	
	}
	public void setMaximumAllowableTemperatureSettingLevel(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MAXIMUM_ALLOWABLE_TEMEPRATURE_SETTING_LEVEL, msg);	
	}
	public OperationStateSettingValue getMultiRefrigeratingModeCompartmentDoorStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_MULTI_REFRIGERATING_MODE_COMPARTMENT_DOOR_STATUS);	
	}
	public void setMultiRefrigeratingModeCompartmentDoorStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MULTI_REFRIGERATING_MODE_COMPARTMENT_DOOR_STATUS, msg);	
	}
	public OperationStateSettingValue getVegetableCompartmentDoorStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_VEGETABLE_COMPARTMENT_DOOR_STATUS);	
	}
	public void setVegetableCompartmentDoorStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEGETABLE_COMPARTMENT_DOOR_STATUS, msg);	
	}
	public OperationStateSettingValue getIceCompartmentDoorStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_ICE_COMPARTMENT_DOOR_STATUS);	
	}
	public void setIceCompartmentDoorStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ICE_COMPARTMENT_DOOR_STATUS, msg);	
	}
	public OperationStateSettingValue getFreezerCompartmentDoorStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_FREEZER_COMPARTMENT_DOOR_STATUS);	
	}
	public void setFreezerCompartmentDoorStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FREEZER_COMPARTMENT_DOOR_STATUS, msg);	
	}
	public OperationStateSettingValue getRefrigeratorCompartmentDoorStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_DOOR_STATUS);	
	}
	public void setRefrigeratorCompartmentDoorStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_DOOR_STATUS, msg);	
	}
	public OccurenceStatusValue getDoorOpenWarning() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_DOOR_OPEN_WARNING);	
	}
	public void setDoorOpenWarning(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DOOR_OPEN_WARNING, msg);	
	}
	public OperationStateSettingValue getDoorOpenCloseStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS);	
	}
	public void setDoorOpenCloseStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS, msg);	
	}

	
	
	public Refrigerator() {
		super();
	}
	public Refrigerator(String uri) {
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
