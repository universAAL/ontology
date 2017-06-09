/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute for Computer Graphics Research
	
	Copyright 2008-2010 ITACA-TSB, http://www.tsb.upv.es
        Instituto Tecnologico de Aplicaciones de Comunicacion 
        Avanzadas - Grupo Tecnologias para la Salud y el 
        Bienestar (TSB)
	
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
package org.universAAL.ontology.location.address;

import org.universAAL.ontology.location.LocationOntology;

/**
 * Ontological representation of a Mail Box. It is used when the address
 * represents an entity that has no physical representation and/or only has a
 * mail box in a post office, not corresponding to its actual location. Methods
 * included in this class are the mandatory ones for representing an ontological
 * concept in Java classes for uAAL. Usually it includes getters and setters for
 * most of its properties.
 * 
 * @author alfiva
 * 
 */
public class MailBox extends Address {
	public static final String MY_URI = LocationOntology.NAMESPACE + "MailBox";
	public static final String PROP_POST_OFFICE_BOX = LocationOntology.NAMESPACE + "postOfficeBox";

	/**
	 * Creates a MailBox object
	 */
	public MailBox() {

	}

	/**
	 * Creates a MailBox object
	 * 
	 * @param uri
	 *            the object URI
	 */
	public MailBox(String uri) {
		super(uri);
	}

	public MailBox(String uri, String postOffciceBox) {
		super(uri);
		props.put(PROP_POST_OFFICE_BOX, postOffciceBox);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return props.containsKey(PROP_POST_OFFICE_BOX);
	}

	/**
	 * Gets the post office box value of the Address
	 * 
	 * @return The post office box value
	 */
	public String getPostOfficeBox() {
		return (String) props.get(PROP_POST_OFFICE_BOX);
	}

	/**
	 * Sets the post office box value of the Address
	 * 
	 * @param reg
	 *            The value to set
	 */
	public void setPostOfficeBox(String val) {
		props.put(PROP_POST_OFFICE_BOX, val);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.universAAL.ontology.location.address.Address#toReadableString()
	 */
	public String toReadableString() {
		return super.toReadableString() + this.getPostOfficeBox();
	}
}
