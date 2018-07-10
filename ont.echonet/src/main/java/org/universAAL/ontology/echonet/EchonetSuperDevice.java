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
package org.universAAL.ontology.echonet;


import org.universAAL.ontology.echonet.values.DateTimeValue;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.FaultDesciptionValue;
import org.universAAL.ontology.echonet.values.IdentificationNumberValue;
import org.universAAL.ontology.echonet.values.InstallationLocationValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.RemoteControlSettingValue;
import org.universAAL.ontology.phThing.Device;


public class EchonetSuperDevice extends Device{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "EchonetSuperDevice";
	
	public static final String PROPERTY_HAS_NODE_IP_ADDRESS = EchonetOntology.NAMESPACE + "hasNodeIPAddress";
	public static final String PROPERTY_HAS_GROUP_CODE = EchonetOntology.NAMESPACE + "hasGroupCode";
	public static final String PROPERTY_HAS_CLASS_CODE = EchonetOntology.NAMESPACE + "hasClassCode";
	public static final String PROPERTY_HAS_INSTANCE_CODE = EchonetOntology.NAMESPACE + "hasInstanceCode";
	public static final String PROPERTY_HAS_OPERATION_STATUS = EchonetOntology.NAMESPACE +"hasOperationStatus";
	public static final String PROPERTY_HAS_INSTALLATION_LOCATION = EchonetOntology.NAMESPACE +"hasInstallationLocation";
	public static final String PROPERTY_STANDARD_VERSION_INFORMATION = EchonetOntology.NAMESPACE +"hasStandardVersionInformation";
	public static final String PROPERTY_HAS_FAULT_STATUS = EchonetOntology.NAMESPACE +"hasFaultStatus";
	public static final String PROPERTY_HAS_FAULT_DESCRIPTION = EchonetOntology.NAMESPACE +"hasFaultDescription";
	public static final String PROPERTY_HAS_MANUFACTURER_CODE = EchonetOntology.NAMESPACE +"hasManufactureCode";
	public static final String PROPERTY_HAS_BUSINESS_FACILITY_CODE = EchonetOntology.NAMESPACE +"hasBusinessFacilityCode";
	public static final String PROPERTY_HAS_PRODUCT_CODE = EchonetOntology.NAMESPACE +"hasProductCode";
	public static final String PROPERTY_HAS_PRODUCTION_NUMBER = EchonetOntology.NAMESPACE +"hasProductionNumber";
	public static final String PROPERTY_HAS_PRODUCTION_DATE = EchonetOntology.NAMESPACE +"hasProductionDate";
	public static final String PROPERTY_HAS_IDENTIFICATION_NUMBER = EchonetOntology.NAMESPACE +"hasIdentificationNumber";
	public static final String PROPERTY_HAS_MANUFACTURER_FAULT_CODE = EchonetOntology.NAMESPACE +"hasManufactureFaultCode";
	public static final String PROPERTY_HAS_CURRENT_LIMIT_SETTING = EchonetOntology.NAMESPACE +"hasCurrentLimitSetting";
	public static final String PROPERTY_HAS_POWER_SAVING_OPERATION_SETTING = EchonetOntology.NAMESPACE +"hasPowerSavingOperationSetting";
	public static final String PROPERTY_HAS_REMOTE_CONTROL_SETTING = EchonetOntology.NAMESPACE +"hasRemoteControlSetting";
	public static final String PROPERTY_HAS_CUMULATIVE_OPERATING_TIME = EchonetOntology.NAMESPACE +"hasCumulativeOperatingTime";
	public static final String PROPERTY_HAS_CURRENT_TIME_SETTING= EchonetOntology.NAMESPACE +"hasCurrentTimeSetting";
	public static final String PROPERTY_HAS_CURRENT_DATE_SETTING= EchonetOntology.NAMESPACE +"hasCurrentDateSetting";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION = EchonetOntology.NAMESPACE +"hasMeasuredInstantaneousPowerConsumption";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_CONSUMPTION = EchonetOntology.NAMESPACE +"hasMeasuredCumulativePowerConsumption";
	public static final String PROPERTY_HAS_POWER_LIMIT_SETTING = EchonetOntology.NAMESPACE +"hasPowerLimitSetting";
	
	public String getNodeIPAddress() {
		Object pp = getProperty(PROPERTY_HAS_NODE_IP_ADDRESS);
		if(pp!= null) {
			return pp.toString();
		} else {
			return null;
		}
	}
	public void setNodeIPAddress(String ip) {
		changeProperty(PROPERTY_HAS_NODE_IP_ADDRESS, ip);	
	}
	public EchonetDeviceGroupCodeValue getClassGroupCode() {
		return (EchonetDeviceGroupCodeValue) getProperty(PROPERTY_HAS_GROUP_CODE);
	}
	public void setClassGroupCode(EchonetDeviceGroupCodeValue msg) {
		if(msg !=null) {
			changeProperty(PROPERTY_HAS_GROUP_CODE, msg);
		}
	}
	public String getClassCode() {
		return (String) getProperty(PROPERTY_HAS_CLASS_CODE);
	}
	public void setClassCode(String msg) {
		if(msg !=null) {
			changeProperty(PROPERTY_HAS_CLASS_CODE, msg);
		}
	}
	public OperationStatusValue getOperationStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_OPERATION_STATUS);
	}
	public void setOperationStatus(OperationStatusValue msg) {
		if(msg !=null) {
			changeProperty(PROPERTY_HAS_OPERATION_STATUS, msg);
		}
	}

	public InstallationLocationValue getInstallationLocation() {
		return (InstallationLocationValue) getProperty(PROPERTY_HAS_INSTALLATION_LOCATION);
	}
	public void setInstallationLocation(InstallationLocationValue msg) {
		if(msg != null) {
			changeProperty(PROPERTY_HAS_INSTALLATION_LOCATION, msg);
		}
	}
	public String getStandardVersionInformation() {
		return (String) getProperty(PROPERTY_STANDARD_VERSION_INFORMATION);
	}
	public void setStandardVersionInformation(String msg) {
		if(msg !=null)
			changeProperty(PROPERTY_STANDARD_VERSION_INFORMATION, msg);	
	}
	

	public OccurenceStatusValue getFaultStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_FAULT_STATUS);
	}
	public void setFaultStatus(OccurenceStatusValue msg) {
		if(msg != null) {
			changeProperty(PROPERTY_HAS_FAULT_STATUS, msg);	
		}	
	}
	public FaultDesciptionValue getFaultDesciptionValue() {
		return (FaultDesciptionValue) getProperty(PROPERTY_HAS_FAULT_DESCRIPTION);
	}
	public void setFaultDesciptionValue(FaultDesciptionValue msg) {
		if(msg != null) {
			changeProperty(PROPERTY_HAS_FAULT_DESCRIPTION, msg);	
		}	
	}
	
	public  String getManufacturerCode() {
		return (String) getProperty(PROPERTY_HAS_MANUFACTURER_CODE);
	}
	public  void setManufacturerCode(String msg) {
		if(msg != null) 
			changeProperty(PROPERTY_HAS_MANUFACTURER_CODE, msg);
	}
	
	public  void setBusinessFacilityCode(String msg) {
		if(msg != null) 
			changeProperty(PROPERTY_HAS_BUSINESS_FACILITY_CODE, msg);
	}
	public  String getBusinessFacilityCode() {
		return (String) getProperty(PROPERTY_HAS_BUSINESS_FACILITY_CODE);
	}
	
	public  String getProductCode() {
		return (String) getProperty(PROPERTY_HAS_PRODUCT_CODE);
	}
	public  void setProductCode(String msg) {
		if(msg != null) 
			changeProperty(PROPERTY_HAS_PRODUCT_CODE, msg);
	}


	public  String getProductionNumber() {
		return (String) getProperty(PROPERTY_HAS_PRODUCTION_NUMBER);
	}
	public  void setProductionNumber(String msg) {
		if(msg != null) 
			changeProperty(PROPERTY_HAS_PRODUCTION_NUMBER, msg);
	}
	public DateTimeValue getProductionDateTimeValue() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_PRODUCTION_DATE);
	}
	public  void setProductionDateTimeValue(DateTimeValue msg) {
		changeProperty(PROPERTY_HAS_PRODUCTION_DATE, msg);
	}	
	public IdentificationNumberValue getIdentificationNumber() {
		return (IdentificationNumberValue) getProperty(PROPERTY_HAS_IDENTIFICATION_NUMBER);
	}
	public void setIdentificationNumber(IdentificationNumberValue msg) {
		if(msg != null) {
			changeProperty(PROPERTY_HAS_IDENTIFICATION_NUMBER, msg);	
		}	
	}
	

	public  String getManufacturerFaultCode() {
		return (String) getProperty(PROPERTY_HAS_MANUFACTURER_FAULT_CODE);
	}
	public  void setManufacturerFaultCode(String msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_MANUFACTURER_FAULT_CODE, msg);
	}
	public  MeasuredValue getCurrentLimitSetting() {	
		return (MeasuredValue) getProperty(PROPERTY_HAS_CURRENT_LIMIT_SETTING);
	}
	public  void setCurrentLimitSetting(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_CURRENT_LIMIT_SETTING, msg);
	}
	public  OperationModeSettingValue getPowerSavingOperationSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_POWER_SAVING_OPERATION_SETTING);
	}
	public  void setPowerSavingOperationSetting(OperationModeSettingValue msg) {
		if(msg !=null) {
			changeProperty(PROPERTY_HAS_POWER_SAVING_OPERATION_SETTING, msg);
		}
	}
	public  RemoteControlSettingValue getRemoteControlSetting() {
		return (RemoteControlSettingValue) getProperty(PROPERTY_HAS_REMOTE_CONTROL_SETTING);
	}
	public  void setRemoteControlSetting(RemoteControlSettingValue msg) {
		if(msg !=null) {
			changeProperty(PROPERTY_HAS_REMOTE_CONTROL_SETTING, msg);
		}
	}
	public  String getCumulativeOperatingTime() {
		return (String) getProperty(PROPERTY_HAS_CUMULATIVE_OPERATING_TIME);
	}
	public  void setCumulativeOperatingTime(String msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_CUMULATIVE_OPERATING_TIME, msg);
	}
	public DateTimeValue getCurrentTimeSetting() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_CURRENT_TIME_SETTING);
	}
	public  void setCurrentTimeSetting(DateTimeValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_CURRENT_TIME_SETTING, msg);
	}
	public DateTimeValue getCurrentDateTimeValueSetting() {
		return (DateTimeValue)getProperty(PROPERTY_HAS_CURRENT_DATE_SETTING);
	}
	public  void setCurrentDateTimeValueSetting(DateTimeValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_CURRENT_DATE_SETTING, msg);
	}
	public MeasuredValue getMeasuredInstantaneousPowerConsumption() {
		return (MeasuredValue)getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION);
	}
	public  void setMeasuredInstantaneousPowerConsumption(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION, msg);
	}


	public  MeasuredValue getMeasuredCumulativePowerConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_CONSUMPTION);
		
	}
	public  void setMeasuredCumulativePowerConsumption(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_CONSUMPTION, msg);
	}
	
	public  MeasuredValue ElectricEnergyValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_POWER_LIMIT_SETTING);
	}
	public  void setPowerLimitSetting(MeasuredValue msg) {
		changeProperty(PROPERTY_HAS_POWER_LIMIT_SETTING, msg);
	}
	
	public EchonetSuperDevice() {
		super();
	}
	public EchonetSuperDevice(String uri) {
		super(uri);
	}
	public int getPropSerializationType(String arg0) {
		// TODO Auto-generated method stub
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public String getClassURI() {
		return MY_URI;
	}
	
	

}
