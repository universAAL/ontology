/**
 * Continua Health device ontology.
 * 
 * @author Angel Martinez-Cavero TSB Technologies for Health and Well-being
 * 
 */

// Package
package org.universAAL.ontology.continua;

// Imports
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.ContinuaHealthManagerOntology;

// Main class
public class ContinuaHealthDevice extends ManagedIndividual {

	// Attributes
	
	public static final String MY_URI;
	public static final String PROP_HAS_MAC;
	public static final String PROP_HAS_DATA_TYPE;

	// Set the URIs of your concept and its properties
	static {
		MY_URI = ContinuaHealthManagerOntology.NAMESPACE + "Fact";	
		PROP_HAS_MAC = ContinuaHealthManagerOntology.NAMESPACE + "hasMAC";	
		PROP_HAS_DATA_TYPE = ContinuaHealthManagerOntology.NAMESPACE + "hasDataType";	
	}

	// Constructor
	public ContinuaHealthDevice() {
	}

	public ContinuaHealthDevice(String uri) {
		super(uri);
	}
	
	public ContinuaHealthDevice(String uri,String mac,String dataType) {
		super(uri);
		setMAC(mac);
		setDataType(dataType);		
	}

	// Methods
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {		
		return true;
	}

	public String getMAC() {
		return (String) props.get(PROP_HAS_MAC);
	}

	public void setMAC(String str) {
		props.put(PROP_HAS_MAC,str);
	}

	public String getDataType() {
		return (String) props.get(PROP_HAS_DATA_TYPE);
	}

	public void setDataType(String str) {
		props.put(PROP_HAS_DATA_TYPE,str);
	}

	public String getClassURI(){
		return MY_URI;  
	}
}