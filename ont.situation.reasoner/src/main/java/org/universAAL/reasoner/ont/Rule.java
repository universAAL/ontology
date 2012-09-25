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

public class Rule extends Persistent {
    public static final String MY_URI = ReasoningOntology.NAMESPACE + "Rule";
    public static final String PROP_SITUATION = ReasoningOntology.NAMESPACE
	    + "ruleSituation";
    public static final String PROP_QUERY = ReasoningOntology.NAMESPACE
	    + "ruleQuery";

    public Rule() {
	super();
    }

    public Rule(String uri) {
	super(uri);
    }

    public Rule(Situation situation, Query query) {
	this();
	setSituation(situation);
	setQuery(query);
    }

    public Rule(String uri, Situation situation, Query query) {
	this(uri);
	setSituation(situation);
	setQuery(query);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return hasProperty(PROP_SITUATION) && hasProperty(PROP_QUERY);
    }

    public Query getQuery() {
	return (Query) getProperty(PROP_QUERY);
    }

    public void setQuery(Query query) {
	if (query != null)
	    changeProperty(PROP_QUERY, query);
    }

    public Situation getSituation() {
	return (Situation) getProperty(PROP_SITUATION);
    }

    public void setSituation(Situation situation) {
	if (situation != null)
	    changeProperty(PROP_SITUATION, situation);
    }
    
    public boolean equals(Rule rule) {
	return 	(rule.getSituation()==getSituation() || rule.getSituation().equals(getSituation())) &&
		(rule.getQuery()==getQuery() || rule.getQuery().equals(getQuery()));
    }
    
    @Override
    public String toString() {
	return 	"<html>" + getURI()
		+ ":<br>Situation: " + getSituation().getURI()
		+ "<br>Query: " + getQuery().getURI()
		+ "</html>";
    }
}
