package org.universAAL.ontology.phThing;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.rdf.LangString;

/**
 * Represents the class of physical things that are supposed to have a location.
 *
 * @author mtazari
 *
 */
public class DeviceState extends ManagedIndividual {
	public static final String MY_URI = PhThingOntology.NAMESPACE + "DeviceState";
	public static final String PROP_CODE = PhThingOntology.NAMESPACE + "stateCode";
	public static final String PROP_LABEL = ManagedIndividual.PROP_RDFS_LABEL;
	public static final String PROP_DESCRIPTION = ManagedIndividual.PROP_RDFS_COMMENT;

	public DeviceState() {
		super();
	}

	public DeviceState(String uri) {
		super(uri);
	}
	
	public DeviceState(String code, String label, String description) {
		super();
		int i = 0;
		if (code == null)
			i++;
		else
			props.put(PROP_CODE, code);
		if (label == null)
			i++;
		else
			props.put(PROP_LABEL, label);
		if (description == null)
			i++;
		else
			props.put(PROP_DESCRIPTION, description);
		if (i == 3)
			throw new NullPointerException();
	}

	public String getClassURI() {
		return MY_URI;
	}
	
	public String getCompactRepresentationAsString() {
		return getLabel() + "(" + getCode() + ")";
	}

	public String getCode() {
		Object o = props.get(PROP_CODE);
		if (o instanceof String)
			return (String) o;
		return "null";
	}

	public String getDescription() {
		Object o = getResourceComment();
		if (o instanceof String)
			return (String) o;
		return "Null";
	}

	public String getLabel() {
		Object o = getResourceLabel();
		if (o instanceof String)
			return (String) o;
		return "Null";
	}

	public int getPropSerializationType(String propURI) {
		return (PROP_CODE.equals(propURI) || PROP_DESCRIPTION.equals(propURI) || PROP_LABEL.equals(propURI))?
			PROP_SERIALIZATION_FULL : PROP_SERIALIZATION_OPTIONAL;
	}
	
	public boolean isWellFormed() {
		return !("null".equals(getCode())  &&  "null".equals(getDescription())  &&  "null".equals(getLabel())); 
	}
	
	public boolean setProperty(String propURI, Object o) {
		if (PROP_CODE.equals(propURI)) {
			if (o instanceof String)
				props.put(propURI, o);
			else
				return false;
		} else if (PROP_DESCRIPTION.equals(propURI)  ||  PROP_LABEL.equals(propURI)) {
			if (o instanceof String)
				o = new LangString((String) o, "");
			if (o instanceof LangString)
				props.put(propURI, o);
			else
				return false;
		} else 
			return super.setProperty(propURI, o);
		return true;
	}
}
