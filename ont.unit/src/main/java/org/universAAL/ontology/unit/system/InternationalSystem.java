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
package org.universAAL.ontology.unit.system;

import org.universAAL.ontology.unit.MeasurableDimension;
import org.universAAL.ontology.unit.Prefix;
import org.universAAL.ontology.unit.Unit;
import org.universAAL.ontology.unit.UnitOntology;
import org.universAAL.ontology.unit.UnitSystem;

public class InternationalSystem {

    /*
     * STATIC resources
     */
    public static final UnitSystem IND_SI = new UnitSystem(UnitOntology.NAMESPACE+"internationalSystemOfUnits");
    // Units
    public static final Unit IND_UNIT_SI_METER = new Unit("meter", "Meter", "m",
    		MeasurableDimension.Length, IND_SI);
    public static final Unit IND_UNIT_SI_GRAM = new Unit("gram", "Gram", "g",
    		MeasurableDimension.Mass, IND_SI);
    public static final Unit IND_UNIT_SI_SECOND = new Unit("sec", "Second", "s",
    		MeasurableDimension.Time, IND_SI);
    public static final Unit IND_UNIT_SI_AMPERE = new Unit("amp", "Ampere", "A",
    		MeasurableDimension.Current, IND_SI);
    public static final Unit IND_UNIT_SI_KELVIN = new Unit("kelvin", "Kelvin", "K",
    		MeasurableDimension.Temperature, IND_SI);
    public static final Unit IND_UNIT_SI_CANDELA = new Unit("candela", "Candela", "cd",
    		MeasurableDimension.Luminance, IND_SI);
    public static final Unit IND_UNIT_SI_MOLE = new Unit("mole", "Mole", "mol",
    		MeasurableDimension.SubstanceAmmount, IND_SI);
    // Prefixes
    public static final Prefix IND_PREFIX_SI_YOTTA = newDecimalPrefix("Yotta", "Y", 24);
    public static final Prefix IND_PREFIX_SI_ZETTA = newDecimalPrefix("Zetta", "Z", 21);
    public static final Prefix IND_PREFIX_SI_EXA = newDecimalPrefix("Exa", "E", 18);
    public static final Prefix IND_PREFIX_SI_PETA = newDecimalPrefix("Peta", "P", 15);
    public static final Prefix IND_PREFIX_SI_TERA = newDecimalPrefix("Tera", "T", 12);
    public static final Prefix IND_PREFIX_SI_GIGA = newDecimalPrefix("Giga", "G", 9);
    public static final Prefix IND_PREFIX_SI_MEGA = newDecimalPrefix("Mega", "M", 6);
    public static final Prefix IND_PREFIX_SI_KILO = newDecimalPrefix("Kilo", "k", 3);
    public static final Prefix IND_PREFIX_SI_HECTO = newDecimalPrefix("Hecto", "h", 2);
    public static final Prefix IND_PREFIX_SI_DECA = newDecimalPrefix("Deca", "da", 1);
    public static final Prefix IND_PREFIX_SI_DECI = newDecimalPrefix("Deci", "d", -1);
    public static final Prefix IND_PREFIX_SI_CENTI = newDecimalPrefix("Centi", "c", -2);
    public static final Prefix IND_PREFIX_SI_MILI = newDecimalPrefix("Mili", "m", -3);
    public static final Prefix IND_PREFIX_SI_MICRO = newDecimalPrefix("Micro", "μ", -6);
    public static final Prefix IND_PREFIX_SI_NANO = newDecimalPrefix("Nano", "n", -9);
    public static final Prefix IND_PREFIX_SI_PICO = newDecimalPrefix("Pico", "p", -12);
    public static final Prefix IND_PREFIX_SI_FEMTO = newDecimalPrefix("Femto", "f", -15);
    public static final Prefix IND_PREFIX_SI_ATTO = newDecimalPrefix("Atto", "a", -18);
    public static final Prefix IND_PREFIX_SI_ZEPTO = newDecimalPrefix("Zepto", "z", -21);
    public static final Prefix IND_PREFIX_SI_YOCTO = newDecimalPrefix("Yocto", "y", -24);

    static {
	IND_SI.addUnits(IND_UNIT_SI_METER);
	IND_SI.addUnits(IND_UNIT_SI_GRAM);
	IND_SI.addUnits(IND_UNIT_SI_SECOND);
	IND_SI.addUnits(IND_UNIT_SI_AMPERE);
	IND_SI.addUnits(IND_UNIT_SI_KELVIN);
	IND_SI.addUnits(IND_UNIT_SI_CANDELA);
	IND_SI.addUnits(IND_UNIT_SI_MOLE);
    }

    private static Prefix newDecimalPrefix(String name, String symb, int power) {
	Prefix p = new Prefix(name.toLowerCase(), name, symb, 10, power);
	IND_SI.addPrefixes(p);
	return p;
    }
}
