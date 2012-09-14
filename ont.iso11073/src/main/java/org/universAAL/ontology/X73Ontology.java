
package org.universAAL.ontology;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.location.LocationOntology;

import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.x73.MDS;
import org.universAAL.ontology.x73.MDSAttribute;
import org.universAAL.ontology.x73.X73Factory;
import org.universAAL.ontology.x73.x73;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.service.owl.Service;


//import the factory for this ontology


/**
 * @author AAL Studio: UML2Java transformation
 */
public final class X73Ontology extends Ontology {

  private static X73Factory factory = new X73Factory();
  public static final String NAMESPACE ="http://ontology.universAAL.org/x73#";
	
  public X73Ontology() {
    super(NAMESPACE);
  }

  public void create() {
    Resource r = getInfo();
    r.setResourceComment("");
    r.setResourceLabel("x73");
    addImport(DataRepOntology.NAMESPACE);
    addImport(ServiceBusOntology.NAMESPACE);
    addImport(LocationOntology.NAMESPACE);
		
    


    // ******* Declaration of regular classes of the ontology ******* //
    OntClassInfoSetup oci_MDSAttribute = createNewOntClassInfo(MDSAttribute.MY_URI, factory, 0);
    OntClassInfoSetup oci_x73 = createNewOntClassInfo(x73.MY_URI, factory, 1);
    OntClassInfoSetup oci_MDS = createNewOntClassInfo(MDS.MY_URI, factory, 2);


    // ******* Add content to regular classes of the ontology ******* //
    oci_MDSAttribute.setResourceComment("");
    oci_MDSAttribute.setResourceLabel("MDSAttribute");
    oci_MDSAttribute.addSuperClass(ManagedIndividual.MY_URI); 
    oci_x73.setResourceComment("");
    oci_x73.setResourceLabel("x73");
    oci_x73.addSuperClass(Service.MY_URI); 
    oci_x73.addObjectProperty(x73.PROP_M_D_S).setFunctional();
    oci_x73.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(x73.PROP_M_D_S, 
      MDS.MY_URI, 1, 1));
    
    oci_MDS.setResourceComment("");
    oci_MDS.setResourceLabel("MDS");
    oci_MDS.addSuperClass(Device.MY_URI); 
    oci_MDS.addDatatypeProperty(MDS.PROP_SYSTEM_ID).setFunctional();
    oci_MDS.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(MDS.PROP_SYSTEM_ID, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    
  }
}
