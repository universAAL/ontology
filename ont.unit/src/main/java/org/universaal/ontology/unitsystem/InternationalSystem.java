/*******************************************************************************
 * Copyright 2012 UPM - Universidad Politécnica de Madrid
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universaal.ontology.unitsystem;

import org.universaal.ontology.UnitOntology;
import org.universaal.ontology.owl.MeasurableDimension;
import org.universaal.ontology.owl.Prefix;
import org.universaal.ontology.owl.Unit;
import org.universaal.ontology.owl.UnitSystem;

public class InternationalSystem extends UnitSystem {
  public static final String MY_URI = UnitOntology.NAMESPACE
    + "InternationalSystem";
  
  /*
   * STATIC resources 
   */
  public static InternationalSystem IND_SI;
  // Units
  public static Unit IND_UNIT_SI_METER;
  public static Unit IND_UNIT_SI_GRAM;
  public static Unit IND_UNIT_SI_SECOND;
  public static Unit IND_UNIT_SI_AMPERE;
  public static Unit IND_UNIT_SI_KELVIN;
  public static Unit IND_UNIT_SI_CANDELA;
  public static Unit IND_UNIT_SI_MOLE;
  // Prefixes
  public static Prefix IND_PREFIX_SI_YOTTA;
  public static Prefix IND_PREFIX_SI_ZETTA;
  public static Prefix IND_PREFIX_SI_EXA;
  public static Prefix IND_PREFIX_SI_PETA;
  public static Prefix IND_PREFIX_SI_TERA;
  public static Prefix IND_PREFIX_SI_GIGA;
  public static Prefix IND_PREFIX_SI_MEGA;
  public static Prefix IND_PREFIX_SI_KILO;
  public static Prefix IND_PREFIX_SI_HECTO;
  public static Prefix IND_PREFIX_SI_DECA;
  public static Prefix IND_PREFIX_SI_DECI;
  public static Prefix IND_PREFIX_SI_CENTI;
  public static Prefix IND_PREFIX_SI_MILI;
  public static Prefix IND_PREFIX_SI_MICRO;
  public static Prefix IND_PREFIX_SI_NANO;
  public static Prefix IND_PREFIX_SI_PICO;
  public static Prefix IND_PREFIX_SI_FEMTO;
  public static Prefix IND_PREFIX_SI_ATTO;
  public static Prefix IND_PREFIX_SI_ZEPTO;
  public static Prefix IND_PREFIX_SI_YOCTO;
  
  {
	  IND_SI = new InternationalSystem("internationalSystemOfUnits");
	 
	  IND_UNIT_SI_METER = new Unit("meter", "Meter", "m", MeasurableDimension.Length , IND_SI);
	  IND_UNIT_SI_GRAM = new Unit("gram", "Gram", "g", MeasurableDimension.Mass, IND_SI);
	  IND_UNIT_SI_SECOND = new Unit("sec", "Second", "s", MeasurableDimension.Time, IND_SI);
	  IND_UNIT_SI_AMPERE = new Unit("amp", "Ampere", "A", MeasurableDimension.Current, IND_SI);
	  IND_UNIT_SI_KELVIN = new Unit("kelvin", "Kelvin", "K", MeasurableDimension.Temperature, IND_SI);
	  IND_UNIT_SI_CANDELA = new Unit("candela", "Candela", "cd", MeasurableDimension.Luminance, IND_SI);
	  IND_UNIT_SI_MOLE = new Unit("mole", "Mole", "mol", MeasurableDimension.SubstanceAmmount, IND_SI);

	  IND_SI.addUnits(IND_UNIT_SI_METER);
	  IND_SI.addUnits(IND_UNIT_SI_GRAM);
	  IND_SI.addUnits(IND_UNIT_SI_SECOND);
	  IND_SI.addUnits(IND_UNIT_SI_AMPERE);
	  IND_SI.addUnits(IND_UNIT_SI_KELVIN);
	  IND_SI.addUnits(IND_UNIT_SI_CANDELA);
	  IND_SI.addUnits(IND_UNIT_SI_MOLE);
	  
	  IND_PREFIX_SI_YOTTA = newDecimalPrefix("Yotta", "Y", 24);
	  IND_PREFIX_SI_ZETTA = newDecimalPrefix("Zetta", "Z", 21);
	  IND_PREFIX_SI_EXA = newDecimalPrefix("Exa",	 "E", 18);
	  IND_PREFIX_SI_PETA = newDecimalPrefix("Peta",  "P", 15);
	  IND_PREFIX_SI_TERA = newDecimalPrefix("Tera",	 "T", 12);
	  IND_PREFIX_SI_GIGA = newDecimalPrefix("Giga",  "G", 9);
	  IND_PREFIX_SI_MEGA = newDecimalPrefix("Mega",  "M", 6);
	  IND_PREFIX_SI_KILO = newDecimalPrefix("Kilo",  "k", 3);
	  IND_PREFIX_SI_HECTO = newDecimalPrefix("Hecto", "h", 2);
	  IND_PREFIX_SI_DECA = newDecimalPrefix("Deca",  "da", 1);
	  IND_PREFIX_SI_DECI = newDecimalPrefix("Deci",  "d", -1);
	  IND_PREFIX_SI_CENTI = newDecimalPrefix("Centi", "c", -2);
	  IND_PREFIX_SI_MILI = newDecimalPrefix("Mili",  "m", -3);
	  IND_PREFIX_SI_MICRO = newDecimalPrefix("Micro", "μ", -6);
	  IND_PREFIX_SI_NANO = newDecimalPrefix("Nano",  "n", -9);
	  IND_PREFIX_SI_PICO = newDecimalPrefix("Pico",  "p", -12);
	  IND_PREFIX_SI_FEMTO = newDecimalPrefix("Femto", "f", -15);
	  IND_PREFIX_SI_ATTO = newDecimalPrefix("Atto",  "a", -18);
	  IND_PREFIX_SI_ZEPTO = newDecimalPrefix("Zepto", "z", -21);
	  IND_PREFIX_SI_YOCTO =  newDecimalPrefix("Yocto", "y", -24);
  }
  
  public InternationalSystem () {
    super();
  }
  
  private Prefix newDecimalPrefix(String name, String symb, int power) {
	Prefix p = new Prefix(name.toLowerCase(), name, symb, 10, power);
	IND_SI.addPrefixes(p);
	return p;
  }

protected InternationalSystem (String uri) {
    super(uri,"International Sistem of Units");
  }

  public String getClassURI() {
    return MY_URI;
  }
  public int getPropSerializationType(String arg0) {
	
	return PROP_SERIALIZATION_FULL;
  }

  public boolean isWellFormed() {
	return true 
      && hasProperty(PROP_NAME);
  }
}
