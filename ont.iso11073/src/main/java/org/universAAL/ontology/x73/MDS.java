package org.universAAL.ontology.x73;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.ontology.X73Ontology;
import org.universAAL.ontology.phThing.Device;


public class MDS extends Device {
  public static final String MY_URI = X73Ontology.NAMESPACE
    + "MDS";
  public static final String PROP_SYSTEM_ID = X73Ontology.NAMESPACE
    + "systemId";


  public MDS () {
    super();
  }
  
  public MDS (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }
  public int getPropSerializationType(String arg0) {
	// TODO Implement or if for Device subclasses: remove 
	return 0;
  }

  public boolean isWellFormed() {
	return true 
      && hasProperty(PROP_SYSTEM_ID);
  }

  public String getSystemId() {
    return (String)getProperty(PROP_SYSTEM_ID);
  }		

  public void setSystemId(String newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_SYSTEM_ID, newPropValue);
  }		
}
