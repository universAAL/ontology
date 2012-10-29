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

public class EnergyMeasurement extends ManagedIndividual{

	public static final String MY_URI = ReadEnergyOntology.NAMESPACE + "EnergyReaderMeassurement";
	public static final String PROP_HAS_VALUE = ReadEnergyOntology.NAMESPACE +"hasValue";
	public static final String PROP_HAS_UNIT = ReadEnergyOntology.NAMESPACE +"hasUnit";
	
	 public EnergyMeasurement() {
		  super();
	  }

	  public EnergyMeasurement(String uri) {
		super(uri);
	  }
	  public String getClassURI(){
			return MY_URI;  
		}
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	  }

	public Integer getValue() {
		return (Integer) props.get(PROP_HAS_VALUE);
	}

	public String getUnit() {
		return (String) props.get(PROP_HAS_UNIT);
	}
	
	public void setValue(Object value){
		props.put(PROP_HAS_VALUE, value);
	}

	public void setUnit(String value){
		props.put(PROP_HAS_UNIT, value);
	}
}
