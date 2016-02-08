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
package org.universAAL.ontology.hvac;


public class Heating_Mode extends Mode {
    public static final String MY_URI = HvacOntology.NAMESPACE + "Heating_Mode";

    public static final int NONAUTOMATIC = 0;
    public static final int SLEEPMODE = 1;
    public static final int WINTERMODE = 2;

    private static final String[] names = { "NonAutomatic", "SleepMode",
	    "WinterMode" };

    public static final Heating_Mode NonAutomatic = new Heating_Mode(NONAUTOMATIC);
    public static final Heating_Mode SleepMode = new Heating_Mode(SLEEPMODE);
    public static final Heating_Mode winterMode = new Heating_Mode(WINTERMODE);

    private int order;

    private Heating_Mode(int order) {
	super(HvacOntology.NAMESPACE + names[order]);
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

    public static Heating_Mode getHeating_ModeByOrder(int order) {
	switch (order) {
	case NONAUTOMATIC:
	    return NonAutomatic;
	case SLEEPMODE:
	    return SleepMode;
	case WINTERMODE:
	    return winterMode;
	default:
	    return null;
	}
    }

    public static final Heating_Mode valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(HvacOntology.NAMESPACE))
	    name = name.substring(HvacOntology.NAMESPACE.length());

	for (int i = NONAUTOMATIC; i <= WINTERMODE; i++)
	    if (names[i].equals(name))
		return getHeating_ModeByOrder(i);

	return null;
    }
}