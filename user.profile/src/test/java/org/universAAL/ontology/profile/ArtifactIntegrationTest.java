package org.universAAL.ontology.profile;

import org.springframework.util.Assert;
import org.universAAL.itests.IntegrationTest;

/**
 * Here developer's of this artifact should code their integration tests.
 * 
 * @author rotgier
 * 
 */
public class ArtifactIntegrationTest extends IntegrationTest {

    public static final String NAMESPACE = "http://ontology.universAAL.org/MyProfile.owl#";

    public void testComposite() {
	logAllBundles();
    }

    public void testCreateOnts() {
	AALSpace aalspace = new AALSpace(NAMESPACE + "myaalspace");
	AALService aalservice = new AALService(NAMESPACE + "myaalservice");
	User user = new User(NAMESPACE + "myuser");
	AssistedPerson ap = new AssistedPerson(NAMESPACE + "myap");
	Caregiver care = new Caregiver(NAMESPACE + "mycaregiver");

	AALSpaceProfile aalspaceProfile = new AALSpaceProfile(NAMESPACE
		+ "myaalspaceProfile");
	AALServiceProfile aalserviceProfile = new AALServiceProfile(NAMESPACE
		+ "myaalserviceProfile");
	UserProfile userProfile = new UserProfile(NAMESPACE + "myuserProfile");
	AssistedPersonProfile apProfile = new AssistedPersonProfile(NAMESPACE
		+ "myapProfile");
	CaregiverProfile careProfile = new CaregiverProfile(NAMESPACE
		+ "mycaregiverProfile");

	aalspace.setProperty(Profilable.PROP_HAS_PROFILE, aalspaceProfile);
	aalservice.setProperty(Profilable.PROP_HAS_PROFILE, aalserviceProfile);
	user.setProperty(Profilable.PROP_HAS_PROFILE, userProfile);
	ap.setProperty(Profilable.PROP_HAS_PROFILE, apProfile);
	care.setProperty(Profilable.PROP_HAS_PROFILE, careProfile);
    }

    // public void testDontCreateAbstractOnts(){
    // Profile profile=new Profile(NAMESPACE+"myabstractprofile");
    // Assert.notNull(null,"Created an abstract ont!!");
    // }

    public void testDontCreateWrongProperties() {
	AssistedPerson ap = new AssistedPerson(NAMESPACE + "myapforprop");
	UserProfile userProfile = new UserProfile(NAMESPACE
		+ "myuserProfileforprop");
	ap.setProperty(Profilable.PROP_HAS_PROFILE, userProfile);
	Assert.isNull(ap.getProperty(Profilable.PROP_HAS_PROFILE),
		"Created a wrong parent property!!");
    }

}
