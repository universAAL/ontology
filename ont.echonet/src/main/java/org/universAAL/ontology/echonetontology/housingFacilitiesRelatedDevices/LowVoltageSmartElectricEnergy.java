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

	public String getDayToRetrieveMeasuredCumulativeElectricEnergy2() {
		return  getProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_2).toString();	
	}
	public void setDayToRetrieveMeasuredCumulativeElectricEnergy2(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_2, msg);	
	}
	public Float getMeasuredCumulativeElectricEnergyAmountHistoricalData2() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_2);	
	}
	public void setMeasuredCumulativeElectricEnergyAmountHistoricalData2(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_2, msg);	
	}
	public Float getCumulativeElectricEnergyAmountMeasuredAtFixedTime_ReversedDirection() {
		return (Float) getProperty(PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_REVERSED_DIRECTION);	
	}
	public void setCumulativeElectricEnergyAmountMeasuredAtFixedTime_ReversedDirection(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_REVERSED_DIRECTION, msg);	
	}
	public Float getCumulativeElectricEnergyAmountMeasuredAtFixedTime_NormalDirection() {
		return (Float) getProperty(PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_NORMAL_DIRECTION);	
	}
	public void setCumulativeElectricEnergyAmountMeasuredAtFixedTime_NormalDirection(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_NORMAL_DIRECTION, msg);	
	}
	public Float getMeasuredInstantanenousCurrent() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT);	
	}
	public void setMeasuredInstantanenousCurrent(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT, msg);	
	}
	public Float getMeasuredInstantanenousAmountOfElectricEnergy() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_AMOUNT_OF_ELECTRIC_ENERGY);	
	}
	public void setMeasuredInstantanenousAmountOfElectricEnergy(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_AMOUNT_OF_ELECTRIC_ENERGY, msg);	
	}
	public String getDayToRetrieveMeasuredCumulativeElectricEnergy() {
		return  getProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY).toString();	
	}
	public void setDayToRetrieveMeasuredCumulativeElectricEnergy(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY, msg);	
	}
	public Float getMeasuredCumulativeElectricEnergyAmountHistoricalData_ReverseDirection() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_REVERSE_DIRECTION);	
	}
	public void setMeasuredCumulativeElectricEnergyAmountHistoricalData_ReverseDirection(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_REVERSE_DIRECTION, msg);	
	}
	public Float getMeasuredCumulativeElectricEnergyAmount_ReverseDirection() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_REVERSE_DIRECTION);	
	}
	public void setMeasuredCumulativeElectricEnergyAmount_ReverseDirection(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_REVERSE_DIRECTION, msg);	
	}
	public Float getMeasuredCumulativeElectricEnergyAmountHistoricalData_NormalDirection() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_NORMAL_DIRECTION);	
	}
	public void setMeasuredCumulativeElectricEnergyAmountHistoricalData_NormalDirection(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_NORMAL_DIRECTION, msg);	
	}
	public String getMeasuredCumulativeElectricEnergyAmountUnit() {
		return  getProperty(PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT).toString();	
	}
	public void setMeasuredCumulativeElectricEnergyAmountUnit(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT, msg);	
	}
	public Float getMeasuredCumulativeElectricEnergyAmount_NormalDirection() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_NORMAL_DIRECTION);	
	}
	public void setMeasuredCumulativeElectricEnergyAmount_NormalDirection(Float msg) {
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
	public Float getCoefficient() {
		return (Float) getProperty(PROPERTY_HAS_COEFFICIENT);	
	}
	public void setCoefficient(Float msg) {
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
