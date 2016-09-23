package org.universAAL.ontology.cryptographic;

import org.universAAL.middleware.owl.ManagedIndividual;

public class ChainMode extends ManagedIndividual {
  public static final String MY_URI = CryptographicOntology.NAMESPACE
    + "ChainMode";

  public static final int ENC = 0;
  public static final int DEC = 1;

  private static final String[] names = {
    "Enc","Dec" };

  public static final ChainMode Enc = new ChainMode(ENC);
  public static final ChainMode Dec = new ChainMode(DEC);

  private int order;

  private ChainMode(int order) {
    super(CryptographicOntology.NAMESPACE + names[order]);
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

  public static ChainMode getChainModeByOrder(int order) {
    switch (order) {
      case ENC:
        return Enc;
      case DEC:
        return Dec;
    default:
      return null;    }
  }

  public static final ChainMode valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(CryptographicOntology.NAMESPACE))
	    name = name.substring(CryptographicOntology.NAMESPACE.length());

	for (int i = ENC; i <= DEC; i++)
	    if (names[i].equals(name))
		return getChainModeByOrder(i);

	return null;
  }
}
