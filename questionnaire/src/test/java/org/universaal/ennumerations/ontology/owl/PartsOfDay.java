package org.universaal.ennumerations.ontology.owl;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universaal.ontology.owl.QuestionnaireOntology;


public class PartsOfDay extends ManagedIndividual{

  public static final String MY_URI = QuestionnaireOntology.NAMESPACE
    + "PartsOfDay";
  public static final int IN_THE_MORNING = 0;
  public static final int IN_THE_AFTERNOON = 1;
  public static final int IN_THE_EVENING = 2;

  private static final String[] names = {
    "inTheMorning","inTheAfternoon","inTheEvening"};

  public static final PartsOfDay inTheMorning = new PartsOfDay(IN_THE_MORNING);
  public static final PartsOfDay inTheAfternoon = new PartsOfDay(IN_THE_AFTERNOON);
  public static final PartsOfDay inTheEvening = new PartsOfDay(IN_THE_EVENING);

  private int order;

  private PartsOfDay(int order) {
	  
    super(QuestionnaireOntology.NAMESPACE + names[order]);
    this.order = order;
  }

  public int getPropSerializationType(String propURI) {
    return PROP_SERIALIZATION_OPTIONAL;
  }

  public boolean isWellFormed() {
    return true;
  }

  public String name() {
    return names[order];
  }

  public int ord() {
    return order;
  }

  public String getClassURI() {
    return MY_URI;
  }

  public static PartsOfDay getPartsOfDayByOrder(int order) {
    switch (order) {
      case IN_THE_MORNING:
        return inTheMorning;
      case IN_THE_AFTERNOON:
        return inTheAfternoon;
      case IN_THE_EVENING:
        return inTheEvening;
    default:
      return null;    }
  }

  public static final PartsOfDay valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(QuestionnaireOntology.NAMESPACE))
	    name = name.substring(QuestionnaireOntology.NAMESPACE.length());

	for (int i = IN_THE_MORNING; i <= IN_THE_EVENING; i++)
	    if (names[i].equals(name))
		return getPartsOfDayByOrder(i);

	return null;
  }
	
	
	
	
	
	
	
	
	
	
}
