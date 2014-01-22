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
