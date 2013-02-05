package org.universAAL.ontology.device;

import org.universAAL.middleware.owl.ManagedIndividual;

public class MotionValue extends ManagedIndividual {
  public static final String MY_URI = DeviceOntology.NAMESPACE
    + "MotionValue";

  public static final int _DETECTED = 0;
  public static final int _DELAYED = 1;
  public static final int _TAMPERED = 2;

  private static final String[] names = {
    "Detected","Delayed","Tampered" };

  public static final MotionValue Detected = new MotionValue(_DETECTED);
  public static final MotionValue Delayed = new MotionValue(_DELAYED);
  public static final MotionValue Tampered = new MotionValue(_TAMPERED);

  private int order;

  private MotionValue(int order) {
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

  public static MotionValue getMotionValueByOrder(int order) {
    switch (order) {
      case _DETECTED:
        return Detected;
      case _DELAYED:
        return Delayed;
      case _TAMPERED:
        return Tampered;
    default:
      return null;    }
  }

  public static final MotionValue valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(DeviceOntology.NAMESPACE))
	    name = name.substring(DeviceOntology.NAMESPACE.length());

	for (int i = _DETECTED; i <= _TAMPERED; i++)
	    if (names[i].equals(name))
		return getMotionValueByOrder(i);

	return null;
  }
}
