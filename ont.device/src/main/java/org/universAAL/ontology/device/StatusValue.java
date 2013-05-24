/*
	Copyright 2008-2014 ITACA-TSB, http://www.tsb.upv.es
	Instituto Tecnologico de Aplicaciones de Comunicacion 
	Avanzadas - Grupo Tecnologias para la Salud y el 
	Bienestar (TSB)
	
	See the NOTICE file distributed with this work for additional 
	information regarding copyright ownership
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */
package org.universAAL.ontology.device;

import org.universAAL.middleware.owl.ManagedIndividual;

public class StatusValue extends ManagedIndividual {
    public static final String MY_URI = DeviceOntology.NAMESPACE
	    + "StatusValue";

    public static final int ACTIVATED = 0;
    public static final int NOT_ACTIVATED = 1;
    public static final int NO_CONDITION = 2;

    private static final String[] names = { "Activated", "NotActivated",
	    "NoCondition" };

    public static final StatusValue Activated = new StatusValue(ACTIVATED);
    public static final StatusValue NotActivated = new StatusValue(
	    NOT_ACTIVATED);
    public static final StatusValue NoCondition = new StatusValue(NO_CONDITION);

    private int order;

    private StatusValue(int order) {
	super(DeviceOntology.NAMESPACE + names[order]);
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

    public static StatusValue getStatusValueByOrder(int order) {
	switch (order) {
	case ACTIVATED:
	    return Activated;
	case NOT_ACTIVATED:
	    return NotActivated;
	case NO_CONDITION:
	    return NoCondition;
	default:
	    return null;
	}
    }

    public static final StatusValue valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(DeviceOntology.NAMESPACE))
	    name = name.substring(DeviceOntology.NAMESPACE.length());

	for (int i = ACTIVATED; i <= NO_CONDITION; i++)
	    if (names[i].equals(name))
		return getStatusValueByOrder(i);

	return null;
    }
}
