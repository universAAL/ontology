package org.universAAL.ontology.language;

import org.universAAL.middleware.owl.ManagedIndividual;

public class NativeLabelType extends ManagedIndividual {
  public static final String MY_URI = LanguageOntology.NAMESPACE
    + "NativeLabelType";

  public static final int ?????? = 0;
  public static final int _AFARAF = 1;
  public static final int _AFRIKAANS = 2;
  public static final int _AKAN = 3;
  public static final int GJUHA SHQIPE = 4;
  public static final int ???? = 5;
  public static final int ??????? = 6;

  private static final String[] names = {
    "??????","Afaraf","Afrikaans","Akan","gjuha shqipe","????","???????" };

  public static final NativeLabelType ?????? = new NativeLabelType(??????);
  public static final NativeLabelType Afaraf = new NativeLabelType(_AFARAF);
  public static final NativeLabelType Afrikaans = new NativeLabelType(_AFRIKAANS);
  public static final NativeLabelType Akan = new NativeLabelType(_AKAN);
  public static final NativeLabelType gjuha shqipe = new NativeLabelType(GJUHA SHQIPE);
  public static final NativeLabelType ???? = new NativeLabelType(????);
  public static final NativeLabelType ??????? = new NativeLabelType(???????);

  private int order;

  private NativeLabelType(int order) {
    super(LanguageOntology.NAMESPACE + names[order]);
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

  public static NativeLabelType getNativeLabelTypeByOrder(int order) {
    switch (order) {
      case ??????:
        return ??????;
      case _AFARAF:
        return Afaraf;
      case _AFRIKAANS:
        return Afrikaans;
      case _AKAN:
        return Akan;
      case GJUHA SHQIPE:
        return gjuha shqipe;
      case ????:
        return ????;
      case ???????:
        return ???????;
    default:
      return null;    }
  }

  public static final NativeLabelType valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(LanguageOntology.NAMESPACE))
	    name = name.substring(LanguageOntology.NAMESPACE.length());

	for (int i = ??????; i <= ???????; i++)
	    if (names[i].equals(name))
		return getNativeLabelTypeByOrder(i);

	return null;
  }
}
