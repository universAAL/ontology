/*
	Copyright 2015 UPM, http://www.upm.es/
Universidad Politécnica de Madrid
 */
package org.universAAL.ontology.hvac;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.hvac.StatusValue;

/**
 * @author Ricardo
 * Description: A class for include the different modes of hvac
 */
public class Mode extends ManagedIndividual {
    public static final String MY_URI = HvacOntology.NAMESPACE
	    + "Mode";

  
    protected static final String[] tipo= {"Air_Conditioning_Mode","Heating_Mode","Ventilation_Mode"}; 

    public Mode(String names) {
	}

	public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
    }



    
}