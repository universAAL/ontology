/*******************************************************************************
 * Copyright 2013 Ericsson Nikola Tesla d.d.
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
package org.universAAL.ontology.ui.preferences;

import org.universAAL.middleware.owl.ManagedIndividual;

public class Intensity extends ManagedIndividual {
  public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
    + "Intensity";

  public static final int LOW = 0;
  public static final int MEDIUM = 1;
  public static final int HIGH = 2;

  private static final String[] names = {
    "low","medium","high" };

  public static final Intensity low = new Intensity(LOW);
  public static final Intensity medium = new Intensity(MEDIUM);
  public static final Intensity high = new Intensity(HIGH);

  private int order;

  private Intensity(int order) {
    super(UIPreferencesProfileOntology.NAMESPACE + names[order]);
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

  public static Intensity getIntensityByOrder(int order) {
    switch (order) {
      case LOW:
        return low;
      case MEDIUM:
        return medium;
      case HIGH:
        return high;
    default:
      return null;    }
  }

  public static final Intensity valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(UIPreferencesProfileOntology.NAMESPACE))
	    name = name.substring(UIPreferencesProfileOntology.NAMESPACE.length());

	for (int i = LOW; i <= HIGH; i++)
	    if (names[i].equals(name))
		return getIntensityByOrder(i);

	return null;
  }
}
