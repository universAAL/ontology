package org.universAAL.ontology.aalfficiency.scores;

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;

public class AalfficiencyAdvices extends ManagedIndividual{

	public static final String MY_URI = AalfficiencyScoresOntology.NAMESPACE+"AalfficiencyAdvicesURI";
	public static final String PROP_HAS_ADVICES = AalfficiencyScoresOntology.NAMESPACE+"Advices";
	
	@Override
	public int getPropSerializationType(String propURI) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public AalfficiencyAdvices() {
		  super();
	  }

	public AalfficiencyAdvices(String uri) {
		super(uri);
	}
	
	public void addProperty(String uri, String type, String text){
		Object propList = props.get(PROP_HAS_ADVICES);
		if (propList instanceof List){
			List auxList = (List)propList;
			auxList.add(new Advice(uri, type,text));
			props.put(PROP_HAS_ADVICES, auxList);
		}else if (propList == null){
			props.put(PROP_HAS_ADVICES, new Advice(uri,type,text));
		}else{		
			List auxList = new ArrayList();
			auxList.add((Advice)propList);
			auxList.add(new Advice(uri,type,text));
			props.put(PROP_HAS_ADVICES, auxList);		
		}
	} 
	
	public void addAdvices(Advice[] advices){
		for (Advice a : advices){
			addProperty(a.getClassURI(), a.getAdviceType(), a.getAdviceText());
		}
	}
	
	
	public Advice[] getProperties() {
		Object propList = props.get(PROP_HAS_ADVICES);
		if (propList instanceof List) {
			return (Advice[]) ((List) propList)
					.toArray(new Advice[0]);
		} else {
			List returnList = new ArrayList();
			if (propList != null){
				returnList.add((Advice) propList);
			}
			return (Advice[]) returnList
					.toArray(new Advice[0]);

		}
	}
	
	public Advice[] getAdvices(){
		return getProperties();
	}

}
