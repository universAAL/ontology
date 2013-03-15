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

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Ontological representation of a root profile. Methods included in this class
 * are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author Carsten Stockloew
 * @author Alvaro Fides
 * @author Peter Wolf
 */
public class Profile extends ManagedIndividual {

    /** Class URI */
    public static final String MY_URI = ProfileOntology.NAMESPACE + "Profile";

    /** http://ontology.universAAL.org/Profile.owl#hasSubProfile */
    public static final String PROP_HAS_SUB_PROFILE = ProfileOntology.NAMESPACE
	    + "hasSubProfile";

    protected Profile() {
	super();
    }

    public Profile(String uri) {
	super(uri);
    }

    public boolean isWellFormed() {
	return true;
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    public void setSubProfile(SubProfile value) {
	super.setProperty(PROP_HAS_SUB_PROFILE, value);
    }

    public SubProfile getSubProfile() {
	return (SubProfile) props.get(PROP_HAS_SUB_PROFILE);
    }

}