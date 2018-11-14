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

public class ExtendedLightingSystem extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ExtendedLightingSystem";	
	public static final String PROPERTY_HAS_ILLUMINANCE_LEVEL = EchonetOntology.NAMESPACE + "hasIlluminanceLevel";
	public static final String PROPERTY_HAS_SCENE_CONTROL_SETTING = EchonetOntology.NAMESPACE + "hasSceneControlSetting";
	public static final String PROPERTY_HAS_NUMBER_FOR_ASSIGNING_SCENE_CONTROL_SETTING = EchonetOntology.NAMESPACE + "hasNumberForAssigningSceneControlSetting";
	public static final String PROPERTY_HAS_POWER_CONSUMPTION_RATE_LIST = EchonetOntology.NAMESPACE + "hasPowerConsumptionRateList";
	public static final String PROPERTY_HAS_POWER_CONSUMPTION_WHEN_FULLY_LIGHTED = EchonetOntology.NAMESPACE + "hasPowerConsumptionWhenFullyLighted";
	public static final String PROPERTY_HAS_POSISSLBE_POWER_SAVING = EchonetOntology.NAMESPACE + "hasPossiblePowerSaving";
	public static final String PROPERTY_HAS_POWER_CONSUMPTION_LIMIT_SETTING = EchonetOntology.NAMESPACE + "hasPowerConsumptionLimitSetting";
	
	public Float getPowerConsumptionLimitSetting() {
		return (Float) getProperty(PROPERTY_HAS_POWER_CONSUMPTION_LIMIT_SETTING);	
	}
	public void setPowerConsumptionLimitSetting(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_CONSUMPTION_LIMIT_SETTING, msg);	
	}
	public Float getPossiblePowerSaving() {
		return (Float) getProperty(PROPERTY_HAS_POSISSLBE_POWER_SAVING);	
	}
	public void setPossiblePowerSaving(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POSISSLBE_POWER_SAVING, msg);	
	}
	public Float getPowerConsumptionWhenFullyLighted() {
		return (Float) getProperty(PROPERTY_HAS_POWER_CONSUMPTION_WHEN_FULLY_LIGHTED);	
	}
	public void setPowerConsumptionWhenFullyLighted(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_CONSUMPTION_WHEN_FULLY_LIGHTED, msg);	
	}
	public Float getPowerConsumptionRateList() {
		return (Float) getProperty(PROPERTY_HAS_POWER_CONSUMPTION_RATE_LIST);	
	}
	public void setPowerConsumptionRateList(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_CONSUMPTION_RATE_LIST, msg);	
	}
	public Float getNumberForAssigningSceneControlSetting() {
		return (Float) getProperty(PROPERTY_HAS_NUMBER_FOR_ASSIGNING_SCENE_CONTROL_SETTING);	
	}
	public void setNumberForAssigningSceneControlSetting(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_FOR_ASSIGNING_SCENE_CONTROL_SETTING, msg);	
	}
	public Float getSceneControlSetting() {
		return (Float) getProperty(PROPERTY_HAS_SCENE_CONTROL_SETTING);	
	}
	public void setSceneControlSetting(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SCENE_CONTROL_SETTING, msg);	
	}
	public Float getIlluminanceLevel() {
		return (Float) getProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL);	
	}
	public void setIlluminanceLevel(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL, msg);	
	}
	
	
	public ExtendedLightingSystem() {
		super();
	}
	public ExtendedLightingSystem(String uri) {
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
