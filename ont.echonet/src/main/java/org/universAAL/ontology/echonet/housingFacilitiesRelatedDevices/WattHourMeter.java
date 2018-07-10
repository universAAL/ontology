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
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class WattHourMeter extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "WattHourMetter";
	
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT = EchonetOntology.NAMESPACE + "hasMeasuredCummulativeElectricEnergyAmount";
	public static final String PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT = EchonetOntology.NAMESPACE + "hasCummulativeElectricEnergyAmountUnit";
	public static final String PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_MEASUREMENT_LOG_1 = EchonetOntology.NAMESPACE + "hasCummulativeElectricEnergyMeasurementLog1";
	public static final String PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_MEASUREMENT_LOG_2 = EchonetOntology.NAMESPACE + "hasCummulativeElectricEnergyMeasurementLog2";

	public MeasuredValue getCummulativeElectricEnergyMeasurementLog2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_MEASUREMENT_LOG_2);	
	}
	public void setCummulativeElectricEnergyMeasurementLog2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_MEASUREMENT_LOG_2, msg);	
	}
	public MeasuredValue getCummulativeElectricEnergyMeasurementLog1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_MEASUREMENT_LOG_1);	
	}
	public void setCummulativeElectricEnergyMeasurementLog1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_MEASUREMENT_LOG_1, msg);	
	}

	public String getCummulativeElectricEnergyAmountUnit() {
		return (String) getProperty(PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT);	
	}
	public void setCummulativeElectricEnergyAmountUnit(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT, msg);	
	}
	public MeasuredValue getMeasuredCummulativeElectricEnergyAmount() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT);	
	}
	public void setMeasuredCummulativeElectricEnergyAmount(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT, msg);	
	}

	
	public WattHourMeter() {
		super();
	}
	public WattHourMeter(String uri) {
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
