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
package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.profile.*;
import org.universAAL.ontology.profile.service.ProfilingEditorService;
import org.universAAL.ontology.profile.service.ProfilingService;

/**
 * The factory for instantiating objects of the ontology classes.
 * 
 * @author Carsten Stockloew
 */

public class ProfileFactory implements ResourceFactory {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {
	switch (factoryIndex) {
	case ProfileOntology.AALSERV:
	    return new AALService(instanceURI);
	case ProfileOntology.AALSPACE:
	    return new AALSpace(instanceURI);
	case ProfileOntology.USER:
	    return new User(instanceURI);
	case ProfileOntology.AP:
	    return new AssistedPerson(instanceURI);
	case ProfileOntology.CARE:
	    return new Caregiver(instanceURI);
	case ProfileOntology.AALSPACEPROF:
	    return new AALSpaceProfile(instanceURI);
	case ProfileOntology.AALSERVPROF:
	    return new AALServiceProfile(instanceURI);
	case ProfileOntology.USERPROF:
	    return new UserProfile(instanceURI);
	case ProfileOntology.APPROF:
	    return new AssistedPersonProfile(instanceURI);
	case ProfileOntology.CAREPROF:
	    return new CaregiverProfile(instanceURI);
	case ProfileOntology.AALAPPSUBPROF:
	    return new AALAppSubProfile(instanceURI);
	case ProfileOntology.CONNDETAILS:
	    return new ConnectionDetails(instanceURI);
	case ProfileOntology.HRSUBPROF:
	    return new HRSubProfile(instanceURI);
	case ProfileOntology.HWSUBPROF:
	    return new HWSubProfile(instanceURI);
	case ProfileOntology.PROP:
	    return new Property(instanceURI);
	case ProfileOntology.REQ:
	    return new Requirement(instanceURI);
	case ProfileOntology.PERSONINFOSUBPROF:
	    return new PersonalInformationSubprofile(instanceURI);
	case ProfileOntology.ONTENTRY:
	    return new OntologyEntry(instanceURI);
	case ProfileOntology.PROFSERV:
	    return new ProfilingService(instanceURI);
	case ProfileOntology.PROFEDITSERV:
	    return new ProfilingEditorService(instanceURI);
	}
	return null;
    }
}
