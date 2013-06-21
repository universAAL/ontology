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
import org.universAAL.ontology.vcard.*;

public class VCardFactory implements ResourceFactory {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {
	switch (factoryIndex) {
	case VCardOntology.TEL:
	    return new Tel(instanceURI);
	case VCardOntology.EMAIL:
	    return new Email(instanceURI);
	case VCardOntology.BBSCOMM:
	    return new BBS(instanceURI);
	case VCardOntology.CAR:
	    return new Car(instanceURI);
	case VCardOntology.CELL:
	    return new Cell(instanceURI);
	case VCardOntology.FAX:
	    return new Fax(instanceURI);
	case VCardOntology.ISDNCOMM:
	    return new ISDN(instanceURI);
	case VCardOntology.MODEM:
	    return new Modem(instanceURI);
	case VCardOntology.MSG:
	    return new Msg(instanceURI);
	case VCardOntology.PAGER:
	    return new Pager(instanceURI);
	case VCardOntology.PCSCOMM:
	    return new PCS(instanceURI);
	case VCardOntology.VIDEO:
	    return new Video(instanceURI);
	case VCardOntology.VOICE:
	    return new Voice(instanceURI);
	case VCardOntology.INET:
	    return new Internet(instanceURI);
	case VCardOntology.X400MAIL:
	    return new X400(instanceURI);
	case VCardOntology.NAME:
	    return new Name(instanceURI);
	case VCardOntology.ORG:
	    return new Organization(instanceURI);
	case VCardOntology.VCARD:
	    return new VCard(instanceURI);
	}
	return null;
    }
}
