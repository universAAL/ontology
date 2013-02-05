package org.universAAL.ontology.device;

import org.universAAL.middleware.owl.ManagedIndividual;

public class ExitValue extends ManagedIndividual {
  public static final String MY_URI = DeviceOntology.NAMESPACE
    + "ExitValue";

  public static final int _EXIT = 0;
  public static final int _DOOR_LEFT_OPEN = 1;
  public static final int _NO_CONDITION = 2;

  private static final String[] names = {
    "Exit","DoorLeftOpen","NoCondition" };

  public static final ExitValue Exit = new ExitValue(_EXIT);
  public static final ExitValue DoorLeftOpen = new ExitValue(_DOOR_LEFT_OPEN);
  public static final ExitValue NoCondition = new ExitValue(_NO_CONDITION);

  private int order;

  private ExitValue(int order) {
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

  public static ExitValue getExitValueByOrder(int order) {
    switch (order) {
      case _EXIT:
        return Exit;
      case _DOOR_LEFT_OPEN:
        return DoorLeftOpen;
      case _NO_CONDITION:
        return NoCondition;
    default:
      return null;    }
  }

  public static final ExitValue valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(DeviceOntology.NAMESPACE))
	    name = name.substring(DeviceOntology.NAMESPACE.length());

	for (int i = _EXIT; i <= _NO_CONDITION; i++)
	    if (names[i].equals(name))
		return getExitValueByOrder(i);

	return null;
  }
}
