package org.universAAL.ontology.language;

import org.universAAL.middleware.owl.ManagedIndividual;

public class EnglishLabelType extends ManagedIndividual {
  public static final String MY_URI = LanguageOntology.NAMESPACE
    + "EnglishLabelType";

  public static final int _ABKHAZ = 0;
  public static final int _AFAR = 1;
  public static final int _AFRIKAANS = 2;
  public static final int _AKAN = 3;
  public static final int _ALBANIAN = 4;
  public static final int _AMHARIC = 5;
  public static final int _ARABIC = 6;

  private static final String[] names = {
    "Abkhaz","Afar","Afrikaans","Akan","Albanian","Amharic","Arabic" };

  public static final EnglishLabelType Abkhaz = new EnglishLabelType(_ABKHAZ);
  public static final EnglishLabelType Afar = new EnglishLabelType(_AFAR);
  public static final EnglishLabelType Afrikaans = new EnglishLabelType(_AFRIKAANS);
  public static final EnglishLabelType Akan = new EnglishLabelType(_AKAN);
  public static final EnglishLabelType Albanian = new EnglishLabelType(_ALBANIAN);
  public static final EnglishLabelType Amharic = new EnglishLabelType(_AMHARIC);
  public static final EnglishLabelType Arabic = new EnglishLabelType(_ARABIC);

  private int order;

  private EnglishLabelType(int order) {
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

  public static EnglishLabelType getEnglishLabelTypeByOrder(int order) {
    switch (order) {
      case _ABKHAZ:
        return Abkhaz;
      case _AFAR:
        return Afar;
      case _AFRIKAANS:
        return Afrikaans;
      case _AKAN:
        return Akan;
      case _ALBANIAN:
        return Albanian;
      case _AMHARIC:
        return Amharic;
      case _ARABIC:
        return Arabic;
    default:
      return null;    }
  }

  public static final EnglishLabelType valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(LanguageOntology.NAMESPACE))
	    name = name.substring(LanguageOntology.NAMESPACE.length());

	for (int i = _ABKHAZ; i <= _ARABIC; i++)
	    if (names[i].equals(name))
		return getEnglishLabelTypeByOrder(i);

	return null;
  }
}
