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
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;
import org.universAAL.ontology.echonetontology.values.ThresholdLevelValue;

public class Buzzer extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "Buzzer";	
	public static final String PROPERTY_HAS_SOUND_GENERATION_SETTING = EchonetOntology.NAMESPACE + "hasSoundGenerationSetting";
	public static final String PROPERTY_HAS_BUZZER_SOUND_TYPE = EchonetOntology.NAMESPACE + "hasBuzzerSoundType";
	
	public ThresholdLevelValue getBuzzerSoundType() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_BUZZER_SOUND_TYPE);	
	}
	public void setBuzzerSoundType(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BUZZER_SOUND_TYPE, msg);	
	}
	public OperationStatusValue getSoundGenerationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_SOUND_GENERATION_SETTING);	
	}
	public void setSoundGenerationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SOUND_GENERATION_SETTING, msg);	
	}
	

	
	public Buzzer() {
		super();
	}
	public Buzzer(String uri) {
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
