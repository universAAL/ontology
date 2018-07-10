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
import org.universAAL.ontology.echonet.values.ComercialAirconditionerCurrentFunctionValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.PowerConsumptionRange;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class PackageTypeCommercialAirConditionerIndoorUnit extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "PackageTypeCommercialAirConditionerIndoorUnit";
	public static final String PROPERTY_HAS_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "hasOperationModeSetting";
	public static final String PROPERTY_HAS_MEASURED_INDOOR_UNIT_TEMPERATURE = EchonetOntology.NAMESPACE + "hasMeasuredIndoorUnitTemperature";
	public static final String PROPERTY_HAS_THERMOSTAT_STATE= EchonetOntology.NAMESPACE + "hasThermostatState";
	public static final String PROPERTY_HAS_CURRENT_FUNCTION= EchonetOntology.NAMESPACE + "hasCurrentFunction";
	public static final String PROPERTY_HAS_GROUP_INFOMRATION= EchonetOntology.NAMESPACE + "hasGroupInformation";
	public static final String PROPERTY_HAS_POWER_CONSUMPTION_RANGE_INDOOR_UNIT= EchonetOntology.NAMESPACE + "hasPowerConsumptionRangeIndoorUnit";
	
	public PowerConsumptionRange getPowerConsumptionRangeIndoorUnit() {
		return (PowerConsumptionRange) getProperty(PROPERTY_HAS_POWER_CONSUMPTION_RANGE_INDOOR_UNIT);	
	}
	public void setPowerConsumptionRangeIndoorUnit(PowerConsumptionRange msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_CONSUMPTION_RANGE_INDOOR_UNIT, msg);	
	}
	public String getGroupInformation() {
		return (String) getProperty(PROPERTY_HAS_GROUP_INFOMRATION);	
	}
	public void setGroupInformation(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_GROUP_INFOMRATION, msg);	
	}
	public ComercialAirconditionerCurrentFunctionValue getCurrentFunction() {
		return (ComercialAirconditionerCurrentFunctionValue) getProperty(PROPERTY_HAS_CURRENT_FUNCTION);	
	}
	public void setCurrentFunction(ComercialAirconditionerCurrentFunctionValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CURRENT_FUNCTION, msg);	
	}
	public OperationStatusValue getThermostatState() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_THERMOSTAT_STATE);	
	}
	public void setThermostatState(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_THERMOSTAT_STATE, msg);	
	}
	public MeasuredValue getMeasuredIndoorUnitTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INDOOR_UNIT_TEMPERATURE);	
	}
	public void setMeasuredIndoorUnitTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INDOOR_UNIT_TEMPERATURE, msg);	
	}
	public OperationModeSettingValue getOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE_SETTING);	
	}
	public void setOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_MODE_SETTING, msg);	
	}
	
	public PackageTypeCommercialAirConditionerIndoorUnit() {
		super();
	}
	public PackageTypeCommercialAirConditionerIndoorUnit(String uri) {
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
