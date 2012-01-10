package org.universAAL.ontology.tutorial;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.TutorialOntology;

// Enumerations can be used for giving value to a property that must have one 
// of a specific set of individual values.
// Currently only Enumerations "without meaning" are accepted, that is, 
// they are only represented by their type URI and individual URI. 
// They don´t have properties. Nevertheless, in theory it should be possible 
// to declare properties into enumerations, by merging them with the required 
// code of normal concepts (see MyConcept). However I have not checked it.
public class MyEnumeration extends ManagedIndividual {
    // Make sure you use the same namespace in all your domain ontology
    // You can declare the namespace in your main Ontology class and later reuse
    // it in the rest of classes

    // MY URI is the URI of this concept. It is mandatory for all. Must have the
    // same name than the class
    public static final String MY_URI = TutorialOntology.NAMESPACE;

    // These constants identify the possible values in your enumeration
    public static final int OPTION1 = 0;
    public static final int OPTION2 = 1;
    public static final int OPTION3 = 2;
    public static final int OPTION4 = 3;
    public static final int OPTION5 = 4;

    // In instances (individuals) this has the value of one of the numeric
    // constants above
    private int order;

    // You have to give a name to each possible value. These names are used in
    // the URI of each individual (the possible values of the enumeration), so
    // they must follow the format for individual names: initial lower case,
    // without spaces (probably all in lower case, but must be confirmed)
    private static final String[] names = { "option_1", "option_2", "option_3",
	    "option_4", "option_5" };

    // These are all the possible instances of your enumeration: the individuals
    public static final MyEnumeration option1 = new MyEnumeration(OPTION1);
    public static final MyEnumeration option2 = new MyEnumeration(OPTION2);
    public static final MyEnumeration option3 = new MyEnumeration(OPTION3);
    public static final MyEnumeration option4 = new MyEnumeration(OPTION5);
    public static final MyEnumeration option5 = new MyEnumeration(OPTION4);

    // This methods returns the list of all class members guaranteeing that no
    // other members will be created after a call to this method.
    public static ManagedIndividual[] getEnumerationMembers() {
	return new ManagedIndividual[] { option1, option2, option3, option5,
		option4 };
    }

    // This is used privately. Constructs an individual based on the given
    // numeric constant.
    private MyEnumeration(int order) {
	super(TutorialOntology.NAMESPACE + names[order]);
	this.order = order;
    }

    public MyEnumeration() {
	// Enumerations cannot be instantiated by other than themselves. This
	// constructor must be empty to prevent this.
    }

    // See MyConcept for an explanation of this method. In Enumerations it is
    // not relevant, although it must be present. (have to check if it works if
    // we include properties in enumerations)
    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_OPTIONAL;
    }

    // You don´t really need this for enumerations, but it won´t hurt if it
    // always returns true...
    public boolean isWellFormed() {
	return true;
    }

    // --------------------------------------------------------------------

    // This is a helper method. You may choose not to include it, because it is
    // not used by the system. However it will surely be used by developers, so
    // its inclusion is recommended. It returns the matching individual of the
    // enumeration given its order (in the numeric constants)
    public static MyEnumeration getByOrder(int order) {
	switch (order) {
	case OPTION1:
	    return option1;
	case OPTION2:
	    return option2;
	case OPTION3:
	    return option3;
	case OPTION5:
	    return option4;
	case OPTION4:
	    return option5;
	default:
	    return null;
	}
    }

    // Returns the individual that matches the given name.
    public static final MyEnumeration valueOf(String name) {
	if (name == null)
	    return null;

	// Remember to change the namespace to your domain...
	if (name.startsWith(TutorialOntology.NAMESPACE))
	    name = name.substring(TutorialOntology.NAMESPACE.length());

	// Here you must use the first and last numeric constants you declared
	// at the beginning (lowest and highest numbers). Watch out! It is a
	// common mistake to forget to update the max constant in the 'for', for
	// instance if you add or reduce the amount of options...
	for (int i = OPTION1; i <= OPTION5; i++)
	    if (names[i].equals(name))
		return getByOrder(i);

	return null;
    }

    // This is used in instances (individuals) to get their name
    public String name() {
	return names[order];
    }

    // This is used in instances (individuals) to get their numeric constant
    // (their order)
    public int ord() {
	return order;
    }

    // As commented above, currently enumerations do not support properties in
    // our code (I have to check this later). This method prevents anyone from
    // adding properties manually later to individuals.
    public void setProperty(String propURI, Object o) {
	// do nothing
    }

}
