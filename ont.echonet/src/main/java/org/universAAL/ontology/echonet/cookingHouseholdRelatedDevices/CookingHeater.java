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
import org.universAAL.ontology.echonet.values.DateTimeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class CookingHeater extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "CookingHeater";
	public static final String PROPERTY_HAS_HEATING_STATUS= EchonetOntology.NAMESPACE + "hasHeatingStatus";
	public static final String PROPERTY_HAS_HEATING_SETTING= EchonetOntology.NAMESPACE + "hasHeatingSetting";
	public static final String PROPERTY_SETTING_ALL_STOP= EchonetOntology.NAMESPACE + "setAllStop";
	public static final String PROPERTY_HAS_HEATING_POWER_SETTING= EchonetOntology.NAMESPACE + "hasHeatingPowerSetting";
	public static final String PROPERTY_HAS_HEATING_TEMPERATURE_SETTING= EchonetOntology.NAMESPACE + "hasHeatingTemperatureSetting";
	public static final String PROPERTY_HAS_STOVE_HEATING_MODES_SETTING= EchonetOntology.NAMESPACE + "hasStoveHeatingModesSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME= EchonetOntology.NAMESPACE + "hasOffTimerSettingRelativeTime";
	public static final String PROPERTY_HAS_CHILD_LOCK_SETTING= EchonetOntology.NAMESPACE + "hasChildLockSetting";	
	public static final String PROPERTY_HAS_RADIANT_HEATER_LOCK_SETTING= EchonetOntology.NAMESPACE + "hasRadiantHeaterLockSetting";
	
	public OperationStatusValue getRadiantHeaterLockSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_RADIANT_HEATER_LOCK_SETTING);	
	}
	public void setRadiantHeaterLockSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RADIANT_HEATER_LOCK_SETTING, msg);	
	}
	public OperationStatusValue getChildLockSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_CHILD_LOCK_SETTING);	
	}
	public void setChildLockSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHILD_LOCK_SETTING, msg);	
	}
	public DateTimeValue getOffTimerSettingRelativeTime() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME);	
	}
	public void setOffTimerSettingRelativeTime(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	
	public OperationModeSettingValue getStoveHeatingModesSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_STOVE_HEATING_MODES_SETTING);	
	}
	public void setStoveHeatingModesSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_STOVE_HEATING_MODES_SETTING, msg);	
	}
	
	public MeasuredValue getHeatingTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_HEATING_TEMPERATURE_SETTING);	
	}
	public void setHeatingTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_TEMPERATURE_SETTING, msg);	
	}
	public MeasuredValue getHeatingPowerSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_HEATING_POWER_SETTING);	
	}
	public void setHeatingPowerSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_POWER_SETTING, msg);	
	}
	public OperationStateSettingValue getHeatingSetting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_HEATING_SETTING);	
	}
	public void setHeatingSetting(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_SETTING, msg);	
	}
	public OperationStatusValue getHeatingStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_HEATING_STATUS);	
	}
	public void setHeatingStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_STATUS, msg);	
	}
	
	public CookingHeater() {
		super();
	}
	public CookingHeater(String uri) {
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
