package org.universAAL.ontology.aalfficiency;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.AalfficiencyOntology;

public class AalfficiencyScore extends ManagedIndividual {
	  // Make sure you use the same namespace in all your domain ontology
	  // You can declare the namespace in your root concept and later reuse it in
	  // the rest of classes
	  // MY URI is the URI of this concept. It is mandatory for all.
	  public static final String MY_URI;
	  // Now declare ALL properties that this concept defines
	  public static final String PROP_HAS_TOTALSCORE;
	  public static final String PROP_HAS_TODAYSCORE;	  
	  public static final String PROP_HAS_TOTALELECTRICITYSCORE;
	  public static final String PROP_HAS_TODAYELECTRICITYSCORE;
	  public static final String PROP_HAS_TOTALACTIVITYSCORE;
	  public static final String PROP_HAS_TODAYACTIVITYSCORE;

	  // In this static block you set the URIs of your concept and its properties
	  static {
		// Namespaces must follow this format
		// The URI of your concept, which is the same name than the class
		MY_URI = AalfficiencyOntology.NAMESPACE + "AalfficiencyScore";
		// Now declare the URIs of the properties. They must start with lower
		// case.
		PROP_HAS_TOTALSCORE = AalfficiencyOntology.NAMESPACE +"totalScore";
		PROP_HAS_TODAYSCORE = AalfficiencyOntology.NAMESPACE+"todayScore";
		PROP_HAS_TOTALELECTRICITYSCORE = AalfficiencyOntology.NAMESPACE+"totalElectricityScore";
		PROP_HAS_TODAYELECTRICITYSCORE = AalfficiencyOntology.NAMESPACE+"todayElectriticyScore";
		PROP_HAS_TOTALACTIVITYSCORE = AalfficiencyOntology.NAMESPACE+"totalActivityScore";
		PROP_HAS_TODAYACTIVITYSCORE = AalfficiencyOntology.NAMESPACE+"todayActivityScore";
	  }

	  public AalfficiencyScore() {
		  super();
	  }

	  public AalfficiencyScore(String uri) {
		super(uri);
	  }
	  
	  public AalfficiencyScore(String uri, String type, String text) {
			super(uri);
			
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
	  
	  public Integer getTotalScore(){
		  return (Integer) props.get(PROP_HAS_TOTALSCORE);
	  }
	  
	  public void setTotalScore(Integer score){
		  props.put(PROP_HAS_TOTALSCORE, score);
	  }

	  public Integer getTodayScore(){
		  return (Integer) props.get(PROP_HAS_TODAYSCORE);
	  }
	  
	  public void setTodayScore(Integer score){
		  props.put(PROP_HAS_TODAYSCORE, score);
	  }

	  public Integer getTotalElectricityScore(){
		  return (Integer) props.get(PROP_HAS_TOTALELECTRICITYSCORE);
	  }
	  
	  public void setTotalElectricityScore(Integer score){
		  props.put(PROP_HAS_TOTALELECTRICITYSCORE, score);
	  }

	  public Integer getTodayElectricityScore(){
		  return (Integer) props.get(PROP_HAS_TODAYELECTRICITYSCORE);
	  }
	  
	  public void setTodayElectricityScore(Integer score){
		  props.put(PROP_HAS_TODAYELECTRICITYSCORE, score);
	  }

	  public Integer getTotalActivityScore(){
		  return (Integer) props.get(PROP_HAS_TOTALACTIVITYSCORE);
	  }
	  
	  public void setTotalActivityScore(Integer score){
		  props.put(PROP_HAS_TOTALACTIVITYSCORE, score);
	  }

	  public Integer getTodayActivityScore(){
		  return (Integer) props.get(PROP_HAS_TODAYACTIVITYSCORE);
	  }
	  
	  public void setTodayActivityScore(Integer score){
		  props.put(PROP_HAS_TODAYACTIVITYSCORE, score);
	  }
	  	  
}