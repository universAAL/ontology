package org.universAAL.ontology.aalfficiency;

import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.AalfficiencyOntology;

public class Aalfficiency extends Service{
	
	public static final String MY_URI = AalfficiencyOntology.NAMESPACE + "Aalfficiency";

	public static final String PROP_HAS_SCORE = AalfficiencyOntology.NAMESPACE+"hasScore";
	public static final String PROP_HAS_CHALLENGES = AalfficiencyOntology.NAMESPACE+"hasChallenges";
	public static final String PROP_HAS_ADVICES = AalfficiencyOntology.NAMESPACE+"hasAdvices";
	
	public Aalfficiency(String instanceURI) {
		super(instanceURI);
	}


	public Aalfficiency() {
		super();
	}

	  public String getClassURI(){
			return MY_URI;  
		  }

}
