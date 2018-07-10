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
import org.universAAL.ontology.echonet.values.ColorValue;
import org.universAAL.ontology.echonet.values.DateTimeValue;
import org.universAAL.ontology.echonet.values.LightingSettingValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.RGBValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class GeneralLighting extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "GeneralLighting";	
	public static final String PROPERTY_HAS_ILLUMINANCE_LEVEL = EchonetOntology.NAMESPACE + "hasIlluminanceLevel";
	public static final String PROPERTY_HAS_LIGHTING_COLOR_SETTING = EchonetOntology.NAMESPACE + "hasLightingColorSetting";
	public static final String PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING = EchonetOntology.NAMESPACE + "hasIlluminanceLevelStepSetting";
	public static final String PROPERTY_HAS_LIGHT_COLOR_STEP_SETTING = EchonetOntology.NAMESPACE + "hasLightColorStepSetting";
	public static final String PROPERTY_HAS_MAXIMUM_SPECIFIABLE_VALUES = EchonetOntology.NAMESPACE + "hasMaximumSpecifiableValues";
	public static final String PROPERTY_HAS_MAXIMUM_SETABLE_LEVEL_FOR_NIGHT_LIGHTING_VALUES = EchonetOntology.NAMESPACE + "hasMaximumSetableLevelForNightLightingValue";
	public static final String PROPERTY_HAS_LIGHTING_MODE_SETTING = EchonetOntology.NAMESPACE + "hasLightingModeSetting";
	public static final String PROPERTY_HAS_ILLUMINANCE_LEVEL_FOR_MAIN_LIGHTING = EchonetOntology.NAMESPACE + "hasIlluminanceLevelForMainLighting";
	public static final String PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING_FOR_MAIN_LIGHTING = EchonetOntology.NAMESPACE + "hasIlluminanceLevelStepSettingForMainLighting";
	public static final String PROPERTY_HAS_ILLUMINANCE_LEVEL_FOR_NIGHT_LIGHTING = EchonetOntology.NAMESPACE + "hasIlluminanceLevelForNightLighting";
	public static final String PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING_FOR_NIGHT_LIGHTING = EchonetOntology.NAMESPACE + "hasIlluminanceLevelStepSettingForNightLighting";
	public static final String PROPERTY_HAS_LIGHT_COLOR_SETTING_FOR_MAIN_LIGHTING = EchonetOntology.NAMESPACE + "hasLightColorSettingForMainLighting";
	public static final String PROPERTY_HAS_LIGHT_COLOR_LEVEL_STEP_SETTING_FOR_MAIN_LIGHTING = EchonetOntology.NAMESPACE + "hasLightColorLevelStepSettingForMainLighting";
	public static final String PROPERTY_HAS_LIGHT_COLOR_SETTING_FOR_NIGHT_LIGHTING = EchonetOntology.NAMESPACE + "hasLightColorSettingForNightLighting";
	public static final String PROPERTY_HAS_LIGHT_COLOR_LEVEL_STEP_SETTING_FOR_NIGHT_LIGHTING = EchonetOntology.NAMESPACE + "hasLightColorLevelStepSettingForNightLighting";
	public static final String PROPERTY_HAS_LIGHTING_MODE_STATUS_IN_AUTO_MODE = EchonetOntology.NAMESPACE + "hasLightingModeStatusInAutoMode";
	public static final String PROPERTY_HAS_RGB_SETTING_FOR_COLOR_LIGHTING = EchonetOntology.NAMESPACE + "hasRGBSettingForColorLighting";
	public static final String PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING = EchonetOntology.NAMESPACE + "hasOnTimerReservationSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING = EchonetOntology.NAMESPACE + "hasOnTimerSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING = EchonetOntology.NAMESPACE + "hasOffTimerReservationSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING = EchonetOntology.NAMESPACE + "hasOffTimerSetting";

	
	public DateTimeValue getOffTimerSetting() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_OFF_TIMER_SETTING);	
	}
	public void setOffTimerSetting(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING, msg);	
	}	
	public OperationStatusValue getOffTimerReservationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING);	
	}
	public void setOffTimerReservationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING, msg);	
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
	
	public RGBValue getRGBSettingForColorLighting() {
		return (RGBValue) getProperty(PROPERTY_HAS_RGB_SETTING_FOR_COLOR_LIGHTING);	
	}
	public void setRGBSettingForColorLighting(RGBValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RGB_SETTING_FOR_COLOR_LIGHTING, msg);	
	}
	
	public OperationModeSettingValue getLightingModeStatusInAutoMode() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_LIGHTING_MODE_STATUS_IN_AUTO_MODE);	
	}
	public void setLightingModeStatusInAutoMode(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LIGHTING_MODE_STATUS_IN_AUTO_MODE, msg);	
	}
	
	public ThresholdLevelValue getLightColorLevelStepSettingForNightLighting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_LIGHT_COLOR_LEVEL_STEP_SETTING_FOR_NIGHT_LIGHTING);	
	}
	public void setLightColorLevelStepSettingForNightLighting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LIGHT_COLOR_LEVEL_STEP_SETTING_FOR_NIGHT_LIGHTING, msg);	
	}
	public ColorValue getLightColorSettingForNightLighting() {
		return (ColorValue) getProperty(PROPERTY_HAS_LIGHT_COLOR_SETTING_FOR_NIGHT_LIGHTING);	
	}
	public void setLightColorSettingForNightLighting(ColorValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LIGHT_COLOR_SETTING_FOR_NIGHT_LIGHTING, msg);	
	}
	public ThresholdLevelValue getLightColorLevelStepSettingForMainLighting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_LIGHT_COLOR_LEVEL_STEP_SETTING_FOR_MAIN_LIGHTING);	
	}
	public void setLightColorLevelStepSettingForMainLighting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LIGHT_COLOR_LEVEL_STEP_SETTING_FOR_MAIN_LIGHTING, msg);	
	}
	public ColorValue getLightColorSettingForMainLighting() {
		return (ColorValue) getProperty(PROPERTY_HAS_LIGHT_COLOR_SETTING_FOR_MAIN_LIGHTING);	
	}
	public void setLightColorSettingForMainLighting(ColorValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LIGHT_COLOR_SETTING_FOR_MAIN_LIGHTING, msg);	
	}
	
	public ThresholdLevelValue getIlluminanceLevelStepSettingForNightLighting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING_FOR_NIGHT_LIGHTING);	
	}
	public void setIlluminanceLevelStepSettingFoNightLighting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING_FOR_NIGHT_LIGHTING, msg);	
	}
	public MeasuredValue getIlluminanceLevelForNightLighting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_FOR_NIGHT_LIGHTING);	
	}
	public void setIlluminanceLevelForNightLighting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_FOR_NIGHT_LIGHTING, msg);	
	}
	public ThresholdLevelValue getIlluminanceLevelStepSettingForMainLighting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING_FOR_MAIN_LIGHTING);	
	}
	public void setIlluminanceLevelStepSettingForMainLighting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING_FOR_MAIN_LIGHTING, msg);	
	}
	public MeasuredValue getIlluminanceLevelForMainLighting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_FOR_MAIN_LIGHTING);	
	}
	public void setIlluminanceLevelForMainLighting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_FOR_MAIN_LIGHTING, msg);	
	}
	public OperationModeSettingValue getLightingModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_LIGHTING_MODE_SETTING);	
	}
	public void setLightingModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LIGHTING_MODE_SETTING, msg);	
	}
	public LightingSettingValue getMaximumSetableLevelForNightLightingValue() {
		return (LightingSettingValue) getProperty(PROPERTY_HAS_MAXIMUM_SETABLE_LEVEL_FOR_NIGHT_LIGHTING_VALUES);	
	}
	public void setMaximumSetableLevelForNightLightingValue(LightingSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MAXIMUM_SETABLE_LEVEL_FOR_NIGHT_LIGHTING_VALUES, msg);	
	}
	public LightingSettingValue getMaximumSpecifiableValues() {
		return (LightingSettingValue) getProperty(PROPERTY_HAS_MAXIMUM_SPECIFIABLE_VALUES);	
	}
	public void setMaximumSpecifiableValues(LightingSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MAXIMUM_SPECIFIABLE_VALUES, msg);	
	}
	public ThresholdLevelValue getLightColorStepSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_LIGHT_COLOR_STEP_SETTING);	
	}
	public void setLightColorStepSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LIGHT_COLOR_STEP_SETTING, msg);	
	}
	public ThresholdLevelValue getIlluminanceLevelStepSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING);	
	}
	public void setIlluminanceLevelStepSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING, msg);	
	}
	public ColorValue getLightingColorSetting() {
		return (ColorValue) getProperty(PROPERTY_HAS_LIGHTING_COLOR_SETTING);	
	}
	public void setLightingColorSetting(ColorValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LIGHTING_COLOR_SETTING, msg);	
	}
	public MeasuredValue getIlluminanceLevel() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL);	
	}
	public void setIlluminanceLevel(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL, msg);	
	}
	

	
	public GeneralLighting() {
		super();
	}
	public GeneralLighting(String uri) {
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
