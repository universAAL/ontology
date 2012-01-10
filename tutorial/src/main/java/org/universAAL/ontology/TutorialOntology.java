package org.universAAL.ontology;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.ontology.phThing.Sensor;
import org.universAAL.ontology.tutorial.MyConcept;
import org.universAAL.ontology.tutorial.MyEnumeration;

//This is the main central class where you actually define the restrictions and
//relations between your concepts. It´s like a representation of an OWL file.
//You can have as many of these classes as you want in your bundle, 
//but in general one is enough.
public class TutorialOntology extends Ontology {
    // The factory is used for serialization
    private static TutorialFactory factory = new TutorialFactory();
    // Namespaces must follow this format
    public static final String NAMESPACE = "http://ontology.universAAL.org/Tutorial.owl#";

    public TutorialOntology(String ontURI) {
	super(ontURI);
	// This constructor should always be like this
    }

    public TutorialOntology() {
	super(NAMESPACE);
	// This constructor should always be like this
    }

    // This is where you actually define the relationships and restrictions
    public void create() {
	// First create the information for the whole ontology
	Resource r = getInfo();
	r.setResourceComment("A comment describing the whole ontology");
	r.setResourceLabel("Human Readable label for the ontology");
	// You must add an import for every ontology domain you use in your
	// concepts
	// We add DataRepresentation domain because we use ManagedIndividuals
	addImport(DataRepOntology.NAMESPACE);
	// We add phThing because we use basic Devices
	addImport(PhThingOntology.NAMESPACE);

	// This is the information object that you can reuse for all your
	// concepts
	OntClassInfoSetup oci;

	// For each concept you have created in your ontology, you have to
	// define the information, properties and restrictions

	// load MyConcept___________________________
	// First create the basic information. Because MyConcept can be
	// instantiated and serialized you must use this constructor passing the
	// serialization factory with a single ID for this concept
	oci = createNewOntClassInfo(MyConcept.MY_URI, factory, 0);
	oci.setResourceComment("A comment describing what this concept is used for");
	oci.setResourceLabel("Human readable ID for the concept. e.g: 'My Concept'");
	// Add the superclass of your concept. You can use multiple inheritance.
	// If your concept does not extend any special resource, it must extend
	// ManagedIndividual
	oci.addSuperClass(ManagedIndividual.MY_URI);
	// After the main information you must declare the properties and the
	// restrictions

	// This restriction means that in this property there must be a Device
	// concept, with cardinality 1:1 (a mandatory single Device).
	// SetFunctional means it can only have one value (max cardinality is 1)
	oci.addObjectProperty(MyConcept.PROP_X_CONCEPT_ONLY_ONE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			MyConcept.PROP_X_CONCEPT_ONLY_ONE, Device.MY_URI, 1, 1));

	// This restriction means that in this property there can be none,
	// one or many Sensor concepts
	oci.addObjectProperty(MyConcept.PROP_Y_CONCEPT_LIST);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		MyConcept.PROP_Y_CONCEPT_LIST, Sensor.MY_URI));

	// If the concept in the property has to be a literal (boolean,string,
	// int...) make use of adDatatype and then TypeMapper to get its URI. In
	// this case the cardinality is "optional" (0 or 1)
	oci.addDatatypeProperty(MyConcept.PROP_Z_LITERAL_OPTIONAL)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			MyConcept.PROP_Z_LITERAL_OPTIONAL,
			TypeMapper.getDatatypeURI(Long.class), 0, 1));

	// There are other methods to declare restrictions, and even construct
	// more complex ones, but these are the most commonly used. You can also
	// restrict on properties you inherit from parent concepts.

	// load MyEnumeration_________________________
	// Because enumerations cannot be instantiated you must use the
	// createNewAbstract... method, which does not require factory nor ID
	oci = createNewAbstractOntClassInfo(MyEnumeration.MY_URI);
	oci.setResourceComment("A comment describing what this concept is used for");
	oci.setResourceLabel("Human readable ID for the concept. e.g: 'My Enumeration'");
	oci.addSuperClass(ManagedIndividual.MY_URI);

	// When creating enumerations you just need to list the possible values
	// in this method
	oci.toEnumeration(new ManagedIndividual[] { MyEnumeration.option1,
		MyEnumeration.option2, MyEnumeration.option3,
		MyEnumeration.option4, MyEnumeration.option5 });

    }
}
