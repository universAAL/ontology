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
package org.universAAL.ontology.unitsystem;

import org.universAAL.ontology.UnitOntology;
import org.universAAL.ontology.owl.DividedUnit;
import org.universAAL.ontology.owl.MeasurableDimension;
import org.universAAL.ontology.owl.MultipliedUnit;
import org.universAAL.ontology.owl.Unit;

public class Util {
  
	public static final String MY_URI = UnitOntology.NAMESPACE
    + "UtilUnits";
  
  public static Unit IND_UNIT_UNITY;
  public static Unit IND_UNIT_HERTZ;
  public static Unit IND_UNIT_VOLT;
  

  {
	  
	  IND_UNIT_UNITY = new Unit("unity", "Unity", "1", MeasurableDimension.Adiemnsional);
	  IND_UNIT_HERTZ = new DividedUnit("hertz", IND_UNIT_UNITY, InternationalSystem.IND_UNIT_SI_SECOND);
	  IND_UNIT_VOLT = new DividedUnit("volt",
			  new MultipliedUnit("kg*m2", 
					  InternationalSystem.IND_UNIT_SI_GRAM, InternationalSystem.IND_PREFIX_SI_KILO,
					  new MultipliedUnit("m2", InternationalSystem.IND_UNIT_SI_METER, InternationalSystem.IND_UNIT_SI_METER))
	  , new MultipliedUnit("A*S3", InternationalSystem.IND_UNIT_SI_AMPERE, 
			  new MultipliedUnit("S3", InternationalSystem.IND_UNIT_SI_SECOND, 
					  new MultipliedUnit("s2", InternationalSystem.IND_UNIT_SI_SECOND, InternationalSystem.IND_UNIT_SI_SECOND))));
	  IND_UNIT_VOLT.setProperty(Unit.PROP_SYMBOL, "V");
  }
}
