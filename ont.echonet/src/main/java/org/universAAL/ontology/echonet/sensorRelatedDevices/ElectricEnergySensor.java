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

public class ElectricEnergySensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ElectricEnergySensor";
	public static final String PROPERTY_HAS_CUMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY = 
			EchonetOntology.NAMESPACE + "hasCumulativeAmountOfElectriceEnergy";
	public static final String PROPERTY_HAS_MEDIUM_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY = 
			EchonetOntology.NAMESPACE + "hasMediumCapacitySensorInstantaneousElectricEnergy";
	public static final String PROPERTY_HAS_SMALL_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY = 
			EchonetOntology.NAMESPACE + "hasSmallCapacitySensorInstantaneousElectricEnergy";
	public static final String PROPERTY_HAS_LARGE_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY = 
			EchonetOntology.NAMESPACE + "hasLargeCapacitySensorInstantaneousElectricEnergy";
	public static final String PROPERTY_HAS_CUMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY_MEASUREMENT_LOG = 
			EchonetOntology.NAMESPACE + "hasCumulativeAmountOfElectriceEnergyMeasurementLog";
	public static final String PROPERTY_HAS_EFFECTIVE_VOLTAGE_VALUE = 
			EchonetOntology.NAMESPACE + "hasEffectiveMeasuredValue";
	public ElectricEnergySensor() {
		super();
	}

	public ElectricEnergySensor(String uri) {
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
	
	public MeasuredValue getCumulativeAmountOfElectriceEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY);	
	}
	public void setCumulativeAmountOfElectriceEnergy(MeasuredValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_CUMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY,msg);	
	}
	public MeasuredValue getMediumCapacitySensorInstantaneousElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEDIUM_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY);	
	}
	public void setMediumCapacitySensorInstantaneousElectricEnergy(MeasuredValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_MEDIUM_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY,msg);	
	}
	public MeasuredValue getSmallCapacitySensorInstantaneousElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SMALL_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY);	
	}
	public void setSmallCapacitySensorInstantaneousElectricEnergy(MeasuredValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_SMALL_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY,msg);	
	}
	public MeasuredValue getLargeCapacitySensorInstantaneousElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_LARGE_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY);	
	}
	public void setLargeCapacitySensorInstantaneousElectricEnergy(MeasuredValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_LARGE_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY,msg);	
	}
	public MeasuredValue getCumulativeAmountOfElectriceEnergyMeasurementLog() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY_MEASUREMENT_LOG);	
	}
	public void setCumulativeAmountOfElectriceEnergyMeasurementLog(MeasuredValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_CUMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY_MEASUREMENT_LOG,msg);	
	}
	public MeasuredValue getEffectiveMeasuredValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_EFFECTIVE_VOLTAGE_VALUE);	
	}
	public void setEffectiveMeasuredValue(MeasuredValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_EFFECTIVE_VOLTAGE_VALUE,msg);	
	}
	

}
