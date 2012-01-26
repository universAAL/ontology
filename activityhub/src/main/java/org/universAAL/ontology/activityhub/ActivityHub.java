/**
 * 
 */
package org.universAAL.ontology.activityhub;

import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.ActivityHubOntology;

/**
 * Ontological SERVICE that handles activity hub devices. Methods included in this
 * class are the mandatory ones for representing an ontological service in Java
 * classes for uAAL.
 * 
 * Built according to the uAAL lighting service example. 
 * 
 * @author Thomas Fuxreiter
 */
public class ActivityHub extends Service {

	public static final String MY_URI = ActivityHubOntology.NAMESPACE + "ActivityHub";
	
	public static final String PROP_CONTROLS = ActivityHubOntology.NAMESPACE + "controls";

	public ActivityHub() {
		super();
	}

	public ActivityHub(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.universAAL.middleware.owl.ManagedIndividual#getPropSerializationType
	 * (java.lang.String)
	 */
	public int getPropSerializationType(String propURI) {
		return PROP_CONTROLS.equals(propURI) ? PROP_SERIALIZATION_FULL : super
				.getPropSerializationType(propURI);
	}

	public boolean isWellFormed() {
		return true;
	}
}
