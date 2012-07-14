package org.universAAL.ontology.profile;


public class HRSubProfile extends SubProfile {

    public static final String MY_URI = ProfileOntology.NAMESPACE
	    + "HRSubProfile";

    public static final String PROP_HR_CONTACT = ProfileOntology.NAMESPACE
	    + "hasHRContact";
    public static final String PROP_HR_DESCRIPTION = ProfileOntology.NAMESPACE
	    + "hasHRDescription";
    public static final String PROP_HR_EXPERIENCE = ProfileOntology.NAMESPACE
	    + "hasHRExperience";
    public static final String PROP_HR_INVOLVEMENT = ProfileOntology.NAMESPACE
	    + "hasHRInvolvement";
    public static final String PROP_HR_QUALIFICATION = ProfileOntology.NAMESPACE
	    + "hasHRQualificaton";
    public static final String PROP_HR_TYPE = ProfileOntology.NAMESPACE
	    + "hasHRType";
    public static final String PROP_HR_CERTIFICATES = ProfileOntology.NAMESPACE
	    + "hasHRCertificates";
    public static final String PROP_HR_PAYMENT_INFO = ProfileOntology.NAMESPACE
	    + "hasHRPaymentInfo";
    public static final String PROP_HR_PROVIDER_USER_ID = ProfileOntology.NAMESPACE
	    + "hasHRProviderUserID";
    public static final String PROP_HR_SLA = ProfileOntology.NAMESPACE
	    + "hasHRSLA";
    public static final String PROP_HR_PROPERTIES = ProfileOntology.NAMESPACE
	    + "hasHRProperties";
    public static final String PROP_HR_RELATED_USERS = ProfileOntology.NAMESPACE
	    + "hasHRRelatedUsers";
    
    protected HRSubProfile() {
	super();
    }

    public HRSubProfile(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public boolean isWellFormed() {
	return true;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

}
