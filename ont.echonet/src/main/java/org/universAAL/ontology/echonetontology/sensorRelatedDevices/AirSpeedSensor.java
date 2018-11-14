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


public class AirSpeedSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "AirSpeedSensor";
	public static final String PROPERTY_HAS_MEASURED_VALUE_OF_AIR_SPEED = EchonetOntology.NAMESPACE + "hasMeasuredValueOfAirSpeed";
	public static final String PROPERTY_HAS_AIR_FLOW_DIRECTION = EchonetOntology.NAMESPACE + "hasAirFlowDirection";
	public AirSpeedSensor() {
		super();
	}

	public AirSpeedSensor(String uri) {
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
	
	public Float setAirSpeedValue() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_VALUE_OF_AIR_SPEED);	
	}
	public void getAirSpeedValue(Float msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_MEASURED_VALUE_OF_AIR_SPEED,msg);	
	}
	public Integer setAirFlowDirection() {
		return (Integer) getProperty(PROPERTY_HAS_AIR_FLOW_DIRECTION);	
	}
	public void getAirFlowDirection(Integer msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_AIR_FLOW_DIRECTION,msg);	
	}
	

}
