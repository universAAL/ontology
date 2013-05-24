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

public class TemperatureLevelValue extends ManagedIndividual {
    public static final String MY_URI = DeviceOntology.NAMESPACE
	    + "TemperatureLevelValue";

    public static final int HIGH_TEMPERATURE = 0;
    public static final int LOW_TEMPERATURE = 1;
    public static final int CHANGE_TOO_FAST = 2;

    private static final String[] names = { "HighTemperature",
	    "LowTemperature", "ChangeTooFast" };

    public static final TemperatureLevelValue HighTemperature = new TemperatureLevelValue(
	    HIGH_TEMPERATURE);
    public static final TemperatureLevelValue LowTemperature = new TemperatureLevelValue(
	    LOW_TEMPERATURE);
    public static final TemperatureLevelValue ChangeTooFast = new TemperatureLevelValue(
	    CHANGE_TOO_FAST);

    private int order;

    private TemperatureLevelValue(int order) {
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

    public static TemperatureLevelValue getTemperatureLevelValueByOrder(
	    int order) {
	switch (order) {
	case HIGH_TEMPERATURE:
	    return HighTemperature;
	case LOW_TEMPERATURE:
	    return LowTemperature;
	case CHANGE_TOO_FAST:
	    return ChangeTooFast;
	default:
	    return null;
	}
    }

    public static final TemperatureLevelValue valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(DeviceOntology.NAMESPACE))
	    name = name.substring(DeviceOntology.NAMESPACE.length());

	for (int i = HIGH_TEMPERATURE; i <= CHANGE_TOO_FAST; i++)
	    if (names[i].equals(name))
		return getTemperatureLevelValueByOrder(i);

	return null;
    }
}
