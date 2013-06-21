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
 * Ontological enumeration of possible natural light types. Methods included in
 * this class are the mandatory ones for representing an ontological enumeration
 * in Java classes for uAAL.
 * 
 * @author mtazari
 * 
 */
public class NaturalLight extends LightType {
    public static final String MY_URI = LightingOntology.NAMESPACE
	    + "NaturalLight";

    public static final int MOON_SHINE = 0;
    public static final int SUN_SHINE = 1;

    private static final String[] names = { "moon_shine", "sun_shine" };

    public static final NaturalLight moonShine = new NaturalLight(MOON_SHINE);
    public static final NaturalLight sunShine = new NaturalLight(SUN_SHINE);

    // public static void init() throws UnsupportedOperationException {
    // if (moonShine != null || sunShine != null)
    // throw new
    // UnsupportedOperationException("NaturalLight has already been initialised.");
    // moonShine = new NaturalLight(MOON_SHINE);
    // sunShine = new NaturalLight(SUN_SHINE);
    // }

    /** @see org.universAAL.middleware.owl.ManagedIndividual#getClassURI() */
    public String getClassURI() {
	return MY_URI;
    }

    public static NaturalLight getNaturalLightByOrder(int order) {
	switch (order) {
	case MOON_SHINE:
	    return moonShine;
	case SUN_SHINE:
	    return sunShine;
	default:
	    return null;
	}
    }

    public static final NaturalLight valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(LightingOntology.NAMESPACE))
	    name = name.substring(LightingOntology.NAMESPACE.length());

	for (int i = MOON_SHINE; i <= SUN_SHINE; i++)
	    if (names[i].equals(name))
		return getNaturalLightByOrder(i);

	return null;
    }

    private int order = 0;

    private NaturalLight(int order) {
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
