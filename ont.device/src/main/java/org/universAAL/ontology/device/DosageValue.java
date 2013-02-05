package org.universAAL.ontology.device;

import org.universAAL.middleware.owl.ManagedIndividual;

public class DosageValue extends ManagedIndividual {
  public static final String MY_URI = DeviceOntology.NAMESPACE
    + "DosageValue";

  public static final int _TAKEN = 0;
  public static final int _MISSED = 1;
  public static final int _NO_CONDITION = 2;

  private static final String[] names = {
    "Taken","Missed","NoCondition" };

  public static final DosageValue Taken = new DosageValue(_TAKEN);
  public static final DosageValue Missed = new DosageValue(_MISSED);
  public static final DosageValue NoCondition = new DosageValue(_NO_CONDITION);

  private int order;

  private DosageValue(int order) {
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

  public static DosageValue getDosageValueByOrder(int order) {
    switch (order) {
      case _TAKEN:
        return Taken;
      case _MISSED:
        return Missed;
      case _NO_CONDITION:
        return NoCondition;
    default:
      return null;    }
  }

  public static final DosageValue valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(DeviceOntology.NAMESPACE))
	    name = name.substring(DeviceOntology.NAMESPACE.length());

	for (int i = _TAKEN; i <= _NO_CONDITION; i++)
	    if (names[i].equals(name))
		return getDosageValueByOrder(i);

	return null;
  }
}
