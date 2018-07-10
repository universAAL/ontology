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
import org.universAAL.ontology.echonet.values.IonEmissionMethodValue;
import org.universAAL.ontology.echonet.values.LiquidAmountLevelValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class FanHeater extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "FanHeater";
	public static final String PROPERTY_HAS_TEMPERATURE_SETTING = EchonetOntology.NAMESPACE +"hasTemperatureSetting";
	public static final String PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE = EchonetOntology.NAMESPACE +"hasMeasuredRoomTemperature";
	public static final String PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING = EchonetOntology.NAMESPACE +"hasAutomaticTemperatureControlSetting";
	public static final String PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING= EchonetOntology.NAMESPACE + "hasONTimerBasedReservationSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_TIME= EchonetOntology.NAMESPACE + "hasONTimerTimeSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME= EchonetOntology.NAMESPACE + "hasONTimerRelativeTimeSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING= EchonetOntology.NAMESPACE + "hasOFFTimerBasedReservationSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING_TIME= EchonetOntology.NAMESPACE + "hasOFFTimerTimeSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME= EchonetOntology.NAMESPACE + "hasOFFTimerRelativeTimeSetting";
	public static final String PROPERTY_HAS_EXTENSIONAL_OPERATION_SETTING = EchonetOntology.NAMESPACE +"hasExtensionalOperationSetting";
	public static final String PROPERTY_HAS_EXTENSIONAL_OPERATION_TIMER_SETTING_TIME= EchonetOntology.NAMESPACE + "hasExtensionalOperationTimerSettingTime";
	public static final String PROPERTY_HAS_ION_EMISSION_SETTING = EchonetOntology.NAMESPACE + "hasIonEmissionSetting";
	public static final String PROPERTY_HAS_IMPLEMENTED_ION_EMISSION_METHOD = EchonetOntology.NAMESPACE + "hasImplementedIonEmissionMethod";
	public static final String PROPERTY_HAS_OIL_AMOUNT_LEVEL = EchonetOntology.NAMESPACE + "hasOilAmountLevel";
	
	public LiquidAmountLevelValue getOilAmountLevel() {
		return (LiquidAmountLevelValue) getProperty(PROPERTY_HAS_OIL_AMOUNT_LEVEL);	
	}
	public void setOilAmountLevel(LiquidAmountLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OIL_AMOUNT_LEVEL, msg);	
	}
	public IonEmissionMethodValue getImplementedIonEmissionMethod() {
		return (IonEmissionMethodValue) getProperty(PROPERTY_HAS_IMPLEMENTED_ION_EMISSION_METHOD);	
	}
	public void setImplementedIonEmissionMethod(IonEmissionMethodValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_IMPLEMENTED_ION_EMISSION_METHOD, msg);	
	}
	public OperationStatusValue getIonEmissionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_ION_EMISSION_SETTING);	
	}
	public void setIonEmissionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ION_EMISSION_SETTING, msg);	
	}
	public DateTimeValue getExtensionalOperationTimerSettingTime() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_EXTENSIONAL_OPERATION_TIMER_SETTING_TIME);	
	}
	public void setExtensionalOperationTimerSettingTime(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EXTENSIONAL_OPERATION_TIMER_SETTING_TIME, msg);	
	}
	public OperationStatusValue getExtensionalOperationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_EXTENSIONAL_OPERATION_SETTING);	
	}
	public void setExtensionalOperationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EXTENSIONAL_OPERATION_SETTING, msg);	
	}
	public DateTimeValue getOFFTimerRelativeTimeSetting() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME);	
	}
	public void setOFFTimerRelativeTimeSetting(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public DateTimeValue getOFFTimerTimeSetting() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_OFF_TIMER_SETTING_TIME);	
	}
	public void setOFFTimerTimeSetting(DateTimeValue msg) {
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
	public DateTimeValue getONTimerRelativeTimeSetting() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME);	
	}
	public void setONTimerRelativeTimeSetting(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public DateTimeValue getONTimerTimeSetting() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_ON_TIMER_SETTING_TIME);	
	}
	public void setONTimerTimeSetting(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING_TIME, msg);	
	}
	public OperationModeSettingValue getONTimerBasedReservationSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING);	
	}
	public void setONTimerBasedReservationSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING, msg);	
	}
	public OperationStatusValue getAutomaticTemperatureControlSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING);	
	}
	public void setAutomaticTemperatureControlSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING, msg);	
	}
	public MeasuredValue getMeasuredRoomTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE);	
	}
	public void setMeasuredRoomTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE, msg);	
	}
	public MeasuredValue getTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_TEMPERATURE_SETTING);	
	}
	public void setTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TEMPERATURE_SETTING, msg);	
	}
	
	public FanHeater() {
		super();
	}
	public FanHeater(String uri) {
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
