/**
 * Continua HDP manager ontology.
 * 
 * @author Angel Martinez-Cavero TSB Technologies for Health and Well-being
 * 
 */

// Package
package org.universAAL.ontology;

// Imports
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.continua.ContinuaHealthDevice;
import org.universAAL.ontology.continua.ContinuaHealthManager;

// Main class
public class ContinuaHealthManagerOntology extends Ontology {
 
	// Attributes
	private static ContinuaHealthManagerFactory factory = new ContinuaHealthManagerFactory();
	public static final String NAMESPACE = "http://ontology.universAAL.org/ContinuaHealthManager.owl#";
	
	// Constructor
	public ContinuaHealthManagerOntology() {
		super(NAMESPACE);	
	}
	
	public ContinuaHealthManagerOntology(String ontURI) {
		super(ontURI);	
	}

	// Methods
	/** Information about the ontology and its elements */
	public void create() {
		Resource r = getInfo();
		// This ontology
		r.setResourceComment("Ontology for Continua Health Manager");
		r.setResourceLabel("Personal Health Manager based on Continua HDP");
		addImport(DataRepOntology.NAMESPACE);
		OntClassInfoSetup oci;		
		// Continua Health Device
		oci = createNewOntClassInfo(ContinuaHealthDevice.MY_URI,factory,0);
		oci.setResourceComment("Continua Health Device created from a MAC value and a data type");
		oci.setResourceLabel("Continua Health Device");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addDatatypeProperty(ContinuaHealthDevice.PROP_HAS_MAC).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ContinuaHealthDevice.PROP_HAS_MAC,TypeMapper.getDatatypeURI(String.class),1,1));
		oci.addDatatypeProperty(ContinuaHealthDevice.PROP_HAS_DATA_TYPE).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ContinuaHealthDevice.PROP_HAS_DATA_TYPE,TypeMapper.getDatatypeURI(String.class),1,1));
		// Continua Health Manager
		oci = createNewOntClassInfo(ContinuaHealthManager.MY_URI,factory,1);
		oci.setResourceComment("A key-value pair (MAC, DataType) which describes a Continua Health Device");
		oci.setResourceLabel("Continua Health Manager");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addDatatypeProperty(ContinuaHealthManager.PROP_HAS_CONTINUA_DEVICE).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(ContinuaHealthManager.PROP_HAS_CONTINUA_DEVICE,ContinuaHealthDevice.MY_URI));		
		oci.addDatatypeProperty(ContinuaHealthManager.PROP_HAS_NOT_CONTINUA_DEVICE).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(ContinuaHealthManager.PROP_HAS_NOT_CONTINUA_DEVICE,ContinuaHealthDevice.MY_URI));
	}
}