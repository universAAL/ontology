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

import org.universAAL.middleware.owl.ManagedIndividual;

public class Ventilation_Mode extends Mode {
    public static final String MY_URI = HvacOntology.NAMESPACE + "Ventilation_Mode";

    public static final int NONAUTOMATIC = 0;
    public static final int SLEEPMODE = 1;
    public static final int DRY = 2;

    private static final String[] names = { "NonAutomatic", "SleepMode",
	    "Dry" };

    public static final Ventilation_Mode NonAutomatic = new Ventilation_Mode(NONAUTOMATIC);
    public static final Ventilation_Mode SleepMode = new Ventilation_Mode(SLEEPMODE);
    public static final Ventilation_Mode Dry = new Ventilation_Mode(DRY);

    private int order;

    private Ventilation_Mode(int order) {
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

    public static Ventilation_Mode getVentilation_ModeByOrder(int order) {
	switch (order) {
	case NONAUTOMATIC:
	    return NonAutomatic;
	case SLEEPMODE:
	    return SleepMode;
	case DRY:
	    return Dry;
	default:
	    return null;
	}
    }

    public static final Ventilation_Mode valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(HvacOntology.NAMESPACE))
	    name = name.substring(HvacOntology.NAMESPACE.length());
//NOSE SI ESTO ES NECESARIO !!!!!!!!!!!!!!!!!!!!!!!!!!!!!1111

	for (int i = NONAUTOMATIC; i <= DRY; i++)
	    if (names[i].equals(name))
		return getVentilation_ModeByOrder(i);

	return null;
    }
}