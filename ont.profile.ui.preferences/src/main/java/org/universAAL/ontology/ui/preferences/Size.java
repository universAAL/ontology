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

public class Size extends ManagedIndividual {
  public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
    + "Size";

  public static final int SMALL = 0;
  public static final int MEDIUM = 1;
  public static final int LARGE = 2;

  private static final String[] names = {
    "small","medium","large" };

  public static final Size small = new Size(SMALL);
  public static final Size medium = new Size(MEDIUM);
  public static final Size large = new Size(LARGE);

  private int order;

  private Size(int order) {
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

  public static Size getSizeByOrder(int order) {
    switch (order) {
      case SMALL:
        return small;
      case MEDIUM:
        return medium;
      case LARGE:
        return large;
    default:
      return null;    }
  }

  public static final Size valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(UIPreferencesProfileOntology.NAMESPACE))
	    name = name.substring(UIPreferencesProfileOntology.NAMESPACE.length());

	for (int i = SMALL; i <= LARGE; i++)
	    if (names[i].equals(name))
		return getSizeByOrder(i);

	return null;
  }
}
