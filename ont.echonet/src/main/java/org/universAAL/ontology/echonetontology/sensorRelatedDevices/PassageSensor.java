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
package org.universAAL.ontology.echonetontology.sensorRelatedDevices;

import org.universAAL.ontology.echonetontology.EchonetOntology;
import org.universAAL.ontology.echonetontology.EchonetSuperDevice;
import org.universAAL.ontology.echonetontology.values.DetectionDirectionValue;
import org.universAAL.ontology.echonetontology.values.ThresholdLevelValue;

public class PassageSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "PassageSensor";
	public static final String PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL = EchonetOntology.NAMESPACE + "hasDectectionThresholdLevel";
	public static final String PROPERTY_HAS_DETECTION_HOLD_TIME = EchonetOntology.NAMESPACE + "hasDectectionHoldTime";
	public static final String PROPERTY_HAS_DETECTION_DIRECTION = EchonetOntology.NAMESPACE + "hasDectectionDirection";
	public PassageSensor() {
		super();
	}

	public PassageSensor(String uri) {
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
	
	public ThresholdLevelValue getDetectionThresholdLevel() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL);	
	}
	public void setDetectionThresholdLevel(ThresholdLevelValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,msg);	
	}
	public Integer getDectectionHoldTime() {
		return (Integer) getProperty(PROPERTY_HAS_DETECTION_HOLD_TIME);	
	}
	public void setDectectionHoldTime(Integer msg) {
		if(msg !=null)	
			changeProperty(PROPERTY_HAS_DETECTION_HOLD_TIME,msg);	
	}
	public DetectionDirectionValue getDectectionDirection() {
		return (DetectionDirectionValue) getProperty(PROPERTY_HAS_DETECTION_DIRECTION);	
	}
	public void setDectectionDirection(DetectionDirectionValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_DETECTION_DIRECTION,msg);	
	}
	

}
