package org.universAAL.ontology.aalfficiency.scores;

import org.universAAL.middleware.owl.ManagedIndividual;

public class ActivityScore extends ManagedIndividual{
	public static final String MY_URI = AalfficiencyScoresOntology.NAMESPACE+"ActivityScoreURI";
	public static final String PROP_HAS_TODAY_SCORE = AalfficiencyScoresOntology.NAMESPACE+"ActivityTodayScore";
	public static final String PROP_HAS_TOTAL_SCORE= AalfficiencyScoresOntology.NAMESPACE+"ActivityTotalScore"; 
	public static final String PROP_HAS_STEPS = AalfficiencyScoresOntology.NAMESPACE+"ActivitySteps";
	public static final String PROP_HAS_KCAL = AalfficiencyScoresOntology.NAMESPACE+"ActivityKcal";
	public static final String PROP_HAS_SENT_BY_PUBLISHER = AalfficiencyScoresOntology.NAMESPACE+"ActivitySentByPublisher";
	public static final String PROP_HAS_CHALLENGE= AalfficiencyScoresOntology.NAMESPACE+"ActivityChallenge";
	
	public ActivityScore() {
		  super();
	  }

	public ActivityScore(String uri) {
		super(uri);
	}

	@Override
	public int getPropSerializationType(String propURI) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setActivityTodayScore(Integer score){
		props.put(PROP_HAS_TODAY_SCORE, score);
	}
	public void setActivityTotalScore(Integer score){
		props.put(PROP_HAS_TOTAL_SCORE, score);
	}
	public void setActivitySteps(Integer steps){
		props.put(PROP_HAS_STEPS,steps);
	}
	public void setActivityKcal(Integer kcal){
		props.put(PROP_HAS_KCAL,kcal);
	}
	public void setActivitySentByPublisher(String sent){
		props.put(PROP_HAS_SENT_BY_PUBLISHER, sent);
	}
	public void setActivityChallenge(Challenge c){
		props.put(PROP_HAS_CHALLENGE, c);
	}
	
	public Integer getActivityTodayScore(){
		return (Integer)props.get(PROP_HAS_TODAY_SCORE);
	}
	public Integer getActivityTotalScore(){
		return (Integer)props.get(PROP_HAS_TOTAL_SCORE);
	}
	public Integer getActivitySteps(){
		return (Integer)props.get(PROP_HAS_STEPS);
	}
	public Integer getActivityKcal(){
		return (Integer)props.get(PROP_HAS_KCAL);
	}
	public String getSentByPublisher(){
		return (String)props.get(PROP_HAS_SENT_BY_PUBLISHER);
	}
	public Challenge getActivityChallenge(){
		return (Challenge)props.get(PROP_HAS_CHALLENGE);
	}
}
