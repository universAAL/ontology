/*
	Copyright 2008-2014 ITACA-TSB, http://www.tsb.upv.es
	Instituto Tecnologico de Aplicaciones de Comunicacion 
	Avanzadas - Grupo Tecnologias para la Salud y el 
	Bienestar (TSB)
	
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
package org.universAAL.ontology.hvac;

import org.universAAL.ontology.measurement.Measurement;

public abstract class Target_Temperature extends Hvac {
	
    public static final String MY_URI = HvacOntology.NAMESPACE + "Target_Temperature";
   
    public static final String PROP_HAS_TEMPERATURE = HvacOntology.NAMESPACE + "hasTemperature";
    
//    public static final String PROP_TEMPARATURE_UNIT = HvacOntology.NAMESPACE + "temperatureUnit";
// 
//    public static final String PROP_TEMPARATURE_VALUE = HvacOntology.NAMESPACE + "temperatureValue";
//    
    public Target_Temperature() {
	
    	super();
    }

    public Target_Temperature(String uri) {
    	super(uri);
        }

    public String getClassURI() {
	return MY_URI;
    }

  

    public boolean isWellFormed() {
    	return true && hasProperty(PROP_HAS_STATUSVALUE) && hasProperty(PROP_HAS_TEMPERATURE);
    }

//    public MeasurableDimension getTemperature() {
//    	MeasurableDimension temperature = (MeasurableDimension) getProperty(PROP_HAS_TEMPERATURE);
//   		return temperature.getmeasurableDimensionByOrder(4);
//   	    }
//
//   	    public void setTemperature(int newPropValue) {
//   		changeProperty(PROP_HAS_TEMPERATURE, new MeasurableDimension(newPropValue));
//   	    }
    public void setTemperature(Measurement t){
    	if(t != null){
    	    changeProperty(PROP_HAS_TEMPERATURE, t);
    	}
        }
        public Measurement getTemperature(){
    	return (Measurement) getProperty(PROP_HAS_TEMPERATURE);
        }
}