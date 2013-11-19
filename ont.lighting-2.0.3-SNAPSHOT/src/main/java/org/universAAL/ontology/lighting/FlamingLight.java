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
 * Ontological enumeration of possible flaming light types. Methods included in
 * this class are the mandatory ones for representing an ontological enumeration
 * in Java classes for uAAL.
 * 
 * @author mtazari
 * 
 */
public class FlamingLight extends LightType {
    public static final String MY_URI = LightingOntology.NAMESPACE
	    + "FlamingLight";

    public static final int CANDLE_LIGHT = 0;
    public static final int GAS_LAMP = 1;
    public static final int OIL_LAMP = 2;

    private static final String[] names = { "candle_light", "gas_lamp",
	    "oil_lamp" };

    public static final FlamingLight candleLight = new FlamingLight(
	    CANDLE_LIGHT);
    public static final FlamingLight gasLamp = new FlamingLight(GAS_LAMP);
    public static final FlamingLight oilLamp = new FlamingLight(OIL_LAMP);

    /** @see org.universAAL.middleware.owl.ManagedIndividual#getClassURI() */
    public String getClassURI() {
	return MY_URI;
    }

    public static FlamingLight getFlamingLightByOrder(int order) {
	switch (order) {
	case CANDLE_LIGHT:
	    return candleLight;
	case GAS_LAMP:
	    return gasLamp;
	case OIL_LAMP:
	    return oilLamp;
	default:
	    return null;
	}
    }

    public static final FlamingLight valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(LightingOntology.NAMESPACE))
	    name = name.substring(LightingOntology.NAMESPACE.length());

	for (int i = CANDLE_LIGHT; i <= OIL_LAMP; i++)
	    if (names[i].equals(name))
		return getFlamingLightByOrder(i);

	return null;
    }

    private int order;

    private FlamingLight(int order) {
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
