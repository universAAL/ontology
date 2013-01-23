/*******************************************************************************
 * Copyright 2013 Ericsson Nikola Tesla d.d.
 *
 * Licensed under both Apache License, Version 2.0 and MIT License .
 *
 * See the NOTICE file distributed with this work for additional 
 * information regarding copyright ownership
 *	
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.ui.preferences;

import org.universAAL.middleware.owl.ManagedIndividual;

public class Status extends ManagedIndividual {
  public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
    + "Status";

  public static final int ON = 0;
  public static final int OFF = 1;

  private static final String[] names = {
    "on","off" };

  public static final Status on = new Status(ON);
  public static final Status off = new Status(OFF);

  private int order;

  private Status(int order) {
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

  public static Status getStatusByOrder(int order) {
    switch (order) {
      case ON:
        return on;
      case OFF:
        return off;
    default:
      return null;    }
  }

  public static final Status valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(UIPreferencesProfileOntology.NAMESPACE))
	    name = name.substring(UIPreferencesProfileOntology.NAMESPACE.length());

	for (int i = ON; i <= OFF; i++)
	    if (names[i].equals(name))
		return getStatusByOrder(i);

	return null;
  }
}
