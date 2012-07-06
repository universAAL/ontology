package org.universAAL.ontology.aalfficiency;


import java.util.List;
import java.util.ArrayList;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.AalfficiencyOntology;

public class AalfficiencyChallenges extends ManagedIndividual {

	  public static final String MY_URI;
	  // Now declare ALL properties that this concept defines
	  public static final String PROP_HAS_CHALLENGES;
	  
	  // In this static block you set the URIs of your concept and its properties
	  static {
		// Namespaces must follow this format
		// The URI of your concept, which is the same name than the class
		MY_URI = AalfficiencyOntology.NAMESPACE + "AalfficiencyChallenges";
		// Now declare the URIs of the properties. They must start with lower
		// case.
		PROP_HAS_CHALLENGES = AalfficiencyOntology.NAMESPACE +"challenges";
	  }

	  public AalfficiencyChallenges() {
		  super();
	  }

	  public AalfficiencyChallenges(String uri) {
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
	  
	  public Challenge[] getProperties() {
			Object propList = props.get(PROP_HAS_CHALLENGES);
			if (propList instanceof List) {
				return (Challenge[]) ((List) propList)
						.toArray(new Challenge[0]);
			} else {
				List returnList = new ArrayList();
				if (propList != null){
					returnList.add((Challenge) propList);
				}
				return (Challenge[]) returnList
						.toArray(new Challenge[0]);

			}
		}
		
		public void addProperty(String uri, String type, String goal, String description){
			Object propList = props.get(PROP_HAS_CHALLENGES);
			if (propList instanceof List){
				List auxList = (List)propList;
				auxList.add(new Challenge(uri, type,goal,description));
				props.put(PROP_HAS_CHALLENGES, auxList);
			}else if (propList == null){
				props.put(PROP_HAS_CHALLENGES, new Challenge(uri,type,goal,description));
			}else{		
				List auxList = new ArrayList();
				auxList.add((Challenge)propList);
				auxList.add(new Challenge(uri,type,goal,description));
				props.put(PROP_HAS_CHALLENGES, auxList);		
			}
		}

}
