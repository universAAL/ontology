package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.aalfficiency.*;

public class AalfficiencyFactory extends ResourceFactoryImpl {

	public final int Advice = 0;
	public final int AalfficienyAdvices = 1;
	public final int Challenge = 2;
	public final int AalfficiencyChallenges = 3;
	public final int AalfficiencyScore=4;
	public final int AalfficiencyService = 5;
	
	public Resource createInstance(String classURI, String instanceURI,
			int factoryIndex) {
		switch (factoryIndex) {
		case Advice:
			return new Advice(instanceURI);
		case AalfficienyAdvices:
			return new AalfficiencyAdvices(instanceURI);
		case Challenge:
			return new Challenge(instanceURI);
		case AalfficiencyChallenges:
			return new AalfficiencyChallenges(instanceURI);
		case AalfficiencyScore:
			return new AalfficiencyScore(instanceURI);
		case AalfficiencyService:
			return new Aalfficiency(instanceURI);
		}
		return null;
	}
}
