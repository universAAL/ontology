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
package org.universAAL.ontology.profile.service;

import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.profile.ProfileOntology;

/**
 * Ontological service that handles and edits profile-related information.
 * Methods included in this class are the mandatory ones for representing an
 * ontological service in Java classes for uAAL.
 * 
 * @author Kostast Agnantis
 * @author Carsten Stockloew
 */
public class ProfilingEditorService extends Service {
    public static final String MY_URI = ProfileOntology.NAMESPACE
	    + "ProfilingEditorService";
    public static final String PROP_CONTROLS = ProfileOntology.NAMESPACE
	    + "editorControls";

    public ProfilingEditorService(String uri) {
	super(uri);
    }

    public ProfilingEditorService() {
	super();
    }
    
    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true;
    }
}
