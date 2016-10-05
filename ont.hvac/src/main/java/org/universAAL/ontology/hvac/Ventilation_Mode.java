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
 * A type of HVAC mode only for {@link Ventilation} systems in which user can
 * find three modes: 
 * <dl>
 * <dt>Fan</dt>
 * <dd>its a mode in which the user sets the ventilation mode is On,
       also in many hvac system this mode is known as "Fan Mode".</dd>
 
 * <dt>Dry</dt>
 * <dd>enables dehumidifier technology.</dd>
 * </dl>
 * 
 * @author Ricardo.
 */
public class Ventilation_Mode extends Mode {
    public static final String MY_URI = HvacOntology.NAMESPACE + "Ventilation_Mode";

    public static final int FAN = 0;
    public static final int DRY = 1;

    private static final String[] names = { "Fan","Dry" };

    public static final Ventilation_Mode Fan = new Ventilation_Mode(FAN);
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
	case FAN:
	    return Fan;
	
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


	for (int i = FAN; i <= DRY; i++)
	    if (names[i].equals(name))
		return getVentilation_ModeByOrder(i);

	return null;
    }
}