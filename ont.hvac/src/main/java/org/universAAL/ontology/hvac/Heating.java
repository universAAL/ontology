/*******************************************************************************
 * Copyright 2015 UPM - Universidad Politécnica de Madrid
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.hvac;

/**
 * Class for Heating systems. Where heating systems are systems capable of heating the air in a room. 
 * @author Ricardo
 */
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
        	
        	return true && hasProperty(PROP_HAS_STATUSVALUE);

        }
       
     
       public Heating_Mode getHeating_Mode(){
    	   return (Heating_Mode)getProperty(PROP_HAS_HEATING_MODE);
       }
       public boolean setMode(Heating_Mode Heating_Mode){
    	   return changeProperty(PROP_HAS_HEATING_MODE, Heating_Mode);
    	   
       }
     
      


}