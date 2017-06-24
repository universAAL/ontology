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

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Ontology class representing an AAL Service
 *
 * @author Peter Wolf
 * @author Alvaro Fides
 */

public class AALService extends ManagedIndividual {

	/** Class URI */
	public static final String MY_URI = ProfileOntology.NAMESPACE + "AALService";

	protected AALService() {
		super();
	}

	public AALService(String uri) {
		super(uri);
	}

	public boolean isWellFormed() {
		if (getProperty(Profilable.PROP_HAS_PROFILE) != null) {
			return (getProperty(Profilable.PROP_HAS_PROFILE) instanceof AALServiceProfile);
		}
		return false;
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	/**
	 * Sets the value for the AAL Service Profile of this AAL Service
	 *
	 * @param value
	 *            The Profile to set
	 */
	public void setProfile(AALServiceProfile value) {
		setProperty(Profilable.PROP_HAS_PROFILE, value);
	}

	/**
	 * Gets the value of the AAL Service Profile of this AAL Service
	 *
	 * @return The Profile of the AAL Space
	 */
	public AALServiceProfile getProfile() {
		return (AALServiceProfile) getProperty(Profilable.PROP_HAS_PROFILE);
	}

}
