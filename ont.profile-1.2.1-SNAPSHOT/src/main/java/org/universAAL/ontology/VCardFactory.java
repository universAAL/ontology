package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.vcard.*;

public class VCardFactory extends ResourceFactoryImpl {

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