
package org.universAAL.ontology.language;

import org.universAAL.middleware.owl.BoundingValueRestriction;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.location.LocationOntology;

import org.universAAL.middleware.owl.ManagedIndividual;


//import the factory for this ontology
import org.universAAL.ontology.LanguageFactory;


/**
 * @author AAL Studio: UML2Java transformation
 */
public final class LanguageOntology extends Ontology {

  private static LanguageFactory factory = new LanguageFactory();
  public static final String NAMESPACE ="http://ontology.universAAL.org/LanguageOntology#";
	
  public LanguageOntology() {
    super(NAMESPACE);
  }

  public void create() {
    Resource r = getInfo();
    r.setResourceComment("Ontology for languages based on ISO 639 codes (http://en.wikipedia.org/wiki/List_of_ISO_639-1_codes)");
    r.setResourceLabel("language");
    addImport(DataRepOntology.NAMESPACE);
    addImport(ServiceBusOntology.NAMESPACE);
    addImport(LocationOntology.NAMESPACE);
		
    


    // ******* Declaration of enumeration classes of the ontology ******* //

    OntClassInfoSetup oci_NativeLabelType = createNewAbstractOntClassInfo(NativeLabelType.MY_URI);
    OntClassInfoSetup oci_ISO639CodeType = createNewAbstractOntClassInfo(ISO639CodeType.MY_URI);
    OntClassInfoSetup oci_EnglishLabelType = createNewAbstractOntClassInfo(EnglishLabelType.MY_URI);


    // ******* Declaration of regular classes of the ontology ******* //
    OntClassInfoSetup oci_Language = createNewOntClassInfo(Language.MY_URI, factory, 0);


    // ******* Add content to enumeration classes of the ontology ******* //

    oci_NativeLabelType.setResourceComment("");
    oci_NativeLabelType.setResourceLabel("NativeLabelType");
    oci_NativeLabelType.toEnumeration(new ManagedIndividual[] {
       NativeLabelType.??????, NativeLabelType.Afaraf, NativeLabelType.Afrikaans, NativeLabelType.Akan, NativeLabelType.gjuha shqipe, NativeLabelType.????, NativeLabelType.??????? });

    oci_ISO639CodeType.setResourceComment("");
    oci_ISO639CodeType.setResourceLabel("ISO639CodeType");
    oci_ISO639CodeType.toEnumeration(new ManagedIndividual[] {
       ISO639CodeType.ab, ISO639CodeType.aa, ISO639CodeType.af, ISO639CodeType.ak, ISO639CodeType.sq, ISO639CodeType.am, ISO639CodeType.ar });

    oci_EnglishLabelType.setResourceComment("");
    oci_EnglishLabelType.setResourceLabel("EnglishLabelType");
    oci_EnglishLabelType.toEnumeration(new ManagedIndividual[] {
       EnglishLabelType.Abkhaz, EnglishLabelType.Afar, EnglishLabelType.Afrikaans, EnglishLabelType.Akan, EnglishLabelType.Albanian, EnglishLabelType.Amharic, EnglishLabelType.Arabic });



    // ******* Add content to regular classes of the ontology ******* //
    oci_Language.setResourceComment("");
    oci_Language.setResourceLabel("Language");
    oci_Language.addSuperClass(ManagedIndividual.MY_URI); 
    oci_Language.addObjectProperty(Language.PROP_ENGLISH_LABEL).setFunctional();
    oci_Language.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Language.PROP_ENGLISH_LABEL, 
      EnglishLabelType.MY_URI, 1, 1));
    
    oci_Language.addObjectProperty(Language.PROP_ISO639CODE).setFunctional();
    oci_Language.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Language.PROP_ISO639CODE, 
      ISO639CodeType.MY_URI, 1, 1));
    
    oci_Language.addObjectProperty(Language.PROP_NATIVE_LABEL).setFunctional();
    oci_Language.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(Language.PROP_NATIVE_LABEL, 
      NativeLabelType.MY_URI, 1, 1));
    
  }
}
