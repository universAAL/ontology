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
 * Ontology class representing a subprofile concept
 * 
 * @author Peter Wolf
 * @author Alvaro Fides
 */

public class SubProfile extends ManagedIndividual {

    /** Class URI */
    public static final String MY_URI = ProfileOntology.NAMESPACE
	    + "SubProfile";

    protected SubProfile() {
	super();
    }

    public SubProfile(String uri) {
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
    
    public boolean isClosedCollection(String propURI) {
	return false;
    }

}
