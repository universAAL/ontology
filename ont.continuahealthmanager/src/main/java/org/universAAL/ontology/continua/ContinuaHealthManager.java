/**
 * Continua Health manager ontology.
 * 
 * @author Angel Martinez-Cavero TSB Technologies for Health and Well-being
 * 
 */

// Package
package org.universAAL.ontology.continua;

// Imports
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.ContinuaHealthManagerOntology;

// Main class
public class ContinuaHealthManager extends Service {
	
	// Attributes
	public static final String MY_URI = ContinuaHealthManagerOntology.NAMESPACE + "ContinuaHealthManagerService";
	public static final String PROP_HAS_CONTINUA_DEVICE = ContinuaHealthManagerOntology.NAMESPACE+"hasContinuaDevice";
	public static final String PROP_HAS_NOT_CONTINUA_DEVICE = ContinuaHealthManagerOntology.NAMESPACE+"hasNotContinuaDevice";
	
	// Constructor	
	public ContinuaHealthManager(String instanceURI) {
		super(instanceURI);
	}

	public ContinuaHealthManager() {
		super();
	}

	// Methods
	public String getClassURI(){
		return MY_URI;  
	}

}