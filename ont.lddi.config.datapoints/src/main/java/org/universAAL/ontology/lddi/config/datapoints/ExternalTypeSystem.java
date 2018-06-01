package org.universAAL.ontology.lddi.config.datapoints;

import org.universAAL.middleware.container.utils.StringUtils;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.rdf.Resource;

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

	public static ExternalTypeSystem getLocalDataConverter(String externalTypeSystem) {
		Object o = LDDIDatapointsOntology.typeSystemInfo.getInfo().getInstanceByURI(externalTypeSystem);
		return (o instanceof ExternalTypeSystem)?  (ExternalTypeSystem) o : null;
	}

	public static ExternalTypeSystem[] getAllLocalDataConverters() {
		Resource[] arr = LDDIDatapointsOntology.typeSystemInfo.getInfo().getInstances();
		if (arr == null)
			return new ExternalTypeSystem[0];
		
		ExternalTypeSystem[] result = new ExternalTypeSystem[arr.length];
		for (int i=0;  i<arr.length;  i++)
			if (arr[i] instanceof ExternalTypeSystem)
				result[i] = (ExternalTypeSystem) arr[i];
		
		return result;
	}

	private ExternalDataConverter converter;

	public ExternalTypeSystem(String uri) {
		super(uri);
	}

	public ExternalTypeSystem(String uri, String label, String comment, ExternalDataConverter edc) {
		super(uri);
		
		if (LDDIDatapointsOntology.typeSystemInfo.getInfo().getInstanceByURI(uri) != null
				||  StringUtils.isNullOrEmpty(label)
				||  StringUtils.isNullOrEmpty(comment)
				||  edc == null)
			throw new IllegalArgumentException();
		
		setResourceLabel(label);
		setResourceComment(comment);
		
		converter = edc;
		
		LDDIDatapointsOntology.typeSystemInfo.addInstance(this);
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
