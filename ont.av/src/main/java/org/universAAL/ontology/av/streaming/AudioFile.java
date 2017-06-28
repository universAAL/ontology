/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute for Computer Graphics Research

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

package org.universAAL.ontology.av.streaming;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.av.AVOntology;

/**
 * Ontological representation of an audio software file. Methods included in
 * this class are the mandatory ones for representing an ontological concept in
 * Java classes for universAAL. Usually it includes getters and setters for most of
 * its properties.
 *
 * @author climberg
 * @author Carsten Stockloew
 */
public class AudioFile extends ManagedIndividual {

	public static final String MY_URI = AVOntology.NAMESPACE + "AudioFile";
	public static final String PROP_HAS_URL = AVOntology.NAMESPACE + "hasURL";
	// content type should be replaced by format
	public static final String PROP_HAS_CONTENT_TYPE = AVOntology.NAMESPACE + "hasContentType";
	public static final String PROP_HAS_FORMAT = AVOntology.NAMESPACE + "hasFormat";

	/** The default constructor */
	public AudioFile() {
		super();
	}

	public AudioFile(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	public String getURL() {
		Object obj = getProperty(PROP_HAS_URL);
		if (obj instanceof String)
			return (String) obj;
		return null;
	}

	// TODO: perhaps it is better, if the parameter is checked for URL
	// conventions
	public void setURL(String URL) {
		setProperty(PROP_HAS_URL, URL);
	}
}
