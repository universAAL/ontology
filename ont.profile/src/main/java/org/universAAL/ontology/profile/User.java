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

import org.universAAL.ontology.phThing.PhysicalThing;

/**
 * Ontological representation of a person that is a user of the system. Methods
 * included in this class are the mandatory ones for representing an ontological
 * concept in Java classes for uAAL. Usually it includes getters and setters for
 * most of its properties.
 * 
 * @author Carsten Stockloew
 * @author Alvaro Fides
 * @author Peter Wolf
 */
public class User extends PhysicalThing {

    /** Class URI */
    public static final String MY_URI = ProfileOntology.NAMESPACE + "User";

    /**
     * Because there is no multiple inhertiance in Java, we copy this property
     * from Profilable (although the methods here still use
     * Profilable.PROP_HAS_PROFILE).
     */
    public static final String PROP_HAS_PROFILE = Profilable.PROP_HAS_PROFILE;

    protected User() {
	super();
    }

    public User(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public boolean isWellFormed() {
	if (getProperty(Profilable.PROP_HAS_PROFILE) != null) {
	    return (getProperty(Profilable.PROP_HAS_PROFILE) instanceof UserProfile);
	}
	return false;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    /**
     * Sets the value for the User Profile of this User
     * 
     * @param value
     *            The Profile to set
     */
    public void setProfile(UserProfile value) {
	setProperty(Profilable.PROP_HAS_PROFILE, value);
    }

    /**
     * Gets the value of the User Profile of this User
     * 
     * @return The Profile of the User
     */
    public UserProfile getUserProfile() {
	return (UserProfile) getProperty(Profilable.PROP_HAS_PROFILE);
    }
}
