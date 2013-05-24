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

public class DosageValue extends ManagedIndividual {
    public static final String MY_URI = DeviceOntology.NAMESPACE
	    + "DosageValue";

    public static final int TAKEN = 0;
    public static final int MISSED = 1;
    public static final int NO_CONDITION = 2;

    private static final String[] names = { "Taken", "Missed", "NoCondition" };

    public static final DosageValue Taken = new DosageValue(TAKEN);
    public static final DosageValue Missed = new DosageValue(MISSED);
    public static final DosageValue NoCondition = new DosageValue(NO_CONDITION);

    private int order;

    private DosageValue(int order) {
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

    public static DosageValue getDosageValueByOrder(int order) {
	switch (order) {
	case TAKEN:
	    return Taken;
	case MISSED:
	    return Missed;
	case NO_CONDITION:
	    return NoCondition;
	default:
	    return null;
	}
    }

    public static final DosageValue valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(DeviceOntology.NAMESPACE))
	    name = name.substring(DeviceOntology.NAMESPACE.length());

	for (int i = TAKEN; i <= NO_CONDITION; i++)
	    if (names[i].equals(name))
		return getDosageValueByOrder(i);

	return null;
    }
}
