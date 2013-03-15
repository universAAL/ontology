package org.universAAL.ontology.risk;

import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.RiskFactory;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.Sensor;
import org.universAAL.ontology.profile.AssistedPerson;
import org.universAAL.ontology.profile.ProfileOntology;

public class RiskOntology extends Ontology {

    public static final String NAMESPACE = "http://ontology.universAAL.org/Risk.owl#";

    private static RiskFactory factory = new RiskFactory();

    public RiskOntology(String ontURI) {
	super(ontURI);
    }

    public RiskOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r.setResourceComment("Ontology for Risk detection devices");
	r.setResourceLabel("Risk");
	addImport(ProfileOntology.NAMESPACE);

	OntClassInfoSetup oci;

	oci = extendExistingOntClassInfo(Device.MY_URI);
	oci = extendExistingOntClassInfo(Sensor.MY_URI);

	// FallDetector
	oci = createNewOntClassInfo(FallDetector.MY_URI, factory, 0);
	oci.setResourceComment("A Fall Detector Device");
	oci.setResourceLabel("Fall Detector");
	oci.addSuperClass(Sensor.MY_URI);
	oci.addObjectProperty(FallDetector.PROP_WORN_BY).setFunctional();
	oci
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				FallDetector.PROP_WORN_BY,
				AssistedPerson.MY_URI, 0, 1));
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Sensor.PROP_MEASURED_VALUE, TypeMapper
				.getDatatypeURI(Boolean.class), 0, 1));

	// Panic button
	oci = createNewOntClassInfo(PanicButton.MY_URI, factory, 1);
	oci.setResourceComment("A Panic Button Device");
	oci.setResourceLabel("Panic Button");
	oci.addSuperClass(Device.MY_URI);
	oci.addObjectProperty(PanicButton.PROP_ACTIVATED).setFunctional();
	oci.addObjectProperty(PanicButton.PROP_PRESSED_BY).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PanicButton.PROP_PRESSED_BY, AssistedPerson.MY_URI, 0,
			1));
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PanicButton.PROP_ACTIVATED, TypeMapper
				.getDatatypeURI(Boolean.class), 0, 1));

    }

}
