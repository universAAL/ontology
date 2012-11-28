/*	
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut für Graphische Datenverarbeitung 
	
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
package org.universAAL.reasoner.ont;

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.service.owl.Service;

@SuppressWarnings("unchecked")
public class ReasoningService extends Service {
    public static final String MY_URI = ReasoningOntology.NAMESPACE + "ReasoningService";
    public static final String PROP_SITUATIONS = ReasoningOntology.NAMESPACE
	    + "situation";
    public static final String PROP_QUERIES = ReasoningOntology.NAMESPACE + "query";
    public static final String PROP_RULES = ReasoningOntology.NAMESPACE + "rules";

    public ReasoningService() {
	super();
    }

    public ReasoningService(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_SITUATIONS) && hasProperty(PROP_QUERIES)
		&& hasProperty(PROP_RULES);
    }

    public Query[] getQuery() {
	Object propList = getProperty(PROP_QUERIES);
	if (propList instanceof List)
	    return (Query[]) ((List) propList).toArray(new Query[0]);
	else if (propList != null)
	    return new Query[] { (Query) propList }; // Handle special case of a
	// single item not
	// contained in a list
	return new Query[0];
    }

    public void addQuery(Query newValue) {
	Object propList = getProperty(PROP_QUERIES);
	List newList;
	if (propList instanceof List)
	    newList = (List) propList;
	else {
	    newList = new ArrayList();
	    if (propList != null)
		newList.add(propList); // Handle special case of a single
	    // previous item not contained in a list
	}
	newList.add(newValue);
	changeProperty(PROP_QUERIES, newList);
    }

    public void setQuery(Query[] propertyValue) {
	List propList = new ArrayList(propertyValue.length);
	for (int i = 0; i < propertyValue.length; i++) {
	    propList.add(propertyValue[i]);
	}
	changeProperty(PROP_QUERIES, propList);
    }

    public Rule[] getRule() {
	Object propList = getProperty(PROP_RULES);
	if (propList instanceof List)
	    return (Rule[]) ((List) propList).toArray(new Rule[0]);
	else if (propList != null)
	    return new Rule[] { (Rule) propList }; // Handle special case of a
	// single item not contained
	// in a list
	return new Rule[0];
    }

    public void addRule(Rule newValue) {
	Object propList = getProperty(PROP_RULES);
	List newList;
	if (propList instanceof List)
	    newList = (List) propList;
	else {
	    newList = new ArrayList();
	    if (propList != null)
		newList.add(propList); // Handle special case of a single
	    // previous item not contained in a list
	}
	newList.add(newValue);
	changeProperty(PROP_RULES, newList);
    }

    public void setRule(Rule[] propertyValue) {
	List propList = new ArrayList(propertyValue.length);
	for (int i = 0; i < propertyValue.length; i++) {
	    propList.add(propertyValue[i]);
	}
	changeProperty(PROP_RULES, propList);
    }

    public Situation[] getSituation() {
	Object propList = getProperty(PROP_SITUATIONS);
	if (propList instanceof List)
	    return (Situation[]) ((List) propList).toArray(new Situation[0]);
	else if (propList != null)
	    return new Situation[] { (Situation) propList };
	// Handle special case of a single item not contained in a list
	return new Situation[0];
    }

    public void addSituation(Situation newValue) {
	Object propList = getProperty(PROP_SITUATIONS);
	List newList;
	if (propList instanceof List)
	    newList = (List) propList;
	else {
	    newList = new ArrayList();
	    if (propList != null)
		newList.add(propList); // Handle special case of a single
	    // previous item not contained in a list
	}
	newList.add(newValue);
	changeProperty(PROP_SITUATIONS, newList);
    }

    public void setSituation(Situation[] propertyValue) {
	List propList = new ArrayList(propertyValue.length);
	for (int i = 0; i < propertyValue.length; i++) {
	    propList.add(propertyValue[i]);
	}
	changeProperty(PROP_SITUATIONS, propList);
    }
}
