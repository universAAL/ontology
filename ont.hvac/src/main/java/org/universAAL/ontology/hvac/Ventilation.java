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

import org.universAAL.middleware.owl.supply.LevelRating;



/**
 * Class for all Ventilation systems. Where ventilation is any system that is capable of moving the air in a room.
 * @author Ricardo
 */
public class Ventilation extends Hvac {
	public static final String MY_URI = HvacOntology.NAMESPACE
		    + "Ventilation";

    public static final String PROP_HAS_VENTILATION_MODE = HvacOntology.NAMESPACE + "hasVentilation_Mode";
   

	    public Ventilation(String uri) {
		super(uri);
	    }



	    public String getClassURI() {
	    	return MY_URI;
	        }

	        public int getPropSerializationType(String arg0) {
	    	return PROP_SERIALIZATION_FULL;
	        }

	        public boolean isWellFormed() {
	        	
	        	return true ;

	        }
	       
	     
	       public Ventilation_Mode getVentilation_Mode(){
	    	   return (Ventilation_Mode)getProperty(PROP_HAS_VENTILATION_MODE);
	       }
	       public boolean setMode(Ventilation_Mode ventilation_Mode){
	    	   return changeProperty(PROP_HAS_VENTILATION_MODE, ventilation_Mode);
	    	   
	       }
	       public LevelRating getFan(){
	    	   return (LevelRating)getProperty(PROP_HAS_FAN);
	       }
	       public boolean setFan(LevelRating fan){
	    	   return changeProperty(PROP_HAS_FAN, fan);
	    	   
	       }
	       public LevelRating getSwing(){
	    	   return (LevelRating)getProperty(PROP_HAS_SWING);
	       }
	       public boolean setSwing(LevelRating swing){
	    	   return changeProperty(PROP_HAS_SWING, swing);
	    	   
	       }
	      
	       

	}