package org.universAAL.ontology.x73;

import org.universAAL.ontology.X73Ontology;


public class BodyWeight extends MDSAttribute {
  public static final String MY_URI = X73Ontology.NAMESPACE
    + "BodyWeight";


  public BodyWeight () {
    super();
  }
  
  public BodyWeight (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }

  public boolean isWellFormed() {
	return true ;
  }
}
