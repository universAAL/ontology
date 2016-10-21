package org.universaal.ontology.test;

import org.universAAL.middleware.bus.junit.BusTestCase;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.util.ResourceComparator;
import org.universAAL.ontology.disease.owl.DiseaseOntology;
import org.universAAL.ontology.health.owl.HealthProfile;
import org.universAAL.ontology.health.owl.HealthProfileOntology;
import org.universAAL.ontology.healthmeasurement.owl.HealthMeasurementOntology;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.measurement.MeasurementOntology;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.ontology.profile.AssistedPerson;
import org.universAAL.ontology.profile.AssistedPersonProfile;
import org.universAAL.ontology.profile.ProfileOntology;
import org.universAAL.ontology.profile.UserProfile;
import org.universAAL.ontology.shape.ShapeOntology;
import org.universAAL.ontology.unit.UnitOntology;
import org.universAAL.ontology.vcard.VCardOntology;

public class BusTest extends BusTestCase {

    protected void setUp() throws Exception {
	super.setUp();

	OntologyManagement.getInstance().register(mc, new LocationOntology());
	OntologyManagement.getInstance().register(mc, new ShapeOntology());
	OntologyManagement.getInstance().register(mc, new PhThingOntology());
	OntologyManagement.getInstance().register(mc, new VCardOntology());
	OntologyManagement.getInstance().register(mc, new ProfileOntology());
	OntologyManagement.getInstance().register(mc, new UnitOntology());
	OntologyManagement.getInstance().register(mc, new MeasurementOntology());
	OntologyManagement.getInstance().register(mc,
		new HealthMeasurementOntology());
	OntologyManagement.getInstance().register(mc, new DiseaseOntology());
	OntologyManagement.getInstance().register(mc,
		new HealthProfileOntology());
    }

    public void test() {
	AssistedPerson ap = new AssistedPerson("testAP");
	HealthProfile hp = new HealthProfile(ap.getURI() + "HealthSubprofile");
//	if (ap instanceof AssistedPerson) {
//	    hp.setAssignedAssistedPerson((AssistedPerson) ap);
//	    // Bug #378
//	    // hp.setAssignedAssistedPerson(new AssistedPerson(ap.getURI()));
//	}
	UserProfile up = new AssistedPersonProfile("uriUserProfile");
	up.setSubProfile(new HealthProfile[] {hp});
	ap.setProfile(up);
	
	
	
	System.out.println(hp.toStringRecursive());

	String serialized = serialize(hp);
	System.out.println(serialized);
	Resource r = (Resource) deserialize(serialized);
	assertTrue(r != null);

	System.out.println(r.toStringRecursive());
	
	assertTrue((new ResourceComparator()).areEqual(hp, r));
    }
}
