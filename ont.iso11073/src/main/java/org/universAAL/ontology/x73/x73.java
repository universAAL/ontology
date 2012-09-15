package org.universAAL.ontology.x73;

import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.X73Ontology;


public class x73 extends Service {
  public static final String MY_URI = X73Ontology.NAMESPACE
    + "x73";
  public static final String PROP_M_D_S = X73Ontology.NAMESPACE
    + "mDS";


  public x73 () {
    super();
  }
  
  public x73 (String uri) {
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
      && hasProperty(PROP_M_D_S);
  }

  public MDS getMDS() {
    return (MDS)getProperty(PROP_M_D_S);
  }		

  public void setMDS(MDS newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_M_D_S, newPropValue);
  }		
}
