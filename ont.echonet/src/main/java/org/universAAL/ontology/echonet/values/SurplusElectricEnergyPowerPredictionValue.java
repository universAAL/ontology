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
package org.universAAL.ontology.echonet.values;

import java.util.Date;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class SurplusElectricEnergyPowerPredictionValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "SurplusElectricEnergyPowerPredictionValue";
	public static final String PROPERTY_HAS_PREDICTION_TIME = EchonetOntology.NAMESPACE + "hasPredictionTime";
	public static final String PROPERTY_HAS_SURPLUS_POWER_PREDICTION_VALUE = EchonetOntology.NAMESPACE + "hasSurplusPowerPredictionValue";

	public SurplusElectricEnergyPowerPredictionValue() {
		super();
	}
	public SurplusElectricEnergyPowerPredictionValue(String uri) {
		super(uri);
	}
	public SurplusElectricEnergyPowerPredictionValue(String uri, Date date,MeasuredValue value ) {
		super(uri);
		setPredictionTime(date);
		setSurplusPowerPredictionValue(value);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public Date getPredictionTime() {
		return (Date) getProperty(PROPERTY_HAS_PREDICTION_TIME);
	}
	public void setPredictionTime(Date msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_PREDICTION_TIME,msg);
	}
	public MeasuredValue getSurplusPowerPredictionValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SURPLUS_POWER_PREDICTION_VALUE);
	}
	public void setSurplusPowerPredictionValue(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_SURPLUS_POWER_PREDICTION_VALUE,msg);
	}
	public String getClassURI() {
		return MY_URI;
	}

}
