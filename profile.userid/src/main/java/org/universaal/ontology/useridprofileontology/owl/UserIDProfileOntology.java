package org.universaal.ontology.useridprofileontology.owl;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.ProfileOntology;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.profile.SubProfile;
import org.universaal.ontology.useridprofileontology.UserIDProfileOntologyFactory;

/**
 * @author eandgrg
 * 
 */
public final class UserIDProfileOntology extends Ontology {

	private static UserIDProfileOntologyFactory factory = new UserIDProfileOntologyFactory();
	public static final String NAMESPACE = "http://ontology.universaal.org/UserIDProfileOntology#";

	public UserIDProfileOntology() {
		super(NAMESPACE);
	}

	public void create() {
		Resource r = getInfo();
		r.setResourceComment("The ontology defining the most general concepts dealing with light sources and their control.");
		r.setResourceLabel("Lighting");
		addImport(DataRepOntology.NAMESPACE);
		addImport(ServiceBusOntology.NAMESPACE);
		addImport(LocationOntology.NAMESPACE);
		addImport(ProfileOntology.NAMESPACE);

		OntClassInfoSetup oci;
		oci = extendExistingOntClassInfo(SubProfile.MY_URI);

		// load UserIDProfile
		oci = createNewOntClassInfo(UserIDProfile.MY_URI, factory, 0);
		oci.setResourceComment("Login ID of a user.");
		oci.setResourceLabel("UserIDProfile");
		oci.addSuperClass(SubProfile.MY_URI);
		oci.addDatatypeProperty(UserIDProfile.PROP_USERNAME).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						UserIDProfile.PROP_USERNAME,
						TypeMapper.getDatatypeURI(String.class), 1, 1));

		oci.addDatatypeProperty(UserIDProfile.PROP_PASSWORD).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						UserIDProfile.PROP_PASSWORD,
						TypeMapper.getDatatypeURI(String.class), 1, 1));

	}
}
