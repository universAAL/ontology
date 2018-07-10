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
package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class CO2Sensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "Co2Sensor";
	public static final String PROPERTY_HAS_MEASURED_VALUE_OF_CO2_CONCENTRATION = EchonetOntology.NAMESPACE + "hasMeasuredValueOfCO2Concentration";
		public CO2Sensor() {
		super();
	}

	public CO2Sensor(String uri) {
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
	

	public MeasuredValue getCO2ConcentrationMeasuredValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_VALUE_OF_CO2_CONCENTRATION);	
	}
	public void setCO2ConcentrationMeasuredValue(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_MEASURED_VALUE_OF_CO2_CONCENTRATION,msg);	
	}
	

}
