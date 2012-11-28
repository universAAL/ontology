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

import javax.swing.ToolTipManager;

import org.universAAL.middleware.context.ContextEvent;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;

public class Query extends Persistent {
    public static final String MY_URI = ReasoningOntology.NAMESPACE + "Query";
    public static final String PROP_FULL_TEXT_QUERY = ReasoningOntology.NAMESPACE
	    + "fullQuery";
    public static final String PROP_SEARCH_STRING = ReasoningOntology.NAMESPACE
	    + "searchString";
    public static final String PROP_RESULTING_EVENT = ReasoningOntology.NAMESPACE
	    + "resultingEvent";

    static {
	ToolTipManager.sharedInstance().setInitialDelay(100);
	ToolTipManager.sharedInstance().setDismissDelay(10000);
    }

    public Query() {
	super();
    }

    public Query(String uri) {
	super(uri);
    }

    public Query(String uri, String fullQuery) {
	this(uri);
	setFullQuery(fullQuery);
    }

    public Query(ContextEvent resultingEvent, String searchString) {
	this();
	setResultingEvent(resultingEvent);
	setSearchString(searchString);
    }

    public Query(String uri, ContextEvent resultingEvent, String searchString) {
	this(uri);
	setResultingEvent(resultingEvent);
	setSearchString(searchString);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return hasProperty(PROP_FULL_TEXT_QUERY)
		|| (hasProperty(PROP_SEARCH_STRING) && hasProperty(PROP_RESULTING_EVENT));
    }

    private String getFullQuery() {
	return (String) getProperty(PROP_FULL_TEXT_QUERY);
    }

    public void setFullQuery(String query) {
	if (query != null)
	    changeProperty(PROP_FULL_TEXT_QUERY, query);
    }

    public ContextEvent getResultingEvent() {
	return (ContextEvent) getProperty(PROP_RESULTING_EVENT);
    }

    public void setResultingEvent(ContextEvent newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_RESULTING_EVENT, newPropValue);
    }

    public String getSearchString() {
	return (String) getProperty(PROP_SEARCH_STRING);
    }

    public void setSearchString(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_SEARCH_STRING, newPropValue);
    }

    public boolean equals(Query query) {
	if (hasProperty(PROP_FULL_TEXT_QUERY))
	    return query.hasProperty(PROP_FULL_TEXT_QUERY)
		    && query.getFullQuery().equals(getFullQuery());

	ContextEvent event1 = query.getResultingEvent();
	ContextEvent event2 = this.getResultingEvent();
	return query.getSearchString().equals(this.getSearchString())
		&& (event1.getRDFSubject() == event2.getRDFSubject() || event1
			.getRDFSubject().equals(event2.getRDFSubject()))
		&& (event1.getRDFPredicate() == event2.getRDFPredicate() || event1
			.getRDFPredicate().equals(event2.getRDFPredicate()))
		&& (event1.getRDFObject() == event2.getRDFObject() || event1
			.getRDFObject().equals(event2.getRDFObject()));
    }

    public String getResultingQuery() {
	return this.getResultingQuery(System.getProperty("line.separator"));
    }

    private String getResultingQuery(String lineBreak) {
	if (hasProperty(PROP_FULL_TEXT_QUERY))
	    return getFullQuery();

	StringBuilder query = new StringBuilder("CONSTRUCT { <");
	query.append(ContextEvent.CONTEXT_EVENT_URI_PREFIX);
	query.append("_:0000000000000000:00>  <");
	query.append(Resource.PROP_RDF_TYPE).append(">  <");
	query.append(ContextEvent.MY_URI).append("> ;");
	query.append(lineBreak).append("<");
	query.append(ContextEvent.PROP_RDF_SUBJECT).append("> <");
	query.append(getResultingEvent().getRDFSubject().getURI());
	query.append("> ");

	if (getResultingEvent().getRDFPredicate() != null
		&& !getResultingEvent().getRDFPredicate().equals("")) {

	    query.append(";").append(lineBreak).append("<");
	    query.append(ContextEvent.PROP_RDF_PREDICATE).append("> <");
	    query.append(getResultingEvent().getRDFPredicate());
	    query.append("> ");

	    Object object = getResultingEvent().getRDFObject();
	    if (object != null) {
		query.append(";").append(lineBreak).append("<");
		query.append(ContextEvent.PROP_RDF_OBJECT).append("> ");

		if (object instanceof ManagedIndividual) {
		    query.append("<");
		    query.append(((ManagedIndividual) object).getURI());
		} else {
		    query.append("\"");
		    query.append(object.toString());
		    query.append("\"^^<");
		    query.append(TypeMapper.getDatatypeURI(object.getClass()));
		}
		query.append("> ");

	    }
	}
	query.append(".").append(lineBreak);
	query.append("<").append(getResultingEvent().getRDFSubject().getURI())
		.append("> ");
	query.append("<").append(Resource.PROP_RDF_TYPE).append("> ");
	query.append("<").append(getResultingEvent().getSubjectTypeURI())
		.append(">");
	query.append(". }").append(lineBreak);
	query.append("WHERE").append(lineBreak);
	query.append(" {").append(lineBreak);

	query.append(getSearchString());

	query.append(lineBreak).append(" }").append(lineBreak);

	return query.toString();
    }

    @Override
    public String toString() {
	String query = getResultingQuery();
	return "<html>" + getURI() + ":<br>"
		+ query.replace("<", "&lt;").replace(">", "&gt;").replace(
			System.getProperty("line.separator"), "<br>")
		+ "</html>";
    }
}
