package org.universAAL.ontology.energy.reader;

import org.universAAL.middleware.owl.ManagedIndividual;


public class ReadEnergyDevice extends ManagedIndividual{
	
	public static final String MY_URI = ReadEnergyOntology.NAMESPACE + "EnergyReaderDevice";
	public static final String PROP_HAS_TYPE = ReadEnergyOntology.NAMESPACE +"hasType";
	public static final String PROP_HAS_NAME = ReadEnergyOntology.NAMESPACE +"hasName";
	public static final String PROP_HAS_PLACE = ReadEnergyOntology.NAMESPACE +"hasPlace";
	
	
	public ReadEnergyDevice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ReadEnergyDevice(String uri) {
		super(uri);
		// TODO Auto-generated constructor stub
	}
	public String getClassURI(){
		return MY_URI;  
	}
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	    }
	
	public void setDeviceType(String type){
		props.put(PROP_HAS_TYPE, type);
	}
	
	public void setName(String name){
		props.put(PROP_HAS_NAME, name);
	}

	public void setPlace(String place){
		props.put(PROP_HAS_PLACE, place);
	}
	
	public String getDeviceType(){
		return (String) props.get(PROP_HAS_TYPE);
	}
	
	public String getName(){
		return (String) props.get(PROP_HAS_NAME);
	}
	
	public String getPlace(){
		return (String) props.get(PROP_HAS_PLACE);
	}
	
}
