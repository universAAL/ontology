package org.universAAL.ontology.aalfficiency;

import org.universAAL.middleware.service.owl.Service;

public class Aalfficiency extends Service{
	
	public static final String MY_URI = AalfficiencyOntology.NAMESPACE + "Aalfficiency";

	public static final String PROP_HAS_ELECTRICITY_DATA = AalfficiencyOntology.NAMESPACE+"hasElectricity";
	public static final String PROP_HAS_ACTIVITY_DATA = AalfficiencyOntology.NAMESPACE+"hasActivity";
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
