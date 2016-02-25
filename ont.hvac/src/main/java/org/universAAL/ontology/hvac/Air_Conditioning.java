/*
	Copyright 2015 UPM, http://www.upm.es/
Universidad Politécnica de Madrid
 */
package org.universAAL.ontology.hvac;

import org.springframework.osgi.compendium.internal.cm.UpdateStrategy;


/**
 * @author Ricardo
 * Description: Its the class for Air_Conditioning and his properties.
 */
public class Air_Conditioning extends Target_Temperature {
    public static final String MY_URI = HvacOntology.NAMESPACE+ "Air_Conditioning";
    public static final String PROP_HAS_AIR_CONDITIONING_MODE = HvacOntology.NAMESPACE + "hasAir_Conditioning_Mode";


    public Air_Conditioning() {
    	super();
        }

        public Air_Conditioning(String uri) {
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
       
     
       public Air_Conditioning_Mode getAir_Conditioning_Mode(){
    	   return (Air_Conditioning_Mode)getProperty(PROP_HAS_AIR_CONDITIONING_MODE);
       }
       public boolean setMode(Air_Conditioning_Mode air_conditioning_Mode){
    	   return changeProperty(PROP_HAS_AIR_CONDITIONING_MODE, air_conditioning_Mode);
    	   
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