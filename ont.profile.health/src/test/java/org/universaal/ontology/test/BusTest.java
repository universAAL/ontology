package org.universaal.ontology.test;

import org.universAAL.middleware.bus.junit.OntTestCase;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.util.ResourceComparator;
import org.universAAL.ontology.health.owl.HealthProfile;
import org.universAAL.ontology.profile.AssistedPerson;
import org.universAAL.ontology.profile.AssistedPersonProfile;
import org.universAAL.ontology.profile.UserProfile;

public class BusTest extends OntTestCase {

	public void test() {
		AssistedPerson ap = new AssistedPerson("testAP");
		HealthProfile hp = new HealthProfile(ap.getURI() + "HealthSubprofile");
		// if (ap instanceof AssistedPerson) {
		// hp.setAssignedAssistedPerson((AssistedPerson) ap);
		// // Bug #378
		// // hp.setAssignedAssistedPerson(new AssistedPerson(ap.getURI()));
		// }
		UserProfile up = new AssistedPersonProfile("uriUserProfile");
		up.setSubProfile(new HealthProfile[] { hp });
		ap.setProfile(up);

		// System.out.println(hp.toStringRecursive());

		String serialized = serialize(hp);
		// System.out.println(serialized);
		Resource r = (Resource) deserialize(serialized);
		assertTrue(r != null);

		// System.out.println(r.toStringRecursive());

		assertTrue((new ResourceComparator()).areEqual(hp, r));
	}

	public void testWriter() {
		generateOntFiles4MyProy();
	}
}
