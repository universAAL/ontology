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
package org.universAAL.ontology.multimedia;

import org.universAAL.ontology.phThing.Device;

/**
 * Ontological representation of a stereoset device. Methods included in this
 * class are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author cwirth
 * @author Carsten Stockloew
 */
public class Stereoset extends Device {

	public static final String MY_URI = MultimediaOntology.NAMESPACE + "Stereoset";
	public static final String PROP_IS_ON_PROG = MultimediaOntology.NAMESPACE + "isOnProg";
	public static final String PROP_IS_ON_COMM = MultimediaOntology.NAMESPACE + "isOnComm";

	public Stereoset() {
		super();
	}

	public Stereoset(String uri) {
		super(uri);
	}

	public Stereoset(String uri, Boolean isOnProg, Boolean isOnComm) {
		super(uri);

		if ((isOnProg == null) || (isOnComm == null))
			throw new IllegalArgumentException();

		props.put(PROP_IS_ON_PROG, isOnProg);
		props.put(PROP_IS_ON_COMM, isOnComm);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public Boolean isOnComm() {
		return (Boolean) props.get(PROP_IS_ON_COMM);
	}

	public Boolean isOnProg() {
		return (Boolean) props.get(PROP_IS_ON_PROG);
	}

	public void setOnProg(Boolean b) {
		if (b != null)
			props.put(PROP_IS_ON_PROG, b);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.persona.ontology.ManagedIndividual#getPropSerializationType(java.
	 * lang.String)
	 */
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.persona.ontology.ManagedIndividual#isWellFormed()
	 */
	public boolean isWellFormed() {
		return props.containsKey(PROP_IS_ON_PROG) && props.containsKey(PROP_IS_ON_COMM);
	}
}
