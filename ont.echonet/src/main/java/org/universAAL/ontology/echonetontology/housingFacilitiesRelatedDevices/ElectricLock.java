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
import org.universAAL.ontology.echonetontology.values.AlarmStatusValue;
import org.universAAL.ontology.echonetontology.values.OccurenceStatusValue;
import org.universAAL.ontology.echonetontology.values.OperationModeSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStateSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;

public class ElectricLock extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ElectricLock";
	public static final String PROPERTY_HAS_LOCK_SETTING_1 = EchonetOntology.NAMESPACE + "hasLockSetting1";
	public static final String PROPERTY_HAS_LOCK_SETTING_2 = EchonetOntology.NAMESPACE + "hasLockSetting2";
	public static final String PROPERTY_HAS_DOOR_GUARD_LOCK_STATUS = EchonetOntology.NAMESPACE + "hasDoorGuardLockStatus";
	public static final String PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS = EchonetOntology.NAMESPACE + "hasDoorOpenCloseStatus";
	public static final String PROPERTY_HAS_OCCUPANT_STATUS = EchonetOntology.NAMESPACE + "hasOccupantStatus";
	public static final String PROPERTY_HAS_ALARM_STATUS = EchonetOntology.NAMESPACE + "hasAlarmStatus";
	public static final String PROPERTY_HAS_AUTO_LOCK_MODE_SETTING = EchonetOntology.NAMESPACE + "hasAutoLockModeSetting";
	public static final String PROPERTY_HAS_LOCK_BATTERY_LEVEL = EchonetOntology.NAMESPACE + "hasLockBatteryLevel";
	
	public OperationStateSettingValue getLockBatteryLevel() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_LOCK_BATTERY_LEVEL);	
	}
	public void setLockBatteryLevel(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LOCK_BATTERY_LEVEL, msg);	
	}
	public OperationStatusValue getAutoLockModeSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_AUTO_LOCK_MODE_SETTING);	
	}
	public void setAutoLockModeSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTO_LOCK_MODE_SETTING, msg);	
	}
	public AlarmStatusValue getAlarmStatus() {
		return (AlarmStatusValue) getProperty(PROPERTY_HAS_ALARM_STATUS);	
	}
	public void setAlarmStatus(AlarmStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ALARM_STATUS, msg);	
	}
	public OccurenceStatusValue getOccupantStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_OCCUPANT_STATUS);	
	}
	public void setOccupantStatus(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OCCUPANT_STATUS, msg);	
	}
	public OperationModeSettingValue getDoorOpenCloseStatus() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS);	
	}
	public void setDoorOpenCloseStatus(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS, msg);	
	}
	public OperationModeSettingValue getDoorGuardLockStatus() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_DOOR_GUARD_LOCK_STATUS);	
	}
	public void setDoorGuardLockStatus(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DOOR_GUARD_LOCK_STATUS, msg);	
	}
	public OperationModeSettingValue getLockSetting2() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_LOCK_SETTING_2);	
	}
	public void setLockSetting2(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LOCK_SETTING_2, msg);	
	}
	public OperationModeSettingValue getLockSetting1() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_LOCK_SETTING_1);	
	}
	public void setLockSetting1(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LOCK_SETTING_1, msg);	
	}

	public ElectricLock() {
		super();
	}
	public ElectricLock(String uri) {
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
