package org.universAAL.ontology.aalfficiency.scores;

import org.universAAL.middleware.owl.ManagedIndividual;

public class Challenge extends ManagedIndividual{

	public static final String MY_URI = AalfficiencyScoresOntology.NAMESPACE+"ChallengeURI";
	public static final String PROP_HAS_NAME = AalfficiencyScoresOntology.NAMESPACE+"ChallengeName";
	public static final String PROP_HAS_GOAL = AalfficiencyScoresOntology.NAMESPACE+"ChallengeGoal"; 
	public static final String PROP_HAS_DESCRIPTION = AalfficiencyScoresOntology.NAMESPACE+"ChallengeDescription";
	
	public Challenge() {
		  super();
	  }

	public Challenge(String uri) {
		super(uri);
	}
	
	public Challenge(String uri, String name, String description, String goal) {
		super(uri);
		 props.put(PROP_HAS_NAME, name);
		 props.put(PROP_HAS_DESCRIPTION, description);
		 props.put(PROP_HAS_GOAL, goal);
	}
	
	public int getPropSerializationType(String propURI) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void setChallengeName(String name){
		 props.put(PROP_HAS_NAME, name);
	}
	public void setChallengeDescription(String description){
		props.put(PROP_HAS_DESCRIPTION, description);
	}
	public void setChallengeGoal(String goal){
		props.put(PROP_HAS_GOAL, goal);
	}
	
	public String getChallengeName(){
		return (String)props.get(PROP_HAS_NAME);
	}
	public String getChallengeDescription(){
		return (String)props.get(PROP_HAS_DESCRIPTION);
	}	
	public String getChallengeGoal(){
		return (String)props.get(PROP_HAS_GOAL);
	}
}
