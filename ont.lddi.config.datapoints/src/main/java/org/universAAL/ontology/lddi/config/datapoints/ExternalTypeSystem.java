package org.universAAL.ontology.lddi.config.datapoints;

import java.util.Enumeration;
import java.util.Hashtable;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.unit.MeasurableDimension;
import org.universAAL.ontology.unit.Unit;

/**
 * 
 * 
 * @author mtazari
 *
 */
public class ExternalTypeSystem extends ManagedIndividual {
	public static final Unit UNIT_CELSIUS = new Unit("celsius", "Celsius", "°C", MeasurableDimension.Temperature);
	public static final Unit UNIT_LITRES = new Unit("litre", "Litre", "l", MeasurableDimension.Adiemnsional);
	public static final Unit UNIT_PPM = new Unit("ppm", "PPM", "ppm", MeasurableDimension.Adiemnsional);
	
	public static final String MY_URI = LDDIDatapointsOntology.NAMESPACE + "ExternalTypeSystem";
	private static Hashtable localOccurrences = new Hashtable();

	public static ExternalTypeSystem getLocallyRegisteredInstanceByURI(String uri) {
		ExternalTypeSystem result = (ExternalTypeSystem) localOccurrences.get(uri);
		if (result == null) {
			result = new ExternalTypeSystem(uri);
			localOccurrences.put(uri, result);
		}
		return result;
	}

	public static ExternalTypeSystem[] getAllLocallyRegisteredInstances() {
		ExternalTypeSystem[] result = new ExternalTypeSystem[localOccurrences.size()];
		int i = 0;
		for (Enumeration e = localOccurrences.elements();  e.hasMoreElements(); i++)
			result[i] = (ExternalTypeSystem) e.nextElement();
		
		return result;
	}

	public ExternalTypeSystem(String uri) {
		super(uri);
		
		if (localOccurrences.get(uri) != null  ||  isAnon())
			throw new IllegalArgumentException();

		addType(MY_URI, true);
		localOccurrences.put(uri, this);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_REDUCED;
	}

	public boolean isWellFormed() {
		return !isAnon();
	}
}
