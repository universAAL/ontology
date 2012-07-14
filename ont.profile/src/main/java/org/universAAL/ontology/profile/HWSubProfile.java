package org.universAAL.ontology.profile;


public class HWSubProfile extends SubProfile {

    public static final String MY_URI = ProfileOntology.NAMESPACE
	    + "HWSubProfile";

    public static final String PROP_HW_CATEGORY = ProfileOntology.NAMESPACE
	    + "hasHWCategory";
    public static final String PROP_HW_DESCRIPTION = ProfileOntology.NAMESPACE
	    + "hasHWDescription";
    public static final String PROP_HW_PICTURE_URL = ProfileOntology.NAMESPACE
	    + "hasHWPicture";
    public static final String PROP_HW_PROPERTIES = ProfileOntology.NAMESPACE
	    + "hasHWProperties";
    public static final String PROP_HW_IDENTIFIER = ProfileOntology.NAMESPACE
	    + "hasHWIdentifier";
    public static final String PROP_HW_MANUFACTURER = ProfileOntology.NAMESPACE
	    + "hasHWManufacturer";
    public static final String PROP_HW_NAME = ProfileOntology.NAMESPACE
	    + "isHWName";
    public static final String PROP_HW_RELATED_DEVICES = ProfileOntology.NAMESPACE
	    + "hasRelatedDevices";

    protected HWSubProfile() {
	super();
    }

    public HWSubProfile(String uri) {
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
