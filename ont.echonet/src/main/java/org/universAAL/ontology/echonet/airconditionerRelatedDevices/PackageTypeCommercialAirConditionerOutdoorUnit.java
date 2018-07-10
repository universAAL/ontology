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
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class PackageTypeCommercialAirConditionerOutdoorUnit extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "PackageTypeCommercialAirConditionerOutdoorUnit";
	
	public static final String PROPERTY_HAS_OUTDOOR_UNIT_RATED_POWER_CONSUMPTION = EchonetOntology.NAMESPACE + 
			"hasOutDoorUnitRatedPowerConsumption";
	public static final String PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_TEMPERATURE = EchonetOntology.NAMESPACE + 
			"hasMeasuredOutdoorUnitTemperature";
	public static final String PROPERTY_HAS_SPECIAL_STATE = EchonetOntology.NAMESPACE + 
			"hasSpecialState";
	public static final String PROPERTY_HAS_GROUP_INFOMRATION= EchonetOntology.NAMESPACE + 
			"hasGroupInformation";
	public static final String PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_POWER_CONSUMPTION = EchonetOntology.NAMESPACE + 
			"hasMeasuredOutdoorUnitPowerConsumption";
	public static final String PROPERTY_HAS_POSSIBLE_POWER_SAVING_FOR_OUTDOOR_UNIT = EchonetOntology.NAMESPACE + 
			"hasPossiblePowerSavingForOutdoorUnit";
	public static final String PROPERTY_HAS_SETTING_RESTRICTING_POWER_CONSUMPTION_FOR_OUTDOOR_UNIT = EchonetOntology.NAMESPACE + 
			"hasSettingRestrictingPowerConsumptionForOutdoorUnit";
	public static final String PROPERTY_HAS_MINUMUM_POWER_CONSUMPTION_FOR_RESTRICTED_OUTDOOR_UNIT = EchonetOntology.NAMESPACE + 
			"hasMinimumPowerConsumptionForRestrictedOutdoorUnit";
	
	public MeasuredValue getMinimumPowerConsumptionForRestrictedOutdoorUnit() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MINUMUM_POWER_CONSUMPTION_FOR_RESTRICTED_OUTDOOR_UNIT);	
	}
	public void setMinimumPowerConsumptionForRestrictedOutdoorUnit(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINUMUM_POWER_CONSUMPTION_FOR_RESTRICTED_OUTDOOR_UNIT, msg);	
	}
	public MeasuredValue getSettingRestrictingPowerConsumptionForOutdoorUnit() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SETTING_RESTRICTING_POWER_CONSUMPTION_FOR_OUTDOOR_UNIT);	
	}
	public void setSettingRestrictingPowerConsumptionForOutdoorUnit(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SETTING_RESTRICTING_POWER_CONSUMPTION_FOR_OUTDOOR_UNIT, msg);	
	}
	public MeasuredValue getPossiblePowerSavingForOutdoorUnit() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_POSSIBLE_POWER_SAVING_FOR_OUTDOOR_UNIT);	
	}
	public void setPossiblePowerSavingForOutdoorUnit(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POSSIBLE_POWER_SAVING_FOR_OUTDOOR_UNIT, msg);	
	}
	public MeasuredValue getMeasuredOutdoorUnitPowerConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_POWER_CONSUMPTION);	
	}
	public void setMeasuredOutdoorUnitPowerConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_POWER_CONSUMPTION, msg);	
	}
	public String getGroupInformation() {
		return (String) getProperty(PROPERTY_HAS_GROUP_INFOMRATION);	
	}
	public void setGroupInformation(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_GROUP_INFOMRATION, msg);	
	}
	public OperationStateSettingValue getSpecialState() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_SPECIAL_STATE);	
	}
	public void setSpecialState(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPECIAL_STATE, msg);	
	}
	public MeasuredValue getMeasuredOutdoorUnitTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_TEMPERATURE);	
	}
	public void setMeasuredOutdoorUnitTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_TEMPERATURE, msg);	
	}
	public MeasuredValue getOutDoorUnitRatedPowerConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_OUTDOOR_UNIT_RATED_POWER_CONSUMPTION);	
	}
	public void setOutDoorUnitRatedPowerConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OUTDOOR_UNIT_RATED_POWER_CONSUMPTION, msg);	
	}
	
	
	public PackageTypeCommercialAirConditionerOutdoorUnit() {
		super();
	}
	public PackageTypeCommercialAirConditionerOutdoorUnit(String uri) {
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
