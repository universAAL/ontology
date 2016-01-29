package org.universAAL.ontology.hvac;

import org.universAAL.ontology.hvac.StatusValue;
import org.universAAL.ontology.hvac.Fan;

public class Ventilation extends ValueHvac {
	public static final String MY_URI = HvacOntology.NAMESPACE
		    + "Ventilation";

	   

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
return true && hasProperty(PROP_HAS_VALUE);
}

public int getValue() {
Integer i = (Integer) getProperty(PROP_HAS_VALUE);
return (i == null) ? 0 : i.intValue();
}

public void setValue(int newPropValue) {
changeProperty(PROP_HAS_VALUE, new Integer(newPropValue));
}
}