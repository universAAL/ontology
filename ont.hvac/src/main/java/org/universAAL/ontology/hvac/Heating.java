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

import org.universAAL.ontology.hvac.StatusValue;

public class Heating extends Target_Temperature {
    public static final String MY_URI = HvacOntology.NAMESPACE
	    + "Heating";
    public static final String PROP_HAS_HEATING_MODE = HvacOntology.NAMESPACE + "hasHeating_Mode";

    public Heating() {
	super();
    }

    public Heating(String uri) {
	super(uri);
    }
    public String getClassURI() {
    	return MY_URI;
        }

        public int getPropSerializationType(String arg0) {
    	return PROP_SERIALIZATION_FULL;
        }

        public boolean isWellFormed() {
        	
        	return true && hasProperty(PROP_HAS_STATUSVALUE) && hasProperty(PROP_HAS_TEMPERATURE);

        }
       
     
       public Heating_Mode getHeating_Mode(){
    	   return (Heating_Mode)getProperty(PROP_HAS_HEATING_MODE);
       }
       public boolean setMode(Heating_Mode Heating_Mode){
    	   return changeProperty(PROP_HAS_HEATING_MODE, Heating_Mode);
    	   
       }
       public Fan getFan(){
    	   return (Fan)getProperty(PROP_HAS_FAN);
       }
       public boolean setFan(Fan fan){
    	   return changeProperty(PROP_HAS_FAN, fan);
    	   
       }
       public Swing getSwing(){
    	   return (Swing)getProperty(PROP_HAS_SWING);
       }
       public boolean setSwing(Swing swing){
    	   return changeProperty(PROP_HAS_SWING, swing);
    	   
       }
      


}