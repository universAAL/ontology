/*
	Copyright 2008-2014 TSB, http://www.tsbtecnologias.es
	TSB - Tecnologías para la Salud y el Bienestar
	
	See the NOTICE file distributed with this work for additional 
	information regarding copyright ownership
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */
package org.universAAL.ontology.drools;

import java.util.List;
import java.util.ArrayList;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.DroolsReasoningOntology;
import org.universAAL.ontology.drools.ConsequenceProperty;


//If you are making a concept that does not inherit from any other you just extend ManagedIndividual
//Otherwise you extend the concept class you inherit from
public class Consequence extends ManagedIndividual {

	public static final String MY_URI = DroolsReasoningOntology.NAMESPACE + "Consequence";

	public static final String PROP_HAS_IDENTIFIER = DroolsReasoningOntology.NAMESPACE + "hasIdentifier";
	public static final String PROP_HAS_PROPERTIES = DroolsReasoningOntology.NAMESPACE + "hasProperties";

	public Consequence() {
		// TODO Auto-generated constructor stub
	}

	public Consequence(String uri) {
		super(uri);
	}

	public int getPropSerializationType(String propURI) {
		// TODO Discriminate how important is the serialisation of every
		// property.
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		// TODO Consequence isWellFormed
		return super.isWellFormed();
	}

	public String getIdentifier() {
		return (String) props.get(PROP_HAS_IDENTIFIER);
	}

	public void setIdentifier(String id) {
		props.put(PROP_HAS_IDENTIFIER, id);
	}

	public ConsequenceProperty[] getProperties() {
		Object propList = props.get(PROP_HAS_PROPERTIES);
		if (propList instanceof List) {
			return (ConsequenceProperty[]) ((List) propList)
					.toArray(new ConsequenceProperty[0]);
		} else {
			List returnList = new ArrayList();
			if (propList != null){
				returnList.add((ConsequenceProperty) propList);
			}
			return (ConsequenceProperty[]) returnList
					.toArray(new ConsequenceProperty[0]);

		}
	}
	
	public void addProperty(String uri, String key, String value){
		Object propList = props.get(PROP_HAS_PROPERTIES);
		if (propList instanceof List){
			List auxList = (List)propList;
			auxList.add(new ConsequenceProperty(uri, key, value));
			props.put(PROP_HAS_PROPERTIES, auxList);
		}else if (propList == null){
			props.put(PROP_HAS_PROPERTIES, new ConsequenceProperty(uri, key, value));
		}else{		
			List auxList = new ArrayList();
			auxList.add((ConsequenceProperty)propList);
			auxList.add(new ConsequenceProperty(uri, key, value));
			props.put(PROP_HAS_PROPERTIES, auxList);		
		}
	}
	
	  public String getClassURI(){
			return MY_URI;  
		  }
}

// Version 0.3.0-SNAPSHOT
/*
 * // In this method you must return the restrictions on the property you are //
 * asked for public static MergedRestriction
 * getClassRestrictionsOnProperty(String propURI) { // For each property you
 * have declared, return the appropriate // restrictions if
 * (PROP_HAS_IDENTIFIER.equals(propURI)) // This restriction means that in this
 * property there must be a // Device concept, with cardinality 1:1 (a mandatory
 * single Device) //ID: String Cardinality 1:1 return
 * MergedRestriction.getAllValuesRestrictionWithCardinality(propURI,
 * TypeMapper.getDatatypeURI(String.class), 1, 1);
 * 
 * if (PROP_HAS_PROPERTIES.equals(propURI)) // This restriction means that in
 * this property there can be none, // one or many Sensor concepts return
 * MergedRestriction.getAllValuesRestriction(propURI,
 * ConsequenceProperty.MY_URI);
 * 
 * 
 * // There are other methods to declare restrictions, and even construct //
 * more complex ones, but these are the most commonly used. // You can also
 * return restrictions on properties you inherit from // parent concepts. //
 * Finally, you must return the default restrictions of your parent // concept,
 * with this return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
 * // In this case we have no parent concept so we use ManagedIndividual. // If
 * you inherited from other concept, then use it instead. }
 * 
 * // This method is used by the system to handle the ontologies. It returns //
 * the URIs of all properties used in this concept. public static String[]
 * getStandardPropertyURIs() { // First get property URIs of your parent concept
 * (in this case we have // none, so we use ManagedIndividual) String[]
 * inherited = ManagedIndividual.getStandardPropertyURIs(); String[] toReturn =
 * new String[inherited.length + 2];// Make sure you // increase the size by the
 * number of properties declared in your // concept! int i = 0; // With this we
 * copy the properties of the parent... while (i < inherited.length) {
 * toReturn[i] = inherited[i]; i++; } // ...and with this we add the properties
 * declared in this concept toReturn[i++] = PROP_HAS_IDENTIFIER; toReturn[i] =
 * PROP_HAS_PROPERTIES;
 * 
 * 
 * // Now we have all the property URIs of the concept, both inherited and //
 * declared by it. return toReturn; }
 * 
 * public Consequence() { // Basic constructor. In general it is empty. }
 * 
 * public Consequence(String uri) { super(uri); // This is the commonly used
 * constructor. In general it is like this, // just a call to super. }
 * 
 * public static String getRDFSComment() { return "RDFs of comments of Rule:"; }
 * 
 * public static String getRDFSLabel() { return
 * "Rule ontology properties ID, ConsequenceProperty and Body'"; }
 * 
 * // This method is used for serialization purposes, to restrict the amount of
 * // information to serialize when forwarding it among nodes. // For each
 * property you must return one of PROP_SERIALIZATION_FULL, // REDUCED, OPTIONAL
 * or UNDEFINED. // Refer to their javadoc to see what they mean. public int
 * getPropSerializationType(String propURI) { // In this case we serialize
 * everything. It is up to you to define what // is important to be serialized
 * and what is expendable in your concept. return PROP_SERIALIZATION_FULL; }
 * 
 * // In this method you evaluate if an instance of your concept is properly //
 * built, e.g. if all mandatory fields are present. public boolean
 * isWellFormed() { // In this case we say it is well formed if the property X,
 * that we // declared as mandatory, is present. // While you test your concept
 * it is easier to return always true. return true; }
 * 
 * // From here onwards we declare the getter and setters and other helper //
 * methods for our declared properties // These are NOT MANDATORY, but are
 * helpful for those who will use the // ontology. public String getID() {
 * return (String) props.get(PROP_HAS_IDENTIFIER); }
 * 
 * public void setID(String str) { props.put(PROP_HAS_IDENTIFIER, str); }
 * 
 * public ConsequenceProperty[] getConsequenceProperty() { Object propList =
 * props.get(PROP_HAS_PROPERTIES); if (propList instanceof List) { return
 * (ConsequenceProperty[]) ((List) propList).toArray(new
 * ConsequenceProperty[0]); } else { List returnList = new ArrayList(); if
 * (propList != null) returnList.add((ConsequenceProperty) propList); return
 * (ConsequenceProperty[]) returnList.toArray(new ConsequenceProperty[0]); } }
 * 
 * public void setConsequenceProperty(ConsequenceProperty[] consequenceProperty)
 * { List propList = new ArrayList(consequenceProperty.length); for (int i = 0;
 * i < consequenceProperty.length; i++) { propList.add(consequenceProperty[i]);
 * } props.put(PROP_HAS_PROPERTIES, consequenceProperty); }
 * 
 * // Getters and setters are the most common, but you can add as many other //
 * helper methods as you want, such as remove. Take into account that all //
 * properties can always be handled with the methods of ManagedIndividual // and
 * Resource, which all concepts inherit. The helper methods just make //
 * developers life easier.
 * 
 * 
 * // In the case of properties with multiple values, take into account that //
 * they are handled internally (in the "props" element of the object) as a //
 * List if there is more than one value. // In the helper method itself you can
 * return or accept whatever format you // want (List or array) although it is
 * recommended (it seems) to return and // accept arrays. // Although using List
 * would be easier...
 * 
 * }
 */
