package org.universAAL.ontology.X73;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;

public class SystemModel extends ManagedIndividual {
    public static final String MY_URI = X73Ontology.NAMESPACE + "SystemModel";
    public static final String PROP_MANUFACTURER = X73Ontology.NAMESPACE
	    + "manufacturer";
    public static final String PROP_MODEL_NUMBER = X73Ontology.NAMESPACE
	    + "modelNumber";

    public SystemModel() {
	super();
    }

    public SystemModel(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_MANUFACTURER)
		&& hasProperty(PROP_MODEL_NUMBER);
    }

    public String getManufacturer() {
	return (String) getProperty(PROP_MANUFACTURER);
    }

    public void setManufacturer(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_MANUFACTURER, newPropValue);
    }

    public String getModelNumber() {
	return (String) getProperty(PROP_MODEL_NUMBER);
    }

    public void setModelNumber(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_MODEL_NUMBER, newPropValue);
    }
}
