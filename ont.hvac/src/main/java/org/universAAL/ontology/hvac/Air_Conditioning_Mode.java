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

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Description: Air_Conditioning_Mode is a type of HVAC mode
 *              only for Air Conditioning in which user can find three modes.
 * @author Ricardo
 */
public class Air_Conditioning_Mode extends Mode {
    public static final String MY_URI = HvacOntology.NAMESPACE + "Air_Conditioning_Mode";
    /** 
     * NonAutomatic: its a mode in which the user sets the temperature that wants and throws cold air.
     * SleepMode: its an automatic mode that turn off the hvac system after a few hours .
     * SummerMode: its a mode of Air Conditioning that throws cold air.
     */
    public static final int NONAUTOMATIC = 0;
    public static final int SLEEPMODE = 1;
    public static final int SUMMERMODE = 2;
   
    private static final String[] names = { "NonAutomatic", "SleepMode",
	    "SummerMode" };

    public static final Air_Conditioning_Mode NonAutomatic = new Air_Conditioning_Mode(NONAUTOMATIC);
    public static final Air_Conditioning_Mode SleepMode = new Air_Conditioning_Mode(SLEEPMODE);
    public static final Air_Conditioning_Mode SummerMode = new Air_Conditioning_Mode(SUMMERMODE);

    private int order;

    private Air_Conditioning_Mode(int order) {
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

    public static Air_Conditioning_Mode getAir_Conditioning_ModeByOrder(int order) {
	switch (order) {
	case NONAUTOMATIC:
	    return NonAutomatic;
	case SLEEPMODE:
	    return SleepMode;
	case SUMMERMODE:
	    return SummerMode;
	default:
	    return null;
	}
    }

    public static final Air_Conditioning_Mode valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(HvacOntology.NAMESPACE))
	    name = name.substring(HvacOntology.NAMESPACE.length());


	for (int i = NONAUTOMATIC; i <= SUMMERMODE; i++)
	    if (names[i].equals(name))
		return getAir_Conditioning_ModeByOrder(i);

	return null;
    }
}