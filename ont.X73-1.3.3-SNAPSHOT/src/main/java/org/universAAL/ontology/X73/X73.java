package org.universAAL.ontology.X73;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.service.owl.Service;

public class X73 extends Service {
    public static final String MY_URI = X73Ontology.NAMESPACE + "x73";
    public static final String PROP_CONTROLS = X73Ontology.NAMESPACE
	    + "controls";

    public X73() {
	super();
    }

    public X73(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_CONTROLS.equals(propURI) ? PROP_SERIALIZATION_FULL : super
		.getPropSerializationType(propURI);
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_CONTROLS);
    }

    public MDS getControls() {
	return (MDS) getProperty(PROP_CONTROLS);
    }

    public void setControls(MDS newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_CONTROLS, newPropValue);
    }
}
