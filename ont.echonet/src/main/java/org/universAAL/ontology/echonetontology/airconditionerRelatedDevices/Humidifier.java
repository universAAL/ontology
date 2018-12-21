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
import org.universAAL.ontology.echonetontology.values.HumidifyingLevelValue;
import org.universAAL.ontology.echonetontology.values.IonEmissionMethodValue;
import org.universAAL.ontology.echonetontology.values.LiquidAmountLevelValue;
import org.universAAL.ontology.echonetontology.values.OperationModeSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;
public class Humidifier extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "Humidifier";
	public static final String PROPERTY_HAS_RELATIVE_HUMIDIFYING_SETTING = EchonetOntology.NAMESPACE +"hasRelativeHumidifyingSetting";
	public static final String PROPERTY_HAS_HUMIDIFYING_LEVEL_SETTING = EchonetOntology.NAMESPACE +"hasHumidifyingLevelSetting";
	public static final String PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY = EchonetOntology.NAMESPACE + "hasMeasuredRoomHumidity";
	public static final String PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING = EchonetOntology.NAMESPACE + "hasOFFTimerReservationSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_RESERVATION_RELATIVE_TIME_VALUE = EchonetOntology.NAMESPACE + "hasOFFTimerReservationRelativeTimeValue";
	public static final String PROPERTY_HAS_ION_EMISSION_SETTING = EchonetOntology.NAMESPACE + "hasIonEmissionSetting";
	public static final String PROPERTY_HAS_IMPLEMENTED_ION_EMISSION_METHOD = EchonetOntology.NAMESPACE + "hasImplementedIonEmissionMethod";
	public static final String PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "hasSpecialOperationModeSetting";
	public static final String PROPERTY_HAS_WATER_AMOUNT_LEVEL = EchonetOntology.NAMESPACE + "hasWaterAmountLevel";
	
	public LiquidAmountLevelValue getWaterAmountLevel() {
		return (LiquidAmountLevelValue) getProperty(PROPERTY_HAS_WATER_AMOUNT_LEVEL);	
	}
	public void setWaterAmountLevel(LiquidAmountLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_AMOUNT_LEVEL, msg);	
	}
	public OperationModeSettingValue getSpecialOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING);	
	}
	public void setSpecialOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING, msg);	
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
	
	
	public String getOFFTimerReservationRelativeTimeValue() {
		return getProperty(PROPERTY_HAS_OFF_TIMER_RESERVATION_RELATIVE_TIME_VALUE).toString();	
	}
	public void setOFFTimerReservationRelativeTimeValue(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_RESERVATION_RELATIVE_TIME_VALUE, msg);	
	}
	public OperationStatusValue getOFFTimerReservationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING);
	}
	public void setOFFTimerReservationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING, msg);
	}
	public Integer getMeasuredRoomHumidity() {
		return (Integer) getProperty(PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY);	
	}
	public void setMeasuredRoomHumidity(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY, msg);	
	}
	public HumidifyingLevelValue getHumidifyingLevelSetting() {
		return (HumidifyingLevelValue) getProperty(PROPERTY_HAS_HUMIDIFYING_LEVEL_SETTING);	
	}
	public void setHumidifyingLevelSetting(HumidifyingLevelValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_HUMIDIFYING_LEVEL_SETTING,msg);	
	}
	public HumidifyingLevelValue getRelativeHumidifyingSetting() {
		return (HumidifyingLevelValue) getProperty(PROPERTY_HAS_RELATIVE_HUMIDIFYING_SETTING);	
	}
	public void setRelativeHumidifyingSetting(HumidifyingLevelValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_RELATIVE_HUMIDIFYING_SETTING,msg);	
	}
	
	public Humidifier() {
		super();
	}
	public Humidifier(String uri) {
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
