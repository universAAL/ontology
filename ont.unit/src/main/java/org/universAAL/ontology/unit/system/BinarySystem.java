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

public class BinarySystem extends UnitSystem {

    public static final String MY_URI = UnitOntology.NAMESPACE + "BinarySystem";

    public static final BinarySystem IND_BS = new BinarySystem("binarySytem");
    public static final Unit IND_UNIT_BS_BIT = new Unit("bit", "Bit", "b",
    		MeasurableDimension.ComputerStorage, IND_BS);
    public static final Unit IND_UNIT_BS_BYTE = new Unit("byte", "Byte", "B",
    		MeasurableDimension.ComputerStorage, IND_BS);
    public static final Prefix IND_PREFIX_BS_KIBI = newBinaryPrefix("Kibi", "ki", 10);
    public static final Prefix IND_PREFIX_BS_MEBI = newBinaryPrefix("Mebi", "Mi", 20);
    public static final Prefix IND_PREFIX_BS_GIBI = newBinaryPrefix("Gibi", "Gi", 30);
    public static final Prefix IND_PREFIX_BS_TEBI = newBinaryPrefix("Tebi", "Ti", 40);
    public static final Prefix IND_PREFIX_BS_PEBI = newBinaryPrefix("Pebi", "Pi", 50);
    public static final Prefix IND_PREFIX_BS_EXBI = newBinaryPrefix("Exbi", "Ei", 60);
    public static final Prefix IND_PREFIX_BS_ZEBI = newBinaryPrefix("Zebi", "Zi", 70);
    public static final Prefix IND_PREFIX_BS_YOBI = newBinaryPrefix("Yobi", "Yi", 80);

    static {
	IND_BS.addUnits(IND_UNIT_BS_BIT);
	IND_BS.addUnits(IND_UNIT_BS_BYTE);
    }

    protected BinarySystem(String uri) {
	super(uri, "Binary System");
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true;
    }

    private static Prefix newBinaryPrefix(String name, String symb, int power) {
	Prefix p = new Prefix(name.toLowerCase(), name, symb, 2, power);
	IND_BS.addPrefixes(p);
	return p;
    }
}
