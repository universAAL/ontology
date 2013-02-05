package org.universAAL.ontology.device;

import org.universAAL.middleware.owl.ManagedIndividual;

public class StatusValue extends ManagedIndividual {
  public static final String MY_URI = DeviceOntology.NAMESPACE
    + "StatusValue";

  public static final int _ACTIVATED = 0;
  public static final int _NOT_ACTIVATED = 1;
  public static final int _NO_CONDITION = 2;

  private static final String[] names = {
    "Activated","NotActivated","NoCondition" };

  public static final StatusValue Activated = new StatusValue(_ACTIVATED);
  public static final StatusValue NotActivated = new StatusValue(_NOT_ACTIVATED);
  public static final StatusValue NoCondition = new StatusValue(_NO_CONDITION);

  private int order;

  private StatusValue(int order) {
    super(DeviceOntology.NAMESPACE + names[order]);
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

  public static StatusValue getStatusValueByOrder(int order) {
    switch (order) {
      case _ACTIVATED:
        return Activated;
      case _NOT_ACTIVATED:
        return NotActivated;
      case _NO_CONDITION:
        return NoCondition;
    default:
      return null;    }
  }

  public static final StatusValue valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(DeviceOntology.NAMESPACE))
	    name = name.substring(DeviceOntology.NAMESPACE.length());

	for (int i = _ACTIVATED; i <= _NO_CONDITION; i++)
	    if (names[i].equals(name))
		return getStatusValueByOrder(i);

	return null;
  }
}
