package org.universAAL.ontology.device;

import org.universAAL.middleware.owl.ManagedIndividual;

public class TemperatureLevelValue extends ManagedIndividual {
  public static final String MY_URI = DeviceOntology.NAMESPACE
    + "TemperatureLevelValue";

  public static final int _HIGH_TEMPERATURE = 0;
  public static final int _LOW_TEMPERATURE = 1;
  public static final int _CHANGE_TOO_FAST = 2;

  private static final String[] names = {
    "HighTemperature","LowTemperature","ChangeTooFast" };

  public static final TemperatureLevelValue HighTemperature = new TemperatureLevelValue(_HIGH_TEMPERATURE);
  public static final TemperatureLevelValue LowTemperature = new TemperatureLevelValue(_LOW_TEMPERATURE);
  public static final TemperatureLevelValue ChangeTooFast = new TemperatureLevelValue(_CHANGE_TOO_FAST);

  private int order;

  private TemperatureLevelValue(int order) {
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

  public static TemperatureLevelValue getTemperatureLevelValueByOrder(int order) {
    switch (order) {
      case _HIGH_TEMPERATURE:
        return HighTemperature;
      case _LOW_TEMPERATURE:
        return LowTemperature;
      case _CHANGE_TOO_FAST:
        return ChangeTooFast;
    default:
      return null;    }
  }

  public static final TemperatureLevelValue valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(DeviceOntology.NAMESPACE))
	    name = name.substring(DeviceOntology.NAMESPACE.length());

	for (int i = _HIGH_TEMPERATURE; i <= _CHANGE_TOO_FAST; i++)
	    if (names[i].equals(name))
		return getTemperatureLevelValueByOrder(i);

	return null;
  }
}
