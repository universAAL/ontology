/*******************************************************************************
 * Copyright 2012 UPM, http://www.upm.es - Universidad Politécnica de Madrid
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
package org.universaal.ontology.health.owl;

import org.universAAL.middleware.owl.ManagedIndividual;

public class StatusType extends ManagedIndividual {
  public static final String MY_URI = HealthOntology.NAMESPACE
    + "StatusType";

  public static final int PLANNED = 0;
  public static final int ACTIVED = 1;
  public static final int FINISHED = 2;
  public static final int CANCELLED = 3;
  public static final int PROLONGED = 4;
  
  private static final String[] names = {
    "planned","actived","finished","cancelled", "prolonged" };

  public static final StatusType planned = new StatusType(PLANNED);
  public static final StatusType actived = new StatusType(ACTIVED);
  public static final StatusType finished = new StatusType(FINISHED);
  public static final StatusType cancelled = new StatusType(CANCELLED);
  public static final StatusType prolonged = new StatusType(PROLONGED);

  private int order;

  private StatusType(int order) {
    super(HealthOntology.NAMESPACE + names[order]);
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

  public static StatusType getStatusTypeByOrder(int order) {
    switch (order) {
      case PLANNED:
        return planned;
      case ACTIVED:
        return actived;
      case FINISHED:
        return finished;
      case CANCELLED:
        return cancelled;
      case PROLONGED:
          return prolonged;
    default:
      return null;    }
  }

  public static final StatusType valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(HealthOntology.NAMESPACE))
	    name = name.substring(HealthOntology.NAMESPACE.length());

	for (int i = PLANNED; i <= PROLONGED; i++)
	    if (names[i].equals(name))
		return getStatusTypeByOrder(i);

	return null;
  }
}
