/*
	Copyright 2008-2014 ITACA-TSB, http://www.tsb.upv.es
	Instituto Tecnologico de Aplicaciones de Comunicacion 
	Avanzadas - Grupo Tecnologias para la Salud y el 
	Bienestar (TSB)
	
	
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
import org.universAAL.ontology.sysinfo.AALSpaceDescriptor;
import org.universAAL.ontology.sysinfo.AALSpaceStatusDescriptor;
import org.universAAL.ontology.sysinfo.Descriptor;
import org.universAAL.ontology.sysinfo.PeerCardDescriptor;
import org.universAAL.ontology.sysinfo.SystemInfo;

public class SysinfoFactory implements ResourceFactory {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {

	switch (factoryIndex) {
	case 0:
	    return new AALSpaceDescriptor(instanceURI);
	case 1:
	    return new AALSpaceStatusDescriptor(instanceURI);
	case 2:
	    return new Descriptor(instanceURI);
	case 3:
	    return new PeerCardDescriptor(instanceURI);
	case 4:
	    return new SystemInfo(instanceURI);

	}
	return null;
    }
}
