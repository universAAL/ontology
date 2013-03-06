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

public class MotivationalStatusType extends ManagedIndividual {
  public static final String MY_URI = HealthOntology.NAMESPACE
    + "MotivationalStatusType";

  public static final int PRECONTEMPLATION = 0;
  public static final int CONTEMPLATION = 1;
  public static final int ACTION = 2;
  public static final int MAINTENANCE = 3;
  public static final int UNDEFINED = 4;

  private static final String[] names = {
    "precontemplation","contemplation","action","maintenance", "undefined" };

  public static final MotivationalStatusType precontemplation = new MotivationalStatusType(PRECONTEMPLATION);
  public static final MotivationalStatusType contemplation = new MotivationalStatusType(CONTEMPLATION);
  public static final MotivationalStatusType action = new MotivationalStatusType(ACTION);
  public static final MotivationalStatusType maintenance = new MotivationalStatusType(MAINTENANCE);
  public static final MotivationalStatusType undefined = new MotivationalStatusType(UNDEFINED);

  private int order;

  private MotivationalStatusType(int order) {
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

  public static MotivationalStatusType getMotivationalStatusTypeByOrder(int order) {
    switch (order) {
      case PRECONTEMPLATION:
        return precontemplation;
      case CONTEMPLATION:
        return contemplation;
      case ACTION:
        return action;
      case MAINTENANCE:
        return maintenance;
      case UNDEFINED:
          return undefined;
    default:
      return null;    }
  }

  public static final MotivationalStatusType valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(HealthOntology.NAMESPACE))
	    name = name.substring(HealthOntology.NAMESPACE.length());

	for (int i = PRECONTEMPLATION; i <= UNDEFINED; i++)
	    if (names[i].equals(name))
		return getMotivationalStatusTypeByOrder(i);

	return null;
  }
}
