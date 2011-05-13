/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut fuer Graphische Datenverarbeitung 
	
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

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Ontological enumeration of possible flaming light types. Methods included in
 * this class are the mandatory ones for representing an ontological enumeration
 * in Java classes for uAAL.
 * 
 * @author mtazari
 * 
 */
public class FlamingLight extends LightType {
    public static final String MY_URI;
    static {
	MY_URI = LightSource.LIGHTING_NAMESPACE + "FlamingLight";
	register(FlamingLight.class);
    }

    public static final int CANDLE_LIGHT = 0;
    public static final int GAS_LAMP = 1;
    public static final int OIL_LAMP = 2;

    private static final String[] names = { "candle_light", "gas_lamp",
	    "oil_lamp" };

    public static final FlamingLight candleLight = new FlamingLight(
	    CANDLE_LIGHT);
    public static final FlamingLight gasamp = new FlamingLight(GAS_LAMP);
    public static final FlamingLight oilLamp = new FlamingLight(OIL_LAMP);

    /**
     * Returns the list of all class members guaranteeing that no other members
     * will be created after a call to this method.
     */
    public static ManagedIndividual[] getEnumerationMembers() {
	return new ManagedIndividual[] { candleLight, gasamp, oilLamp };
    }

    /**
     * Returns the rating with the given URI.
     */
    public static ManagedIndividual getIndividualByURI(String instanceURI) {
	return (instanceURI != null && instanceURI
		.startsWith(LightSource.LIGHTING_NAMESPACE)) ? valueOf(instanceURI
		.substring(LightSource.LIGHTING_NAMESPACE.length()))
		: null;
    }

    public static FlamingLight getFlamingLightByOrder(int order) {
	switch (order) {
	case CANDLE_LIGHT:
	    return candleLight;
	case GAS_LAMP:
	    return gasamp;
	case OIL_LAMP:
	    return oilLamp;
	default:
	    return null;
	}
    }

    public static String getRDFSComment() {
	return "The type of flaming light sources.";
    }

    public static String getRDFSLabel() {
	return "Flaming Light";
    }

    public static final FlamingLight valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(LightSource.LIGHTING_NAMESPACE))
	    name = name.substring(LightSource.LIGHTING_NAMESPACE.length());

	for (int i = CANDLE_LIGHT; i <= OIL_LAMP; i++)
	    if (names[i].equals(name))
		return getFlamingLightByOrder(i);

	return null;
    }

    private int order;

    private FlamingLight(int order) {
	super(LightSource.LIGHTING_NAMESPACE + names[order]);
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

    public void setProperty(String propURI, Object o) {
	// do nothing
    }
}
