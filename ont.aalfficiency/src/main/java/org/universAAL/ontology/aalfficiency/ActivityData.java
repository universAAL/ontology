package org.universAAL.ontology.aalfficiency;

import org.universAAL.middleware.owl.ManagedIndividual;

public class ActivityData extends ManagedIndividual{

	  public static final String MY_URI;
	  // Now declare ALL properties that this concept defines
	  public static final String PROP_HAS_TODAY_SCORE;
	  public static final String PROP_HAS_TOTAL_SCORE;
	  public static final String PROP_HAS_STEPS;
	  public static final String PROP_HAS_KCAL;
	  public static final String PROP_HAS_CHALLENGE;
	  public static final String PROP_SENT_BY_PUBLISHER;
	  
	  // In this static block you set the URIs of your concept and its properties
	  static {
		// Namespaces must follow this format
		// The URI of your concept, which is the same name than the class
		MY_URI = AalfficiencyOntology.NAMESPACE + "Activity";
		// Now declare the URIs of the properties. They must start with lower
		// case.
		PROP_HAS_TODAY_SCORE = AalfficiencyOntology.NAMESPACE +"ActivityTodayScore";
		PROP_HAS_TOTAL_SCORE = AalfficiencyOntology.NAMESPACE+"ActivityTotalScore";
		PROP_HAS_STEPS = AalfficiencyOntology.NAMESPACE+"ActivitySteps";
		PROP_HAS_KCAL = AalfficiencyOntology.NAMESPACE+"ActivityKcal";
		PROP_HAS_CHALLENGE = AalfficiencyOntology.NAMESPACE+"ActivityChallenge";
		PROP_SENT_BY_PUBLISHER = AalfficiencyOntology.NAMESPACE+"SentByPublisher";
	  }

	public int getPropSerializationType(String propURI) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ActivityData(String uri){
		super(uri);
	}
	
	public void setTodayScore(Integer score){
		 props.put(PROP_HAS_TODAY_SCORE, score);
	}
	public void setTotalScore(Integer score){
		 props.put(PROP_HAS_TOTAL_SCORE, score);
	}
	public void setSteps(Integer steps){
		 props.put(PROP_HAS_STEPS, steps);
	}
	public void setKcal(Integer kcal){
		 props.put(PROP_HAS_KCAL, kcal);
	}
	public void setChallenge(String uri, String type, String goal, String description){
		props.put(PROP_HAS_CHALLENGE, new Challenge(uri,type,goal,description));
	}
	public void setChallenge(Challenge challenge){
		props.put(PROP_HAS_CHALLENGE, challenge);
	}
	public void setSentByPublisher(String sent){
		props.put(PROP_SENT_BY_PUBLISHER, sent);
	}
	
	
	public Integer getTodayScore(){
		 return (Integer) props.get(PROP_HAS_TODAY_SCORE);
	}
	public Integer getTotalScore(Integer score){
		return (Integer) props.get(PROP_HAS_TOTAL_SCORE);
	}
	public Integer getSteps(Integer steps){
		return (Integer) props.get(PROP_HAS_STEPS);
	}
	public Integer getKcal(Integer kcal){
		return (Integer) props.get(PROP_HAS_KCAL);
	}
	public Challenge getChallenge(){
		return (Challenge) props.get(PROP_HAS_CHALLENGE);
	}
	public String setSentByPublisher(){
		return (String) props.get(PROP_SENT_BY_PUBLISHER);
	}
	
	
}
