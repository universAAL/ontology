/*******************************************************************************
 * Copyright 2015 UPM - Universidad Politécnica de Madrid
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.hvac;

/**
 * A type of mode only for {@link Heating} in which user can find three modes.
 * <dl>
 *  <dt>Automatic</dt><dd>its a mode in which the user sets the temperature that (s)he wants.</dd>
 *  <dt>Heat</dt><dd>its a mode that heats the air.</dd>
 * </dl>
 * @author Ricardo
 */
public class Heating_Mode extends Mode {
    public static final String MY_URI = HvacOntology.NAMESPACE + "Heating_Mode";

    public static final int AUTOMATIC = 0;
    public static final int Heat = 1;

    private static final String[] names = { "Automatic", 
	    "Heat" };

    /**
     * The user sets the temperature that (s)he wants.
     */
    public static final Heating_Mode Automatic = new Heating_Mode(AUTOMATIC);
    
    /**
     * Heats the air.
     */
    public static final Heating_Mode heat = new Heating_Mode(Heat);

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
	case AUTOMATIC:
	    return Automatic;
	case Heat:
	    return heat;
	default:
	    return null;
	}
    }

    public static final Heating_Mode valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(HvacOntology.NAMESPACE))
	    name = name.substring(HvacOntology.NAMESPACE.length());

	for (int i = AUTOMATIC; i <= Heat; i++)
	    if (names[i].equals(name))
		return getHeating_ModeByOrder(i);

	return null;
    }
}