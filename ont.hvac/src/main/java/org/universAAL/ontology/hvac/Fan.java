/*
	Copyright 2015 UPM, http://www.upm.es/
Universidad Politécnica de Madrid
 */

package org.universAAL.ontology.hvac;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.*;

/**
 * @author Ricardo
 * Description: Fan controlls the intensity of the air.
 */
public class Fan extends Level  {
public static final String MY_URI = HvacOntology.NAMESPACE + "Fan";

public Fan() {
	super(order);
    }

    public Fan(int uri) {
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
}