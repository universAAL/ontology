package org.universAAL.ontology.tutorial;

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.TutorialOntology;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.Sensor;

//If you are making a concept that does not inherit from any other you just 
//extend ManagedIndividual. Otherwise you extend the concept class you inherit from
public class MyConcept extends ManagedIndividual {
    // Make sure you use the same namespace in all your domain ontology
    // You can declare the namespace in your main Ontology class and later reuse
    // it in the rest of classes

    // MY URI is the URI of this concept. It is mandatory for all. Must have the
    // same name than the class
    public static final String MY_URI = TutorialOntology.NAMESPACE
	    + "MyConcept";
    // Now declare the URI of ALL properties that this concept defines. They
    // must start with lower case.
    public static final String PROP_X_CONCEPT_ONLY_ONE = TutorialOntology.NAMESPACE
	    + "hasSingleDeviceX";
    public static final String PROP_Y_CONCEPT_LIST = TutorialOntology.NAMESPACE
	    + "hasListOfSensorsY";
    public static final String PROP_Z_LITERAL_OPTIONAL = TutorialOntology.NAMESPACE
	    + "hasOptionalLiteralZ";

    public MyConcept() {
	super();
	// Basic constructor. In general it is like this, just a call to super.
    }

    public MyConcept(String uri) {
	super(uri);
	// This is the commonly used constructor. In general it is like this,
	// just a call to super.
    }

    // This method is used for serialization purposes, to restrict the amount of
    // information to serialize when forwarding it among nodes.
    // For each property you must return one of PROP_SERIALIZATION_FULL,
    // REDUCED, OPTIONAL or UNDEFINED.
    // Refer to their javadoc to see what they mean.
    public int getPropSerializationType(String propURI) {
	// In this case we serialize everything. It is up to you to define what
	// is important to be serialized and what is expendable in your concept.
	return PROP_SERIALIZATION_FULL;
    }

    // In this method you evaluate if an instance of your concept is properly
    // built, e.g. if all mandatory fields are present.
    public boolean isWellFormed() {
	// In this case we say it is well formed if the property X, that we
	// declared as mandatory, is present.
	// While you test your concept it is easier to return always true.
	return getX() != null;
    }

    // ------------------------------------------------------------------

    // From here onwards we declare the getter and setters and other helper
    // methods for our declared properties
    // These are NOT MANDATORY, but are helpful for those who will use the
    // ontology.
    public Device getX() {
	return (Device) props.get(PROP_X_CONCEPT_ONLY_ONE);
    }

    public void setX(Device dev) {
	props.put(PROP_X_CONCEPT_ONLY_ONE, dev);
    }

    // Getters and setters are the most common, but you can add as many other
    // helper methods as you want, such as remove. Take into account that all
    // properties can always be handled with the methods of ManagedIndividual
    // and Resource, which all concepts inherit. The helper methods just make
    // developers life easier.
    public boolean getZ() {
	return ((Boolean) props.get(PROP_Z_LITERAL_OPTIONAL)).booleanValue();
    }

    public void setZ(boolean lit) {
	props.put(PROP_Z_LITERAL_OPTIONAL, Boolean.valueOf(lit));
    }

    // In the case of properties with multiple values, take into account that
    // they are handled internally (in the "props" element of the object) as a
    // List if there is more than one value.
    // In the helper method itself you can return or accept whatever format you
    // want (List or array) although it is recommended (it seems) to return and
    // accept arrays.
    // Although using List would be easier...
    public Sensor[] getY() {
	Object propList = props.get(PROP_Y_CONCEPT_LIST);
	if (propList instanceof List) {
	    return (Sensor[]) ((List) propList).toArray(new Sensor[0]);
	} else {
	    List returnList = new ArrayList();
	    if (propList != null)
		returnList.add((Sensor) propList);
	    return (Sensor[]) returnList.toArray(new Sensor[0]);
	}
    }

    public void addY(Sensor sens) {
	Object propList = props.get(PROP_Y_CONCEPT_LIST);
	if (propList instanceof List) {
	    List list = (List) propList;
	    list.add(sens);
	    props.put(PROP_Y_CONCEPT_LIST, list);
	} else if (propList == null) {
	    props.put(PROP_Y_CONCEPT_LIST, sens);
	} else {
	    List list = new ArrayList();
	    list.add((Sensor) propList);
	    list.add(sens);
	    props.put(PROP_Y_CONCEPT_LIST, list);
	}
    }

    public void setY(Sensor[] sens) {
	List propList = new ArrayList(sens.length);
	for (int i = 0; i < sens.length; i++) {
	    propList.add(sens[i]);
	}
	props.put(PROP_Y_CONCEPT_LIST, sens);
    }
}
