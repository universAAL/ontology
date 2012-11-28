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

public class Situation extends Persistent {
    public static final String MY_URI = ReasoningOntology.NAMESPACE
	    + "Situation";
    public static final String PROP_RDF_PREDICATE = ReasoningOntology.NAMESPACE
	    + "rdfPredicate";
    public static final String PROP_RDF_SUBJECT = ReasoningOntology.NAMESPACE
	    + "rdfSubject";
    public static final String PROP_RDF_OBJECT = ReasoningOntology.NAMESPACE
	    + "rdfObject";

    public Situation() {
	super();
    }

    public Situation(String uri) {
	super(uri);
    }

    public Situation(String subject, String predicate, String object) {
	this();
	setRdfSubject(subject);
	setRdfPredicate(predicate);
	setRdfObject(object);
    }

    public Situation(String uri, String subject, String predicate, String object) {
	this(uri);
	setRdfSubject(subject);
	setRdfPredicate(predicate);
	setRdfObject(object);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return hasProperty(PROP_RDF_SUBJECT);
    }

    public String getRdfSubject() {
	return (String) getProperty(PROP_RDF_SUBJECT);
    }

    public void setRdfSubject(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_RDF_SUBJECT, newPropValue);
    }

    public String getRdfPredicate() {
	return (String) getProperty(PROP_RDF_PREDICATE);
    }

    public void setRdfPredicate(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_RDF_PREDICATE, newPropValue);
    }

    public String getRdfObject() {
	return (String) getProperty(PROP_RDF_OBJECT);
    }

    public void setRdfObject(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_RDF_OBJECT, newPropValue);
    }

    public boolean equals(Situation situation) {
	return situation.getRdfSubject().equals(this.getRdfSubject())
		&& (situation.getRdfObject() == this.getRdfObject() || situation
			.getRdfObject().equals(this.getRdfObject()))
		&& (situation.getRdfPredicate() == this.getRdfPredicate() || situation
			.getRdfPredicate().equals(this.getRdfPredicate()));
    }
    
    @Override
    public String toString() {
	return "<html>" + getURI()
	    + ":<br>Subject: "
	    + this.getRdfSubject()
	    + "<br>Predicate: "
	    + this.getRdfPredicate()
	    + "<br>Object: "
	    + this.getRdfObject()
	    + "</html>";
    }
}
