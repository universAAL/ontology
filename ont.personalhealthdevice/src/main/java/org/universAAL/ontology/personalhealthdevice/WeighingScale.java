package org.universAAL.ontology.personalhealthdevice;

import org.universAAL.ontology.measurement.Measurement;
import org.universAAL.ontology.phThing.Device;

/**
 * Ontological representation of a weighing scale.
 * 
 * @author Thomas Fuxreiter (foex@gmx.at) 
 */
public class WeighingScale extends Device {

	public static final String MY_URI = PersonalHealthDeviceOntology.NAMESPACE
    + "WeighingScale";
	
	public static final String PROP_HAS_MEASURED_WEIGHT = PersonalHealthDeviceOntology.NAMESPACE
	+ "hasMeasuredWeight";

	public WeighingScale() {
		super();
	}

	public WeighingScale(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}
	
	public void setMeasuredWeight(Measurement m){
		props.put(PROP_HAS_MEASURED_WEIGHT, m);
	}
	
    public Measurement getMeasuredWeight() {
    	return ((Measurement) props.get(PROP_HAS_MEASURED_WEIGHT));
    }
    
}
