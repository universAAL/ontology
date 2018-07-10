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
import org.universAAL.ontology.echonet.values.DateTimeValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class ElectricToiletSeat extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ElectricToiletSeat";
	public static final String PROPERTY_HAS_TOILET_SEAT_TEMPERATURE_LEVEL = EchonetOntology.NAMESPACE + "hasToiletSeatTemperatureLevel";
	public static final String PROPERTY_HAS_TOILET_SEAT_HEATER_SETTING = EchonetOntology.NAMESPACE + "hasToiletSeatHeaterSetting";
	public static final String PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_SETTING = EchonetOntology.NAMESPACE + "hasToiletSeatTemporalHaltSetting";
	public static final String PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_START_TIME = EchonetOntology.NAMESPACE + "hasToiletSeatTemporalHaltStartTime";
	public static final String PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_DURATION = EchonetOntology.NAMESPACE + "hasToiletSeatTemporalHaltDuration";
	public static final String PROPERTY_HAS_ROOM_HEATING_TEMPERATURE_LEVEL_SETTING = EchonetOntology.NAMESPACE + "hasRoomHeatingTemeperatureLevelSetting";
	public static final String PROPERTY_HAS_ROOM_HEATING_SETTING = EchonetOntology.NAMESPACE + "hasRoomHeatingSetting";
	public static final String PROPERTY_HAS_ROOM_HEATING_STATUS = EchonetOntology.NAMESPACE + "hasRoomHeatingStatus";
	public static final String PROPERTY_HAS_ROOM_HEATING_START_TIME = EchonetOntology.NAMESPACE + "hasRoomHeatingStartTime";
	public static final String PROPERTY_HAS_ROOM_HEATING_DURATION = EchonetOntology.NAMESPACE + "hasRoomHeatingDuration";
	public static final String PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "hasSpecialOperationModeSetting";
	public static final String PROPERTY_HAS_HUMAN_DETECTION_STATUS = EchonetOntology.NAMESPACE + "hasHumanDetectionStatus";
	public static final String PROPERTY_HAS_SEATING_DETECTION_STATUS = EchonetOntology.NAMESPACE + "hasSeatingDetectionStatus";
	
	public OccurenceStatusValue getSeatingDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_SEATING_DETECTION_STATUS);	
	}
	public void setSeatingDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SEATING_DETECTION_STATUS, msg);	
	}
	public OccurenceStatusValue getHumanDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_HUMAN_DETECTION_STATUS);	
	}
	public void setHumanDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HUMAN_DETECTION_STATUS, msg);	
	}
	public OperationModeSettingValue getSpecialOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING);	
	}
	public void OperationModeSettingValue(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING, msg);	
	}
	public DateTimeValue getRoomHeatingDuration() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_ROOM_HEATING_DURATION);	
	}
	public void setRoomHeatingDuration(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ROOM_HEATING_DURATION, msg);	
	}
	public DateTimeValue getRoomHeatingStartTime() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_ROOM_HEATING_START_TIME);	
	}
	public void setRoomHeatingStartTime(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ROOM_HEATING_START_TIME, msg);	
	}
	public OperationStatusValue getRoomHeatingStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_ROOM_HEATING_STATUS);	
	}
	public void setRoomHeatingStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ROOM_HEATING_STATUS, msg);	
	}
	public OperationModeSettingValue getRoomHeatingSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_ROOM_HEATING_SETTING);	
	}
	public void setRoomHeatingSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ROOM_HEATING_SETTING, msg);	
	}
	public ThresholdLevelValue getRoomHeatingTemeperatureLevelSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_ROOM_HEATING_TEMPERATURE_LEVEL_SETTING);	
	}
	public void setRoomHeatingTemeperatureLevelSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ROOM_HEATING_TEMPERATURE_LEVEL_SETTING, msg);	
	}
	public DateTimeValue getToiletSeatTemporalHaltDuration() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_DURATION);	
	}
	public void setToiletSeatTemporalHaltDuration(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_DURATION, msg);	
	}
	public DateTimeValue getToiletSeatTemporalHaltStartTime() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_START_TIME);	
	}
	public void setToiletSeatTemporalHaltStartTime(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_START_TIME, msg);	
	}
	public OperationFunctionSettingValue getToiletSeatTemporalHaltSetting() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_SETTING);	
	}
	public void setToiletSeatTemporalHaltSetting(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_SETTING, msg);	
	}
	public OperationStatusValue getToiletSeatHeaterSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_TOILET_SEAT_HEATER_SETTING);	
	}
	public void setToiletSeatHeaterSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TOILET_SEAT_HEATER_SETTING, msg);	
	}
	public ThresholdLevelValue getToiletSeatTemperatureLevel() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_TOILET_SEAT_TEMPERATURE_LEVEL);	
	}
	public void setToiletSeatTemperatureLevel(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TOILET_SEAT_TEMPERATURE_LEVEL, msg);	
	}

	public ElectricToiletSeat() {
		super();
	}
	public ElectricToiletSeat(String uri) {
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
