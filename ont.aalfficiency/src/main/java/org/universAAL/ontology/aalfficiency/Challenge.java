package org.universAAL.ontology.aalfficiency;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.AalfficiencyOntology;

public class Challenge extends ManagedIndividual {
	  // Make sure you use the same namespace in all your domain ontology
	  // You can declare the namespace in your root concept and later reuse it in
	  // the rest of classes
	  // MY URI is the URI of this concept. It is mandatory for all.
	  public static final String MY_URI;
	  // Now declare ALL properties that this concept defines
	  public static final String PROP_HAS_TYPE;
	  public static final String PROP_HAS_GOAL;
	  public static final String PROP_HAS_DESCRIPTION;
	  
	  // In this static block you set the URIs of your concept and its properties
	  static {
		// Namespaces must follow this format
		// The URI of your concept, which is the same name than the class
		MY_URI = AalfficiencyOntology.NAMESPACE + "Challenge";
		// Now declare the URIs of the properties. They must start with lower
		// case.
		PROP_HAS_TYPE = AalfficiencyOntology.NAMESPACE +"challengeType";
		PROP_HAS_GOAL = AalfficiencyOntology.NAMESPACE+"challengeGoal";
		PROP_HAS_DESCRIPTION = AalfficiencyOntology.NAMESPACE+"challengeDescription";
	  }

	  public Challenge() {
		  super();
	  }

	  public Challenge(String uri) {
		super(uri);
	  }
	  
	  public Challenge(String uri, String type, String goal, String desctiption) {
		super(uri);
		props.put(PROP_HAS_TYPE, type);
		props.put(PROP_HAS_GOAL, goal);
		props.put(PROP_HAS_DESCRIPTION, desctiption);
		
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
	  
	  public String getChallengeType(){
		  return (String) props.get(PROP_HAS_TYPE);
	  }
	  public void setChallengeType(String type){
		  props.put(PROP_HAS_TYPE, type);
		  
	  }
	  public String getChallengeGoal(){
		  return (String) props.get(PROP_HAS_GOAL);
	  }
	  public void setChallengeGoal(String text){
		  props.put(PROP_HAS_GOAL, text);
	  }
	  public String getChallengeDescription(){
		  return (String) props.get(PROP_HAS_DESCRIPTION);
	  }
	  public void setChallengeDescription(String text){
		  props.put(PROP_HAS_DESCRIPTION, text);
	  }
	  
}