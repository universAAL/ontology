package org.universAAL.ontology.aalfficiency.scores;

import org.universAAL.middleware.owl.ManagedIndividual;

public class ElectricityScore extends ManagedIndividual{
	
	public static final String MY_URI = AalfficiencyScoresOntology.NAMESPACE+"ElectricityScoreURI";
	public static final String PROP_HAS_TODAY_SCORE = AalfficiencyScoresOntology.NAMESPACE+"ElectricityTodayScore";
	public static final String PROP_HAS_TOTAL_SCORE= AalfficiencyScoresOntology.NAMESPACE+"ElectricityTotalScore"; 
	public static final String PROP_HAS_SAVING = AalfficiencyScoresOntology.NAMESPACE+"ElectricitySaving";
	public static final String PROP_HAS_SENT_BY_PUBLISHER = AalfficiencyScoresOntology.NAMESPACE+"ElectricitySentByPublisher";
	public static final String PROP_HAS_CHALLENGE= AalfficiencyScoresOntology.NAMESPACE+"ElectricityChallenge";
	
	public ElectricityScore() {
		  super();
	  }

	public ElectricityScore(String uri) {
		super(uri);
	}

	@Override
	public int getPropSerializationType(String propURI) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setElectricityTodayScore(Integer score){
		props.put(PROP_HAS_TODAY_SCORE, score);
	}
	public void setElectricityTotalScore(Integer score){
		props.put(PROP_HAS_TOTAL_SCORE, score);
	}
	public void setElectricitySaving(Integer saving){
		props.put(PROP_HAS_SAVING, saving);
	}
	public void setElectricitySentByPublisher(String sent){
		props.put(PROP_HAS_SENT_BY_PUBLISHER, sent);
	}
	public void setElectricityChallenge(Challenge c){
		props.put(PROP_HAS_CHALLENGE, c);
	}
	
	public Integer getElectricityTodayScore(){
		return (Integer)props.get(PROP_HAS_TODAY_SCORE);
	}
	public Integer getElectricityTotalScore(){
		return (Integer)props.get(PROP_HAS_TOTAL_SCORE);
	}
	public Integer getElectricitySaving(){
		return (Integer)props.get(PROP_HAS_SAVING);
	}
	public String getSentByPublisher(){
		return (String)props.get(PROP_HAS_SENT_BY_PUBLISHER);
	}
	public Challenge getElectricityChallenge(){
		return (Challenge)props.get(PROP_HAS_CHALLENGE);
	}
	
}
