/*
	Copyright 2015 UPM, http://www.upm.es/
Universidad Politécnica de Madrid
 */
package org.universAAL.ontology.hvac;

import org.universAAL.ontology.hvac.StatusValue;
/**
 * @author Ricardo
 * Description: Its the class for Heating and his properties.
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