/*
	Copyright 2008-2014 ITACA-TSB, http://www.tsb.upv.es
	Instituto Tecnologico de Aplicaciones de Comunicacion 
	Avanzadas - Grupo Tecnologias para la Salud y el 
	Bienestar (TSB)
	Copyright 2008-2014 Forschungszentrum Informatik FZI, http://www.fzi.de
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

package org.universAAL.ontology.profile;

/**
 * Ontology class representing an Assisted Person
 * 
 * @author Peter Wolf
 * @author Alvaro Fides
 */

public class AssistedPerson extends User {

	/** Class URI */
	public static final String MY_URI = ProfileOntology.NAMESPACE + "AssistedPerson";

	/**
	 * Because there is no multiple inhertiance in Java, we copy this property
	 * from Profilable (although the methods here still use
	 * Profilable.PROP_HAS_PROFILE).
	 */
	public static final String PROP_HAS_PROFILE = Profilable.PROP_HAS_PROFILE;

	protected AssistedPerson() {
		super();
	}

	public AssistedPerson(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public boolean isWellFormed() {
		if (getProperty(Profilable.PROP_HAS_PROFILE) != null) {
			return (getProperty(Profilable.PROP_HAS_PROFILE) instanceof AssistedPersonProfile);
		}
		return false;
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	/**
	 * Sets the value for the Assisted Person Profile of this Assisted Person
	 * 
	 * @param value
	 *            The Profile to set
	 */
	public void setProfile(AssistedPersonProfile value) {
		setProperty(Profilable.PROP_HAS_PROFILE, value);
	}

	/**
	 * Gets the value of the Assisted Person Profile of this Assisted Person
	 * 
	 * @return The Profile of the Assisted Person
	 */
	public AssistedPersonProfile getAPProfile() {
		return (AssistedPersonProfile) getProperty(Profilable.PROP_HAS_PROFILE);
	}

}
