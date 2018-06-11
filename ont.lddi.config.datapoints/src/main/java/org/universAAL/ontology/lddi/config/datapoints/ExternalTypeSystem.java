package org.universAAL.ontology.lddi.config.datapoints;

import java.util.Enumeration;
import java.util.Hashtable;

import org.universAAL.middleware.container.utils.StringUtils;
import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Using this class, the set of logical / physical components connected via a
 * {@link CommunicationGateway} can be specified in the configuration file of
 * that {@link CommunicationGateway}. {@link Datapoint}s have to be linked to
 * components by referring to the sequence number defined in this class. Each
 * component must have a type defined in an ontology. If the component
 * corresponds to some physical object, also its location can be specified.
 * 
 * As an example, with an instance of this class you may specify that the
 * component with the sequence id 0 is a dimmable multi-color lamp (type) that
 * is in the middle of ceiling of the living room (location).
 * 
 * @author mtazari
 *
 */
public class ExternalTypeSystem extends ManagedIndividual {
	public static final String MY_URI = LDDIDatapointsOntology.NAMESPACE + "ExternalTypeSystem";
	private static Hashtable localOccurrences = new Hashtable();

	public static ExternalTypeSystem getLocallyRegisteredInstanceByURI(String externalTypeSystem) {
		return (ExternalTypeSystem) localOccurrences.get(externalTypeSystem);
	}

	public static ExternalTypeSystem[] getAllLocallyRegisteredInstances() {
		ExternalTypeSystem[] result = new ExternalTypeSystem[localOccurrences.size()];
		int i = 0;
		for (Enumeration e = localOccurrences.elements();  e.hasMoreElements(); i++)
			result[i] = (ExternalTypeSystem) e.nextElement();
		
		return result;
	}

	private ExternalDataConverter converter;

	public ExternalTypeSystem(String uri, String label, String comment, ExternalDataConverter edc) {
		super(uri);
		
		if (localOccurrences.get(uri) != null
				||  StringUtils.isNullOrEmpty(label)
				||  StringUtils.isNullOrEmpty(comment)
				||  edc == null)
			throw new IllegalArgumentException();

		addType(MY_URI, true);
		setResourceLabel(label);
		setResourceComment(comment);
		
		converter = edc;
		
		localOccurrences.put(uri, this);
	}

	public String getClassURI() {
		return MY_URI;
	}
	
	public ExternalDataConverter getExternalDataConverter() {
		return converter;
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_REDUCED;
	}

	public boolean isWellFormed() {
		return !isAnon();
	}
}
