/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute for Computer Graphics Research
	
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

package org.universAAL.ontology.lighting;

/**
 * Ontological enumeration of possible electric light types. Methods included in
 * this class are the mandatory ones for representing an ontological enumeration
 * in Java classes for uAAL.
 * 
 * @author mtazari
 * 
 */
public class ElectricLight extends LightType {
    public static final String MY_URI = LightingOntology.NAMESPACE
	    + "ElectricLight";

    public static final int CARBON_ARC_LAMP = 0;
    public static final int DISCHARGE_LAMP = 1;
    public static final int FLUORESCENT_LAMP = 2;
    public static final int HALOGEN_LAMP = 3;
    public static final int LED_LAMP = 4;
    public static final int LIGHT_BULB = 5;

    private static final String[] names = { "carbon_arc_lamp",
	    "discharge_lamp", "fluorescent_lamp", "halogen_lamp", "led_lamp",
	    "light_bulb" };

    public static final ElectricLight carbonArcLamp = new ElectricLight(
	    CARBON_ARC_LAMP);
    public static final ElectricLight dischargeLamp = new ElectricLight(
	    DISCHARGE_LAMP);
    public static final ElectricLight fluorescentLamp = new ElectricLight(
	    FLUORESCENT_LAMP);
    public static final ElectricLight halogenLamp = new ElectricLight(
	    HALOGEN_LAMP);
    public static final ElectricLight ledLamp = new ElectricLight(LED_LAMP);
    public static final ElectricLight lightBulb = new ElectricLight(LIGHT_BULB);

    /** @see org.universAAL.middleware.owl.ManagedIndividual#getClassURI() */
    public String getClassURI() {
	return MY_URI;
    }

    public static ElectricLight getElectricLightByOrder(int order) {
	switch (order) {
	case CARBON_ARC_LAMP:
	    return carbonArcLamp;
	case DISCHARGE_LAMP:
	    return dischargeLamp;
	case FLUORESCENT_LAMP:
	    return fluorescentLamp;
	case HALOGEN_LAMP:
	    return halogenLamp;
	case LED_LAMP:
	    return ledLamp;
	case LIGHT_BULB:
	    return lightBulb;
	default:
	    return null;
	}
    }

    public static final ElectricLight valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(LightingOntology.NAMESPACE))
	    name = name.substring(LightingOntology.NAMESPACE.length());

	for (int i = CARBON_ARC_LAMP; i <= LIGHT_BULB; i++)
	    if (names[i].equals(name))
		return getElectricLightByOrder(i);

	return null;
    }

    private int order;

    private ElectricLight(int order) {
	super(LightingOntology.NAMESPACE + names[order]);
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
}
