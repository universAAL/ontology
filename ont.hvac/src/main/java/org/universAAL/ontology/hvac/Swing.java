/*
	Copyright 2015 UPM, http://www.upm.es/
Universidad Politécnica de Madrid
 */
package org.universAAL.ontology.hvac;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.*;

/**
 * @author Ricardo
 * Description: The Fan is the intensity.
 */
public class Swing extends Level  {
public static final String MY_URI = HvacOntology.NAMESPACE + "Fan";

public Swing() {
	super(order);
    }

    public Swing(int uri) {
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