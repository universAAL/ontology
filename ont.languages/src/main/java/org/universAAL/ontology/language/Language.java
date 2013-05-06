package org.universAAL.ontology.language;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

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

  public EnglishLabelType getEnglishLabel() {
    return (EnglishLabelType)getProperty(PROP_ENGLISH_LABEL);
  }		

  public void setEnglishLabel(EnglishLabelType newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_ENGLISH_LABEL, newPropValue);
  }		

  public NativeLabelType getNativeLabel() {
    return (NativeLabelType)getProperty(PROP_NATIVE_LABEL);
  }		

  public void setNativeLabel(NativeLabelType newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_NATIVE_LABEL, newPropValue);
  }		

  public ISO639CodeType getIso639code() {
    return (ISO639CodeType)getProperty(PROP_ISO639CODE);
  }		

  public void setIso639code(ISO639CodeType newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_ISO639CODE, newPropValue);
  }		
}
