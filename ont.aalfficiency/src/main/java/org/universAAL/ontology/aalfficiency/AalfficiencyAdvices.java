package org.universAAL.ontology.aalfficiency;

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.AalfficiencyOntology;

public class AalfficiencyAdvices extends ManagedIndividual {

	  public static final String MY_URI;
	  // Now declare ALL properties that this concept defines
	  public static final String PROP_HAS_ADVICES;
	  
	  // In this static block you set the URIs of your concept and its properties
	  static {
		// Namespaces must follow this format
		// The URI of your concept, which is the same name than the class
		MY_URI = AalfficiencyOntology.NAMESPACE + "AalfficiencyAdvices";
		// Now declare the URIs of the properties. They must start with lower
		// case.
		PROP_HAS_ADVICES = AalfficiencyOntology.NAMESPACE +"advices";
	  }

	  public AalfficiencyAdvices() {
		  super();
	  }

	  public AalfficiencyAdvices(String uri) {
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
}
