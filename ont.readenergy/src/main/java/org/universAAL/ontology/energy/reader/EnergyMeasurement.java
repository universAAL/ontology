package org.universAAL.ontology.energy.reader;

import org.universAAL.middleware.owl.ManagedIndividual;

public class EnergyMeasurement extends ManagedIndividual{

	public static final String MY_URI = ReadEnergyOntology.NAMESPACE + "EnergyReaderMeassurement";
	public static final String PROP_HAS_VALUE = ReadEnergyOntology.NAMESPACE +"hasValue";
	public static final String PROP_HAS_UNIT = ReadEnergyOntology.NAMESPACE +"hasUnit";
	
	 public EnergyMeasurement() {
		  super();
	  }

	  public EnergyMeasurement(String uri) {
		super(uri);
	  }
	
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	  }

	public Integer getValue() {
		return (Integer) props.get(PROP_HAS_VALUE);
	}

	public String getUnit() {
		return (String) props.get(PROP_HAS_UNIT);
	}
	
	public void setValue(Object value){
		props.put(PROP_HAS_VALUE, value);
	}

	public void setUnit(String value){
		props.put(PROP_HAS_UNIT, value);
	}
}
