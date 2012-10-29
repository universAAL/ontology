/*
	Copyright 2011-2012 TSB, http://www.tsbtecnologias.es
	TSB - Tecnologías para la Salud y el Bienestar
	
	See the NOTICE file distributed with this work for additional 
	information regarding copyright ownership
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */
package org.universAAL.ontology.energy.reader;

import org.universAAL.middleware.owl.ManagedIndividual;

public class ReadEnergy extends ManagedIndividual{
	
	public static final String MY_URI = ReadEnergyOntology.NAMESPACE + "ReadEnergy";

	public static final String PROP_HAS_MEASUREMENT = ReadEnergyOntology.NAMESPACE+"hasMeasurement";
	public static final String PROP_HAS_DEVICE = ReadEnergyOntology.NAMESPACE+"hasDevice";
	//This property defines if the measurement is the daily aggregate or the one made every minute
	public static final String PROP_IS_DAILY = ReadEnergyOntology.NAMESPACE+"isDaily";
	
	public ReadEnergy(String instanceURI) {
		super(instanceURI);
	}


	public ReadEnergy() {
		super();
	}

	public String getClassURI(){
		return MY_URI;  
	}


	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}
	
	public void setMeasurement(EnergyMeasurement m){
		props.put(PROP_HAS_MEASUREMENT, m);
	}
	
	public void setDevice(ReadEnergyDevice d){
		props.put(PROP_HAS_DEVICE, d);
	}
	
	public void setDaily(String daily){
		props.put(PROP_IS_DAILY, daily);
	}
	
	public String getDaily(){
		return (String) props.get(PROP_IS_DAILY);
	}
	
}
