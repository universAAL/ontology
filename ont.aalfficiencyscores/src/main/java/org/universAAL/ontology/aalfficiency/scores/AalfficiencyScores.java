package org.universAAL.ontology.aalfficiency.scores;

import org.universAAL.middleware.service.owl.Service;


public class AalfficiencyScores extends Service{
	
	public static final String MY_URI = AalfficiencyScoresOntology.NAMESPACE + "AalfficiencyScores";

	public static final String PROP_HAS_ELECTRICITY_SCORE = AalfficiencyScoresOntology.NAMESPACE+"hasElectricityScore";
	public static final String PROP_HAS_ACTIVITY_SCORE = AalfficiencyScoresOntology.NAMESPACE+"hasActivityScore";
	public static final String PROP_HAS_ADVICES = AalfficiencyScoresOntology.NAMESPACE+"hasAdvices";
	
	public AalfficiencyScores(String instanceURI) {
		super(instanceURI);
	}

	public AalfficiencyScores() {
		super();
	}

	public String getClassURI(){
		return MY_URI;  
	}
	
	public void setElectricityScore(ElectricityScore ed){
		props.put(PROP_HAS_ELECTRICITY_SCORE, ed);
	}

	public void setActivityScore(ActivityScore ed){
		props.put(PROP_HAS_ACTIVITY_SCORE, ed);
	}
	
	public void setAdvices(AalfficiencyAdvices ads){
		props.put(PROP_HAS_ADVICES, ads);
	}
	
	public ElectricityScore getElectricityScore(){
		return (ElectricityScore)props.get(PROP_HAS_ELECTRICITY_SCORE);
	}
	public ActivityScore getActivityScore(){
		return (ActivityScore)props.get(PROP_HAS_ACTIVITY_SCORE);
	}
	public AalfficiencyAdvices getAdvices(){
		return (AalfficiencyAdvices)props.get(PROP_HAS_ADVICES);
	}


	public int getPropSerializationType(String propURI) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}