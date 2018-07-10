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
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class LowVoltageSmartElectricEnergy extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "LowVoltageSmartElectricEnergy";	
	public static final String PROPERTY_HAS_COEFFICIENT= EchonetOntology.NAMESPACE + "hasCoefficient";
	public static final String PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_CUMULATIVE_ELECTRIC_ENERGY= EchonetOntology.NAMESPACE + "hasNumberOfEffectiveDigitsForCumulativeElectricEnergy";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_NORMAL_DIRECTION = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeElectricEnergyAmount_NormalDirection";
	public static final String PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeElectricEnergyAmountUnit";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_NORMAL_DIRECTION = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeElectricEnergyAmountHistoricalData_NormalDirection";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_REVERSE_DIRECTION = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeElectricEnergyAmount_ReverseDirection";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_REVERSE_DIRECTION = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeElectricEnergyAmountHistoricalData_ReverseDirection";
	public static final String PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "hasDayToRetrieveMeasuredCumulativeElectricEnergy";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_AMOUNT_OF_ELECTRIC_ENERGY= EchonetOntology.NAMESPACE + "hasMeasuredInstantanenousAmountOfElectricEnergy";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT= EchonetOntology.NAMESPACE + "hasMeasuredInstantanenousCurrent";
	public static final String PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_NORMAL_DIRECTION = EchonetOntology.NAMESPACE + "hasCumulativeElectricEnergyAmountMeasuredAtFixedTime_NormalDirection";
	public static final String PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_REVERSED_DIRECTION = EchonetOntology.NAMESPACE + "hasCumulativeElectricEnergyAmountMeasuredAtFixedTime_ReversedDirection";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_2 = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeElectricEnergyAmountHistoricalData2";
	public static final String PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_2 = EchonetOntology.NAMESPACE + "hasDayToRetrieveMeasuredCumulativeElectricEnergy2";

	public DateTimeValue getDayToRetrieveMeasuredCumulativeElectricEnergy2() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_2);	
	}
	public void setDayToRetrieveMeasuredCumulativeElectricEnergy2(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_2, msg);	
	}
	public MeasuredValue getMeasuredCumulativeElectricEnergyAmountHistoricalData2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_2);	
	}
	public void setMeasuredCumulativeElectricEnergyAmountHistoricalData2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_2, msg);	
	}
	public MeasuredValue getCumulativeElectricEnergyAmountMeasuredAtFixedTime_ReversedDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_REVERSED_DIRECTION);	
	}
	public void setCumulativeElectricEnergyAmountMeasuredAtFixedTime_ReversedDirection(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_REVERSED_DIRECTION, msg);	
	}
	public MeasuredValue getCumulativeElectricEnergyAmountMeasuredAtFixedTime_NormalDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_NORMAL_DIRECTION);	
	}
	public void setCumulativeElectricEnergyAmountMeasuredAtFixedTime_NormalDirection(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_NORMAL_DIRECTION, msg);	
	}
	public MeasuredValue getMeasuredInstantanenousCurrent() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT);	
	}
	public void setMeasuredInstantanenousCurrent(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT, msg);	
	}
	public MeasuredValue getMeasuredInstantanenousAmountOfElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_AMOUNT_OF_ELECTRIC_ENERGY);	
	}
	public void setMeasuredInstantanenousAmountOfElectricEnergy(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_AMOUNT_OF_ELECTRIC_ENERGY, msg);	
	}
	public DateTimeValue getDayToRetrieveMeasuredCumulativeElectricEnergy() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY);	
	}
	public void setDayToRetrieveMeasuredCumulativeElectricEnergy(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY, msg);	
	}
	public MeasuredValue getMeasuredCumulativeElectricEnergyAmountHistoricalData_ReverseDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_REVERSE_DIRECTION);	
	}
	public void setMeasuredCumulativeElectricEnergyAmountHistoricalData_ReverseDirection(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_REVERSE_DIRECTION, msg);	
	}
	public MeasuredValue getMeasuredCumulativeElectricEnergyAmount_ReverseDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_REVERSE_DIRECTION);	
	}
	public void setMeasuredCumulativeElectricEnergyAmount_ReverseDirection(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_REVERSE_DIRECTION, msg);	
	}
	public MeasuredValue getMeasuredCumulativeElectricEnergyAmountHistoricalData_NormalDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_NORMAL_DIRECTION);	
	}
	public void setMeasuredCumulativeElectricEnergyAmountHistoricalData_NormalDirection(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_NORMAL_DIRECTION, msg);	
	}
	public String getMeasuredCumulativeElectricEnergyAmountUnit() {
		return (String) getProperty(PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT);	
	}
	public void setMeasuredCumulativeElectricEnergyAmountUnit(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT, msg);	
	}
	public MeasuredValue getMeasuredCumulativeElectricEnergyAmount_NormalDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_NORMAL_DIRECTION);	
	}
	public void setMeasuredCumulativeElectricEnergyAmount_NormalDirection(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_NORMAL_DIRECTION, msg);	
	}
	public Integer getNumberOfEffectiveDigitsForCumulativeElectricEnergy() {
		return (Integer) getProperty(PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_CUMULATIVE_ELECTRIC_ENERGY);	
	}
	public void setNumberOfEffectiveDigitsForCumulativeElectricEnergy(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_CUMULATIVE_ELECTRIC_ENERGY, msg);	
	}
	public MeasuredValue getCoefficient() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_COEFFICIENT);	
	}
	public void setCoefficient(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_COEFFICIENT, msg);	
	}
	
	public LowVoltageSmartElectricEnergy() {
		super();
	}
	public LowVoltageSmartElectricEnergy(String uri) {
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
