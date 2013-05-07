package org.universAAL.ontology.language;

import org.universAAL.middleware.owl.ManagedIndividual;


public class Language extends ManagedIndividual {
  public static final String MY_URI = LanguageOntology.NAMESPACE
    + "Language";
  public static final String PROP_ENGLISH_LABEL = LanguageOntology.NAMESPACE
    + "englishLabel";
  public static final String PROP_ISO639CODE = LanguageOntology.NAMESPACE
    + "iso639code";
  public static final String PROP_NATIVE_LABEL = LanguageOntology.NAMESPACE
    + "nativeLabel";


  public Language () {
    super();
  }
  
  public Language (String uri) {
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
      && hasProperty(PROP_ENGLISH_LABEL)
      && hasProperty(PROP_ISO639CODE)
      && hasProperty(PROP_NATIVE_LABEL);
  }

  public String getEnglishLabel() {
    return (String)getProperty(PROP_ENGLISH_LABEL);
  }		

  public void setEnglishLabel(String newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_ENGLISH_LABEL, newPropValue);
  }		

  public String getNativeLabel() {
    return (String)getProperty(PROP_NATIVE_LABEL);
  }		

  public void setNativeLabel(String newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_NATIVE_LABEL, newPropValue);
  }		

  public String getIso639code() {
    return (String)getProperty(PROP_ISO639CODE);
  }		

  public void setIso639code(String newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_ISO639CODE, newPropValue);
  }		
}
