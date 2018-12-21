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
package org.universAAL.ontology.echonetontology.airconditionerRelatedDevices;


import org.universAAL.ontology.echonetontology.EchonetOntology;
import org.universAAL.ontology.echonetontology.EchonetSuperDevice;
import org.universAAL.ontology.echonetontology.values.OperationModeSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;
import org.universAAL.ontology.echonetontology.values.ThresholdLevelValue;

public class ElectricHeater extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ElectricHeater";
	public static final String PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING = EchonetOntology.NAMESPACE +"hasAutomaticTemperatureControlSetting";
	public static final String PROPERTY_HAS_TEMPERATURE_SETTING = EchonetOntology.NAMESPACE +"hasTemperatureSetting";
	public static final String PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE = EchonetOntology.NAMESPACE +"hasMeasuredRoomTemperature";
	public static final String PROPERTY_HAS_REMOTELY_SET_TEMPERATURE = EchonetOntology.NAMESPACE +"hasRemotelySetTemperature";
	public static final String PROPERTY_HAS_AIR_FLOW_RATE_SETTING = EchonetOntology.NAMESPACE + "hasAirFlowRateSetting";
	public static final String PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING= EchonetOntology.NAMESPACE + "hasONTimerBasedReservationSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_TIME= EchonetOntology.NAMESPACE + "hasONTimerTimeSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME= EchonetOntology.NAMESPACE + "hasONTimerRelativeTimeSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING= EchonetOntology.NAMESPACE + "hasOFFTimerBasedReservationSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING_TIME= EchonetOntology.NAMESPACE + "hasOFFTimerTimeSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME= EchonetOntology.NAMESPACE + "hasOFFTimerRelativeTimeSetting";
	
	
	public String getOFFTimerRelativeTimeSetting() {
		return  getProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME).toString();	
	}
	public void setOFFTimerRelativeTimeSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public String getOFFTimerTimeSetting() {
		return  getProperty(PROPERTY_HAS_OFF_TIMER_SETTING_TIME).toString();	
	}
	public void setOFFTimerTimeSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING_TIME, msg);	
	}
	public OperationModeSettingValue getOFFTimerBasedReservationSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING);	
	}
	public void setOFFTimerBasedReservationSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING, msg);	
	}
	public String getONTimerRelativeTimeSetting() {
		return  getProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).toString();	
	}
	public void setONTimerRelativeTimeSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public String getONTimerTimeSetting() {
		return  getProperty(PROPERTY_HAS_ON_TIMER_SETTING_TIME).toString();	
	}
	public void setONTimerTimeSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING_TIME, msg);	
	}
	public OperationModeSettingValue getONTimerBasedReservationSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING);	
	}
	public void setONTimerBasedReservationSetting(OperationModeSettingValue  msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING, msg);	
	}
	public ThresholdLevelValue getAirFlowRateSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_AIR_FLOW_RATE_SETTING);	
	}
	public void setAirFlowRateSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AIR_FLOW_RATE_SETTING, msg);	
	}
	public Float getRemotelySetTemperature() {
		return (Float) getProperty(PROPERTY_HAS_REMOTELY_SET_TEMPERATURE);	
	}
	public void setRemotelySetTemperature(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMOTELY_SET_TEMPERATURE, msg);	
	}
	public Float getMeasuredRoomTemperature() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE);	
	}
	public void setMeasuredRoomTemperature(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE, msg);	
	}
	public Float getTemperatureSetting() {
		return (Float) getProperty(PROPERTY_HAS_TEMPERATURE_SETTING);	
	}
	public void setTemperatureSetting(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TEMPERATURE_SETTING, msg);	
	}
	public OperationStatusValue getAutomaticTemperatureControlSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING);	
	}
	public void setAutomaticTemperatureControlSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING, msg);	
	}
	
	public ElectricHeater() {
		super();
	}
	public ElectricHeater(String uri) {
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
