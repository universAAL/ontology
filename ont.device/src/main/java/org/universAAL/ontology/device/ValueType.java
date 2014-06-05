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

public class ValueType extends ManagedIndividual {
    public static final String MY_URI = DeviceOntology.NAMESPACE + "ValueType";

    public static final int EVENT = 0;
    public static final int STATE = 1;

    private static final String[] names = { "event", "state" };

    public static final ValueType event = new ValueType(EVENT);
    public static final ValueType state = new ValueType(STATE);

    private int order;

    private ValueType(int order) {
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

    public static ValueType getValueTypeByOrder(int order) {
	switch (order) {
	case EVENT:
	    return event;
	case STATE:
	    return state;
	default:
	    return null;
	}
    }

    public static final ValueType valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(DeviceOntology.NAMESPACE))
	    name = name.substring(DeviceOntology.NAMESPACE.length());

	for (int i = EVENT; i <= STATE; i++)
	    if (names[i].equals(name))
		return getValueTypeByOrder(i);

	return null;
    }
}
