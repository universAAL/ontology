package org.universAAL.ontology.location.address;

import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.location.Location;

/**
 * Ontological representation of a Mail Box. It is used when the address
 * represents an entity that has no physical representation and/or only has a
 * mail box in a post office, not corresponding to its actual location. Methods
 * included in this class are the mandatory ones for representing an ontological
 * concept in Java classes for uAAL. Usually it includes getters and setters for
 * most of its properties.
 * 
 * @author alfiva
 * 
 */
public class MailBox extends Address {
    public static final String MY_URI;
    private static String PROP_POST_OFFICE_BOX;

    static {
	MY_URI = Location.uAAL_LOCATION_NAMESPACE + "MailBox";

	PROP_POST_OFFICE_BOX = Location.uAAL_LOCATION_NAMESPACE
		+ "postOfficeBox";

	register(MailBox.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_POST_OFFICE_BOX.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);

	return Address.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = Address.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 1];

	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i] = PROP_POST_OFFICE_BOX;
	return toReturn;
    }

    /**
     * Creates a MailBox object
     */
    public MailBox() {

    }

    /**
     * Creates a MailBox object
     * 
     * @param uri
     *            the object URI
     */
    public MailBox(String uri) {
	super(uri);
    }

    public MailBox(String uri, String postOffciceBox) {
	super(uri);
	props.put(PROP_POST_OFFICE_BOX, postOffciceBox);
    }

    /**
     * Returns a human readable description on the essence of this ontology
     * class.
     */
    public static String getRDFSComment() {
	return "A mail box in a post office";
    }

    /**
     * Returns a label with which this ontology class can be introduced to human
     * users.
     */
    public static String getRDFSLabel() {
	return "Mail Box";
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return props.contains(PROP_POST_OFFICE_BOX);
    }

    /**
     * Gets the post office box value of the Address
     * 
     * @return The post office box value
     */
    public String getPostOfficeBox() {
	return (String) props.get(PROP_POST_OFFICE_BOX);
    }

    /**
     * Sets the post office box value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setPostOfficeBox(String val) {
	props.put(PROP_POST_OFFICE_BOX, val);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.universAAL.ontology.location.address.Address#toReadableString()
     */
    public String toReadableString() {
	String parent = super.toReadableString();
	return parent + (parent.isEmpty() ? "\n" : "")
		+ this.getPostOfficeBox();
    }
}
