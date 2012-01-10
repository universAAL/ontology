package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.tutorial.MyConcept;

//This class is needed for serialization. You usually only need one per main ontology class
public class TutorialFactory extends ResourceFactoryImpl {

    // This is the only method that you have to code, and it should always look
    // like this
    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {
	switch (factoryIndex) {
	// For each ID that you may receive (You declare the IDs in the main
	// ontology class) you must return an instance of the appropriate
	// concept class for that ID
	case 0:
	    return new MyConcept(instanceURI);
	}
	return null;
    }

}
