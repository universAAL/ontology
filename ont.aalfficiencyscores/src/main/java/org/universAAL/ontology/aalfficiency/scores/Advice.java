package org.universAAL.ontology.aalfficiency.scores;

import org.universAAL.middleware.owl.ManagedIndividual;

public class Advice extends ManagedIndividual{

	public static final String MY_URI = AalfficiencyScoresOntology.NAMESPACE+"AdviceURI";
	public static final String PROP_HAS_TYPE = AalfficiencyScoresOntology.NAMESPACE+"AdviceType";
	public static final String PROP_HAS_TEXT = AalfficiencyScoresOntology.NAMESPACE+"AdviceText"; 
	
	public int getPropSerializationType(String propURI) {
		// TODO Auto-generated method stub
		return 0;
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
	
	public void setAdviceType(String type){
		props.put(PROP_HAS_TYPE, type);
	}
	public void setAdviceText(String text){
		props.put(PROP_HAS_TEXT, text);
	}
	public String getAdviceType(){
		return (String)props.get(PROP_HAS_TYPE);
	}
	public String getAdviceText(){
		return (String)props.get(PROP_HAS_TEXT);
	}
}
