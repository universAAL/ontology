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
package org.universAAL.ontology.echonet.airconditionerRelatedDevices;


import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.DateTimeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.RadiationMethodValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class ElectricStorageHeater extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ElectricStorageHeater";
	public static final String PROPERTY_HAS_TEMPERATURE_SETTING = EchonetOntology.NAMESPACE +"hasTemperatureSetting";
	public static final String PROPERTY_HAS_RATED_POWER_CONSUMPTION = EchonetOntology.NAMESPACE +"hasRatedPowerConsumption";
	public static final String PROPERTY_HAS_MEASURED_INDOOR_TEMPERATURE = EchonetOntology.NAMESPACE +"hasMeasuredIndoorTemperature";
	public static final String PROPERTY_HAS_MEASURED_OUTDOOR_TEMPERATURE = EchonetOntology.NAMESPACE +"hasMeasuredOutdoorTemperature";
	public static final String PROPERTY_HAS_AIR_FLOW_RATE_SETTING = EchonetOntology.NAMESPACE + "hasAirFlowRateSetting";
	public static final String PROPERTY_HAS_FAN_OPERATION_STATUS = EchonetOntology.NAMESPACE + "hasFanOperationStatus";
	public static final String PROPERTY_HAS_HEAT_STORAGE_OPERATION_STATUS = EchonetOntology.NAMESPACE + "hasHeatStorageOperationStatus";
	public static final String PROPERTY_HAS_HEAT_STORAGE_TEMPERATURE_SETTING = EchonetOntology.NAMESPACE + "hasHeatStorageTemperatureSetting";
	public static final String PROPERTY_HAS_MEASURED_STORED_HEAT_TEMPERATURE = EchonetOntology.NAMESPACE + "hasMeasuredStoredHeatTemperature";
	public static final String PROPERTY_HAS_DAYTIME_HEAT_STORAGE_SETTING = EchonetOntology.NAMESPACE + "hasDaytimeHeatStorageSetting";
	public static final String PROPERTY_HAS_DAYTIME_HEAT_STORAGE_ABILITY = EchonetOntology.NAMESPACE + "hasDaytimeHeatStorageAbility";
	public static final String PROPERTY_HAS_MIDNIGHT_POWER_DURATION_SETTING = EchonetOntology.NAMESPACE + "hasMidnightPowerDurationSetting";
	public static final String PROPERTY_HAS_MIDNIGHT_POWER_START_TIME_SETTING = EchonetOntology.NAMESPACE + "hasMidnightPowerStartTimeSetting";
	public static final String PROPERTY_HAS_RADIATION_METHOD = EchonetOntology.NAMESPACE + "hasRadiationMethod";
	public static final String PROPERTY_HAS_CHILD_LOCK_SETTING = EchonetOntology.NAMESPACE + "hasChildLockSetting";
	public static final String PROPERTY_HAS_FAN_TIMER_1_SETTING = EchonetOntology.NAMESPACE + "hasFanTimer1Setting";
	public static final String PROPERTY_HAS_FAN_TIMER_1_ON_SETTING = EchonetOntology.NAMESPACE + "hasFanTimer1ONSetting";
	public static final String PROPERTY_HAS_FAN_TIMER_1_OFF_SETTING = EchonetOntology.NAMESPACE + "hasFanTimer1OFFSetting";
	public static final String PROPERTY_HAS_FAN_TIMER_2_SETTING = EchonetOntology.NAMESPACE + "hasFanTimer2Setting";
	public static final String PROPERTY_HAS_FAN_TIMER_2_ON_SETTING = EchonetOntology.NAMESPACE + "hasFanTimer2ONSetting";
	public static final String PROPERTY_HAS_FAN_TIMER_2_OFF_SETTING = EchonetOntology.NAMESPACE + "hasFanTimer2OFFSetting";

	public DateTimeValue getFanTimer2OFFSetting() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_FAN_TIMER_2_OFF_SETTING);	
	}
	public void setFanTimer2OFFSetting(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FAN_TIMER_2_OFF_SETTING, msg);	
	}
	public DateTimeValue getFanTimer2ONSetting() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_FAN_TIMER_2_ON_SETTING);	
	}
	public void setFanTimer2ONSetting(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FAN_TIMER_2_ON_SETTING, msg);	
	}
	public OperationStatusValue getFanTimer2Setting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_FAN_TIMER_2_SETTING);	
	}
	public void setFanTimer2Setting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FAN_TIMER_2_SETTING, msg);	
	}
	public DateTimeValue getFanTimer1OFFSetting() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_FAN_TIMER_1_OFF_SETTING);	
	}
	public void setFanTimer1OFFSetting(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FAN_TIMER_1_OFF_SETTING, msg);	
	}
	public DateTimeValue getFanTimer1ONSetting() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_FAN_TIMER_1_ON_SETTING);	
	}
	public void setFanTimer1ONSetting(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FAN_TIMER_1_ON_SETTING, msg);	
	}
	public OperationStatusValue getFanTimer1Setting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_FAN_TIMER_1_SETTING);	
	}
	public void setFanTimer1Setting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FAN_TIMER_1_SETTING, msg);	
	}
	public OperationStatusValue getChildLockSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_CHILD_LOCK_SETTING);	
	}
	public void getChildLockSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHILD_LOCK_SETTING, msg);	
	}
	public RadiationMethodValue getRadiationMethod() {
		return (RadiationMethodValue) getProperty(PROPERTY_HAS_RADIATION_METHOD);	
	}
	public void setRadiationMethod(RadiationMethodValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RADIATION_METHOD, msg);	
	}
	public MeasuredValue getMidnightPowerStartTimeSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MIDNIGHT_POWER_START_TIME_SETTING);	
	}
	public void setMidnightPowerStartTimeSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MIDNIGHT_POWER_START_TIME_SETTING, msg);	
	}
	public MeasuredValue getMidnightPowerDurationSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MIDNIGHT_POWER_DURATION_SETTING);	
	}
	public void setMidnightPowerDurationSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MIDNIGHT_POWER_DURATION_SETTING, msg);	
	}
	public OperationStatusValue getDaytimeHeatStorageAbility() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_DAYTIME_HEAT_STORAGE_ABILITY);	
	}
	public void setDaytimeHeatStorageAbility(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAYTIME_HEAT_STORAGE_ABILITY, msg);	
	}
	public OperationStatusValue getDaytimeHeatStorageSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_DAYTIME_HEAT_STORAGE_SETTING);	
	}
	public void setDaytimeHeatStorageSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAYTIME_HEAT_STORAGE_SETTING, msg);	
	}
	public MeasuredValue getMeasuredStoredHeatTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_STORED_HEAT_TEMPERATURE);	
	}
	public void setMeasuredStoredHeatTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_STORED_HEAT_TEMPERATURE, msg);	
	}
	public MeasuredValue getHeatStorageTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_HEAT_STORAGE_TEMPERATURE_SETTING);	
	}
	public void setHeatStorageTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEAT_STORAGE_TEMPERATURE_SETTING, msg);	
	}
	public OperationStatusValue getHeatStorageOperationStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_HEAT_STORAGE_OPERATION_STATUS);	
	}
	public void setHeatStorageOperationStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEAT_STORAGE_OPERATION_STATUS, msg);	
	}
	public OperationStatusValue getFanOperationStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_FAN_OPERATION_STATUS);	
	}
	public void setFanOperationStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FAN_OPERATION_STATUS, msg);	
	}
	public ThresholdLevelValue getAirFlowRateSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_AIR_FLOW_RATE_SETTING);	
	}
	public void setAirFlowRateSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AIR_FLOW_RATE_SETTING, msg);	
	}
	public MeasuredValue getMeasuredOutdoorTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_OUTDOOR_TEMPERATURE);	
	}
	public void setMeasuredOutdoorTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_OUTDOOR_TEMPERATURE, msg);	
	}
	public MeasuredValue getMeasuredIndoorTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INDOOR_TEMPERATURE);	
	}
	public void setMeasuredIndoorTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INDOOR_TEMPERATURE, msg);	
	}
	public MeasuredValue getRatedPowerConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION);	
	}
	public void setRatedPowerConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION, msg);	
	}
	public MeasuredValue getTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_TEMPERATURE_SETTING);	
	}
	public void setTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TEMPERATURE_SETTING, msg);	
	}
	

	
	public ElectricStorageHeater() {
		super();
	}
	public ElectricStorageHeater(String uri) {
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
