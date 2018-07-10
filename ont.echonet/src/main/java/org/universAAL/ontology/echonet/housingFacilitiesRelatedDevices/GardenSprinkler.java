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
import org.universAAL.ontology.echonet.values.IntervalSettingValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.NumberOfSprinkleSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class GardenSprinkler extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "GardenSprinkler";
	public static final String PROPERTY_HAS_SPRINKLE_VALUE_OPEN_CLOSE_SETTING = EchonetOntology.NAMESPACE + "hasSprinkleValueOpenCloseSetting";
	public static final String PROPERTY_HAS_SPRINKLE_INTERVAL_SETTING = EchonetOntology.NAMESPACE + "hasSprinkleIntervalSetting";
	public static final String PROPERTY_HAS_NUMBER_OF_SPRINKLES_SETTING = EchonetOntology.NAMESPACE + "hasNumberOfSprinkleSetting";
	public static final String PROPERTY_HAS_SPRINKLE_TIME_SETTING_1 = EchonetOntology.NAMESPACE + "hasSprinkleTimeSetting1";
	public static final String PROPERTY_HAS_SPRINKLE_TIME_SETTING_2 = EchonetOntology.NAMESPACE + "hasSprinkleTimeSetting2";
	public static final String PROPERTY_HAS_SPRINKLE_DURATION_SETTING = EchonetOntology.NAMESPACE + "hasSprinkleDurationSetting";
	
	public MeasuredValue getSprinkleDurationSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SPRINKLE_DURATION_SETTING);	
	}
	public void setSprinkleDurationSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPRINKLE_DURATION_SETTING, msg);	
	}
	public DateTimeValue getSprinkleTimeSetting2() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_SPRINKLE_TIME_SETTING_2);	
	}
	public void setSprinkleTimeSetting2(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPRINKLE_TIME_SETTING_2, msg);	
	}
	public DateTimeValue getSprinkleTimeSetting1() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_SPRINKLE_TIME_SETTING_1);	
	}
	public void setSprinkleTimeSetting1(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPRINKLE_TIME_SETTING_1, msg);	
	}
	public NumberOfSprinkleSettingValue getNumberOfSprinkleSetting() {
		return (NumberOfSprinkleSettingValue) getProperty(PROPERTY_HAS_NUMBER_OF_SPRINKLES_SETTING);	
	}
	public void setNumberOfSprinkleSetting(NumberOfSprinkleSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_OF_SPRINKLES_SETTING, msg);	
	}
	public IntervalSettingValue getSprinkleIntervalSetting() {
		return (IntervalSettingValue) getProperty(PROPERTY_HAS_SPRINKLE_INTERVAL_SETTING);	
	}
	public void setSprinkleIntervalSetting(IntervalSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPRINKLE_INTERVAL_SETTING, msg);	
	}
	public OperationStatusValue getSprinkleValueOpenCloseSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_SPRINKLE_VALUE_OPEN_CLOSE_SETTING);	
	}
	public void setSprinkleValueOpenCloseSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPRINKLE_VALUE_OPEN_CLOSE_SETTING, msg);	
	}
	
	public GardenSprinkler() {
		super();
	}
	public GardenSprinkler(String uri) {
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
