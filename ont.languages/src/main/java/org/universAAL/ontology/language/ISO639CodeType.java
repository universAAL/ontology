package org.universAAL.ontology.language;

import org.universAAL.middleware.owl.ManagedIndividual;

public class ISO639CodeType extends ManagedIndividual {
  public static final String MY_URI = LanguageOntology.NAMESPACE
    + "ISO639CodeType";

  public static final int AB = 0;
  public static final int AA = 1;
  public static final int AF = 2;
  public static final int AK = 3;
  public static final int SQ = 4;
  public static final int AM = 5;
  public static final int AR = 6;

  private static final String[] names = {
    "ab","aa","af","ak","sq","am","ar" };

  public static final ISO639CodeType ab = new ISO639CodeType(AB);
  public static final ISO639CodeType aa = new ISO639CodeType(AA);
  public static final ISO639CodeType af = new ISO639CodeType(AF);
  public static final ISO639CodeType ak = new ISO639CodeType(AK);
  public static final ISO639CodeType sq = new ISO639CodeType(SQ);
  public static final ISO639CodeType am = new ISO639CodeType(AM);
  public static final ISO639CodeType ar = new ISO639CodeType(AR);

  private int order;

  private ISO639CodeType(int order) {
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

  public static ISO639CodeType getISO639CodeTypeByOrder(int order) {
    switch (order) {
      case AB:
        return ab;
      case AA:
        return aa;
      case AF:
        return af;
      case AK:
        return ak;
      case SQ:
        return sq;
      case AM:
        return am;
      case AR:
        return ar;
    default:
      return null;    }
  }

  public static final ISO639CodeType valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(LanguageOntology.NAMESPACE))
	    name = name.substring(LanguageOntology.NAMESPACE.length());

	for (int i = AB; i <= AR; i++)
	    if (names[i].equals(name))
		return getISO639CodeTypeByOrder(i);

	return null;
  }
}
