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

public class HighVoltageSmartElectricEnergy extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "HighVoltageSmartElectricEnergy";
	public static final String PROPERTY_HAS_COEFFICIENT= EchonetOntology.NAMESPACE + "hasCoefficient";
	public static final String PROPERTY_HAS_MULTIPLYING_FACTOR_FOR_COEFFICIENT= EchonetOntology.NAMESPACE + "hasMultiplyingFactorForCoefficient";
	public static final String PROPERTY_HAS_FIXED_DAY= EchonetOntology.NAMESPACE + "hasFixedDay";
	public static final String PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_HISTORICAL_DATA = EchonetOntology.NAMESPACE + "hasDayToRetrieveMeasuredCumulativeElectricEnergyHistoricalData";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeActiveElectricEnergyAmount";
	public static final String PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME = EchonetOntology.NAMESPACE + "hasCumulativeActiveElectricEnergyAmountMeasuredAtFixedTime";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_FOR_POWER_FACTOR_MEASUREMENT = EchonetOntology.NAMESPACE + "hasCumulativeActiveElectricEnergyForPowerFactorMeasurement";
	public static final String PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_CUMULATIVE_ELECTRIC_ENERGY= EchonetOntology.NAMESPACE + "hasNumberOfEffectiveDigitsForCumulativeElectricEnergy";
	public static final String PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_UNIT = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeActiveElectricEnergyAmountUnit";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeActiveElectricEnergyAmountHistoricalData";
	public static final String PROPERTY_HAS_MONTHLY_MAXIMUM_ELECTRIC_POWER_DEMAND = EchonetOntology.NAMESPACE + "hasMonthlyMaximumElectricPowerDemand";
	public static final String PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND = EchonetOntology.NAMESPACE + "hasCumulativeMaximumElectricPowerDemand";
	public static final String PROPERTY_HAS_ELECTRIC_POWER_DEMAND_AT_FIXED_TIME = EchonetOntology.NAMESPACE + "hasElectricPowerDemandAtFixedTime";
	public static final String PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_ELECTRIC_POWER_DEMAND= EchonetOntology.NAMESPACE + "hasNumberOfEffectiveDigitsForElectricPowerDemand";
	public static final String PROPERTY_HAS_ELECTRIC_POWER_DEMAND_UNIT= EchonetOntology.NAMESPACE + "hasElectricPowerDemandUnit";
	public static final String PROPERTY_HAS_MEASURED_ELECTRIC_POWER_DEMAND_HISTORICAL_DATA= EchonetOntology.NAMESPACE + "hasMeasuredElectricPowerDemandHistoricalData";
	public static final String PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND_UNIT = EchonetOntology.NAMESPACE + "hasCumulativeMaximumElectricPowerDemandUnit";
	public static final String PROPERTY_HAS_MEASURED_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT = EchonetOntology.NAMESPACE + 
										"hasMeasuredReactiveElectricPowerConsumptionForPowerFactorMeasurement";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AT_FIXED_TIME_FOR_POWER_FACTOR_MEASUREMENT = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeReactiveElectricPowerConsumptionAtFixedTimeForPowerFactorMeasurement";
	public static final String PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT = EchonetOntology.NAMESPACE + 
										"hasNumberOfEffectiveDigitsForMeasuredCumulativeReactiveElectricPowerConsumptionForPowerFactorMeasurement";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AMOUNT_UNIT = EchonetOntology.NAMESPACE + 
										"hasMeasuredCumulativeReactiveElectricPowerConsumptionAmountUnit";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT_HISTORICAL_DATA = EchonetOntology.NAMESPACE + 
										"hasMeasuredCumulativeReactiveElectricPowerConsumptionForPoweerFactorMeasurementHistoricalData";

	public Float getMeasuredCumulativeReactiveElectricPowerConsumptionForPoweerFactorMeasurementHistoricalData() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT_HISTORICAL_DATA);	
	}
	public void setMeasuredCumulativeReactiveElectricPowerConsumptionForPoweerFactorMeasurementHistoricalData(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT_HISTORICAL_DATA, msg);	
	}
	public String getMeasuredCumulativeReactiveElectricPowerConsumptionAmountUnit() {
		return  getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AMOUNT_UNIT).toString();	
	}
	public void setMeasuredCumulativeReactiveElectricPowerConsumptionAmountUnit(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AMOUNT_UNIT, msg);	
	}
	public Integer getNumberOfEffectiveDigitsForMeasuredCumulativeReactiveElectricPowerConsumptionForPowerFactorMeasurement() {
		return (Integer) getProperty(PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT);	
	}
	public void setNumberOfEffectiveDigitsForMeasuredCumulativeReactiveElectricPowerConsumptionForPowerFactorMeasurement(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT, msg);	
	}
	public Float getMeasuredCumulativeReactiveElectricPowerConsumptionAtFixedTimeForPowerFactorMeasurement() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AT_FIXED_TIME_FOR_POWER_FACTOR_MEASUREMENT);	
	}
	public void setMeasuredCumulativeReactiveElectricPowerConsumptionAtFixedTimeForPowerFactorMeasurement(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AT_FIXED_TIME_FOR_POWER_FACTOR_MEASUREMENT, msg);	
	}
	public Float getMeasuredReactiveElectricPowerConsumptionForPowerFactorMeasurement() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT);	
	}
	public void setMeasuredReactiveElectricPowerConsumptionForPowerFactorMeasurement(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT, msg);	
	}
	public String getCumulativeMaximumElectricPowerDemandUnit() {
		return  getProperty(PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND_UNIT).toString();	
	}
	public void setCumulativeMaximumElectricPowerDemandUnit(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND_UNIT, msg);	
	}
	public Float getMeasuredElectricPowerDemandHistoricalData() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_ELECTRIC_POWER_DEMAND_HISTORICAL_DATA);	
	}
	public void setMeasuredElectricPowerDemandHistoricalData(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_ELECTRIC_POWER_DEMAND_HISTORICAL_DATA, msg);	
	}
	public String getElectricPowerDemandUnit() {
		return  getProperty(PROPERTY_HAS_ELECTRIC_POWER_DEMAND_UNIT).toString();	
	}
	public void setElectricPowerDemandUnit(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ELECTRIC_POWER_DEMAND_UNIT, msg);	
	}
	public Integer getNumberOfEffectiveDigitsForElectricPowerDemand() {
		return (Integer) getProperty(PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_ELECTRIC_POWER_DEMAND);	
	}
	public void setNumberOfEffectiveDigitsForElectricPowerDemand(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_ELECTRIC_POWER_DEMAND, msg);	
	}
	public Float getElectricPowerDemandAtFixedTime() {
		return (Float) getProperty(PROPERTY_HAS_ELECTRIC_POWER_DEMAND_AT_FIXED_TIME);	
	}
	public void setElectricPowerDemandAtFixedTime(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ELECTRIC_POWER_DEMAND_AT_FIXED_TIME, msg);	
	}
	public Float getCumulativeMaximumElectricPowerDemand() {
		return (Float) getProperty(PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND);	
	}
	public void setCumulativeMaximumElectricPowerDemand(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND, msg);	
	}
	public Float getMonthlyMaximumElectricPowerDemand() {
		return (Float) getProperty(PROPERTY_HAS_MONTHLY_MAXIMUM_ELECTRIC_POWER_DEMAND);	
	}
	public void setMonthlyMaximumElectricPowerDemand(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MONTHLY_MAXIMUM_ELECTRIC_POWER_DEMAND, msg);	
	}
	public Float getMeasuredCumulativeActiveElectricEnergyAmountHistoricalData() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA);	
	}
	public void setMeasuredCumulativeActiveElectricEnergyAmountHistoricalData(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA, msg);	
	}
	public String getMeasuredCumulativeActiveElectricEnergyAmountUnit() {
		return  getProperty(PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_UNIT).toString();	
	}
	public void setMeasuredCumulativeActiveElectricEnergyAmountUnit(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_UNIT, msg);	
	}
	public Integer getNumberOfEffectiveDigitsForCumulativeElectricEnergy() {
		return (Integer) getProperty(PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_CUMULATIVE_ELECTRIC_ENERGY);	
	}
	public void setNumberOfEffectiveDigitsForCumulativeElectricEnergy(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_CUMULATIVE_ELECTRIC_ENERGY, msg);	
	}
	public Float getCumulativeActiveElectricEnergyForPowerFactorMeasurement() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_FOR_POWER_FACTOR_MEASUREMENT);	
	}
	public void setCumulativeActiveElectricEnergyForPowerFactorMeasurement(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_FOR_POWER_FACTOR_MEASUREMENT, msg);	
	}
	public Float getCumulativeActiveElectricEnergyAmountMeasuredAtFixedTime() {
		return (Float) getProperty(PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME);	
	}
	public void setCumulativeActiveElectricEnergyAmountMeasuredAtFixedTime(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME, msg);	
	}
	public Float getMeasuredCumulativeActiveElectricEnergyAmount() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT);	
	}
	public void setMeasuredCumulativeActiveElectricEnergyAmount(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT, msg);	
	}
	public String getDayToRetrieveMeasuredCumulativeElectricEnergyHistoricalData() {
		return  getProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_HISTORICAL_DATA).toString();	
	}
	public void setDayToRetrieveMeasuredCumulativeElectricEnergyHistoricalData(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_HISTORICAL_DATA, msg);	
	}
	public String getFixedDay() {
		return  getProperty(PROPERTY_HAS_FIXED_DAY).toString();	
	}
	public void setFixedDay(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FIXED_DAY, msg);	
	}
	public Float getMultiplyingFactorForCoefficient() {
		return (Float) getProperty(PROPERTY_HAS_MULTIPLYING_FACTOR_FOR_COEFFICIENT);	
	}
	public void setMultiplyingFactorForCoefficient(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MULTIPLYING_FACTOR_FOR_COEFFICIENT, msg);	
	}
	public Float getCoefficient() {
		return (Float) getProperty(PROPERTY_HAS_COEFFICIENT);	
	}
	public void setCoefficient(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_COEFFICIENT, msg);	
	}

	
	public HighVoltageSmartElectricEnergy() {
		super();
	}
	public HighVoltageSmartElectricEnergy(String uri) {
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
