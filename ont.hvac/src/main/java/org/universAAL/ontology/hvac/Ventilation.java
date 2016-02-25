/*
	Copyright 2015 UPM, http://www.upm.es/
Universidad Politécnica de Madrid
 */
package org.universAAL.ontology.hvac;

import org.universAAL.ontology.hvac.StatusValue;
import org.universAAL.ontology.hvac.Fan;

/**
 * @author Ricardo
 * Description: Its the class for Ventilation systems and his properties.
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
	        	
	        	return true && hasProperty(PROP_HAS_STATUSVALUE) && hasProperty(PROP_HAS_TEMPERATURE);

	        }
	       
	     
	       public Ventilation_Mode getVentilation_Mode(){
	    	   return (Ventilation_Mode)getProperty(PROP_HAS_VENTILATION_MODE);
	       }
	       public boolean setMode(Air_Conditioning_Mode air_conditioning_Mode){
	    	   return changeProperty(PROP_HAS_MODE, air_conditioning_Mode);
	    	   
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