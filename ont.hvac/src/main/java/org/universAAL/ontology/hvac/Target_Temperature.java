/*
	Copyright 2015 UPM, http://www.upm.es/
Universidad Politécnica de Madrid
 */
package org.universAAL.ontology.hvac;

/**
 * @author Ricardo
 * Description: Target Temperature includes the air conditioning and heating, and their different properties
 */

public abstract class Target_Temperature extends Hvac {
	
    public static final String MY_URI = HvacOntology.NAMESPACE + "Target_Temperature";
   
    
    public static final String PROP_HAS_TEMPERATURE = HvacOntology.NAMESPACE + "hasTemperature";
    
    // this property is for indicate the unit temperature, Celsius, Degrees....
    public static final String PROP_TEMPERATURE_UNIT = HvacOntology.NAMESPACE + "temperatureUnit";
 
    
    public static final String PROP_TARGET_TEMPERATURE_VALUE = HvacOntology.NAMESPACE + "targetTemperatureValue";
    
    public static final String PROP_CURRENT_TEMPERATURE_VALUE = HvacOntology.NAMESPACE + "currentTemperatureValue";
    
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


   public Float getCurrentTemperatureValue()
   {
	   return (Float)getProperty(PROP_CURRENT_TEMPERATURE_VALUE);
   }
   public boolean setTarget_Temperature_Value(Float targetTemperature){
	   return changeProperty(PROP_TARGET_TEMPERATURE_VALUE, targetTemperature);
	   
   }
}