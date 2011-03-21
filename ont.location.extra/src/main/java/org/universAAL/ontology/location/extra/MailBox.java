/*
	Copyright 2008-2010 Vodafone Italy, http://www.vodafone.it
	Vodafone Omnitel N.V.
	
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
package org.universAAL.ontology.location.extra;

import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;

/**
 * * The MailBox class represents an address that doesn't identify a building
 * (i.e. a post office box)
 * 
 * @author smazzei
 * 
 */
public class MailBox extends Address {

    public static final String MY_URI;
    public static final String PROP_POST_OFFICE_BOX;

    static {
	MY_URI = uAAL_VOCABULARY_NAMESPACE + "mailbox";
	PROP_POST_OFFICE_BOX = uAAL_VOCABULARY_NAMESPACE + "postOfficeBox";
	register(MailBox.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	// PROP_POST_OFFICE_BOX property is mandatory
	if (PROP_POST_OFFICE_BOX.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);
	return Address.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = Address.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 1];
	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i] = PROP_POST_OFFICE_BOX;
	return toReturn;
    }

    /**
     * Constructor just for usage by de-serializers. Do not use this constructor
     * within applications as it may lead to incomplete instances that cause
     * exceptions.
     */
    public MailBox() {
	super();
    }

    /**
     * Constructor just for usage by de-serializers. Do not use this constructor
     * within applications as it may lead to incomplete instances that cause
     * exceptions.
     */
    public MailBox(String uri) {
	super(uri);
    }

    /**
     * 
     * @param uri
     *            The ontological object URI
     * @param locality
     *            The address locality (e.g. Milan, London, etc.)
     * @param postOfficeMailBox
     *            A string that identifies a post office mailbox
     */
    public MailBox(String uri, String locality, String postOfficeMailBox) {
	super(uri, locality);
	setPostOfficeBox(postOfficeMailBox);
    }

    /**
     * 
     * @param locality
     *            The address locality (e.g. Milan, London, etc.)
     * @param postOfficeMailBox
     *            A string that identifies a post office mailbox. A null value
     *            or an empty string are not accepted.
     */
    public MailBox(String locality, String postOfficeMailBox) {
	super(locality);
	setPostOfficeBox(postOfficeMailBox);
    }

    public static String getRDFSComment() {
	return "The class of mailboxes";
    }

    public static String getRDFSLabel() {
	return "MailBox";
    }

    /**
     * 
     * @return a String containing the post office box property
     */
    public String getPostOfficeBox() {
	if (!props.containsKey(PROP_POST_OFFICE_BOX))
	    return null;
	return (String) props.get(PROP_POST_OFFICE_BOX);
    }

    /**
     * Set the post office mail box property
     * 
     * @param mailBox
     *            a null object or an empty String are not allowed
     */
    public void setPostOfficeBox(String mailBox) {
	if (mailBox == null || mailBox == "")
	    throw new IllegalArgumentException();
	props.put(PROP_POST_OFFICE_BOX, mailBox);
    }

    public int getPropSerializationType(String propURI) {
	if (PROP_POST_OFFICE_BOX.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;
	return super.getPropSerializationType(propURI);
    }

    /**
     * @return true if the Address contains at least the location property and
     *         the post office box
     */
    public boolean isWellFormed() {
	return super.isWellFormed() && props.containsKey(PROP_POST_OFFICE_BOX);
    }
}
