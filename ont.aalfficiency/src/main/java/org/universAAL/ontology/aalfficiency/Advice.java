package org.universAAL.ontology.aalfficiency;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.AalfficiencyOntology;

public class Advice extends ManagedIndividual {
	  // Make sure you use the same namespace in all your domain ontology
	  // You can declare the namespace in your root concept and later reuse it in
	  // the rest of classes
	  // MY URI is the URI of this concept. It is mandatory for all.
	  public static final String MY_URI;
	  // Now declare ALL properties that this concept defines
	  public static final String PROP_HAS_TYPE;
	  public static final String PROP_HAS_TEXT;
	  
	  // In this static block you set the URIs of your concept and its properties
	  static {
		// Namespaces must follow this format
		// The URI of your concept, which is the same name than the class
		MY_URI = AalfficiencyOntology.NAMESPACE + "Advice";
		// Now declare the URIs of the properties. They must start with lower
		// case.
		PROP_HAS_TYPE = AalfficiencyOntology.NAMESPACE +"adviceType";
		PROP_HAS_TEXT = AalfficiencyOntology.NAMESPACE+"adviceText";
	  }

	  public Advice() {
		  super();
	  }

	  public Advice(String uri) {
		super(uri);
	  }
	  
	  public Advice(String uri, String type, String text) {
			super(uri);
			 props.put(PROP_HAS_TYPE, type);
			 props.put(PROP_HAS_TEXT, text);
	  }
  
	  
	  public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	  }

	  public boolean isWellFormed() {
	//TODO
		return true;
	  }
	  
	  public String getClassURI(){
			return MY_URI;  
	  }
	  
	  public String getAdviceType(){
		  return (String) props.get(PROP_HAS_TYPE);
	  }
	  public void setAdviceType(String type){
		  props.put(PROP_HAS_TYPE, type);
		  
	  }
	  public String getAdviceText(){
		  return (String) props.get(PROP_HAS_TEXT);
	  }
	  public void setAdviceText(String text){
		  props.put(PROP_HAS_TEXT, text);
		  
	  }
	  
}
