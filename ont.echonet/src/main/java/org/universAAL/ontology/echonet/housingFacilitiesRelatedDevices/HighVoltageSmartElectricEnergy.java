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

	public MeasuredValue getMeasuredCumulativeReactiveElectricPowerConsumptionForPoweerFactorMeasurementHistoricalData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT_HISTORICAL_DATA);	
	}
	public void setMeasuredCumulativeReactiveElectricPowerConsumptionForPoweerFactorMeasurementHistoricalData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT_HISTORICAL_DATA, msg);	
	}
	public String getMeasuredCumulativeReactiveElectricPowerConsumptionAmountUnit() {
		return (String) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AMOUNT_UNIT);	
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
	public MeasuredValue getMeasuredCumulativeReactiveElectricPowerConsumptionAtFixedTimeForPowerFactorMeasurement() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AT_FIXED_TIME_FOR_POWER_FACTOR_MEASUREMENT);	
	}
	public void setMeasuredCumulativeReactiveElectricPowerConsumptionAtFixedTimeForPowerFactorMeasurement(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AT_FIXED_TIME_FOR_POWER_FACTOR_MEASUREMENT, msg);	
	}
	public MeasuredValue getMeasuredReactiveElectricPowerConsumptionForPowerFactorMeasurement() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT);	
	}
	public void setMeasuredReactiveElectricPowerConsumptionForPowerFactorMeasurement(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT, msg);	
	}
	public String getCumulativeMaximumElectricPowerDemandUnit() {
		return (String) getProperty(PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND_UNIT);	
	}
	public void setCumulativeMaximumElectricPowerDemandUnit(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND_UNIT, msg);	
	}
	public MeasuredValue getMeasuredElectricPowerDemandHistoricalData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_ELECTRIC_POWER_DEMAND_HISTORICAL_DATA);	
	}
	public void setMeasuredElectricPowerDemandHistoricalData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_ELECTRIC_POWER_DEMAND_HISTORICAL_DATA, msg);	
	}
	public String getElectricPowerDemandUnit() {
		return (String) getProperty(PROPERTY_HAS_ELECTRIC_POWER_DEMAND_UNIT);	
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
	public MeasuredValue getElectricPowerDemandAtFixedTime() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_ELECTRIC_POWER_DEMAND_AT_FIXED_TIME);	
	}
	public void setElectricPowerDemandAtFixedTime(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ELECTRIC_POWER_DEMAND_AT_FIXED_TIME, msg);	
	}
	public MeasuredValue getCumulativeMaximumElectricPowerDemand() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND);	
	}
	public void setCumulativeMaximumElectricPowerDemand(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND, msg);	
	}
	public MeasuredValue getMonthlyMaximumElectricPowerDemand() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MONTHLY_MAXIMUM_ELECTRIC_POWER_DEMAND);	
	}
	public void setMonthlyMaximumElectricPowerDemand(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MONTHLY_MAXIMUM_ELECTRIC_POWER_DEMAND, msg);	
	}
	public MeasuredValue getMeasuredCumulativeActiveElectricEnergyAmountHistoricalData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA);	
	}
	public void setMeasuredCumulativeActiveElectricEnergyAmountHistoricalData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA, msg);	
	}
	public String getMeasuredCumulativeActiveElectricEnergyAmountUnit() {
		return (String) getProperty(PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_UNIT);	
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
	public MeasuredValue getCumulativeActiveElectricEnergyForPowerFactorMeasurement() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_FOR_POWER_FACTOR_MEASUREMENT);	
	}
	public void setCumulativeActiveElectricEnergyForPowerFactorMeasurement(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_FOR_POWER_FACTOR_MEASUREMENT, msg);	
	}
	public MeasuredValue getCumulativeActiveElectricEnergyAmountMeasuredAtFixedTime() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME);	
	}
	public void setCumulativeActiveElectricEnergyAmountMeasuredAtFixedTime(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME, msg);	
	}
	public MeasuredValue getMeasuredCumulativeActiveElectricEnergyAmount() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT);	
	}
	public void setMeasuredCumulativeActiveElectricEnergyAmount(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT, msg);	
	}
	public DateTimeValue getDayToRetrieveMeasuredCumulativeElectricEnergyHistoricalData() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_HISTORICAL_DATA);	
	}
	public void setDayToRetrieveMeasuredCumulativeElectricEnergyHistoricalData(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_HISTORICAL_DATA, msg);	
	}
	public DateTimeValue getFixedDay() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_FIXED_DAY);	
	}
	public void setFixedDay(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FIXED_DAY, msg);	
	}
	public MeasuredValue getMultiplyingFactorForCoefficient() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MULTIPLYING_FACTOR_FOR_COEFFICIENT);	
	}
	public void setMultiplyingFactorForCoefficient(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MULTIPLYING_FACTOR_FOR_COEFFICIENT, msg);	
	}
	public MeasuredValue getCoefficient() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_COEFFICIENT);	
	}
	public void setCoefficient(MeasuredValue msg) {
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
