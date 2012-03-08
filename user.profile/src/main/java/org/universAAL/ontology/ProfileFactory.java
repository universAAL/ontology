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
package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.profile.*;
import org.universAAL.ontology.profile.service.ProfilingEditorService;
import org.universAAL.ontology.profile.service.ProfilingService;

/**
 * The factory for instantiating objects of the ontology classes.
 * 
 * @author Carsten Stockloew
 */

public class ProfileFactory extends ResourceFactoryImpl {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {
	switch (factoryIndex) {
	case 0:
	    return new AALService(instanceURI);
	case 1:
	    return new AALSpace(instanceURI);
	case 2:
	    return new User(instanceURI);
	case 3:
	    return new AssistedPerson(instanceURI);
	case 4:
	    return new Caregiver(instanceURI);
	case 5:
	    return new AALSpaceProfile(instanceURI);
	case 6:
	    return new AALServiceProfile(instanceURI);
	case 7:
	    return new UserProfile(instanceURI);
	case 8:
	    return new AssistedPersonProfile(instanceURI);
	case 9:
	    return new CaregiverProfile(instanceURI);
	case 10:
	    return new ProfilingEditorService(instanceURI);
	case 11:
	    return new ProfilingService(instanceURI);
	}
	return null;
    }
}
