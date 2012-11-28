/*
	Copyright 2008-2014 ITACA-TSB, http://www.tsb.upv.es
	Instituto Tecnologico de Aplicaciones de Comunicacion 
	Avanzadas - Grupo Tecnologias para la Salud y el 
	Bienestar (TSB)
	Copyright 2008-2014 Forschungszentrum Informatik FZI, http://www.fzi.de
	Copyright 2008-2010 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute of Computer Graphics Research 
	
	
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

import org.universAAL.ontology.location.Place;
//import org.universAAL.ontology.profile.AALSpaceProfile;
//import org.universAAL.ontology.profile.Profile;

/**
 * Ontology class representing an AAL Space
 * 
 * @author Peter Wolf
 * @author Alvaro Fides
 */

public class AALSpace extends Place {

    /** Class URI */
    public static final String MY_URI = ProfileOntology.NAMESPACE + "AALSpace";

    protected AALSpace() {
	super();
    }

    public AALSpace(String uri) {
	super(uri);
    }

    public boolean isWellFormed() {
	if (getProperty(Profilable.PROP_HAS_PROFILE) != null) {
	    return (getProperty(Profilable.PROP_HAS_PROFILE) instanceof AALSpaceProfile);
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
     * Sets the value for the AAL Space Profile of this AAL Space
     * 
     * @param value
     *            The Profile to set
     */
    public void setProfile(AALSpaceProfile value) {
	setProperty(Profilable.PROP_HAS_PROFILE, value);
    }

    /**
     * Gets the value of the AAL Space Profile of this AAL Space
     * 
     * @return The Profile of the AAL Space
     */
    public AALSpaceProfile getProfile() {
	return (AALSpaceProfile) getProperty(Profilable.PROP_HAS_PROFILE);
    }

}
